package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.yb0.e;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0012\u0010\u0014\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0012\u0010\u0015\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0003\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/model/PanelMetadata;", "Ljava/io/Serializable;", "()V", "availableAudioLocales", "", "", "getAvailableAudioLocales", "()Ljava/util/List;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "contentDescriptors", "getContentDescriptors", "extendedMaturityRating", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "isDubbed", "", "()Z", "isMature", "isMatureBlocked", "isSubbed", "originalAudio", "getOriginalAudio", "()Ljava/lang/String;", "Lcom/ellation/crunchyroll/model/MovieListingMetadata;", "Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "Lcom/ellation/crunchyroll/model/SeriesMetadata;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PanelMetadata implements Serializable {
    public static final int $stable = 0;

    private PanelMetadata() {
    }

    public /* synthetic */ PanelMetadata(e eVar) {
        this();
    }

    public abstract List<String> getAvailableAudioLocales();

    public abstract List<String> getAvailableSubtitleLocales();

    public abstract List<String> getContentDescriptors();

    public abstract ExtendedMaturityRating getExtendedMaturityRating();

    public abstract String getOriginalAudio();

    public abstract boolean isDubbed();

    public abstract boolean isMature();

    public abstract boolean isMatureBlocked();

    public abstract boolean isSubbed();
}
