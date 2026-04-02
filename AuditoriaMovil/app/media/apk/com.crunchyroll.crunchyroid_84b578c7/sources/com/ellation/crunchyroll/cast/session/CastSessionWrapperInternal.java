package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import kotlin.Metadata;
/* compiled from: CastSessionWrapperImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "Lcom/amazon/aps/iva/ye/b;", "Lcom/ellation/crunchyroll/cast/session/CastDeviceWrapper;", "getCastDevice", "()Lcom/ellation/crunchyroll/cast/session/CastDeviceWrapper;", "castDevice", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastSessionWrapperInternal extends b {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastSessionWrapperImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "castSession", "Lcom/google/android/gms/cast/framework/CastSession;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CastSessionWrapperInternal create(CastSession castSession) {
            j.f(castSession, "castSession");
            return new CastSessionWrapperImpl(castSession);
        }
    }

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ void addCallback(RemoteMediaClient.Callback callback);

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ void addProgressListener(RemoteMediaClient.ProgressListener progressListener, long j);

    CastDeviceWrapper getCastDevice();

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ String getDeviceName();

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ PlayableAsset getMetadataPlayableAsset();

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ String getMetadataString(String str);

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ boolean isConnected();

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ boolean isConnecting();

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ void load(MediaInfo mediaInfo, MediaLoadOptions mediaLoadOptions);

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ void removeCallback(RemoteMediaClient.Callback callback);

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ void removeMessageReceivedCallbacks(String str);

    @Override // com.amazon.aps.iva.ye.b
    /* synthetic */ void sendMessage(String str, String str2);

    /* synthetic */ void setMessageReceivedCallbacks(String str, Cast.MessageReceivedCallback messageReceivedCallback);
}
