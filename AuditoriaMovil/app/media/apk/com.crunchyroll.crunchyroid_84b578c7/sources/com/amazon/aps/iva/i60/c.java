package com.amazon.aps.iva.i60;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: BaseSimpleDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/amazon/aps/iva/i60/c;", "Lcom/amazon/aps/iva/wy/d;", "feature_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class c extends com.amazon.aps.iva.wy.d {
    public final int b;
    public final Integer c;

    public c() {
        this((Integer) null, 0, 7);
    }

    @Override // androidx.fragment.app.g
    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.DialogTheme);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int i;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            Integer num = this.c;
            if (num != null) {
                i = getResources().getDimensionPixelSize(num.intValue());
                View view = getView();
                if (view != null) {
                    t0.h(view, Integer.valueOf(i), null, Integer.valueOf(i), null, 10);
                }
            } else {
                i = 0;
            }
            int i2 = window.getContext().getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize = getResources().getDimensionPixelSize(this.b);
            if (i2 > dimensionPixelSize) {
                window.setLayout((i * 2) + dimensionPixelSize, -2);
            } else {
                window.setLayout(-1, -2);
            }
            window.setGravity(17);
        }
    }

    public /* synthetic */ c(Integer num, int i, int i2) {
        this((i2 & 1) != 0 ? Integer.valueOf((int) R.layout.layout_simple_dialog) : num, (i2 & 2) != 0 ? R.dimen.simple_dialog_width : i, (i2 & 4) != 0 ? Integer.valueOf((int) R.dimen.simple_dialog_horizontal_margin) : null);
    }

    public c(Integer num, int i, Integer num2) {
        super(num);
        this.b = i;
        this.c = num2;
    }
}
