package com.qunchuang.carmall.controller;

import com.qunchuang.carmall.domain.CarInfo;
import com.qunchuang.carmall.graphql.annotation.GraphqlController;
import com.qunchuang.carmall.graphql.annotation.GraphqlMutation;
import com.qunchuang.carmall.graphql.annotation.SchemaDocumentation;
import com.qunchuang.carmall.service.CarInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Curtain
 * @date 2019/1/16 10:21
 */
@GraphqlController("carInfo")
public class CarInfoController {

    @Autowired
    private CarInfoService carInfoService;

    @SchemaDocumentation("添加车辆")
    @GraphqlMutation(path = "/add")
    public CarInfo add(CarInfo carInfo) {
        return carInfoService.add(carInfo);
    }

    @SchemaDocumentation("批量添加车辆")
    @GraphqlMutation(path = "/addAdll")
    public List<CarInfo> addAdll(List<CarInfo> carInfos) {
        return carInfoService.addAll(carInfos);
    }

    @SchemaDocumentation("修改车辆")
    @GraphqlMutation(path = "/modify")
    public CarInfo modify(CarInfo carInfo) {
        return carInfoService.modify(carInfo);
    }

    @SchemaDocumentation("删除车辆")
    @GraphqlMutation(path = "/delete")
    public CarInfo delete(String id) {
        return carInfoService.delete(id);
    }

    @SchemaDocumentation("上下架车辆")
    @GraphqlMutation(path = "/upperDownShelf")
    public CarInfo upperDownShelf(String id) {
        return carInfoService.upperDownShelf(id);
    }
}