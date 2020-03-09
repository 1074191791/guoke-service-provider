package fun.guoke.service.item.service.impl;

import fun.guoke.service.item.entity.TbItem;
import fun.guoke.service.item.mapper.TbItemMapper;
import fun.guoke.service.item.service.ITbItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author zhous
 * @since 2020-03-09
 */
@Service
public class TbItemServiceImpl extends ServiceImpl<TbItemMapper, TbItem> implements ITbItemService {

}
