package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g extends a {
    private final com.applovin.impl.sdk.network.h a;
    private final AppLovinPostbackListener c;
    private final o.a d;

    public g(com.applovin.impl.sdk.network.h hVar, o.a aVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (hVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.a = hVar;
        this.c = appLovinPostbackListener;
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        t<Object> tVar = new t<Object>(this.a, d()) { // from class: com.applovin.impl.sdk.e.g.2
            final String a;

            {
                this.a = g.this.a.a();
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(int i, String str, Object obj) {
                d("Failed to dispatch postback. Error code: " + i + " URL: " + this.a);
                if (g.this.c != null) {
                    g.this.c.onPostbackFailure(this.a, i);
                }
                if (g.this.a.q()) {
                    this.b.af().a(g.this.a.r(), this.a, i, obj, str, false);
                }
            }

            @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i) {
                if (obj instanceof String) {
                    for (String str : this.b.b(com.applovin.impl.sdk.c.b.aL)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    com.applovin.impl.sdk.utils.g.d(jSONObject, this.b);
                                    com.applovin.impl.sdk.utils.g.c(jSONObject, this.b);
                                    com.applovin.impl.sdk.utils.g.e(jSONObject, this.b);
                                    break;
                                } catch (JSONException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (g.this.c != null) {
                    g.this.c.onPostbackSuccess(this.a);
                }
                if (g.this.a.q()) {
                    this.b.af().a(g.this.a.r(), this.a, i, obj, null, true);
                }
            }
        };
        tVar.a(this.d);
        d().Q().a(tVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.a.a())) {
            if (this.a.s()) {
                com.applovin.impl.adview.d.a(this.a, d(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.g.1
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i) {
                        g.this.a();
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        if (g.this.c != null) {
                            g.this.c.onPostbackSuccess(g.this.a.a());
                        }
                    }
                });
                return;
            } else {
                a();
                return;
            }
        }
        b("Requested URL is not valid; nothing to do...");
        AppLovinPostbackListener appLovinPostbackListener = this.c;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.a.a(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
