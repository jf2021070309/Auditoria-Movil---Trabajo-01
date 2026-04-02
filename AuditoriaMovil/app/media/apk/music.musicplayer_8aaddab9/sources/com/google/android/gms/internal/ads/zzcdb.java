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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcdb extends RewardedAd {
    private final String zza;
    private final zzccs zzb;
    private final Context zzc;
    private final zzcdk zzd = new zzcdk();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzcdb(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzber.zzb().zzo(context, str, new zzbvd());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                return zzccsVar.zzg();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzbgz zzbgzVar = null;
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzbgzVar = zzccsVar.zzm();
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzc(zzbgzVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzccs zzccsVar = this.zzb;
            zzccp zzl = zzccsVar != null ? zzccsVar.zzl() : null;
            return zzl == null ? RewardItem.DEFAULT_REWARD : new zzcdc(zzl);
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzo(z);
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzf(new zzbik(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzn(new zzbil(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzccs zzccsVar = this.zzb;
                if (zzccsVar != null) {
                    zzccsVar.zzh(new zzcdg(serverSideVerificationOptions));
                }
            } catch (RemoteException e2) {
                zzcgt.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcgt.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zze(this.zzd);
                this.zzb.zzb(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zza(zzbhj zzbhjVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzccs zzccsVar = this.zzb;
            if (zzccsVar != null) {
                zzccsVar.zzc(zzbdk.zza.zza(this.zzc, zzbhjVar), new zzcdf(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
        }
    }
}
