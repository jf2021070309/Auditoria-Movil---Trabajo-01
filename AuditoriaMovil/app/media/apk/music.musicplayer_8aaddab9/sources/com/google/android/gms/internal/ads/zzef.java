package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzef {
    private final zzde[] zza;
    private final zzet zzb;
    private final zzev zzc;

    public zzef(zzde... zzdeVarArr) {
        zzet zzetVar = new zzet();
        zzev zzevVar = new zzev();
        this.zza = r2;
        System.arraycopy(zzdeVarArr, 0, r2, 0, 0);
        this.zzb = zzetVar;
        this.zzc = zzevVar;
        zzde[] zzdeVarArr2 = {zzetVar, zzevVar};
    }

    public final zzde[] zza() {
        return this.zza;
    }

    public final zzahf zzb(zzahf zzahfVar) {
        this.zzc.zzi(zzahfVar.zzb);
        this.zzc.zzj(zzahfVar.zzc);
        return zzahfVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzo(z);
        return z;
    }

    public final long zzd(long j2) {
        return this.zzc.zzk(j2);
    }

    public final long zze() {
        return this.zzb.zzp();
    }
}
