package com.ellation.crunchyroll.api.panelsinterceptor;

import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.google.gson.JsonObject;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WatchlistStatusLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/k;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1", f = "WatchlistStatusLoader.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1 extends i implements p<g0, d<? super k<? extends q>>, Object> {
    final /* synthetic */ List<JsonObject> $jsonPanels;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WatchlistStatusLoaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1(WatchlistStatusLoaderImpl watchlistStatusLoaderImpl, List<JsonObject> list, d<? super WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1> dVar) {
        super(2, dVar);
        this.this$0 = watchlistStatusLoaderImpl;
        this.$jsonPanels = list;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1 watchlistStatusLoaderImpl$addInWatchlistStatusTo$1 = new WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1(this.this$0, this.$jsonPanels, dVar);
        watchlistStatusLoaderImpl$addInWatchlistStatusTo$1.L$0 = obj;
        return watchlistStatusLoaderImpl$addInWatchlistStatusTo$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(g0 g0Var, d<? super k<q>> dVar) {
        return ((WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:6:0x0011, B:15:0x003b, B:16:0x004a, B:18:0x0050, B:19:0x005e, B:20:0x0064, B:22:0x006a, B:24:0x007a, B:30:0x008a, B:32:0x008f, B:31:0x008d, B:33:0x0093, B:11:0x0028), top: B:39:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:6:0x0011, B:15:0x003b, B:16:0x004a, B:18:0x0050, B:19:0x005e, B:20:0x0064, B:22:0x006a, B:24:0x007a, B:30:0x008a, B:32:0x008f, B:31:0x008d, B:33:0x0093, B:11:0x0028), top: B:39:0x0005 }] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r5.L$1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r5.L$0
            com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl r1 = (com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl) r1
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L96
            goto L3b
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.Object r6 = r5.L$0
            com.amazon.aps.iva.se0.g0 r6 = (com.amazon.aps.iva.se0.g0) r6
            com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl r1 = r5.this$0
            java.util.List<com.google.gson.JsonObject> r6 = r5.$jsonPanels
            com.ellation.crunchyroll.presentation.watchlist.f r3 = com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl.access$getWatchlistItemsLoader$p(r1)     // Catch: java.lang.Throwable -> L96
            r5.L$0 = r1     // Catch: java.lang.Throwable -> L96
            r5.L$1 = r6     // Catch: java.lang.Throwable -> L96
            r5.label = r2     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = r3.getWatchlistItems(r5)     // Catch: java.lang.Throwable -> L96
            if (r3 != r0) goto L39
            return r0
        L39:
            r0 = r6
            r6 = r3
        L3b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L96
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L96
            int r4 = com.amazon.aps.iva.lb0.r.Y(r6)     // Catch: java.lang.Throwable -> L96
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L96
        L4a:
            boolean r4 = r6.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L96
            com.ellation.crunchyroll.api.etp.content.model.WatchlistItem r4 = (com.ellation.crunchyroll.api.etp.content.model.WatchlistItem) r4     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = r4.getId()     // Catch: java.lang.Throwable -> L96
            r3.add(r4)     // Catch: java.lang.Throwable -> L96
            goto L4a
        L5e:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L96
        L64:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L93
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L96
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl.access$getPanelId(r1, r0)     // Catch: java.lang.Throwable -> L96
            boolean r4 = r3.contains(r4)     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L87
            java.lang.String r4 = com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl.access$getContainerId(r1, r0)     // Catch: java.lang.Throwable -> L96
            boolean r4 = com.amazon.aps.iva.lb0.x.m0(r3, r4)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L85
            goto L87
        L85:
            r4 = 0
            goto L88
        L87:
            r4 = r2
        L88:
            if (r4 == 0) goto L8d
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r4 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.IN_WATCHLIST     // Catch: java.lang.Throwable -> L96
            goto L8f
        L8d:
            com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus r4 = com.ellation.crunchyroll.api.etp.content.model.WatchlistStatus.NOT_IN_WATCHLIST     // Catch: java.lang.Throwable -> L96
        L8f:
            com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl.access$setWatchlistStatus(r1, r0, r4)     // Catch: java.lang.Throwable -> L96
            goto L64
        L93:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L96
            goto L9b
        L96:
            r6 = move-exception
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r6)
        L9b:
            com.amazon.aps.iva.kb0.k r0 = new com.amazon.aps.iva.kb0.k
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.panelsinterceptor.WatchlistStatusLoaderImpl$addInWatchlistStatusTo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xb0.p
    public /* bridge */ /* synthetic */ Object invoke(g0 g0Var, d<? super k<? extends q>> dVar) {
        return invoke2(g0Var, (d<? super k<q>>) dVar);
    }
}
