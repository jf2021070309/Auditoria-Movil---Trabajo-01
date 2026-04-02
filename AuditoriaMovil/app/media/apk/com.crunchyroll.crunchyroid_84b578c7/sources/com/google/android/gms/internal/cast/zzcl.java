package com.google.android.gms.internal.cast;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzcl extends UIController implements RemoteMediaClient.ProgressListener {
    private final SeekBar zza;
    private final long zzb;
    private final com.google.android.gms.cast.framework.media.uicontroller.zza zzc;
    private boolean zzd = true;
    private Boolean zze;
    private Drawable zzf;

    public zzcl(SeekBar seekBar, long j, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.zzf = null;
        this.zza = seekBar;
        this.zzb = j;
        this.zzc = zzaVar;
        seekBar.setEnabled(false);
        this.zzf = seekBar.getThumb();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zzb();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void onProgressUpdated(long j, long j2) {
        zzb();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.addProgressListener(this, this.zzb);
        }
        zzb();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.removeProgressListener(this);
        }
        super.onSessionEnded();
        zzb();
    }

    public final void zza(boolean z) {
        this.zzd = z;
    }

    public final void zzb() {
        RemoteMediaClient remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession()) {
            if (this.zzd) {
                this.zza.setMax(this.zzc.zzb());
                if (remoteMediaClient.isLiveStream() && this.zzc.zzm()) {
                    this.zza.setProgress(this.zzc.zzc());
                } else {
                    this.zza.setProgress(this.zzc.zza());
                }
                if (remoteMediaClient.isPlayingAd()) {
                    this.zza.setEnabled(false);
                } else {
                    this.zza.setEnabled(true);
                }
                RemoteMediaClient remoteMediaClient2 = getRemoteMediaClient();
                if (remoteMediaClient2 != null && remoteMediaClient2.hasMediaSession()) {
                    Boolean bool = this.zze;
                    if (bool == null || bool.booleanValue() != remoteMediaClient2.zzw()) {
                        Boolean valueOf = Boolean.valueOf(remoteMediaClient2.zzw());
                        this.zze = valueOf;
                        if (valueOf.booleanValue()) {
                            Drawable drawable = this.zzf;
                            if (drawable != null) {
                                this.zza.setThumb(drawable);
                            }
                            this.zza.setClickable(true);
                            this.zza.setOnTouchListener(null);
                            return;
                        }
                        this.zza.setThumb(new ColorDrawable(0));
                        this.zza.setClickable(false);
                        this.zza.setOnTouchListener(new zzck(this));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.zza.setMax(this.zzc.zzb());
        this.zza.setProgress(this.zzc.zza());
        this.zza.setEnabled(false);
    }
}
