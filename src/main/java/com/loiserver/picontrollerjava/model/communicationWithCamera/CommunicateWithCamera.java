package com.loiserver.picontrollerjava.model.communicationWithCamera;

import com.alibaba.fastjson.JSON;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CommunicateWithCamera {
    public void setInformation(){
        InformationFromOpencvToPi informationFromOpencvToPi = new InformationFromOpencvToPi();
        informationFromOpencvToPi.setCameraOK(true);
        informationFromOpencvToPi.setCommand("try");
        String jsonString = JSON.toJSONString(informationFromOpencvToPi);

        System.out.println(jsonString);

        BufferedWriter writer = null;
        File file = new File("test.json");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try{
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(jsonString);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("Write in success!");

    }

}
