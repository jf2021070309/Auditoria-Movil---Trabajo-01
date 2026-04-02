package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
/* loaded from: classes.dex */
public final class zzem {
    public final /* synthetic */ zzen zza;
    private final Handler zzb = new Handler();
    private final AudioTrack.StreamEventCallback zzc;

    public zzem(zzen zzenVar) {
        this.zza = zzenVar;
        this.zzc = new zzel(this, zzenVar);
    }

    public final void zza(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(zzek.zza(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
