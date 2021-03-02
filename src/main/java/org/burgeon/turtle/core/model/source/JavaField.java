package org.burgeon.turtle.core.model.source;

import lombok.Data;

/**
 * Java属性
 *
 * @author luxiaocong
 * @createdOn 2021/2/27
 */
@Data
public class JavaField {

    private JavaComment comment;

    private JavaAnnotation[] annotations;

    private JavaModifier modifier;

    private JavaType type;

    private String name;

}
