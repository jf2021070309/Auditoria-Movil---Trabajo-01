package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class zzee {
    public final zzafv zza;
    public final int zzb;
    public final int zzc = 0;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzde[] zzi;

    public zzee(zzafv zzafvVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, zzde[] zzdeVarArr) {
        this.zza = zzafvVar;
        this.zzb = i2;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzi = zzdeVarArr;
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i6, i7);
        zzakt.zzd(minBufferSize != -2);
        this.zzh = zzamq.zzx(minBufferSize * 4, ((int) zzb(250000L)) * i4, Math.max(minBufferSize, ((int) zzb(750000L)) * i4));
    }

    public final long zza(long j2) {
        return (j2 * 1000000) / this.zze;
    }

    public final long zzb(long j2) {
        return (j2 * this.zze) / 1000000;
    }

    public final AudioTrack zzc(boolean z, zzg zzgVar, int i2) throws zzds {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i3 = zzamq.zza;
            if (i3 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzgVar.zza()).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i2).setOffloadedPlayback(false).build();
            } else if (i3 >= 21) {
                AudioAttributes zza = zzgVar.zza();
                build = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack(zza, build, this.zzh, 1, i2);
            } else {
                int i4 = zzgVar.zzb;
                audioTrack = i2 == 0 ? new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1) : new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i2);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzds(state, this.zze, this.zzf, this.zzh, this.zza, false, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new zzds(0, this.zze, this.zzf, this.zzh, this.zza, false, e2);
        }
    }
}
