package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ni.s;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.ez.g<Object>> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l c;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l d;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l e;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l c;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l d;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l e;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.FlowExtensionsKt$mapResource$$inlined$map$1$2", f = "FlowExtensions.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.xy.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0872a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0872a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(com.amazon.aps.iva.ve0.g gVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2, com.amazon.aps.iva.xb0.l lVar3) {
            this.b = gVar;
            this.c = lVar;
            this.d = lVar2;
            this.e = lVar3;
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
                boolean r0 = r7 instanceof com.amazon.aps.iva.xy.c.a.C0872a
                if (r0 == 0) goto L13
                r0 = r7
                com.amazon.aps.iva.xy.c$a$a r0 = (com.amazon.aps.iva.xy.c.a.C0872a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.xy.c$a$a r0 = new com.amazon.aps.iva.xy.c$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r7)
                goto L7d
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                com.amazon.aps.iva.ab.x.i0(r7)
                com.amazon.aps.iva.ez.g r6 = (com.amazon.aps.iva.ez.g) r6
                boolean r7 = r6 instanceof com.amazon.aps.iva.ez.g.b
                if (r7 == 0) goto L48
                com.amazon.aps.iva.ez.g$b r7 = new com.amazon.aps.iva.ez.g$b
                com.amazon.aps.iva.ez.g$b r6 = (com.amazon.aps.iva.ez.g.b) r6
                T r6 = r6.a
                com.amazon.aps.iva.xb0.l r2 = r5.c
                java.lang.Object r6 = r2.invoke(r6)
                r7.<init>(r6)
                goto L72
            L48:
                boolean r7 = r6 instanceof com.amazon.aps.iva.ez.g.a
                if (r7 == 0) goto L5e
                com.amazon.aps.iva.ez.g$a r7 = new com.amazon.aps.iva.ez.g$a
                com.amazon.aps.iva.ez.g$a r6 = (com.amazon.aps.iva.ez.g.a) r6
                java.lang.Throwable r2 = r6.a
                T r6 = r6.b
                com.amazon.aps.iva.xb0.l r4 = r5.d
                java.lang.Object r6 = r4.invoke(r6)
                r7.<init>(r6, r2)
                goto L72
            L5e:
                boolean r7 = r6 instanceof com.amazon.aps.iva.ez.g.c
                if (r7 == 0) goto L80
                com.amazon.aps.iva.ez.g$c r7 = new com.amazon.aps.iva.ez.g$c
                com.amazon.aps.iva.ez.g$c r6 = (com.amazon.aps.iva.ez.g.c) r6
                T r6 = r6.a
                com.amazon.aps.iva.xb0.l r2 = r5.e
                java.lang.Object r6 = r2.invoke(r6)
                r2 = 0
                r7.<init>(r6, r2)
            L72:
                r0.i = r3
                com.amazon.aps.iva.ve0.g r6 = r5.b
                java.lang.Object r6 = r6.a(r7, r0)
                if (r6 != r1) goto L7d
                return r1
            L7d:
                com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
                return r6
            L80:
                com.amazon.aps.iva.kb0.h r6 = new com.amazon.aps.iva.kb0.h
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xy.c.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public c(com.amazon.aps.iva.az.d dVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2, s sVar) {
        this.b = dVar;
        this.c = lVar;
        this.d = lVar2;
        this.e = sVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.ez.g<Object>> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar, this.c, this.d, this.e), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
