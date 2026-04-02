package com.amazon.aps.iva.ye;

import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
/* compiled from: CastSessionWrapper.kt */
/* loaded from: classes.dex */
public interface b {
    void addCallback(RemoteMediaClient.Callback callback);

    void addProgressListener(RemoteMediaClient.ProgressListener progressListener, long j);

    String getDeviceName();

    PlayableAsset getMetadataPlayableAsset();

    String getMetadataString(String str);

    boolean isConnected();

    boolean isConnecting();

    void load(MediaInfo mediaInfo, MediaLoadOptions mediaLoadOptions);

    void removeCallback(RemoteMediaClient.Callback callback);

    void removeMessageReceivedCallbacks(String str);

    void sendMessage(String str, String str2);
}
