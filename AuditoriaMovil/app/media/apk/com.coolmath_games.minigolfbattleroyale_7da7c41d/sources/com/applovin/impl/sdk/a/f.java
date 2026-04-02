package com.applovin.impl.sdk.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f implements Runnable {
    private static boolean i;
    private final k a;
    private final MaxAdFormat b;
    private List<d> c;
    private d f;
    private boolean h;
    private b g = b.NONE;
    private final List<JSONObject> d = new ArrayList();
    private final Object e = new Object();

    /* loaded from: classes.dex */
    public static class a implements AppLovinAdLoadListener {
        private final k a;
        private final d b;
        private final AppLovinAdLoadListener c;
        private boolean d;

        public a(d dVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
            this.a = kVar;
            this.b = dVar;
            this.c = appLovinAdLoadListener;
        }

        public void a(boolean z) {
            this.d = z;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            this.a.Z().a((AppLovinAdBase) ((g) appLovinAd), false, this.d);
            this.c.adReceived(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            this.a.Z().a(this.b, this.d, i);
            this.c.failedToReceiveAd(i);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE(0, IntegrityManager.INTEGRITY_TYPE_NONE),
        TIMER(1, "timer"),
        APP_PAUSED(2, "backgrounded"),
        IMPRESSION(3, "impression"),
        WATERFALL_RESTARTED(3, "waterfall_restarted"),
        UNKNOWN_ZONE(4, "unknown_zone"),
        SKIPPED_ZONE(5, "skipped_zone"),
        REPEATED_ZONE(6, "repeated_zone");
        
        private final int i;
        private final String j;

        b(int i, String str) {
            this.i = i;
            this.j = str;
        }

        public int a() {
            return this.i;
        }

        public String b() {
            return this.j;
        }
    }

    public f(MaxAdFormat maxAdFormat, k kVar) {
        this.a = kVar;
        this.b = maxAdFormat;
    }

    private static JSONObject a(d dVar, k kVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", dVar.a());
        JsonUtils.putLong(jSONObject, "response_ts_s", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
        return jSONObject;
    }

    public static void a(d dVar, int i2, k kVar) {
        if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            if (i) {
                return;
            }
            r.i("AppLovinSdk", "Unknown zone in waterfall: " + dVar.a());
            i = true;
        }
        JSONObject a2 = a(dVar, kVar);
        JsonUtils.putInt(a2, "error_code", i2);
        a(b.UNKNOWN_ZONE, b.NONE, JsonUtils.getJSONArray(a2), null, kVar);
    }

    private void a(d dVar, JSONObject jSONObject) {
        b bVar;
        JsonUtils.putAll(jSONObject, a(dVar, this.a));
        synchronized (this.e) {
            if (a(dVar)) {
                a(b.WATERFALL_RESTARTED);
            } else {
                if (b(dVar)) {
                    a(jSONObject, dVar);
                    bVar = b.REPEATED_ZONE;
                } else if (c(dVar)) {
                    a(jSONObject, dVar);
                    bVar = b.SKIPPED_ZONE;
                }
                a(bVar, dVar);
            }
            a(jSONObject, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a(bVar, (d) null);
    }

    private void a(b bVar, d dVar) {
        if (!((Boolean) this.a.a(com.applovin.impl.sdk.c.b.fb)).booleanValue()) {
            if (this.h) {
                return;
            }
            if (bVar == b.SKIPPED_ZONE || bVar == b.REPEATED_ZONE) {
                r.i("AppLovinSdk", "Invalid zone in waterfall: " + dVar);
                this.h = true;
            }
        }
        synchronized (this.e) {
            if (this.d.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) this.d);
            this.d.clear();
            b bVar2 = this.g;
            this.g = bVar;
            a(bVar, bVar2, jSONArray, this.b, this.a);
        }
    }

    private static void a(b bVar, b bVar2, JSONArray jSONArray, MaxAdFormat maxAdFormat, k kVar) {
        kVar.Q().a(new m(bVar, bVar2, jSONArray, maxAdFormat, kVar), o.a.BACKGROUND);
    }

    private void a(JSONObject jSONObject, d dVar) {
        synchronized (this.e) {
            this.d.add(jSONObject);
            this.f = dVar;
        }
    }

    private boolean a(d dVar) {
        if (this.f != null) {
            int indexOf = this.c.indexOf(dVar);
            int indexOf2 = this.c.indexOf(this.f);
            if (indexOf == 0 || indexOf < indexOf2) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        long c = c();
        if (c > 0) {
            if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eY)).booleanValue()) {
                com.applovin.impl.sdk.utils.d.a(c, this.a, this);
            } else {
                com.applovin.impl.sdk.utils.m.a(c, this.a, this);
            }
        }
    }

    private boolean b(d dVar) {
        return this.f == dVar;
    }

    private long c() {
        return TimeUnit.SECONDS.toMillis(((Long) this.a.a(com.applovin.impl.sdk.c.b.eX)).longValue());
    }

    private boolean c(d dVar) {
        int indexOf = this.c.indexOf(dVar);
        d dVar2 = this.f;
        return indexOf != (dVar2 != null ? this.c.indexOf(dVar2) + 1 : 0);
    }

    public void a() {
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eZ)).booleanValue()) {
            a(b.IMPRESSION);
        }
    }

    public void a(AppLovinAdBase appLovinAdBase, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ad_id", appLovinAdBase.getAdIdNumber());
        JsonUtils.putLong(jSONObject, "ad_created_ts_s", TimeUnit.MILLISECONDS.toSeconds(appLovinAdBase.getCreatedAtMillis()));
        JsonUtils.putBoolean(jSONObject, "is_preloaded", z);
        JsonUtils.putBoolean(jSONObject, "for_bidding", z2);
        a(appLovinAdBase.getAdZone(), jSONObject);
    }

    public void a(d dVar, boolean z, int i2) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "error_code", i2);
        JsonUtils.putBoolean(jSONObject, "for_bidding", z);
        a(dVar, jSONObject);
    }

    public void a(List<d> list) {
        if (this.c != null) {
            return;
        }
        this.c = list;
        b();
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.fa)).booleanValue()) {
            this.a.ai().registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    f.this.a(b.APP_PAUSED);
                    synchronized (f.this.e) {
                        f.this.d.clear();
                    }
                }
            }, new IntentFilter("com.applovin.application_paused"));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a(b.TIMER);
        b();
    }
}
