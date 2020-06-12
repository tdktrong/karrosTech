package com.example.demo.utils;

import javax.sql.rowset.serial.SerialClob;
import java.io.BufferedReader;
import java.sql.Clob;

public class StringUtils {
    /**
     *
     * @param clob
     * @return
     */
    public static String clob2Str(Clob clob) {
        if (clob == null) {
            return null;
        }

        StringBuffer stringBuffer = new StringBuffer();
        try {
            BufferedReader bufferRead = new BufferedReader(clob.getCharacterStream());

            String line;
            while ((line = bufferRead.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static Clob str2Clob(String str) {
        if (str == null) {
            return null;
        }

        Clob clob = null;
        try {
            clob = new SerialClob(str.toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clob;
    }
}
