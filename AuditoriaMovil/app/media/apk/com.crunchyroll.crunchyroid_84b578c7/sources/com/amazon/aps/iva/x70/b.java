package com.amazon.aps.iva.x70;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.wy.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: UnbreakableTextViewGroupPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> {
    public final int b;
    public final ArrayList c;
    public final List<d> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, ArrayList arrayList, int i) {
        super(cVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
        this.b = i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (com.amazon.aps.iva.yb0.j.a(((d) obj).getTag(), str)) {
                arrayList2.add(obj);
            }
        }
        this.c = arrayList2;
        this.d = x.H0(arrayList, arrayList2);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        boolean z;
        boolean z2;
        boolean z3;
        List<d> list = this.d;
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<d> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (d dVar : list2) {
                    if (dVar.a() > 1) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            ArrayList arrayList = this.c;
            if (z3) {
                getView().j4();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).hide();
                }
                int size = list.size() - 1;
                for (int i = 0; i < size; i++) {
                    list.get(i).b(this.b);
                }
                return;
            }
            getView().Ze();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).show();
            }
            for (d dVar2 : list2) {
                dVar2.b(0);
            }
            return;
        }
        throw new IllegalStateException(new IllegalStateException("There should be at least 2 buttons").toString());
    }
}
