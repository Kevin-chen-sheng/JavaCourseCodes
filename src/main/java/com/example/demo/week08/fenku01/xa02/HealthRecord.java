package com.example.demo.week08.fenku01.xa02;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author da
 * @version 1.0
 * @description: TODO
 * @date 2022年03月05日 18:56
 */
@Data
@TableName("health_record")
public class HealthRecord {
    @TableId
    private Long recordId;

    private Long userId;
    private Long levelId;
    private String remark;
}
