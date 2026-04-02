package com.amazon.aps.iva.e60;

import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import java.util.Iterator;
import java.util.List;
/* compiled from: WatchlistImages.kt */
/* loaded from: classes2.dex */
public final class b {
    public final List<a> a;

    public b() {
        this(0);
    }

    public final a a(k kVar) {
        Object obj;
        j.f(kVar, "item");
        Iterator<T> it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j.a(((a) obj).b, kVar.g.getMetadata().getParentId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (a) obj;
    }

    public /* synthetic */ b(int i) {
        this(z.b);
    }

    public b(List<a> list) {
        j.f(list, "images");
        this.a = list;
    }
}
