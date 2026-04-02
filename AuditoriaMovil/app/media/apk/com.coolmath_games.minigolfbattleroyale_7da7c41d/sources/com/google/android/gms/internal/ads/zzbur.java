package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbur implements zzbqe {
    final /* synthetic */ zzbus zza;
    private final zzchl zzb;

    public zzbur(zzbus zzbusVar, zzchl zzchlVar) {
        this.zza = zzbusVar;
        this.zzb = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zza(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqe
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbtv());
            } else {
                this.zzb.zzd(new zzbtv(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
