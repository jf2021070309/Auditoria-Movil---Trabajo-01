package com.ellation.crunchyroll.cast;

import android.net.Uri;
import com.amazon.aps.iva.c.b;
import com.amazon.aps.iva.lb0.k0;
import com.amazon.aps.iva.mt.n;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.images.WebImage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: CastMediaProvider.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastMediaProviderImpl;", "Lcom/ellation/crunchyroll/cast/CastMediaProvider;", "Lcom/ellation/crunchyroll/model/ContentContainer;", "contentContainer", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "currentlyPlayingAsset", "", "playheadMs", "Lcom/google/android/gms/cast/MediaMetadata;", "createMediaMetadata", "Lcom/google/android/gms/cast/MediaInfo;", "getAssetMediaInfo", "Lcom/google/android/gms/cast/MediaLoadOptions;", "getMediaLoadOptions", "Lcom/amazon/aps/iva/mt/n;", "seasonAndEpisodeTitleFormatter", "Lcom/amazon/aps/iva/mt/n;", "Lkotlin/Function0;", "", "subtitlesLanguage", "Lcom/amazon/aps/iva/xb0/a;", "", "isClosedCaptionsEnabled", "<init>", "(Lcom/amazon/aps/iva/mt/n;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/xb0/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CastMediaProviderImpl implements CastMediaProvider {
    private final com.amazon.aps.iva.xb0.a<Boolean> isClosedCaptionsEnabled;
    private final n seasonAndEpisodeTitleFormatter;
    private final com.amazon.aps.iva.xb0.a<String> subtitlesLanguage;

    public CastMediaProviderImpl(n nVar, com.amazon.aps.iva.xb0.a<String> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2) {
        j.f(nVar, "seasonAndEpisodeTitleFormatter");
        j.f(aVar, "subtitlesLanguage");
        j.f(aVar2, "isClosedCaptionsEnabled");
        this.seasonAndEpisodeTitleFormatter = nVar;
        this.subtitlesLanguage = aVar;
        this.isClosedCaptionsEnabled = aVar2;
    }

    private final MediaMetadata createMediaMetadata(ContentContainer contentContainer, PlayableAsset playableAsset, long j) {
        String str;
        List<Image> thumbnails;
        MediaMetadata mediaMetadata = new MediaMetadata(2);
        String title = contentContainer.getTitle();
        if (playableAsset != null) {
            str = this.seasonAndEpisodeTitleFormatter.b(playableAsset);
        } else {
            str = null;
        }
        mediaMetadata.putString(MediaMetadata.KEY_TITLE, title);
        mediaMetadata.putString("title", title);
        if (str != null) {
            mediaMetadata.putString(MediaMetadata.KEY_SUBTITLE, str);
            mediaMetadata.putString(MediaTrack.ROLE_SUBTITLE, str);
        }
        if (playableAsset != null) {
            mediaMetadata.putString(CastDataKt.KEY_CAST_MEDIA_CLASS, playableAsset.getType());
            mediaMetadata.putString("media_href", b.a("/cms/v2/US/M3/crunchyroll/", playableAsset.getType(), "s/", playableAsset.getId()));
            mediaMetadata.putString("media_resource_key", b.a("cms:/", playableAsset.getType(), "s/", playableAsset.getId()));
        }
        mediaMetadata.putInt(CastDataKt.KEY_CAST_MEDIA_PLAYHEAD_SEC, (int) TimeUnit.MILLISECONDS.toSeconds(j));
        if (this.isClosedCaptionsEnabled.invoke().booleanValue()) {
            mediaMetadata.putString("closed_captions_language", this.subtitlesLanguage.invoke());
        } else {
            mediaMetadata.putString("preferred_subtitle_language", this.subtitlesLanguage.invoke());
        }
        if (playableAsset != null && (thumbnails = playableAsset.getThumbnails()) != null) {
            Iterator it = new k0(thumbnails).iterator();
            while (true) {
                k0.a aVar = (k0.a) it;
                if (!aVar.hasNext()) {
                    break;
                }
                mediaMetadata.addImage(new WebImage(Uri.parse(((Image) aVar.next()).getUrl())));
            }
        }
        return mediaMetadata;
    }

    @Override // com.ellation.crunchyroll.cast.CastMediaProvider
    public MediaInfo getAssetMediaInfo(ContentContainer contentContainer, PlayableAsset playableAsset, long j) {
        j.f(contentContainer, "contentContainer");
        j.f(playableAsset, "currentlyPlayingAsset");
        MediaInfo build = new MediaInfo.Builder(playableAsset.getId()).setStreamType(1).setContentType("application/x-mpegurl").setStreamDuration(playableAsset.getDurationMs()).setMetadata(createMediaMetadata(contentContainer, playableAsset, j)).setCustomData(new CastData(contentContainer).toJsonObject()).build();
        j.e(build, "Builder(currentlyPlaying…bject())\n        .build()");
        return build;
    }

    @Override // com.ellation.crunchyroll.cast.CastMediaProvider
    public MediaLoadOptions getMediaLoadOptions(long j) {
        MediaLoadOptions build = new MediaLoadOptions.Builder().setPlayPosition(j).build();
        j.e(build, "Builder().setPlayPosition(playheadMs).build()");
        return build;
    }
}
