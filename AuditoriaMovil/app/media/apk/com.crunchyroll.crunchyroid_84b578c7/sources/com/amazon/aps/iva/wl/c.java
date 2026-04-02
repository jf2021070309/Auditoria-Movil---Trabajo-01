package com.amazon.aps.iva.wl;

import java.util.List;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ve0.f<List<? extends com.amazon.aps.iva.jh.f>> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
    public final /* synthetic */ d c;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
        public final /* synthetic */ d c;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.subtitles.PlayerSubtitlesProvider$special$$inlined$map$3$2", f = "PlayerSubtitlesProvider.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.wl.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0831a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0831a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar, d dVar) {
            this.b = gVar;
            this.c = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r6, com.amazon.aps.iva.ob0.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.amazon.aps.iva.wl.c.a.C0831a
                if (r0 == 0) goto L13
                r0 = r7
                com.amazon.aps.iva.wl.c$a$a r0 = (com.amazon.aps.iva.wl.c.a.C0831a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.wl.c$a$a r0 = new com.amazon.aps.iva.wl.c$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r7)
                goto L6d
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                com.amazon.aps.iva.ab.x.i0(r7)
                com.amazon.aps.iva.wl.i r6 = (com.amazon.aps.iva.wl.i) r6
                com.amazon.aps.iva.wl.d r7 = r5.c
                com.amazon.aps.iva.lh.a r2 = r7.a
                java.util.List<com.amazon.aps.iva.qj.h> r4 = r6.a
                java.util.ArrayList r4 = com.amazon.aps.iva.wl.d.a(r7, r4)
                java.util.ArrayList r2 = r2.c(r4)
                java.util.ArrayList r2 = com.amazon.aps.iva.lb0.x.Z0(r2)
                java.util.List<com.amazon.aps.iva.qj.h> r6 = r6.b
                java.util.ArrayList r6 = com.amazon.aps.iva.wl.d.a(r7, r6)
                com.amazon.aps.iva.lh.a r7 = r7.a
                java.util.ArrayList r6 = r7.c(r6)
                java.util.ArrayList r6 = com.amazon.aps.iva.lb0.x.L0(r2, r6)
                com.amazon.aps.iva.jh.d r7 = com.amazon.aps.iva.jh.d.c
                java.util.List r7 = com.amazon.aps.iva.ee0.f1.J(r7)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r6 = com.amazon.aps.iva.lb0.x.L0(r7, r6)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r7 = r5.b
                java.lang.Object r6 = r7.a(r6, r0)
                if (r6 != r1) goto L6d
                return r1
            L6d:
                com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wl.c.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public c(com.amazon.aps.iva.ve0.f fVar, d dVar) {
        this.b = fVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super List<? extends com.amazon.aps.iva.jh.f>> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar, this.c), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
