package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzdaf implements zzdcq, zzdbx {
    private final Context zza;
    private final zzezz zzb;
    private final zzbzv zzc;

    public zzdaf(Context context, zzezz zzezzVar, zzbzv zzbzvVar, byte[] bArr) {
        this.zza = context;
        this.zzb = zzezzVar;
        this.zzc = zzbzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzbo(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcq
    public final void zzf() {
        zzbzw zzbzwVar = this.zzb.zzZ;
        if (zzbzwVar == null || !zzbzwVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzZ.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzZ.zzb);
    }
}
