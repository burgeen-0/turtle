package org.burgeon.turtle.core.model.api;

import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API项目
 *
 * @author luxiaocong
 * @createdOn 2021/2/26
 */
@Data
public class ApiProject {

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 项目根路径
     */
    private String host;

    /**
     * API群组
     */
    private List<ApiGroup> groups;

    private Map<String, ApiGroup> groupMap = new HashMap<>();
    private Map<String, HttpApi> apiMap = new HashMap<>();

    public void putApiGroup(String key, ApiGroup apiGroup) {
        groupMap.put(key, apiGroup);
    }

    public ApiGroup getApiGroup(String key) {
        return groupMap.get(key);
    }

    public void putHttpApi(String key, HttpApi httpApi) {
        apiMap.put(key, httpApi);
    }

    public HttpApi getHttpApi(String key) {
        return apiMap.get(key);
    }

}
