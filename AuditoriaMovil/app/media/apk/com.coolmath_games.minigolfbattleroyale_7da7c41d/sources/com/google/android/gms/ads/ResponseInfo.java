package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdp;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final zzbgz zza;
    private final List<AdapterResponseInfo> zzb = new ArrayList();

    private ResponseInfo(zzbgz zzbgzVar) {
        zzbgz zzbgzVar2;
        this.zza = zzbgzVar;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue() || (zzbgzVar2 = this.zza) == null) {
            return;
        }
        try {
            List<zzbdp> zzg = zzbgzVar2.zzg();
            if (zzg != null) {
                for (zzbdp zzbdpVar : zzg) {
                    AdapterResponseInfo zza = AdapterResponseInfo.zza(zzbdpVar);
                    if (zza != null) {
                        this.zzb.add(zza);
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgt.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
        }
    }

    public static ResponseInfo zzb(zzbgz zzbgzVar) {
        if (zzbgzVar != null) {
            return new ResponseInfo(zzbgzVar);
        }
        return null;
    }

    public static ResponseInfo zzc(zzbgz zzbgzVar) {
        return new ResponseInfo(zzbgzVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public String getMediationAdapterClassName() {
        try {
            zzbgz zzbgzVar = this.zza;
            if (zzbgzVar != null) {
                return zzbgzVar.zze();
            }
            return null;
        } catch (RemoteException e) {
            zzcgt.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public String getResponseId() {
        try {
            zzbgz zzbgzVar = this.zza;
            if (zzbgzVar != null) {
                return zzbgzVar.zzf();
            }
            return null;
        } catch (RemoteException e) {
            zzcgt.zzg("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public String toString() {
        try {
            return zza().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        for (AdapterResponseInfo adapterResponseInfo : this.zzb) {
            jSONArray.put(adapterResponseInfo.zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }
}
