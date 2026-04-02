package com.moat.analytics.mobile.vng;

import android.os.Handler;
import android.view.View;
import com.facebook.internal.AnalyticsEvents;
import com.moat.analytics.mobile.vng.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
abstract class c<PlayerOrIMAAd> extends b {
    static final MoatAdEventType[] f = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};
    final Map<MoatAdEventType, Integer> g;
    final Handler h;
    Map<String, String> i;
    WeakReference<PlayerOrIMAAd> j;
    WeakReference<View> k;
    private boolean l;
    private Double m;
    private final g n;
    private final String o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        super(null, false, true);
        p.a(3, "BaseVideoTracker", this, "Initializing.");
        this.o = str;
        this.n = new g(a.a(), g.a.VIDEO);
        this.n.a(str);
        super.a(this.n.b);
        super.a(this.n.a);
        this.g = new HashMap();
        this.h = new Handler();
        this.l = false;
        this.m = Double.valueOf(1.0d);
    }

    private void b(MoatAdEvent moatAdEvent) {
        JSONObject a = a(moatAdEvent);
        p.a(3, "BaseVideoTracker", this, String.format("Received event: %s", a.toString()));
        p.a("[SUCCESS] ", a() + String.format(" Received event: %s", a.toString()));
        this.a.a(this.n.c, a);
        MoatAdEventType moatAdEventType = moatAdEvent.d;
        if (moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED) {
            this.g.put(moatAdEventType, 1);
            h();
        }
    }

    private void j() {
        Map<String, Object> g = g();
        Integer num = (Integer) g.get("width");
        Integer num2 = (Integer) g.get("height");
        Integer num3 = (Integer) g.get("duration");
        p.a(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", num2, num, num3));
        this.n.a(this.o, this.i, num, num2, num3);
        super.changeTargetView(this.k.get());
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.c.doubleValue())) {
            try {
                moatAdEvent.c = Double.valueOf(s.a());
            } catch (Exception e) {
                moatAdEvent.c = Double.valueOf(1.0d);
            }
        }
        p.a(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "adVolume before adjusting for player volume %f", moatAdEvent.c));
        moatAdEvent.c = Double.valueOf(moatAdEvent.c.doubleValue() * this.m.doubleValue());
        p.a(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "adVolume after adjusting for player volume %f", moatAdEvent.c));
        return new JSONObject(moatAdEvent.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Integer num, Integer num2) {
        return ((double) Math.abs(num2.intValue() - num.intValue())) <= Math.min(750.0d, ((double) num2.intValue()) * 0.05d);
    }

    public boolean a(Map<String, String> map, PlayerOrIMAAd playerorimaad, View view) {
        boolean z = true;
        try {
            if (this.e) {
                p.a(3, "BaseVideoTracker", this, "trackVideoAd already called");
                p.a("[ERROR] ", a() + " trackVideoAd can't be called twice");
                z = false;
            }
            if (map == null) {
                p.a(3, "BaseVideoTracker", this, "trackVideoAd received null adIds object. Not tracking.");
                p.a("[ERROR] ", a() + " trackVideoAd failed, received null adIds object");
                z = false;
            }
            if (view == null) {
                p.a(3, "BaseVideoTracker", this, "trackVideoAd received null video view instance");
            }
            if (playerorimaad == null) {
                p.a(3, "BaseVideoTracker", this, "trackVideoAd received null ad instance. Not tracking.");
                p.a("[ERROR] ", a() + " trackVideoAd failed, received null ad instance");
                z = false;
            }
            if (z) {
                Object[] objArr = new Object[3];
                objArr[0] = new JSONObject(map).toString();
                objArr[1] = playerorimaad.toString();
                objArr[2] = view != null ? view.getClass().getSimpleName() + "@" + view.hashCode() : "null";
                p.a(3, "BaseVideoTracker", this, String.format("trackVideoAd tracking ids: %s | ad: %s | view: %s", objArr));
                StringBuilder append = new StringBuilder().append(a());
                Object[] objArr2 = new Object[3];
                objArr2[0] = new JSONObject(map).toString();
                objArr2[1] = playerorimaad.toString();
                objArr2[2] = view != null ? view.getClass().getSimpleName() + "@" + view.hashCode() : "null";
                p.a("[SUCCESS] ", append.append(String.format(" trackVideoAd succeeded with ids: %s | ad: %s | view: %s", objArr2)).toString());
                this.i = map;
                this.j = new WeakReference<>(playerorimaad);
                this.k = new WeakReference<>(view);
                j();
            }
        } catch (Exception e) {
            m.a(e);
            z = false;
        }
        p.a(3, "BaseVideoTracker", this, "Attempt to start tracking ad was " + (z ? "" : "un") + "successful.");
        return z;
    }

    @Override // com.moat.analytics.mobile.vng.b
    public void changeTargetView(View view) {
        p.a(3, "BaseVideoTracker", this, "changing view to " + (view != null ? view.getClass().getSimpleName() + "@" + view.hashCode() : "null"));
        this.k = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e) {
            m.a(e);
        }
    }

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            b(moatAdEvent);
        } catch (Exception e) {
            m.a(e);
        }
    }

    protected abstract Map<String, Object> g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        if (this.l) {
            return;
        }
        this.h.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.vng.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    p.a(3, "BaseVideoTracker", this, "Shutting down.");
                    c.this.n.a();
                } catch (Exception e) {
                    m.a(e);
                }
            }
        }, 500L);
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.g.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.g.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.g.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    public void setPlayerVolume(Double d) {
        if (d.equals(this.m)) {
            return;
        }
        p.a(3, "BaseVideoTracker", this, String.format(Locale.ROOT, "player volume changed to %f ", d));
        this.m = d;
        dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.a));
    }

    @Override // com.moat.analytics.mobile.vng.b
    public void stopTracking() {
        try {
            boolean c = super.c();
            p.a(c ? "[SUCCESS] " : "[ERROR] ", a() + " stopTracking " + (c ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed") + " for " + e());
            h();
        } catch (Exception e) {
            m.a(e);
        }
    }
}
