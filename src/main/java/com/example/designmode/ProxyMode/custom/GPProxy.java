package com.example.designmode.ProxyMode.custom;

public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class<?>[] intefaces, GPInvocationHandler h) {
        //1.动态生成源代码java文件
        generateSrc(intefaces);


        //2.Java文件输出到磁盘


        //3.把生成的java文件编译成.class文件



        //4.把编译生成的.class文件加载到JVM中


        //5.通过字节码重组以后的代理对象

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package com.example.designmode.ProxyMode.custom;" + ln);
        sb.append("import com.example.designmode.ProxyMode.staticted.Person;"+ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("GPInvocationHandler h;" + ln);
        sb.append("}"+ln);
        return null;
    }
}
