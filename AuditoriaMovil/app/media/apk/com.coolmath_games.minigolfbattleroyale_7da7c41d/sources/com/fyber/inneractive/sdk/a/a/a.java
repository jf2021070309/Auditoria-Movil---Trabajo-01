package com.fyber.inneractive.sdk.a.a;

import com.facebook.internal.ServerProtocol;
import com.fyber.inneractive.sdk.a.a.b;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.m;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public c a;
    HashMap<com.fyber.inneractive.sdk.a.a.a.b, d> b;
    final Object c;
    boolean d;
    private final Object e;
    private InterfaceC0038a f;

    /* renamed from: com.fyber.inneractive.sdk.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0038a {
    }

    private a() {
        this.a = new c();
        this.c = new Object();
        this.e = new Object();
        this.d = false;
        this.b = new HashMap<com.fyber.inneractive.sdk.a.a.a.b, d>() { // from class: com.fyber.inneractive.sdk.a.a.a.1
            final /* synthetic */ int a = 25;

            {
                com.fyber.inneractive.sdk.a.a.a.b[] values;
                for (com.fyber.inneractive.sdk.a.a.a.b bVar : com.fyber.inneractive.sdk.a.a.a.b.values()) {
                    if (bVar != com.fyber.inneractive.sdk.a.a.a.b.NONE) {
                        put(bVar, new d(this.a));
                    }
                }
            }
        };
        this.f = null;
    }

    public a(byte b) {
        this();
    }

    public final void a(final com.fyber.inneractive.sdk.a.a.a.b bVar, final int i) {
        m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.a.a.a.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (a.this.c) {
                    if (i != com.fyber.inneractive.sdk.a.a.a.a.d) {
                        c cVar = a.this.a;
                        com.fyber.inneractive.sdk.a.a.a.b bVar2 = bVar;
                        int i2 = i;
                        b bVar3 = cVar.a.get(bVar2);
                        if (bVar3 != null) {
                            int i3 = b.AnonymousClass1.a[i2 - 1];
                            if (i3 == 1) {
                                bVar3.b++;
                            } else if (i3 == 2) {
                                bVar3.c++;
                            } else if (i3 == 3) {
                                bVar3.a++;
                            }
                        }
                    } else {
                        a.this.a = new c();
                    }
                    try {
                        l.a("session_details.json", l.p(), a.this.a().toString().getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
            }
        });
    }

    final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", this.a.a());
            for (Map.Entry<com.fyber.inneractive.sdk.a.a.a.b, d> entry : this.b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                com.fyber.inneractive.sdk.a.a.a.b key = entry.getKey();
                Iterator<b> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().a(true, true));
                }
                jSONObject.put(key.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    final void a(com.fyber.inneractive.sdk.a.a.a.b bVar, b bVar2) {
        synchronized (this.e) {
            d dVar = this.b.get(bVar);
            if (dVar != null) {
                dVar.add(bVar2);
            }
        }
    }

    public final JSONArray a(UnitDisplayType unitDisplayType) {
        com.fyber.inneractive.sdk.a.a.a.b[] values;
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.a.a.a.b bVar : com.fyber.inneractive.sdk.a.a.a.b.values()) {
                if (bVar != com.fyber.inneractive.sdk.a.a.a.b.NONE && (unitDisplayType == null || bVar.h == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.h.value());
                    jSONObject.put("subType", bVar.name().toLowerCase().contains("video") ? "video" : ServerProtocol.DIALOG_PARAM_DISPLAY);
                    d dVar = this.b.get(bVar);
                    int a = IAConfigManager.c().a.a("number_of_sessions", 5, 0);
                    if (a > 0 && dVar != null && dVar.size() >= a) {
                        jSONObject.put("sessionData", dVar.a(a, bVar.i));
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public final void a(c cVar) {
        com.fyber.inneractive.sdk.a.a.a.b[] values;
        b bVar;
        for (com.fyber.inneractive.sdk.a.a.a.b bVar2 : com.fyber.inneractive.sdk.a.a.a.b.values()) {
            if (bVar2 != com.fyber.inneractive.sdk.a.a.a.b.NONE && (bVar = cVar.a.get(bVar2)) != null && bVar.a != 0) {
                a(bVar2, bVar);
            }
        }
    }
}
