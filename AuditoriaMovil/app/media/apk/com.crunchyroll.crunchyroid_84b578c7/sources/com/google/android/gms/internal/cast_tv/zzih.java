package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public class zzih {
    private static final zzhh zzb = zzhh.zza;
    protected volatile zzjc zza;
    private volatile zzgu zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzih)) {
            return false;
        }
        zzih zzihVar = (zzih) obj;
        zzjc zzjcVar = this.zza;
        zzjc zzjcVar2 = zzihVar.zza;
        if (zzjcVar == null && zzjcVar2 == null) {
            return zzb().equals(zzihVar.zzb());
        }
        if (zzjcVar != null && zzjcVar2 != null) {
            return zzjcVar.equals(zzjcVar2);
        }
        if (zzjcVar != null) {
            zzihVar.zzc(zzjcVar.zzl());
            return zzjcVar.equals(zzihVar.zza);
        }
        zzc(zzjcVar2.zzl());
        return this.zza.equals(zzjcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgr) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzp();
        }
        return 0;
    }

    public final zzgu zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzgu.zzb;
            } else {
                this.zzc = this.zza.zzG();
            }
            return this.zzc;
        }
    }

    public final void zzc(zzjc zzjcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzjcVar;
                    this.zzc = zzgu.zzb;
                } catch (zzie unused) {
                    this.zza = zzjcVar;
                    this.zzc = zzgu.zzb;
                }
            }
        }
    }
}
