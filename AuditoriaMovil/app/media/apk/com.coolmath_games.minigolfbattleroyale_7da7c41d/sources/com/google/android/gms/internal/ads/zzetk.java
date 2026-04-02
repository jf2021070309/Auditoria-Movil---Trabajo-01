package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzetk implements zzery<zzerx<JSONObject>> {
    private final JSONObject zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetk(Context context) {
        this.zza = zzcbt.zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerx<JSONObject>> zza() {
        return zzfsd.zza(new zzerx(this) { // from class: com.google.android.gms.internal.ads.zzetj
            private final zzetk zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzerx
            public final void zzf(Object obj) {
                this.zza.zzb((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
