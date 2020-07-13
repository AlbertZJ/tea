package com.zhuishu.tea.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags="tea相关接口")
@RequestMapping("/tea")
public class TeaController {

    @ApiOperation(value = "添加tea的接口", notes = "添加一个tea的接口")
    @ApiImplicitParam(name = "teaRoutForm", value = "新增tea的form表单", required = true, dataType = "Tea")
    @PostMapping
    public String add(){
        return "add tea";
    }

    @ApiOperation(value = "删除tea的接口", notes = "根据tea的id来指定删除对象")
    @ApiImplicitParam(paramType = "path", name = "id", value = "茶的ID", required = true, dataType = "string")
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return "delete tea"+id;
    }

    @ApiOperation(value = "修改tea的接口")
    @PutMapping(value = "/{id}")
    public String put(@PathVariable String id){
        return "put tea"+id;
    }

    @ApiOperation(value = "查询tea的接口")
    @ApiImplicitParam(paramType = "path", name = "id", value = "tea的ID", required = true, dataType = "string")
    @GetMapping(value = "/{id}")
    public String get(@PathVariable String id){
        return "get tea"+id;
    }

    @ApiOperation("搜索tea的接口")
    @ApiImplicitParam(name = "teaRoutQueryForm", value = "tea查询参数", required = true, dataType = "TeaRouteQueryForm")
    @PostMapping(value = "/conditions")
    public String search(){
        return "search tea";
    }

    @ApiOperation(value = "查询所有tea的接口")
    @GetMapping("/all")
    String post(){
        return  "欢迎来到tea微服务模块tea!!!";
    }
}
