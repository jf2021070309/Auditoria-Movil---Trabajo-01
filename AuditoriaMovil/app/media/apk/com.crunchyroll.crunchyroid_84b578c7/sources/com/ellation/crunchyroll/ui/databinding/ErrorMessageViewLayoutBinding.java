package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class ErrorMessageViewLayoutBinding implements a {
    private final LinearLayout rootView;
    public final TextView text;

    private ErrorMessageViewLayoutBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.text = textView;
    }

    public static ErrorMessageViewLayoutBinding bind(View view) {
        int i = R.id.text;
        TextView textView = (TextView) z.u(i, view);
        if (textView != null) {
            return new ErrorMessageViewLayoutBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ErrorMessageViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ErrorMessageViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.error_message_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
