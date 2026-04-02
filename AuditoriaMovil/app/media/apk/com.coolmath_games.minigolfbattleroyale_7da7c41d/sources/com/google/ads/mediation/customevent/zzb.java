package com.google.ads.mediation.customevent;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzcgt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
final class zzb implements CustomEventInterstitialListener {
    final /* synthetic */ CustomEventAdapter zza;
    private final CustomEventAdapter zzb;
    private final MediationInterstitialListener zzc;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.zza = customEventAdapter;
        this.zzb = customEventAdapter2;
        this.zzc = mediationInterstitialListener;
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onDismissScreen() {
        zzcgt.zzd("Custom event adapter called onDismissScreen.");
        this.zzc.onDismissScreen(this.zzb);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onFailedToReceiveAd() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.zzc.onFailedToReceiveAd(this.zzb, AdRequest.ErrorCode.NO_FILL);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onLeaveApplication() {
        zzcgt.zzd("Custom event adapter called onLeaveApplication.");
        this.zzc.onLeaveApplication(this.zzb);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onPresentScreen() {
        zzcgt.zzd("Custom event adapter called onPresentScreen.");
        this.zzc.onPresentScreen(this.zzb);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onReceivedAd() {
        zzcgt.zzd("Custom event adapter called onReceivedAd.");
        this.zzc.onReceivedAd(this.zza);
    }
}
