package com.wxsc.dubbo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxsc.dubbo.service.TbItemService;
import com.wxsc.mapper.TbItemMapper;
import com.wxsc.pojo.EasyUIDataGrid;
import com.wxsc.pojo.TbItem;
import com.wxsc.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhongbo on 2018/10/11.
 */
@Service("TbItemService")
public class TbItemServiceImpl implements TbItemService {
    @Autowired
    TbItemMapper tbItemMapper;
    @Override
    public EasyUIDataGrid showPage(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<TbItem> tbItemList=tbItemMapper.selectByExample(new TbItemExample());
        PageInfo<TbItem> pageInfo=new PageInfo<>(tbItemList);
        EasyUIDataGrid easyUIDataGrid =new EasyUIDataGrid();
        easyUIDataGrid.setRows(pageInfo.getList());
        easyUIDataGrid.setTotal(pageInfo.getTotal());
        return easyUIDataGrid;
    }
}
