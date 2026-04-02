package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbvt extends RewardedAd {
    private final String zza;
    private final zzbvk zzb;
    private final Context zzc;
    private final zzbwc zzd = new zzbwc();
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;

    public zzbvt(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzay.zza().zzq(context, str, new zzbnq());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                return zzbvkVar.zzb();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
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
        zzdn zzdnVar = null;
        try {
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzdnVar = zzbvkVar.zzc();
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        zzbvh zzbvhVar;
        try {
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzbvhVar = zzbvkVar.zzd();
            } else {
                zzbvhVar = null;
            }
            if (zzbvhVar == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new zzbvu(zzbvhVar);
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
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
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzbvkVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzbvkVar.zzi(new zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzbvkVar.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbvk zzbvkVar = this.zzb;
                if (zzbvkVar != null) {
                    zzbvkVar.zzl(new zzbvy(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzbzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzbzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzbvkVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbvk zzbvkVar = this.zzb;
            if (zzbvkVar != null) {
                zzbvkVar.zzf(zzp.zza.zza(this.zzc, zzdxVar), new zzbvx(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
