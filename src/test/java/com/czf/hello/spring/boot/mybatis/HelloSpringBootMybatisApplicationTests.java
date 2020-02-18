package com.czf.hello.spring.boot.mybatis;

import com.czf.hello.spring.boot.mybatis.entity.Article;
import com.czf.hello.spring.boot.mybatis.mapper.ArticleMapper;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=HelloSpringBootMybatisApplication.class)
@Transactional
@Rollback
public class HelloSpringBootMybatisApplicationTests {

  @Autowired
  private ArticleMapper articleMapper;

  @Test
  public void testSelect(){
    List<Article> articles=articleMapper.selectAll();
    for(Article article : articles){
      System.out.println(article.getAuthor());
    }

  }

}
