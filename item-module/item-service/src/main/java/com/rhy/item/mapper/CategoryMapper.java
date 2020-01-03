package com.rhy.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rhy.item.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Auther: Herion_Rhy
 * @Description:
 * @Date: Created in 2019/12/26 21:26
 * @Modified By:
 * @Version: 1.0.0
 */
@Mapper
@Component
public interface CategoryMapper extends BaseMapper<Category> {
}
