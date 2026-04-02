package com.vungle.publisher;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import com.vungle.publisher.cn;
import com.vungle.publisher.env.r;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.mg;
import java.util.logging.Level;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class VungleAdActivity extends Activity {
    public static final String AD_ID_EXTRA_KEY = "adId";
    public static final String AD_PLACEMENT_REFERENCE_ID_KEY = "placementReferenceId";
    public static final String AD_TYPE_EXTRA_KEY = "adType";
    mg<cn> a;
    String b;
    @Inject
    qg c;
    @Inject
    bz d;
    @Inject
    r e;
    @Inject
    cn.b f;
    @Inject
    lm g;
    @Inject
    mg.a h;
    @Inject
    u i;
    @Inject
    com.vungle.publisher.log.g j;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.d(Logger.AD_TAG, "interstitial ad");
            if (!Injector.getInstance().d()) {
                this.j.b.warning("SDK not initialized");
                finish();
                return;
            }
            Injector.c().a(this);
            zo.a(this);
            Intent intent = getIntent();
            p a = this.i.a(intent);
            String stringExtra = intent.getStringExtra(AD_ID_EXTRA_KEY);
            String stringExtra2 = intent.getStringExtra(AD_PLACEMENT_REFERENCE_ID_KEY);
            cn a2 = this.f.a((m) intent.getSerializableExtra(AD_TYPE_EXTRA_KEY), stringExtra);
            if (a2 == null) {
                this.j.b.warning("no ad in activity");
                this.c.a(new bq(null, stringExtra2));
                finish();
                return;
            }
            this.j.b.info("creating ad activity with status: " + a2.g());
            String e = a2.e();
            if (e != null) {
                try {
                    this.b = ra.f(new JSONObject(e.substring(3)), "eventID");
                    this.j.b.log(Level.INFO, "extracted event id for the ad", this.b);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.a = this.h.a(a2);
            this.a.a(this, a2, stringExtra2, a, bundle);
        } catch (Exception e3) {
            Logger.e(Logger.AD_TAG, "error playing ad", e3);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            this.a.a(bundle);
            super.onSaveInstanceState(bundle);
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onSaveInstanceState", e);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.a.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
            this.e.e();
            this.g.c();
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onResume()", e);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            super.onPause();
            this.e.i();
            this.d.a();
            this.g.d();
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onPause()", e);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            this.a.a(this);
            this.e.f();
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onDestroy()", e);
        }
        if (!isFinishing()) {
            Logger.i(Logger.AD_TAG, "finishing ad that is being destroyed");
            finish();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            Logger.v(Logger.AD_TAG, "back button pressed");
            this.c.a(new y());
            this.a.c();
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onBackPressed", e);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        this.a.a(i, keyEvent);
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
            this.a.a(z);
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error in onWindowFocusChanged", e);
        }
    }
}
