package com.ellation.crunchyroll.cast.expanded;

import androidx.lifecycle.LiveData;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaTrack;
import kotlin.Metadata;
/* compiled from: CastControllerViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/cast/expanded/CastControllerViewModel;", "", "Lcom/amazon/aps/iva/kb0/q;", "onMetaDataUpdated", "loadNextEpisode", "Landroidx/lifecycle/LiveData;", "", "getTitle", "()Landroidx/lifecycle/LiveData;", "title", "getSubtitle", MediaTrack.ROLE_SUBTITLE, "getImageUrl", "imageUrl", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "getCurrentAsset", "currentAsset", "", "getSkipButtonVisibility", "skipButtonVisibility", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface CastControllerViewModel {
    LiveData<PlayableAsset> getCurrentAsset();

    LiveData<String> getImageUrl();

    LiveData<Boolean> getSkipButtonVisibility();

    LiveData<String> getSubtitle();

    LiveData<String> getTitle();

    void loadNextEpisode();

    void onMetaDataUpdated();
}
