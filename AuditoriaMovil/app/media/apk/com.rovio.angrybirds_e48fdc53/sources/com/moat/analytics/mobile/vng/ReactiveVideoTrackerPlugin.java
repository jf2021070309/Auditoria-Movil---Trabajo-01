package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.view.View;
import com.moat.analytics.mobile.vng.x;
import java.util.Map;
/* loaded from: classes2.dex */
public class ReactiveVideoTrackerPlugin implements MoatPlugin<ReactiveVideoTracker> {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements ReactiveVideoTracker {
        a() {
        }

        @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
        public void changeTargetView(View view) {
        }

        @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
        public void dispatchEvent(MoatAdEvent moatAdEvent) {
        }

        @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
        public void setActivity(Activity activity) {
        }

        @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
        public void setPlayerVolume(Double d) {
        }

        @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
        public void stopTracking() {
        }

        @Override // com.moat.analytics.mobile.vng.ReactiveVideoTracker
        public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
            return false;
        }
    }

    public ReactiveVideoTrackerPlugin(String str) {
        this.a = str;
    }

    @Override // com.moat.analytics.mobile.vng.MoatPlugin
    /* renamed from: c */
    public ReactiveVideoTracker a() {
        return (ReactiveVideoTracker) x.a(new x.a<ReactiveVideoTracker>() { // from class: com.moat.analytics.mobile.vng.ReactiveVideoTrackerPlugin.1
            @Override // com.moat.analytics.mobile.vng.x.a
            public com.moat.analytics.mobile.vng.a.b.a<ReactiveVideoTracker> a() {
                p.a("[INFO] ", "Attempting to create ReactiveVideoTracker");
                return com.moat.analytics.mobile.vng.a.b.a.a(new y(ReactiveVideoTrackerPlugin.this.a));
            }
        }, ReactiveVideoTracker.class);
    }

    @Override // com.moat.analytics.mobile.vng.MoatPlugin
    /* renamed from: d */
    public ReactiveVideoTracker b() {
        return new a();
    }
}
