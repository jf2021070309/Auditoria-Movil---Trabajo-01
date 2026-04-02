package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.aw.a;
import com.amazon.aps.iva.sv.r;
import com.amazon.aps.iva.sv.v;
import com.amazon.aps.iva.sv.z1;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.bulk.d;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
import kotlin.Metadata;
/* compiled from: InternalDownloadsManager.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/downloading/InternalDownloadsManager;", "Lcom/amazon/aps/iva/fg/c;", "Lcom/amazon/aps/iva/sv/z1;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/downloading/g0;", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface InternalDownloadsManager extends com.amazon.aps.iva.fg.c, z1, EventDispatcher<g0> {

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    void A2(String... strArr);

    void F8(String... strArr);

    List<String> G();

    void H6(String str, d.a aVar);

    void N0(String str);

    void P0(String str, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.l lVar);

    void Q1(String str, com.ellation.crunchyroll.downloading.queue.i iVar, com.ellation.crunchyroll.downloading.queue.j jVar);

    Object R3(String[] strArr, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    void S0(PlayableAsset playableAsset);

    void S5(List<com.amazon.aps.iva.xg.a> list, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar);

    Object U7(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar);

    void W2(String str, String str2, com.amazon.aps.iva.b10.q qVar);

    void W7(com.amazon.aps.iva.hg.a aVar);

    void Y0();

    void Z(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar);

    void a6(String str, String str2, d.a aVar);

    void a7(String str, a.C0118a c0118a);

    void b1();

    void c7(String str, String str2, com.amazon.aps.iva.xb0.l<? super List<String>, com.amazon.aps.iva.kb0.q> lVar);

    Object d3(List<String> list, com.amazon.aps.iva.ob0.d<? super List<? extends e0>> dVar);

    void g(String str);

    void g1(com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> lVar);

    void j8(String str, String str2, com.amazon.aps.iva.b10.s sVar);

    void m3(String str, String str2, com.amazon.aps.iva.d10.b bVar);

    int m7(String str, String str2);

    void q1();

    void q7(String str, com.amazon.aps.iva.xb0.l<? super Stream, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.p<? super PlayableAsset, ? super Throwable, com.amazon.aps.iva.kb0.q> pVar);

    void r();

    void s4(PlayableAsset playableAsset, String str, r.a aVar);

    void s7(PlayableAsset playableAsset, v.a aVar);

    void t8(String str, String str2, com.amazon.aps.iva.b10.r rVar);
}
