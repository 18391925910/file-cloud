package com.yy.filecloud.core.FileContent;

/**
 * @author: elvis.yue@i9i8.com
 * @create: 2021-10-14 15:54
 */
public abstract class FileContent {
    private String name;
    private String path;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPath(){
        return this.path;
    }
    public void setPath(String path){
        this.path=path;
    }
}