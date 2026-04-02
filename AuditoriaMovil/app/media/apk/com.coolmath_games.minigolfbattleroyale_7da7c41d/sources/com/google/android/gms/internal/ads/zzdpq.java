package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdpq {
    private final Executor zza;
    private final zzdpl zzb;

    public zzdpq(Executor executor, zzdpl zzdplVar) {
        this.zza = executor;
        this.zzb = zzdplVar;
    }

    public final zzfsm<List<zzdpp>> zza(JSONObject jSONObject, String str) {
        zzfsm zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfsd.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzfsd.zza(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzfsd.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zza = zzfsd.zza(new zzdpp(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zza = zzfsd.zzj(this.zzb.zza(optJSONObject, "image_value"), new zzfln(optString) { // from class: com.google.android.gms.internal.ads.zzdpo
                            private final String zza;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = optString;
                            }

                            @Override // com.google.android.gms.internal.ads.zzfln
                            public final Object apply(Object obj) {
                                return new zzdpp(this.zza, (zzblr) obj);
                            }
                        }, this.zza);
                    } else {
                        zza = zzfsd.zza(null);
                    }
                }
            }
            arrayList.add(zza);
        }
        return zzfsd.zzj(zzfsd.zzk(arrayList), zzdpn.zza, this.zza);
    }
}
