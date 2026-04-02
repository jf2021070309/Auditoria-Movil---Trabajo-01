package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzchy implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcig zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchy(zzcig zzcigVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcigVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcih zzcihVar;
        zzcih zzcihVar2;
        zzcig.zzu(this.zzb, this.zza);
        zzcihVar = this.zzb.zzs;
        if (zzcihVar != null) {
            zzcihVar2 = this.zzb.zzs;
            zzcihVar2.zzb();
        }
    }
}
