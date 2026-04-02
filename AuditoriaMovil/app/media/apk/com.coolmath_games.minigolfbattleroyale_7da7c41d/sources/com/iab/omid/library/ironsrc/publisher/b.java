package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.b.e;
import com.iab.omid.library.ironsrc.d.d;
import com.vungle.warren.AdLoader;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {
    private WebView a;
    private Long b = null;
    private Map<String, VerificationScriptResource> c;
    private final String d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.c = map;
        this.d = str;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.ironsrc.publisher.b.1
            private WebView b;

            {
                this.b = b.this.a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.b.destroy();
            }
        }, Math.max(4000 - (this.b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.b.longValue(), TimeUnit.NANOSECONDS)), (long) AdLoader.RETRY_DELAY));
        this.a = null;
    }

    void j() {
        WebView webView = new WebView(com.iab.omid.library.ironsrc.b.d.a().b());
        this.a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.a);
        e.a().a(this.a, this.d);
        for (String str : this.c.keySet()) {
            e.a().a(this.a, this.c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.b = Long.valueOf(d.a());
    }
}
