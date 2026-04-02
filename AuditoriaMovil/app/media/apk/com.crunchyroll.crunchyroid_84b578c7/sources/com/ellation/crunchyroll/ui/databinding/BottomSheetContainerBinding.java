package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
/* loaded from: classes2.dex */
public final class BottomSheetContainerBinding implements a {
    public final ListView popupList;
    private final LinearLayoutCompat rootView;
    public final TextView title;

    private BottomSheetContainerBinding(LinearLayoutCompat linearLayoutCompat, ListView listView, TextView textView) {
        this.rootView = linearLayoutCompat;
        this.popupList = listView;
        this.title = textView;
    }

    public static BottomSheetContainerBinding bind(View view) {
        int i = R.id.popupList;
        ListView listView = (ListView) z.u(i, view);
        if (listView != null) {
            i = R.id.title;
            TextView textView = (TextView) z.u(i, view);
            if (textView != null) {
                return new BottomSheetContainerBinding((LinearLayoutCompat) view, listView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static BottomSheetContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
