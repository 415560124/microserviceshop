package com.rhy.item.service;

import com.rhy.item.entity.Category;
import com.rhy.item.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Herion_Rhy
 * @Description:
 * @Date: Created in 2019/12/26 21:25
 * @Modified By:
 * @Version: 1.0.0
 */
@Service
public class CategoryServiceImpl  implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> queryCategoriesByPid(Long pid) {
        Map<String,Object> sreach = new HashMap<>();
        sreach.put("parent_id",pid);
        return this.categoryMapper.selectByMap(sreach);
    }
}
