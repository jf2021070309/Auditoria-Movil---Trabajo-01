package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaom extends zzaol {
    private final AudioTimestamp zzb;
    private long zzc;
    private long zzd;
    private long zze;

    public zzaom() {
        super(null);
        this.zzb = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final void zza(AudioTrack audioTrack, boolean z) {
        super.zza(audioTrack, z);
        this.zzc = 0L;
        this.zzd = 0L;
        this.zze = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final boolean zzf() {
        boolean timestamp = this.zza.getTimestamp(this.zzb);
        if (timestamp) {
            long j = this.zzb.framePosition;
            if (this.zzd > j) {
                this.zzc++;
            }
            this.zzd = j;
            this.zze = j + (this.zzc << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final long zzg() {
        return this.zzb.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.zzaol
    public final long zzh() {
        return this.zze;
    }
}
