package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class d {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f3076b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f3077c;

    /* renamed from: d  reason: collision with root package name */
    private h f3078d;

    /* renamed from: e  reason: collision with root package name */
    private Set<j> f3079e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Set<j>> f3080f = new HashMap();

    private d() {
    }

    public static d a(q qVar, d dVar, e eVar, com.applovin.impl.sdk.m mVar) {
        q b2;
        if (qVar != null) {
            if (mVar != null) {
                if (dVar == null) {
                    try {
                        dVar = new d();
                    } catch (Throwable th) {
                        mVar.B().b("VastCompanionAd", "Error occurred while initializing", th);
                        return null;
                    }
                }
                if (dVar.a == 0 && dVar.f3076b == 0) {
                    int parseInt = StringUtils.parseInt(qVar.b().get("width"));
                    int parseInt2 = StringUtils.parseInt(qVar.b().get("height"));
                    if (parseInt > 0 && parseInt2 > 0) {
                        dVar.a = parseInt;
                        dVar.f3076b = parseInt2;
                    }
                }
                dVar.f3078d = h.a(qVar, dVar.f3078d, mVar);
                if (dVar.f3077c == null && (b2 = qVar.b("CompanionClickThrough")) != null) {
                    String c2 = b2.c();
                    if (StringUtils.isValidString(c2)) {
                        dVar.f3077c = Uri.parse(c2);
                    }
                }
                l.a(qVar.a("CompanionClickTracking"), dVar.f3079e, eVar, mVar);
                l.a(qVar, dVar.f3080f, eVar, mVar);
                return dVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Uri a() {
        return this.f3077c;
    }

    public h b() {
        return this.f3078d;
    }

    public Set<j> c() {
        return this.f3079e;
    }

    public Map<String, Set<j>> d() {
        return this.f3080f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a == dVar.a && this.f3076b == dVar.f3076b) {
                Uri uri = this.f3077c;
                if (uri == null ? dVar.f3077c == null : uri.equals(dVar.f3077c)) {
                    h hVar = this.f3078d;
                    if (hVar == null ? dVar.f3078d == null : hVar.equals(dVar.f3078d)) {
                        Set<j> set = this.f3079e;
                        if (set == null ? dVar.f3079e == null : set.equals(dVar.f3079e)) {
                            Map<String, Set<j>> map = this.f3080f;
                            Map<String, Set<j>> map2 = dVar.f3080f;
                            return map != null ? map.equals(map2) : map2 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i2 = ((this.a * 31) + this.f3076b) * 31;
        Uri uri = this.f3077c;
        int hashCode = (i2 + (uri != null ? uri.hashCode() : 0)) * 31;
        h hVar = this.f3078d;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Set<j> set = this.f3079e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<j>> map = this.f3080f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastCompanionAd{width=");
        y.append(this.a);
        y.append(", height=");
        y.append(this.f3076b);
        y.append(", destinationUri=");
        y.append(this.f3077c);
        y.append(", nonVideoResource=");
        y.append(this.f3078d);
        y.append(", clickTrackers=");
        y.append(this.f3079e);
        y.append(", eventTrackers=");
        y.append(this.f3080f);
        y.append('}');
        return y.toString();
    }
}
