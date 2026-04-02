package com.kwad.sdk.api.loader;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {
    private static File aiD;

    private static File aD(Context context) {
        if (aiD == null) {
            aiD = i(new File(context.getApplicationInfo().dataDir, "ksad_dynamic"));
        }
        return aiD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        file.delete();
    }

    private static File i(File file) {
        if (file.exists() && file.isFile()) {
            file.delete();
        }
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!(file.exists() && file.isDirectory()) && com.kwad.sdk.api.a.mp.booleanValue()) {
            throw new RuntimeException("Can not ensureDir:" + file);
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(File file) {
        try {
            h(file);
        } catch (Exception e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File m(Context context, String str) {
        File aD = aD(context);
        return new File(aD, "dynamic-" + System.currentTimeMillis() + "-" + str + ".apk");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n(Context context, String str) {
        File aD = aD(context);
        return i(new File(aD, "apk-" + str)).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File o(Context context, String str) {
        File aD = aD(context);
        return i(new File(aD, "apk-" + str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String p(Context context, String str) {
        return new File(n(context, str), "dynamic.apk").getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String q(Context context, String str) {
        return i(new File(n(context, str), "dex")).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String r(Context context, String str) {
        return i(new File(n(context, str), "libs")).getPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(final Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.kwad.sdk.api.a.a.submit(new Runnable() { // from class: com.kwad.sdk.api.loader.h.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    File[] listFiles = h.o(context, str).getParentFile().listFiles();
                    if (listFiles == null || listFiles.length <= 0) {
                        return;
                    }
                    for (File file : listFiles) {
                        if (g.D(str, file.getName().substring(file.getName().indexOf("-") + 1))) {
                            h.h(file);
                        }
                    }
                } catch (Exception e) {
                }
            }
        });
    }
}
