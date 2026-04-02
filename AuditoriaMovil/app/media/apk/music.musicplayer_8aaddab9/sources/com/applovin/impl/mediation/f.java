package com.applovin.impl.mediation;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
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
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3683b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3684c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Class<? extends MaxAdapter>> f3685d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f3686e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f3687f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final Set<a> f3688g = new HashSet();

    /* loaded from: classes.dex */
    public static class a {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3689b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdFormat f3690c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f3691d;

        public a(String str, String str2, com.applovin.impl.mediation.a.a aVar, m mVar) {
            this.a = str;
            this.f3689b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f3691d = jSONObject;
            JsonUtils.putString(jSONObject, Action.CLASS_ATTRIBUTE, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (aVar == null) {
                this.f3690c = null;
                return;
            }
            this.f3690c = aVar.getFormat();
            if (aVar.getFormat() != null) {
                JsonUtils.putString(jSONObject, "format", aVar.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f3691d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.f3689b.equals(aVar.f3689b)) {
                MaxAdFormat maxAdFormat = this.f3690c;
                MaxAdFormat maxAdFormat2 = aVar.f3690c;
                return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
            }
            return false;
        }

        public int hashCode() {
            int x = e.a.d.a.a.x(this.f3689b, this.a.hashCode() * 31, 31);
            MaxAdFormat maxAdFormat = this.f3690c;
            return x + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("DisabledAdapterInfo{className='");
            e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", operationTag='");
            e.a.d.a.a.J(y, this.f3689b, CoreConstants.SINGLE_QUOTE_CHAR, ", format=");
            y.append(this.f3690c);
            y.append('}');
            return y.toString();
        }
    }

    public f(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = mVar;
        this.f3683b = mVar.B();
    }

    private g a(com.applovin.impl.mediation.a.f fVar, Class<? extends MaxAdapter> cls) {
        try {
            return new g(fVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.a.Y()), this.a);
        } catch (Throwable th) {
            v.c("MediationAdapterManager", "Failed to load adapter: " + fVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            v.i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public g a(com.applovin.impl.mediation.a.f fVar) {
        Class<? extends MaxAdapter> a2;
        if (fVar != null) {
            String P = fVar.P();
            String O = fVar.O();
            if (TextUtils.isEmpty(P)) {
                v vVar = this.f3683b;
                vVar.e("MediationAdapterManager", "No adapter name provided for " + O + ", not loading the adapter ");
                return null;
            } else if (TextUtils.isEmpty(O)) {
                v vVar2 = this.f3683b;
                vVar2.e("MediationAdapterManager", "Unable to find default className for '" + P + "'");
                return null;
            } else {
                synchronized (this.f3684c) {
                    if (this.f3686e.contains(O)) {
                        v vVar3 = this.f3683b;
                        vVar3.b("MediationAdapterManager", "Not attempting to load " + P + " due to prior errors");
                        return null;
                    }
                    if (this.f3685d.containsKey(O)) {
                        a2 = this.f3685d.get(O);
                    } else {
                        a2 = a(O);
                        if (a2 == null) {
                            this.f3686e.add(O);
                            return null;
                        }
                    }
                    g a3 = a(fVar, a2);
                    if (a3 != null) {
                        v vVar4 = this.f3683b;
                        vVar4.b("MediationAdapterManager", "Loaded " + P);
                        this.f3685d.put(O, a2);
                        return a3;
                    }
                    v vVar5 = this.f3683b;
                    vVar5.e("MediationAdapterManager", "Failed to load " + P);
                    this.f3686e.add(O);
                    return null;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public Collection<String> a() {
        Set unmodifiableSet;
        synchronized (this.f3684c) {
            HashSet hashSet = new HashSet(this.f3685d.size());
            for (Class<? extends MaxAdapter> cls : this.f3685d.values()) {
                hashSet.add(cls.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    public void a(String str, String str2, com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f3687f) {
            v B = this.a.B();
            B.e("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            this.f3688g.add(new a(str, str2, aVar, this.a));
        }
    }

    public Collection<String> b() {
        Set unmodifiableSet;
        synchronized (this.f3684c) {
            unmodifiableSet = Collections.unmodifiableSet(this.f3686e);
        }
        return unmodifiableSet;
    }

    public Collection<JSONObject> c() {
        ArrayList arrayList;
        synchronized (this.f3687f) {
            arrayList = new ArrayList(this.f3688g.size());
            for (a aVar : this.f3688g) {
                arrayList.add(aVar.a());
            }
        }
        return arrayList;
    }
}
