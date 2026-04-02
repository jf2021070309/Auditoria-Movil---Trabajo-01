package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.j0;
import com.amazon.aps.iva.sv.l2;
import com.amazon.aps.iva.sv.n0;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LocalVideosManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/downloading/LocalVideosManager;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/ellation/crunchyroll/downloading/g0;", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface LocalVideosManager extends EventDispatcher<g0> {

    /* compiled from: LocalVideosManager.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(LocalVideosManagerQueue localVideosManagerQueue, String str, com.amazon.aps.iva.xb0.l lVar) {
            localVideosManagerQueue.P0(str, h0.h, lVar);
        }
    }

    void A3(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar);

    void B(String str);

    void G6(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar);

    void J2(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar);

    void P0(String str, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.l lVar);

    void T4();

    Object T6(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    void W6(n0 n0Var);

    void Z(com.amazon.aps.iva.xb0.l<? super List<? extends e0>, com.amazon.aps.iva.kb0.q> lVar);

    void b6(String str, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fg.d, com.amazon.aps.iva.kb0.q> lVar);

    void g(String str);

    void g5(j0 j0Var);

    boolean isStarted();

    void j4(String str, Stream stream);

    void l8(l2.a aVar);

    void remove(String str);

    void t2(DownloadsManagerImpl.n nVar);
}
