package com.amazon.aps.iva.po;

import com.amazon.aps.iva.kj.c;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
/* compiled from: PlayerStreamsInteractor.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final com.amazon.aps.iva.bp.d a;
    public final com.amazon.aps.iva.at.a b;
    public final b c;
    public final com.amazon.aps.iva.aj.a d;

    /* compiled from: PlayerStreamsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.player.streams.PlayerStreamsInteractorImpl", f = "PlayerStreamsInteractor.kt", l = {57}, m = "getPlaybackStreams")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public f h;
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
            return f.this.b(null, false, this);
        }
    }

    public f(com.amazon.aps.iva.bp.d dVar, com.amazon.aps.iva.at.a aVar, b bVar, com.amazon.aps.iva.aj.a aVar2) {
        this.a = dVar;
        this.b = aVar;
        this.c = bVar;
        this.d = aVar2;
    }

    @Override // com.amazon.aps.iva.po.e
    public final Object a(PlayableAsset playableAsset, boolean z, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kj.c> dVar) {
        String str;
        ExtendedMaturityRating extendedMaturityRating = playableAsset.getExtendedMaturityRating();
        if (extendedMaturityRating != null) {
            str = extendedMaturityRating.getRating();
        } else {
            str = null;
        }
        if (this.d.b(str)) {
            return new c.b(playableAsset.getId(), null, null, null, null, null, null, null, 894);
        }
        if (j.a(this.b.a(playableAsset), "available")) {
            return b(playableAsset, z, dVar);
        }
        return new c.b(playableAsset.getId(), null, null, null, null, null, null, null, 894);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.ellation.crunchyroll.model.PlayableAsset r11, boolean r12, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kj.c> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.amazon.aps.iva.po.f.a
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.po.f$a r0 = (com.amazon.aps.iva.po.f.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.po.f$a r0 = new com.amazon.aps.iva.po.f$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.ellation.crunchyroll.model.PlayableAsset r11 = r0.i
            com.amazon.aps.iva.po.f r12 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)     // Catch: java.io.IOException -> L60
            goto L4b
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            com.amazon.aps.iva.ab.x.i0(r13)
            com.amazon.aps.iva.bp.d r13 = r10.a     // Catch: java.io.IOException -> L60
            if (r12 == 0) goto L3c
            r12 = r3
            goto L3d
        L3c:
            r12 = 0
        L3d:
            r0.h = r10     // Catch: java.io.IOException -> L60
            r0.i = r11     // Catch: java.io.IOException -> L60
            r0.l = r3     // Catch: java.io.IOException -> L60
            java.lang.Object r13 = r13.x1(r11, r12, r0)     // Catch: java.io.IOException -> L60
            if (r13 != r1) goto L4a
            return r1
        L4a:
            r12 = r10
        L4b:
            com.amazon.aps.iva.kb0.j r13 = (com.amazon.aps.iva.kb0.j) r13     // Catch: java.io.IOException -> L60
            com.amazon.aps.iva.po.b r12 = r12.c     // Catch: java.io.IOException -> L60
            java.lang.String r0 = r11.getId()     // Catch: java.io.IOException -> L60
            A r1 = r13.b     // Catch: java.io.IOException -> L60
            com.ellation.crunchyroll.api.cms.model.streams.Streams r1 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r1     // Catch: java.io.IOException -> L60
            B r13 = r13.c     // Catch: java.io.IOException -> L60
            com.amazon.aps.iva.fg.d r13 = (com.amazon.aps.iva.fg.d) r13     // Catch: java.io.IOException -> L60
            com.amazon.aps.iva.kj.c r11 = r12.a(r0, r1, r13)     // Catch: java.io.IOException -> L60
            goto L75
        L60:
            r12 = move-exception
            r7 = r12
            com.amazon.aps.iva.kj.c$b r12 = new com.amazon.aps.iva.kj.c$b
            java.lang.String r1 = r11.getId()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 766(0x2fe, float:1.073E-42)
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = r12
        L75:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.po.f.b(com.ellation.crunchyroll.model.PlayableAsset, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
