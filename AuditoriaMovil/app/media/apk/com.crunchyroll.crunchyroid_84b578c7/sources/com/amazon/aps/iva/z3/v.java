package com.amazon.aps.iva.z3;
/* compiled from: Collect.kt */
/* loaded from: classes.dex */
public final class v implements com.amazon.aps.iva.ve0.g<b0<Object>> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

    @com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int i;

        public a(com.amazon.aps.iva.ob0.d dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return v.this.a(null, this);
        }
    }

    public v(com.amazon.aps.iva.ve0.g gVar) {
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.ve0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.z3.b0<java.lang.Object> r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.z3.v.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.z3.v$a r0 = (com.amazon.aps.iva.z3.v.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.amazon.aps.iva.z3.v$a r0 = new com.amazon.aps.iva.z3.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.z3.b0 r5 = (com.amazon.aps.iva.z3.b0) r5
            boolean r6 = r5 instanceof com.amazon.aps.iva.z3.l
            if (r6 != 0) goto L6d
            boolean r6 = r5 instanceof com.amazon.aps.iva.z3.j
            if (r6 != 0) goto L68
            boolean r6 = r5 instanceof com.amazon.aps.iva.z3.c
            if (r6 == 0) goto L52
            com.amazon.aps.iva.z3.c r5 = (com.amazon.aps.iva.z3.c) r5
            T r5 = r5.a
            r0.i = r3
            com.amazon.aps.iva.ve0.g r6 = r4.b
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L52:
            boolean r5 = r5 instanceof com.amazon.aps.iva.z3.c0
            if (r5 == 0) goto L62
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L62:
            com.amazon.aps.iva.kb0.h r5 = new com.amazon.aps.iva.kb0.h
            r5.<init>()
            throw r5
        L68:
            com.amazon.aps.iva.z3.j r5 = (com.amazon.aps.iva.z3.j) r5
            java.lang.Throwable r5 = r5.a
            throw r5
        L6d:
            com.amazon.aps.iva.z3.l r5 = (com.amazon.aps.iva.z3.l) r5
            java.lang.Throwable r5 = r5.a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z3.v.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
