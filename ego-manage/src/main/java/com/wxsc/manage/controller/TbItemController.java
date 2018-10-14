package com.wxsc.manage.controller;

import com.wxsc.pojo.EasyUIDataGrid;
import com.wxsc.manage.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhongbo on 2018/10/11.
 */
@Controller
public class TbItemController {
    @Resource
    private ItemService itemService;
    @RequestMapping("item/list")
    @ResponseBody
    public EasyUIDataGrid showItemsController(int page, int rows){
        return itemService.showItems(page,rows);
    }

    /*@RequestMapping("item/save")
    public boolean addController(){
        return itemService.addItems();
    }*/
}
