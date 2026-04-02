package com.applovin.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements k {
    @SuppressLint({"StaticFieldLeak"})
    public static o parentInterstitialWrapper;
    private m a;

    /* renamed from: b  reason: collision with root package name */
    private a f3032b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3033c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f3034d;

    @Override // com.applovin.impl.adview.k
    public void dismiss() {
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.h();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                v.h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            v.f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        findViewById(16908290).setBackgroundColor(-16777216);
        this.a = AppLovinSdk.getInstance(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"), new AppLovinSdkSettings(this), this).coreSdk;
        o oVar = parentInterstitialWrapper;
        if (oVar != null) {
            a.a(oVar.a(), parentInterstitialWrapper.d(), parentInterstitialWrapper.c(), parentInterstitialWrapper.b(), this.a, this, new a.InterfaceC0069a() { // from class: com.applovin.adview.AppLovinFullscreenActivity.1
                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0069a
                public void a(a aVar) {
                    AppLovinFullscreenActivity.this.f3032b = aVar;
                    aVar.d();
                }

                @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0069a
                public void a(String str, Throwable th) {
                    o.a(AppLovinFullscreenActivity.parentInterstitialWrapper.a(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.a);
        this.f3034d = aVar;
        bindService(intent, aVar, 1);
        if (g.g()) {
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.f3034d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        a aVar2 = this.f3032b;
        if (aVar2 != null) {
            aVar2.j();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.a(i2, keyEvent);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.k();
        }
        super.onLowMemory();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        a aVar;
        try {
            super.onResume();
            if (this.f3033c.get() || (aVar = this.f3032b) == null) {
                return;
            }
            aVar.f();
        } catch (IllegalArgumentException e2) {
            this.a.B().b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e2);
            dismiss();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m mVar = this.a;
        if (mVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) mVar.a(b.eT)).booleanValue());
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        a aVar = this.f3032b;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.f3032b != null) {
            if (!this.f3033c.getAndSet(false) || (this.f3032b instanceof e)) {
                this.f3032b.c(z);
            }
            if (z) {
                getWindow().getDecorView().setSystemUiVisibility(5894);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(a aVar) {
        this.f3032b = aVar;
    }
}
