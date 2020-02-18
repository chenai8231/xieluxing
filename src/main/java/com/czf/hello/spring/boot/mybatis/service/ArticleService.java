package com.czf.hello.spring.boot.mybatis.service;

import com.czf.hello.spring.boot.mybatis.entity.Article;

import java.util.List;

/**
 * Ariticle服务层
 */
public interface ArticleService {
    /**
     * 查询所有信息
     * @param
     * @return List<Article>
     */
    List<Article> findAllArticle();
    /**
     * 根据id查询数据
     * @param
     * @return Article
     */
    Article findArticleByPK(Integer id);
    /**
     * 添加数据
     * @param
     * @return flag
     */
    Boolean addArticle(Article article);
    /**
     * 修改数据
     * @param
     * @return flag
     */
    Boolean updateArticle(Article article);
    /**
     * 删除数据
     * @param
     * @return flag
     */
    Boolean deleteArticle(Integer id);
}
