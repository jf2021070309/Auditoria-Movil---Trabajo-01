package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class an {
    volatile String a = null;
    public Context b = null;
    public AtomicBoolean c = new AtomicBoolean(false);
    private Runnable d = new Runnable() { // from class: com.fyber.inneractive.sdk.util.an.1
        @Override // java.lang.Runnable
        public final void run() {
            an.a(an.this);
        }
    };

    public final String a() {
        if (TextUtils.isEmpty(this.a)) {
            if (this.d != null) {
                m.a().removeCallbacks(this.d);
                m.a().postDelayed(this.d, 50L);
            }
            return System.getProperty("http.agent");
        }
        return this.a;
    }

    final void a(final String str) {
        this.a = str;
        if (!TextUtils.isEmpty(this.a)) {
            IAlog.b("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.c.compareAndSet(false, true);
        }
        m.a.execute(new Runnable() { // from class: com.fyber.inneractive.sdk.util.an.3
            @Override // java.lang.Runnable
            public final void run() {
                an.this.b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", str).apply();
            }
        });
    }

    final void b() {
        String str;
        try {
            str = new WebView(this.b).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str);
    }

    static /* synthetic */ void a(an anVar) {
        if (Build.VERSION.SDK_INT >= 17) {
            m.a.execute(new Runnable() { // from class: com.fyber.inneractive.sdk.util.an.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (an.this.b != null) {
                        String str = null;
                        try {
                            str = WebSettings.getDefaultUserAgent(an.this.b);
                        } catch (Throwable unused) {
                        }
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        an.this.a(str);
                    }
                }
            });
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            anVar.b();
        } else {
            m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.util.an.5
                @Override // java.lang.Runnable
                public final void run() {
                    an.this.b();
                }
            });
        }
    }
}
