package org.springTest.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.springTest.Entity.tools;
import org.springTest.Service.Impl.toolsServiceImpl;

@Component
public class Info {
	

    @Autowired
    toolsServiceImpl toolsService ;
	 
    public static void main(String[] args) {
        Info info = new Info();
        //info.name = "Taro Tanaka";
       // info.age = 30;
        
        
        
        
        // ↓↓↓jacksonを使用してデータをjsonに変換してくれる処理の例↓↓↓
 
        
        
        
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            String script = mapper.writeValueAsString(info);
            System.out.println(script);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // MC001からデータを取得して
    public List toolList() {
    	List<tools> iii = new ArrayList<>();
    	iii = toolsService.getAllEntity_Service();
    	return iii ;
    }
}