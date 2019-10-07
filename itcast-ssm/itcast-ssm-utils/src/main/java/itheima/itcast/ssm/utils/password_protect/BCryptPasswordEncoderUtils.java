package itheima.itcast.ssm.utils.password_protect;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }
//测试加密效果，每次加密结果都不一样
    public static void main(String[] args) {
        String password="123";
        String pwd = encodePassword(password);
//        每次加密都会生成一个动态的言，加密与解密你都会自动解析这个言
        //$2a$10$tJHudmJh6MRPdiL7mv0yfe0nZJbDHuhl7sSTnqNC4DauMik9ppi4K
        //$2a$10$Ce8LB3jdYDZ2f6HB281zA.4eC7v6ziJdK8MMWg0Yu8ETMg5ToMpIe
        System.out.print(pwd.length());
    }
}
