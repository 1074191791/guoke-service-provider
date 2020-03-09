package fun.guoke.service.item.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import fun.guoke.service.item.entity.TbItem;
import fun.guoke.service.item.service.ITbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Wrapper;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author zhous
 * @since 2020-03-09
 */
@RestController
@RequestMapping("/item/tb-item")
public class TbItemController {

    @Autowired
    private ITbItemService tbItemService;

    @GetMapping("/{id}")
    public TbItem getOne(@PathVariable("id")String id) {
        TbItem id1 = tbItemService.getOne(new QueryWrapper<TbItem>().eq("id", id));
        return id1;
    }

}
