package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import ch.qos.logback.core.spi.AbstractComponentTracker;
/* loaded from: classes.dex */
public final class zzdy {
    private final zzdx zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzdy(AudioTrack audioTrack) {
        if (zzamq.zza >= 19) {
            this.zza = new zzdx(audioTrack);
            zze();
            return;
        }
        this.zza = null;
        zzh(3);
    }

    private final void zzh(int i2) {
        this.zzb = i2;
        long j2 = AbstractComponentTracker.LINGERING_TIMEOUT;
        if (i2 == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        } else if (i2 == 1) {
            this.zzd = AbstractComponentTracker.LINGERING_TIMEOUT;
            return;
        } else {
            j2 = (i2 == 2 || i2 == 3) ? 10000000L : 500000L;
        }
        this.zzd = j2;
    }

    @TargetApi(19)
    public final boolean zza(long j2) {
        zzdx zzdxVar = this.zza;
        if (zzdxVar != null && j2 - this.zze >= this.zzd) {
            this.zze = j2;
            boolean zza = zzdxVar.zza();
            int i2 = this.zzb;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3 && zza) {
                            zze();
                            return true;
                        }
                    } else if (!zza) {
                        zze();
                        return false;
                    }
                } else if (!zza) {
                    zze();
                } else if (this.zza.zzc() > this.zzf) {
                    zzh(2);
                    return true;
                }
            } else if (zza) {
                if (this.zza.zzb() < this.zzc) {
                    return false;
                }
                this.zzf = this.zza.zzc();
                zzh(1);
                return true;
            } else if (j2 - this.zzc > 500000) {
                zzh(3);
            }
            return zza;
        }
        return false;
    }

    public final void zzb() {
        zzh(4);
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zze();
        }
    }

    public final boolean zzd() {
        return this.zzb == 2;
    }

    public final void zze() {
        if (this.zza != null) {
            zzh(0);
        }
    }

    @TargetApi(19)
    public final long zzf() {
        zzdx zzdxVar = this.zza;
        if (zzdxVar != null) {
            return zzdxVar.zzb();
        }
        return -9223372036854775807L;
    }

    @TargetApi(19)
    public final long zzg() {
        zzdx zzdxVar = this.zza;
        if (zzdxVar != null) {
            return zzdxVar.zzc();
        }
        return -1L;
    }
}
