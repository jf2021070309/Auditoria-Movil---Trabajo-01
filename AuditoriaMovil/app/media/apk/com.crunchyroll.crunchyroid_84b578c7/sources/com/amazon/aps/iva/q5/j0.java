package com.amazon.aps.iva.q5;

import android.os.Bundle;
/* compiled from: PlaybackException.java */
/* loaded from: classes.dex */
public class j0 extends Exception implements k {
    public static final String d = com.amazon.aps.iva.t5.g0.L(0);
    public static final String e = com.amazon.aps.iva.t5.g0.L(1);
    public static final String f = com.amazon.aps.iva.t5.g0.L(2);
    public static final String g = com.amazon.aps.iva.t5.g0.L(3);
    public static final String h = com.amazon.aps.iva.t5.g0.L(4);
    public static final m i = new m(2);
    public final int b;
    public final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = com.amazon.aps.iva.q5.j0.f
            java.lang.String r2 = r8.getString(r0)
            java.lang.String r0 = com.amazon.aps.iva.q5.j0.g
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = com.amazon.aps.iva.q5.j0.h
            java.lang.String r1 = r8.getString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L51
            java.lang.Class<com.amazon.aps.iva.q5.j0> r3 = com.amazon.aps.iva.q5.j0.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L4a
            r5 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L42
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r3 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L4a
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L4a
        L42:
            if (r4 != 0) goto L51
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            goto L4f
        L4a:
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
        L4f:
            r3 = r0
            goto L52
        L51:
            r3 = r4
        L52:
            java.lang.String r0 = com.amazon.aps.iva.q5.j0.d
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r8.getInt(r0, r1)
            java.lang.String r0 = com.amazon.aps.iva.q5.j0.e
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r8.getLong(r0, r5)
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q5.j0.<init>(android.os.Bundle):void");
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.b);
        bundle.putLong(e, this.c);
        bundle.putString(f, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(g, cause.getClass().getName());
            bundle.putString(h, cause.getMessage());
        }
        return bundle;
    }

    public j0(String str, Throwable th, int i2, long j) {
        super(str, th);
        this.b = i2;
        this.c = j;
    }
}
