package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzeif implements zzeee<zzfbi, zzefz> {
    @GuardedBy("this")
    private final Map<String, zzeef<zzfbi, zzefz>> zza = new HashMap();
    private final zzdtf zzb;

    public zzeif(zzdtf zzdtfVar) {
        this.zzb = zzdtfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeee
    public final zzeef<zzfbi, zzefz> zza(String str, JSONObject jSONObject) throws zzfaw {
        zzeef<zzfbi, zzefz> zzeefVar;
        synchronized (this) {
            zzeefVar = this.zza.get(str);
            if (zzeefVar == null) {
                zzeefVar = new zzeef<>(this.zzb.zzb(str, jSONObject), new zzefz(), str);
                this.zza.put(str, zzeefVar);
            }
        }
        return zzeefVar;
    }
}
