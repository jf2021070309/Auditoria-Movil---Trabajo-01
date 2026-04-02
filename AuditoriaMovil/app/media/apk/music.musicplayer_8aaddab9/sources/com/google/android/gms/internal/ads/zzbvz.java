package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
/* loaded from: classes.dex */
public final class zzbvz implements MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> {
    public final /* synthetic */ zzbvm zza;
    public final /* synthetic */ Adapter zzb;
    public final /* synthetic */ zzbwf zzc;

    public zzbvz(zzbwf zzbwfVar, zzbvm zzbvmVar, Adapter adapter) {
        this.zzc = zzbwfVar;
        this.zza = zzbvmVar;
        this.zzb = adapter;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(message).length() + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            zzcgt.zzd(sb.toString());
            this.zza.zzx(adError.zza());
            this.zza.zzw(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ MediationBannerAdCallback onSuccess(MediationInterscrollerAd mediationInterscrollerAd) {
        try {
            this.zzc.zzi = mediationInterscrollerAd;
            this.zza.zzj();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
        return new zzbvx(this.zza);
    }
}
