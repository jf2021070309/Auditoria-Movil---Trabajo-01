package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbxu implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    final /* synthetic */ zzbxe zza;
    final /* synthetic */ zzbvm zzb;
    final /* synthetic */ zzbxy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxu(zzbxy zzbxyVar, zzbxe zzbxeVar, zzbvm zzbvmVar) {
        this.zzc = zzbxyVar;
        this.zza = zzbxeVar;
        this.zzb = zzbvmVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        MediationInterstitialAd mediationInterstitialAd2 = mediationInterstitialAd;
        if (mediationInterstitialAd2 == null) {
            zzcgt.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zzf("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzcgt.zzg("", e);
                return null;
            }
        }
        try {
            this.zzc.zzb = mediationInterstitialAd2;
            this.zza.zze();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
        return new zzbxz(this.zzb);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
