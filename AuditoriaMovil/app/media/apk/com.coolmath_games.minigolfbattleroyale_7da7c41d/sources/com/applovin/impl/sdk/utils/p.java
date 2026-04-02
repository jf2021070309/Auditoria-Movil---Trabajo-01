package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class p {
    public static final p a = new p();
    protected String b;
    protected final List<p> c;
    private final p d;
    private final String e;
    private final Map<String, String> f;

    private p() {
        this.d = null;
        this.e = "";
        this.f = Collections.emptyMap();
        this.b = "";
        this.c = Collections.emptyList();
    }

    public p(String str, Map<String, String> map, p pVar) {
        this.d = pVar;
        this.e = str;
        this.f = Collections.unmodifiableMap(map);
        this.c = new ArrayList();
    }

    public String a() {
        return this.e;
    }

    public List<p> a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.c.size());
            for (p pVar : this.c) {
                if (str.equalsIgnoreCase(pVar.a())) {
                    arrayList.add(pVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public p b(String str) {
        if (str != null) {
            for (p pVar : this.c) {
                if (str.equalsIgnoreCase(pVar.a())) {
                    return pVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map<String, String> b() {
        return this.f;
    }

    public p c(String str) {
        if (str != null) {
            if (this.c.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    p pVar = (p) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(pVar.a())) {
                        return pVar;
                    }
                    arrayList.addAll(pVar.d());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public String c() {
        return this.b;
    }

    public List<p> d() {
        return Collections.unmodifiableList(this.c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.e + "', text='" + this.b + "', attributes=" + this.f + '}';
    }
}
