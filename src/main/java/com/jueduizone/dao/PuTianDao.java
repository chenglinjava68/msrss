package com.jueduizone.dao;

import com.jueduizone.model.PuTian;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by JamieXu on 16/5/11.
 */
public interface PuTianDao {
    /**
     * 通过名字模糊查询
     *
     * @param name
     * @return
     */
    List<PuTian> selectInfoByName(@Param("name") String name, @Param("state") String state);

    /**
     * 根据ID查询详情
     *
     * @param id
     * @return
     */
    PuTian selectInfoById(@Param("id") int id, @Param("state") String state);

    /**
     * 插入数据
     *
     * @param puTian
     * @return
     */
    int insertInfo(PuTian puTian);
}
