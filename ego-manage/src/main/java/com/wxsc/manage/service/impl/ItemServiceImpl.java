package com.wxsc.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wxsc.dubbo.service.impl.TbItemServiceImpl;
import com.wxsc.pojo.EasyUIDataGrid;
import com.wxsc.dubbo.service.TbItemService;
import com.wxsc.manage.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhongbo on 2018/10/11.
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Reference
    private TbItemService tbItemService;
    @Override
    public EasyUIDataGrid showItems(int page, int rows) {
        return tbItemService.showPage(page, rows);
    }
}
