package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzea {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzdz zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzdy zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzea(zzdz zzdzVar) {
        this.zza = zzdzVar;
        if (zzamq.zza >= 18) {
            try {
                this.zzn = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzc;
        if (audioTrack != null) {
            if (this.zzx != -9223372036854775807L) {
                return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000));
            }
            int playState = audioTrack.getPlayState();
            if (playState == 1) {
                return 0L;
            }
            long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
            if (this.zzh) {
                if (playState == 2) {
                    if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playState = 2;
                }
                playbackHeadPosition += this.zzu;
            }
            if (zzamq.zza <= 29) {
                if (playbackHeadPosition == 0 && this.zzs > 0 && playState == 3) {
                    if (this.zzy == -9223372036854775807L) {
                        this.zzy = SystemClock.elapsedRealtime();
                    }
                    return this.zzs;
                }
                this.zzy = -9223372036854775807L;
            }
            if (this.zzs > playbackHeadPosition) {
                this.zzt++;
            }
            this.zzs = playbackHeadPosition;
            return playbackHeadPosition + (this.zzt << 32);
        }
        throw null;
    }

    public final void zza(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zzdy(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        this.zzh = false;
        boolean zzP = zzamq.zzP(i);
        this.zzq = zzP;
        this.zzi = zzP ? zzm(i3 / i2) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzp = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(boolean r25) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzea.zzb(boolean):long");
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzc;
        if (audioTrack != null) {
            return audioTrack.getPlayState() == 3;
        }
        throw null;
    }

    public final boolean zze(long j) {
        zzdt zzdtVar;
        long j2;
        zzdt zzdtVar2;
        zzdp zzdpVar;
        AudioTrack audioTrack = this.zzc;
        if (audioTrack != null) {
            int playState = audioTrack.getPlayState();
            if (this.zzh) {
                if (playState == 2) {
                    this.zzp = false;
                    return false;
                } else if (playState == 1) {
                    if (zzo() == 0) {
                        return false;
                    }
                    playState = 1;
                }
            }
            boolean z = this.zzp;
            boolean zzj = zzj(j);
            this.zzp = zzj;
            if (z && !zzj && playState != 1) {
                zzdz zzdzVar = this.zza;
                int i = this.zze;
                long zza = zzadx.zza(this.zzi);
                zzej zzejVar = (zzej) zzdzVar;
                zzdtVar = zzejVar.zza.zzk;
                if (zzdtVar != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    j2 = zzejVar.zza.zzM;
                    zzdtVar2 = zzejVar.zza.zzk;
                    zzdpVar = ((zzep) zzdtVar2).zza.zzc;
                    zzdpVar.zze(i, zza, elapsedRealtime - j2);
                }
            }
            return true;
        }
        throw null;
    }

    public final int zzf(long j) {
        return this.zze - ((int) (j - (zzo() * this.zzd)));
    }

    public final long zzg(long j) {
        return zzadx.zza(zzm(-zzo()));
    }

    public final boolean zzh(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final void zzi(long j) {
        this.zzz = zzo();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final boolean zzj(long j) {
        if (j <= zzo()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                if (audioTrack != null) {
                    return audioTrack.getPlayState() == 2 && zzo() == 0;
                }
                throw null;
            }
            return false;
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == -9223372036854775807L) {
            zzdy zzdyVar = this.zzf;
            if (zzdyVar != null) {
                zzdyVar.zze();
                return true;
            }
            throw null;
        }
        return false;
    }

    public final void zzl() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    public final void zzc() {
        zzdy zzdyVar = this.zzf;
        if (zzdyVar != null) {
            zzdyVar.zze();
            return;
        }
        throw null;
    }
}
