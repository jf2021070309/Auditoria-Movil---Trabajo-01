package e.d.a.a.a;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.ads.mediation.customevent.CustomEventInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgt;
@VisibleForTesting
/* loaded from: classes.dex */
public final class b implements CustomEventInterstitialListener {
    public final CustomEventAdapter a;

    /* renamed from: b  reason: collision with root package name */
    public final MediationInterstitialListener f6035b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CustomEventAdapter f6036c;

    public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.f6036c = customEventAdapter;
        this.a = customEventAdapter2;
        this.f6035b = mediationInterstitialListener;
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onDismissScreen() {
        zzcgt.zzd("Custom event adapter called onDismissScreen.");
        this.f6035b.onDismissScreen(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onFailedToReceiveAd() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f6035b.onFailedToReceiveAd(this.a, AdRequest.ErrorCode.NO_FILL);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onLeaveApplication() {
        zzcgt.zzd("Custom event adapter called onLeaveApplication.");
        this.f6035b.onLeaveApplication(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onPresentScreen() {
        zzcgt.zzd("Custom event adapter called onPresentScreen.");
        this.f6035b.onPresentScreen(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onReceivedAd() {
        zzcgt.zzd("Custom event adapter called onReceivedAd.");
        this.f6035b.onReceivedAd(this.f6036c);
    }
}
