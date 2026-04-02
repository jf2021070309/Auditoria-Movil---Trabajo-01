package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.view.b.a;
import com.facebook.share.internal.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class k extends BannerAdapter {
    private static final String a = k.class.getSimpleName();
    private a.b b;
    private com.facebook.ads.internal.view.b.a c;
    private s d;
    private BannerAdapterListener e;
    private Map<String, Object> f;
    private com.facebook.ads.internal.m.c g;
    private Context h;
    private long i;
    private a.EnumC0112a j;

    private void a(com.facebook.ads.internal.h.d dVar) {
        this.i = 0L;
        this.j = null;
        final r a2 = r.a((JSONObject) this.f.get(ShareConstants.WEB_DIALOG_PARAM_DATA));
        if (com.facebook.ads.internal.a.d.a(this.h, a2, this.g)) {
            this.e.onBannerError(this, AdError.NO_FILL);
            return;
        }
        this.b = new a.b() { // from class: com.facebook.ads.internal.adapters.k.1
            @Override // com.facebook.ads.internal.view.b.a.b
            public void a() {
                k.this.d.b();
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(int i) {
                if (i != 0 || k.this.i <= 0 || k.this.j == null) {
                    return;
                }
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(k.this.i, k.this.j, a2.g()));
                k.this.i = 0L;
                k.this.j = null;
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && com.facebook.ads.internal.a.b.a(parse.getAuthority()) && k.this.e != null) {
                    k.this.e.onBannerAdClicked(k.this);
                }
                com.facebook.ads.internal.a.a a3 = com.facebook.ads.internal.a.b.a(k.this.h, k.this.g, a2.c(), parse, map);
                if (a3 != null) {
                    try {
                        k.this.j = a3.a();
                        k.this.i = System.currentTimeMillis();
                        a3.b();
                    } catch (Exception e) {
                        Log.e(k.a, "Error executing action", e);
                    }
                }
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void b() {
                if (k.this.d != null) {
                    k.this.d.a();
                }
            }
        };
        this.c = new com.facebook.ads.internal.view.b.a(this.h, new WeakReference(this.b), dVar.f());
        this.c.a(dVar.h(), dVar.i());
        this.d = new s(this.h, this.g, this.c, this.c.getViewabilityChecker(), new c() { // from class: com.facebook.ads.internal.adapters.k.2
            @Override // com.facebook.ads.internal.adapters.c
            public void a() {
                if (k.this.e != null) {
                    k.this.e.onBannerLoggingImpression(k.this);
                }
            }
        });
        this.d.a(a2);
        this.c.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), a2.d(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        if (this.e != null) {
            this.e.onBannerAdLoaded(this, this.c);
        }
    }

    @Override // com.facebook.ads.internal.adapters.BannerAdapter
    public void loadBannerAd(Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.protocol.e eVar, BannerAdapterListener bannerAdapterListener, Map<String, Object> map) {
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.c != null) {
            com.facebook.ads.internal.q.c.b.a(this.c);
            this.c.destroy();
            this.c = null;
            this.b = null;
        }
    }
}
