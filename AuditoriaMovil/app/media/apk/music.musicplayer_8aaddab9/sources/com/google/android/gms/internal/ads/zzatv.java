package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzatv {
    public final zzatg zza;
    public final zzats zzb;
    public final Object zzc;
    public final zzant[] zzd;

    public zzatv(zzatg zzatgVar, zzats zzatsVar, Object obj, zzant[] zzantVarArr) {
        this.zza = zzatgVar;
        this.zzb = zzatsVar;
        this.zzc = obj;
        this.zzd = zzantVarArr;
    }

    public final boolean zza(zzatv zzatvVar, int i2) {
        return zzatvVar != null && zzave.zza(this.zzb.zza(i2), zzatvVar.zzb.zza(i2)) && zzave.zza(this.zzd[i2], zzatvVar.zzd[i2]);
    }
}
