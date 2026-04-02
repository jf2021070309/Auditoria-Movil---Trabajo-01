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

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinPostbackListener f4036c;

    /* renamed from: d  reason: collision with root package name */
    private final o.a f4037d;

    public g(com.applovin.impl.sdk.network.h hVar, o.a aVar, com.applovin.impl.sdk.m mVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", mVar);
        if (hVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.a = hVar;
        this.f4036c = appLovinPostbackListener;
        this.f4037d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        u<Object> uVar = new u<Object>(this.a, d()) { // from class: com.applovin.impl.sdk.e.g.2
            public final String a;

            {
                this.a = g.this.a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i2, String str, Object obj) {
                StringBuilder z = e.a.d.a.a.z("Failed to dispatch postback. Error code: ", i2, " URL: ");
                z.append(this.a);
                d(z.toString());
                if (g.this.f4036c != null) {
                    g.this.f4036c.onPostbackFailure(this.a, i2);
                }
                if (g.this.a.q()) {
                    this.f4020b.ag().a(g.this.a.r(), this.a, i2, obj, str, false);
                }
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i2) {
                if (obj instanceof String) {
                    for (String str : this.f4020b.b(com.applovin.impl.sdk.c.b.aU)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    com.applovin.impl.sdk.utils.h.d(jSONObject, this.f4020b);
                                    com.applovin.impl.sdk.utils.h.c(jSONObject, this.f4020b);
                                    com.applovin.impl.sdk.utils.h.e(jSONObject, this.f4020b);
                                    break;
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                }
                if (g.this.f4036c != null) {
                    g.this.f4036c.onPostbackSuccess(this.a);
                }
                if (g.this.a.q()) {
                    this.f4020b.ag().a(g.this.a.r(), this.a, i2, obj, null, true);
                }
            }
        };
        uVar.a(this.f4037d);
        d().S().a(uVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.a.a())) {
            if (this.a.s()) {
                com.applovin.impl.adview.d.a(this.a, d(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.g.1
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i2) {
                        g.this.a();
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        if (g.this.f4036c != null) {
                            g.this.f4036c.onPostbackSuccess(g.this.a.a());
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
        AppLovinPostbackListener appLovinPostbackListener = this.f4036c;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.a.a(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
