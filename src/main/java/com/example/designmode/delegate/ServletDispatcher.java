package com.example.designmode.delegate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ServletDispatcher {

    private List<Handler> handlerMappings = new ArrayList<Handler>();

    public void doServlet(HttpServletRequest request, HttpServletResponse response){
        dodispatcher(request,response);
    }

    private void dodispatcher(HttpServletRequest request, HttpServletResponse response){
        //1.获取用户请求的url
        //2.如果按照J2EE， 每个url 对应一个servlet
    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public void setController(Object controller) {
            this.controller = controller;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
