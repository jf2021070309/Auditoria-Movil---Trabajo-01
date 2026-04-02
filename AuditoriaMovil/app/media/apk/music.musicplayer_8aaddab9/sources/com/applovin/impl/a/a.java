package com.applovin.impl.a;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.a.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.ad.e {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3043b;

    /* renamed from: c  reason: collision with root package name */
    private final i f3044c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3045d;

    /* renamed from: e  reason: collision with root package name */
    private final m f3046e;

    /* renamed from: f  reason: collision with root package name */
    private final d f3047f;

    /* renamed from: g  reason: collision with root package name */
    private final String f3048g;

    /* renamed from: h  reason: collision with root package name */
    private final com.applovin.impl.a.c f3049h;

    /* renamed from: i  reason: collision with root package name */
    private final com.applovin.impl.sdk.a.g f3050i;

    /* renamed from: j  reason: collision with root package name */
    private final Set<j> f3051j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<j> f3052k;

    /* renamed from: com.applovin.impl.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0065a {
        private JSONObject a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f3053b;

        /* renamed from: c  reason: collision with root package name */
        private com.applovin.impl.sdk.ad.b f3054c;

        /* renamed from: d  reason: collision with root package name */
        private com.applovin.impl.sdk.m f3055d;

        /* renamed from: e  reason: collision with root package name */
        private long f3056e;

        /* renamed from: f  reason: collision with root package name */
        private String f3057f;

        /* renamed from: g  reason: collision with root package name */
        private String f3058g;

        /* renamed from: h  reason: collision with root package name */
        private i f3059h;

        /* renamed from: i  reason: collision with root package name */
        private m f3060i;

        /* renamed from: j  reason: collision with root package name */
        private d f3061j;

        /* renamed from: k  reason: collision with root package name */
        private com.applovin.impl.a.c f3062k;

        /* renamed from: l  reason: collision with root package name */
        private Set<j> f3063l;

        /* renamed from: m  reason: collision with root package name */
        private Set<j> f3064m;

        public C0065a a(long j2) {
            this.f3056e = j2;
            return this;
        }

        public C0065a a(com.applovin.impl.a.c cVar) {
            this.f3062k = cVar;
            return this;
        }

        public C0065a a(d dVar) {
            this.f3061j = dVar;
            return this;
        }

        public C0065a a(i iVar) {
            this.f3059h = iVar;
            return this;
        }

        public C0065a a(m mVar) {
            this.f3060i = mVar;
            return this;
        }

        public C0065a a(com.applovin.impl.sdk.ad.b bVar) {
            this.f3054c = bVar;
            return this;
        }

        public C0065a a(com.applovin.impl.sdk.m mVar) {
            if (mVar != null) {
                this.f3055d = mVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public C0065a a(String str) {
            this.f3057f = str;
            return this;
        }

        public C0065a a(Set<j> set) {
            this.f3063l = set;
            return this;
        }

        public C0065a a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public a a() {
            return new a(this);
        }

        public C0065a b(String str) {
            this.f3058g = str;
            return this;
        }

        public C0065a b(Set<j> set) {
            this.f3064m = set;
            return this;
        }

        public C0065a b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f3053b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        COMPANION_AD,
        VIDEO
    }

    /* loaded from: classes.dex */
    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private a(C0065a c0065a) {
        super(c0065a.a, c0065a.f3053b, c0065a.f3054c, c0065a.f3055d);
        this.a = c0065a.f3057f;
        this.f3044c = c0065a.f3059h;
        this.f3043b = c0065a.f3058g;
        this.f3046e = c0065a.f3060i;
        this.f3047f = c0065a.f3061j;
        this.f3049h = c0065a.f3062k;
        this.f3051j = c0065a.f3063l;
        this.f3052k = c0065a.f3064m;
        this.f3050i = new com.applovin.impl.sdk.a.g(this);
        Uri g2 = g();
        this.f3048g = g2 != null ? g2.toString() : "";
        this.f3045d = c0065a.f3056e;
    }

    private Set<j> a(b bVar, String[] strArr) {
        d dVar;
        m mVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<j>> map = null;
        if (bVar == b.VIDEO && (mVar = this.f3046e) != null) {
            map = mVar.e();
        } else if (bVar == b.COMPANION_AD && (dVar = this.f3047f) != null) {
            map = dVar.d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private String aR() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private m.a aS() {
        m.a[] values = m.a.values();
        int intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.eq)).intValue();
        return (intValue < 0 || intValue >= 4) ? m.a.UNSPECIFIED : values[intValue];
    }

    private Set<j> aT() {
        m mVar = this.f3046e;
        return mVar != null ? mVar.d() : Collections.emptySet();
    }

    private Set<j> aU() {
        d dVar = this.f3047f;
        return dVar != null ? dVar.c() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean B() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && i() != null;
    }

    public Set<j> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<j> a(c cVar, String[] strArr) {
        v B = this.sdk.B();
        B.b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        if (cVar == c.IMPRESSION) {
            return this.f3051j;
        }
        if (cVar == c.VIDEO_CLICK) {
            return aT();
        }
        if (cVar == c.COMPANION_CLICK) {
            return aU();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.ERROR) {
            return this.f3052k;
        }
        v B2 = this.sdk.B();
        B2.e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public n aJ() {
        m mVar = this.f3046e;
        if (mVar != null) {
            return mVar.a(aS());
        }
        return null;
    }

    public d aK() {
        return this.f3047f;
    }

    public boolean aL() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public String aM() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri aN() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aO() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean aP() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public com.applovin.impl.a.c aQ() {
        return this.f3049h;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public List<com.applovin.impl.sdk.d.a> ap() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), CollectionUtils.map(Utils.SHOWN_OUT_OF_CONTEXT_MACRO, String.valueOf(ah())), aR(), aq(), w(), this.sdk);
        }
        return postbacks;
    }

    public void b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String c() {
        return this.f3048g;
    }

    @Override // com.applovin.impl.sdk.a.a
    /* renamed from: d */
    public com.applovin.impl.sdk.a.g getAdEventTracker() {
        return this.f3050i;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean e() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && super.equals(obj)) {
            a aVar = (a) obj;
            String str = this.a;
            if (str == null ? aVar.a == null : str.equals(aVar.a)) {
                String str2 = this.f3043b;
                if (str2 == null ? aVar.f3043b == null : str2.equals(aVar.f3043b)) {
                    i iVar = this.f3044c;
                    if (iVar == null ? aVar.f3044c == null : iVar.equals(aVar.f3044c)) {
                        m mVar = this.f3046e;
                        if (mVar == null ? aVar.f3046e == null : mVar.equals(aVar.f3046e)) {
                            d dVar = this.f3047f;
                            if (dVar == null ? aVar.f3047f == null : dVar.equals(aVar.f3047f)) {
                                com.applovin.impl.a.c cVar = this.f3049h;
                                if (cVar == null ? aVar.f3049h == null : cVar.equals(aVar.f3049h)) {
                                    Set<j> set = this.f3051j;
                                    if (set == null ? aVar.f3051j == null : set.equals(aVar.f3051j)) {
                                        Set<j> set2 = this.f3052k;
                                        Set<j> set3 = aVar.f3052k;
                                        return set2 != null ? set2.equals(set3) : set3 == null;
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
                return false;
            }
            return false;
        }
        return false;
    }

    public long f() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri g() {
        n aJ = aJ();
        if (aJ != null) {
            return aJ.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f3045d;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    public b h() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? b.COMPANION_AD : b.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List<n> a;
        m mVar = this.f3046e;
        return (mVar == null || (a = mVar.a()) == null || a.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3043b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        i iVar = this.f3044c;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        m mVar = this.f3046e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        d dVar = this.f3047f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        com.applovin.impl.a.c cVar = this.f3049h;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<j> set = this.f3051j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<j> set2 = this.f3052k;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri i() {
        m mVar = this.f3046e;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f3049h != null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        return i();
    }

    public boolean k() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public i l() {
        return this.f3044c;
    }

    public m m() {
        return this.f3046e;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder y = e.a.d.a.a.y("VastAd{title='");
        e.a.d.a.a.J(y, this.a, CoreConstants.SINGLE_QUOTE_CHAR, ", adDescription='");
        e.a.d.a.a.J(y, this.f3043b, CoreConstants.SINGLE_QUOTE_CHAR, ", systemInfo=");
        y.append(this.f3044c);
        y.append(", videoCreative=");
        y.append(this.f3046e);
        y.append(", companionAd=");
        y.append(this.f3047f);
        y.append(", adVerifications=");
        y.append(this.f3049h);
        y.append(", impressionTrackers=");
        y.append(this.f3051j);
        y.append(", errorTrackers=");
        y.append(this.f3052k);
        y.append('}');
        return y.toString();
    }
}
