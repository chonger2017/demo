package com.example.designmode.ProxyMode.jdk;

import com.example.designmode.ProxyMode.staticted.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JDKProxyTest {

    public static void main(String[] args) {
        try {
//            Object jdkMeiPo = new JDKMeiPo().getInstance(new Daniel());
            Person daniel = (Person) new JDKMeiPo().getInstance(new Daniel());
            System.out.println(daniel.getClass());
//            daniel.findLove();
            daniel.findjob();
//            System.out.println(daniel);



            //原理
            //1.拿到被代理对象的引用，并且获取到他的所有接口
            //2.通过JDK Proxy类生成一个新的类，同时新的类要实现被代理类所有实现的接口
            //3.动态的生成java代码,把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
            //4.编译新生成的java代码
            //5.将字节码文件加载到jvm中运行
            //以上的过程就叫做字节码重组


            //jdk 中有个规范， 只要是$开头的一般都是自动生成的
            //通过反编译工具可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
