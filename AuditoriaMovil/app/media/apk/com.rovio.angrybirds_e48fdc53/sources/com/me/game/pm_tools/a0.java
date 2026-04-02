package com.me.game.pm_tools;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* loaded from: classes5.dex */
public class a0 {
    public static boolean a(Object obj, Object obj2) {
        return obj != null && obj.equals(obj2);
    }

    public static String b(File file) {
        try {
            return e(new FileInputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String c(String str) {
        return b(new File(str));
    }

    public static String d(Context context, String str) {
        try {
            return e(context.getResources().getAssets().open(str));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String e(InputStream inputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
                stringBuffer.append("\n");
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public static ArrayList<String> f(Context context, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getResources().getAssets().open(str));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine.trim());
            }
            bufferedReader.close();
            inputStreamReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static String g(Context context, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            AssetManager assets = context.getResources().getAssets();
            InputStreamReader inputStreamReader = new InputStreamReader(assets.open("test/" + str));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
                stringBuffer.append("\n");
            }
            bufferedReader.close();
            inputStreamReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
