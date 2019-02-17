package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 机构编码
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * 设备编码
     */
    @Column(name = "device_id")
    private String deviceId;

    /**
     * 秘钥
     */
    @Column(name = "secret_key")
    private String secretKey;

    /**
     * 前置机公钥存放地址
     */
    @Column(name = "key_path")
    private String keyPath;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取机构编码
     *
     * @return org_code - 机构编码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置机构编码
     *
     * @param orgCode 机构编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取设备编码
     *
     * @return device_id - 设备编码
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备编码
     *
     * @param deviceId 设备编码
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取秘钥
     *
     * @return secret_key - 秘钥
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * 设置秘钥
     *
     * @param secretKey 秘钥
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * 获取前置机公钥存放地址
     *
     * @return key_path - 前置机公钥存放地址
     */
    public String getKeyPath() {
        return keyPath;
    }

    /**
     * 设置前置机公钥存放地址
     *
     * @param keyPath 前置机公钥存放地址
     */
    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}