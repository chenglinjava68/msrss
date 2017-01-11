package com.jueduizone.service.impl;

import com.jueduizone.dao.PuTianDao;
import com.jueduizone.model.PuTian;
import com.jueduizone.service.PuTianServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JamieXu on 16/5/11.
 */
@Service("putianService")
public class PuTianServieImpl implements PuTianServie {
    @Autowired
    PuTianDao puTianDao;

    /**
     * 根据名称模糊查询
     *
     * @param name
     * @return
     */
    @Override
    public List<PuTian> getInfoByName(String name, String state) {
        return puTianDao.selectInfoByName(name,state);
    }

    /**
     * 根据ID查询详细信息
     *
     * @param id
     * @return
     */
    @Override
    public PuTian getInfoById(int id, String state) {
        return puTianDao.selectInfoById(id,state);
    }

    /**
     * 插入信息
     *
     * @param puTian
     * @return
     */
    @Override
    public boolean addPuTianInfo(PuTian puTian) {
        int count = puTianDao.insertInfo(puTian);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
