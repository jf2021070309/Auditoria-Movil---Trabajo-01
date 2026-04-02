package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbxx implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    final /* synthetic */ zzbxk zza;
    final /* synthetic */ zzbvm zzb;
    final /* synthetic */ zzbxy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxx(zzbxy zzbxyVar, zzbxk zzbxkVar, zzbvm zzbvmVar) {
        this.zzc = zzbxyVar;
        this.zza = zzbxkVar;
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
    public final /* bridge */ /* synthetic */ MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        MediationRewardedAd mediationRewardedAd2 = mediationRewardedAd;
        if (mediationRewardedAd2 == null) {
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
            this.zzc.zzc = mediationRewardedAd2;
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
