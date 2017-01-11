package com.jueduizone.service;


import com.jueduizone.model.PuTian;

import java.util.List;

/**
 * Created by JamieXu on 16/5/11.
 */
public interface PuTianServie {
    List<PuTian> getInfoByName(String name, String state);

    PuTian getInfoById(int id, String state);

    boolean addPuTianInfo(PuTian puTian);
}
