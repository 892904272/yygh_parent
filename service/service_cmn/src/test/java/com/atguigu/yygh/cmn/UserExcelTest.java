package com.atguigu.yygh.cmn;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class UserExcelTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        for(int i =0;i<10;i++){
            User user = new User();
            user.setId(i);
            user.setName("lucy"+i);
            list.add(user);

        }
        String fileName = "D:\\springcloud\\excelTest\\01.xlsx";
        EasyExcel.write(fileName,User.class).sheet("Sheet1").doWrite(list);
    }


}
