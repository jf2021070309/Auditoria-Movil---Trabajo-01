package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class k<T> implements Comparator {
    public final /* synthetic */ h b;

    public k(h hVar) {
        this.b = hVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i;
        com.amazon.aps.iva.xx.l lVar = (com.amazon.aps.iva.xx.l) t;
        h hVar = this.b;
        Iterator it = hVar.g.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (it.hasNext()) {
                if (com.amazon.aps.iva.yb0.j.a(((HomeFeedItemRaw) it.next()).getId(), lVar.a())) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        com.amazon.aps.iva.xx.l lVar2 = (com.amazon.aps.iva.xx.l) t2;
        Iterator it2 = hVar.g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (com.amazon.aps.iva.yb0.j.a(((HomeFeedItemRaw) it2.next()).getId(), lVar2.a())) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return f1.t(valueOf, Integer.valueOf(i));
    }
}
