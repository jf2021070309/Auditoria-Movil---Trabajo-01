package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.aw.a;
import com.amazon.aps.iva.fg.d;
import com.amazon.aps.iva.rw.b;
import com.amazon.aps.iva.sv.r;
import com.amazon.aps.iva.sv.v;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.bulk.d;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InternalDownloadsManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/downloading/NoOpDownloadsManagerImpl;", "Lcom/ellation/crunchyroll/downloading/InternalDownloadsManager;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/downloading/g0;", "<init>", "()V", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NoOpDownloadsManagerImpl implements InternalDownloadsManager, EventDispatcher<g0> {
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<g0> b = new EventDispatcher.EventDispatcherImpl<>();
    public final com.amazon.aps.iva.lb0.z c = com.amazon.aps.iva.lb0.z.b;

    /* compiled from: InternalDownloadsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl", f = "InternalDownloadsManager.kt", l = {1120}, m = "isDownloadCompleted")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return NoOpDownloadsManagerImpl.this.l(null, this);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void A2(String... strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "downloadIds");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void F8(String... strArr) {
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final List<String> G() {
        return this.c;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void H6(String str, d.a aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void N0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void P0(String str, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Q1(String str, com.ellation.crunchyroll.downloading.queue.i iVar, com.ellation.crunchyroll.downloading.queue.j jVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object R3(String[] strArr, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void S0(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void S5(List<com.amazon.aps.iva.xg.a> list, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onStart");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object U7(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar) {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void W2(String str, String str2, com.amazon.aps.iva.b10.q qVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        qVar.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void W7(com.amazon.aps.iva.hg.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "data");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Y0() {
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Z(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar) {
        lVar.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void a6(String str, String str2, d.a aVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void a7(String str, a.C0118a c0118a) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        c0118a.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(g0Var2);
    }

    @Override // com.amazon.aps.iva.fg.c
    public final Object b(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super DownloadButtonState> dVar) {
        return new DownloadButtonState.Inactive(playableAsset.getId());
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void b1() {
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void c7(String str, String str2, com.amazon.aps.iva.xb0.l<? super List<String>, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        lVar.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.b.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object d3(List<String> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar) {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void g1(com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "result");
        lVar.invoke(Boolean.FALSE);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.b.getListenerCount();
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object getMovie(String str, com.amazon.aps.iva.ob0.d<? super Movie> dVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object h(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object j(com.amazon.aps.iva.ob0.d<? super List<String>> dVar) {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void j8(String str, String str2, com.amazon.aps.iva.b10.s sVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        sVar.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.fg.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl.a
            if (r0 == 0) goto L13
            r0 = r6
            com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl$a r0 = (com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl$a r0 = new com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            java.lang.Object r6 = com.amazon.aps.iva.gd0.j.g(r4, r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            com.ellation.crunchyroll.downloading.e0 r6 = (com.ellation.crunchyroll.downloading.e0) r6
            if (r6 == 0) goto L46
            boolean r5 = r6.i()
            if (r5 == 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.downloading.NoOpDownloadsManagerImpl.l(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void m3(String str, String str2, com.amazon.aps.iva.d10.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        bVar.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final int m7(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        return 0;
    }

    @Override // com.amazon.aps.iva.fg.c
    public final void n(String str, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fg.d, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        lVar.invoke(new d.b(null, false));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super g0, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.b.notify(lVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object o(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object q(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wg.b> dVar) {
        return b.a.g;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void q1() {
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void q7(String str, com.amazon.aps.iva.xb0.l<? super Stream, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.p<? super PlayableAsset, ? super Throwable, com.amazon.aps.iva.kb0.q> pVar) {
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void r() {
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void s4(PlayableAsset playableAsset, String str, r.a aVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void s7(PlayableAsset playableAsset, v.a aVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object t(com.amazon.aps.iva.qb0.c cVar) {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void t8(String str, String str2, com.amazon.aps.iva.b10.r rVar) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        com.amazon.aps.iva.yb0.j.f(str2, "seasonId");
        rVar.invoke(com.amazon.aps.iva.lb0.z.b);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object u(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object v(String str, com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
        return com.amazon.aps.iva.lb0.z.b;
    }
}
