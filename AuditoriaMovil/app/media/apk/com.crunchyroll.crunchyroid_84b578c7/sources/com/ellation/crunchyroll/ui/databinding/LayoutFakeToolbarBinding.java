package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class LayoutFakeToolbarBinding implements a {
    public final TextView fakeToolbarTextCollapsed;
    private final Toolbar rootView;

    private LayoutFakeToolbarBinding(Toolbar toolbar, TextView textView) {
        this.rootView = toolbar;
        this.fakeToolbarTextCollapsed = textView;
    }

    public static LayoutFakeToolbarBinding bind(View view) {
        int i = R.id.fake_toolbar_text_collapsed;
        TextView textView = (TextView) z.u(i, view);
        if (textView != null) {
            return new LayoutFakeToolbarBinding((Toolbar) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutFakeToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutFakeToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_fake_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public Toolbar getRoot() {
        return this.rootView;
    }
}
