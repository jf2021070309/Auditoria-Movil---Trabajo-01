package com.amazon.aps.iva.a6;

import java.util.HashMap;
/* compiled from: PlaylistTimeline.java */
/* loaded from: classes.dex */
public final class n1 extends a {
    public final int k;
    public final int l;
    public final int[] m;
    public final int[] n;
    public final com.amazon.aps.iva.q5.r0[] o;
    public final Object[] p;
    public final HashMap<Object, Integer> q;

    public n1(com.amazon.aps.iva.q5.r0[] r0VarArr, Object[] objArr, com.amazon.aps.iva.o6.j0 j0Var) {
        super(j0Var);
        int length = r0VarArr.length;
        this.o = r0VarArr;
        this.m = new int[length];
        this.n = new int[length];
        this.p = objArr;
        this.q = new HashMap<>();
        int length2 = r0VarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            com.amazon.aps.iva.q5.r0 r0Var = r0VarArr[i];
            this.o[i4] = r0Var;
            this.n[i4] = i2;
            this.m[i4] = i3;
            i2 += r0Var.q();
            i3 += this.o[i4].j();
            this.q.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.k = i2;
        this.l = i3;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int j() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int q() {
        return this.k;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n1(java.util.List r7, com.amazon.aps.iva.o6.j0 r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.amazon.aps.iva.q5.r0[] r0 = new com.amazon.aps.iva.q5.r0[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.amazon.aps.iva.a6.z0 r4 = (com.amazon.aps.iva.a6.z0) r4
            int r5 = r3 + 1
            com.amazon.aps.iva.q5.r0 r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.amazon.aps.iva.a6.z0 r3 = (com.amazon.aps.iva.a6.z0) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.n1.<init>(java.util.List, com.amazon.aps.iva.o6.j0):void");
    }
}
