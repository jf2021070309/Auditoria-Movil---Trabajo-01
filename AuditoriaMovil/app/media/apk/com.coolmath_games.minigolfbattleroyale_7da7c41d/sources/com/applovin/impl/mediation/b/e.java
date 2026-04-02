package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e extends com.applovin.impl.sdk.e.a {
    private static final AtomicBoolean a = new AtomicBoolean();
    private final String c;
    private final MaxAdFormat d;
    private final JSONObject e;
    private final List<com.applovin.impl.mediation.a.a> f;
    private final a.InterfaceC0014a g;
    private final WeakReference<Activity> h;
    private final List<MaxMediatedNetworkInfoImpl> i;

    /* loaded from: classes.dex */
    private class a extends com.applovin.impl.sdk.e.a {
        private final int c;
        private final com.applovin.impl.mediation.a.a d;
        private final List<com.applovin.impl.mediation.a.a> e;

        a(int i, List<com.applovin.impl.mediation.a.a> list) {
            super(e.this.e(), e.this.b);
            this.c = i;
            this.d = list.get(i);
            this.e = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.c >= this.e.size() - 1) {
                e.this.a(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. See the message in MaxError#getAdLoadFailureInfo()."));
                return;
            }
            this.b.Q().a(new a(this.c + 1, this.e), com.applovin.impl.mediation.c.c.a(e.this.d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            a("Loading ad " + (this.c + 1) + " of " + this.e.size() + ": " + this.d.K());
            e("started to load ad");
            this.b.C().loadThirdPartyMediatedAd(e.this.c, this.d, e.this.h.get() != null ? (Activity) e.this.h.get() : this.b.al(), new com.applovin.impl.mediation.c.a(e.this.g) { // from class: com.applovin.impl.mediation.b.e.a.1
                @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                public void onAdLoadFailed(String str, MaxError maxError) {
                    JSONObject jSONObject;
                    a aVar = a.this;
                    aVar.a("Ad failed to load with error: " + maxError);
                    JSONArray a = com.applovin.impl.mediation.c.c.a(a.this.b);
                    int i = 0;
                    while (true) {
                        jSONObject = null;
                        if (i >= a.length()) {
                            break;
                        }
                        JSONObject jSONObject2 = JsonUtils.getJSONObject(a, i, (JSONObject) null);
                        if (jSONObject2 != null) {
                            String string = JsonUtils.getString(jSONObject2, "class", null);
                            if (!TextUtils.isEmpty(string) && a.this.d.J().equals(string)) {
                                jSONObject = jSONObject2;
                                break;
                            }
                        }
                        i++;
                    }
                    e.this.i.add(new MaxMediatedNetworkInfoImpl(jSONObject, maxError));
                    a aVar2 = a.this;
                    aVar2.e("failed to load ad: " + maxError.getCode());
                    a.this.a();
                }

                @Override // com.applovin.impl.mediation.c.a, com.applovin.mediation.MaxAdListener
                public void onAdLoaded(MaxAd maxAd) {
                    a.this.e("loaded ad");
                    e.this.a(maxAd, a.this.c);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, Activity activity, k kVar, a.InterfaceC0014a interfaceC0014a) {
        super("TaskProcessMediationWaterfall:" + str + CertificateUtil.DELIMITER + maxAdFormat.getLabel(), kVar);
        this.i = new ArrayList();
        this.c = str;
        this.d = maxAdFormat;
        this.e = jSONObject;
        this.g = interfaceC0014a;
        this.h = new WeakReference<>(activity);
        this.f = new ArrayList(jSONObject.length());
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f.add(com.applovin.impl.mediation.a.a.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, kVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd, int i) {
        final Float f;
        com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
        this.b.D().a(aVar);
        List<com.applovin.impl.mediation.a.a> list = this.f;
        List<com.applovin.impl.mediation.a.a> subList = list.subList(i + 1, list.size());
        long longValue = ((Long) this.b.a(com.applovin.impl.sdk.c.a.S)).longValue();
        float f2 = 1.0f;
        for (final com.applovin.impl.mediation.a.a aVar2 : subList) {
            Float g = aVar2.g();
            if (g != null) {
                f2 *= g.floatValue();
                f = Float.valueOf(f2);
            } else {
                f = null;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.e.3
                @Override // java.lang.Runnable
                public void run() {
                    e.this.b.C().processAdLossPostback(aVar2, f);
                }
            }, TimeUnit.SECONDS.toMillis(longValue));
        }
        b("Waterfall loaded for " + aVar.K());
        i.a((MaxAdListener) this.g, maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        com.applovin.impl.sdk.d.g R;
        com.applovin.impl.sdk.d.f fVar;
        if (maxError.getCode() == 204) {
            R = this.b.R();
            fVar = com.applovin.impl.sdk.d.f.q;
        } else if (maxError.getCode() == -5001) {
            R = this.b.R();
            fVar = com.applovin.impl.sdk.d.f.r;
        } else {
            R = this.b.R();
            fVar = com.applovin.impl.sdk.d.f.s;
        }
        R.a(fVar);
        b("Waterfall failed to load with error: " + maxError);
        if (this.i.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            for (int i = 0; i < this.i.size(); i++) {
                MaxMediatedNetworkInfoImpl maxMediatedNetworkInfoImpl = this.i.get(i);
                sb.append(i);
                sb.append(") ");
                sb.append(maxMediatedNetworkInfoImpl.getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxMediatedNetworkInfoImpl.getLoadError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxMediatedNetworkInfoImpl.getLoadError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        i.a(this.g, this.c, maxError);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.e.optBoolean("is_testing", false) && !this.b.H().a() && a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) e.this.h.get());
                }
            });
        }
        if (this.f.size() > 0) {
            a("Starting waterfall for " + this.f.size() + " ad(s)...");
            this.b.Q().a(new a(0, this.f));
            return;
        }
        c("No ads were returned from the server");
        Utils.maybeHandleNoFillResponseForPublisher(this.c, this.d, this.e, this.b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.e, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j <= 0) {
            a(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.b.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.a(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", false).booleanValue()) {
            com.applovin.impl.sdk.utils.d.a(millis, this.b, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
