package com.wxsc.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhongbo on 2018/10/12.
 */
public class EasyUIDataGrid implements Serializable {
    //当前页显示条数
    private List<?> rows;
    //总条数
    private long total;

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
