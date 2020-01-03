package com.rhy.item.service;

import com.rhy.item.entity.Category;

import java.util.List;

/**
 * @Auther: Herion_Rhy
 * @Description:
 * @Date: Created in 2019/12/26 21:14
 * @Modified By:
 * @Version: 1.0.0
 */

public interface ICategoryService {
    List<Category> queryCategoriesByPid(Long pid);
}
