package com.ellation.crunchyroll.cast.mini;

import android.os.Bundle;
import android.view.View;
import com.amazon.aps.iva.bc0.b;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.CastData;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.cast.framework.media.widget.MiniControllerFragment;
import kotlin.Metadata;
/* compiled from: CastMiniControllerFragment.kt */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerFragment;", "Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onViewCreated", "onDestroyView", "Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateLayout;", "contentStateContainer$delegate", "Lcom/amazon/aps/iva/bc0/b;", "getContentStateContainer", "()Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateLayout;", "contentStateContainer", "com/ellation/crunchyroll/cast/mini/CastMiniControllerFragment$metadataUpdateCallback$1", "metadataUpdateCallback", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerFragment$metadataUpdateCallback$1;", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient;", "getMediaClient", "()Lcom/google/android/gms/cast/framework/media/RemoteMediaClient;", "mediaClient", "Lcom/google/android/gms/cast/MediaMetadata;", "getMetadata", "()Lcom/google/android/gms/cast/MediaMetadata;", "metadata", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastMiniControllerFragment extends MiniControllerFragment {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {q.a(CastMiniControllerFragment.class, "contentStateContainer", "getContentStateContainer()Lcom/ellation/crunchyroll/cast/mini/CastMiniContentStateLayout;", 0)};
    public static final int $stable = 8;
    private final b contentStateContainer$delegate = g.f(this, R.id.cast_mini_content_state_container);
    private final CastMiniControllerFragment$metadataUpdateCallback$1 metadataUpdateCallback = new RemoteMediaClient.Callback() { // from class: com.ellation.crunchyroll.cast.mini.CastMiniControllerFragment$metadataUpdateCallback$1
        @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Callback
        public void onMetadataUpdated() {
            MediaMetadata metadata;
            CastMiniContentStateLayout contentStateContainer;
            metadata = CastMiniControllerFragment.this.getMetadata();
            if (metadata != null) {
                CastMiniControllerFragment castMiniControllerFragment = CastMiniControllerFragment.this;
                PlayableAsset assetFromMetadata = CastData.Companion.getAssetFromMetadata(metadata);
                if (assetFromMetadata != null) {
                    contentStateContainer = castMiniControllerFragment.getContentStateContainer();
                    contentStateContainer.bind(assetFromMetadata);
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final CastMiniContentStateLayout getContentStateContainer() {
        return (CastMiniContentStateLayout) this.contentStateContainer$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final RemoteMediaClient getMediaClient() {
        UIMediaController uIMediaController = getUIMediaController();
        if (uIMediaController != null) {
            return uIMediaController.getRemoteMediaClient();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaMetadata getMetadata() {
        RemoteMediaClient remoteMediaClient;
        MediaInfo mediaInfo;
        UIMediaController uIMediaController = getUIMediaController();
        if (uIMediaController != null && (remoteMediaClient = uIMediaController.getRemoteMediaClient()) != null && (mediaInfo = remoteMediaClient.getMediaInfo()) != null) {
            return mediaInfo.getMetadata();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RemoteMediaClient mediaClient = getMediaClient();
        if (mediaClient != null) {
            mediaClient.unregisterCallback(this.metadataUpdateCallback);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        RemoteMediaClient mediaClient = getMediaClient();
        if (mediaClient != null) {
            mediaClient.registerCallback(this.metadataUpdateCallback);
        }
    }
}
