package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class zzel extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ zzen zza;
    public final /* synthetic */ zzem zzb;

    public zzel(zzem zzemVar, zzen zzenVar) {
        this.zzb = zzemVar;
        this.zza = zzenVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i2) {
        AudioTrack audioTrack2;
        zzdt zzdtVar;
        boolean z;
        zzdt zzdtVar2;
        audioTrack2 = this.zzb.zza.zzn;
        zzakt.zzd(audioTrack == audioTrack2);
        zzdtVar = this.zzb.zza.zzk;
        if (zzdtVar != null) {
            z = this.zzb.zza.zzI;
            if (z) {
                zzdtVar2 = this.zzb.zza.zzk;
                zzdtVar2.zza();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzdt zzdtVar;
        boolean z;
        zzdt zzdtVar2;
        audioTrack2 = this.zzb.zza.zzn;
        zzakt.zzd(audioTrack == audioTrack2);
        zzdtVar = this.zzb.zza.zzk;
        if (zzdtVar != null) {
            z = this.zzb.zza.zzI;
            if (z) {
                zzdtVar2 = this.zzb.zza.zzk;
                zzdtVar2.zza();
            }
        }
    }
}
