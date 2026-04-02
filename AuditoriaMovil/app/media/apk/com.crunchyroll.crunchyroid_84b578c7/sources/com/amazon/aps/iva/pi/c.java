package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.kj.c;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: MusicPlayerStreamsInteractor.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public final com.amazon.aps.iva.mi.a a;
    public final com.amazon.aps.iva.at.d b;
    public final com.amazon.aps.iva.aj.a c;

    /* compiled from: MusicPlayerStreamsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.watch.screen.player.MusicPlayerStreamsInteractorImpl", f = "MusicPlayerStreamsInteractor.kt", l = {46}, m = "getPlayerStreamsData")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public MusicAsset h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return c.this.b(null, false, this);
        }
    }

    public c(com.amazon.aps.iva.mi.c cVar, com.amazon.aps.iva.at.f fVar, com.amazon.aps.iva.aj.a aVar) {
        this.a = cVar;
        this.b = fVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.pi.b
    public final Object a(MusicAsset musicAsset, boolean z, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kj.c> dVar) {
        if (this.c.b(musicAsset.getId())) {
            return new c.b(musicAsset.getId(), null, null, null, null, null, null, null, 894);
        }
        if (com.amazon.aps.iva.yb0.j.a(this.b.b(musicAsset), "available")) {
            return b(musicAsset, z, dVar);
        }
        return new c.b(musicAsset.getId(), null, null, null, null, null, null, null, 894);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.ellation.crunchyroll.model.music.MusicAsset r11, boolean r12, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kj.c> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.amazon.aps.iva.pi.c.a
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.pi.c$a r0 = (com.amazon.aps.iva.pi.c.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.pi.c$a r0 = new com.amazon.aps.iva.pi.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.ellation.crunchyroll.model.music.MusicAsset r11 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)     // Catch: java.io.IOException -> L4c
            goto L45
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            com.amazon.aps.iva.ab.x.i0(r13)
            com.amazon.aps.iva.mi.a r13 = r10.a     // Catch: java.io.IOException -> L4c
            java.lang.String r2 = r11.getId()     // Catch: java.io.IOException -> L4c
            r0.h = r11     // Catch: java.io.IOException -> L4c
            r0.k = r3     // Catch: java.io.IOException -> L4c
            java.io.Serializable r13 = r13.a(r2, r12, r0)     // Catch: java.io.IOException -> L4c
            if (r13 != r1) goto L45
            return r1
        L45:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r13 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r13     // Catch: java.io.IOException -> L4c
            com.amazon.aps.iva.kj.c$b r11 = com.amazon.aps.iva.pi.d.a(r13)     // Catch: java.io.IOException -> L4c
            goto L61
        L4c:
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
        L61:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pi.c.b(com.ellation.crunchyroll.model.music.MusicAsset, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
