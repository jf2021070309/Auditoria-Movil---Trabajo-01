package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e {
    private ArrayList<g> a = new ArrayList<>();
    private HashMap<Integer, g> b = new HashMap<>();
    private int c = 2;
    private JSONArray e = as.b();
    private int f = 1;
    private HashMap<String, ArrayList<f>> d = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, f fVar) {
        ArrayList<f> arrayList = this.d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.d.put(str, arrayList);
        }
        arrayList.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, f fVar) {
        synchronized (this.d) {
            ArrayList<f> arrayList = this.d.get(str);
            if (arrayList != null) {
                arrayList.remove(fVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        af a = a.a();
        if (!a.d() && !a.e() && a.d()) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            newSingleThreadExecutor.submit(new Runnable() { // from class: com.adcolony.sdk.e.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject d = a.a().b().d();
                    as.a(d, "os_name", "android");
                    e.this.a(new ADCVMModule(a.c(), 1, a.a().l().g() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5", d, newSingleThreadExecutor));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(g gVar) {
        synchronized (this.a) {
            this.a.add(gVar);
            this.b.put(Integer.valueOf(gVar.a()), gVar);
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(int i) {
        g gVar;
        synchronized (this.a) {
            gVar = this.b.get(Integer.valueOf(i));
            if (gVar == null) {
                gVar = null;
            } else {
                this.a.remove(gVar);
                this.b.remove(Integer.valueOf(i));
                gVar.b();
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        JSONArray jSONArray;
        synchronized (this.a) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                this.a.get(size).c();
            }
        }
        if (this.e.length() <= 0) {
            jSONArray = null;
        } else {
            JSONArray jSONArray2 = this.e;
            this.e = as.b();
            jSONArray = jSONArray2;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    final JSONObject jSONObject = jSONArray.getJSONObject(i);
                    final String string = jSONObject.getString("m_type");
                    if (jSONObject.getInt("m_origin") >= 2) {
                        if (a.d()) {
                            q.a(new Runnable() { // from class: com.adcolony.sdk.e.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    e.this.a(string, jSONObject);
                                }
                            });
                        }
                    } else {
                        a(string, jSONObject);
                    }
                } catch (JSONException e) {
                    au.h.a("JSON error from message dispatcher's update_modules(): ").b(e.toString());
                }
            }
        }
    }

    void a(String str, JSONObject jSONObject) {
        synchronized (this.d) {
            ArrayList<f> arrayList = this.d.get(str);
            if (arrayList != null) {
                d dVar = new d(jSONObject);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        arrayList.get(i).a(dVar);
                    } catch (RuntimeException e) {
                        au.h.b(e);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("m_id")) {
                int i = this.f;
                this.f = i + 1;
                jSONObject.put("m_id", i);
            }
            if (!jSONObject.has("m_origin")) {
                jSONObject.put("m_origin", 0);
            }
            int i2 = jSONObject.getInt("m_target");
            if (i2 == 0) {
                synchronized (this) {
                    this.e.put(jSONObject);
                }
                return;
            }
            g gVar = this.b.get(Integer.valueOf(i2));
            if (gVar != null) {
                gVar.a(jSONObject);
            }
        } catch (JSONException e) {
            au.h.a("JSON error in ADCMessageDispatcher's send_message(): ").b(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<g> c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        int i = this.c;
        this.c = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<Integer, g> e() {
        return this.b;
    }
}
