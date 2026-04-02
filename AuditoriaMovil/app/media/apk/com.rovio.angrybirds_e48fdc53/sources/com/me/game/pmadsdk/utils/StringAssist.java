package com.me.game.pmadsdk.utils;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public class StringAssist {
    public static ArrayList<String> getStrings(Context context, String fileName) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            InputStreamReader inputReader = new InputStreamReader(context.getResources().getAssets().open(fileName));
            BufferedReader bufReader = new BufferedReader(inputReader);
            while (true) {
                String line = bufReader.readLine();
                if (line == null) {
                    break;
                }
                strings.add(line.trim());
            }
            bufReader.close();
            inputReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static String getString(Context context, String fileName) {
        try {
            return getString(context.getResources().getAssets().open(fileName));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getFileString(String fileName) {
        return getFileString(new File(fileName));
    }

    public static String getFileString(File file) {
        try {
            return getString(new FileInputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getString(InputStream inputStream) {
        StringBuffer buffer = new StringBuffer();
        try {
            InputStreamReader inputReader = new InputStreamReader(inputStream);
            BufferedReader bufReader = new BufferedReader(inputReader);
            while (true) {
                String line = bufReader.readLine();
                if (line == null) {
                    break;
                }
                buffer.append(line);
                buffer.append("\n");
            }
            bufReader.close();
            inputReader.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public static String getTestString(Context context, String fileName) {
        StringBuffer buffer = new StringBuffer();
        try {
            AssetManager assets = context.getResources().getAssets();
            InputStreamReader inputReader = new InputStreamReader(assets.open("test/" + fileName));
            BufferedReader bufReader = new BufferedReader(inputReader);
            while (true) {
                String line = bufReader.readLine();
                if (line == null) {
                    break;
                }
                buffer.append(line);
                buffer.append("\n");
            }
            bufReader.close();
            inputReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public static boolean equals(Object a, Object b) {
        return a != null && a.equals(b);
    }
}
