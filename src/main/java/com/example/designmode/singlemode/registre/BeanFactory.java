package com.example.designmode.singlemode.registre;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Spring中就是用这种注册时的单例
 */
public class BeanFactory {

    private BeanFactory(){}

    //private static Map<String,Object> ioc = new HashMap<String,Object>();

    //线程安全的
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className){

        if(ioc.containsKey(className)){
            return ioc.get(className);
        }else{
            Class clazz = null;
            Object obj = null;
            try {
                clazz = Class.forName(className);
                obj = clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }

        /*if(name == null){
            name = BeanFactory.class.getName();
        }

        if(ioc == null){
            try {
                ioc.put(name,new BeanFactory());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (BeanFactory) ioc.get(name);*/
    }
}
