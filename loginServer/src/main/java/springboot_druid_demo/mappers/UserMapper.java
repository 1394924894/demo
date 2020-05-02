package springboot_druid_demo.mappers;


import springboot_druid_demo.model.User;

public interface UserMapper {

    int deleteByPrimaryKey(Integer var1);

    int insertSelective(User var1);

    User selectByPrimaryKey(Integer var1);

}
