package com.togo.dao;

import com.togo.entity.BlogArticle;

/**
 * @Author taiyn
 * @Description TODO
 * @Date 11:13 上午 2020/4/6
 **/
public interface BlogMapper {

    BlogArticle selectById(int id);
}
