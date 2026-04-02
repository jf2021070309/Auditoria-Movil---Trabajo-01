package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzcte implements zzfrz<String> {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzctf zzb;

    public zzcte(zzctf zzctfVar, String str) {
        this.zzb = zzctfVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        zzfbb zzfbbVar;
        zzffr zzffrVar;
        zzfal zzfalVar;
        zzezz zzezzVar;
        zzezz zzezzVar2;
        zzfbbVar = this.zzb.zzh;
        zzffrVar = this.zzb.zzg;
        zzfalVar = this.zzb.zze;
        zzezzVar = this.zzb.zzf;
        String str = this.zza;
        zzezzVar2 = this.zzb.zzf;
        zzfbbVar.zza(zzffrVar.zzb(zzfalVar, zzezzVar, false, str, null, zzezzVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        zzfbb zzfbbVar;
        zzffr zzffrVar;
        zzfal zzfalVar;
        zzezz zzezzVar;
        zzezz zzezzVar2;
        String str2 = str;
        zzfbbVar = this.zzb.zzh;
        zzffrVar = this.zzb.zzg;
        zzfalVar = this.zzb.zze;
        zzezzVar = this.zzb.zzf;
        String str3 = this.zza;
        zzezzVar2 = this.zzb.zzf;
        zzfbbVar.zza(zzffrVar.zzb(zzfalVar, zzezzVar, false, str3, str2, zzezzVar2.zzd));
    }
}
