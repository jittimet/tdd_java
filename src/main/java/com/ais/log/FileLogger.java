package com.ais.log;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class FileLogger implements  Logger{
    public FileWriter fileWriter;
    public void setWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void persist(String message, String dateTime) throws IOException {
        JSONObject obj = new JSONObject();
        obj.put("message", message);
        obj.put("date_time", dateTime);
        
        try {
            fileWriter.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            fileWriter.flush();
            fileWriter.close();

        }
    }
}
