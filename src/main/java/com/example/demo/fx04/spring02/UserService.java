package com.example.demo.fx04.spring02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月11日 14:57
 */
@Service
public class UserService {

    @Autowired
    private UserOrdinary userOrdinary;

    public void print(){
        System.out.println(userOrdinary.toString());
    }
}
