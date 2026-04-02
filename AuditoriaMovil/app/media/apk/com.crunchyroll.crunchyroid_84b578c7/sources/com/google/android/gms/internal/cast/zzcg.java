package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.R;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzcg extends UIController {
    private final ImageView zza;
    private final String zzb;
    private final String zzc;
    private final Context zzd;
    private Cast.Listener zze;

    public zzcg(ImageView imageView, Context context) {
        this.zza = imageView;
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zzb = applicationContext.getString(R.string.cast_mute);
        this.zzc = applicationContext.getString(R.string.cast_unmute);
        imageView.setEnabled(false);
        this.zze = null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        if (this.zze == null) {
            this.zze = new zzcf(this);
        }
        castSession.addCastListener(this.zze);
        super.onSessionConnected(castSession);
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        Cast.Listener listener;
        this.zza.setEnabled(false);
        CastSession currentCastSession = CastContext.getSharedInstance(this.zzd).getSessionManager().getCurrentCastSession();
        if (currentCastSession != null && (listener = this.zze) != null) {
            currentCastSession.removeCastListener(listener);
        }
        super.onSessionEnded();
    }

    public final void zza() {
        String str;
        CastSession currentCastSession = CastContext.getSharedInstance(this.zzd).getSessionManager().getCurrentCastSession();
        if (currentCastSession != null && currentCastSession.isConnected()) {
            RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
            if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
                this.zza.setEnabled(true);
            } else {
                this.zza.setEnabled(false);
            }
            boolean isMute = currentCastSession.isMute();
            this.zza.setSelected(isMute);
            ImageView imageView = this.zza;
            if (isMute) {
                str = this.zzc;
            } else {
                str = this.zzb;
            }
            imageView.setContentDescription(str);
            return;
        }
        this.zza.setEnabled(false);
    }
}
