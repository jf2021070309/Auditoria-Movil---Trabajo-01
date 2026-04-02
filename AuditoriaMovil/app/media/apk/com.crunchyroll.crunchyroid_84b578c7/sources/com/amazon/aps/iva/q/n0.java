package com.amazon.aps.iva.q;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public final class n0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ o0 b;

    public n0(o0 o0Var) {
        this.b = o0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        k0 k0Var;
        if (i != -1 && (k0Var = this.b.d) != null) {
            k0Var.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
