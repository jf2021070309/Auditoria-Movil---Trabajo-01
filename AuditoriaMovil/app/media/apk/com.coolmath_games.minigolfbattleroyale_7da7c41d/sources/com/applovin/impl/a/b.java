package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class b {
    private int a;
    private int b;
    private Uri c;
    private e d;
    private Set<g> e = new HashSet();
    private Map<String, Set<g>> f = new HashMap();

    private b() {
    }

    public static b a(p pVar, b bVar, c cVar, com.applovin.impl.sdk.k kVar) {
        p b;
        if (pVar != null) {
            if (kVar != null) {
                if (bVar == null) {
                    try {
                        bVar = new b();
                    } catch (Throwable th) {
                        kVar.z().b("VastCompanionAd", "Error occurred while initializing", th);
                        return null;
                    }
                }
                if (bVar.a == 0 && bVar.b == 0) {
                    int parseInt = StringUtils.parseInt(pVar.b().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
                    int parseInt2 = StringUtils.parseInt(pVar.b().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
                    if (parseInt > 0 && parseInt2 > 0) {
                        bVar.a = parseInt;
                        bVar.b = parseInt2;
                    }
                }
                bVar.d = e.a(pVar, bVar.d, kVar);
                if (bVar.c == null && (b = pVar.b("CompanionClickThrough")) != null) {
                    String c = b.c();
                    if (StringUtils.isValidString(c)) {
                        bVar.c = Uri.parse(c);
                    }
                }
                i.a(pVar.a("CompanionClickTracking"), bVar.e, cVar, kVar);
                i.a(pVar, bVar.f, cVar, kVar);
                return bVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Uri a() {
        return this.c;
    }

    public e b() {
        return this.d;
    }

    public Set<g> c() {
        return this.e;
    }

    public Map<String, Set<g>> d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b) {
                Uri uri = this.c;
                if (uri == null ? bVar.c == null : uri.equals(bVar.c)) {
                    e eVar = this.d;
                    if (eVar == null ? bVar.d == null : eVar.equals(bVar.d)) {
                        Set<g> set = this.e;
                        if (set == null ? bVar.e == null : set.equals(bVar.e)) {
                            Map<String, Set<g>> map = this.f;
                            Map<String, Set<g>> map2 = bVar.f;
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
        int i = ((this.a * 31) + this.b) * 31;
        Uri uri = this.c;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        e eVar = this.d;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Set<g> set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<g>> map = this.f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.a + ", height=" + this.b + ", destinationUri=" + this.c + ", nonVideoResource=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }
}
