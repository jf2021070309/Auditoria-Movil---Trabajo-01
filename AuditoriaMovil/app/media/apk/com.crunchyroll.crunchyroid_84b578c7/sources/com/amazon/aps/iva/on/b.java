package com.amazon.aps.iva.on;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
/* compiled from: FragmentSortAndFilterBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final LinearLayout c;

    public b(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = linearLayout;
    }

    public static b a(View view) {
        int i = R.id.no_network_message_view;
        if (((ErrorBottomMessageView) z.u(R.id.no_network_message_view, view)) != null) {
            i = R.id.no_network_message_view_container;
            if (((FrameLayout) z.u(R.id.no_network_message_view_container, view)) != null) {
                i = R.id.sort_and_filters_apply_button;
                TextView textView = (TextView) z.u(R.id.sort_and_filters_apply_button, view);
                if (textView != null) {
                    i = R.id.sort_and_filters_container;
                    LinearLayout linearLayout = (LinearLayout) z.u(R.id.sort_and_filters_container, view);
                    if (linearLayout != null) {
                        return new b((ConstraintLayout) view, textView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
