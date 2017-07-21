package test;

import cheng.Dao.companyMapper;
import cheng.beans.company;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class test {

    //获取sqlSessionFactory
    public SqlSessionFactory getSqlSessionFacotry() throws  Exception{
        //1.根据配置文件获取sqlSession
        //创建sqlsessionFactroy

        String res="mybtis.xml";
        InputStream inputStream = Resources.getResourceAsStream(res);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test//2.单独测试接口CompanyAnnoution.class
    public void test2() throws  Exception{
        //1.获取Sqlsession
        SqlSessionFactory sqlSessionFactory=getSqlSessionFacotry();
        //2.开启opensession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.获取CompanyMapper.class这个接口
        //由于接口必须要有实现类，才能创建对象，我们没有实现类，框架自动帮我们创建一个实现类。
        companyMapper   mapper = sqlSession.getMapper(companyMapper.class);
        company companybyId = mapper.test(1);

        System.out.print(companybyId.toString());
    }

}
