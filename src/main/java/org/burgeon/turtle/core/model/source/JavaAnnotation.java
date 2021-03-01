package org.burgeon.turtle.core.model.source;

import lombok.Data;

/**
 * Java注解
 *
 * @author luxiaocong
 * @createdOn 2021/2/27
 */
@Data
public class JavaAnnotation {

    private String name;

    private JavaAnnotationAttribute[] attributes;

}
