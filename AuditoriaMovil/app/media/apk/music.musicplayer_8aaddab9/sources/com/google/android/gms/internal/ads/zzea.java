package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import e.a.d.a.a;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
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

    private final long zzm(long j2) {
        return (j2 * 1000000) / this.zzg;
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
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000) + this.zzz);
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

    public final void zza(AudioTrack audioTrack, boolean z, int i2, int i3, int i4) {
        this.zzc = audioTrack;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = new zzdy(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        this.zzh = false;
        boolean zzP = zzamq.zzP(i2);
        this.zzq = zzP;
        this.zzi = zzP ? zzm(i4 / i3) : -9223372036854775807L;
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

    public final long zzb(boolean z) {
        long zzm;
        zzdt zzdtVar;
        zzdt zzdtVar2;
        zzdp zzdpVar;
        String str;
        long zzN;
        long zzO;
        long zzN2;
        long zzO2;
        Method method;
        zzea zzeaVar = this;
        AudioTrack audioTrack = zzeaVar.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzm2 = zzeaVar.zzm(zzo());
            if (zzm2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzeaVar.zzm >= 30000) {
                    long[] jArr = zzeaVar.zzb;
                    int i2 = zzeaVar.zzv;
                    jArr[i2] = zzm2 - nanoTime;
                    zzeaVar.zzv = (i2 + 1) % 10;
                    int i3 = zzeaVar.zzw;
                    if (i3 < 10) {
                        zzeaVar.zzw = i3 + 1;
                    }
                    zzeaVar.zzm = nanoTime;
                    zzeaVar.zzl = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = zzeaVar.zzw;
                        if (i4 >= i5) {
                            break;
                        }
                        zzeaVar.zzl = (zzeaVar.zzb[i4] / i5) + zzeaVar.zzl;
                        i4++;
                    }
                }
                if (!zzeaVar.zzh) {
                    zzdy zzdyVar = zzeaVar.zzf;
                    Objects.requireNonNull(zzdyVar);
                    if (zzdyVar.zza(nanoTime)) {
                        long zzf = zzdyVar.zzf();
                        long zzg = zzdyVar.zzg();
                        if (Math.abs(zzf - nanoTime) > 5000000) {
                            zzej zzejVar = (zzej) zzeaVar.zza;
                            zzN2 = zzejVar.zza.zzN();
                            zzO2 = zzejVar.zza.zzO();
                            StringBuilder sb = new StringBuilder(180);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzg);
                            sb.append(", ");
                            sb.append(zzf);
                            a.K(sb, ", ", nanoTime, ", ");
                            sb.append(zzm2);
                            a.K(sb, ", ", zzN2, ", ");
                            sb.append(zzO2);
                            Log.w("DefaultAudioSink", sb.toString());
                            zzdyVar.zzb();
                            str = "DefaultAudioSink";
                        } else if (Math.abs(zzeaVar.zzm(zzg) - zzm2) > 5000000) {
                            zzej zzejVar2 = (zzej) zzeaVar.zza;
                            zzN = zzejVar2.zza.zzN();
                            zzO = zzejVar2.zza.zzO();
                            StringBuilder sb2 = new StringBuilder(182);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzg);
                            sb2.append(", ");
                            sb2.append(zzf);
                            a.K(sb2, ", ", nanoTime, ", ");
                            sb2.append(zzm2);
                            a.K(sb2, ", ", zzN, ", ");
                            sb2.append(zzO);
                            str = "DefaultAudioSink";
                            Log.w(str, sb2.toString());
                            zzdyVar.zzb();
                        } else {
                            str = "DefaultAudioSink";
                            zzdyVar.zzc();
                        }
                        zzeaVar = this;
                    } else {
                        str = "DefaultAudioSink";
                    }
                    if (zzeaVar.zzq && (method = zzeaVar.zzn) != null && nanoTime - zzeaVar.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzeaVar.zzc;
                            Objects.requireNonNull(audioTrack2);
                            int i6 = zzamq.zza;
                            long intValue = (((Integer) method.invoke(audioTrack2, new Object[0])).intValue() * 1000) - zzeaVar.zzi;
                            zzeaVar.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            zzeaVar.zzo = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w(str, sb3.toString());
                                zzeaVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zzeaVar.zzn = null;
                        }
                        zzeaVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzdy zzdyVar2 = zzeaVar.zzf;
        Objects.requireNonNull(zzdyVar2);
        boolean zzd = zzdyVar2.zzd();
        if (zzd) {
            zzm = zzamq.zzJ(nanoTime2 - zzdyVar2.zzf(), zzeaVar.zzj) + zzeaVar.zzm(zzdyVar2.zzg());
        } else {
            zzm = zzeaVar.zzw == 0 ? zzeaVar.zzm(zzo()) : zzeaVar.zzl + nanoTime2;
            if (!z) {
                zzm = Math.max(0L, zzm - zzeaVar.zzo);
            }
        }
        if (zzeaVar.zzD != zzd) {
            zzeaVar.zzF = zzeaVar.zzC;
            zzeaVar.zzE = zzeaVar.zzB;
        }
        long j2 = nanoTime2 - zzeaVar.zzF;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            zzm = (((zzamq.zzJ(j2, zzeaVar.zzj) + zzeaVar.zzE) * (1000 - j3)) + (zzm * j3)) / 1000;
        }
        if (!zzeaVar.zzk) {
            long j4 = zzeaVar.zzB;
            if (zzm > j4) {
                zzeaVar.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzadx.zza(zzamq.zzK(zzadx.zza(zzm - j4), zzeaVar.zzj));
                zzej zzejVar3 = (zzej) zzeaVar.zza;
                zzdtVar = zzejVar3.zza.zzk;
                if (zzdtVar != null) {
                    zzdtVar2 = zzejVar3.zza.zzk;
                    zzdpVar = ((zzep) zzdtVar2).zza.zzc;
                    zzdpVar.zzd(currentTimeMillis);
                }
            }
        }
        zzeaVar.zzC = nanoTime2;
        zzeaVar.zzB = zzm;
        zzeaVar.zzD = zzd;
        return zzm;
    }

    public final void zzc() {
        zzdy zzdyVar = this.zzf;
        Objects.requireNonNull(zzdyVar);
        zzdyVar.zze();
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zze(long j2) {
        zzdt zzdtVar;
        long j3;
        zzdt zzdtVar2;
        zzdp zzdpVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
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
        boolean zzj = zzj(j2);
        this.zzp = zzj;
        if (z && !zzj && playState != 1) {
            zzdz zzdzVar = this.zza;
            int i2 = this.zze;
            long zza = zzadx.zza(this.zzi);
            zzej zzejVar = (zzej) zzdzVar;
            zzdtVar = zzejVar.zza.zzk;
            if (zzdtVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j3 = zzejVar.zza.zzM;
                zzdtVar2 = zzejVar.zza.zzk;
                zzdpVar = ((zzep) zzdtVar2).zza.zzc;
                zzdpVar.zze(i2, zza, elapsedRealtime - j3);
            }
        }
        return true;
    }

    public final int zzf(long j2) {
        return this.zze - ((int) (j2 - (zzo() * this.zzd)));
    }

    public final long zzg(long j2) {
        return zzadx.zza(zzm(-zzo()));
    }

    public final boolean zzh(long j2) {
        return this.zzy != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final void zzi(long j2) {
        this.zzz = zzo();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j2;
    }

    public final boolean zzj(long j2) {
        if (j2 <= zzo()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && zzo() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == -9223372036854775807L) {
            zzdy zzdyVar = this.zzf;
            Objects.requireNonNull(zzdyVar);
            zzdyVar.zze();
            return true;
        }
        return false;
    }

    public final void zzl() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }
}
