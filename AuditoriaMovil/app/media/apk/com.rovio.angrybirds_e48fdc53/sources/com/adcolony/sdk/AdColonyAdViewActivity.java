package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyAdViewActivity extends t {
    u a;
    boolean b;

    public AdColonyAdViewActivity() {
        this.a = !a.b() ? null : a.a().q();
        this.b = this.a instanceof AdColonyNativeAdView;
    }

    @Override // com.adcolony.sdk.t, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.adcolony.sdk.t, android.app.Activity, android.content.ComponentCallbacks
    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.adcolony.sdk.t, android.app.Activity
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.adcolony.sdk.t, android.app.Activity
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.adcolony.sdk.t, android.app.Activity
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.adcolony.sdk.t, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.adcolony.sdk.t, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f = this.a == null ? 0 : this.a.b;
        super.onCreate(bundle);
        if (a.b() && this.a != null) {
            a.a().d(true);
            ac listener = this.a.getListener();
            if (listener != null && (listener instanceof AdColonyNativeAdViewListener)) {
                ((AdColonyNativeAdViewListener) listener).onOpened((AdColonyNativeAdView) this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.adcolony.sdk.t
    public void a(d dVar) {
        super.a(dVar);
        if (this.a.getExpandedContainer() != null) {
            JSONObject f = as.f(dVar.b(), "v4iap");
            JSONArray g = as.g(f, "product_ids");
            ac listener = this.a.getListener();
            if (listener != null) {
                if (this.b) {
                    ((AdColonyNativeAdViewListener) listener).onClosed((AdColonyNativeAdView) this.a);
                    if (f != null && g.length() > 0) {
                        ((AdColonyNativeAdViewListener) listener).onIAPEvent((AdColonyNativeAdView) this.a, as.c(g, 0), as.c(f, "engagement_type"));
                    }
                } else {
                    ((v) listener).b(this.a);
                    if (f != null && g.length() > 0) {
                        ((v) listener).a(this.a, as.c(g, 0), as.c(f, "engagement_type"));
                    }
                }
            }
            ((ViewGroup) this.a.getExpandedContainer().getParent()).removeView(this.a.getExpandedContainer());
            a.a().j().a(this.a.getExpandedContainer());
            this.a.setExpandedContainer(null);
            System.gc();
        }
    }
}
