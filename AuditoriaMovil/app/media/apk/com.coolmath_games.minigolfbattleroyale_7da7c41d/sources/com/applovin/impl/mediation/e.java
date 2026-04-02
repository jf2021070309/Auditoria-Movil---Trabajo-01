package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e {
    private final k a;
    private final r b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final JSONArray d = new JSONArray();
    private final LinkedHashSet<String> e = new LinkedHashSet<>();
    private final Object f = new Object();
    private boolean g;

    public e(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
    }

    public void a(Activity activity) {
        if (this.c.compareAndSet(false, true)) {
            this.g = activity == null;
            this.a.Q().a(new com.applovin.impl.mediation.b.a(activity, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.applovin.impl.mediation.a.e eVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f) {
            z = !a(eVar);
            if (z) {
                this.e.add(eVar.J());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "class", eVar.J());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.d.put(jSONObject);
            }
        }
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "DID_INITIALIZE");
            bundle.putString("network_name", eVar.K());
            bundle.putInt("initialization_status", initializationStatus.getCode());
            if (StringUtils.isValidString(str)) {
                bundle.putString("error_message", str);
            }
            this.a.af().a(bundle, "max_adapter_events");
            this.a.a(eVar);
            this.a.C().processAdapterInitializationPostback(eVar, j, initializationStatus, str);
            this.a.af().a(initializationStatus, eVar.J());
        }
    }

    public void a(com.applovin.impl.mediation.a.e eVar, Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString("type", "WILL_INITIALIZE");
        bundle.putString("network_name", eVar.K());
        this.a.af().a(bundle, "max_adapter_events");
        g a = this.a.A().a(eVar);
        if (a != null) {
            r rVar = this.b;
            rVar.c("MediationAdapterInitializationManager", "Initializing adapter " + eVar);
            a.a(MaxAdapterParametersImpl.a(eVar), activity);
        }
    }

    public boolean a() {
        return this.c.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(com.applovin.impl.mediation.a.e eVar) {
        boolean contains;
        synchronized (this.f) {
            contains = this.e.contains(eVar.J());
        }
        return contains;
    }

    public boolean b() {
        return this.g;
    }

    public LinkedHashSet<String> c() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f) {
            linkedHashSet = this.e;
        }
        return linkedHashSet;
    }

    public JSONArray d() {
        JSONArray jSONArray;
        synchronized (this.f) {
            jSONArray = this.d;
        }
        return jSONArray;
    }
}
