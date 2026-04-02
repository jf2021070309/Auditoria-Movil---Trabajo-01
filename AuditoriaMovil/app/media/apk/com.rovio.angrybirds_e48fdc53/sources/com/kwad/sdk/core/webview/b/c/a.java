package com.kwad.sdk.core.webview.b.c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public final class a {
    public static String B(Context context, String str) {
        String bt = bt(context);
        if (TextUtils.isEmpty(bt)) {
            return null;
        }
        return bt + File.separator + str;
    }

    public static String C(Context context, String str) {
        String bt = bt(context);
        if (TextUtils.isEmpty(bt)) {
            return null;
        }
        return bt + File.separator + str + ".zip";
    }

    public static String D(Context context, String str) {
        String bt = bt(context);
        if (TextUtils.isEmpty(bt)) {
            return null;
        }
        return bt + File.separator + str;
    }

    public static String E(Context context, String str) {
        String bt = bt(context);
        if (TextUtils.isEmpty(bt)) {
            return null;
        }
        return bt + File.separator + str + File.separator + "_manifest_.json";
    }

    private static File bs(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return new File("/data/data/" + context.getPackageName() + "/file/");
        }
        return filesDir;
    }

    private static String bt(Context context) {
        String str = bs(context) + File.separator + "offlinepackage";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public static File bu(Context context) {
        String bt = bt(context);
        if (TextUtils.isEmpty(bt)) {
            return null;
        }
        ef(bt);
        File file = new File(bt, "packageIndex.json");
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public static void e(Context context, String str, String str2) {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                break;
            }
            String name = nextEntry.getName();
            String bt = bt(context);
            if (!new File(bt, name).getAbsolutePath().startsWith(bt)) {
                break;
            } else if (!nextEntry.isDirectory()) {
                File file = new File(str2 + File.separator + name);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    fileOutputStream.flush();
                }
                com.kwad.sdk.crash.utils.b.closeQuietly(fileOutputStream);
            } else if (!name.contains("../")) {
                String substring = name.substring(0, name.length() - 1);
                new File(str2 + File.separator + substring).mkdirs();
            }
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(zipInputStream);
    }

    public static String ed(String str) {
        try {
            return Uri.parse(str).getQueryParameter("sceneId");
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.e("HybridFileUtils", "getSceneId This isn't a hierarchical URI url is " + str);
            return "";
        }
    }

    public static String ee(String str) {
        try {
            List<String> pathSegments = Uri.parse(str).getPathSegments();
            String str2 = null;
            if (pathSegments != null && pathSegments.size() > 0) {
                str2 = pathSegments.get(pathSegments.size() - 1);
            }
            return (TextUtils.isEmpty(str2) || !str2.contains(".zip")) ? "" : str2.substring(0, str2.indexOf(".zip"));
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.e("HybridFileUtils", "getZipName This isn't a hierarchical URI url is " + str);
            return "";
        }
    }

    private static boolean ef(String str) {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }
}
