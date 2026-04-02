package com.google.android.gms.internal.measurement;
/* loaded from: classes2.dex */
public class zzkk {
    private static final zzjj zzb = zzjj.zza();
    public volatile zzlc zza;
    private volatile zzix zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkk) {
            zzkk zzkkVar = (zzkk) obj;
            zzlc zzlcVar = this.zza;
            zzlc zzlcVar2 = zzkkVar.zza;
            if (zzlcVar == null && zzlcVar2 == null) {
                return zzb().equals(zzkkVar.zzb());
            }
            if (zzlcVar == null || zzlcVar2 == null) {
                if (zzlcVar != null) {
                    zzkkVar.zzc(zzlcVar.zzbL());
                    return zzlcVar.equals(zzkkVar.zza);
                }
                zzc(zzlcVar2.zzbL());
                return this.zza.equals(zzlcVar2);
            }
            return zzlcVar.equals(zzlcVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zziv) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbt();
        }
        return 0;
    }

    public final zzix zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzix.zzb;
            } else {
                this.zzc = this.zza.zzbp();
            }
            return this.zzc;
        }
    }

    public final void zzc(zzlc zzlcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzlcVar;
                    this.zzc = zzix.zzb;
                } catch (zzkh unused) {
                    this.zza = zzlcVar;
                    this.zzc = zzix.zzb;
                }
            }
        }
    }
}
