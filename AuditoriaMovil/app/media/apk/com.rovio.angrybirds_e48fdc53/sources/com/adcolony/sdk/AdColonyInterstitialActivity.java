package com.adcolony.sdk;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyInterstitialActivity extends t {
    AdColonyInterstitial a;

    public AdColonyInterstitialActivity() {
        this.a = !a.b() ? null : a.a().r();
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
        this.f = this.a == null ? 0 : this.a.e();
        super.onCreate(bundle);
        if (a.b() && this.a != null && this.a.getListener() != null) {
            this.a.getListener().onOpened(this.a);
        }
    }

    @Override // com.adcolony.sdk.t
    void a(d dVar) {
        super.a(dVar);
        ab j = a.a().j();
        ad remove = j.e().remove(this.g);
        if (remove != null) {
            for (MediaPlayer mediaPlayer : remove.c().c().values()) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
            remove.d().a().autoPause();
            remove.d().a().release();
        }
        JSONObject f = as.f(dVar.b(), "v4iap");
        JSONArray g = as.g(f, "product_ids");
        if (f != null && this.a != null && this.a.getListener() != null && g.length() > 0) {
            this.a.getListener().onIAPEvent(this.a, as.c(g, 0), as.c(f, "engagement_type"));
        }
        j.a(this.e);
        if (this.a != null) {
            j.c().remove(this.a.f());
        }
        if (this.a != null && this.a.getListener() != null) {
            this.a.getListener().onClosed(this.a);
            this.a.a((aa) null);
            this.a.setListener(null);
            this.a = null;
        }
        au.d.b("finish_ad call finished");
        System.gc();
    }
}
