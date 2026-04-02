package com.amazon.aps.iva.e20;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MediaDetailsDialog.kt */
/* loaded from: classes2.dex */
public final class c implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ b b;
    public final /* synthetic */ float c;

    public c(b bVar, float f) {
        this.b = bVar;
        this.c = f;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        b.a aVar = b.e;
        b bVar = this.b;
        TextView textView = bVar.ci().g;
        float f = this.c;
        if (textView != null) {
            textView.setAlpha((f - bVar.ci().e.getScrollY()) / f);
        }
        View view = bVar.ci().f;
        if (view != null) {
            float f2 = f / 1.2f;
            view.setAlpha(Math.min(bVar.ci().e.getScrollY() - f2, f2 + f) / f);
        }
        ScrollView scrollView = bVar.ci().e;
        j.e(scrollView, "binding.contentContainer");
        TextView textView2 = bVar.ci().g;
        j.c(textView2);
        int height = textView2.getHeight();
        TextView textView3 = bVar.ci().g;
        j.c(textView3);
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        t0.j(scrollView, null, null, null, Integer.valueOf((i * 2) + height), 7);
    }
}
