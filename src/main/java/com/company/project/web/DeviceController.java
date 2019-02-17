package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Device;
import com.company.project.service.DeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/07/05.
*/
@Controller
@RequestMapping("/device")
public class DeviceController {
    @Resource
    private DeviceService deviceService;

    @PostMapping("/add")
    public Result add(Device device) {
        deviceService.save(device);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        deviceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Device device) {
        deviceService.update(device);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Device device = deviceService.findByKey("f261175016234cb15961c4fe27585c0c");//.findById(id);
        return ResultGenerator.genSuccessResult(device);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Device> list = deviceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/test")
    public String test(@RequestParam Integer id) {
        Device device = deviceService.findByKey("f261175016234cb15961c4fe27585c0c");//.findById(id);
        return "index";
    }
}
