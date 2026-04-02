package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoa;
/* loaded from: classes2.dex */
public final class zzy extends zzx {
    public final /* synthetic */ zzz zza;
    private final com.google.android.gms.internal.measurement.zzes zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(zzz zzzVar, String str, int i2, com.google.android.gms.internal.measurement.zzes zzesVar) {
        super(str, i2);
        this.zza = zzzVar;
        this.zzh = zzesVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzx
    public final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzc() {
        return true;
    }

    public final boolean zzd(Long l2, Long l3, com.google.android.gms.internal.measurement.zzgh zzghVar, boolean z) {
        zzoa.zzc();
        boolean zzs = this.zza.zzs.zzf().zzs(this.zzb, zzdy.zzW);
        boolean zzg = this.zzh.zzg();
        boolean zzh = this.zzh.zzh();
        boolean zzi = this.zzh.zzi();
        boolean z2 = zzg || zzh || zzi;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z2) {
            this.zza.zzs.zzay().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzj() ? Integer.valueOf(this.zzh.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzel zzb = this.zzh.zzb();
        boolean zzg2 = zzb.zzg();
        if (zzghVar.zzr()) {
            if (zzb.zzi()) {
                bool = zzx.zzj(zzx.zzh(zzghVar.zzb(), zzb.zzc()), zzg2);
            } else {
                this.zza.zzs.zzay().zzk().zzb("No number filter for long property. property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
            }
        } else if (zzghVar.zzq()) {
            if (zzb.zzi()) {
                bool = zzx.zzj(zzx.zzg(zzghVar.zza(), zzb.zzc()), zzg2);
            } else {
                this.zza.zzs.zzay().zzk().zzb("No number filter for double property. property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
            }
        } else if (!zzghVar.zzt()) {
            this.zza.zzs.zzay().zzk().zzb("User property has no value, property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
        } else if (zzb.zzk()) {
            bool = zzx.zzj(zzx.zzf(zzghVar.zzg(), zzb.zzd(), this.zza.zzs.zzay()), zzg2);
        } else if (!zzb.zzi()) {
            this.zza.zzs.zzay().zzk().zzb("No string or number filter defined. property", this.zza.zzs.zzj().zzf(zzghVar.zzf()));
        } else if (zzku.zzy(zzghVar.zzg())) {
            bool = zzx.zzj(zzx.zzi(zzghVar.zzg(), zzb.zzc()), zzg2);
        } else {
            this.zza.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzs.zzj().zzf(zzghVar.zzf()), zzghVar.zzg());
        }
        this.zza.zzs.zzay().zzj().zzb("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (!zzi || bool.booleanValue()) {
            if (!z || this.zzh.zzg()) {
                this.zze = bool;
            }
            if (bool.booleanValue() && z2 && zzghVar.zzs()) {
                long zzc = zzghVar.zzc();
                if (l2 != null) {
                    zzc = l2.longValue();
                }
                if (zzs && this.zzh.zzg() && !this.zzh.zzh() && l3 != null) {
                    zzc = l3.longValue();
                }
                if (this.zzh.zzh()) {
                    this.zzg = Long.valueOf(zzc);
                } else {
                    this.zzf = Long.valueOf(zzc);
                }
            }
            return true;
        }
        return true;
    }
}
