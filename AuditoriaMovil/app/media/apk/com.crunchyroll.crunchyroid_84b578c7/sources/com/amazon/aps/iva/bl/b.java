package com.amazon.aps.iva.bl;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve0.u0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ve0.f<h> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineDataProviderImpl$data$2$invoke$$inlined$map$1$2", f = "PlayerTimelineDataProvider.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.bl.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0144a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0144a(com.amazon.aps.iva.ob0.d dVar) {
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
        public final java.lang.Object a(java.lang.Object r13, com.amazon.aps.iva.ob0.d r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof com.amazon.aps.iva.bl.b.a.C0144a
                if (r0 == 0) goto L13
                r0 = r14
                com.amazon.aps.iva.bl.b$a$a r0 = (com.amazon.aps.iva.bl.b.a.C0144a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.bl.b$a$a r0 = new com.amazon.aps.iva.bl.b$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r14)
                goto L53
            L27:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L2f:
                com.amazon.aps.iva.ab.x.i0(r14)
                com.amazon.aps.iva.nk.j r13 = (com.amazon.aps.iva.nk.j) r13
                com.amazon.aps.iva.bl.h r14 = new com.amazon.aps.iva.bl.h
                com.amazon.aps.iva.kk.c r2 = r13.h
                long r5 = r2.s
                long r7 = r13.f
                float r9 = r13.e
                com.amazon.aps.iva.nk.c r13 = r13.m
                boolean r10 = r13.b
                java.util.List<java.lang.Long> r11 = r13.d
                r4 = r14
                r4.<init>(r5, r7, r9, r10, r11)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r13 = r12.b
                java.lang.Object r13 = r13.a(r14, r0)
                if (r13 != r1) goto L53
                return r1
            L53:
                com.amazon.aps.iva.kb0.q r13 = com.amazon.aps.iva.kb0.q.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bl.b.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public b(u0 u0Var) {
        this.b = u0Var;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super h> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
