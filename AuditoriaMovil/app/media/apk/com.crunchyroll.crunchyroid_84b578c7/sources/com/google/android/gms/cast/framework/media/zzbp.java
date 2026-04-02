package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbp {
    final /* synthetic */ RemoteMediaClient zza;
    private final Set zzb = new HashSet();
    private final long zzc;
    private final Runnable zzd;
    private boolean zze;

    public zzbp(RemoteMediaClient remoteMediaClient, long j) {
        this.zza = remoteMediaClient;
        this.zzc = j;
        this.zzd = new zzbo(this, remoteMediaClient);
    }

    public final long zzb() {
        return this.zzc;
    }

    public final void zzd(RemoteMediaClient.ProgressListener progressListener) {
        this.zzb.add(progressListener);
    }

    public final void zze(RemoteMediaClient.ProgressListener progressListener) {
        this.zzb.remove(progressListener);
    }

    public final void zzf() {
        RemoteMediaClient.zzb(this.zza).removeCallbacks(this.zzd);
        this.zze = true;
        RemoteMediaClient.zzb(this.zza).postDelayed(this.zzd, this.zzc);
    }

    public final void zzg() {
        RemoteMediaClient.zzb(this.zza).removeCallbacks(this.zzd);
        this.zze = false;
    }

    public final boolean zzh() {
        if (!this.zzb.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean zzi() {
        return this.zze;
    }
}
