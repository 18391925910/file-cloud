package com.yy.filecloud.core.FileContent;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class FileTest {
    @Test
    public void test(){
        File file=new File();
        file.setName("yueyi");
        log.info(file.getName());
    }

}