package com.facebook.ads.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.b.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class f implements a {
    private static final String a = f.class.getSimpleName();
    private final a.InterfaceC0118a b;
    private final com.facebook.ads.internal.view.b.a c;
    private final a.b d;
    private final com.facebook.ads.internal.adapters.s e;
    private final com.facebook.ads.internal.m.c f;
    private com.facebook.ads.internal.adapters.r g;
    private long h = System.currentTimeMillis();
    private long i;
    private a.EnumC0112a j;

    public f(final AudienceNetworkActivity audienceNetworkActivity, final com.facebook.ads.internal.m.c cVar, a.InterfaceC0118a interfaceC0118a) {
        this.b = interfaceC0118a;
        this.f = cVar;
        this.d = new a.b() { // from class: com.facebook.ads.internal.view.f.1
            private long d = 0;

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a() {
                f.this.e.b();
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(int i) {
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && "close".equals(parse.getAuthority())) {
                    audienceNetworkActivity.finish();
                    return;
                }
                long j = this.d;
                this.d = System.currentTimeMillis();
                if (this.d - j >= 1000) {
                    if ("fbad".equals(parse.getScheme()) && com.facebook.ads.internal.a.b.a(parse.getAuthority())) {
                        f.this.b.a("com.facebook.ads.interstitial.clicked");
                    }
                    com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(audienceNetworkActivity, cVar, f.this.g.c(), parse, map);
                    if (a2 != null) {
                        try {
                            f.this.j = a2.a();
                            f.this.i = System.currentTimeMillis();
                            a2.b();
                        } catch (Exception e) {
                            Log.e(f.a, "Error executing action", e);
                        }
                    }
                }
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void b() {
                f.this.e.a();
            }
        };
        this.c = new com.facebook.ads.internal.view.b.a(audienceNetworkActivity, new WeakReference(this.d), 1);
        this.c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.e = new com.facebook.ads.internal.adapters.s(audienceNetworkActivity, cVar, this.c, this.c.getViewabilityChecker(), new com.facebook.ads.internal.adapters.c() { // from class: com.facebook.ads.internal.view.f.2
            @Override // com.facebook.ads.internal.adapters.c
            public void a() {
                f.this.b.a("com.facebook.ads.interstitial.impression.logged");
            }
        });
        interfaceC0118a.a(this.c);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (bundle != null && bundle.containsKey("dataModel")) {
            this.g = com.facebook.ads.internal.adapters.r.a(bundle.getBundle("dataModel"));
            if (this.g != null) {
                this.c.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), this.g.d(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                this.c.a(this.g.h(), this.g.i());
                return;
            }
            return;
        }
        this.g = com.facebook.ads.internal.adapters.r.b(intent);
        if (this.g != null) {
            this.e.a(this.g);
            this.c.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), this.g.d(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
            this.c.a(this.g.h(), this.g.i());
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
        if (this.g != null) {
            bundle.putBundle("dataModel", this.g.j());
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        this.c.onPause();
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        if (this.i > 0 && this.j != null && this.g != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.i, this.j, this.g.g()));
        }
        this.c.onResume();
    }

    @Override // com.facebook.ads.internal.view.a
    public void onDestroy() {
        if (this.g != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.h, a.EnumC0112a.XOUT, this.g.g()));
            if (!TextUtils.isEmpty(this.g.c())) {
                HashMap hashMap = new HashMap();
                this.c.getViewabilityChecker().a(hashMap);
                hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(this.c.getTouchData()));
                this.f.h(this.g.c(), hashMap);
            }
        }
        com.facebook.ads.internal.q.c.b.a(this.c);
        this.c.destroy();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0118a interfaceC0118a) {
    }
}
