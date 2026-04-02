package com.amazon.aps.iva.e70;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.xw.d;
import com.amazon.aps.iva.xw.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.databinding.LayoutFakeToolbarBinding;
import com.ellation.widgets.collapsibletoolbar.CollapsibleToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ Toolbar c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ View e;

    public b(View view, Toolbar toolbar, boolean z, ViewGroup viewGroup) {
        this.b = view;
        this.c = toolbar;
        this.d = z;
        this.e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AppBarLayout appBar;
        View view = this.b;
        if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            CollapsibleToolbarLayout collapsibleToolbarLayout = (CollapsibleToolbarLayout) view;
            Toolbar toolbar = this.c;
            collapsibleToolbarLayout.setUpAppBar(toolbar);
            appBar = collapsibleToolbarLayout.getAppBar();
            e.a(appBar).setDragCallback(new d(new c(this.e)));
            LayoutFakeToolbarBinding layoutFakeToolbarBinding = collapsibleToolbarLayout.b;
            layoutFakeToolbarBinding.fakeToolbarTextCollapsed.setText(toolbar.getTitle());
            View view2 = collapsibleToolbarLayout.c;
            if (view2 != null) {
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.i.t(view2, true);
                if (layoutFakeToolbarBinding.fakeToolbarTextCollapsed.getLineCount() > 1) {
                    CollapsibleToolbarLayout.b(collapsibleToolbarLayout);
                } else if (this.d) {
                    View view3 = collapsibleToolbarLayout.c;
                    if (view3 != null) {
                        g0.i.t(view3, false);
                        CollapsibleToolbarLayout.a(collapsibleToolbarLayout);
                    } else {
                        j.m("scrollableMainView");
                        throw null;
                    }
                }
            } else {
                j.m("scrollableMainView");
                throw null;
            }
        }
        return true;
    }
}
