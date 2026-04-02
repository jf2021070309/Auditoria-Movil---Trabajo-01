package com.ellation.crunchyroll.downloading.bulk;

import com.amazon.aps.iva.l40.a1;
import com.amazon.aps.iva.sv.a0;
import com.amazon.aps.iva.sv.f2;
import com.amazon.aps.iva.sv.n;
import com.amazon.aps.iva.sv.t;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: BulkDownloadsManager.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/downloading/bulk/BulkDownloadsManager;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/sv/f2;", "Lcom/amazon/aps/iva/vv/a;", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface BulkDownloadsManager extends EventDispatcher<f2<com.amazon.aps.iva.vv.a>> {
    void G8(ArrayList arrayList);

    void K0(com.amazon.aps.iva.hg.g gVar);

    f2 N3(com.amazon.aps.iva.hg.c cVar, com.amazon.aps.iva.hg.g gVar, a1 a1Var);

    void g2(com.amazon.aps.iva.hg.g gVar, a0.a aVar);

    void l2(com.amazon.aps.iva.hg.g gVar, String str, t tVar);

    Object m0(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.hg.f> dVar);

    void w2(com.amazon.aps.iva.hg.g gVar, n.h.a aVar);

    void y(com.amazon.aps.iva.hg.g gVar);
}
