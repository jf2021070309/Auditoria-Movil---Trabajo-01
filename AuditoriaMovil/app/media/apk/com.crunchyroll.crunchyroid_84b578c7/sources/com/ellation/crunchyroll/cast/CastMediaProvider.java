package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.mt.n;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadOptions;
import kotlin.Metadata;
/* compiled from: CastMediaProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastMediaProvider;", "", "getAssetMediaInfo", "Lcom/google/android/gms/cast/MediaInfo;", "contentContainer", "Lcom/ellation/crunchyroll/model/ContentContainer;", "currentlyPlayingAsset", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "playheadMs", "", "getMediaLoadOptions", "Lcom/google/android/gms/cast/MediaLoadOptions;", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CastMediaProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CastMediaProvider.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastMediaProvider$Companion;", "", "Lcom/amazon/aps/iva/mt/n;", "seasonAndEpisodeTitleFormatter", "Lkotlin/Function0;", "", "subtitleLanguage", "", "isClosedCaptionsEnabled", "Lcom/ellation/crunchyroll/cast/CastMediaProvider;", "create", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CastMediaProvider create$default(Companion companion, n nVar, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2, int i, Object obj) {
            com.amazon.aps.iva.xb0.a<String> aVar3 = aVar;
            if ((i & 2) != 0) {
                aVar3 = CastFeature.Companion.getDependencies$cast_release().getSubtitleLanguage();
            }
            com.amazon.aps.iva.xb0.a<Boolean> aVar4 = aVar2;
            if ((i & 4) != 0) {
                aVar4 = CastFeature.Companion.getDependencies$cast_release().isClosedCaptionsEnabled();
            }
            return companion.create(nVar, aVar3, aVar4);
        }

        public final CastMediaProvider create(n nVar, com.amazon.aps.iva.xb0.a<String> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2) {
            j.f(nVar, "seasonAndEpisodeTitleFormatter");
            j.f(aVar, "subtitleLanguage");
            j.f(aVar2, "isClosedCaptionsEnabled");
            return new CastMediaProviderImpl(nVar, aVar, aVar2);
        }
    }

    /* compiled from: CastMediaProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ MediaInfo getAssetMediaInfo$default(CastMediaProvider castMediaProvider, ContentContainer contentContainer, PlayableAsset playableAsset, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    j = 0;
                }
                return castMediaProvider.getAssetMediaInfo(contentContainer, playableAsset, j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAssetMediaInfo");
        }

        public static /* synthetic */ MediaLoadOptions getMediaLoadOptions$default(CastMediaProvider castMediaProvider, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = 0;
                }
                return castMediaProvider.getMediaLoadOptions(j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMediaLoadOptions");
        }
    }

    MediaInfo getAssetMediaInfo(ContentContainer contentContainer, PlayableAsset playableAsset, long j);

    MediaLoadOptions getMediaLoadOptions(long j);
}
