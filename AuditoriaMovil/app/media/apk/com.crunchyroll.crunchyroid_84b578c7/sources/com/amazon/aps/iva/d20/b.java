package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureContentInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.d20.a {
    public final j b;
    public final EtpContentService c;
    public final g0 d;

    /* compiled from: MatureContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.mature.MatureContentInteractorImpl", f = "MatureContentInteractor.kt", l = {39, 41}, m = "enableMatureContent")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public PlayableAsset i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.enableMatureContent(null, this);
        }
    }

    public b(k kVar, EtpContentService etpContentService, g0 g0Var) {
        this.b = kVar;
        this.c = etpContentService;
        this.d = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.d20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object enableMatureContent(com.ellation.crunchyroll.model.PlayableAsset r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.PlayableAsset> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.d20.b.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.d20.b$a r0 = (com.amazon.aps.iva.d20.b.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.d20.b$a r0 = new com.amazon.aps.iva.d20.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.ellation.crunchyroll.model.PlayableAsset r6 = r0.i
            com.amazon.aps.iva.d20.b r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L53
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.d20.j r7 = r5.b
            boolean r2 = r7.F0()
            if (r2 != 0) goto L52
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = r7.s0(r4, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            r7 = 0
            if (r6 == 0) goto L6f
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r2.c
            java.lang.String r4 = r6.getId()
            com.amazon.aps.iva.x50.t r6 = r6.getParentType()
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r7 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.loadAsset(r2, r4, r6, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            com.ellation.crunchyroll.model.PlayableAsset r7 = (com.ellation.crunchyroll.model.PlayableAsset) r7
        L6f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d20.b.enableMatureContent(com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.d20.a
    public final void k0(PlayableAsset playableAsset, e eVar, f fVar, g gVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        boolean F0 = this.b.F0();
        g0 g0Var = this.d;
        if (F0) {
            com.amazon.aps.iva.se0.i.d(g0Var, null, null, new c(gVar, this, playableAsset, eVar, null), 3);
        } else {
            com.amazon.aps.iva.se0.i.d(g0Var, null, null, new d(gVar, this, playableAsset, fVar, null), 3);
        }
    }
}
