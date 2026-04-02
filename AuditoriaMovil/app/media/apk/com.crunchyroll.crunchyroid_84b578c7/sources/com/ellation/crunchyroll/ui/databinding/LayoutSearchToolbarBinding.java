package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class LayoutSearchToolbarBinding implements a {
    private final LinearLayout rootView;
    public final ImageView searchToolbarClearButton;
    public final EditText searchToolbarInput;

    private LayoutSearchToolbarBinding(LinearLayout linearLayout, ImageView imageView, EditText editText) {
        this.rootView = linearLayout;
        this.searchToolbarClearButton = imageView;
        this.searchToolbarInput = editText;
    }

    public static LayoutSearchToolbarBinding bind(View view) {
        int i = R.id.search_toolbar_clear_button;
        ImageView imageView = (ImageView) z.u(i, view);
        if (imageView != null) {
            i = R.id.search_toolbar_input;
            EditText editText = (EditText) z.u(i, view);
            if (editText != null) {
                return new LayoutSearchToolbarBinding((LinearLayout) view, imageView, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutSearchToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutSearchToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_search_toolbar, viewGroup, false);
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
