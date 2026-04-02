package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.b.e;
import com.iab.omid.library.applovin.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {
    private WebView a;

    /* renamed from: b  reason: collision with root package name */
    private Long f4809b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f4810c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4811d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f4810c = map;
        this.f4811d = str;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.applovin.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.applovin.publisher.b.1

            /* renamed from: b  reason: collision with root package name */
            private final WebView f4812b;

            {
                this.f4812b = b.this.a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f4812b.destroy();
            }
        }, Math.max(4000 - (this.f4809b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f4809b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.applovin.b.d.a().b());
        this.a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.a);
        e.a().a(this.a, this.f4811d);
        for (String str : this.f4810c.keySet()) {
            e.a().a(this.a, this.f4810c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f4809b = Long.valueOf(d.a());
    }
}
