package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzbsl extends zzbse {
    final /* synthetic */ List zza;

    public zzbsl(zzbsn zzbsnVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final void zze(String str) {
        zzbzo.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final void zzf(List list) {
        zzbzo.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
