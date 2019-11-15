package ysit.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

// 암호화 및 복호화
public class CryptoUtil {
	//byte형 배열 데이터를 16진수 형태의 문자열로 변환하는 메서드
	public static String byteToHexString(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for(byte b : data) {
			sb.append(Integer.toHexString((b & 0xFF) + 0x100).substring(1));
		}
		return sb.toString();
	}
	// 단방향 암호화 ==> 문자열을 암호화는 하는데 복호화를 못하는 암호화 방식
	//				  (password 등을 설정할 때 사용)
	
	//문자열을 MD5 방식으로 암호화하는 메서드(자리수 : 32byte)
	public static String md5(String msg) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		//32bit 예전방식으로 사용하지 말 것을 권고(복호화 방법이 노출됨)
		md.update(msg.getBytes());
		return CryptoUtil.byteToHexString(md.digest());
	}
	
	//문자열을 SHA-256 방식으로 암호화하는 메서드(자리수 : 64byte)
	public static String sha256(String msg) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());
		return CryptoUtil.byteToHexString(md.digest());
	}
		
	//문자열을 SHA-512 방식으로 암호화하는 메서드(자리수 : 128byte)
	public static String sha512(String msg) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(msg.getBytes());
		return CryptoUtil.byteToHexString(md.digest());
	}	
	//양방향 암호화 ==> 암호화된 데이터를 원래의 데이터로 복호화까지 가능한 방식 
	//AES256방식을 이용한 예제
	
	//AES256방식으로 암호화하는 메서드
	//매개변수 msg ==> 암호화할 문자열
	//매개변수 key ==> 암호화와 복호화에 사용될 key값
	public static String entryptAES256(String msg, String key) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidParameterSpecException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		//1. salt를 20byte 크기의 랜덤 값 생성
		SecureRandom random = new SecureRandom();
		byte[] bytes = new byte[20];  //20byte크기의 byte배열 생성
		random.nextBytes(bytes);
		
		byte[] saltBytes = bytes; //salt용 byte배열
		
		//2.key값과 salt를 이용해서 PBEKeySec객체를 생성한다.
		//70000번 암호화해서 256bit길이의 key를 만든다.
		PBEKeySpec spec = new PBEKeySpec(key.toCharArray(),saltBytes, 70000, 128);
		
		//3. 비밀키 생성
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2withHmacSHA512");
		SecretKey secretKey = factory.generateSecret(spec);
		SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(),"AES");
		
		//4. Cipher 생성 및 초기화
		//알고리즘/모드/패딩
		//CBC : Cipher Block Chaining 모드
		//패딩 : 암호화된 데이터의 길이가 딱 맞아 떨어지지 않으면 부족한 부분을 채워주는 방식
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, secret);
		
		//이 암호로 사용되는 파라미터객체를 구한다.
		AlgorithmParameters params = cipher.getParameters();
		
		//초기화 벡터(Initial Vector) 만들기
		byte[] ivBytes = params.getParameterSpec(IvParameterSpec.class).getIV();
		
		//6. 암호문 생성
		byte[] encryptTextBytes = cipher.doFinal(msg.getBytes("UTF-8"));
		
		//7. salt와 암호문을 Base64 인코딩 후 결합하여 최종 결과물 생성
		byte[] buffer = new byte[saltBytes.length + ivBytes.length + encryptTextBytes.length];
		System.arraycopy(saltBytes, 0, buffer, 0, saltBytes.length);
		System.arraycopy(ivBytes, 0, buffer, saltBytes.length, ivBytes.length);
		System.arraycopy(encryptTextBytes, 0, buffer, saltBytes.length + ivBytes.length, encryptTextBytes.length);
		
		return Base64.getEncoder().encodeToString(buffer);
		
	}
	
	//위에서 암호화한 내용을 복호화하는 메서드
	//매개변수 msg ==> 복원할 암호화된 문자열
	//매개변수 key ==> 암호화할 때 사용한 key값
	public static String decryptAES256(String msg, String key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		
		//암호화된 데이터를 Base64방식으로 디코딩한다.
		ByteBuffer buffer = ByteBuffer.wrap(Base64.getDecoder().decode(msg));
		
		byte[] saltBytes = new byte[20];
		//buffer에서 saltBytes.length 크기의 자료를 가져와서 
		//saltBytes배열의 0번째 위치에서 부터 저장한다.
		buffer.get(saltBytes,0,saltBytes.length);
		
		byte[] ivBytes =new byte[cipher.getBlockSize()];
		buffer.get(ivBytes,0,ivBytes.length);
		
		byte[] encryptTextBytes = new byte[buffer.capacity() - saltBytes.length - ivBytes.length];
		buffer.get(encryptTextBytes,0,encryptTextBytes.length);
		
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2withHmacSHA512");
		PBEKeySpec spec = new PBEKeySpec(key.toCharArray(), saltBytes, 70000, 128);
		
		SecretKey secretKey = factory.generateSecret(spec);
		SecretKeySpec secret = new SecretKeySpec(secretKey.getEncoded(),"AES");
		
		//복호화 모드로 초기화
		cipher.init(Cipher.DECRYPT_MODE,secret,new IvParameterSpec(ivBytes));
		
		// 복호화 작업
				byte[] decryptTextBytes = cipher.doFinal(encryptTextBytes);
				
				return new String(decryptTextBytes);
	}
	
	
	
	
	
	
	
	
}
