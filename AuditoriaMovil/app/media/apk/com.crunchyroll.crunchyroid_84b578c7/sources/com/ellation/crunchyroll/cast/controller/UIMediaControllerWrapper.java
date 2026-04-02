package com.ellation.crunchyroll.cast.controller;

import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import java.util.List;
import kotlin.Metadata;
/* compiled from: UIMediaControllerWrapper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0010H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "", "currentAsset", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "getCurrentAsset", "()Lcom/ellation/crunchyroll/model/PlayableAsset;", "currentEpisode", "Lcom/ellation/crunchyroll/model/Episode;", "getCurrentEpisode", "()Lcom/ellation/crunchyroll/model/Episode;", "playheadSec", "", "getPlayheadSec", "()J", "getImagesUrls", "", "", "getMetadataString", "key", "Companion", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UIMediaControllerWrapper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: UIMediaControllerWrapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerWrapper;", "uiMediaController", "Lcom/google/android/gms/cast/framework/media/uicontroller/UIMediaController;", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final UIMediaControllerWrapper create(UIMediaController uIMediaController) {
            return new UIMediaControllerWrapperImpl(uIMediaController);
        }
    }

    PlayableAsset getCurrentAsset();

    Episode getCurrentEpisode();

    List<String> getImagesUrls();

    String getMetadataString(String str);

    long getPlayheadSec();
}
