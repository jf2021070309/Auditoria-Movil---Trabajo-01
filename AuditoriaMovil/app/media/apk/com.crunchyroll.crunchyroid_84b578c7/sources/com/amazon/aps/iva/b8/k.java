package com.amazon.aps.iva.b8;

import android.os.SystemClock;
/* compiled from: LibraryResult.java */
/* loaded from: classes.dex */
public final class k<V> implements com.amazon.aps.iva.q5.k {
    public static final String g = com.amazon.aps.iva.t5.g0.L(0);
    public static final String h = com.amazon.aps.iva.t5.g0.L(1);
    public static final String i = com.amazon.aps.iva.t5.g0.L(2);
    public static final String j = com.amazon.aps.iva.t5.g0.L(3);
    public static final String k = com.amazon.aps.iva.t5.g0.L(4);
    public final int b;
    public final long c;
    public final V d;
    public final int e;
    public final l f;

    public k(int i2, long j2, l lVar, V v, int i3) {
        this.b = i2;
        this.c = j2;
        this.f = lVar;
        this.d = v;
        this.e = i3;
    }

    public static k a(int i2) {
        boolean z;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        return new k(i2, SystemClock.elapsedRealtime(), null, null, 4);
    }

    public static void b(com.amazon.aps.iva.q5.b0 b0Var) {
        boolean z;
        com.amazon.aps.iva.cq.b.y(b0Var.b, "mediaId must not be empty");
        com.amazon.aps.iva.q5.d0 d0Var = b0Var.e;
        boolean z2 = true;
        if (d0Var.q != null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.v(z, "mediaMetadata must specify isBrowsable");
        if (d0Var.r == null) {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.v(z2, "mediaMetadata must specify isPlayable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r2 != 4) goto L16;
     */
    @Override // com.amazon.aps.iva.q5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle toBundle() {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.amazon.aps.iva.b8.k.g
            int r2 = r7.b
            r0.putInt(r1, r2)
            java.lang.String r1 = com.amazon.aps.iva.b8.k.h
            long r2 = r7.c
            r0.putLong(r1, r2)
            com.amazon.aps.iva.b8.l r1 = r7.f
            if (r1 == 0) goto L20
            android.os.Bundle r1 = r1.toBundle()
            java.lang.String r2 = com.amazon.aps.iva.b8.k.i
            r0.putBundle(r2, r1)
        L20:
            java.lang.String r1 = com.amazon.aps.iva.b8.k.k
            int r2 = r7.e
            r0.putInt(r1, r2)
            V r1 = r7.d
            if (r1 != 0) goto L2c
            return r0
        L2c:
            r3 = 1
            if (r2 == r3) goto L6f
            r3 = 2
            java.lang.String r4 = com.amazon.aps.iva.b8.k.j
            if (r2 == r3) goto L65
            r3 = 3
            if (r2 == r3) goto L3b
            r1 = 4
            if (r2 == r1) goto L6f
            goto L6e
        L3b:
            com.amazon.aps.iva.q5.j r2 = new com.amazon.aps.iva.q5.j
            com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1
            com.google.common.collect.ImmutableList$Builder r3 = com.google.common.collect.ImmutableList.builder()
            r5 = 0
        L44:
            int r6 = r1.size()
            if (r5 >= r6) goto L5a
            java.lang.Object r6 = r1.get(r5)
            com.amazon.aps.iva.q5.k r6 = (com.amazon.aps.iva.q5.k) r6
            android.os.Bundle r6 = r6.toBundle()
            r3.add(r6)
            int r5 = r5 + 1
            goto L44
        L5a:
            com.google.common.collect.ImmutableList r1 = r3.build()
            r2.<init>(r1)
            com.amazon.aps.iva.k3.d.b(r0, r4, r2)
            goto L6e
        L65:
            com.amazon.aps.iva.q5.b0 r1 = (com.amazon.aps.iva.q5.b0) r1
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r4, r1)
        L6e:
            return r0
        L6f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b8.k.toBundle():android.os.Bundle");
    }
}
