package com.yupi.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface DataSource <T> {


    /**
     * @param searchText
     * @param pageNum
     * @param pageSize
     * @return
     */
    //使用了适配器设计模式
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}
