package com.example.demo;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.mapper.GeneratorMapper;
import com.example.demo.model.Demo;
import com.example.demo.model.DemoResp;
import com.example.demo.model.Generator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringXmlTest {

    @Autowired
    private DemoMapper demoMapper;

    @Autowired
    private GeneratorMapper generatorMapper;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void baseMapper() {
        // 1、获取全部信息
        List<Generator> list = generatorMapper.selectAll();

        // 2、按主键查询
        Generator d = generatorMapper.selectByPrimaryKey(1);

        // 3、按条件查询条目数
        Generator demo = new Generator();
        demo.setDecimalValue(new BigDecimal(6));
        int count = generatorMapper.selectCount(demo);

        // 4、按条件查询记录(不支持分组、排序等)
        List<Generator> list2 = generatorMapper.select(demo);

        // 5、查询主键的记录是否存在
        boolean b = generatorMapper.existsWithPrimaryKey(3);

        // 6、按条件查询单条记录（当查出多条记录会报错，不建议使用）
        // Demo d2 = demoMapper.selectOne(demo);

        // 7、insert
        /*Demo demo1 = new Demo();
        demo1.setStudentAge("15");
        demo1.setStudentName("大和");
        demo1.setCreateTime(new Date());
        demo1.setUpdateTime(new Date());
        demoMapper.insertSelective(demo1);
        System.out.println(demo1);*/
    }

    @Test
    public void diyMapper() {

        Demo demo = demoMapper.annoGetById(2);
        System.out.println(demo);

        Demo demo2 = demoMapper.xmlGetById(2);
        System.out.println(demo2);

        int demo3 = demoMapper.xmlCountById(2);
        System.out.println(demo3);

        List<DemoResp> list = demoMapper.xmlJoinQuery();
        System.out.println(list);

        // 连接查询
    }

    @Test
    public void exampleMapper() {

    }

    @Test
    public void pageHelperTest() {
        // 1.PageHelper.startPage 静态方法调用
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(2, 2);
        //紧跟着的第一个select方法会被分页
        List<Demo> list = demoMapper.selectAll();
        PageInfo page = new PageInfo(list);
        PageHelper.clearPage();

        // 2.RowBounds方式的调用 侵入性最小
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Demo> list1 = sqlSession.selectList("com.example.demo.mapper.DemoMapper.selectAll", null, new RowBounds(1, 2));
    }

}
