package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class zzebf implements zzfdw {
    public static final zzfdw zza = new zzebf();

    private zzebf() {
    }

    @Override // com.google.android.gms.internal.ads.zzfdw
    public final Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
