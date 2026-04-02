package com.amazon.aps.iva.e00;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.commenting.model.Guestbook;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: AssetListUpdateData.kt */
/* loaded from: classes2.dex */
public final class a {
    public final List<PlayableAsset> a;
    public final Map<String, Playhead> b;
    public final Map<String, Guestbook> c;

    public a() {
        this((List) null, (Map) null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a a(a aVar, ArrayList arrayList, Map map, int i) {
        Map<String, Guestbook> map2;
        List list = arrayList;
        if ((i & 1) != 0) {
            list = aVar.a;
        }
        if ((i & 2) != 0) {
            map = aVar.b;
        }
        if ((i & 4) != 0) {
            map2 = aVar.c;
        } else {
            map2 = null;
        }
        aVar.getClass();
        j.f(list, "assets");
        j.f(map, "playheads");
        j.f(map2, "guestbooks");
        return new a(list, map, map2);
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b) && j.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AssetListUpdateData(assets=" + this.a + ", playheads=" + this.b + ", guestbooks=" + this.c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends PlayableAsset> list, Map<String, Playhead> map, Map<String, Guestbook> map2) {
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
    public /* synthetic */ a(java.util.List r3, java.util.Map r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L6
            com.amazon.aps.iva.lb0.z r3 = com.amazon.aps.iva.lb0.z.b
        L6:
            r0 = r5 & 2
            com.amazon.aps.iva.lb0.a0 r1 = com.amazon.aps.iva.lb0.a0.b
            if (r0 == 0) goto Ld
            r4 = r1
        Ld:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            r2.<init>(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e00.a.<init>(java.util.List, java.util.Map, int):void");
    }
}
