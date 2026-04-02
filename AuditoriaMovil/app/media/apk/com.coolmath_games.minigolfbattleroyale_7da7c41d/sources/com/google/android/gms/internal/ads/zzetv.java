package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzetv implements zzerx<JSONObject> {
    private final Bundle zza;

    public zzetv(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzerx
    public final /* bridge */ /* synthetic */ void zzf(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbx.zzg(com.google.android.gms.ads.internal.util.zzbx.zzg(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.zzt.zzc().zzl(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
