package com.kwad.sdk.crash.a;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes.dex */
public final class a {
    private static Context PK;
    private static String aAi;

    public static boolean A(File file) {
        if (file == null) {
            return false;
        }
        return file.exists() || file.mkdirs();
    }

    public static File EL() {
        File file = !TextUtils.isEmpty(aAi) ? new File(aAi) : new File(getDataDir(PK), "kwad_ex");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static File EM() {
        return new File(EL(), "java_crash/dump");
    }

    public static File EN() {
        return new File(EL(), "anr_log/dump");
    }

    public static File EO() {
        return new File(EL(), "native_crash_log/dump");
    }

    private static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new File(context.getExternalFilesDir(null).getAbsolutePath());
        }
        File dataDir = Build.VERSION.SDK_INT >= 24 ? context.getDataDir() : null;
        if (dataDir == null) {
            dataDir = new File(Environment.getDataDirectory().getPath() + "/data/" + context.getPackageName());
            if (!dataDir.exists()) {
                return new File("/data/data/" + context.getPackageName());
            }
        }
        return dataDir;
    }

    public static void init(Context context, String str) {
        PK = context;
        aAi = str;
    }
}
