package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzekh extends zzbxp {
    private final String zza;
    private final zzbxn zzb;
    private final zzchl<JSONObject> zzc;
    private final JSONObject zzd;
    @GuardedBy("this")
    private boolean zze;

    public zzekh(String str, zzbxn zzbxnVar, zzchl<JSONObject> zzchlVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zze = false;
        this.zzc = zzchlVar;
        this.zza = str;
        this.zzb = zzbxnVar;
        try {
            jSONObject.put("adapter_version", zzbxnVar.zzf().toString());
            jSONObject.put("sdk_version", zzbxnVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public final synchronized void zzb() {
        if (this.zze) {
            return;
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final synchronized void zzf(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final synchronized void zzg(zzbcz zzbczVar) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", zzbczVar.zzb);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }
}
