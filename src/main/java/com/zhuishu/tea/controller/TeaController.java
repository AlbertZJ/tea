package com.zhuishu.tea.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags="tea相关接口")
@RequestMapping("/tea")
public class TeaController {

    @PostMapping
    @ApiOperation("添加tea的接口")
    public String add(){
        return "add tea";
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除tea的接口")
    public String delete(@PathVariable String id){
        return "delete tea"+id;
    }

    @PutMapping("/{id}")
    @ApiOperation("修改tea的接口")
    public String put(@PathVariable String id){
        return "put tea"+id;
    }

    @GetMapping("/{id}")
    @ApiOperation("查询tea的接口")
    public String get(@PathVariable String id){
        return "get tea"+id;
    }

    @PostMapping("/conditions")
    @ApiOperation("搜索tea的接口")
    public String search(){
        return "search tea";
    }

    @GetMapping("/all")
    @ApiOperation("查询所有tea的接口")
    String post(){
        return  "欢迎来到tea微服务模块tea!!!";
    }
}
