package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.se0.m0;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ToDownloadCache.kt */
/* loaded from: classes2.dex */
public final class c {
    public final ConcurrentHashMap<String, m0<ContentContainer>> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, m0<ContentApiResponse<Season, EmptyMeta>>> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<a, m0<List<PlayableAsset>>> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, m0<Panel>> d = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<com.amazon.aps.iva.xg.a, m0<Map<String, Playhead>>> e = new ConcurrentHashMap<>();

    /* compiled from: ToDownloadCache.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final t c;

        public a(t tVar, String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(str, "containerId");
            com.amazon.aps.iva.yb0.j.f(tVar, "resourceType");
            this.a = str;
            this.b = str2;
            this.c = tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
        }

        public final String toString() {
            return "AssetsCacheKey(containerId=" + this.a + ", seasonId=" + this.b + ", resourceType=" + this.c + ")";
        }
    }

    public final void a(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "containerId");
        this.a.remove(str);
        this.d.remove(str);
        ConcurrentHashMap<a, m0<List<PlayableAsset>>> concurrentHashMap = this.c;
        for (Map.Entry<a, m0<List<PlayableAsset>>> entry : concurrentHashMap.entrySet()) {
            if (com.amazon.aps.iva.yb0.j.a(entry.getKey().a, str) && com.amazon.aps.iva.yb0.j.a(entry.getKey().b, str2)) {
                concurrentHashMap.remove(entry.getKey());
            }
        }
        ConcurrentHashMap<String, m0<ContentApiResponse<Season, EmptyMeta>>> concurrentHashMap2 = this.b;
        concurrentHashMap2.remove(str);
        if (str2 != null) {
            concurrentHashMap2.remove(str2);
        }
        ConcurrentHashMap<com.amazon.aps.iva.xg.a, m0<Map<String, Playhead>>> concurrentHashMap3 = this.e;
        for (Map.Entry<com.amazon.aps.iva.xg.a, m0<Map<String, Playhead>>> entry2 : concurrentHashMap3.entrySet()) {
            if (com.amazon.aps.iva.yb0.j.a(entry2.getKey().b, str) && com.amazon.aps.iva.yb0.j.a(entry2.getKey().d, str2)) {
                concurrentHashMap3.remove(entry2.getKey());
            }
        }
    }
}
