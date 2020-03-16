package fun.guoke.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fun.guoke.service.item.entity.TbItem;
import fun.guoke.service.item.mapper.TbItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GuokeServiceProviderApplicationTests {

    @Resource
    private TbItemMapper tbItemMapper;

    @Test
    void contextLoads() {
        TbItem tbItem = tbItemMapper.selectById(536563L);

        System.out.println(tbItem);

    }

    @Test
    public void PageTest() {
        Page<TbItem> page = new Page<>(1, 22);
        Page<TbItem> tbItemPage = tbItemMapper.selectPage(page, new QueryWrapper<>());

        tbItemPage.getRecords().stream().forEach(a -> System.out.println(a));
        System.out.println("===============");
        System.out.println(tbItemPage.getTotal());
    }



}
