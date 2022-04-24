package com.atguigu.yygh.cmn;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public class ExcelListener extends AnalysisEventListener<User> {
    @Override
    public void invoke(User user, AnalysisContext analysisContext) {
        System.out.println(user);
    }
    @Override
    public void invokeHeadMap(Map<Integer,String> headMap,AnalysisContext analysisContext){
        System.out.println(headMap);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
