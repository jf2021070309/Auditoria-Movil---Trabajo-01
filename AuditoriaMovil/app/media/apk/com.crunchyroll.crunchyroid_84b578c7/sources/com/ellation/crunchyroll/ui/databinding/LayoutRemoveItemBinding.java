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
public final class LayoutRemoveItemBinding implements a {
    private final FrameLayout rootView;
    public final TextView swipeToRemoveText;

    private LayoutRemoveItemBinding(FrameLayout frameLayout, TextView textView) {
        this.rootView = frameLayout;
        this.swipeToRemoveText = textView;
    }

    public static LayoutRemoveItemBinding bind(View view) {
        int i = R.id.swipe_to_remove_text;
        TextView textView = (TextView) z.u(i, view);
        if (textView != null) {
            return new LayoutRemoveItemBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutRemoveItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutRemoveItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_remove_item, viewGroup, false);
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
