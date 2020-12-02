package com.moko.support.entity;

import java.io.Serializable;

/**
 * @Date 2020/4/20
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.moko.support.entity.OrderType
 */
public enum OrderType implements Serializable {
    // 180a
    DEVICE_MODEL("DEVICE_MODEL", "00002a24-0000-1000-8000-00805f9b34fb"),
    PRODUCT_DATE("PRODUCT_DATE", "00002a25-0000-1000-8000-00805f9b34fb"),
    FIRMWARE_VERSION("FIRMWARE_VERSION", "00002a26-0000-1000-8000-00805f9b34fb"),
    HARDWARE_VERSION("HARDWARE_VERSION", "00002a27-0000-1000-8000-00805f9b34fb"),
    SOFTWARE_VERSION("SOFTWARE_VERSION", "00002a28-0000-1000-8000-00805f9b34fb"),
    MANUFACTURER("MANUFACTURER", "00002a29-0000-1000-8000-00805f9b34fb"),
    // ff00
    DEVICE_TYPE("DEVICE_TYPE", "0000ff00-0000-1000-8000-00805f9b34fb"),
    UUID("UUID", "0000ff01-0000-1000-8000-00805f9b34fb"),
    MAJOR("MAJOR", "0000ff02-0000-1000-8000-00805f9b34fb"),
    MINOR("MINOR", "0000ff03-0000-1000-8000-00805f9b34fb"),
    MEASURE_POWER("MEASURE_POWER", "0000ff04-0000-1000-8000-00805f9b34fb"),
    TRANSMISSION("TRANSMISSION", "0000ff05-0000-1000-8000-00805f9b34fb"),
    ADV_INTERVAL("ADV_INTERVAL", "0000ff06-0000-1000-8000-00805f9b34fb"),
    DEVICE_NAME("DEVICE_NAME", "0000ff07-0000-1000-8000-00805f9b34fb"),
    PASSWORD("PASSWORD", "0000ff08-0000-1000-8000-00805f9b34fb"),
    BATTERY("BATTERY", "0000ff09-0000-1000-8000-00805f9b34fb"),
    TRACKING_STATE("TRACKING_STATE", "0000ff0a-0000-1000-8000-00805f9b34fb"),
    CONNECTION_MODE("CONNECTION_MODE", "0000ff0b-0000-1000-8000-00805f9b34fb"),
    TRACKING_NOTIFY("TRACKING_NOTIFY", "0000ff0c-0000-1000-8000-00805f9b34fb"),
    DISCONNECTED_NOTIFY("DISCONNECTED_NOTIFY", "0000ff0d-0000-1000-8000-00805f9b34fb"),
    STORE_DATA_NOTIFY("STORE_DATA_NOTIFY", "0000ff0e-0000-1000-8000-00805f9b34fb"),
    RESET("RESET", "0000ff0f-0000-1000-8000-00805f9b34fb"),
    WRITE_CONFIG("WRITE_CONFIG", "0000ff10-0000-1000-8000-00805f9b34fb"),
    ;


    private String uuid;
    private String name;

    OrderType(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
