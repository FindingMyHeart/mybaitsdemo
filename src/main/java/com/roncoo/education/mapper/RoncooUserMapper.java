package com.roncoo.education.mapper;

import com.roncoo.education.bean.RoncooUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * Created by dajuejinxian on 2018/9/23.
 */
@Mapper
public interface RoncooUserMapper {

    @Insert(value = "insert into roncoo_user (name, create_time) values (#{name,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})")
    int insert(RoncooUser record);

    @Select(value = "select id, name, create_time from roncoo_user where id = #{id,jdbcType=INTEGER}")
    @Results(value = { @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    RoncooUser selectByPrimaryKey(Integer id);

}
