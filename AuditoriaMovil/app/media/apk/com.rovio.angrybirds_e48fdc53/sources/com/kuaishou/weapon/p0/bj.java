package com.kuaishou.weapon.p0;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
public class bj {
    private static final String a = "/proc/cpuinfo";

    public static String a() {
        try {
            String str = Build.CPU_ABI;
            String str2 = Build.CPU_ABI2;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(";" + str2);
            }
            String a2 = bg.a("ro.product.cpu.abilist");
            if (!TextUtils.isEmpty(a2)) {
                sb.append(";" + a2);
            }
            return sb.toString();
        } catch (Throwable th) {
            return "";
        }
    }

    public static bi b() {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        String[] split;
        try {
            fileInputStream = new FileInputStream(new File(a));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (Throwable th) {
                    bufferedReader = null;
                }
            } catch (Throwable th2) {
                inputStreamReader = null;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            inputStreamReader = null;
            fileInputStream = null;
            bufferedReader = null;
        }
        try {
            bi biVar = new bi();
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    biVar.a(i);
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return biVar;
                } else if (!TextUtils.isEmpty(readLine)) {
                    if (readLine.contains("Processor")) {
                        String[] split2 = readLine.split(":");
                        if (split2 != null) {
                            String trim = split2[1].trim();
                            if (!TextUtils.isEmpty(trim)) {
                                biVar.b(trim);
                            }
                        }
                    }
                    if (readLine.contains("processor")) {
                        String[] split3 = readLine.split(":");
                        if (split3 != null) {
                            String trim2 = split3[1].trim();
                            if (!TextUtils.isEmpty(trim2)) {
                                i = Integer.parseInt(trim2) + 1;
                            }
                        }
                    }
                    if (readLine.contains("Hardware") && (split = readLine.split(":")) != null) {
                        String str = split[1];
                        if (!TextUtils.isEmpty(str)) {
                            biVar.a(str);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        }
    }
}
