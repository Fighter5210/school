package com.company.project.service;
import com.company.project.model.Device;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2017/07/05.
 */
public interface DeviceService extends Service<Device> {

    Device findByKey(String key);
}
