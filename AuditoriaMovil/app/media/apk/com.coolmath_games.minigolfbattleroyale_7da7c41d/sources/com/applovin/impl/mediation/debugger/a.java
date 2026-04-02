package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.applovin.impl.mediation.debugger.a.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.drive.DriveFile;
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
    private static final AtomicBoolean b = new AtomicBoolean();
    private final k c;
    private final r d;
    private final com.applovin.impl.mediation.debugger.ui.b.b e;
    private final Map<String, com.applovin.impl.mediation.debugger.a.b.b> f = new HashMap();
    private final AtomicBoolean g = new AtomicBoolean();
    private boolean h;
    private final Context i;

    public a(k kVar) {
        this.c = kVar;
        this.d = kVar.z();
        this.i = kVar.J();
        this.e = new com.applovin.impl.mediation.debugger.ui.b.b(this.i);
    }

    private List<com.applovin.impl.mediation.debugger.a.b.b> a(JSONObject jSONObject, k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.a.b.b bVar = new com.applovin.impl.mediation.debugger.a.b.b(jSONObject2, kVar);
                arrayList.add(bVar);
                this.f.put(bVar.l(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.a.a.a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.a.b.b> list, k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.a.a.a(jSONObject2, this.f, kVar));
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
                    new AlertDialog.Builder(a.this.c.ad().a()).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.a.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
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
        if (this.g.compareAndSet(false, true)) {
            this.c.Q().a(new com.applovin.impl.mediation.debugger.b.a(this, this.c), o.a.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(int i, String str, JSONObject jSONObject) {
        r rVar = this.d;
        rVar.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        r.i("AppLovinSdk", "Unable to show mediation debugger.");
        this.e.a(null, null, null, null, null, this.c);
        this.g.set(false);
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(JSONObject jSONObject, int i) {
        List<com.applovin.impl.mediation.debugger.a.b.b> a2 = a(jSONObject, this.c);
        List<com.applovin.impl.mediation.debugger.a.a.a> a3 = a(jSONObject, a2, this.c);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.e.a(a2, a3, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), this.c);
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
        this.h = z;
    }

    public boolean b() {
        return this.h;
    }

    public void c() {
        a();
        if (f() || !b.compareAndSet(false, true)) {
            r.i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        this.c.ad().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    r.f("AppLovinSdk", "Mediation debugger destroyed");
                    a.this.c.ad().b(this);
                    WeakReference unused = a.a = null;
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    r.f("AppLovinSdk", "Started mediation debugger");
                    if (!a.this.f() || a.a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = a.a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(a.this.e, a.this.c.ad());
                    }
                    a.b.set(false);
                }
            }
        });
        Intent intent = new Intent(this.i, MaxDebuggerActivity.class);
        intent.setFlags(DriveFile.MODE_READ_ONLY);
        r.f("AppLovinSdk", "Starting mediation debugger...");
        this.i.startActivity(intent);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.e + "}";
    }
}
