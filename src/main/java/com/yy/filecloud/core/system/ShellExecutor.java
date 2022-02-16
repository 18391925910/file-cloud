package com.yy.filecloud.core.system;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;

public class ShellExecutor {

    public static synchronized boolean runShell(List<String> commends){
        Runtime runtime=Runtime.getRuntime();
        Process process;
        try {
            for (String comment : commends) {
                process=runtime.exec(comment);
                process.waitFor();
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(process.getInputStream(),"gbk"));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println("Shell Executor[comment:"+comment+"],result:"+line);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
    public static synchronized void runShell(String commend){

    }
}
