package com.jiker.keju;

import java.io.File;
import java.net.URL;
import java.util.regex.Pattern;

public class Utils {
    public File getFileFromResources(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }
    }

    public int[] getInputs(String line) {
        int[] result = {0, 0};
        if (line.contains("公里,等待") && line.contains("分钟")) {
            result[0] = toInteger(line.substring(0, line.indexOf("公里")));
            result[1] = toInteger(line.substring(6, 7));
        }
        return result;
    }

    public static boolean ifInteger(String str) {
        boolean res = false;
        if (str != null && !str.equals("")) {
            Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
            res = pattern.matcher(str).matches();
        }
        return res;
    }

    public int toInteger(String str) {
        int res = 0;
        if (ifInteger(str)) {
            res = Integer.parseInt(str);
        }
        return res;
    }
}
