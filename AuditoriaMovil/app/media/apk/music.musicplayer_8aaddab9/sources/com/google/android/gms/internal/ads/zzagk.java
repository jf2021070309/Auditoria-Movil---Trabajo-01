package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzagk {
    public static final zzagk zza = new zzagb().zzc();
    public static final zzadw<zzagk> zzg = zzafz.zza;
    public final String zzb;
    public final zzagj zzc;
    public final zzagh zzd;
    public final zzago zze;
    public final zzagd zzf;

    public /* synthetic */ zzagk(String str, zzagd zzagdVar, zzagj zzagjVar, zzagh zzaghVar, zzago zzagoVar, zzagi zzagiVar) {
        this.zzb = str;
        this.zzc = zzagjVar;
        this.zzd = zzaghVar;
        this.zze = zzagoVar;
        this.zzf = zzagdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzagk) {
            zzagk zzagkVar = (zzagk) obj;
            return zzamq.zzc(this.zzb, zzagkVar.zzb) && this.zzf.equals(zzagkVar.zzf) && zzamq.zzc(this.zzc, zzagkVar.zzc) && zzamq.zzc(this.zzd, zzagkVar.zzd) && zzamq.zzc(this.zze, zzagkVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        zzagj zzagjVar = this.zzc;
        int hashCode2 = zzagjVar != null ? zzagjVar.hashCode() : 0;
        int hashCode3 = this.zzd.hashCode();
        return this.zze.hashCode() + ((this.zzf.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}
