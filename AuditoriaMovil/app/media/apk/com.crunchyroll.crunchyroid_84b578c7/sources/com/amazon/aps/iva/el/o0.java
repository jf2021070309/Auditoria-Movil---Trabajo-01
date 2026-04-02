package com.amazon.aps.iva.el;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class o0 implements com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.cl.g> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.playerview.PlayerViewViewModelImpl$special$$inlined$mapNotNull$1$2", f = "PlayerViewViewModel.kt", l = {225}, m = "emit")
        /* renamed from: com.amazon.aps.iva.el.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0226a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0226a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar, com.amazon.aps.iva.xb0.a aVar) {
            this.b = gVar;
            this.c = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.amazon.aps.iva.el.o0.a.C0226a
                if (r0 == 0) goto L13
                r0 = r6
                com.amazon.aps.iva.el.o0$a$a r0 = (com.amazon.aps.iva.el.o0.a.C0226a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.el.o0$a$a r0 = new com.amazon.aps.iva.el.o0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r6)
                goto L51
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.amazon.aps.iva.ab.x.i0(r6)
                com.amazon.aps.iva.kj.e r5 = (com.amazon.aps.iva.kj.e) r5
                com.amazon.aps.iva.xb0.a r6 = r4.c
                java.lang.Object r6 = r6.invoke()
                com.amazon.aps.iva.cl.f r6 = (com.amazon.aps.iva.cl.f) r6
                if (r6 == 0) goto L43
                com.amazon.aps.iva.cl.g r5 = r6.a(r5)
                goto L44
            L43:
                r5 = 0
            L44:
                if (r5 == 0) goto L51
                r0.i = r3
                com.amazon.aps.iva.ve0.g r6 = r4.b
                java.lang.Object r5 = r6.a(r5, r0)
                if (r5 != r1) goto L51
                return r1
            L51:
                com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.el.o0.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public o0(com.amazon.aps.iva.ve0.f fVar, z zVar) {
        this.b = fVar;
        this.c = zVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.cl.g> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar, this.c), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
