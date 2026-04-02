package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcdm extends RewardedInterstitialAd {
    private final String zza;
    private final zzccs zzb;
    private final Context zzc;
    private final zzcdk zzd = new zzcdk();
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;

    public zzcdm(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = zzber.zzb().zzo(context, str, new zzbvd());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                return zzccsVar.zzg();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzbgz zzbgzVar = null;
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzbgzVar = zzccsVar.zzm();
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzbgzVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzccs zzccsVar = this.zzb;
            zzccp zzl = zzccsVar != null ? zzccsVar.zzl() : null;
            if (zzl != null) {
                return new zzcdc(zzl);
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzo(z);
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzf(new zzbik(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzn(new zzbil(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzh(new zzcdg(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zze(this.zzd);
                this.zzb.zzb(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzbhj zzbhjVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzd(zzbdk.zza.zza(this.zzc, zzbhjVar), new zzcdl(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
        }
    }
}
