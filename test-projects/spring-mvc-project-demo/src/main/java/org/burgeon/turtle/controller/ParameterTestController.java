package org.burgeon.turtle.controller;

import org.burgeon.turtle.model.ModelAttributeModel;
import org.burgeon.turtle.model.ParameterModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author luxiaocong
 * @createdOn 2021/4/9
 */
@RestController
public class ParameterTestController {

    @PostMapping(value = "/parameter/{path}")
    public ParameterModel parameter(@PathVariable String path,
                                    @RequestParam String requestParam,
                                    @RequestParam String[] requestParams,
                                    @ModelAttribute ModelAttributeModel modelAttributeModel,
                                    @RequestBody ParameterModel parameterModel) {
        System.out.println("===============================================================");
        System.out.println("path: " + path);
        System.out.println("requestParam: " + requestParam);
        System.out.println("requestParams[0]: " + (requestParams == null ? null : requestParams[0]));
        System.out.println("modelAttributeModel.mNum: " + modelAttributeModel.getMNum());
        System.out.println("modelAttributeModel.mStr: " + modelAttributeModel.getMStr());
        System.out.println("modelAttributeModel.mBool: " + modelAttributeModel.getMBool());
        System.out.println("modelAttributeModel.mArr: " + (modelAttributeModel.getArr() == null ? null : modelAttributeModel.getArr().length));
        System.out.println("modelAttributeModel.mObj: " + (modelAttributeModel.getObj() == null ? null : modelAttributeModel.getObj().getStr()));
        return parameterModel;
    }

    @GetMapping(value = "/parameter/return1")
    public Integer return1() {
        return 255;
    }

    @GetMapping(value = "/parameter/return2")
    public String return2() {
        return "return2";
    }

    @GetMapping(value = "/parameter/return3")
    public Boolean return3() {
        return false;
    }

    @GetMapping(value = "/parameter/return4")
    public ParameterModel[] return4() {
        return new ParameterModel[1];
    }

    @GetMapping(value = "/parameter/return5")
    public List<ParameterModel> return5() {
        return Collections.EMPTY_LIST;
    }

    @GetMapping(value = "/parameter/return6")
    public Map<String, ParameterModel> return6() {
        return Collections.EMPTY_MAP;
    }

}