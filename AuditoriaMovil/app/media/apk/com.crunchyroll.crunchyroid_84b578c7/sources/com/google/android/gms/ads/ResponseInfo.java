package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class ResponseInfo {
    private final zzdn zza;
    private final List zzb = new ArrayList();
    private AdapterResponseInfo zzc;

    private ResponseInfo(zzdn zzdnVar) {
        this.zza = zzdnVar;
        if (zzdnVar != null) {
            try {
                List<zzu> zzj = zzdnVar.zzj();
                if (zzj != null) {
                    for (zzu zzuVar : zzj) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza(zzuVar);
                        if (zza != null) {
                            this.zzb.add(zza);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzbzo.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdn zzdnVar2 = this.zza;
        if (zzdnVar2 != null) {
            try {
                zzu zzf = zzdnVar2.zzf();
                if (zzf != null) {
                    this.zzc = AdapterResponseInfo.zza(zzf);
                }
            } catch (RemoteException e2) {
                zzbzo.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
            }
        }
    }

    public static ResponseInfo zza(zzdn zzdnVar) {
        if (zzdnVar != null) {
            return new ResponseInfo(zzdnVar);
        }
        return null;
    }

    public static ResponseInfo zzb(zzdn zzdnVar) {
        return new ResponseInfo(zzdnVar);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public String getMediationAdapterClassName() {
        try {
            zzdn zzdnVar = this.zza;
            if (zzdnVar != null) {
                return zzdnVar.zzg();
            }
            return null;
        } catch (RemoteException e) {
            zzbzo.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    public Bundle getResponseExtras() {
        try {
            zzdn zzdnVar = this.zza;
            if (zzdnVar != null) {
                return zzdnVar.zze();
            }
        } catch (RemoteException e) {
            zzbzo.zzh("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    public String getResponseId() {
        try {
            zzdn zzdnVar = this.zza;
            if (zzdnVar != null) {
                return zzdnVar.zzi();
            }
            return null;
        } catch (RemoteException e) {
            zzbzo.zzh("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    public String toString() {
        try {
            return zzd().toString(2);
        } catch (b unused) {
            return "Error forming toString output.";
        }
    }

    @VisibleForTesting
    public final zzdn zzc() {
        return this.zza;
    }

    public final c zzd() throws b {
        c cVar = new c();
        String responseId = getResponseId();
        if (responseId == null) {
            cVar.put("Response ID", "null");
        } else {
            cVar.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            cVar.put("Mediation Adapter Class Name", "null");
        } else {
            cVar.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        a aVar = new a();
        for (AdapterResponseInfo adapterResponseInfo : this.zzb) {
            aVar.put(adapterResponseInfo.zzb());
        }
        cVar.put("Adapter Responses", aVar);
        AdapterResponseInfo adapterResponseInfo2 = this.zzc;
        if (adapterResponseInfo2 != null) {
            cVar.put("Loaded Adapter Response", adapterResponseInfo2.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            cVar.put("Response Extras", zzay.zzb().zzh(responseExtras));
        }
        return cVar;
    }
}
