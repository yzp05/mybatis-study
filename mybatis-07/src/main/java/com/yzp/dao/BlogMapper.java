package com.yzp.dao;

import com.yzp.entity.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入
    int insertBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIf(Map<String,Object> map);

    List<Blog> queryBlogChoose(Map<String,Object> map);

    int updateBlogSet(Map map);

    List<Blog> queryBlogForeach(Map map);
}
