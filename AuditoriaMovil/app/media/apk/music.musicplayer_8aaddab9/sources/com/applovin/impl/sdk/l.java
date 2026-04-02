package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class l implements k.a, AppLovinWebViewActivity.EventListener {
    private static final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<AppLovinWebViewActivity> f4122b;

    /* renamed from: c  reason: collision with root package name */
    private final m f4123c;

    /* renamed from: d  reason: collision with root package name */
    private final v f4124d;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinUserService.OnConsentDialogDismissListener f4125e;

    /* renamed from: f  reason: collision with root package name */
    private k f4126f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<Activity> f4127g;

    /* renamed from: h  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.a f4128h;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f4129i = new AtomicBoolean();

    public l(m mVar) {
        this.f4127g = new WeakReference<>(null);
        this.f4123c = mVar;
        this.f4124d = mVar.B();
        if (mVar.N() != null) {
            this.f4127g = new WeakReference<>(mVar.N());
        }
        mVar.ae().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.l.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                l.this.f4127g = new WeakReference(activity);
            }
        });
        this.f4126f = new k(this, mVar);
    }

    private void a(boolean z, long j2) {
        g();
        if (z) {
            a(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(m mVar) {
        if (d()) {
            v.i("AppLovinSdk", "Consent dialog already showing");
            return false;
        } else if (!com.applovin.impl.sdk.utils.h.a(mVar.L())) {
            v.i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        } else if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ax)).booleanValue()) {
            this.f4124d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            return false;
        } else if (StringUtils.isValidString((String) mVar.a(com.applovin.impl.sdk.c.b.ay))) {
            return true;
        } else {
            this.f4124d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            return false;
        }
    }

    private void g() {
        this.f4123c.ae().b(this.f4128h);
        if (d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = f4122b.get();
            f4122b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f4125e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f4125e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.k.a
    public void a() {
        if (this.f4127g.get() != null) {
            final Activity activity = this.f4127g.get();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l.5
                @Override // java.lang.Runnable
                public void run() {
                    l.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f4123c.a(com.applovin.impl.sdk.c.b.aA)).longValue());
        }
    }

    public void a(final long j2) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.4
            @Override // java.lang.Runnable
            public void run() {
                l.this.f4124d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                l.this.f4126f.a(j2, l.this.f4123c, l.this);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.3
            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                if (!lVar.a(lVar.f4123c) || l.a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener2 != null) {
                        onConsentDialogDismissListener2.onDismiss();
                        return;
                    }
                    return;
                }
                l.this.f4127g = new WeakReference(activity);
                l.this.f4125e = onConsentDialogDismissListener;
                l.this.f4128h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.l.3.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!l.this.d() || l.f4122b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = l.f4122b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) l.this.f4123c.a(com.applovin.impl.sdk.c.b.ay), l.this);
                            }
                            l.a.set(false);
                        }
                    }
                };
                l.this.f4123c.ae().a(l.this.f4128h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, l.this.f4123c.z());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) l.this.f4123c.a(com.applovin.impl.sdk.c.b.az));
                activity.startActivity(intent);
            }
        });
    }

    @Override // com.applovin.impl.sdk.k.a
    public void b() {
    }

    public void c() {
        if (this.f4129i.getAndSet(true)) {
            return;
        }
        final String str = (String) this.f4123c.a(com.applovin.impl.sdk.c.b.ay);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.2
            @Override // java.lang.Runnable
            public void run() {
                new WebView(l.this.f4123c.L()).loadUrl(str);
            }
        });
    }

    public boolean d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f4122b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        boolean booleanValue;
        m mVar;
        com.applovin.impl.sdk.c.b<Long> bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f4123c.L());
            g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f4123c.L());
            booleanValue = ((Boolean) this.f4123c.a(com.applovin.impl.sdk.c.b.aB)).booleanValue();
            mVar = this.f4123c;
            bVar = com.applovin.impl.sdk.c.b.aG;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f4123c.a(com.applovin.impl.sdk.c.b.aC)).booleanValue();
            mVar = this.f4123c;
            bVar = com.applovin.impl.sdk.c.b.aH;
        } else if (!AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            return;
        } else {
            booleanValue = ((Boolean) this.f4123c.a(com.applovin.impl.sdk.c.b.aD)).booleanValue();
            mVar = this.f4123c;
            bVar = com.applovin.impl.sdk.c.b.aI;
        }
        a(booleanValue, ((Long) mVar.a(bVar)).longValue());
    }
}
