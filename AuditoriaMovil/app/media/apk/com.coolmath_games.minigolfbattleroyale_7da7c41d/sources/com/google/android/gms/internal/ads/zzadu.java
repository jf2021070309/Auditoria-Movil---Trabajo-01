package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzadu implements zzahp {
    protected final zzaip zza = new zzaip();

    public final boolean zza() {
        zzaiq zzF = zzF();
        if (!zzF.zzt()) {
            int zzv = zzv();
            zzn();
            zzo();
            if (zzF.zzc(zzv, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        zzaiq zzF = zzF();
        if (!zzF.zzt()) {
            int zzv = zzv();
            zzn();
            zzo();
            if (zzF.zzb(zzv, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc() {
        zzaiq zzF = zzF();
        return !zzF.zzt() && zzF.zzf(zzv(), this.zza, 0L).zzb();
    }

    public final boolean zzd() {
        zzaiq zzF = zzF();
        return !zzF.zzt() && zzF.zzf(zzv(), this.zza, 0L).zzg;
    }
}
