package fun.guoke.service;

import fun.guoke.service.item.entity.TbItem;
import fun.guoke.service.item.mapper.TbItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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

}
