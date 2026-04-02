package com.amazon.aps.iva.l40;

import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ShowPageDetailsFormatter.kt */
/* loaded from: classes2.dex */
public final class r implements q {
    public final com.amazon.aps.iva.kh.e a;
    public final com.amazon.aps.iva.r30.a b;
    public final com.amazon.aps.iva.aj.f c;

    public r(com.amazon.aps.iva.kh.e eVar, com.amazon.aps.iva.r30.a aVar, com.amazon.aps.iva.aj.f fVar) {
        this.a = eVar;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.l40.q
    public final String a(ContentContainer contentContainer) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, "contentContainer");
        return this.b.b(contentContainer);
    }

    @Override // com.amazon.aps.iva.l40.q
    public final String b(ContentContainer contentContainer) {
        String rating;
        com.amazon.aps.iva.yb0.j.f(contentContainer, "contentContainer");
        String str = "";
        if (!((Boolean) this.c.d().invoke()).booleanValue()) {
            return "";
        }
        ExtendedMaturityRating extendedMaturityRating = contentContainer.getExtendedMaturityRating();
        if (extendedMaturityRating != null && (rating = extendedMaturityRating.getRating()) != null) {
            str = rating;
        }
        return com.amazon.aps.iva.k.q.b(str, "\n", com.amazon.aps.iva.lb0.x.B0(contentContainer.getContentDescriptors(), ", ", null, null, null, 62));
    }

    @Override // com.amazon.aps.iva.l40.q
    public final String c(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "locales");
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (String str : list2) {
            arrayList.add(this.a.getTitleForLanguage(str));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!com.amazon.aps.iva.oe0.m.b0((String) next)) {
                arrayList2.add(next);
            }
        }
        return com.amazon.aps.iva.lb0.x.B0(arrayList2, ", ", null, null, null, 62);
    }
}
