package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class j implements i.a, AppLovinWebViewActivity.EventListener {
    private static final AtomicBoolean a = new AtomicBoolean();
    private static WeakReference<AppLovinWebViewActivity> b;
    private final k c;
    private final r d;
    private AppLovinUserService.OnConsentDialogDismissListener e;
    private i f;
    private WeakReference<Activity> g;
    private com.applovin.impl.sdk.utils.a h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar) {
        this.g = new WeakReference<>(null);
        this.c = kVar;
        this.d = kVar.z();
        if (kVar.L() != null) {
            this.g = new WeakReference<>(kVar.L());
        }
        kVar.ad().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.j.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                j.this.g = new WeakReference(activity);
            }
        });
        this.f = new i(this, kVar);
    }

    private void a(boolean z, long j) {
        f();
        if (z) {
            a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(k kVar) {
        if (c()) {
            r.i("AppLovinSdk", "Consent dialog already showing");
            return false;
        } else if (!com.applovin.impl.sdk.utils.g.a(kVar.J())) {
            r.i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        } else if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.ao)).booleanValue()) {
            this.d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            return false;
        } else if (StringUtils.isValidString((String) kVar.a(com.applovin.impl.sdk.c.b.ap))) {
            return true;
        } else {
            this.d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            return false;
        }
    }

    private void f() {
        this.c.ad().b(this.h);
        if (c()) {
            AppLovinWebViewActivity appLovinWebViewActivity = b.get();
            b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.i.a
    public void a() {
        if (this.g.get() != null) {
            final Activity activity = this.g.get();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.j.4
                @Override // java.lang.Runnable
                public void run() {
                    j.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.c.a(com.applovin.impl.sdk.c.b.ar)).longValue());
        }
    }

    public void a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j.3
            @Override // java.lang.Runnable
            public void run() {
                j.this.d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                j.this.f.a(j, j.this.c, j.this);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.j.2
            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                if (!jVar.a(jVar.c) || j.a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener2 != null) {
                        onConsentDialogDismissListener2.onDismiss();
                        return;
                    }
                    return;
                }
                j.this.g = new WeakReference(activity);
                j.this.e = onConsentDialogDismissListener;
                j.this.h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.j.2.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!j.this.c() || j.b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = j.b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) j.this.c.a(com.applovin.impl.sdk.c.b.ap), j.this);
                            }
                            j.a.set(false);
                        }
                    }
                };
                j.this.c.ad().a(j.this.h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, j.this.c.x());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) j.this.c.a(com.applovin.impl.sdk.c.b.aq));
                activity.startActivity(intent);
            }
        });
    }

    @Override // com.applovin.impl.sdk.i.a
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        WeakReference<AppLovinWebViewActivity> weakReference = b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        boolean booleanValue;
        k kVar;
        com.applovin.impl.sdk.c.b<Long> bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.c.J());
            f();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.c.J());
            booleanValue = ((Boolean) this.c.a(com.applovin.impl.sdk.c.b.as)).booleanValue();
            kVar = this.c;
            bVar = com.applovin.impl.sdk.c.b.ax;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.c.a(com.applovin.impl.sdk.c.b.at)).booleanValue();
            kVar = this.c;
            bVar = com.applovin.impl.sdk.c.b.ay;
        } else if (!AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            return;
        } else {
            booleanValue = ((Boolean) this.c.a(com.applovin.impl.sdk.c.b.au)).booleanValue();
            kVar = this.c;
            bVar = com.applovin.impl.sdk.c.b.az;
        }
        a(booleanValue, ((Long) kVar.a(bVar)).longValue());
    }
}
