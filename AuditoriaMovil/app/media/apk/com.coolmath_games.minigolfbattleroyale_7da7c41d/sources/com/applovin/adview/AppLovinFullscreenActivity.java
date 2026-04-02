package com.applovin.adview;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.activity.b.c;
import com.applovin.impl.adview.activity.b.d;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.l;
import com.applovin.impl.adview.q;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.a.i;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements l {
    public static q parentInterstitialWrapper;
    private k a;
    private a b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private com.applovin.impl.adview.activity.a d;

    private void a(String str, Throwable th) {
        r.c("InterActivityV2", str, th);
        AppLovinAdDisplayListener d = parentInterstitialWrapper.d();
        if (d instanceof i) {
            com.applovin.impl.sdk.utils.i.a(d, str);
        } else {
            com.applovin.impl.sdk.utils.i.b(d, parentInterstitialWrapper.b());
        }
        dismiss();
    }

    @Override // com.applovin.impl.adview.l
    public void dismiss() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.g();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.k();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ActivityManager activityManager;
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                r.h("InterActivityV2", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            r.f("InterActivityV2", "Activity was destroyed while in background.");
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        findViewById(16908290).setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        k kVar = AppLovinSdk.getInstance(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"), new AppLovinSdkSettings(this), this).coreSdk;
        this.a = kVar;
        if (parentInterstitialWrapper == null) {
            Intent intent = new Intent(this, FullscreenAdService.class);
            com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.a);
            this.d = aVar;
            bindService(intent, aVar, 1);
            if (f.g()) {
                try {
                    WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        int intValue = ((Integer) kVar.a(b.eM)).intValue();
        if (intValue != -1 && (activityManager = (ActivityManager) getSystemService("activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem < intValue) {
                a("Not enough available memory", null);
                return;
            }
        }
        present(parentInterstitialWrapper.b(), parentInterstitialWrapper.e(), parentInterstitialWrapper.d(), parentInterstitialWrapper.c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.i();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.j();
        }
        super.onLowMemory();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        a aVar = this.b;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        a aVar;
        try {
            super.onResume();
            if (this.c.get() || (aVar = this.b) == null) {
                return;
            }
            aVar.e();
        } catch (IllegalArgumentException e) {
            this.a.z().b("InterActivityV2", "Error was encountered in onResume().", e);
            dismiss();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k kVar = this.a;
        if (kVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) kVar.a(b.eP)).booleanValue());
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        a aVar = this.b;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.b != null) {
            if (!this.c.getAndSet(false) || (this.b instanceof e)) {
                this.b.c(z);
            }
            if (z) {
                getWindow().getDecorView().setSystemUiVisibility(5894);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void present(g gVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        boolean z = false;
        if (gVar.aJ() && Utils.checkExoPlayerEligibility(this.a)) {
            z = true;
        }
        if (gVar instanceof com.applovin.impl.a.a) {
            if (z) {
                try {
                    this.b = new c(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    this.a.z().a("InterActivityV2", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    Utils.isExoPlayerEligible = false;
                    try {
                        this.b = new d(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + this.a + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    this.b = new d(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + this.a + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (!gVar.hasVideoUrl()) {
            try {
                this.b = new com.applovin.impl.adview.activity.b.b(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                a("Failed to create FullscreenGraphicAdPresenter with sdk: " + this.a + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        } else if (gVar.aN()) {
            try {
                this.b = new com.applovin.impl.adview.activity.b.g(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th5) {
                a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + this.a + " and throwable: " + th5.getMessage(), th5);
                return;
            }
        } else if (z) {
            try {
                this.b = new e(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th6) {
                this.a.z().a("InterActivityV2", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th6);
                Utils.isExoPlayerEligible = false;
                try {
                    this.b = new com.applovin.impl.adview.activity.b.f(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + this.a + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                this.b = new com.applovin.impl.adview.activity.b.f(gVar, this, this.a, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                a("Failed to create FullscreenVideoAdPresenter with sdk: " + this.a + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        this.b.d();
    }
}
