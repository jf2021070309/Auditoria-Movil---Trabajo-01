package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.mediation.h;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class q extends com.applovin.impl.sdk.e.a implements h.a {
    private final com.applovin.impl.sdk.ad.a a;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdLoadListener f4081c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.d f4082d;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.adview.e {
        private a(com.applovin.impl.sdk.m mVar) {
            super(null, mVar);
        }

        private boolean a(String str, com.applovin.impl.sdk.c.b<String> bVar) {
            for (String str2 : q.this.f4020b.b(bVar)) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.e
        public boolean a(WebView webView, String str, boolean z) {
            q qVar = q.this;
            qVar.b("Processing click on ad URL \"" + str + "\"");
            if (str == null || !(webView instanceof com.applovin.impl.adview.d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (a(scheme, com.applovin.impl.sdk.c.b.cf)) {
                if (a(host, com.applovin.impl.sdk.c.b.cg)) {
                    q.this.a("Ad load succeeded");
                    if (q.this.f4081c == null) {
                        return true;
                    }
                    q.this.f4081c.adReceived(q.this.a);
                } else if (!a(host, com.applovin.impl.sdk.c.b.f3929ch)) {
                    q.this.d("Unrecognized webview event");
                    return true;
                } else {
                    q.this.a("Ad load failed");
                    if (q.this.f4081c == null) {
                        return true;
                    }
                    q.this.f4081c.failedToReceiveAd(204);
                }
                q.this.f4081c = null;
                return true;
            }
            return true;
        }
    }

    public q(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskProcessJavaScriptTagAd", mVar);
        this.a = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, bVar, mVar);
        this.f4081c = appLovinAdLoadListener;
        mVar.H().a(this);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.f().equalsIgnoreCase(this.a.I())) {
            this.f4020b.H().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f4081c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.a);
                this.f4081c = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder y = e.a.d.a.a.y("Rendering AppLovin ad #");
        y.append(this.a.getAdIdNumber());
        a(y.toString());
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.q.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    q qVar = q.this;
                    q qVar2 = q.this;
                    a aVar = new a(qVar2.f4020b);
                    q qVar3 = q.this;
                    qVar.f4082d = new com.applovin.impl.adview.d(aVar, qVar3.f4020b, qVar3.f());
                    q.this.f4082d.loadDataWithBaseURL(q.this.a.as(), q.this.a.b(), "text/html", null, "");
                } catch (Throwable th) {
                    q.this.f4020b.H().b(q.this);
                    q.this.a("Failed to initialize WebView", th);
                    if (q.this.f4081c != null) {
                        q.this.f4081c.failedToReceiveAd(-1);
                        q.this.f4081c = null;
                    }
                }
            }
        });
    }
}
