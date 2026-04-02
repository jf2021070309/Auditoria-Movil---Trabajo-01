package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
/* loaded from: classes.dex */
public final class zzbxw implements SignalCallbacks {
    public final /* synthetic */ zzbxq zza;

    public zzbxw(zzbxy zzbxyVar, zzbxq zzbxqVar) {
        this.zza = zzbxqVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }
}
