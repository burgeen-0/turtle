package org.burgeon.turtle.utils;

import org.jetbrains.annotations.NotNull;

/**
 * 环境配置工具类
 *
 * @author luxiaocong
 * @createdOn 2021/3/1
 */
public class EnvUtils {

    /**
     * 获取byte类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static byte getByteProperty(@NotNull String key, byte def) {
        String val = getStringProperty(key);
        try {
            return Byte.parseByte(val);
        } catch (Exception e) {
            return def;
        }
    }

    /**
     * 获取short类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static short getShortProperty(@NotNull String key, short def) {
        String val = getStringProperty(key);
        try {
            return Short.parseShort(val);
        } catch (Exception e) {
            return def;
        }
    }

    /**
     * 获取int类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static int getIntProperty(@NotNull String key, int def) {
        String val = getStringProperty(key);
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {
            return def;
        }
    }

    /**
     * 获取long类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static long getLongProperty(@NotNull String key, long def) {
        String val = getStringProperty(key);
        try {
            return Long.parseLong(val);
        } catch (Exception e) {
            return def;
        }
    }

    /**
     * 获取float类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static float getFloatProperty(@NotNull String key, float def) {
        String val = getStringProperty(key);
        try {
            return Float.parseFloat(val);
        } catch (Exception e) {
            return def;
        }
    }

    /**
     * 获取double类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static double getDoubleProperty(@NotNull String key, double def) {
        String val = getStringProperty(key);
        try {
            return Double.parseDouble(val);
        } catch (Exception e) {
            return def;
        }
    }

    /**
     * 获取boolean类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static boolean getBooleanProperty(@NotNull String key, boolean def) {
        String val = getStringProperty(key);
        if (val == null) {
            return def;
        }
        return Boolean.parseBoolean(val);
    }

    /**
     * 获取String类型的系统配置
     *
     * @param key
     * @return
     */
    public static String getStringProperty(@NotNull String key) {
        return System.getProperty(key);
    }

    /**
     * 获取String类型的系统配置
     *
     * @param key
     * @param def
     * @return
     */
    public static String getStringProperty(@NotNull String key, String def) {
        return System.getProperty(key, def);
    }

}
