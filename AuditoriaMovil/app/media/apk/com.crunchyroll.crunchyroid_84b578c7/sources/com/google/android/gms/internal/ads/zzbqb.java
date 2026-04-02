package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzbqb implements MediationAdLoadCallback {
    final /* synthetic */ zzbpn zza;
    final /* synthetic */ zzbnz zzb;
    final /* synthetic */ zzbqc zzc;

    public zzbqb(zzbqc zzbqcVar, zzbpn zzbpnVar, zzbnz zzbnzVar) {
        this.zzc = zzbqcVar;
        this.zza = zzbpnVar;
        this.zzb = zzbnzVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzbzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
            } catch (RemoteException e) {
                zzbzo.zzh("", e);
            }
            return new zzbqd(this.zzb);
        }
        zzbzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            zzbzo.zzh("", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
