package com.amazon.aps.iva.i50;

import com.amazon.aps.iva.ap.h;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenRouter.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: WatchScreenRouter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(b bVar, Panel panel, com.amazon.aps.iva.no.a aVar, Long l, int i) {
            if ((i & 4) != 0) {
                l = null;
            }
            bVar.c(panel, aVar, l, null);
        }
    }

    void a(h hVar, com.amazon.aps.iva.no.a aVar);

    void b(PlayableAsset playableAsset, long j, boolean z, com.amazon.aps.iva.no.a aVar);

    void c(Panel panel, com.amazon.aps.iva.no.a aVar, Long l, Boolean bool);
}
