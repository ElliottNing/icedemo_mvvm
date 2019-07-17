package com.example.demo.mapper;

import com.example.demo.model.Demo;
import com.example.demo.model.DemoResp;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DemoMapper extends Mapper<Demo> {

    @Select("select * from t_demo_student where id = #{id}")
    Demo annoGetById(Integer id);

    Demo xmlGetById(Integer id);

    int xmlCountById(Integer id);

    List<DemoResp> xmlJoinQuery();

}
