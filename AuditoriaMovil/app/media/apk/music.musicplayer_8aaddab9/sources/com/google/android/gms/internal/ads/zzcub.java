package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzcub implements zzgla<JSONObject> {
    private final zzgln<zzezz> zza;

    public zzcub(zzgln<zzezz> zzglnVar) {
        this.zza = zzglnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcxw) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
