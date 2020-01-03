package com.rhy.item.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: Herion_Rhy
 * @Description:
 * @Date: Created in 2019/12/25 23:16
 * @Modified By:
 * @Version: 1.0.0
 */
@TableName("tb_category")
@Data
public class Category {
    private static final long serialVersionUid = 1L;
    @TableId(value = "id" , type = IdType.AUTO)
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent; // 注意isParent生成的getter和setter方法需要手动加上Is
    private Integer sort;
}
