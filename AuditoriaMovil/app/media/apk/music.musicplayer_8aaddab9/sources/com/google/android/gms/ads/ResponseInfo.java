package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
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
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final zzbgz zza;
    private final List<AdapterResponseInfo> zzb = new ArrayList();

    private ResponseInfo(zzbgz zzbgzVar) {
        this.zza = zzbgzVar;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue() || zzbgzVar == null) {
            return;
        }
        try {
            List<zzbdp> zzg = zzbgzVar.zzg();
            if (zzg != null) {
                for (zzbdp zzbdpVar : zzg) {
                    AdapterResponseInfo zza = AdapterResponseInfo.zza(zzbdpVar);
                    if (zza != null) {
                        this.zzb.add(zza);
                    }
                }
            }
        } catch (RemoteException e2) {
            zzcgt.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e2);
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

    @RecentlyNullable
    public String getMediationAdapterClassName() {
        try {
            zzbgz zzbgzVar = this.zza;
            if (zzbgzVar != null) {
                return zzbgzVar.zze();
            }
            return null;
        } catch (RemoteException e2) {
            zzcgt.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            return null;
        }
    }

    @RecentlyNullable
    public String getResponseId() {
        try {
            zzbgz zzbgzVar = this.zza;
            if (zzbgzVar != null) {
                return zzbgzVar.zzf();
            }
            return null;
        } catch (RemoteException e2) {
            zzcgt.zzg("Could not forward getResponseId to ResponseInfo.", e2);
            return null;
        }
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return zza().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @RecentlyNonNull
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
