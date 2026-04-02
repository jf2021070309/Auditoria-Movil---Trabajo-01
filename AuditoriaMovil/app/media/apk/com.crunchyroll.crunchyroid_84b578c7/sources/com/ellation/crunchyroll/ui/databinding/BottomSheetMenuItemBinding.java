package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amazon.aps.iva.d9.a;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class BottomSheetMenuItemBinding implements a {
    public final TextView itemTitle;
    private final TextView rootView;

    private BottomSheetMenuItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.itemTitle = textView2;
    }

    public static BottomSheetMenuItemBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new BottomSheetMenuItemBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static BottomSheetMenuItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetMenuItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_menu_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public TextView getRoot() {
        return this.rootView;
    }
}
