package com.amazon.aps.iva.a70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.l;
import java.util.List;
/* compiled from: MenuPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.b<g> {
    public final List<b> b;
    public final l<b, q> c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(g gVar, List<? extends b> list, l<? super b, q> lVar, int i, int i2, int i3) {
        super(gVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(gVar, "view");
        this.b = list;
        this.c = lVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final void q6(int i, l<? super Integer, q> lVar, l<? super Boolean, q> lVar2) {
        int intValue;
        int i2 = this.d;
        List<b> list = this.b;
        if (i == i2) {
            lVar.invoke(Integer.valueOf(this.f));
        } else {
            b bVar = list.get(i);
            if (bVar.c) {
                Integer num = bVar.b;
                if (num != null) {
                    intValue = num.intValue();
                    lVar.invoke(Integer.valueOf(intValue));
                }
                intValue = this.e;
                lVar.invoke(Integer.valueOf(intValue));
            } else {
                Integer num2 = bVar.d;
                if (num2 != null) {
                    intValue = num2.intValue();
                    lVar.invoke(Integer.valueOf(intValue));
                }
                intValue = this.e;
                lVar.invoke(Integer.valueOf(intValue));
            }
        }
        lVar2.invoke(Boolean.valueOf(list.get(i).c));
    }

    public final boolean r6(int i) {
        b bVar = this.b.get(i);
        if (!bVar.c) {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 != null) {
            this.c.invoke(bVar2);
            getView().dismiss();
            return true;
        }
        return false;
    }
}
