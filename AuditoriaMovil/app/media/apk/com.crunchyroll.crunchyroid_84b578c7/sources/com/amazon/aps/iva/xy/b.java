package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ve0.f<Object> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.FlowExtensionsKt$filterSuccess$$inlined$map$1$2", f = "FlowExtensions.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.xy.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0871a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0871a(com.amazon.aps.iva.ob0.d dVar) {
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
        public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.amazon.aps.iva.xy.b.a.C0871a
                if (r0 == 0) goto L13
                r0 = r6
                com.amazon.aps.iva.xy.b$a$a r0 = (com.amazon.aps.iva.xy.b.a.C0871a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.xy.b$a$a r0 = new com.amazon.aps.iva.xy.b$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r6)
                goto L48
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.amazon.aps.iva.ab.x.i0(r6)
                com.amazon.aps.iva.ez.g r5 = (com.amazon.aps.iva.ez.g) r5
                com.amazon.aps.iva.ez.g$c r5 = r5.a()
                com.amazon.aps.iva.yb0.j.c(r5)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r6 = r4.b
                T r5 = r5.a
                java.lang.Object r5 = r6.a(r5, r0)
                if (r5 != r1) goto L48
                return r1
            L48:
                com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xy.b.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public b(com.amazon.aps.iva.xy.a aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super Object> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
