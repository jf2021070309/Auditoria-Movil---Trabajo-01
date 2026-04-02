package com.amazon.aps.iva.vo;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.commenting.model.Guestbook;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: WatchScreenAssetsData.kt */
/* loaded from: classes2.dex */
public final class c {
    public final List<PlayableAsset> a;
    public final Map<String, Playhead> b;
    public final Map<String, Guestbook> c;

    public c() {
        this(null, 7);
    }

    public static c a(c cVar, List list) {
        Map<String, Playhead> map = cVar.b;
        Map<String, Guestbook> map2 = cVar.c;
        cVar.getClass();
        j.f(list, "assets");
        j.f(map, "playheads");
        j.f(map2, "guestbooks");
        return new c(list, map, map2);
    }

    public final PlayableAsset b(String str) {
        Object obj;
        j.f(str, "assetId");
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((PlayableAsset) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (PlayableAsset) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.a, cVar.a) && j.a(this.b, cVar.b) && j.a(this.c, cVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WatchScreenAssetsData(assets=" + this.a + ", playheads=" + this.b + ", guestbooks=" + this.c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends PlayableAsset> list, Map<String, Playhead> map, Map<String, Guestbook> map2) {
        j.f(list, "assets");
        j.f(map, "playheads");
        j.f(map2, "guestbooks");
        this.a = list;
        this.b = map;
        this.c = map2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c(com.amazon.aps.iva.lb0.z r4, int r5) {
        /*
            r3 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L6
            com.amazon.aps.iva.lb0.z r4 = com.amazon.aps.iva.lb0.z.b
        L6:
            r0 = r5 & 2
            com.amazon.aps.iva.lb0.a0 r1 = com.amazon.aps.iva.lb0.a0.b
            r2 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            r5 = r5 & 4
            if (r5 == 0) goto L15
            goto L16
        L15:
            r1 = r2
        L16:
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vo.c.<init>(com.amazon.aps.iva.lb0.z, int):void");
    }
}
