package com.amazon.aps.iva.ll;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.ve0.a0;
/* compiled from: PlayerSettingsListViewModel.kt */
/* loaded from: classes2.dex */
public final class f extends f0 implements e {
    public final v<Boolean> b;
    public final v<Boolean> c;

    /* compiled from: PlayerSettingsListViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.settings.PlayerSettingsListViewModelImpl$1", f = "PlayerSettingsListViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ye.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ com.amazon.aps.iva.gj.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.gj.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.ye.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
            if (r4.b != false) goto L20;
         */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                com.amazon.aps.iva.ab.x.i0(r7)
                java.lang.Object r7 = r6.h
                com.amazon.aps.iva.ye.c r7 = (com.amazon.aps.iva.ye.c) r7
                com.amazon.aps.iva.ye.c r0 = com.amazon.aps.iva.ye.c.CONNECTING
                r1 = 0
                r2 = 1
                if (r7 == r0) goto L16
                com.amazon.aps.iva.ye.c r0 = com.amazon.aps.iva.ye.c.CONNECTED
                if (r7 != r0) goto L14
                goto L16
            L14:
                r7 = r1
                goto L17
            L16:
                r7 = r2
            L17:
                com.amazon.aps.iva.ll.f r0 = com.amazon.aps.iva.ll.f.this
                com.amazon.aps.iva.i5.v<java.lang.Boolean> r3 = r0.b
                if (r7 != 0) goto L2e
                com.amazon.aps.iva.gj.a r4 = r6.j
                if (r4 == 0) goto L27
                boolean r5 = r4.c
                if (r5 != r2) goto L27
                r5 = r2
                goto L28
            L27:
                r5 = r1
            L28:
                if (r5 == 0) goto L2f
                boolean r4 = r4.b
                if (r4 == 0) goto L2f
            L2e:
                r1 = r2
            L2f:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r3.k(r1)
                com.amazon.aps.iva.i5.v<java.lang.Boolean> r0 = r0.c
                r7 = r7 ^ r2
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r0.k(r7)
                com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ll.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(com.amazon.aps.iva.gj.a aVar, com.amazon.aps.iva.ye.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "castStateProvider");
        this.b = new v<>();
        this.c = new v<>();
        com.amazon.aps.iva.dg.b.A(w.D(this), new a0(fVar.getCastStateFlow(), new a(aVar, null)));
    }

    @Override // com.amazon.aps.iva.ll.e
    public final v B0() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ll.e
    public final v I3() {
        return this.c;
    }
}
