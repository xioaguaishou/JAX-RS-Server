package com.cxf.lam.service.impl;

import com.cxf.lam.pojo.User;
import com.cxf.lam.service.UserService;
import com.cxf.lam.vo.Result;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public Result<User> get(Integer id) {
        System.out.println("get..." + id);
        Result<User> result = new Result<>(HttpStatus.OK, this.getUser());
        return result;
    }

    @Override
    public Result<User> post(User user) {
        System.out.println("post: " + user);
        Result<User> result = new Result<>(HttpStatus.OK, this.getUser());
        return result;
    }

    @Override
    public Result<User> put(User user) {
        System.out.println("put: " + user);
        Result<User> result = new Result<>(HttpStatus.OK, this.getUser());
        return result;
    }

    @Override
    public Result<User> delete(Integer id) {
        System.out.println("delete..." + id);
        Result<User> result = new Result<>(HttpStatus.OK, this.getUser());
        return result;
    }

    @Override
    public Result<User> queryList(User user) {
        System.out.println("queryList...");
        List<User> items = new ArrayList<>();
        items.add(this.getUser());
        items.add(this.getUser());
        Result<User> result = new Result<>(HttpStatus.OK, items);
        return result;
    }


    // 模拟数据库返回数据
    private User getUser() {
        User user = new User();
        user.setId(999);
        user.setAge(12);
        user.setName("响应数据");
        return user;
    }

}
