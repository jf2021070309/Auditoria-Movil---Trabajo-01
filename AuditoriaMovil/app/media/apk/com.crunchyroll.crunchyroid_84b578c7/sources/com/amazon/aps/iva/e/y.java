package com.amazon.aps.iva.e;

import android.view.View;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, v> {
    public static final y h = new y();

    public y() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final v invoke(View view) {
        View view2 = view;
        com.amazon.aps.iva.yb0.j.f(view2, "it");
        Object tag = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof v) {
            return (v) tag;
        }
        return null;
    }
}
