package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amazon.aps.iva.d9.a;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class LayoutTabIndicatorDotBinding implements a {
    private final ImageView rootView;

    private LayoutTabIndicatorDotBinding(ImageView imageView) {
        this.rootView = imageView;
    }

    public static LayoutTabIndicatorDotBinding bind(View view) {
        if (view != null) {
            return new LayoutTabIndicatorDotBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static LayoutTabIndicatorDotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutTabIndicatorDotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_tab_indicator_dot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public ImageView getRoot() {
        return this.rootView;
    }
}
