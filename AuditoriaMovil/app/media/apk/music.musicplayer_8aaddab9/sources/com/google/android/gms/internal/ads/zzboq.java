package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzboq implements zzbpr<Object> {
    private final zzbor zza;

    public zzboq(zzbor zzborVar) {
        this.zza = zzborVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        if (this.zza == null) {
            return;
        }
        String str = map.get("name");
        if (str == null) {
            zzcgt.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbx.zzk(new JSONObject(map.get("info")));
            } catch (JSONException e2) {
                zzcgt.zzg("Failed to convert ad metadata to JSON.", e2);
            }
        }
        if (bundle == null) {
            zzcgt.zzf("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
