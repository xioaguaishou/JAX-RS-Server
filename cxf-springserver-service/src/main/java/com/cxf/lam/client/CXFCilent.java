package com.cxf.lam.client;

import com.cxf.lam.pojo.User;
import com.cxf.lam.service.UserService;
import com.cxf.lam.vo.Result;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CXFCilent {

    public static void main(String[] args) throws Exception {
        // START SNIPPET: client
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});

        UserService client = (UserService)context.getBean("client");

        Result<User> response = client.get(123);
        System.out.println("Response: " + response);
        System.exit(0);
    }

}
