package com.applovin.impl.a;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.v;
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
public class m {
    private List<n> a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f3113b;

    /* renamed from: c  reason: collision with root package name */
    private int f3114c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f3115d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<j> f3116e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Set<j>> f3117f;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private m() {
        this.a = Collections.emptyList();
        this.f3113b = Collections.emptyList();
        this.f3116e = new HashSet();
        this.f3117f = new HashMap();
    }

    private m(e eVar) {
        this.a = Collections.emptyList();
        this.f3113b = Collections.emptyList();
        this.f3116e = new HashSet();
        this.f3117f = new HashMap();
        this.f3113b = eVar.g();
    }

    private static int a(String str, com.applovin.impl.sdk.m mVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(explode.get(1))) + StringUtils.parseInt(explode.get(2)));
            }
        } catch (Throwable unused) {
            v B = mVar.B();
            B.e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
        }
        return 0;
    }

    public static m a(q qVar, m mVar, e eVar, com.applovin.impl.sdk.m mVar2) {
        q b2;
        List<n> a2;
        q b3;
        int a3;
        if (qVar != null) {
            if (eVar != null) {
                if (mVar2 != null) {
                    if (mVar == null) {
                        try {
                            mVar = new m(eVar);
                        } catch (Throwable th) {
                            mVar2.B().b("VastVideoCreative", "Error occurred while initializing", th);
                            return null;
                        }
                    }
                    if (mVar.f3114c == 0 && (b3 = qVar.b("Duration")) != null && (a3 = a(b3.c(), mVar2)) > 0) {
                        mVar.f3114c = a3;
                    }
                    q b4 = qVar.b("MediaFiles");
                    if (b4 != null && (a2 = a(b4, mVar2)) != null && a2.size() > 0) {
                        List<n> list = mVar.a;
                        if (list != null) {
                            a2.addAll(list);
                        }
                        mVar.a = a2;
                    }
                    q b5 = qVar.b("VideoClicks");
                    if (b5 != null) {
                        if (mVar.f3115d == null && (b2 = b5.b("ClickThrough")) != null) {
                            String c2 = b2.c();
                            if (StringUtils.isValidString(c2)) {
                                mVar.f3115d = Uri.parse(c2);
                            }
                        }
                        l.a(b5.a("ClickTracking"), mVar.f3116e, eVar, mVar2);
                    }
                    l.a(qVar, mVar.f3117f, eVar, mVar2);
                    return mVar;
                }
                throw new IllegalArgumentException("No sdk specified.");
            }
            throw new IllegalArgumentException("No context specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    private static List<n> a(q qVar, com.applovin.impl.sdk.m mVar) {
        List<q> a2 = qVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a2.size());
        List<String> explode = CollectionUtils.explode((String) mVar.a(com.applovin.impl.sdk.c.b.eo));
        List<String> explode2 = CollectionUtils.explode((String) mVar.a(com.applovin.impl.sdk.c.b.en));
        for (q qVar2 : a2) {
            n a3 = n.a(qVar2, mVar);
            if (a3 != null) {
                try {
                    String c2 = a3.c();
                    if (!StringUtils.isValidString(c2) || explode.contains(c2)) {
                        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a3.b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        v B = mVar.B();
                        B.d("VastVideoCreative", "Video file not supported: " + a3);
                    }
                    arrayList.add(a3);
                } catch (Throwable th) {
                    v B2 = mVar.B();
                    B2.b("VastVideoCreative", "Failed to validate video file: " + a3, th);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n a(a aVar) {
        List<n> list = this.a;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f3113b) {
            for (n nVar : this.a) {
                String c2 = nVar.c();
                if (StringUtils.isValidString(c2) && str.equalsIgnoreCase(c2)) {
                    arrayList.add(nVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        List list2 = arrayList;
        if (isEmpty) {
            list2 = this.a;
        }
        if (com.applovin.impl.sdk.utils.g.c()) {
            Collections.sort(list2, new Comparator<n>() { // from class: com.applovin.impl.a.m.1
                @Override // java.util.Comparator
                @TargetApi(19)
                /* renamed from: a */
                public int compare(n nVar2, n nVar3) {
                    return Integer.compare(nVar2.d(), nVar3.d());
                }
            });
        }
        return (n) list2.get(aVar == a.LOW ? 0 : aVar == a.MEDIUM ? list2.size() / 2 : list2.size() - 1);
    }

    public List<n> a() {
        return this.a;
    }

    public int b() {
        return this.f3114c;
    }

    public Uri c() {
        return this.f3115d;
    }

    public Set<j> d() {
        return this.f3116e;
    }

    public Map<String, Set<j>> e() {
        return this.f3117f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f3114c != mVar.f3114c) {
                return false;
            }
            List<n> list = this.a;
            if (list == null ? mVar.a == null : list.equals(mVar.a)) {
                Uri uri = this.f3115d;
                if (uri == null ? mVar.f3115d == null : uri.equals(mVar.f3115d)) {
                    Set<j> set = this.f3116e;
                    if (set == null ? mVar.f3116e == null : set.equals(mVar.f3116e)) {
                        Map<String, Set<j>> map = this.f3117f;
                        Map<String, Set<j>> map2 = mVar.f3117f;
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
        List<n> list = this.a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f3114c) * 31;
        Uri uri = this.f3115d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<j> set = this.f3116e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<j>> map = this.f3117f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastVideoCreative{videoFiles=");
        y.append(this.a);
        y.append(", durationSeconds=");
        y.append(this.f3114c);
        y.append(", destinationUri=");
        y.append(this.f3115d);
        y.append(", clickTrackers=");
        y.append(this.f3116e);
        y.append(", eventTrackers=");
        y.append(this.f3117f);
        y.append('}');
        return y.toString();
    }
}
