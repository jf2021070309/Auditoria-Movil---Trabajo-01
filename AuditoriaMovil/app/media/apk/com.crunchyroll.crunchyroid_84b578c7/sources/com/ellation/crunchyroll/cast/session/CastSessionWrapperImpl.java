package com.ellation.crunchyroll.cast.session;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastData;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: CastSessionWrapperImpl.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0017J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fH\u0016R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperImpl;", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient$Callback;", "callback", "Lcom/amazon/aps/iva/kb0/q;", "addCallback", "removeCallback", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient$ProgressListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "periodMs", "addProgressListener", "", "key", "getMetadataString", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "getMetadataPlayableAsset", "Lcom/google/android/gms/cast/MediaInfo;", "mediaInfo", "Lcom/google/android/gms/cast/MediaLoadOptions;", "mediaLoadOptions", "load", "channel", "message", "sendMessage", "castAuthNamespace", "Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;", "setMessageReceivedCallbacks", "removeMessageReceivedCallbacks", "Lcom/google/android/gms/cast/framework/CastSession;", "castSession", "Lcom/google/android/gms/cast/framework/CastSession;", "getCastSession", "()Lcom/google/android/gms/cast/framework/CastSession;", "", "isConnecting", "()Z", "isConnected", "getDeviceName", "()Ljava/lang/String;", "deviceName", "Lcom/ellation/crunchyroll/cast/session/CastDeviceWrapper;", "getCastDevice", "()Lcom/ellation/crunchyroll/cast/session/CastDeviceWrapper;", "castDevice", "<init>", "(Lcom/google/android/gms/cast/framework/CastSession;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CastSessionWrapperImpl implements CastSessionWrapperInternal {
    private final CastSession castSession;

    public CastSessionWrapperImpl(CastSession castSession) {
        j.f(castSession, "castSession");
        this.castSession = castSession;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public void addCallback(RemoteMediaClient.Callback callback) {
        j.f(callback, "callback");
        RemoteMediaClient remoteMediaClient = this.castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.registerCallback(callback);
        }
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public void addProgressListener(RemoteMediaClient.ProgressListener progressListener, long j) {
        j.f(progressListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        RemoteMediaClient remoteMediaClient = this.castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.addProgressListener(progressListener, j);
        }
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal
    public CastDeviceWrapper getCastDevice() {
        CastDevice castDevice = this.castSession.getCastDevice();
        if (castDevice != null) {
            return new CastDeviceWrapperImpl(castDevice);
        }
        return null;
    }

    public final CastSession getCastSession() {
        return this.castSession;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public String getDeviceName() {
        CastDevice castDevice = this.castSession.getCastDevice();
        if (castDevice != null) {
            return castDevice.getFriendlyName();
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public PlayableAsset getMetadataPlayableAsset() {
        MediaInfo mediaInfo;
        MediaMetadata metadata;
        RemoteMediaClient remoteMediaClient = this.castSession.getRemoteMediaClient();
        if (remoteMediaClient != null && (mediaInfo = remoteMediaClient.getMediaInfo()) != null && (metadata = mediaInfo.getMetadata()) != null) {
            return CastData.Companion.getAssetFromMetadata(metadata);
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public String getMetadataString(String str) {
        MediaInfo mediaInfo;
        MediaMetadata metadata;
        j.f(str, "key");
        RemoteMediaClient remoteMediaClient = this.castSession.getRemoteMediaClient();
        if (remoteMediaClient != null && (mediaInfo = remoteMediaClient.getMediaInfo()) != null && (metadata = mediaInfo.getMetadata()) != null) {
            return metadata.getString(str);
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public boolean isConnected() {
        return this.castSession.isConnected();
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public boolean isConnecting() {
        return this.castSession.isConnecting();
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public void load(MediaInfo mediaInfo, MediaLoadOptions mediaLoadOptions) {
        j.f(mediaInfo, "mediaInfo");
        j.f(mediaLoadOptions, "mediaLoadOptions");
        RemoteMediaClient remoteMediaClient = this.castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.load(mediaInfo, mediaLoadOptions);
        }
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public void removeCallback(RemoteMediaClient.Callback callback) {
        j.f(callback, "callback");
        RemoteMediaClient remoteMediaClient = this.castSession.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.unregisterCallback(callback);
        }
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    public void removeMessageReceivedCallbacks(String str) {
        j.f(str, "castAuthNamespace");
        this.castSession.removeMessageReceivedCallbacks(str);
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal, com.amazon.aps.iva.ye.b
    @SuppressLint({"ForbiddenMethod"})
    public void sendMessage(String str, String str2) {
        j.f(str, "channel");
        j.f(str2, "message");
        this.castSession.sendMessage(str, str2);
    }

    @Override // com.ellation.crunchyroll.cast.session.CastSessionWrapperInternal
    public void setMessageReceivedCallbacks(String str, Cast.MessageReceivedCallback messageReceivedCallback) {
        j.f(str, "castAuthNamespace");
        j.f(messageReceivedCallback, "callback");
        this.castSession.setMessageReceivedCallbacks(str, messageReceivedCallback);
    }
}
