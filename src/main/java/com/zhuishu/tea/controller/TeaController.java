package com.zhuishu.tea.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/tea")
@RestController
public class TeaController {
    @PostMapping
    public String add(){
        return "add tea";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return "delete tea"+id;
    }
    @PutMapping("/{id}")
    public String put(@PathVariable String id){
        return "put tea"+id;
    }
    @GetMapping("/{id}")
    public String get(@PathVariable String id){
        return "get tea"+id;
    }
    @PostMapping("/conditions")
    public String search(){
        return "search tea";
    }
    @GetMapping("/all")
    String post(){
        return  "欢迎来到tea微服务模块tea!!!";
    }
}
