package com.wxsc.manage.service;


import com.wxsc.pojo.EasyUIDataGrid;

/**
 * Created by zhongbo on 2018/10/11.
 */
public interface ItemService {
    EasyUIDataGrid showItems(int page, int rows);
}
