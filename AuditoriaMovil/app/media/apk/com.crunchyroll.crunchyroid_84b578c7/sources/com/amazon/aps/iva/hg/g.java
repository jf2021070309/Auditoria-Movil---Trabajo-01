package com.amazon.aps.iva.hg;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ToDownloadBulkInput.kt */
/* loaded from: classes.dex */
public final class g implements a {
    public final String b;
    public final String c;
    public final List<PlayableAsset> d;
    public final Map<String, Playhead> e;

    /* JADX WARN: Multi-variable type inference failed */
    public g(String str, String str2, List<? extends PlayableAsset> list, Map<String, Playhead> map) {
        j.f(str, "containerId");
        j.f(list, "assets");
        j.f(map, "playheads");
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g a(g gVar, ArrayList arrayList, LinkedHashMap linkedHashMap, int i) {
        String str;
        String str2 = null;
        if ((i & 1) != 0) {
            str = gVar.b;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = gVar.c;
        }
        List list = arrayList;
        if ((i & 4) != 0) {
            list = gVar.d;
        }
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = gVar.e;
        }
        gVar.getClass();
        j.f(str, "containerId");
        j.f(list, "assets");
        j.f(map, "playheads");
        return new g(str, str2, list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (j.a(this.b, gVar.b) && j.a(this.c, gVar.c) && j.a(this.d, gVar.d) && j.a(this.e, gVar.e)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.hg.a
    public final String getSeasonId() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode() * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.e.hashCode() + defpackage.a.a(this.d, (hashCode2 + hashCode) * 31, 31);
    }

    @Override // com.amazon.aps.iva.hg.a
    public final String k0() {
        return this.b;
    }

    public final String toString() {
        return "ToDownloadBulkInput(containerId=" + this.b + ", seasonId=" + this.c + ", assets=" + this.d + ", playheads=" + this.e + ")";
    }
}
