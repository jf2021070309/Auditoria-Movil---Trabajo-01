package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.uz.h;
import com.ellation.crunchyroll.model.browse.BrowseSectionItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: BrowseSectionIndexer.kt */
/* loaded from: classes2.dex */
public final class z0 implements y0 {
    public String[] a = (String[]) new ArrayList().toArray(new String[0]);
    public Map<Integer, BrowseSectionItem> b = com.amazon.aps.iva.lb0.a0.b;
    public List<Integer> c = com.amazon.aps.iva.lb0.z.b;

    @Override // com.amazon.aps.iva.tz.y0
    public final void a(List<BrowseSectionItem> list) {
        com.amazon.aps.iva.yb0.j.f(list, "sections");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((BrowseSectionItem) next).getTotal() == 0) {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                arrayList2.add(Integer.valueOf(((BrowseSectionItem) next2).getOffset() + i));
                i = i2;
            } else {
                com.amazon.aps.iva.ee0.f1.S();
                throw null;
            }
        }
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it3 = arrayList.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            Object next3 = it3.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                arrayList3.add(new com.amazon.aps.iva.kb0.j(Integer.valueOf(i3), (BrowseSectionItem) next3));
                i3 = i4;
            } else {
                com.amazon.aps.iva.ee0.f1.S();
                throw null;
            }
        }
        int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(arrayList3));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) it4.next();
            int intValue = ((Number) jVar.b).intValue();
            B b = jVar.c;
            linkedHashMap.put(Integer.valueOf(((BrowseSectionItem) b).getOffset() + intValue), (BrowseSectionItem) b);
        }
        this.b = linkedHashMap;
        ArrayList arrayList4 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((BrowseSectionItem) it5.next()).getPrefix());
        }
        this.a = (String[]) arrayList4.toArray(new String[0]);
    }

    @Override // com.amazon.aps.iva.tz.y0
    public final boolean b(int i) {
        return this.c.contains(Integer.valueOf(i));
    }

    @Override // com.amazon.aps.iva.tz.y0
    public final boolean c(int i) {
        return b(i - 1);
    }

    @Override // com.amazon.aps.iva.tz.y0
    public final h.d d(int i) {
        BrowseSectionItem browseSectionItem = (BrowseSectionItem) com.amazon.aps.iva.lb0.i0.S(Integer.valueOf(i), this.b);
        return new h.d(browseSectionItem.getPrefix(), browseSectionItem.getTitle());
    }

    @Override // com.amazon.aps.iva.tz.y0
    public final int e(int i, int i2) {
        boolean z;
        List<Integer> list = this.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        for (Number number : list) {
            int intValue = number.intValue();
            if (i <= intValue && intValue <= i2) {
                z = true;
            } else {
                z = false;
            }
            if (z && (i3 = i3 + 1) < 0) {
                com.amazon.aps.iva.ee0.f1.R();
                throw null;
            }
        }
        return i3;
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        return this.c.get(i).intValue();
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        boolean z;
        if (this.c.isEmpty()) {
            return 0;
        }
        List<Integer> list = this.c;
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().intValue() <= i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        return this.a;
    }
}
