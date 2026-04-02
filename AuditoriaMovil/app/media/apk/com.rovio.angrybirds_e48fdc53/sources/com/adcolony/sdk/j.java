package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.av;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j {
    at a;
    ScheduledExecutorService b;
    HashMap<String, Object> e;
    List<av> c = new ArrayList();
    List<av> d = new ArrayList();
    private ar f = new ar("adcolony_android", "3.2.0", "Production");
    private ar g = new ar("adcolony_fatal_reports", "3.2.0", "Production");

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(at atVar, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.a = atVar;
        this.b = scheduledExecutorService;
        this.e = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(String str) {
        this.e.put("controllerVersion", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(String str) {
        this.e.put("sessionId", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(long j, TimeUnit timeUnit) {
        this.b.scheduleAtFixedRate(new Runnable() { // from class: com.adcolony.sdk.j.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    j.this.b();
                } catch (RuntimeException e) {
                    Log.e("ADCLogPOC", "RuntimeException thrown from {}#report. Exception was suppressed.", e);
                }
            }
        }, j, j, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        this.b.shutdown();
        try {
            if (!this.b.awaitTermination(1L, TimeUnit.SECONDS)) {
                this.b.shutdownNow();
                if (!this.b.awaitTermination(1L, TimeUnit.SECONDS)) {
                    System.err.println(getClass().getSimpleName() + ": ScheduledExecutorService did not terminate");
                }
            }
        } catch (InterruptedException e) {
            this.b.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    synchronized void b() {
        synchronized (this) {
            try {
                if (this.c.size() > 0) {
                    this.a.a(a(this.f, this.c));
                    this.c.clear();
                }
                if (this.d.size() > 0) {
                    this.a.a(a(this.g, this.d));
                    this.d.clear();
                }
            } catch (IOException e) {
            } catch (JSONException e2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c(String str) {
        a(new av.a().a(3).a(this.f).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(String str) {
        a(new av.a().a(2).a(this.f).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e(String str) {
        a(new av.a().a(1).a(this.f).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void f(String str) {
        a(new av.a().a(0).a(this.f).a(str).a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(am amVar) {
        amVar.a(this.g);
        amVar.a(-1);
        b(amVar);
    }

    synchronized void a(final av avVar) {
        if (this.b != null && !this.b.isShutdown()) {
            this.b.submit(new Runnable() { // from class: com.adcolony.sdk.j.2
                @Override // java.lang.Runnable
                public void run() {
                    j.this.c.add(avVar);
                }
            });
        }
    }

    synchronized void b(av avVar) {
        this.d.add(avVar);
    }

    String a(ar arVar, List<av> list) {
        String b = a.a().a.b();
        String str = this.e.get("advertiserId") != null ? (String) this.e.get("advertiserId") : "unknown";
        if (b != null && b.length() > 0 && !b.equals(str)) {
            this.e.put("advertiserId", b);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", arVar.a());
        jSONObject.put("environment", arVar.c());
        jSONObject.put("version", arVar.b());
        JSONArray jSONArray = new JSONArray();
        for (av avVar : list) {
            jSONArray.put(c(avVar));
        }
        jSONObject.put("logs", jSONArray);
        return jSONObject.toString();
    }

    private synchronized JSONObject c(av avVar) {
        JSONObject jSONObject;
        jSONObject = new JSONObject(this.e);
        jSONObject.put("environment", avVar.e().c());
        jSONObject.put("level", avVar.b());
        jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, avVar.c());
        jSONObject.put("clientTimestamp", avVar.d());
        if (avVar instanceof am) {
            jSONObject = as.a(jSONObject, ((am) avVar).a());
            jSONObject.put("platform", "android");
        }
        return jSONObject;
    }
}
