package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzka {
    public final int zza;
    public final zzahx[] zzb;
    public final Object zzc;
    public final zzjg[] zzd;

    public zzka(zzahx[] zzahxVarArr, zzjg[] zzjgVarArr, Object obj, byte[] bArr) {
        this.zzb = zzahxVarArr;
        this.zzd = (zzjg[]) zzjgVarArr.clone();
        this.zzc = obj;
        this.zza = zzahxVarArr.length;
    }

    public final boolean zza(int i2) {
        return this.zzb[i2] != null;
    }

    public final boolean zzb(zzka zzkaVar, int i2) {
        return zzkaVar != null && zzamq.zzc(this.zzb[i2], zzkaVar.zzb[i2]) && zzamq.zzc(this.zzd[i2], zzkaVar.zzd[i2]);
    }
}
