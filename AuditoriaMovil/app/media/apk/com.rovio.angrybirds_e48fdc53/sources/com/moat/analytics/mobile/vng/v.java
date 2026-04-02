package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.app.Application;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.vng.NativeDisplayTracker;
import java.util.Map;
/* loaded from: classes2.dex */
abstract class v {

    /* loaded from: classes2.dex */
    public static class a extends MoatAnalytics {
        @Override // com.moat.analytics.mobile.vng.MoatAnalytics
        public void prepareNativeDisplayTracking(String str) {
        }

        @Override // com.moat.analytics.mobile.vng.MoatAnalytics
        public void start(Application application) {
        }

        @Override // com.moat.analytics.mobile.vng.MoatAnalytics
        public void start(MoatOptions moatOptions, Application application) {
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends MoatFactory {
        @Override // com.moat.analytics.mobile.vng.MoatFactory
        public <T> T createCustomTracker(MoatPlugin<T> moatPlugin) {
            return null;
        }

        @Override // com.moat.analytics.mobile.vng.MoatFactory
        public NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map) {
            return new c();
        }

        @Override // com.moat.analytics.mobile.vng.MoatFactory
        public NativeVideoTracker createNativeVideoTracker(String str) {
            return new d();
        }

        @Override // com.moat.analytics.mobile.vng.MoatFactory
        public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
            return new e();
        }

        @Override // com.moat.analytics.mobile.vng.MoatFactory
        public WebAdTracker createWebAdTracker(WebView webView) {
            return new e();
        }
    }

    /* loaded from: classes2.dex */
    static class c implements NativeDisplayTracker {
        @Override // com.moat.analytics.mobile.vng.NativeDisplayTracker
        public void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        }

        @Override // com.moat.analytics.mobile.vng.NativeDisplayTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.vng.NativeDisplayTracker
        public void startTracking() {
        }

        @Override // com.moat.analytics.mobile.vng.NativeDisplayTracker
        public void stopTracking() {
        }
    }

    /* loaded from: classes2.dex */
    static class d implements NativeVideoTracker {
        @Override // com.moat.analytics.mobile.vng.NativeVideoTracker
        public void changeTargetView(View view) {
        }

        @Override // com.moat.analytics.mobile.vng.NativeVideoTracker
        public void dispatchEvent(MoatAdEvent moatAdEvent) {
        }

        @Override // com.moat.analytics.mobile.vng.NativeVideoTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.vng.NativeVideoTracker
        public void setPlayerVolume(Double d) {
        }

        @Override // com.moat.analytics.mobile.vng.NativeVideoTracker
        public void stopTracking() {
        }

        @Override // com.moat.analytics.mobile.vng.NativeVideoTracker
        public boolean trackVideoAd(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    static class e implements WebAdTracker {
        @Override // com.moat.analytics.mobile.vng.WebAdTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.vng.WebAdTracker
        public void startTracking() {
        }

        @Override // com.moat.analytics.mobile.vng.WebAdTracker
        public void stopTracking() {
        }
    }

    v() {
    }
}
