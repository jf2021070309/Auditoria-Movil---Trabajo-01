package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3676b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3677c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final JSONArray f3678d = new JSONArray();

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet<String> f3679e = new LinkedHashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final Object f3680f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private List<com.applovin.impl.mediation.a.f> f3681g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3682h;

    public e(m mVar) {
        this.a = mVar;
        this.f3676b = mVar.B();
    }

    private List<com.applovin.impl.mediation.a.f> a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new com.applovin.impl.mediation.a.f(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, this.a));
        }
        return arrayList;
    }

    public void a(Activity activity) {
        if (this.f3677c.compareAndSet(false, true)) {
            this.f3682h = activity == null;
            String str = (String) this.a.a(com.applovin.impl.sdk.c.d.z);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<com.applovin.impl.mediation.a.f> a = a(JsonUtils.getJSONArray(jSONObject, this.a.J().a() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f3681g = a;
                    this.a.S().a(new com.applovin.impl.mediation.b.a(a, activity, this.a));
                } catch (JSONException e2) {
                    this.f3676b.b("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e2);
                }
            }
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, long j2, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f3680f) {
            z = !a(fVar);
            if (z) {
                this.f3679e.add(fVar.O());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, Action.CLASS_ATTRIBUTE, fVar.O());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f3678d.put(jSONObject);
            }
        }
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "DID_INITIALIZE");
            bundle.putString("network_name", fVar.P());
            bundle.putInt("initialization_status", initializationStatus.getCode());
            if (StringUtils.isValidString(str)) {
                bundle.putString("error_message", str);
            }
            this.a.ag().a(bundle, "max_adapter_events");
            this.a.a(fVar);
            this.a.E().processAdapterInitializationPostback(fVar, j2, initializationStatus, str);
            this.a.ag().a(initializationStatus, fVar.O());
        }
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity) {
        a(fVar, activity, null);
    }

    public void a(com.applovin.impl.mediation.a.f fVar, Activity activity, Runnable runnable) {
        List<com.applovin.impl.mediation.a.f> list;
        if (this.a.J().a() && (list = this.f3681g) != null) {
            Iterator<com.applovin.impl.mediation.a.f> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                com.applovin.impl.mediation.a.f next = it.next();
                if (next.O().equals(fVar.O())) {
                    fVar = next;
                    break;
                }
            }
        }
        if (fVar == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "WILL_INITIALIZE");
        bundle.putString("network_name", fVar.P());
        this.a.ag().a(bundle, "max_adapter_events");
        g a = this.a.C().a(fVar);
        if (a == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        v vVar = this.f3676b;
        vVar.c("MediationAdapterInitializationManager", "Initializing adapter " + fVar);
        a.a(MaxAdapterParametersImpl.a(fVar), activity, runnable);
    }

    public boolean a() {
        return this.f3677c.get();
    }

    public boolean a(com.applovin.impl.mediation.a.f fVar) {
        boolean contains;
        synchronized (this.f3680f) {
            contains = this.f3679e.contains(fVar.O());
        }
        return contains;
    }

    public boolean b() {
        return this.f3682h;
    }

    public LinkedHashSet<String> c() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f3680f) {
            linkedHashSet = this.f3679e;
        }
        return linkedHashSet;
    }

    public JSONArray d() {
        JSONArray jSONArray;
        synchronized (this.f3680f) {
            jSONArray = this.f3678d;
        }
        return jSONArray;
    }
}
