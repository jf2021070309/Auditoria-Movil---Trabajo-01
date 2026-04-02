package com.amazon.aps.iva.ve0;

import com.amazon.aps.iva.oy.g;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class l implements f<Object> {
    public final /* synthetic */ f b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q c;

    /* compiled from: SafeCollector.common.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int i;
        public l k;
        public g l;

        public a(com.amazon.aps.iva.ob0.d dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return l.this.c(null, this);
        }
    }

    public l(f fVar, g.a aVar) {
        this.b = fVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // com.amazon.aps.iva.ve0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.ve0.g<? super java.lang.Object> r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.ve0.l.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.ve0.l$a r0 = (com.amazon.aps.iva.ve0.l.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.l$a r0 = new com.amazon.aps.iva.ve0.l$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.ve0.g r6 = r0.l
            com.amazon.aps.iva.ve0.l r2 = r0.k
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4d
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.k = r5
            r0.l = r6
            r0.i = r4
            com.amazon.aps.iva.ve0.f r7 = r5.b
            java.io.Serializable r7 = com.amazon.aps.iva.dg.b.k(r0, r7, r6)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L61
            com.amazon.aps.iva.xb0.q r2 = r2.c
            r4 = 0
            r0.k = r4
            r0.l = r4
            r0.i = r3
            java.lang.Object r6 = r2.invoke(r6, r7, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.l.c(com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
