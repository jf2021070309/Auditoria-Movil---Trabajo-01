package com.ellation.crunchyroll.presentation.download.notification;

import android.content.Context;
import com.amazon.aps.iva.aw.a;
import com.amazon.aps.iva.b10.h;
import com.amazon.aps.iva.b10.p;
import com.amazon.aps.iva.b10.s;
import com.amazon.aps.iva.b10.v;
import com.amazon.aps.iva.b10.w;
import com.amazon.aps.iva.b10.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.sv.r;
import com.amazon.aps.iva.sv.v;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.d;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
import com.ellation.crunchyroll.downloading.queue.i;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SummaryNotificationHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/download/notification/SummaryNotificationHandlerImpl;", "Lcom/amazon/aps/iva/b10/p;", "Lcom/ellation/crunchyroll/downloading/InternalDownloadsManager;", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SummaryNotificationHandlerImpl implements p, InternalDownloadsManager {
    public final InternalDownloadsManager b;
    public final w c;

    public SummaryNotificationHandlerImpl(Context context, DownloadsManagerImpl downloadsManagerImpl) {
        this.b = downloadsManagerImpl;
        this.c = new x(context);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void A2(String... strArr) {
        j.f(strArr, "downloadIds");
        this.b.A2(strArr);
    }

    @Override // com.amazon.aps.iva.b10.p
    public final void D() {
        this.c.a(1122);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void F8(String... strArr) {
        this.b.F8(strArr);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final List<String> G() {
        return this.b.G();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void H6(String str, d.a aVar) {
        j.f(str, "containerId");
        this.b.H6(str, aVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void N0(String str) {
        j.f(str, "downloadId");
        this.b.N0(str);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void P0(String str, com.amazon.aps.iva.xb0.a aVar, l lVar) {
        j.f(str, "downloadId");
        this.b.P0(str, aVar, lVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Q1(String str, i iVar, com.ellation.crunchyroll.downloading.queue.j jVar) {
        j.f(str, "downloadId");
        this.b.Q1(str, iVar, jVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object R3(String[] strArr, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.b.R3(strArr, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void S0(PlayableAsset playableAsset) {
        j.f(playableAsset, "asset");
        this.b.S0(playableAsset);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void S5(List<com.amazon.aps.iva.xg.a> list, com.amazon.aps.iva.xb0.a<q> aVar) {
        j.f(aVar, "onStart");
        this.b.S5(list, aVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object U7(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar) {
        return this.b.U7(list, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void W2(String str, String str2, com.amazon.aps.iva.b10.q qVar) {
        j.f(str, "containerId");
        j.f(str2, "seasonId");
        this.b.W2(str, str2, qVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void W7(com.amazon.aps.iva.hg.a aVar) {
        j.f(aVar, "data");
        this.b.W7(aVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Y0() {
        this.b.Y0();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void Z(l<? super List<? extends e0>, q> lVar) {
        this.b.Z(lVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object a(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.b.a(dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void a6(String str, String str2, d.a aVar) {
        j.f(str, "containerId");
        this.b.a6(str, str2, aVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void a7(String str, a.C0118a c0118a) {
        j.f(str, "containerId");
        this.b.a7(str, c0118a);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(g0Var2);
    }

    @Override // com.amazon.aps.iva.fg.c
    public final Object b(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super DownloadButtonState> dVar) {
        return this.b.b(playableAsset, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void b1() {
        this.b.b1();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void c7(String str, String str2, l<? super List<String>, q> lVar) {
        j.f(str, "containerId");
        j.f(str2, "seasonId");
        this.b.c7(str, str2, lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.b.clear();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final Object d3(List<String> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar) {
        return this.b.d3(list, dVar);
    }

    @Override // com.amazon.aps.iva.b10.p
    public final void f() {
        this.c.f();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void g(String str) {
        j.f(str, "downloadId");
        this.b.g(str);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void g1(l<? super Boolean, q> lVar) {
        j.f(lVar, "result");
        this.b.g1(lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.b.getListenerCount();
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object getMovie(String str, com.amazon.aps.iva.ob0.d<? super Movie> dVar) {
        return this.b.getMovie(str, dVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object h(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return this.b.h(str, dVar);
    }

    @Override // com.amazon.aps.iva.b10.p
    public final void i(Episode episode, h.a aVar) {
        if (this.c.g(episode.getSeasonId().hashCode())) {
            c7(episode.getParentId(), episode.getSeasonId(), new v(this, episode, true));
            aVar.invoke();
        }
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object j(com.amazon.aps.iva.ob0.d<? super List<String>> dVar) {
        return this.b.j(dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void j8(String str, String str2, s sVar) {
        j.f(str, "containerId");
        j.f(str2, "seasonId");
        this.b.j8(str, str2, sVar);
    }

    @Override // com.amazon.aps.iva.fg.c
    public final Object l(String str, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return this.b.l(str, dVar);
    }

    @Override // com.amazon.aps.iva.b10.p
    public final void m() {
        this.c.h();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void m3(String str, String str2, com.amazon.aps.iva.d10.b bVar) {
        j.f(str, "containerId");
        this.b.m3(str, str2, bVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final int m7(String str, String str2) {
        j.f(str, "containerId");
        return this.b.m7(str, str2);
    }

    @Override // com.amazon.aps.iva.fg.c
    public final void n(String str, l<? super com.amazon.aps.iva.fg.d, q> lVar) {
        j.f(str, "downloadId");
        this.b.n(str, lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(l<? super g0, q> lVar) {
        j.f(lVar, "action");
        this.b.notify(lVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object o(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.b.o(dVar);
    }

    @Override // com.amazon.aps.iva.b10.p
    public final void p(String str) {
        j.f(str, "seasonId");
        this.c.a(str.hashCode());
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object q(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wg.b> dVar) {
        return this.b.q(str, dVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void q1() {
        this.b.q1();
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void q7(String str, l<? super Stream, q> lVar, com.amazon.aps.iva.xb0.p<? super PlayableAsset, ? super Throwable, q> pVar) {
        this.b.q7(str, lVar, pVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void r() {
        this.b.r();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(g0Var2);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void s4(PlayableAsset playableAsset, String str, r.a aVar) {
        j.f(playableAsset, "asset");
        j.f(str, "audioLocale");
        this.b.s4(playableAsset, str, aVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void s7(PlayableAsset playableAsset, v.a aVar) {
        j.f(playableAsset, "asset");
        this.b.s7(playableAsset, aVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object t(c cVar) {
        return this.b.t(cVar);
    }

    @Override // com.ellation.crunchyroll.downloading.InternalDownloadsManager
    public final void t8(String str, String str2, com.amazon.aps.iva.b10.r rVar) {
        j.f(str, "containerId");
        j.f(str2, "seasonId");
        this.b.t8(str, str2, rVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object u(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return this.b.u(dVar);
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object v(String str, com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
        return this.b.v(str, dVar);
    }

    @Override // com.amazon.aps.iva.b10.p
    public final void z(Episode episode) {
        c7(episode.getParentId(), episode.getSeasonId(), new com.amazon.aps.iva.b10.v(this, episode, false));
    }
}
