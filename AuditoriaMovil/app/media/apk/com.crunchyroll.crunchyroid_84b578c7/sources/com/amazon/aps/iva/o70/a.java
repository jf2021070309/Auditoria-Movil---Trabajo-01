package com.amazon.aps.iva.o70;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: HorizontalPagerRecyclerView.kt */
/* loaded from: classes2.dex */
public class a extends RecyclerView {
    public final c b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0, 60);
        j.f(context, "context");
    }

    public final void setListeners(l<? super e, q> lVar) {
        j.f(lVar, "initListeners");
        lVar.invoke(this.b.e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, int r13, int r14) {
        /*
            r8 = this;
            r0 = r14 & 2
            if (r0 == 0) goto L5
            r10 = 0
        L5:
            r0 = r14 & 4
            r1 = 0
            if (r0 == 0) goto Lb
            r11 = r1
        Lb:
            r0 = r14 & 8
            if (r0 == 0) goto L14
            boolean r0 = com.amazon.aps.iva.xw.q.f(r9)
            goto L15
        L14:
            r0 = r1
        L15:
            r2 = r14 & 16
            if (r2 == 0) goto L23
            android.content.res.Resources r12 = r9.getResources()
            int r2 = com.ellation.crunchyroll.ui.R.dimen.pager_recycler_item_width
            int r12 = r12.getDimensionPixelSize(r2)
        L23:
            r14 = r14 & 32
            if (r14 == 0) goto L31
            android.content.res.Resources r13 = r9.getResources()
            int r14 = com.ellation.crunchyroll.ui.R.dimen.pager_recycler_item_space
            int r13 = r13.getDimensionPixelSize(r14)
        L31:
            java.lang.String r14 = "context"
            com.amazon.aps.iva.yb0.j.f(r9, r14)
            r8.<init>(r9, r10, r11)
            androidx.recyclerview.widget.b0 r9 = new androidx.recyclerview.widget.b0
            r9.<init>()
            com.amazon.aps.iva.o70.c r10 = new com.amazon.aps.iva.o70.c
            r10.<init>(r8, r9, r0)
            r8.b = r10
            r9.attachToRecyclerView(r8)
            r8.addOnScrollListener(r10)
            android.content.Context r9 = r8.getContext()
            com.amazon.aps.iva.yb0.j.e(r9, r14)
            int r9 = com.amazon.aps.iva.xw.q.e(r9)
            int r9 = r9 - r12
            int r9 = r9 / 2
            int r9 = r9 - r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r6 = 0
            r7 = 10
            r2 = r8
            com.amazon.aps.iva.xw.t0.j(r2, r3, r4, r5, r6, r7)
            r8.setClipToPadding(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o70.a.<init>(android.content.Context, android.util.AttributeSet, int, int, int, int):void");
    }
}
