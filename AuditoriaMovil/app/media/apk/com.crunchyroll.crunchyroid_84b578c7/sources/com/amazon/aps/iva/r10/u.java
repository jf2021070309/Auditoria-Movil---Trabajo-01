package com.amazon.aps.iva.r10;

import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel;
import java.util.ArrayList;
/* compiled from: HistoryInteractor.kt */
/* loaded from: classes2.dex */
public interface u extends com.amazon.aps.iva.wy.j {
    Object A0(int i, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar);

    Object Y0(ArrayList arrayList, com.amazon.aps.iva.ob0.d dVar);

    Object deleteHistory(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object f0(String str, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>> dVar);

    ArrayList j();
}
