package com.uestc.orm.mybatisbuilder;

import com.uestc.orm.mybatisbuilder.mapper.EmpMapper;
import com.uestc.orm.mybatisbuilder.pojo.Emp;
import com.uestc.orm.mybatisbuilder.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class MybatisBuilderApplicationTests {

    @Test
    public void test() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("mike");
        List<Emp> emps = mapper.selectByExample(example);
        emps.forEach(System.out::println);
    }

}
