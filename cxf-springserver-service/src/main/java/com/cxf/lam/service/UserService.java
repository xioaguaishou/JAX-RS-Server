package com.cxf.lam.service;

import com.cxf.lam.pojo.User;
import com.cxf.lam.vo.Result;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UserService {

    @WebMethod
    Result<User> get(Integer id);

    @WebMethod
    Result<User> post(User user);

    @WebMethod
    Result<User> put(User user);

    @WebMethod
    Result<User> delete(Integer id);

    @WebMethod
    Result<User> queryList(User user);

}
