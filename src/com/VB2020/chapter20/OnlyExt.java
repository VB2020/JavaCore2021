package com.VB2020.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext){
        this.ext = "." + ext;
    }

    public boolean accept(File file, String name){
        return name.endsWith(ext);
    }
}
