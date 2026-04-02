package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzcv extends UIController implements RemoteMediaClient.ProgressListener {
    private final TextView zza;
    private final ImageView zzb;
    private final com.google.android.gms.cast.framework.media.uicontroller.zza zzc;

    public zzcv(View view, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        TextView textView = (TextView) view.findViewById(R.id.live_indicator_text);
        this.zza = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.live_indicator_dot);
        this.zzb = imageView;
        this.zzc = zzaVar;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(null, R.styleable.CastExpandedController, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CastExpandedController_castLiveIndicatorColor, 0);
        obtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        textView.setVisibility(8);
        imageView.setVisibility(8);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void onProgressUpdated(long j, long j2) {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.addProgressListener(this, 1000L);
        }
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.removeProgressListener(this);
        }
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        boolean zzm;
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        int i = 8;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && remoteMediaClient.isLiveStream()) {
            if (!remoteMediaClient.zzw()) {
                zzm = remoteMediaClient.isPlaying();
            } else {
                zzm = this.zzc.zzm();
            }
            this.zza.setVisibility(0);
            ImageView imageView = this.zzb;
            if (true == zzm) {
                i = 0;
            }
            imageView.setVisibility(i);
            zzo.zzd(zzml.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
            return;
        }
        this.zza.setVisibility(8);
        this.zzb.setVisibility(8);
    }
}
