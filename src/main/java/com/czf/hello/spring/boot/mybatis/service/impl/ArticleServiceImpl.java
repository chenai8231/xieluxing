package com.czf.hello.spring.boot.mybatis.service.impl;

import com.czf.hello.spring.boot.mybatis.entity.Article;
import com.czf.hello.spring.boot.mybatis.mapper.ArticleMapper;
import com.czf.hello.spring.boot.mybatis.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Article服务层实现类
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findAllArticle() {

        return articleMapper.selectAll();
    }

    @Override
    public Article findArticleByPK(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean addArticle(Article article) {
        Boolean flag=true;
        Map map=new HashMap<>();
        try{
            articleMapper.insert(article);
        }catch(Exception e){
            e.printStackTrace();
            String error=e.getMessage();
            map.put("error",error);
        }
        if(map.size()>0){
            flag=false;
        }
        return flag;
    }

    @Override
    public Boolean updateArticle(Article article) {
        Boolean flag=true;
        Map map=new HashMap<>();
        try{
            articleMapper.updateByPrimaryKey(article);
        }catch(Exception e){
            e.printStackTrace();
            String error=e.getMessage();
            map.put("error",error);
        }
        if(map.size()>0){
            flag=false;
        }
        return flag;
    }

    @Override
    public Boolean deleteArticle(Integer id) {
        Boolean flag=true;
        Map map=new HashMap<>();
        try{
            articleMapper.deleteByPrimaryKey(id);
        }catch(Exception e){
            e.printStackTrace();
            String error=e.getMessage();
            map.put("error",error);
        }
        if(map.size()>0){
            flag=false;
        }
        return flag;
    }


}
