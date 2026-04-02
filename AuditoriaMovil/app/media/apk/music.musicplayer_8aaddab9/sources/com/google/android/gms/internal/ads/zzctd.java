package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public final class zzctd implements zzfrz<String> {
    public final /* synthetic */ zzctf zza;

    public zzctd(zzctf zzctfVar) {
        this.zza = zzctfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(String str) {
        zzfbb zzfbbVar;
        zzffr zzffrVar;
        zzfal zzfalVar;
        zzezz zzezzVar;
        zzezz zzezzVar2;
        Context context;
        String str2 = str;
        zzfbbVar = this.zza.zzh;
        zzffrVar = this.zza.zzg;
        zzfalVar = this.zza.zze;
        zzezzVar = this.zza.zzf;
        zzezzVar2 = this.zza.zzf;
        List<String> zzb = zzffrVar.zzb(zzfalVar, zzezzVar, false, "", str2, zzezzVar2.zzc);
        com.google.android.gms.ads.internal.zzt.zzc();
        context = this.zza.zza;
        zzfbbVar.zzb(zzb, true == com.google.android.gms.ads.internal.util.zzs.zzI(context) ? 2 : 1);
    }
}
