package com.test.util;

import java.util.ResourceBundle;

/**
 * 注释：获取配置工具类
 * 作者：刘腾飞【liutengfei】
 * 时间：2016年09月06日 16:55
 */
public class ConfigUtil {
    /**
     * 获取配置内容
     *
     * @param file 文件名
     */
    public static String getString(String file, String key) {
        String filePath = "props/" + file;
        try {
            ResourceBundle resourceBundle = ResourceBundle.getBundle(filePath);
            return resourceBundle.getString(key);
        } catch (Exception e) {
            throw new RuntimeException("不能在配置文件" + filePath + "中发现参数：" + '!' + key + '!');
        }
    }

    public static String getString(String key) {
        return getString("config", key);
    }

    public static Integer getInt(String file, String key) {
        String value = getString(file, key);
        if (value != null) {
            return Integer.valueOf(value);
        }
        return -1;
    }

    public static Integer getInt(String key) {
        return getInt("config", key);
    }
}
