package com.amazon.aps.iva.fj;
/* compiled from: Emitters.kt */
/* loaded from: classes.dex */
public final class b<T> implements com.amazon.aps.iva.ve0.g {
    public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
    public final /* synthetic */ f c;

    /* compiled from: Emitters.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.component.PlayerComponent$filterAndProcessEvent$$inlined$filter$1$2", f = "PlayerComponent.kt", l = {224}, m = "emit")
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
            return b.this.a(null, this);
        }
    }

    public b(com.amazon.aps.iva.ve0.g gVar, f fVar) {
        this.b = gVar;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.ve0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.fj.b.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.fj.b$a r0 = (com.amazon.aps.iva.fj.b.a) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            com.amazon.aps.iva.fj.b$a r0 = new com.amazon.aps.iva.fj.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L7e
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            com.amazon.aps.iva.ab.x.i0(r9)
            r9 = r8
            com.amazon.aps.iva.pj.a r9 = (com.amazon.aps.iva.pj.a) r9
            com.amazon.aps.iva.fj.f r2 = r7.c
            java.util.List r2 = r2.f()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            r5 = 0
            if (r4 == 0) goto L4c
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L4c
            goto L71
        L4c:
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r2.next()
            com.amazon.aps.iva.fc0.d r4 = (com.amazon.aps.iva.fc0.d) r4
            com.amazon.aps.iva.pj.c r6 = com.amazon.aps.iva.pj.c.a
            boolean r6 = r4.f(r6)
            if (r6 != 0) goto L6d
            boolean r4 = r4.f(r9)
            if (r4 == 0) goto L6b
            goto L6d
        L6b:
            r4 = r5
            goto L6e
        L6d:
            r4 = r3
        L6e:
            if (r4 == 0) goto L50
            r5 = r3
        L71:
            if (r5 == 0) goto L7e
            r0.i = r3
            com.amazon.aps.iva.ve0.g r9 = r7.b
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fj.b.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
