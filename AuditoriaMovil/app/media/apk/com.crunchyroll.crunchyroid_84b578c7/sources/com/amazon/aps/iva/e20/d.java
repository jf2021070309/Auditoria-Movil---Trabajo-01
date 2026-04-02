package com.amazon.aps.iva.e20;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ b c;

    public d(View view, b bVar) {
        this.b = view;
        this.c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.b;
        if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            b.a aVar = b.e;
            b bVar = this.c;
            ScrollView scrollView = bVar.ci().e;
            j.e(scrollView, "binding.contentContainer");
            TextView textView = bVar.ci().g;
            j.c(textView);
            int height = textView.getHeight();
            TextView textView2 = bVar.ci().c;
            j.c(textView2);
            t0.j(scrollView, null, Integer.valueOf(height - textView2.getHeight()), null, null, 13);
            TextView textView3 = bVar.ci().g;
            j.c(textView3);
            int height2 = textView3.getHeight();
            TextView textView4 = bVar.ci().c;
            j.c(textView4);
            bVar.ci().e.getViewTreeObserver().addOnScrollChangedListener(new c(bVar, (height2 - textView4.getHeight()) + 10.0f));
        }
    }
}
