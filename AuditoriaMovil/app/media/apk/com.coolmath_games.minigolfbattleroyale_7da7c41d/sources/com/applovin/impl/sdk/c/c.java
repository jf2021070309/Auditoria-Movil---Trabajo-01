package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    protected final k a;
    protected final r b;
    protected final Context c;
    protected final SharedPreferences d;
    private final Map<String, Object> e = new HashMap();
    private final Object f = new Object();
    private Map<String, Object> g;

    public c(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        Context J = kVar.J();
        this.c = J;
        this.d = J.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        try {
            Field field = Utils.getField(kVar.p().getClass(), "localSettings");
            field.setAccessible(true);
            this.g = (HashMap) field.get(kVar.p());
        } catch (Throwable unused2) {
        }
        b();
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    private String e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.a.x()) + ".";
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.f) {
            Iterator<b<?>> it = b.c().iterator();
            while (it.hasNext()) {
                b<T> bVar2 = (b<T>) it.next();
                if (bVar2.a().equals(str)) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    public <T> T a(b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f) {
                Object obj = this.e.get(bVar.a());
                if (obj == null) {
                    return bVar.b();
                }
                return bVar.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public void a() {
        String e = e();
        synchronized (this.f) {
            SharedPreferences.Editor edit = this.d.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.e.get(bVar.a());
                if (obj != null) {
                    this.a.a(e + bVar.a(), (String) obj, edit);
                }
            }
            edit.apply();
        }
    }

    public <T> void a(b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.f) {
            this.e.put(bVar.a(), obj);
        }
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> a = a(next, (b) null);
                        if (a != null) {
                            this.e.put(a.a(), a(next, jSONObject, a.b()));
                            if (a == b.ep) {
                                this.e.put(b.eq.a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e) {
                        this.b.b("SettingsManager", "Unable to parse JSON settingsValues array", e);
                    }
                }
            }
        }
    }

    public List<String> b(b<String> bVar) {
        return CollectionUtils.explode((String) a(bVar));
    }

    public void b() {
        String e = e();
        synchronized (this.f) {
            for (b<?> bVar : b.c()) {
                try {
                    Object a = this.a.a(e + bVar.a(), null, bVar.b().getClass(), this.d);
                    if (a != null) {
                        this.e.put(bVar.a(), a);
                    }
                } catch (Exception e2) {
                    r rVar = this.b;
                    rVar.b("SettingsManager", "Unable to load \"" + bVar.a() + "\"", e2);
                }
            }
        }
    }

    public List<MaxAdFormat> c(b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String str : b(bVar)) {
            arrayList.add(MaxAdFormat.formatFromString(str));
        }
        return arrayList;
    }

    public void c() {
        synchronized (this.f) {
            this.e.clear();
        }
        this.a.a(this.d);
    }

    public boolean d() {
        return this.a.p().isVerboseLoggingEnabled() || ((Boolean) a(b.aa)).booleanValue();
    }
}
