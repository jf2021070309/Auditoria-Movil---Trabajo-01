package com.ellation.crunchyroll.downloading.queue;

import com.ellation.crunchyroll.downloading.LocalVideosManager;
import com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl;
import com.ellation.crunchyroll.downloading.p;
import com.ellation.crunchyroll.downloading.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LocalVideosManagerQueue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/downloading/queue/LocalVideosManagerQueue;", "Lcom/ellation/crunchyroll/downloading/LocalVideosManager;", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface LocalVideosManagerQueue extends LocalVideosManager {

    /* compiled from: LocalVideosManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static LocalVideosManagerQueue a(com.amazon.aps.iva.tw.a aVar, ExoPlayerLocalVideosManagerImpl exoPlayerLocalVideosManagerImpl, com.amazon.aps.iva.tw.g gVar, com.amazon.aps.iva.pw.a aVar2, com.amazon.aps.iva.xb0.a aVar3, boolean z) {
            com.amazon.aps.iva.yb0.j.f(aVar2, "streamDataLoader");
            com.amazon.aps.iva.yb0.j.f(aVar3, "hasNetworkConnection");
            return new LocalVideosManagerQueueImpl(aVar, exoPlayerLocalVideosManagerImpl, gVar, aVar2, aVar3, z);
        }
    }

    void F1(String str, q.h hVar, q.i iVar);

    ArrayList F6();

    List<String> G();

    void R1(String str, p.h hVar, p.i iVar);

    void Y0();

    void Y2(String str);

    void f6(String str);

    void p1(List<String> list);
}
