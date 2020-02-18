package com.czf.hello.spring.boot.mybatis.controller;

import com.czf.hello.spring.boot.mybatis.entity.Article;
import com.czf.hello.spring.boot.mybatis.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @ClassName: ArticleController
 * @Desciption: article表接口
 * @author chenzifeng
 * @date 2020年02月18号 上午 12:00:00
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * @Title: findAllArticle
     * @Desciption: 查询表所有数据
     * @param
     * @return List<Article>
     * @author chenzifeng
     * @date 2020年02月18号 上午 12:00:00
     */
    @RequestMapping(value="/findAllArticle",method = RequestMethod.GET)
    @ResponseBody
    public List<Article> findAllArticle(){
        List<Article> articleList=articleService.findAllArticle();
        return articleList;
    }
    /**
     * @Title: findArticleByPK
     * @Desciption: 根据主键查数据
     * @param
     * @return Article
     * @author chenzifeng
     * @date 2020年02月18号 上午 12:00:00
     */
    @RequestMapping(value="/findArticleByPK/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Article findArticleByPK(@PathVariable("id") Integer id){
        Article article=articleService.findArticleByPK(id);
        return article;
    }
    /**
     * @Title: addArticle
     * @Desciption: 添加数据
     * @param
     * @return flag
     * @author chenzifeng
     * @date 2020年02月18号 上午 12:00:00
     */
    @RequestMapping(value="/addArticle",method = RequestMethod.POST)
    @ResponseBody
    public Boolean addArticle(@RequestBody Article article){
        Boolean flag=articleService.addArticle(article);
        return flag;
    }
    /**
     * @Title: updateArticle
     * @Desciption:根据id修改数据
     * @param
     * @return flag
     * @author chenzifeng
     * @date 2020年02月18号 上午 12:00:00
     */
    @RequestMapping(value="/updateArticle",method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateArticle(@RequestBody Article article){
        Boolean flag=articleService.updateArticle(article);
        return flag;
    }
    /**
     * @Title: deleteArticle
     * @Desciption:根据id删除数据
     * @param
     * @return flag
     * @author chenzifeng
     * @date 2020年02月18号 上午 12:00:00
     */
    @RequestMapping(value="/deleteArticle/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Boolean deleteArticle(@PathVariable("id") Integer id){
        Boolean flag=articleService.deleteArticle(id);
        return flag;
    }
}
