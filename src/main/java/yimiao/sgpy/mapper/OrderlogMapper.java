package yimiao.sgpy.mapper;

import yimiao.sgpy.entity.Orderlog;

/**
* @author yimiao
* @description 针对表【orderlog(预订日志信息)】的数据库操作Mapper
* @createDate 2026-02-10 13:31:35
* @Entity yimiao.sgpy.entity.Orderlog
*/
public interface OrderlogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Orderlog record);

    int insertSelective(Orderlog record);

    Orderlog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Orderlog record);

    int updateByPrimaryKey(Orderlog record);

}
