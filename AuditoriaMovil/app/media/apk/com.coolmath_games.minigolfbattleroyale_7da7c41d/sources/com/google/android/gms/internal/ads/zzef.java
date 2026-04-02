package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzef {
    private final zzde[] zza;
    private final zzet zzb;
    private final zzev zzc;

    public zzef(zzde... zzdeVarArr) {
        zzet zzetVar = new zzet();
        zzev zzevVar = new zzev();
        zzde[] zzdeVarArr2 = new zzde[2];
        this.zza = zzdeVarArr2;
        System.arraycopy(zzdeVarArr, 0, zzdeVarArr2, 0, 0);
        this.zzb = zzetVar;
        this.zzc = zzevVar;
        zzde[] zzdeVarArr3 = this.zza;
        zzdeVarArr3[0] = zzetVar;
        zzdeVarArr3[1] = zzevVar;
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

    public final long zzd(long j) {
        return this.zzc.zzk(j);
    }

    public final long zze() {
        return this.zzb.zzp();
    }
}
