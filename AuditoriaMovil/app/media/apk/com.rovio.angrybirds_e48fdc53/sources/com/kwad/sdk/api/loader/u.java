package com.kwad.sdk.api.loader;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.api.core.IKsAdSDK;
import com.kwad.sdk.api.loader.m;
import com.umeng.analytics.pro.bg;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class u {
    private static final AtomicBoolean ajz = new AtomicBoolean();

    public static void a(final Context context, final IKsAdSDK iKsAdSDK) {
        if (com.kwad.sdk.api.c.yi()) {
            return;
        }
        AtomicBoolean atomicBoolean = ajz;
        if (atomicBoolean.get() || context == null || iKsAdSDK == null) {
            return;
        }
        atomicBoolean.set(true);
        com.kwad.sdk.api.a.a.submit(new Runnable() { // from class: com.kwad.sdk.api.loader.u.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (Math.abs(System.currentTimeMillis() - t.u(context, "lastUpdateTime")) < t.u(context, bg.aU) * 1000) {
                        return;
                    }
                    m.yt().a(new v() { // from class: com.kwad.sdk.api.loader.u.1.1
                        @Override // com.kwad.sdk.api.loader.v
                        public final Context getContext() {
                            return context;
                        }

                        @Override // com.kwad.sdk.api.loader.v
                        public final String yw() {
                            return u.access$000();
                        }

                        @Override // com.kwad.sdk.api.loader.v
                        public final IKsAdSDK yx() {
                            return iKsAdSDK;
                        }
                    }, new m.c<Boolean>() { // from class: com.kwad.sdk.api.loader.u.1.2
                        private static void c(Boolean bool) {
                            new StringBuilder("onNewResult: ").append(bool);
                        }

                        @Override // com.kwad.sdk.api.loader.m.c
                        public final /* synthetic */ void g(Boolean bool) {
                            c(bool);
                        }
                    });
                } catch (Throwable th) {
                }
            }
        });
    }

    public static void aG(Context context) {
        g.j(context, "");
    }

    static /* synthetic */ String access$000() {
        return yv();
    }

    private static String yv() {
        String bS = com.kwad.sdk.api.c.bS("https://open.e.kuaishou.com/rest/e/v3/open/sdk2");
        return !TextUtils.isEmpty(bS) ? bS : "https://open.e.kuaishou.com/rest/e/v3/open/sdk2";
    }
}
