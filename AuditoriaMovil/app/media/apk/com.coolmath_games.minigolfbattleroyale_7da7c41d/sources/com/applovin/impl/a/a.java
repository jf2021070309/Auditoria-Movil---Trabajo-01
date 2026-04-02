package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.a.j;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.a.g {
    private final String a;
    private final String b;
    private final f c;
    private final long d;
    private final j e;
    private final com.applovin.impl.a.b f;
    private final String g;
    private final Set<g> h;
    private final Set<g> i;

    /* renamed from: com.applovin.impl.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0006a {
        private JSONObject a;
        private JSONObject b;
        private com.applovin.impl.sdk.a.b c;
        private com.applovin.impl.sdk.k d;
        private long e;
        private String f;
        private String g;
        private f h;
        private j i;
        private com.applovin.impl.a.b j;
        private Set<g> k;
        private Set<g> l;

        private C0006a() {
        }

        public C0006a a(long j) {
            this.e = j;
            return this;
        }

        public C0006a a(com.applovin.impl.a.b bVar) {
            this.j = bVar;
            return this;
        }

        public C0006a a(f fVar) {
            this.h = fVar;
            return this;
        }

        public C0006a a(j jVar) {
            this.i = jVar;
            return this;
        }

        public C0006a a(com.applovin.impl.sdk.a.b bVar) {
            this.c = bVar;
            return this;
        }

        public C0006a a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.d = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public C0006a a(String str) {
            this.f = str;
            return this;
        }

        public C0006a a(Set<g> set) {
            this.k = set;
            return this;
        }

        public C0006a a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public a a() {
            return new a(this);
        }

        public C0006a b(String str) {
            this.g = str;
            return this;
        }

        public C0006a b(Set<g> set) {
            this.l = set;
            return this;
        }

        public C0006a b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
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

    private a(C0006a c0006a) {
        super(c0006a.a, c0006a.b, c0006a.c, c0006a.d);
        this.a = c0006a.f;
        this.c = c0006a.h;
        this.b = c0006a.g;
        this.e = c0006a.i;
        this.f = c0006a.j;
        this.h = c0006a.k;
        this.i = c0006a.l;
        Uri h = h();
        this.g = h != null ? h.toString() : "";
        this.d = c0006a.e;
    }

    private Set<g> a(b bVar, String[] strArr) {
        com.applovin.impl.a.b bVar2;
        j jVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<g>> map = null;
        if (bVar == b.VIDEO && (jVar = this.e) != null) {
            map = jVar.e();
        } else if (bVar == b.COMPANION_AD && (bVar2 = this.f) != null) {
            map = bVar2.d();
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

    public static C0006a aS() {
        return new C0006a();
    }

    private String aT() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private j.a aU() {
        j.a[] values = j.a.values();
        int intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ek)).intValue();
        return (intValue < 0 || intValue >= values.length) ? j.a.UNSPECIFIED : values[intValue];
    }

    private Set<g> aV() {
        j jVar = this.e;
        return jVar != null ? jVar.d() : Collections.emptySet();
    }

    private Set<g> aW() {
        com.applovin.impl.a.b bVar = this.f;
        return bVar != null ? bVar.c() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.a.g
    public boolean D() {
        return getBooleanFromAdObject("video_clickable", false) && j() != null;
    }

    public Set<g> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<g> a(c cVar, String[] strArr) {
        r z = this.sdk.z();
        z.b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        if (cVar == c.IMPRESSION) {
            return this.h;
        }
        if (cVar == c.VIDEO_CLICK) {
            return aV();
        }
        if (cVar == c.COMPANION_CLICK) {
            return aW();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.ERROR) {
            return this.i;
        }
        r z2 = this.sdk.z();
        z2.e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.a.g
    public void a() {
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public String aO() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri aP() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aQ() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    public boolean aR() {
        return getBooleanFromAdObject("cache_video", true);
    }

    @Override // com.applovin.impl.sdk.a.g
    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), CollectionUtils.map(Utils.SHOWN_OUT_OF_CONTEXT_MACRO, String.valueOf(al())), aT(), au(), y(), this.sdk);
        }
        return postbacks;
    }

    @Override // com.applovin.impl.sdk.a.g
    public JSONObject b() {
        return this.fullResponse;
    }

    public void c() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.a.g
    public String d() {
        return this.g;
    }

    public b e() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? b.COMPANION_AD : b.VIDEO;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && super.equals(obj)) {
            a aVar = (a) obj;
            String str = this.a;
            if (str == null ? aVar.a == null : str.equals(aVar.a)) {
                String str2 = this.b;
                if (str2 == null ? aVar.b == null : str2.equals(aVar.b)) {
                    f fVar = this.c;
                    if (fVar == null ? aVar.c == null : fVar.equals(aVar.c)) {
                        j jVar = this.e;
                        if (jVar == null ? aVar.e == null : jVar.equals(aVar.e)) {
                            com.applovin.impl.a.b bVar = this.f;
                            if (bVar == null ? aVar.f == null : bVar.equals(aVar.f)) {
                                Set<g> set = this.h;
                                if (set == null ? aVar.h == null : set.equals(aVar.h)) {
                                    Set<g> set2 = this.i;
                                    Set<g> set3 = aVar.i;
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

    @Override // com.applovin.impl.sdk.a.g
    public boolean f() {
        return getBooleanFromAdObject("vast_is_streaming", false);
    }

    public boolean g() {
        return getBooleanFromAdObject("vast_immediate_ad_load", true);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.d;
    }

    @Override // com.applovin.impl.sdk.a.g
    public Uri h() {
        k m = m();
        if (m != null) {
            return m.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean hasVideoUrl() {
        List<k> a;
        j jVar = this.e;
        return (jVar == null || (a = jVar.a()) == null || a.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        f fVar = this.c;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        j jVar = this.e;
        int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        com.applovin.impl.a.b bVar = this.f;
        int hashCode6 = (hashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Set<g> set = this.h;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        Set<g> set2 = this.i;
        return hashCode7 + (set2 != null ? set2.hashCode() : 0);
    }

    public f i() {
        return this.c;
    }

    @Override // com.applovin.impl.sdk.a.g
    public Uri j() {
        j jVar = this.e;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.a.g
    public Uri k() {
        return j();
    }

    public j l() {
        return this.e;
    }

    public k m() {
        j jVar = this.e;
        if (jVar != null) {
            return jVar.a(aU());
        }
        return null;
    }

    public com.applovin.impl.a.b n() {
        return this.f;
    }

    public boolean o() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public String toString() {
        return "VastAd{title='" + this.a + "', adDescription='" + this.b + "', systemInfo=" + this.c + ", videoCreative=" + this.e + ", companionAd=" + this.f + ", impressionTrackers=" + this.h + ", errorTrackers=" + this.i + '}';
    }
}
