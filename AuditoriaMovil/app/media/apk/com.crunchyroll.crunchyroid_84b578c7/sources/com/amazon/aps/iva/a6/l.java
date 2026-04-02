package com.amazon.aps.iva.a6;

import android.os.Bundle;
import com.amazon.aps.iva.o6.v;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: ExoPlaybackException.java */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.q5.j0 {
    public static final String q = com.amazon.aps.iva.t5.g0.L(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
    public static final String r = com.amazon.aps.iva.t5.g0.L(1002);
    public static final String s = com.amazon.aps.iva.t5.g0.L(1003);
    public static final String t = com.amazon.aps.iva.t5.g0.L(1004);
    public static final String u = com.amazon.aps.iva.t5.g0.L(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
    public static final String v = com.amazon.aps.iva.t5.g0.L(1006);
    public final int j;
    public final String k;
    public final int l;
    public final com.amazon.aps.iva.q5.v m;
    public final int n;
    public final com.amazon.aps.iva.q5.e0 o;
    public final boolean p;

    public l(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public final l a(v.b bVar) {
        return new l(getMessage(), getCause(), this.b, this.j, this.k, this.l, this.m, this.n, bVar, this.c, this.p);
    }

    @Override // com.amazon.aps.iva.q5.j0, com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(q, this.j);
        bundle.putString(r, this.k);
        bundle.putInt(s, this.l);
        com.amazon.aps.iva.q5.v vVar = this.m;
        if (vVar != null) {
            bundle.putBundle(t, vVar.e(false));
        }
        bundle.putInt(u, this.n);
        bundle.putBoolean(v, this.p);
        return bundle;
    }

    public l(String str, Throwable th, int i, int i2, String str2, int i3, com.amazon.aps.iva.q5.v vVar, int i4, v.b bVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        com.amazon.aps.iva.cq.b.t(!z || i2 == 1);
        com.amazon.aps.iva.cq.b.t((th != null || i2 == 3) ? true : z2);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = vVar;
        this.n = i4;
        this.o = bVar;
        this.p = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, com.amazon.aps.iva.q5.v r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L44
            r0 = 1
            if (r4 == r0) goto L15
            r0 = 3
            if (r4 == r0) goto Lc
            java.lang.String r0 = "Unexpected runtime error"
            goto Le
        Lc:
            java.lang.String r0 = "Remote error"
        Le:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L4c
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r7 = r19
            r0.append(r7)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = com.amazon.aps.iva.t5.g0.w(r20)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L4c
        L44:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L4c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L59
            java.lang.String r1 = ": null"
            java.lang.String r0 = com.amazon.aps.iva.c80.a.f(r0, r1)
        L59:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.l.<init>(int, java.lang.Throwable, int, java.lang.String, int, com.amazon.aps.iva.q5.v, int, boolean):void");
    }
}
