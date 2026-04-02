package com.google.android.gms.cast.framework.media.uicontroller;

import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzi implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ SeekBar zza;
    final /* synthetic */ UIMediaController zzb;

    public zzi(UIMediaController uIMediaController, SeekBar seekBar) {
        this.zzb = uIMediaController;
        this.zza = seekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        RemoteMediaClient remoteMediaClient = this.zzb.getRemoteMediaClient();
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && remoteMediaClient.zzw()) {
            if (z && i < this.zzb.zza.zzd()) {
                UIMediaController uIMediaController = this.zzb;
                SeekBar seekBar2 = this.zza;
                int zzd = uIMediaController.zza.zzd();
                seekBar2.setProgress(zzd);
                this.zzb.onSeekBarProgressChanged(seekBar, zzd, true);
                return;
            } else if (z && i > this.zzb.zza.zzc()) {
                UIMediaController uIMediaController2 = this.zzb;
                SeekBar seekBar3 = this.zza;
                int zzc = uIMediaController2.zza.zzc();
                seekBar3.setProgress(zzc);
                this.zzb.onSeekBarProgressChanged(seekBar, zzc, true);
                return;
            }
        }
        this.zzb.onSeekBarProgressChanged(seekBar, i, z);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.zzb.onSeekBarStartTrackingTouch(seekBar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.zzb.onSeekBarStopTrackingTouch(seekBar);
    }
}
