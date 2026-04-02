package com.amazon.aps.iva.b50;

import com.amazon.aps.iva.se0.c2;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.model.WatchlistItem;
import java.util.List;
/* compiled from: WatchlistItemsLoader.kt */
/* loaded from: classes2.dex */
public final class v implements com.ellation.crunchyroll.presentation.watchlist.f {
    public final com.amazon.aps.iva.xb0.a<EtpContentService> b;
    public final com.amazon.aps.iva.se0.g0 c;
    public c2 d;
    public List<WatchlistItem> e = com.amazon.aps.iva.lb0.z.b;

    /* compiled from: WatchlistItemsLoader.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.watchlist.WatchlistItemsLoaderImpl", f = "WatchlistItemsLoader.kt", l = {53}, m = "getWatchlistItems")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public v h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v.this.getWatchlistItems(this);
        }
    }

    public v(com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xe0.d dVar) {
        this.b = aVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.ellation.crunchyroll.presentation.watchlist.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getWatchlistItems(com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.etp.content.model.WatchlistItem>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.b50.v.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.b50.v$a r0 = (com.amazon.aps.iva.b50.v.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b50.v$a r0 = new com.amazon.aps.iva.b50.v$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.b50.v r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L62
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.se0.c2 r7 = r6.d
            if (r7 == 0) goto L40
            boolean r7 = r7.isActive()
            if (r7 != r3) goto L40
            r7 = r3
            goto L41
        L40:
            r7 = 0
        L41:
            if (r7 != 0) goto L52
            com.amazon.aps.iva.b50.u r7 = new com.amazon.aps.iva.b50.u
            r2 = 0
            r7.<init>(r6, r2)
            r4 = 3
            com.amazon.aps.iva.se0.g0 r5 = r6.c
            com.amazon.aps.iva.se0.c2 r7 = com.amazon.aps.iva.se0.i.d(r5, r2, r2, r7, r4)
            r6.d = r7
        L52:
            com.amazon.aps.iva.se0.c2 r7 = r6.d
            if (r7 == 0) goto L61
            r0.h = r6
            r0.k = r3
            java.lang.Object r7 = r7.N(r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r0 = r6
        L62:
            java.util.List<com.ellation.crunchyroll.api.etp.content.model.WatchlistItem> r7 = r0.e
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b50.v.getWatchlistItems(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.presentation.watchlist.f
    public final void invalidate() {
        c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.e = com.amazon.aps.iva.lb0.z.b;
        this.d = com.amazon.aps.iva.se0.i.d(this.c, null, null, new u(this, null), 3);
    }
}
