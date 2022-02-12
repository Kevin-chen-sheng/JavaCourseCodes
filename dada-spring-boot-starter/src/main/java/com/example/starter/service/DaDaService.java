package com.example.starter.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年02月11日 18:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DaDaService {
    private int id;
    private String name;

    private String beanName;



    public String say(){
        return String.format("[id=%s, age=%d, beanName=%s]", this.id, this.name, this.beanName);
//        return this.id + "!  " + this.name + "!  "+this.beanName;
    }
}
