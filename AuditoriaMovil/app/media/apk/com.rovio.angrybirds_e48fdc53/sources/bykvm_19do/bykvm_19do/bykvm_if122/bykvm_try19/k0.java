package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.lang.Thread;
/* loaded from: classes.dex */
public class k0 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();
    private String b;

    private k0() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        b();
    }

    private void a() {
        try {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a();
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.Thread r18, java.lang.Throwable r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.k0.a(java.lang.Thread, java.lang.Throwable):void");
    }

    private void b() {
        File externalFilesDir;
        Context d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
        if (d == null) {
            return;
        }
        try {
            if ("mounted".equals(Environment.getExternalStorageState()) && (externalFilesDir = d.getExternalFilesDir("TTCache")) != null) {
                externalFilesDir.mkdirs();
                this.b = externalFilesDir.getPath();
            }
            if (TextUtils.isEmpty(this.b)) {
                File file = new File(d.getFilesDir(), "TTCache");
                file.mkdirs();
                this.b = file.getPath();
            }
        } catch (Throwable th) {
        }
    }

    public static k0 c() {
        return new k0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            r4.printStackTrace(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1b
            java.lang.String r1 = "com.bytedance.msdk"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L21
            r2.a(r3, r4)
        L21:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.a
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L2a
            r0.uncaughtException(r3, r4)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.k0.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
