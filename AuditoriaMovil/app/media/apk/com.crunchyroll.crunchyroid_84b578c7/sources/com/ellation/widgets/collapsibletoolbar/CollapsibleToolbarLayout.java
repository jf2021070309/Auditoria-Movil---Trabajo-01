package com.ellation.widgets.collapsibletoolbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.xw.d;
import com.amazon.aps.iva.xw.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
import com.ellation.crunchyroll.ui.databinding.LayoutFakeToolbarBinding;
import com.ellation.widgets.collapsibletoolbar.CollapsibleToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
/* compiled from: CollapsibleToolbarLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ellation/widgets/collapsibletoolbar/CollapsibleToolbarLayout;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/amazon/aps/iva/kb0/q;", "setUpAppBar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CollapsibleToolbarLayout extends CollapsingToolbarLayout {
    public static final /* synthetic */ int d = 0;
    public final LayoutFakeToolbarBinding b;
    public View c;

    /* compiled from: CollapsibleToolbarLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            View view = CollapsibleToolbarLayout.this.c;
            if (view != null) {
                return Boolean.valueOf(view.isNestedScrollingEnabled());
            }
            j.m("scrollableMainView");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsibleToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static final void a(CollapsibleToolbarLayout collapsibleToolbarLayout) {
        collapsibleToolbarLayout.getAppBar().setExpanded(false, false);
    }

    public static final void b(CollapsibleToolbarLayout collapsibleToolbarLayout) {
        collapsibleToolbarLayout.getAppBar().setExpanded(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppBarLayout getAppBar() {
        ViewParent parent = getParent();
        j.d(parent, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        return (AppBarLayout) parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpAppBar(final Toolbar toolbar) {
        e.a(getAppBar()).setDragCallback(new d(new a()));
        getAppBar().addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.amazon.aps.iva.e70.a
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                boolean z;
                Drawable drawable;
                int i2 = CollapsibleToolbarLayout.d;
                Toolbar toolbar2 = Toolbar.this;
                j.f(toolbar2, "$toolbar");
                CollapsibleToolbarLayout collapsibleToolbarLayout = this;
                j.f(collapsibleToolbarLayout, "this$0");
                if (Math.abs(i) - appBarLayout.getTotalScrollRange() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    drawable = com.amazon.aps.iva.d3.a.getDrawable(collapsibleToolbarLayout.getContext(), R.drawable.toolbar_background_divider);
                } else {
                    drawable = null;
                }
                toolbar2.setBackground(drawable);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        LayoutFakeToolbarBinding inflate = LayoutFakeToolbarBinding.inflate(LayoutInflater.from(context), this, true);
        j.e(inflate, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.b = inflate;
    }
}
