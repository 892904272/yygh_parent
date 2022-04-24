package com.atguigu.yygh.cmn;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class User {
    @ExcelProperty(value = "用户编号",index = 0)
    int id;
    @ExcelProperty(value = "用户名",index = 1)
    String name;
}
