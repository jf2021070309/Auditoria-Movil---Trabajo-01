package com.amazon.aps.iva.cj;

import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PlayerImpl.kt */
/* loaded from: classes.dex */
public final class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final com.amazon.aps.iva.kj.e a(com.amazon.aps.iva.kk.c cVar) {
        String str;
        Object obj;
        ArrayList arrayList;
        com.amazon.aps.iva.lb0.z zVar;
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        String str2 = cVar.a;
        String str3 = cVar.c;
        String str4 = cVar.w;
        com.amazon.aps.iva.x50.t.Companion.getClass();
        com.amazon.aps.iva.x50.t a = t.a.a(cVar.i);
        String str5 = cVar.d;
        String str6 = cVar.e;
        String str7 = cVar.g;
        List<com.amazon.aps.iva.qj.a> list = cVar.n;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (com.amazon.aps.iva.qj.a aVar : list) {
            arrayList2.add(new Image(aVar.a, aVar.b, aVar.c));
        }
        Object obj2 = cVar.t;
        List<com.amazon.aps.iva.qj.l> list2 = cVar.v;
        if (list2 != null) {
            List<com.amazon.aps.iva.qj.l> list3 = list2;
            ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.qj.l lVar = (com.amazon.aps.iva.qj.l) it.next();
                arrayList3.add(new PlayableAssetVersion(lVar.f, lVar.c, lVar.a, lVar.d, lVar.e, lVar.b));
                it = it;
                obj2 = obj2;
                arrayList2 = arrayList2;
                str4 = str4;
            }
            str = str4;
            obj = obj2;
            arrayList = arrayList2;
            zVar = arrayList3;
        } else {
            str = str4;
            obj = obj2;
            arrayList = arrayList2;
            zVar = com.amazon.aps.iva.lb0.z.b;
        }
        return new com.amazon.aps.iva.kj.e(str2, null, str3, null, a, str5, str6, null, str7, null, Boolean.valueOf(cVar.j), Boolean.valueOf(cVar.k), Boolean.valueOf(cVar.l), null, null, Long.valueOf(cVar.s), arrayList, str, obj, 0L, null, zVar, cVar.z, cVar.A, 3203722);
    }
}
