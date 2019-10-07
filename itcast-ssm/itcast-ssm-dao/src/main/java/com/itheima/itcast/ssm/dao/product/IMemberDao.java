package com.itheima.itcast.ssm.dao.product;

import com.itheima.itcast.ssm.domain.product.Member;
import org.apache.ibatis.annotations.Select;

public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
