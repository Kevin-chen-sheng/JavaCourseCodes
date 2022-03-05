package com.example.demo.week08.fenku01.xa02;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 19:04
 */
@Data
@TableName("health_task")
public class HealthTask {

    @TableId
    private Long taskId;

    private Long userId;

    private Long recordId;

//    private HealthRecord healthRecord;



    private String taskName;
}
