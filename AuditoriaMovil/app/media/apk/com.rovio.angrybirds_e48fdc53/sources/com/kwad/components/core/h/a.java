package com.kwad.components.core.h;

import android.content.Context;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.g;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.kwad.components.core.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0200a {
        private static final a KN = new a((byte) 0);
    }

    private a() {
    }

    /* synthetic */ a(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, long j) {
        File[] listFiles = ad(context).listFiles(new FileFilter() { // from class: com.kwad.components.core.h.a.2
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                String name = file.getName();
                return name.startsWith("dynamic-") && name.endsWith(".apk");
            }
        });
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        long j2 = 0;
        for (File file : listFiles) {
            j2 = Math.max(j2, file.lastModified());
        }
        long min = Math.min(j, j2);
        for (File file2 : listFiles) {
            if (file2.exists() && file2.lastModified() < min) {
                file2.delete();
            }
        }
    }

    private static File ad(Context context) {
        return new File(context.getApplicationInfo().dataDir, "ksad_dynamic");
    }

    public static a oc() {
        return C0200a.KN;
    }

    public final void ac(final Context context) {
        final long currentTimeMillis = System.currentTimeMillis();
        g.schedule(new Runnable() { // from class: com.kwad.components.core.h.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.a(context, currentTimeMillis);
                } catch (Throwable th) {
                    c.printStackTraceOnly(th);
                }
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
