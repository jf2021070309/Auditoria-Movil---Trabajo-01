package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ads.zzcgt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class zza implements CustomEventBannerListener {
    private final CustomEventAdapter zza;
    private final MediationBannerListener zzb;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationBannerListener;
    }

    @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
    public final void onClick() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.zzb.onClick(this.zza);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onDismissScreen() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.zzb.onDismissScreen(this.zza);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onFailedToReceiveAd() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.zzb.onFailedToReceiveAd(this.zza, AdRequest.ErrorCode.NO_FILL);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onLeaveApplication() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.zzb.onLeaveApplication(this.zza);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onPresentScreen() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.zzb.onPresentScreen(this.zza);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
    public final void onReceivedAd(View view) {
        zzcgt.zzd("Custom event adapter called onReceivedAd.");
        this.zza.zzc = view;
        this.zzb.onReceivedAd(this.zza);
    }
}
