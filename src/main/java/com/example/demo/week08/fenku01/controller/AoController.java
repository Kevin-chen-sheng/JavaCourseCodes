package com.example.demo.week08.fenku01.controller;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 15:08
 */

import com.example.demo.week08.fenku01.entity.AoOrderEntity;
import com.example.demo.week08.fenku01.service.AoOrderEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AoController {

    @Autowired
    AoOrderEntityService aoOrderEntityService;

    @RequestMapping(value = "/ao", method = RequestMethod.GET)
    public List<AoOrderEntity> getItems(){
        return aoOrderEntityService.getAoOrderList();
    }

    @RequestMapping(value = "/ao",method = RequestMethod.POST)
    public Boolean saveItem(AoOrderEntity book){
        return aoOrderEntityService.save(book);
    }
}

