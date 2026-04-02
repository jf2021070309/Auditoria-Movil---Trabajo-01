package com.amazon.aps.iva.am;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SelectedProfileDiskSource.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final com.amazon.aps.iva.si.a<com.amazon.aps.iva.am.a> a;

    /* compiled from: SelectedProfileDiskSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.sources.SelectedProfileDiskSourceImpl", f = "SelectedProfileDiskSource.kt", l = {31}, m = "get")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return h.this.a(this);
        }
    }

    public h(com.amazon.aps.iva.si.a<com.amazon.aps.iva.am.a> aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[ORIG_RETURN, RETURN] */
    @Override // com.amazon.aps.iva.am.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.em.a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.am.h.a
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.am.h$a r0 = (com.amazon.aps.iva.am.h.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.am.h$a r0 = new com.amazon.aps.iva.am.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L3d
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            com.amazon.aps.iva.ab.x.i0(r10)
            r0.j = r3
            com.amazon.aps.iva.si.a<com.amazon.aps.iva.am.a> r10 = r9.a
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L3d
            return r1
        L3d:
            com.amazon.aps.iva.am.a r10 = (com.amazon.aps.iva.am.a) r10
            if (r10 == 0) goto L5f
            com.amazon.aps.iva.em.a r8 = new com.amazon.aps.iva.em.a
            java.lang.String r1 = r10.c()
            java.lang.String r2 = r10.d()
            java.lang.String r3 = r10.e()
            java.lang.String r4 = r10.a()
            java.lang.String r5 = r10.b()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r0 = r8
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L60
        L5f:
            r8 = 0
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.am.h.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.am.g
    public final Object b(com.amazon.aps.iva.em.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object a2 = this.a.a(new com.amazon.aps.iva.am.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e), dVar);
        if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return q.a;
    }
}
