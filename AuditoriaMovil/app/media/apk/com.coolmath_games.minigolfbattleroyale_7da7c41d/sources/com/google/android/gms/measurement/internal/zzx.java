package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzog;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzx extends zzw {
    final /* synthetic */ zzy zza;
    private final com.google.android.gms.internal.measurement.zzes zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzy zzyVar, String str, int i, com.google.android.gms.internal.measurement.zzes zzesVar) {
        super(str, i);
        this.zza = zzyVar;
        this.zzh = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzw
    public final int zza() {
        return this.zzh.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzw
    public final boolean zzb() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzw
    public final boolean zzc() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(Long l, Long l2, com.google.android.gms.internal.measurement.zzgh zzghVar, boolean z) {
        zzog.zzb();
        boolean zzn = this.zza.zzs.zzc().zzn(this.zzb, zzea.zzX);
        boolean zze = this.zzh.zze();
        boolean zzf = this.zzh.zzf();
        boolean zzh = this.zzh.zzh();
        Object[] objArr = (zze || zzf || zzh) ? 1 : null;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (!z || objArr != null) {
            com.google.android.gms.internal.measurement.zzel zzd = this.zzh.zzd();
            boolean zzf2 = zzd.zzf();
            if (zzghVar.zzf()) {
                if (!zzd.zzc()) {
                    this.zza.zzs.zzau().zze().zzb("No number filter for long property. property", this.zza.zzs.zzm().zze(zzghVar.zzc()));
                } else {
                    bool = zze(zzg(zzghVar.zzg(), zzd.zzd()), zzf2);
                }
            } else if (zzghVar.zzh()) {
                if (!zzd.zzc()) {
                    this.zza.zzs.zzau().zze().zzb("No number filter for double property. property", this.zza.zzs.zzm().zze(zzghVar.zzc()));
                } else {
                    bool = zze(zzh(zzghVar.zzi(), zzd.zzd()), zzf2);
                }
            } else if (zzghVar.zzd()) {
                if (!zzd.zza()) {
                    if (!zzd.zzc()) {
                        this.zza.zzs.zzau().zze().zzb("No string or number filter defined. property", this.zza.zzs.zzm().zze(zzghVar.zzc()));
                    } else if (zzkp.zzl(zzghVar.zze())) {
                        bool = zze(zzi(zzghVar.zze(), zzd.zzd()), zzf2);
                    } else {
                        this.zza.zzs.zzau().zze().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzs.zzm().zze(zzghVar.zzc()), zzghVar.zze());
                    }
                } else {
                    bool = zze(zzf(zzghVar.zze(), zzd.zzb(), this.zza.zzs.zzau()), zzf2);
                }
            } else {
                this.zza.zzs.zzau().zze().zzb("User property has no value, property", this.zza.zzs.zzm().zze(zzghVar.zzc()));
            }
            this.zza.zzs.zzau().zzk().zzb("Property filter result", bool == null ? "null" : bool);
            if (bool == null) {
                return false;
            }
            this.zzd = true;
            if (!zzh || bool.booleanValue()) {
                if (!z || this.zzh.zze()) {
                    this.zze = bool;
                }
                if (bool.booleanValue() && objArr != null && zzghVar.zza()) {
                    long zzb = zzghVar.zzb();
                    if (l != null) {
                        zzb = l.longValue();
                    }
                    if (zzn && this.zzh.zze() && !this.zzh.zzf() && l2 != null) {
                        zzb = l2.longValue();
                    }
                    if (this.zzh.zzf()) {
                        this.zzg = Long.valueOf(zzb);
                    } else {
                        this.zzf = Long.valueOf(zzb);
                    }
                }
                return true;
            }
            return true;
        }
        this.zza.zzs.zzau().zzk().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zza() ? Integer.valueOf(this.zzh.zzb()) : null);
        return true;
    }
}
