package com.applovin.impl.mediation.b;

import android.app.Activity;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {
    private static String a;
    private final MaxAdFormat c;
    private final Activity d;
    private final a e;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONArray jSONArray);
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public b(MaxAdFormat maxAdFormat, Activity activity, k kVar, a aVar) {
        super("TaskCollectSignals", kVar);
        this.c = maxAdFormat;
        this.d = activity;
        this.e = aVar;
    }

    private static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.g gVar, final f.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.b.C().collectSignal(b.this.c, gVar, b.this.d, aVar);
            }
        };
        if (gVar.Q()) {
            a("Running signal collection for " + gVar + " on the main thread");
            this.d.runOnUiThread(runnable);
            return;
        }
        a("Running signal collection for " + gVar + " on the background thread");
        runnable.run();
    }

    private void a(Collection<com.applovin.impl.mediation.a.f> collection) {
        String str;
        String d;
        JSONArray jSONArray = new JSONArray();
        for (com.applovin.impl.mediation.a.f fVar : collection) {
            try {
                JSONObject jSONObject = new JSONObject();
                com.applovin.impl.mediation.a.g a2 = fVar.a();
                jSONObject.put("name", a2.K());
                jSONObject.put("class", a2.J());
                jSONObject.put("adapter_version", fVar.c());
                jSONObject.put("sdk_version", fVar.b());
                JSONObject jSONObject2 = new JSONObject();
                if (StringUtils.isValidString(fVar.e())) {
                    str = "error_message";
                    d = fVar.e();
                } else {
                    str = "signal";
                    d = fVar.d();
                }
                jSONObject2.put(str, d);
                jSONObject.put("data", jSONObject2);
                jSONArray.put(jSONObject);
                a("Collected signal from " + a2);
            } catch (JSONException e) {
                a("Failed to create signal data", e);
            }
        }
        a(jSONArray);
    }

    private void a(JSONArray jSONArray) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(jSONArray);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        final List synchronizedList = CollectionUtils.synchronizedList(jSONArray.length());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final CountDownLatch countDownLatch = new CountDownLatch(jSONArray.length());
        ScheduledExecutorService b = this.b.Q().b();
        for (int i = 0; i < jSONArray.length(); i++) {
            final com.applovin.impl.mediation.a.g gVar = new com.applovin.impl.mediation.a.g(jSONArray.getJSONObject(i), jSONObject, this.b);
            b.execute(new Runnable() { // from class: com.applovin.impl.mediation.b.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a(gVar, new f.a() { // from class: com.applovin.impl.mediation.b.b.1.1
                        @Override // com.applovin.impl.mediation.a.f.a
                        public void a(com.applovin.impl.mediation.a.f fVar) {
                            if (atomicBoolean.get() && fVar != null) {
                                synchronizedList.add(fVar);
                            }
                            countDownLatch.countDown();
                        }
                    });
                }
            });
        }
        countDownLatch.await(((Long) this.b.a(com.applovin.impl.sdk.c.a.k)).longValue(), TimeUnit.MILLISECONDS);
        atomicBoolean.set(false);
        a(synchronizedList);
    }

    private void b(String str, Throwable th) {
        a("No signals collected: " + str, th);
        a(new JSONArray());
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject((String) this.b.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.w, (com.applovin.impl.sdk.c.d<String>) a));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray.length() == 0) {
                b("No signal providers found", null);
            } else {
                a(jSONArray, jSONObject);
            }
        } catch (InterruptedException e) {
            e = e;
            str = "Failed to wait for signals";
            b(str, e);
        } catch (JSONException e2) {
            e = e2;
            str = "Failed to parse signals JSON";
            b(str, e);
        } catch (Throwable th) {
            e = th;
            str = "Failed to collect signals";
            b(str, e);
        }
    }
}
