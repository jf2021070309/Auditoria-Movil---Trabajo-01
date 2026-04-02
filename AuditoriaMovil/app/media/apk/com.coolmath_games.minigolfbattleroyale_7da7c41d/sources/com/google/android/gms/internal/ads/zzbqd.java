package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbqd implements zzbqe {
    final /* synthetic */ zzchl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqd(zzbqf zzbqfVar, zzchl zzchlVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zzb(String str) {
        this.zza.zzd(new zzbtv(str));
    }
}
