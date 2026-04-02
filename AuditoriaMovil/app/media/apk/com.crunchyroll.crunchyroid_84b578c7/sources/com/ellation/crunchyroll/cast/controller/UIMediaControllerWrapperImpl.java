package com.ellation.crunchyroll.cast.controller;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastData;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UIMediaControllerWrapper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapperImpl;", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "uiMediaController", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;", "(Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;)V", "currentAsset", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "getCurrentAsset", "()Lcom/ellation/crunchyroll/model/PlayableAsset;", "currentEpisode", "Lcom/ellation/crunchyroll/model/Episode;", "getCurrentEpisode", "()Lcom/ellation/crunchyroll/model/Episode;", "metadata", "Lcom/google/android/gms/cast/MediaMetadata;", "getMetadata", "()Lcom/google/android/gms/cast/MediaMetadata;", "playheadSec", "", "getPlayheadSec", "()J", "getImagesUrls", "", "", "getMetadataString", "key", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UIMediaControllerWrapperImpl implements UIMediaControllerWrapper {
    private final UIMediaController uiMediaController;

    public UIMediaControllerWrapperImpl(UIMediaController uIMediaController) {
        this.uiMediaController = uIMediaController;
    }

    private final MediaMetadata getMetadata() {
        RemoteMediaClient remoteMediaClient;
        MediaInfo mediaInfo;
        UIMediaController uIMediaController = this.uiMediaController;
        if (uIMediaController != null && (remoteMediaClient = uIMediaController.getRemoteMediaClient()) != null && (mediaInfo = remoteMediaClient.getMediaInfo()) != null) {
            return mediaInfo.getMetadata();
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper
    public PlayableAsset getCurrentAsset() {
        MediaMetadata metadata = getMetadata();
        if (metadata != null) {
            return CastData.Companion.getAssetFromMetadata(metadata);
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper
    public Episode getCurrentEpisode() {
        PlayableAsset currentAsset = getCurrentAsset();
        if (currentAsset instanceof Episode) {
            return (Episode) currentAsset;
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper
    public List<String> getImagesUrls() {
        List<WebImage> images;
        MediaMetadata metadata = getMetadata();
        if (metadata != null && (images = metadata.getImages()) != null) {
            List<WebImage> list = images;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (WebImage webImage : list) {
                String uri = webImage.getUrl().toString();
                j.e(uri, "it.url.toString()");
                arrayList.add(uri);
            }
            return arrayList;
        }
        return z.b;
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper
    public String getMetadataString(String str) {
        j.f(str, "key");
        MediaMetadata metadata = getMetadata();
        if (metadata != null) {
            return metadata.getString(str);
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.cast.controller.UIMediaControllerWrapper
    public long getPlayheadSec() {
        MediaMetadata metadata = getMetadata();
        if (metadata != null) {
            return CastData.Companion.getPlayheadSecFromMetadata(metadata);
        }
        return 0L;
    }
}
