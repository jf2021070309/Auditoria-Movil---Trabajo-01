package com.fyber.inneractive.sdk.f;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.j.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
import com.fyber.inneractive.sdk.util.q;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class b<T extends com.fyber.inneractive.sdk.j.e> extends a {
    private static final String a = "24";
    private static final String b = "3";
    private static final String d = "24";
    private static final String e = "3";
    private final String f;
    private final UnitDisplayType g;
    private final T h;
    private final InneractiveAdRequest i;
    private JSONArray j;

    public b(T t, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.h = t;
        this.i = inneractiveAdRequest;
        this.f = str;
        this.g = unitDisplayType;
        this.j = jSONArray;
    }

    public final void b() {
        final f a2 = c.a().a(this.f);
        final Map<String, Long> i = a2.i();
        if (!a2.h()) {
            IAlog.b("MetricCreativeReporter: Metric data not valid, data: %s", c.a().a(this.f).toString());
            return;
        }
        c.a().a.remove(this.f);
        m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                int a3;
                int a4;
                String str;
                IAlog.b("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
                if (b.this.f == null || b.this.g == null) {
                    return;
                }
                if (b.this.g != UnitDisplayType.BANNER && b.this.g != UnitDisplayType.MRECT && !b.this.g.isFullscreenUnit()) {
                    IAlog.b("Unit display type %s is not supported for metric event", b.this.g.value());
                    return;
                }
                IAlog.b("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", a2.toString());
                if (b.this.g == UnitDisplayType.BANNER || b.this.g == UnitDisplayType.MRECT) {
                    String a5 = IAConfigManager.c().a.a("ad_metrics_interval_banner", b.a);
                    String a6 = IAConfigManager.c().a.a("ad_metrics_limit_banner", b.b);
                    a3 = q.a(a5, 24);
                    a4 = q.a(a6, 3);
                    str = "LastSentMetricsBanner";
                } else {
                    String a7 = IAConfigManager.c().a.a("ad_metrics_interval_interstitial", b.d);
                    String a8 = IAConfigManager.c().a.a("ad_metrics_limit_interstitial", b.e);
                    a3 = q.a(a7, 24);
                    a4 = q.a(a8, 3);
                    str = "LastSentMetricsInterstitial";
                }
                Application p = l.p();
                if (p != null) {
                    SharedPreferences sharedPreferences = p.getSharedPreferences("IAConfigPrefs", 0);
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
                    } catch (JSONException unused) {
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    if (b.this.a() && !a.a(a3, a4, jSONArray, copyOnWriteArrayList)) {
                        copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                        b bVar = b.this;
                        b.a(bVar, bVar.i, b.this.h, i);
                    }
                    sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
                }
            }
        });
    }

    static /* synthetic */ void a(b bVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, Map map) {
        try {
            n.a aVar = new n.a(com.fyber.inneractive.sdk.h.m.METRIC_MEASUREMENTS_EVENT, inneractiveAdRequest, eVar, bVar.j);
            n.b bVar2 = new n.b();
            for (String str : map.keySet()) {
                bVar2.a(str, map.get(str));
            }
            aVar.a(bVar2);
            aVar.b(null);
        } catch (Exception unused) {
        }
    }
}
