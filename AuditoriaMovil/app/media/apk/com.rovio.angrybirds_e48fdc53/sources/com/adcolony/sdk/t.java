package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.unity3d.ads.adunit.AdUnitActivity;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class t extends Activity {
    aa e;
    String g;
    int h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    ad m;
    final int c = 0;
    final int d = 1;
    int f = -1;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a.b() || a.a().p() == null) {
            finish();
            return;
        }
        af a = a.a();
        this.k = false;
        this.e = a.p();
        this.e.b(false);
        if (q.f()) {
            this.e.b(true);
        }
        this.g = this.e.a();
        this.h = this.e.b();
        this.m = a.a().j().e().get(this.g);
        this.l = a.b().getMultiWindowEnabled();
        if (this.l) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        ViewParent parent = this.e.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.e);
        }
        setContentView(this.e);
        this.e.l().add(a.a("AdSession.finish_fullscreen_ad", new f() { // from class: com.adcolony.sdk.t.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                t.this.a(dVar);
            }
        }, true));
        this.e.l().add(a.a("AdSession.change_orientation", new f() { // from class: com.adcolony.sdk.t.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                JSONObject b = dVar.b();
                if (as.b(b, "id").equals(t.this.g)) {
                    t.this.a(as.c(b, AdUnitActivity.EXTRA_ORIENTATION));
                }
            }
        }, true));
        this.e.m().add("AdSession.finish_fullscreen_ad");
        this.e.m().add("AdSession.change_orientation");
        a(this.f);
        if (!this.e.r()) {
            JSONObject a2 = as.a();
            as.a(a2, "id", this.e.a());
            as.b(a2, "screen_width", this.e.o());
            as.b(a2, "screen_height", this.e.n());
            au.b.b("AdSession.on_fullscreen_ad_started");
            new d("AdSession.on_fullscreen_ad_started", this.e.b(), a2).a();
            this.e.c(true);
            return;
        }
        c();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.j = false;
        a();
    }

    void a() {
        this.m = a.a().j().e().get(this.g);
        Iterator<Map.Entry<Integer, r>> it = this.e.d().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            r value = it.next().getValue();
            if (!value.j() && value.i().isPlaying()) {
                value.f();
            }
        }
        if (this.m != null) {
            this.m.a();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        c();
        b();
        this.j = true;
    }

    void b() {
        for (Map.Entry<Integer, r> entry : this.e.d().entrySet()) {
            r value = entry.getValue();
            if (!value.j() && !value.i().isPlaying() && !a.a().o().c()) {
                value.e();
            }
        }
        if (this.m != null) {
            this.m.b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (z && this.j) {
            a.a().i().c(true);
            b();
        } else if (!z && this.j) {
            au.d.b("Activity is active but window does not have focus, pausing.");
            a.a().i().b(true);
            a();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!a.b() || this.e == null || this.i) {
            return;
        }
        if ((Build.VERSION.SDK_INT < 24 || !q.f()) && !this.e.q()) {
            JSONObject a = as.a();
            as.a(a, "id", this.e.a());
            new d("AdSession.on_error", this.e.b(), a).a();
            this.k = true;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        JSONObject a = as.a();
        as.a(a, "id", this.e.a());
        new d("AdSession.on_back_button", this.e.b(), a).a();
    }

    void c() {
        af a = a.a();
        this.e.b(false);
        if (q.f()) {
            this.e.b(true);
        }
        int l = a.a.l();
        int m = this.l ? a.a.m() - q.b(a.c()) : a.a.m();
        if (l > 0 && m > 0) {
            JSONObject a2 = as.a();
            as.b(a2, "screen_width", l);
            as.b(a2, "screen_height", m);
            as.a(a2, "ad_session_id", this.e.a());
            as.b(a2, "id", this.e.c());
            this.e.setLayoutParams(new FrameLayout.LayoutParams(l, m));
            this.e.b(l);
            this.e.a(m);
            new d("AdContainer.on_orientation_change", this.e.b(), a2).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        int c = as.c(dVar.b(), "status");
        if ((c == 5 || c == 0 || c == 6 || c == 1) && !this.i) {
            af a = a.a();
            ai o = a.o();
            a.b(dVar);
            if (o.b() != null) {
                o.b().dismiss();
                o.a((AlertDialog) null);
            }
            if (!this.k) {
                finish();
            }
            this.i = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            a.c(false);
            JSONObject a2 = as.a();
            as.a(a2, "id", this.e.a());
            new d("AdSession.on_close", this.e.b(), a2).a();
            a.a((aa) null);
            a.a((AdColonyInterstitial) null);
            a.a((u) null);
            a.a().j().c().remove(this.e.a());
        }
    }

    void a(int i) {
        switch (i) {
            case 0:
                setRequestedOrientation(7);
                break;
            case 1:
                setRequestedOrientation(6);
                break;
            default:
                setRequestedOrientation(4);
                break;
        }
        this.f = i;
    }
}
