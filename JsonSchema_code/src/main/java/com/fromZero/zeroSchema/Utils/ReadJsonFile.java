package com.fromZero.zeroSchema.Utils;


import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonNodeReader;
import java.io.*;
/**
 * @Desciption: 从/src/main/resources目录中读取json文件
 * @Auther: ZhangXueCheng4441
 * @Date:2020/12/13/013 15:38
 */
public class ReadJsonFile {
    /**
     * 读取Json文件为String json
     *
     * @param filePath filePath为文件的相对于resources的路径
     * @return
     */
    public static String readJsonFileAsString(String filePath) {
        filePath = ReadJsonFile.class.getResource(filePath).getPath();
        String jsonStr = "";
        try {
            File jsonFile = new File(filePath);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 读取Json文件为JsonNode
     *
     * @param filePath filePath为文件的绝对路径
     * @return
     */
    public static JsonNode readJsonFileAsJsonNode(String filePath) {
        JsonNode instance = null;
        try {
            instance = new JsonNodeReader().fromReader(new FileReader(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }
}