package com.amazon.aps.iva.sl;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ve0.f<g> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.quality.QualitiesProviderImpl$special$$inlined$map$2$2", f = "QualitiesProvider.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.sl.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0712a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0712a(com.amazon.aps.iva.ob0.d dVar) {
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
        public final java.lang.Object a(java.lang.Object r7, com.amazon.aps.iva.ob0.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.amazon.aps.iva.sl.c.a.C0712a
                if (r0 == 0) goto L13
                r0 = r8
                com.amazon.aps.iva.sl.c$a$a r0 = (com.amazon.aps.iva.sl.c.a.C0712a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.sl.c$a$a r0 = new com.amazon.aps.iva.sl.c$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r8)
                goto L52
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                com.amazon.aps.iva.ab.x.i0(r8)
                com.amazon.aps.iva.ik.f r7 = (com.amazon.aps.iva.ik.f) r7
                com.amazon.aps.iva.sl.g r8 = new com.amazon.aps.iva.sl.g
                boolean r2 = r7 instanceof com.amazon.aps.iva.ik.a
                int r4 = r7.c()
                int r5 = r7.b()
                int r7 = r7.a()
                r8.<init>(r4, r5, r7, r2)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r7 = r6.b
                java.lang.Object r7 = r7.a(r8, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sl.c.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public c(com.amazon.aps.iva.ve0.f fVar) {
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super g> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
