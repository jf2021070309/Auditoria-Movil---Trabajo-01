package e.d.a.a.a;

import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.customevent.CustomEventAdapter;
import com.google.ads.mediation.customevent.CustomEventBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcgt;
@VisibleForTesting
/* loaded from: classes.dex */
public final class a implements CustomEventBannerListener {
    public final CustomEventAdapter a;

    /* renamed from: b  reason: collision with root package name */
    public final MediationBannerListener f6034b;

    public a(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.a = customEventAdapter;
        this.f6034b = mediationBannerListener;
    }

    @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
    public final void onClick() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f6034b.onClick(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onDismissScreen() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f6034b.onDismissScreen(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onFailedToReceiveAd() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f6034b.onFailedToReceiveAd(this.a, AdRequest.ErrorCode.NO_FILL);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onLeaveApplication() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f6034b.onLeaveApplication(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventListener
    public final void onPresentScreen() {
        zzcgt.zzd("Custom event adapter called onFailedToReceiveAd.");
        this.f6034b.onPresentScreen(this.a);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
    public final void onReceivedAd(View view) {
        zzcgt.zzd("Custom event adapter called onReceivedAd.");
        CustomEventAdapter customEventAdapter = this.a;
        customEventAdapter.a = view;
        this.f6034b.onReceivedAd(customEventAdapter);
    }
}
