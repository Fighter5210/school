package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Device;

public interface DeviceMapper extends Mapper<Device> {
     Device findByKey(String key);
}