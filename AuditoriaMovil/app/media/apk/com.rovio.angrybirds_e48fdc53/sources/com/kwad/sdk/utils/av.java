package com.kwad.sdk.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes3.dex */
public final class av {
    private static String aJn;
    private static File aJo;

    private static boolean Jn() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return !Environment.isExternalStorageRemovable();
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            return false;
        }
    }

    private static String cK(Context context) {
        if (TextUtils.isEmpty(aJn)) {
            String str = null;
            if (Jn()) {
                try {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        str = externalFilesDir.getPath();
                    }
                } catch (Exception e) {
                    com.kwad.sdk.core.e.c.printStackTrace(e);
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = context.getFilesDir().getPath();
            }
            String str2 = str + File.separator + "ksadsdk";
            aJn = str2;
            return str2;
        }
        return aJn;
    }

    public static File cL(Context context) {
        File file = aJo;
        if (file != null) {
            return file;
        }
        String str = null;
        if (Jn()) {
            try {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir != null) {
                    str = externalCacheDir.getPath();
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = context.getCacheDir().getPath();
        }
        File file2 = new File(str + File.separator + "ksadsdk");
        aJo = file2;
        if (!file2.exists()) {
            aJo.mkdirs();
        }
        return aJo;
    }

    public static File cM(Context context) {
        String cK = cK(context);
        File file = new File(cK + File.separator + "Download");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File cN(Context context) {
        String cK = cK(context);
        File file = new File(cK + File.separator + "downloadFileSync/.temp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File cO(Context context) {
        String str;
        if (com.kwad.framework.a.a.mp.booleanValue()) {
            str = cK(context);
        } else {
            str = context.getFilesDir().getAbsolutePath() + File.separator + "ksadsdk";
        }
        return new File(str + File.separator + "ksadlog");
    }

    public static String cP(Context context) {
        if (context == null) {
            return "";
        }
        String path = context.getFilesDir().getPath();
        return path + File.separator + "ksadsdk";
    }

    public static String cQ(Context context) {
        return cL(context).getPath() + "/cookie";
    }

    public static String getTkJsFileDir(Context context, String str) {
        if (context == null) {
            return "";
        }
        String cP = cP(context);
        return cP + File.separator + "ksad/download/js" + File.separator + str;
    }

    public static String getTkJsRootDir(Context context) {
        if (context == null) {
            return "";
        }
        String cP = cP(context);
        return cP + File.separator + "ksad/download/js";
    }
}
