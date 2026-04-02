package com.applovin.impl.mediation.b;

import android.content.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.util.FileUtil;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.a.h;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
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

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f3406c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f3407d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f3408e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3409f;

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

    public b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, m mVar, a aVar) {
        super("TaskCollectSignals", mVar);
        this.f3406c = maxAdFormat;
        this.f3407d = map;
        this.f3408e = context;
        this.f3409f = aVar;
    }

    private static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put(Action.CLASS_ATTRIBUTE, str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", FileUtil.BUF_SIZE);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final h hVar, final g.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f4020b.E().collectSignal(b.this.f3406c, hVar, b.this.f3408e, aVar);
            }
        };
        if (hVar.V()) {
            StringBuilder y = e.a.d.a.a.y("Running signal collection for ");
            y.append(hVar.P());
            y.append(" on the main thread");
            a(y.toString());
            AppLovinSdkUtils.runOnUiThread(runnable);
            return;
        }
        StringBuilder y2 = e.a.d.a.a.y("Running signal collection for ");
        y2.append(hVar.P());
        y2.append(" on the background thread");
        a(y2.toString());
        runnable.run();
    }

    private void a(Collection<com.applovin.impl.mediation.a.g> collection) {
        String str;
        String d2;
        JSONArray jSONArray = new JSONArray();
        for (com.applovin.impl.mediation.a.g gVar : collection) {
            try {
                JSONObject jSONObject = new JSONObject();
                h a2 = gVar.a();
                jSONObject.put("name", a2.P());
                jSONObject.put(Action.CLASS_ATTRIBUTE, a2.O());
                jSONObject.put("adapter_version", gVar.c());
                jSONObject.put("sdk_version", gVar.b());
                JSONObject jSONObject2 = new JSONObject();
                if (StringUtils.isValidString(gVar.e())) {
                    str = "error_message";
                    d2 = gVar.e();
                } else {
                    str = "signal";
                    d2 = gVar.d();
                }
                jSONObject2.put(str, d2);
                jSONObject.put("data", jSONObject2);
                jSONArray.put(jSONObject);
                a("Collected signal from " + a2);
            } catch (JSONException e2) {
                a("Failed to create signal data", e2);
            }
        }
        a(jSONArray);
    }

    private void a(JSONArray jSONArray) {
        a aVar = this.f3409f;
        if (aVar != null) {
            aVar.a(jSONArray);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        final List synchronizedList = CollectionUtils.synchronizedList(jSONArray.length());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final CountDownLatch countDownLatch = new CountDownLatch(jSONArray.length());
        ScheduledExecutorService b2 = this.f4020b.S().b();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            final h hVar = new h(this.f3407d, jSONArray.getJSONObject(i2), jSONObject, this.f4020b);
            b2.execute(new Runnable() { // from class: com.applovin.impl.mediation.b.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a(hVar, new g.a() { // from class: com.applovin.impl.mediation.b.b.1.1
                        @Override // com.applovin.impl.mediation.a.g.a
                        public void a(com.applovin.impl.mediation.a.g gVar) {
                            if (atomicBoolean.get() && gVar != null) {
                                synchronizedList.add(gVar);
                            }
                            countDownLatch.countDown();
                        }
                    });
                }
            });
        }
        countDownLatch.await(((Long) this.f4020b.a(com.applovin.impl.sdk.c.a.f3924k)).longValue(), TimeUnit.MILLISECONDS);
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
            JSONObject jSONObject = new JSONObject((String) this.f4020b.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.y, (com.applovin.impl.sdk.c.d<String>) a));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                a(jSONArray, jSONObject);
                return;
            }
            b("No signal providers found", null);
        } catch (InterruptedException e2) {
            e = e2;
            str = "Failed to wait for signals";
            b(str, e);
        } catch (JSONException e3) {
            e = e3;
            str = "Failed to parse signals JSON";
            b(str, e);
        } catch (Throwable th) {
            e = th;
            str = "Failed to collect signals";
            b(str, e);
        }
    }
}
