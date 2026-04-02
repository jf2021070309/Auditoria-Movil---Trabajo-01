package com.kwad.sdk.core.diskcache;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.kwad.sdk.c;
import com.kwad.sdk.d;
import com.kwad.sdk.utils.av;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a {
    public static void aU(final Context context) {
        g.schedule(new aw() { // from class: com.kwad.sdk.core.diskcache.a.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                d wQ;
                synchronized (a.class) {
                    File cM = av.cM(context);
                    if (cM.exists()) {
                        for (File file : a.n(cM)) {
                            if (file.getName().endsWith(".apk") && com.kwad.sdk.core.a.yQ().co(file.getAbsolutePath()) != null && a.b(context, file) != null && (wQ = c.wO().wQ()) != null) {
                                wQ.g(file);
                            }
                        }
                    }
                }
            }
        }, 10L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PackageInfo b(Context context, File file) {
        if (file != null && file.exists()) {
            try {
                if (file.exists() & (!file.isDirectory())) {
                    PackageManager packageManager = context.getPackageManager();
                    PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getPath(), 65);
                    if (packageManager.getPackageInfo(packageArchiveInfo.packageName, 1) != null) {
                        return null;
                    }
                    return packageArchiveInfo;
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<File> n(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return arrayList;
        }
        arrayList.addAll(Arrays.asList(listFiles));
        r(arrayList);
        return arrayList;
    }

    private static void r(List<File> list) {
        Collections.sort(list, new Comparator<File>() { // from class: com.kwad.sdk.core.diskcache.a.2
            private static int c(File file, File file2) {
                if (file.lastModified() >= file2.lastModified()) {
                    return file.lastModified() == file2.lastModified() ? 0 : 1;
                }
                return -1;
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                return c(file, file2);
            }
        });
    }
}
