package com.moat.analytics.mobile.vng;

import android.app.Application;
import android.content.Context;
import com.moat.analytics.mobile.vng.g;
import com.moat.analytics.mobile.vng.w;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k extends MoatAnalytics implements w.b {
    g d;
    WeakReference<Context> e;
    private String g;
    boolean a = false;
    boolean b = false;
    boolean c = false;
    private boolean f = false;

    private void a(MoatOptions moatOptions, Application application) {
        if (this.f) {
            p.a(3, "Analytics", this, "Moat SDK has already been started.");
            return;
        }
        w.a().b();
        if (moatOptions.loggingEnabled && a(application.getApplicationContext())) {
            this.a = true;
        }
        this.c = moatOptions.disableLocationServices;
        if (application == null) {
            p.a("[ERROR] ", "Moat Analytics SDK didn't start, application was null");
            return;
        }
        this.e = new WeakReference<>(application.getApplicationContext());
        this.f = true;
        this.b = moatOptions.autoTrackGMAInterstitials;
        a.a(application);
        w.a().a(this);
        if (!moatOptions.disableAdIdCollection) {
            s.a(application);
        }
        p.a("[SUCCESS] ", "Moat Analytics SDK Version 2.2.0 started");
    }

    private static boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private void d() {
        if (this.d == null) {
            this.d = new g(a.a(), g.a.DISPLAY);
            this.d.a(this.g);
            p.a(3, "Analytics", this, "Preparing native display tracking with partner code " + this.g);
            p.a("[SUCCESS] ", "Prepared for native display tracking with partner code " + this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f;
    }

    @Override // com.moat.analytics.mobile.vng.w.b
    public void b() {
        o.a();
        if (this.g != null) {
            try {
                d();
            } catch (Exception e) {
                m.a(e);
            }
        }
    }

    @Override // com.moat.analytics.mobile.vng.w.b
    public void c() {
    }

    @Override // com.moat.analytics.mobile.vng.MoatAnalytics
    public void prepareNativeDisplayTracking(String str) {
        this.g = str;
        if (w.a().a == w.d.OFF) {
            return;
        }
        try {
            d();
        } catch (Exception e) {
            m.a(e);
        }
    }

    @Override // com.moat.analytics.mobile.vng.MoatAnalytics
    public void start(Application application) {
        start(new MoatOptions(), application);
    }

    @Override // com.moat.analytics.mobile.vng.MoatAnalytics
    public void start(MoatOptions moatOptions, Application application) {
        try {
            a(moatOptions, application);
        } catch (Exception e) {
            m.a(e);
        }
    }
}
