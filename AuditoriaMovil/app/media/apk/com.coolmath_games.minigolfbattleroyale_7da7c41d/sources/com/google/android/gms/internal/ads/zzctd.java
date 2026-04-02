package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzctd implements zzfrz<String> {
    final /* synthetic */ zzctf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
