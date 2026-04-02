package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzjz {
    private zzjy zza;
    private zzki zzb;

    public abstract void zzi(Object obj);

    public abstract zzka zzj(zzahw[] zzahwVarArr, zzs zzsVar, zzhf zzhfVar, zzaiq zzaiqVar) throws zzaeg;

    public final void zzk(zzjy zzjyVar, zzki zzkiVar) {
        this.zza = zzjyVar;
        this.zzb = zzkiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl() {
        zzjy zzjyVar = this.zza;
        if (zzjyVar != null) {
            zzjyVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzki zzm() {
        zzki zzkiVar = this.zzb;
        if (zzkiVar != null) {
            return zzkiVar;
        }
        throw null;
    }
}
