package com.ironsource.sdk.utils;

import android.content.Context;
import com.google.android.gms.nearby.messages.Message;
import com.ironsource.environment.h;
import com.ironsource.sdk.h.e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class IronSourceStorageUtils {
    private static e a;

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        return new File(file.getAbsolutePath() + File.separator + "supersonicads" + File.separator);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + File.separator + str2;
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        Object c;
        String name;
        Object c2;
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    c = c(file2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (c instanceof JSONArray) {
                    name = "files";
                    c2 = c(file2);
                } else if (c instanceof JSONObject) {
                    name = file2.getName();
                    c2 = c(file2);
                }
                jSONObject.put(name, c2);
            }
        }
        return jSONObject;
    }

    public static JSONObject buildFilesMapOfDirectory(com.ironsource.sdk.h.c cVar, JSONObject jSONObject) {
        String name;
        JSONObject buildFilesMapOfDirectory;
        if (cVar == null || !cVar.isDirectory()) {
            return new JSONObject();
        }
        File[] listFiles = cVar.listFiles();
        if (listFiles == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (File file : listFiles) {
            com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
            if (cVar2.isFile()) {
                name = cVar2.getName();
                buildFilesMapOfDirectory = cVar2.a();
                if (jSONObject.has(name)) {
                    buildFilesMapOfDirectory = SDKUtils.mergeJSONObjects(buildFilesMapOfDirectory, jSONObject.getJSONObject(name));
                }
            } else if (cVar2.isDirectory()) {
                name = cVar2.getName();
                buildFilesMapOfDirectory = buildFilesMapOfDirectory(cVar2, jSONObject);
            }
            jSONObject2.put(name, buildFilesMapOfDirectory);
        }
        return jSONObject2;
    }

    private static Object c(File file) {
        File[] listFiles;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), c(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        return jSONObject;
    }

    public static void deleteCacheDirectories(Context context) {
        a(h.s(context));
        a(h.u(context));
    }

    public static synchronized boolean deleteFile(com.ironsource.sdk.h.c cVar) {
        synchronized (IronSourceStorageUtils.class) {
            if (cVar.exists()) {
                return cVar.delete();
            }
            return false;
        }
    }

    public static void deleteFilesDirectories(Context context) {
        a(h.t(context));
        a(h.v(context));
    }

    public static synchronized boolean deleteFolder(String str) {
        boolean z;
        synchronized (IronSourceStorageUtils.class) {
            File file = new File(str);
            if (deleteFolderContentRecursive(file)) {
                z = file.delete();
            }
        }
        return z;
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject buildFilesMap = buildFilesMap(str, str2);
        try {
            buildFilesMap.put("path", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return buildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        if (SDKUtils.isExternalStorageAvailable()) {
            e eVar = a;
            File t = (eVar == null || !eVar.a()) ? h.t(context) : h.s(context);
            if (t != null && t.canWrite()) {
                return t.getPath();
            }
        }
        e eVar2 = a;
        return ((eVar2 == null || !eVar2.a()) ? h.v(context) : h.u(context)).getPath();
    }

    public static ArrayList<com.ironsource.sdk.h.c> getFilesInFolderRecursive(com.ironsource.sdk.h.c cVar) {
        if (cVar == null || !cVar.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<com.ironsource.sdk.h.c> arrayList = new ArrayList<>();
        File[] listFiles = cVar.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                if (cVar2.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(cVar2));
                }
                if (cVar2.isFile()) {
                    arrayList.add(cVar2);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File b = b(new File(getDiskCacheDirPath(context)));
        if (!b.exists()) {
            b.mkdir();
        }
        return b.getPath();
    }

    public static long getTotalSizeOfDir(com.ironsource.sdk.h.c cVar) {
        long totalSizeOfDir;
        long j = 0;
        if (cVar != null && cVar.isDirectory()) {
            File[] listFiles = cVar.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file : listFiles) {
                com.ironsource.sdk.h.c cVar2 = new com.ironsource.sdk.h.c(file.getPath());
                if (cVar2.isFile()) {
                    totalSizeOfDir = cVar2.length();
                } else if (cVar2.isDirectory()) {
                    totalSizeOfDir = getTotalSizeOfDir(cVar2);
                }
                j += totalSizeOfDir;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(Context context, e eVar) {
        a = eVar;
        if (eVar != null && eVar.a.optBoolean("deleteCacheDir", false)) {
            deleteCacheDirectories(context);
        }
        e eVar2 = a;
        if (eVar2 == null || !eVar2.a.optBoolean("deleteFilesDir", false)) {
            return;
        }
        deleteFilesDirectories(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(com.ironsource.sdk.h.c cVar) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cVar));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) {
        return new File(str).renameTo(new File(str2));
    }

    public static int saveFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[Message.MAX_CONTENT_SIZE_BYTES];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, read);
                i += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
