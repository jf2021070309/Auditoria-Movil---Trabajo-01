package com.ellation.widgets.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: TabDotsIndicatorView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/ellation/widgets/tabs/TabDotsIndicatorView;", "Landroid/widget/LinearLayout;", "", "size", "Lcom/amazon/aps/iva/kb0/q;", "setSize", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TabDotsIndicatorView extends LinearLayout {
    public final ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabDotsIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = new ArrayList();
    }

    public final void a(int i) {
        ArrayList arrayList = this.b;
        View view = (View) x.w0(i, arrayList);
        if (view != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setSelected(false);
            }
            view.setSelected(true);
            return;
        }
        throw new IllegalStateException(c0.a("No dot with position = ", i).toString());
    }

    public final void setSize(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = this.b;
            arrayList.clear();
            removeAllViews();
            for (int i2 = 0; i2 < i; i2++) {
                View inflate = View.inflate(getContext(), R.layout.layout_tab_indicator_dot, null);
                j.d(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) inflate;
                addView(imageView);
                arrayList.add(imageView);
            }
            return;
        }
        throw new IllegalArgumentException("Size should be greater than 0!".toString());
    }
}
