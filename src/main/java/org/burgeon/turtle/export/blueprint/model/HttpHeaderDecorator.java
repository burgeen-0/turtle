package org.burgeon.turtle.export.blueprint.model;

import org.burgeon.turtle.core.model.api.HttpHeader;
import org.burgeon.turtle.export.blueprint.FilterHelper;

/**
 * HTTP头【装饰器】
 *
 * @author luxiaocong
 * @createdOn 2021/3/27
 */
public class HttpHeaderDecorator extends HttpHeader {

    private HttpHeader httpHeader;

    public HttpHeaderDecorator(HttpHeader httpHeader) {
        this.httpHeader = httpHeader;
    }

    @Override
    public String getName() {
        return FilterHelper.filterHttpHeaderName(httpHeader.getName());
    }

    @Override
    public String getDescription() {
        return FilterHelper.filterHttpHeaderDescription(httpHeader.getDescription());
    }

    @Override
    public String getExampleValue() {
        return httpHeader.getExampleValue();
    }

}
