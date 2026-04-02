package com.amazon.aps.iva.cj;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.FullyWatchedMonitor$special$$inlined$map$1$2", f = "FullyWatchedMonitor.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.cj.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0176a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0176a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar) {
            this.b = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r9, com.amazon.aps.iva.ob0.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.amazon.aps.iva.cj.f.a.C0176a
                if (r0 == 0) goto L13
                r0 = r10
                com.amazon.aps.iva.cj.f$a$a r0 = (com.amazon.aps.iva.cj.f.a.C0176a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.cj.f$a$a r0 = new com.amazon.aps.iva.cj.f$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r10)
                goto L5f
            L27:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L2f:
                com.amazon.aps.iva.ab.x.i0(r10)
                com.amazon.aps.iva.nk.j r9 = (com.amazon.aps.iva.nk.j) r9
                com.amazon.aps.iva.kk.c r10 = r9.h
                java.lang.String r2 = r10.a
                long r4 = r10.s
                long r9 = r9.c
                double r9 = (double) r9
                double r4 = (double) r4
                r6 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
                double r4 = r4 * r6
                int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r9 <= 0) goto L4a
                r9 = r3
                goto L4b
            L4a:
                r9 = 0
            L4b:
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                com.amazon.aps.iva.kb0.j r10 = new com.amazon.aps.iva.kb0.j
                r10.<init>(r2, r9)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r9 = r8.b
                java.lang.Object r9 = r9.a(r10, r0)
                if (r9 != r1) goto L5f
                return r1
            L5f:
                com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cj.f.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public f(e eVar) {
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
