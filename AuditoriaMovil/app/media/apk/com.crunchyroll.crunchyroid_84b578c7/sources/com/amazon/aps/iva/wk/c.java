package com.amazon.aps.iva.wk;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve0.u0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.wk.a> {
    public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

    /* compiled from: Emitters.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.ve0.g {
        public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.controls.adstimeline.AdsTimelineDataProviderImpl$data$2$invoke$$inlined$map$1$2", f = "AdsTimelineDataProvider.kt", l = {223}, m = "emit")
        /* renamed from: com.amazon.aps.iva.wk.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0827a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;

            public C0827a(com.amazon.aps.iva.ob0.d dVar) {
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
        public final java.lang.Object a(java.lang.Object r11, com.amazon.aps.iva.ob0.d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.amazon.aps.iva.wk.c.a.C0827a
                if (r0 == 0) goto L13
                r0 = r12
                com.amazon.aps.iva.wk.c$a$a r0 = (com.amazon.aps.iva.wk.c.a.C0827a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.wk.c$a$a r0 = new com.amazon.aps.iva.wk.c$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r12)
                goto L61
            L27:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L2f:
                com.amazon.aps.iva.ab.x.i0(r12)
                com.amazon.aps.iva.nk.j r11 = (com.amazon.aps.iva.nk.j) r11
                com.amazon.aps.iva.wk.a r12 = new com.amazon.aps.iva.wk.a
                com.amazon.aps.iva.kk.c r2 = r11.h
                long r5 = r2.s
                com.amazon.aps.iva.nk.c r2 = r11.m
                com.amazon.aps.iva.nk.b r4 = r2.e
                boolean r4 = r4.isPlaying()
                if (r4 != 0) goto L4e
                com.amazon.aps.iva.nk.b r4 = r2.e
                com.amazon.aps.iva.nk.b r7 = com.amazon.aps.iva.nk.b.PAUSED
                if (r4 != r7) goto L4b
                goto L4e
            L4b:
                r7 = 0
                goto L50
            L4e:
                long r7 = r11.c
            L50:
                boolean r9 = r2.b
                r4 = r12
                r4.<init>(r5, r7, r9)
                r0.i = r3
                com.amazon.aps.iva.ve0.g r11 = r10.b
                java.lang.Object r11 = r11.a(r12, r0)
                if (r11 != r1) goto L61
                return r1
            L61:
                com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wk.c.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public c(u0 u0Var) {
        this.b = u0Var;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super com.amazon.aps.iva.wk.a> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return q.a;
    }
}
