package e.d.d.m.j.k;

import android.util.Log;
import e.d.d.m.j.j.l;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
/* loaded from: classes2.dex */
public class g implements e.d.d.m.j.k.a {
    public static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public final File f7251b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7252c;

    /* renamed from: d  reason: collision with root package name */
    public e f7253d;

    /* loaded from: classes2.dex */
    public static class a {
        public final byte[] a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7254b;

        public a(byte[] bArr, int i2) {
            this.a = bArr;
            this.f7254b = i2;
        }
    }

    public g(File file, int i2) {
        this.f7251b = file;
        this.f7252c = i2;
    }

    @Override // e.d.d.m.j.k.a
    public void a() {
        l.a(this.f7253d, "There was a problem closing the Crashlytics log file.");
        this.f7253d = null;
    }

    @Override // e.d.d.m.j.k.a
    public String b() {
        byte[] d2 = d();
        if (d2 != null) {
            return new String(d2, a);
        }
        return null;
    }

    @Override // e.d.d.m.j.k.a
    public void c(long j2, String str) {
        int i2;
        e();
        if (this.f7253d == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f7252c / 4) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.f7253d.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(a));
            while (!this.f7253d.r() && this.f7253d.H() > this.f7252c) {
                this.f7253d.y();
            }
        } catch (IOException e2) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] d() {
        /*
            r7 = this;
            java.io.File r0 = r7.f7251b
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L42
        Lc:
            r7.e()
            e.d.d.m.j.k.e r0 = r7.f7253d
            if (r0 != 0) goto L14
            goto La
        L14:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.H()
            byte[] r0 = new byte[r0]
            e.d.d.m.j.k.e r4 = r7.f7253d     // Catch: java.io.IOException -> L2a
            e.d.d.m.j.k.f r5 = new e.d.d.m.j.k.f     // Catch: java.io.IOException -> L2a
            r5.<init>(r7, r0, r3)     // Catch: java.io.IOException -> L2a
            r4.m(r5)     // Catch: java.io.IOException -> L2a
            goto L3b
        L2a:
            r4 = move-exception
            e.d.d.m.j.f r5 = e.d.d.m.j.f.a
            r6 = 6
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L3b
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L3b:
            e.d.d.m.j.k.g$a r4 = new e.d.d.m.j.k.g$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L42:
            if (r4 != 0) goto L45
            return r1
        L45:
            int r0 = r4.f7254b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.m.j.k.g.d():byte[]");
    }

    public final void e() {
        if (this.f7253d == null) {
            try {
                this.f7253d = new e(this.f7251b);
            } catch (IOException e2) {
                e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
                StringBuilder y = e.a.d.a.a.y("Could not open log file: ");
                y.append(this.f7251b);
                fVar.c(y.toString(), e2);
            }
        }
    }
}
