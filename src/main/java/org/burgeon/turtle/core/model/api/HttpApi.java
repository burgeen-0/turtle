package org.burgeon.turtle.core.model.api;

import lombok.Data;

/**
 * HTTP接口
 *
 * @author luxiaocong
 * @createdOn 2021/2/26
 */
@Data
public class HttpApi {

    /**
     * 以httpMethod+path作为ID
     */
    private String id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口版本
     */
    private String version;

    /**
     * HTTP方法
     */
    private HttpMethod httpMethod;

    /**
     * 接口路径
     */
    private String path;

    /**
     * 请求参数
     */
    private Parameter[] requestParameters;

    /**
     * HTTP请求
     */
    private HttpRequest httpRequest;

    /**
     * HTTP返回
     */
    private HttpResponse httpResponse;

    /**
     * 接口错误码
     */
    private ErrorCode[] errorCodes;

}
