package cheng.service;

import cheng.Dao.companyMapper;
import cheng.beans.company;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
@Service
public class services implements servicess{
    @Resource
    companyMapper companyMapper;

        public company getcompany(int id){

            return companyMapper.test(id);
        }



}
