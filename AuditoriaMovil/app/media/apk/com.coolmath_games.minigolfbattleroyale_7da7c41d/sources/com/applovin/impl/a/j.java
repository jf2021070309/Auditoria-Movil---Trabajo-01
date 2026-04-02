package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.p;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class j {
    private List<k> a;
    private List<String> b;
    private int c;
    private Uri d;
    private final Set<g> e;
    private final Map<String, Set<g>> f;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private j() {
        this.a = Collections.EMPTY_LIST;
        this.b = Collections.EMPTY_LIST;
        this.e = new HashSet();
        this.f = new HashMap();
    }

    private j(c cVar) {
        this.a = Collections.EMPTY_LIST;
        this.b = Collections.EMPTY_LIST;
        this.e = new HashSet();
        this.f = new HashMap();
        this.b = cVar.g();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, CertificateUtil.DELIMITER);
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(explode.get(1))) + StringUtils.parseInt(explode.get(2)));
            }
        } catch (Throwable unused) {
            r z = kVar.z();
            z.e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
        }
        return 0;
    }

    public static j a(p pVar, j jVar, c cVar, com.applovin.impl.sdk.k kVar) {
        p b;
        List<k> a2;
        p b2;
        int a3;
        if (pVar != null) {
            if (cVar != null) {
                if (kVar != null) {
                    if (jVar == null) {
                        try {
                            jVar = new j(cVar);
                        } catch (Throwable th) {
                            kVar.z().b("VastVideoCreative", "Error occurred while initializing", th);
                            return null;
                        }
                    }
                    if (jVar.c == 0 && (b2 = pVar.b("Duration")) != null && (a3 = a(b2.c(), kVar)) > 0) {
                        jVar.c = a3;
                    }
                    p b3 = pVar.b("MediaFiles");
                    if (b3 != null && (a2 = a(b3, kVar)) != null && a2.size() > 0) {
                        if (jVar.a != null) {
                            a2.addAll(jVar.a);
                        }
                        jVar.a = a2;
                    }
                    p b4 = pVar.b("VideoClicks");
                    if (b4 != null) {
                        if (jVar.d == null && (b = b4.b("ClickThrough")) != null) {
                            String c = b.c();
                            if (StringUtils.isValidString(c)) {
                                jVar.d = Uri.parse(c);
                            }
                        }
                        i.a(b4.a("ClickTracking"), jVar.e, cVar, kVar);
                    }
                    i.a(pVar, jVar.f, cVar, kVar);
                    return jVar;
                }
                throw new IllegalArgumentException("No sdk specified.");
            }
            throw new IllegalArgumentException("No context specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    private static List<k> a(p pVar, com.applovin.impl.sdk.k kVar) {
        List<p> a2 = pVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a2.size());
        List<String> explode = CollectionUtils.explode((String) kVar.a(com.applovin.impl.sdk.c.b.ei));
        List<String> explode2 = CollectionUtils.explode((String) kVar.a(com.applovin.impl.sdk.c.b.eh));
        for (p pVar2 : a2) {
            k a3 = k.a(pVar2, kVar);
            if (a3 != null) {
                try {
                    String c = a3.c();
                    if (!StringUtils.isValidString(c) || explode.contains(c)) {
                        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.ej)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        r z = kVar.z();
                        z.d("VastVideoCreative", "Video file not supported: " + a3);
                    }
                    arrayList.add(a3);
                } catch (Throwable th) {
                    r z2 = kVar.z();
                    z2.b("VastVideoCreative", "Failed to validate video file: " + a3, th);
                }
            }
        }
        return arrayList;
    }

    public k a(a aVar) {
        List<k> list = this.a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String str : this.b) {
            for (k kVar : this.a) {
                String c = kVar.c();
                if (StringUtils.isValidString(c) && str.equalsIgnoreCase(c)) {
                    arrayList.add(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.a;
        }
        if (com.applovin.impl.sdk.utils.f.c()) {
            Collections.sort(arrayList, new Comparator<k>() { // from class: com.applovin.impl.a.j.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(k kVar2, k kVar3) {
                    return Integer.compare(kVar2.d(), kVar3.d());
                }
            });
        }
        return (k) arrayList.get(aVar == a.LOW ? 0 : aVar == a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    public List<k> a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public Uri c() {
        return this.d;
    }

    public Set<g> d() {
        return this.e;
    }

    public Map<String, Set<g>> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.c != jVar.c) {
                return false;
            }
            List<k> list = this.a;
            if (list == null ? jVar.a == null : list.equals(jVar.a)) {
                Uri uri = this.d;
                if (uri == null ? jVar.d == null : uri.equals(jVar.d)) {
                    Set<g> set = this.e;
                    if (set == null ? jVar.e == null : set.equals(jVar.e)) {
                        Map<String, Set<g>> map = this.f;
                        Map<String, Set<g>> map2 = jVar.f;
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

    public int hashCode() {
        List<k> list = this.a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.c) * 31;
        Uri uri = this.d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<g> set = this.e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<g>> map = this.f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.a + ", durationSeconds=" + this.c + ", destinationUri=" + this.d + ", clickTrackers=" + this.e + ", eventTrackers=" + this.f + '}';
    }
}
