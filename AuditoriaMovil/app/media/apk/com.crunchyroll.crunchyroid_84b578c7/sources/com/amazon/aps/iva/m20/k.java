package com.amazon.aps.iva.m20;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.ui.transitions.ColorTransition;
/* compiled from: UpsellV2FrameTransition.kt */
/* loaded from: classes2.dex */
public final class k extends ColorTransition<Integer> {
    public final RecyclerView a;
    public final int b;
    public final l<com.amazon.aps.iva.n20.a, View> c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(androidx.recyclerview.widget.RecyclerView r4, int r5, com.amazon.aps.iva.m20.d r6) {
        /*
            r3 = this;
            java.lang.String r0 = "recyclerView"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            java.lang.String r0 = "getView"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131099802(0x7f06009a, float:1.7811967E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "recyclerView.resources.g…rces.color.cr_honey_gold)"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131099809(0x7f0600a1, float:1.7811982E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "recyclerView.resources.g….color.cr_silver_chalice)"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            r3.<init>(r0, r1)
            r3.a = r4
            r3.b = r5
            r3.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m20.k.<init>(androidx.recyclerview.widget.RecyclerView, int, com.amazon.aps.iva.m20.d):void");
    }

    public final void a(Drawable drawable, int i) {
        ((GradientDrawable) drawable).setStroke(this.b, i);
    }

    @Override // com.ellation.crunchyroll.ui.transitions.ColorTransition
    public final void applyModificationForDifferentViews(int i, int i2) {
        Drawable background;
        Drawable background2;
        View viewIn = getViewIn();
        if (viewIn != null && (background2 = viewIn.getBackground()) != null) {
            a(background2, i);
        }
        View viewOut = getViewOut();
        if (viewOut != null && (background = viewOut.getBackground()) != null) {
            a(background, i2);
        }
    }

    @Override // com.ellation.crunchyroll.ui.transitions.ColorTransition
    public final void applyModificationForSameView() {
        Drawable background;
        Drawable background2;
        View viewIn = getViewIn();
        if (viewIn != null && (background2 = viewIn.getBackground()) != null) {
            a(background2, getParsedEndColor());
        }
        View viewOut = getViewOut();
        if (viewOut != null && (background = viewOut.getBackground()) != null) {
            a(background, getParsedStartColor());
        }
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public final View provideViewIn(Object obj) {
        View view;
        RecyclerView.f0 findViewHolderForAdapterPosition = this.a.findViewHolderForAdapterPosition(((Number) obj).intValue());
        if (findViewHolderForAdapterPosition != null) {
            view = findViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        return this.c.invoke((com.amazon.aps.iva.n20.a) view);
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public final View provideViewOut(Object obj) {
        View view;
        RecyclerView.f0 findViewHolderForAdapterPosition = this.a.findViewHolderForAdapterPosition(((Number) obj).intValue());
        if (findViewHolderForAdapterPosition != null) {
            view = findViewHolderForAdapterPosition.itemView;
        } else {
            view = null;
        }
        return this.c.invoke((com.amazon.aps.iva.n20.a) view);
    }
}
