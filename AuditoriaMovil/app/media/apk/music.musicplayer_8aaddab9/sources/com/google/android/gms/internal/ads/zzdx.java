package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class zzdx {
    private final AudioTrack zza;
    private final AudioTimestamp zzb = new AudioTimestamp();
    private long zzc;
    private long zzd;
    private long zze;

    public zzdx(AudioTrack audioTrack) {
        this.zza = audioTrack;
    }

    public final boolean zza() {
        boolean timestamp = this.zza.getTimestamp(this.zzb);
        if (timestamp) {
            long j2 = this.zzb.framePosition;
            if (this.zzd > j2) {
                this.zzc++;
            }
            this.zzd = j2;
            this.zze = j2 + (this.zzc << 32);
        }
        return timestamp;
    }

    public final long zzb() {
        return this.zzb.nanoTime / 1000;
    }

    public final long zzc() {
        return this.zze;
    }
}
