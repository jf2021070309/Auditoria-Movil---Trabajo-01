package e.h.g;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import e.h.g.q0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class t0 {
    static {
        Float.valueOf(Build.VERSION.SDK);
        String str = File.separator;
    }

    public static boolean a(File file, boolean z) {
        x0 x0Var = x0.f8405d;
        if (q0.p(file)) {
            File[] r = q0.r(file);
            if (r != null) {
                for (File file2 : r) {
                    a(file2, z);
                }
            }
            if (!file.delete()) {
                return false;
            }
            if (z) {
                d(x0Var, file);
            }
        } else if (!file.delete()) {
            return false;
        } else {
            if (z) {
                d(x0Var, file);
            }
        }
        return true;
    }

    @TargetApi(9)
    public static synchronized OutputStream b(File file, int i2) throws IOException {
        BufferedOutputStream d2;
        synchronized (t0.class) {
            q0.b bVar = q0.f8373b;
            try {
                d2 = q0.d(file, i2);
            } catch (IllegalStateException | SecurityException unused) {
                r0 r0Var = new r0();
                System.nanoTime();
                j1.n(50, r0Var);
                d2 = q0.d(file, i2);
            }
        }
        return d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:28:0x00a4, B:30:0x00aa), top: B:36:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r7, boolean r8) {
        /*
            r0 = 0
            if (r7 == 0) goto Laf
            int r1 = r7.length()
            if (r1 <= 0) goto Laf
            r1 = 1
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> Lae
            r2.<init>(r7)     // Catch: java.lang.Exception -> Lae
            boolean r2 = r2.canWrite()     // Catch: java.lang.Exception -> Lae
            if (r2 == 0) goto Lae
            r2 = 0
            boolean r3 = e.h.g.v0.g()     // Catch: java.lang.Exception -> Lae
            if (r3 == 0) goto L47
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r3.<init>()     // Catch: java.lang.Exception -> Lae
            r3.append(r7)     // Catch: java.lang.Exception -> Lae
            java.lang.String r7 = java.io.File.separator     // Catch: java.lang.Exception -> Lae
            r3.append(r7)     // Catch: java.lang.Exception -> Lae
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> Lae
            r3.append(r4)     // Catch: java.lang.Exception -> Lae
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Exception -> Lae
            r2.<init>(r7)     // Catch: java.lang.Exception -> Lae
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> Lae
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> Lae
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Lae
            r7.<init>(r2, r3)     // Catch: java.lang.Exception -> Lae
            goto L65
        L47:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> Lae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lae
            r4.<init>()     // Catch: java.lang.Exception -> Lae
            r4.append(r7)     // Catch: java.lang.Exception -> Lae
            java.lang.String r7 = java.io.File.separator     // Catch: java.lang.Exception -> Lae
            r4.append(r7)     // Catch: java.lang.Exception -> Lae
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Exception -> Lae
            r4.append(r5)     // Catch: java.lang.Exception -> Lae
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> Lae
            r3.<init>(r7)     // Catch: java.lang.Exception -> Lae
            r7 = r3
        L65:
            if (r8 == 0) goto L72
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> Lae
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lae
            r4.<init>(r7)     // Catch: java.lang.Exception -> Lae
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lae
            goto L76
        L72:
            java.io.OutputStream r3 = b(r7, r0)     // Catch: java.lang.Exception -> Lae
        L76:
            java.lang.String r4 = "TEst"
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> Lae
            r3.write(r4)     // Catch: java.lang.Exception -> Lae
            r3.close()     // Catch: java.lang.Exception -> Lae
            boolean r3 = r7.exists()     // Catch: java.lang.Exception -> Lae
            if (r3 == 0) goto La3
            if (r8 == 0) goto L8f
            long r3 = r7.length()     // Catch: java.lang.Exception -> Lae
            goto L93
        L8f:
            long r3 = e.h.g.q0.q(r7)     // Catch: java.lang.Exception -> Lae
        L93:
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto La0
            boolean r7 = r7.delete()     // Catch: java.lang.Exception -> Lae
            if (r7 == 0) goto La3
            goto La4
        La0:
            r7.delete()     // Catch: java.lang.Exception -> Lae
        La3:
            r0 = 1
        La4:
            boolean r7 = r2.exists()     // Catch: java.lang.Exception -> Laf
            if (r7 == 0) goto Laf
            r2.delete()     // Catch: java.lang.Exception -> Laf
            goto Laf
        Lae:
            r0 = 1
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.g.t0.c(java.lang.String, boolean):boolean");
    }

    public static void d(Context context, File file) {
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file));
            intent.putExtra("from", "jrtstudio");
            context.sendBroadcast(intent);
        } catch (Exception e2) {
            s1.l(e2, true);
        }
    }
}
