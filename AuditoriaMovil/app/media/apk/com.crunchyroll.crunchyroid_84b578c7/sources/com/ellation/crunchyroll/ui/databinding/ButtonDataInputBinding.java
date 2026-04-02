package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class ButtonDataInputBinding implements a {
    private final FrameLayout rootView;
    public final TextView textviewDisabled;
    public final TextView textviewEnabled;

    private ButtonDataInputBinding(FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.textviewDisabled = textView;
        this.textviewEnabled = textView2;
    }

    public static ButtonDataInputBinding bind(View view) {
        int i = R.id.textview_disabled;
        TextView textView = (TextView) z.u(i, view);
        if (textView != null) {
            i = R.id.textview_enabled;
            TextView textView2 = (TextView) z.u(i, view);
            if (textView2 != null) {
                return new ButtonDataInputBinding((FrameLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ButtonDataInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ButtonDataInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.button_data_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
