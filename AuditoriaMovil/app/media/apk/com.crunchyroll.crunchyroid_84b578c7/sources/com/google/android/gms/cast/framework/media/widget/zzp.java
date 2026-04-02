package com.google.android.gms.cast.framework.media.widget;

import android.widget.TextView;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzp implements RemoteMediaClient.Listener {
    final /* synthetic */ ExpandedControllerActivity zza;

    public /* synthetic */ zzp(ExpandedControllerActivity expandedControllerActivity, zzo zzoVar) {
        this.zza = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onAdBreakStatusUpdated() {
        this.zza.zzp();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onMetadataUpdated() {
        this.zza.zzo();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onPreloadStatusUpdated() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onQueueStatusUpdated() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onSendingRemoteMediaRequest() {
        TextView textView;
        ExpandedControllerActivity expandedControllerActivity = this.zza;
        textView = expandedControllerActivity.zzw;
        textView.setText(expandedControllerActivity.getResources().getString(R.string.cast_expanded_controller_loading));
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void onStatusUpdated() {
        RemoteMediaClient zzj;
        zzj = this.zza.zzj();
        if (zzj != null && zzj.hasMediaSession()) {
            ExpandedControllerActivity expandedControllerActivity = this.zza;
            expandedControllerActivity.zzd = false;
            expandedControllerActivity.zzn();
            this.zza.zzp();
            return;
        }
        ExpandedControllerActivity expandedControllerActivity2 = this.zza;
        if (!expandedControllerActivity2.zzd) {
            expandedControllerActivity2.finish();
        }
    }
}
