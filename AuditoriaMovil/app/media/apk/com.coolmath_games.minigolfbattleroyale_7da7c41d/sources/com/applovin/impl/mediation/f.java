package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f {
    private final k a;
    private final r b;
    private final Object c = new Object();
    private final Map<String, Class<? extends MaxAdapter>> d = new HashMap();
    private final Set<String> e = new HashSet();
    private final Object f = new Object();
    private final Set<a> g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private final String a;
        private final String b;
        private final MaxAdFormat c;
        private final JSONObject d;

        a(String str, String str2, com.applovin.impl.mediation.a.a aVar, k kVar) {
            this.a = str;
            this.b = str2;
            JSONObject jSONObject = new JSONObject();
            this.d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(this.d, "operation", str2);
            if (aVar == null) {
                this.c = null;
                return;
            }
            this.c = aVar.getFormat();
            if (aVar.getFormat() != null) {
                JsonUtils.putString(this.d, "format", aVar.getFormat().getLabel());
            }
        }

        JSONObject a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                MaxAdFormat maxAdFormat = this.c;
                MaxAdFormat maxAdFormat2 = aVar.c;
                return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.a + "', operationTag='" + this.b + "', format=" + this.c + '}';
        }
    }

    public f(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
        this.b = kVar.z();
    }

    private g a(com.applovin.impl.mediation.a.e eVar, Class<? extends MaxAdapter> cls) {
        try {
            return new g(eVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.a.W()), this.a);
        } catch (Throwable th) {
            r.c("MediationAdapterManager", "Failed to load adapter: " + eVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            r.i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(com.applovin.impl.mediation.a.e eVar) {
        Class<? extends MaxAdapter> a2;
        r rVar;
        String str;
        if (eVar != null) {
            String K = eVar.K();
            String J = eVar.J();
            if (TextUtils.isEmpty(K)) {
                rVar = this.b;
                str = "No adapter name provided for " + J + ", not loading the adapter ";
            } else if (!TextUtils.isEmpty(J)) {
                synchronized (this.c) {
                    if (this.e.contains(J)) {
                        this.b.b("MediationAdapterManager", "Not attempting to load " + K + " due to prior errors");
                        return null;
                    }
                    if (this.d.containsKey(J)) {
                        a2 = this.d.get(J);
                    } else {
                        a2 = a(J);
                        if (a2 == null) {
                            this.e.add(J);
                            return null;
                        }
                    }
                    g a3 = a(eVar, a2);
                    if (a3 != null) {
                        this.b.b("MediationAdapterManager", "Loaded " + K);
                        this.d.put(J, a2);
                        return a3;
                    }
                    this.b.e("MediationAdapterManager", "Failed to load " + K);
                    this.e.add(J);
                    return null;
                }
            } else {
                rVar = this.b;
                str = "Unable to find default className for '" + K + "'";
            }
            rVar.e("MediationAdapterManager", str);
            return null;
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public Collection<String> a() {
        Set unmodifiableSet;
        synchronized (this.c) {
            HashSet hashSet = new HashSet(this.d.size());
            for (Class<? extends MaxAdapter> cls : this.d.values()) {
                hashSet.add(cls.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f) {
            r z = this.a.z();
            z.e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            this.g.add(new a(str, str2, aVar, this.a));
        }
    }

    public Collection<String> b() {
        Set unmodifiableSet;
        synchronized (this.c) {
            unmodifiableSet = Collections.unmodifiableSet(this.e);
        }
        return unmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = new ArrayList(this.g.size());
            for (a aVar : this.g) {
                arrayList.add(aVar.a());
            }
        }
        return arrayList;
    }
}
