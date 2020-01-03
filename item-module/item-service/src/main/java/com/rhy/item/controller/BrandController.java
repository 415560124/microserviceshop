package com.rhy.item.controller;

import com.rhy.item.entity.Category;
import com.rhy.item.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * @Auther: Herion_Rhy
 * @Description:
 * @Date: Created in 2019/12/26 20:55
 * @Modified By:
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("category")
public class BrandController {
    @Autowired
    private ICategoryService categoryService;

    /**
     *
     * 根据父id查询子节点
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryByPid(@RequestParam("pid") Long pid){
        if(pid == null || pid.longValue() < 0){
            return ResponseEntity.badRequest().build();
        }
        List<Category> categories = this.categoryService.queryCategoriesByPid(pid);
        if(CollectionUtils.isEmpty(categories)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categories);
    }
}
