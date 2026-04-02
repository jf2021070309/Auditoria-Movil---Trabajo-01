package com.amazon.aps.iva.fb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ib.d0;
import com.amazon.aps.iva.ib.g;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
/* compiled from: ColumnsAnchorFactory.java */
/* loaded from: classes.dex */
public final class c extends a {
    public final com.amazon.aps.iva.eb.a c;

    public c(ChipsLayoutManager chipsLayoutManager, g gVar) {
        super(chipsLayoutManager, gVar);
        this.c = new com.amazon.aps.iva.eb.a(chipsLayoutManager);
    }

    @Override // com.amazon.aps.iva.fb.d
    public final b a() {
        boolean z;
        b bVar = new b();
        com.amazon.aps.iva.eb.a aVar = this.c;
        aVar.getClass();
        boolean z2 = false;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            RecyclerView.p pVar = aVar.b;
            boolean z3 = true;
            if (i2 < pVar.getChildCount()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i5 = i2 + 1;
            View childAt = pVar.getChildAt(i2);
            RecyclerView.p pVar2 = this.a;
            int position = pVar2.getPosition(childAt);
            g gVar = this.b;
            Rect f = ((d0) gVar).f(childAt);
            b bVar2 = new b(position, f);
            int position2 = pVar2.getPosition(childAt);
            int decoratedLeft = pVar2.getDecoratedLeft(childAt);
            int decoratedRight = pVar2.getDecoratedRight(childAt);
            if (((d0) gVar).g(new Rect(f))) {
                if (bVar2.b.intValue() != -1) {
                    z3 = false;
                }
                if (!z3) {
                    if (i4 > position2) {
                        bVar = bVar2;
                        i4 = position2;
                    }
                    if (i > decoratedLeft) {
                        i3 = decoratedRight;
                        i = decoratedLeft;
                    } else if (i == decoratedLeft) {
                        i3 = Math.max(i3, decoratedRight);
                    }
                }
            }
            i2 = i5;
        }
        Rect rect = bVar.c;
        if (rect == null) {
            z2 = true;
        }
        if (!z2) {
            rect.left = i;
            rect.right = i3;
            bVar.b = Integer.valueOf(i4);
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.fb.d
    public final void b(b bVar) {
        boolean z;
        if (bVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            g gVar = this.b;
            int b = gVar.b();
            Rect rect = bVar.c;
            rect.top = b;
            rect.bottom = gVar.c();
        }
    }
}
