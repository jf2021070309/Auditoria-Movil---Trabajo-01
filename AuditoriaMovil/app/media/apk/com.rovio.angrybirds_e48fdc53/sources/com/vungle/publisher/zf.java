package com.vungle.publisher;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.widget.VideoView;
import com.moat.analytics.mobile.vng.MoatAdEvent;
import com.moat.analytics.mobile.vng.MoatAdEventType;
import com.moat.analytics.mobile.vng.MoatAnalytics;
import com.moat.analytics.mobile.vng.MoatFactory;
import com.moat.analytics.mobile.vng.MoatOptions;
import com.moat.analytics.mobile.vng.ReactiveVideoTracker;
import com.moat.analytics.mobile.vng.ReactiveVideoTrackerPlugin;
import com.vungle.publisher.ji;
import com.vungle.publisher.log.Logger;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class zf {
    private static final String c = "UNKNOWN";
    @Inject
    Context a;
    @Inject
    com.vungle.publisher.env.o b;
    private AtomicBoolean d = new AtomicBoolean();
    private ReactiveVideoTracker e;
    private HashMap<String, String> f;

    public void a() {
        if (this.b.g() && Build.VERSION.SDK_INT >= 16) {
            MoatOptions moatOptions = new MoatOptions();
            moatOptions.disableAdIdCollection = true;
            moatOptions.disableLocationServices = true;
            moatOptions.loggingEnabled = true;
            MoatAnalytics.getInstance().start(moatOptions, (Application) this.a);
            this.b.c(true);
            return;
        }
        Logger.d("VungleMoatAnalytics", "Moat not initialized.");
    }

    public void a(jh<?, ?, ?> jhVar, String str) {
        List<String> a = jhVar.a((jf) ji.a.moat);
        if (this.b.g() && this.b.h() && a != null && a.size() > 0) {
            a(jhVar, str, a.get(0));
            this.e = (ReactiveVideoTracker) MoatFactory.create().createCustomTracker(new ReactiveVideoTrackerPlugin("vunglenativevideo893259554489"));
            return;
        }
        this.e = null;
        this.d.set(false);
        Logger.v("VungleMoatAnalytics", "Moat tracking is not enabled. Ignoring - createVideoTracker.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.vungle.publisher.jh<?, ?, ?> r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            r5 = 124(0x7c, float:1.74E-43)
            r6 = -1
            r1 = 0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f = r0
            boolean r0 = com.vungle.publisher.zk.a(r10)
            if (r0 == 0) goto L19
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f
            java.lang.String r1 = "zMoatVASTIDs"
            r0.put(r1, r10)
        L18:
            return
        L19:
            java.lang.String r0 = r8.e()
            if (r0 == 0) goto L85
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L81
            r3 = 3
            java.lang.String r0 = r0.substring(r3)     // Catch: org.json.JSONException -> L81
            r2.<init>(r0)     // Catch: org.json.JSONException -> L81
            java.lang.String r0 = "app_id"
            java.lang.String r0 = com.vungle.publisher.ra.f(r2, r0)     // Catch: org.json.JSONException -> L81
        L2f:
            java.lang.String r3 = r8.n()
            int r4 = r3.indexOf(r5)
            if (r4 == r6) goto L93
            int r2 = r4 + 1
            int r5 = r3.indexOf(r5, r2)
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r4)
            if (r5 == r6) goto L4c
            int r1 = r4 + 1
            java.lang.String r1 = r3.substring(r1, r5)
        L4c:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r7.f
            java.lang.String r4 = "level1"
            boolean r5 = com.vungle.publisher.zk.a(r0)
            if (r5 == 0) goto L87
        L56:
            r3.put(r4, r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f
            java.lang.String r3 = "level2"
            boolean r4 = com.vungle.publisher.zk.a(r2)
            if (r4 == 0) goto L8a
        L63:
            r0.put(r3, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f
            java.lang.String r2 = "level3"
            boolean r3 = com.vungle.publisher.zk.a(r1)
            if (r3 == 0) goto L8d
        L70:
            r0.put(r2, r1)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.f
            java.lang.String r1 = "level4"
            boolean r2 = com.vungle.publisher.zk.a(r9)
            if (r2 == 0) goto L90
        L7d:
            r0.put(r1, r9)
            goto L18
        L81:
            r0 = move-exception
            r0.printStackTrace()
        L85:
            r0 = r1
            goto L2f
        L87:
            java.lang.String r0 = com.vungle.publisher.zf.c
            goto L56
        L8a:
            java.lang.String r2 = com.vungle.publisher.zf.c
            goto L63
        L8d:
            java.lang.String r1 = com.vungle.publisher.zf.c
            goto L70
        L90:
            java.lang.String r9 = com.vungle.publisher.zf.c
            goto L7d
        L93:
            r2 = r1
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.publisher.zf.a(com.vungle.publisher.jh, java.lang.String, java.lang.String):void");
    }

    public void a(int i, VideoView videoView) {
        if (this.e != null) {
            if (this.d.compareAndSet(false, true)) {
                this.e.trackVideoAd(this.f, Integer.valueOf(i), videoView);
                return;
            }
            return;
        }
        Logger.v("VungleMoatAnalytics", "Moat tracking is not enabled. Ignoring - startTracking.");
    }

    public void a(MoatAdEventType moatAdEventType, int i) {
        if (this.e != null && this.d.get()) {
            this.e.dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(i)));
        } else {
            Logger.v("VungleMoatAnalytics", "Moat tracking is not enabled. Ignoring - dispatchEvent: " + moatAdEventType.toString());
        }
    }

    public void b() {
        if (this.e != null) {
            if (this.d.compareAndSet(true, false)) {
                this.e.stopTracking();
                this.e = null;
                Logger.d("VungleMoatAnalytics", "Stopped Moat video tracker");
                return;
            }
            return;
        }
        Logger.v("VungleMoatAnalytics", "Moat tracking is not enabled. Ignoring - stopTracking.");
    }

    public void a(Double d) {
        if (this.e != null && this.d.get()) {
            this.e.setPlayerVolume(d);
        } else {
            Logger.v("VungleMoatAnalytics", "Moat tracking is not enabled. Ignoring - setPlayerVolume.");
        }
    }
}
