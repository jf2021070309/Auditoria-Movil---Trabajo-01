package com.applovin.impl.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
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
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final v f3932b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3933c;

    /* renamed from: d  reason: collision with root package name */
    public final SharedPreferences f3934d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f3935e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Object f3936f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f3937g;

    public c(m mVar) {
        this.a = mVar;
        this.f3932b = mVar.B();
        Context L = mVar.L();
        this.f3933c = L;
        this.f3934d = L.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(b.class.getName());
            Class.forName(a.class.getName());
        } catch (Throwable unused) {
        }
        try {
            Field field = Utils.getField(mVar.p().getClass(), "localSettings");
            field.setAccessible(true);
            this.f3937g = (HashMap) field.get(mVar.p());
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
        StringBuilder y = e.a.d.a.a.y("SDK Error: unknown value type: ");
        y.append(obj.getClass());
        throw new RuntimeException(y.toString());
    }

    private String e() {
        StringBuilder y = e.a.d.a.a.y("com.applovin.sdk.");
        y.append(Utils.shortenKey(this.a.z()));
        y.append(".");
        return y.toString();
    }

    public <T> b<T> a(String str, b<T> bVar) {
        synchronized (this.f3936f) {
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
            synchronized (this.f3936f) {
                Object obj = this.f3935e.get(bVar.a());
                if (obj == null) {
                    return bVar.b();
                }
                return bVar.a(obj);
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    public void a() {
        String e2 = e();
        synchronized (this.f3936f) {
            SharedPreferences.Editor edit = this.f3934d.edit();
            for (b<?> bVar : b.c()) {
                Object obj = this.f3935e.get(bVar.a());
                if (obj != null) {
                    this.a.a(e2 + bVar.a(), (String) obj, edit);
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
        synchronized (this.f3936f) {
            this.f3935e.put(bVar.a(), obj);
        }
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f3936f) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        b<Long> a = a(next, (b) null);
                        if (a != null) {
                            this.f3935e.put(a.a(), a(next, jSONObject, a.b()));
                            if (a == b.ev) {
                                this.f3935e.put(b.ew.a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e2) {
                        this.f3932b.b("SettingsManager", "Unable to parse JSON settingsValues array", e2);
                    }
                }
            }
        }
    }

    public List<String> b(b<String> bVar) {
        return CollectionUtils.explode((String) a(bVar));
    }

    public void b() {
        String e2 = e();
        synchronized (this.f3936f) {
            for (b<?> bVar : b.c()) {
                try {
                    Object a = this.a.a(e2 + bVar.a(), null, bVar.b().getClass(), this.f3934d);
                    if (a != null) {
                        this.f3935e.put(bVar.a(), a);
                    }
                } catch (Exception e3) {
                    v vVar = this.f3932b;
                    vVar.b("SettingsManager", "Unable to load \"" + bVar.a() + "\"", e3);
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
        synchronized (this.f3936f) {
            this.f3935e.clear();
        }
        this.a.a(this.f3934d);
    }

    public boolean d() {
        return this.a.p().isVerboseLoggingEnabled() || ((Boolean) a(b.ah)).booleanValue();
    }
}
