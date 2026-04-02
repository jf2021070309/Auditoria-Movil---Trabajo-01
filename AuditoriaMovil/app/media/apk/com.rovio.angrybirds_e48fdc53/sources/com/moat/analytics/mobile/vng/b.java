package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import com.moat.analytics.mobile.vng.j;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b {
    j a;
    final String b;
    final boolean c;
    boolean d;
    boolean e;
    private WeakReference<View> f;
    private WeakReference<WebView> g;
    private final z h;
    private final boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(View view, boolean z, boolean z2) {
        p.a(3, "BaseTracker", this, "Initializing.");
        if (z) {
            this.b = com.kuaishou.weapon.p0.t.m + hashCode();
        } else {
            this.b = "";
        }
        this.f = new WeakReference<>(view);
        this.i = z;
        this.c = z2;
        this.d = false;
        this.e = false;
        this.h = new z();
    }

    private void g() {
        com.moat.analytics.mobile.vng.a.a.a.a(this.g);
        p.a(3, "BaseTracker", this, "Attempting bridge installation.");
        if (this.g.get() == null) {
            this.a = null;
            p.a(3, "BaseTracker", this, "Bridge not installed, WebView is null.");
            return;
        }
        if (!this.i && !this.c) {
            this.a = new j(this.g.get(), j.a.WEBVIEW);
        }
        p.a(3, "BaseTracker", this, "Bridge " + (this.a.a ? "" : "not ") + "installed.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView) {
        if (webView != null) {
            this.g = new WeakReference<>(webView);
            if (this.a == null) {
                g();
            }
            if (this.a == null || !this.a.a) {
                return;
            }
            this.a.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(j jVar) {
        this.a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        p.a(3, "BaseTracker", this, "Attempting to start impression.");
        if (this.e) {
            p.a(3, "BaseTracker", this, "startTracking failed, tracker already started");
            p.a("[INFO] ", a() + " already started");
            return false;
        }
        boolean b = this.a.b(this);
        p.a(3, "BaseTracker", this, "Impression " + (b ? "" : "not ") + "started.");
        if (b) {
            this.d = true;
            this.e = true;
            return b;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        p.a(3, "BaseTracker", this, "Attempting to stop impression.");
        this.d = false;
        boolean c = this.a.c(this);
        p.a(3, "BaseTracker", this, "Impression tracking " + (c ? "" : "not ") + "stopped.");
        return c;
    }

    public void changeTargetView(View view) {
        p.a(3, "BaseTracker", this, "changing view to " + (view != null ? view.getClass().getSimpleName() + "@" + view.hashCode() : "null"));
        this.f = new WeakReference<>(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View d() {
        return this.f.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return d() != null ? d().getClass().getSimpleName() + "@" + d().hashCode() : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        this.h.a(this.b, d());
        return this.h.a;
    }

    @Deprecated
    public void setActivity(Activity activity) {
    }

    public void startTracking() {
        boolean z = false;
        try {
            p.a(3, "BaseTracker", this, "In startTracking method.");
            z = b();
        } catch (Exception e) {
            m.a(e);
        }
        p.a(3, "BaseTracker", this, "Attempt to start tracking ad impression was " + (z ? "" : "un") + "successful.");
        p.a(z ? "[SUCCESS] " : "[ERROR] ", a() + " startTracking " + (z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed") + " for " + e());
    }

    public void stopTracking() {
        boolean z = false;
        try {
            p.a(3, "BaseTracker", this, "In stopTracking method.");
            z = c();
        } catch (Exception e) {
            m.a(e);
        }
        p.a(3, "BaseTracker", this, "Attempt to stop tracking ad impression was " + (z ? "" : "un") + "successful.");
        p.a(z ? "[SUCCESS] " : "[ERROR] ", a() + " stopTracking " + (z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed") + " for " + e());
    }
}
