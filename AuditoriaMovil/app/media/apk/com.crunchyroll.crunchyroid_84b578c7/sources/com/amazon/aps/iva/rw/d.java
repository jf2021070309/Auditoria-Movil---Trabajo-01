package com.amazon.aps.iva.rw;

import com.amazon.aps.iva.sv.v1;
import com.amazon.aps.iva.sv.z1;
/* compiled from: SyncQualityReader.kt */
/* loaded from: classes2.dex */
public final class d implements c {
    public final z1 a;
    public final com.amazon.aps.iva.wg.a b;

    /* compiled from: SyncQualityReader.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.syncquality.SyncQualityReaderImpl", f = "SyncQualityReader.kt", l = {26}, m = "readSyncQuality")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public d h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return d.this.a(null, this);
        }
    }

    public d(v1 v1Var, e eVar) {
        this.a = v1Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.rw.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wg.b> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.rw.d.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.rw.d$a r0 = (com.amazon.aps.iva.rw.d.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.rw.d$a r0 = new com.amazon.aps.iva.rw.d$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.rw.d r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r4
            r0.k = r3
            com.amazon.aps.iva.sv.z1 r6 = r4.a
            java.lang.Object r6 = r6.q(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            com.amazon.aps.iva.wg.b r6 = (com.amazon.aps.iva.wg.b) r6
            if (r6 != 0) goto L4c
            com.amazon.aps.iva.wg.a r5 = r5.b
            com.amazon.aps.iva.wg.b r6 = r5.J()
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rw.d.a(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
