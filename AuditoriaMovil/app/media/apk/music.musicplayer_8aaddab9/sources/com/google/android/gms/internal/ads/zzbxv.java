package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
/* loaded from: classes.dex */
public final class zzbxv implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {
    public final /* synthetic */ zzbxh zza;
    public final /* synthetic */ zzbvm zzb;

    public zzbxv(zzbxy zzbxyVar, zzbxh zzbxhVar, zzbvm zzbvmVar) {
        this.zza = zzbxhVar;
        this.zzb = zzbvmVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = unifiedNativeAdMapper;
        if (unifiedNativeAdMapper2 != null) {
            try {
                this.zza.zze(new zzbwy(unifiedNativeAdMapper2));
            } catch (RemoteException e2) {
                zzcgt.zzg("", e2);
            }
            return new zzbxz(this.zzb);
        }
        zzcgt.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            zzcgt.zzg("", e3);
            return null;
        }
    }
}
