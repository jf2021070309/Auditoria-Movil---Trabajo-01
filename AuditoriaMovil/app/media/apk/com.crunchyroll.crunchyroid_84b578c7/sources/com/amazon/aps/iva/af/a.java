package com.amazon.aps.iva.af;

import com.amazon.aps.iva.ye.b;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: VideoCastListener.kt */
/* loaded from: classes.dex */
public interface a {
    void onCastMetadataUpdated(PlayableAsset playableAsset, long j);

    void onCastSessionStarted();

    void onCastSessionStarting();

    void onCastSessionStopped(Long l);

    void onConnectedToCast(b bVar);
}
