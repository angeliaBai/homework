package cn.itcast.ssm.mapper;

import cn.itcast.ssm.po.Node;
import cn.itcast.ssm.po.NodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeMapper {
    int countByExample(NodeExample example);

    int deleteByExample(NodeExample example);

    int deleteByPrimaryKey(Integer nodeid);

    int insert(Node record);

    int insertSelective(Node record);

    List<Node> selectByExample(NodeExample example);

    Node selectByPrimaryKey(Integer nodeid);

    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}