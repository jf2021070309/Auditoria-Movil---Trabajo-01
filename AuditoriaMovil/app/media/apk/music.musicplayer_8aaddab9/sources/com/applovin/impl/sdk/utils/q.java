package com.applovin.impl.sdk.utils;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class q {
    public static final q a = new q();

    /* renamed from: b  reason: collision with root package name */
    public String f4378b;

    /* renamed from: c  reason: collision with root package name */
    public final List<q> f4379c;

    /* renamed from: d  reason: collision with root package name */
    private final q f4380d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4381e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f4382f;

    private q() {
        this.f4380d = null;
        this.f4381e = "";
        this.f4382f = Collections.emptyMap();
        this.f4378b = "";
        this.f4379c = Collections.emptyList();
    }

    public q(String str, Map<String, String> map, q qVar) {
        this.f4380d = qVar;
        this.f4381e = str;
        this.f4382f = Collections.unmodifiableMap(map);
        this.f4379c = new ArrayList();
    }

    public String a() {
        return this.f4381e;
    }

    public List<q> a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f4379c.size());
            for (q qVar : this.f4379c) {
                if (str.equalsIgnoreCase(qVar.a())) {
                    arrayList.add(qVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public q b(String str) {
        if (str != null) {
            for (q qVar : this.f4379c) {
                if (str.equalsIgnoreCase(qVar.a())) {
                    return qVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map<String, String> b() {
        return this.f4382f;
    }

    public q c(String str) {
        if (str != null) {
            if (this.f4379c.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    q qVar = (q) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(qVar.a())) {
                        return qVar;
                    }
                    arrayList.addAll(qVar.d());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public String c() {
        return this.f4378b;
    }

    public List<q> d() {
        return Collections.unmodifiableList(this.f4379c);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("XmlNode{elementName='");
        e.a.d.a.a.J(y, this.f4381e, CoreConstants.SINGLE_QUOTE_CHAR, ", text='");
        e.a.d.a.a.J(y, this.f4378b, CoreConstants.SINGLE_QUOTE_CHAR, ", attributes=");
        y.append(this.f4382f);
        y.append('}');
        return y.toString();
    }
}
