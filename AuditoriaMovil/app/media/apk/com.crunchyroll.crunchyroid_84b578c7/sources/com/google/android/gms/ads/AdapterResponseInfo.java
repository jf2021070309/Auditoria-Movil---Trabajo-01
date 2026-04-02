package com.google.android.gms.ads;

import android.os.Bundle;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.internal.client.zzu;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class AdapterResponseInfo {
    private final zzu zza;
    private final AdError zzb;

    private AdapterResponseInfo(zzu zzuVar) {
        AdError zza;
        this.zza = zzuVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
        if (zzeVar == null) {
            zza = null;
        } else {
            zza = zzeVar.zza();
        }
        this.zzb = zza;
    }

    public static AdapterResponseInfo zza(zzu zzuVar) {
        if (zzuVar != null) {
            return new AdapterResponseInfo(zzuVar);
        }
        return null;
    }

    public AdError getAdError() {
        return this.zzb;
    }

    public String getAdSourceId() {
        return this.zza.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    public String getAdSourceName() {
        return this.zza.zze;
    }

    public String getAdapterClassName() {
        return this.zza.zza;
    }

    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (b unused) {
            return "Error forming toString output.";
        }
    }

    public final c zzb() throws b {
        c cVar = new c();
        cVar.put("Adapter", this.zza.zza);
        cVar.put("Latency", this.zza.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            cVar.put("Ad Source Name", "null");
        } else {
            cVar.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            cVar.put("Ad Source ID", "null");
        } else {
            cVar.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            cVar.put("Ad Source Instance Name", "null");
        } else {
            cVar.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            cVar.put("Ad Source Instance ID", "null");
        } else {
            cVar.put("Ad Source Instance ID", adSourceInstanceId);
        }
        c cVar2 = new c();
        for (String str : this.zza.zzd.keySet()) {
            cVar2.put(str, this.zza.zzd.get(str));
        }
        cVar.put("Credentials", cVar2);
        AdError adError = this.zzb;
        if (adError == null) {
            cVar.put("Ad Error", "null");
        } else {
            cVar.put("Ad Error", adError.zzb());
        }
        return cVar;
    }
}
