package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements b.c<JSONObject> {
    private static WeakReference<MaxDebuggerActivity> a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3470b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final m f3471c;

    /* renamed from: d  reason: collision with root package name */
    private final v f3472d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.ui.b.b f3473e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.debugger.a.b.b> f3474f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f3475g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private boolean f3476h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f3477i;

    public a(m mVar) {
        this.f3471c = mVar;
        this.f3472d = mVar.B();
        Context L = mVar.L();
        this.f3477i = L;
        this.f3473e = new com.applovin.impl.mediation.debugger.ui.b.b(L);
    }

    private List<com.applovin.impl.mediation.debugger.a.b.b> a(JSONObject jSONObject, m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.a.b.b bVar = new com.applovin.impl.mediation.debugger.a.b.b(jSONObject2, mVar);
                arrayList.add(bVar);
                this.f3474f.put(bVar.m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.a.a.a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.a.b.b> list, m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.a.a.a(jSONObject2, this.f3474f, mVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void a(List<com.applovin.impl.mediation.debugger.a.b.b> list) {
        boolean z;
        Iterator<com.applovin.impl.mediation.debugger.a.b.b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            com.applovin.impl.mediation.debugger.a.b.b next = it.next();
            if (next.e() && next.a() == b.a.INVALID_INTEGRATION) {
                z = true;
                break;
            }
        }
        if (z) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.a.2
                @Override // java.lang.Runnable
                public void run() {
                    new AlertDialog.Builder(a.this.f3471c.ae().a()).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.a.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i2) {
                            a.this.c();
                        }
                    }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                }
            }, TimeUnit.SECONDS.toMillis(2L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        WeakReference<MaxDebuggerActivity> weakReference = a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void a() {
        if (this.f3475g.compareAndSet(false, true)) {
            this.f3471c.S().a(new com.applovin.impl.mediation.debugger.b.a(this, this.f3471c), o.a.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(int i2, String str, JSONObject jSONObject) {
        v vVar = this.f3472d;
        vVar.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i2);
        v.i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f3473e.a(null, null, null, null, null, this.f3471c);
        this.f3475g.set(false);
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(JSONObject jSONObject, int i2) {
        List<com.applovin.impl.mediation.debugger.a.b.b> a2 = a(jSONObject, this.f3471c);
        List<com.applovin.impl.mediation.debugger.a.a.a> a3 = a(jSONObject, a2, this.f3471c);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f3473e.a(a2, a3, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), this.f3471c);
        if (b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.c();
                }
            }, TimeUnit.SECONDS.toMillis(2L));
        } else {
            a(a2);
        }
    }

    public void a(boolean z) {
        this.f3476h = z;
    }

    public boolean b() {
        return this.f3476h;
    }

    public void c() {
        a();
        if (f() || !f3470b.compareAndSet(false, true)) {
            v.i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        this.f3471c.ae().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    v.f("AppLovinSdk", "Mediation debugger destroyed");
                    a.this.f3471c.ae().b(this);
                    WeakReference unused = a.a = null;
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    v.f("AppLovinSdk", "Started mediation debugger");
                    if (!a.this.f() || a.a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = a.a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(a.this.f3473e, a.this.f3471c.ae());
                    }
                    a.f3470b.set(false);
                }
            }
        });
        Intent intent = new Intent(this.f3477i, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        v.f("AppLovinSdk", "Starting mediation debugger...");
        this.f3477i.startActivity(intent);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MediationDebuggerService{, listAdapter=");
        y.append(this.f3473e);
        y.append("}");
        return y.toString();
    }
}
