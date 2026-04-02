package com.applovin.impl.a;

import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class b {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final List<g> f3073b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3074c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<j> f3075d;

    private b(String str, List<g> list, String str2, Set<j> set) {
        this.a = str;
        this.f3073b = list;
        this.f3074c = str2;
        this.f3075d = set;
    }

    public static b a(q qVar, e eVar, com.applovin.impl.sdk.m mVar) {
        try {
            String str = qVar.b().get("vendor");
            q c2 = qVar.c("VerificationParameters");
            String c3 = c2 != null ? c2.c() : null;
            List<q> a = qVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a.size());
            for (q qVar2 : a) {
                g a2 = g.a(qVar2, mVar);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            HashMap hashMap = new HashMap();
            l.a(qVar, hashMap, eVar, mVar);
            return new b(str, arrayList, c3, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            mVar.B().b("VastAdVerification", "Error occurred while initializing", th);
            return null;
        }
    }

    public String a() {
        return this.a;
    }

    public List<g> b() {
        return this.f3073b;
    }

    public String c() {
        return this.f3074c;
    }

    public Set<j> d() {
        return this.f3075d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.a;
        if (str == null ? bVar.a == null : str.equals(bVar.a)) {
            List<g> list = this.f3073b;
            if (list == null ? bVar.f3073b == null : list.equals(bVar.f3073b)) {
                String str2 = this.f3074c;
                if (str2 == null ? bVar.f3074c == null : str2.equals(bVar.f3074c)) {
                    Set<j> set = this.f3075d;
                    Set<j> set2 = bVar.f3075d;
                    return set != null ? set.equals(set2) : set2 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<g> list = this.f3073b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f3074c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<j> set = this.f3075d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastAdVerification{vendorId='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, "javascriptResources='");
        y.append(this.f3073b);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append("verificationParameters='");
        e.a.d.a.a.J(y, this.f3074c, CoreConstants.SINGLE_QUOTE_CHAR, "errorEventTrackers='");
        y.append(this.f3075d);
        y.append(CoreConstants.SINGLE_QUOTE_CHAR);
        y.append('}');
        return y.toString();
    }
}
