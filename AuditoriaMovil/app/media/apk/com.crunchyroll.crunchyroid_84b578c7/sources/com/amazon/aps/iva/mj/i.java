package com.amazon.aps.iva.mj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: PlayerMaturityLabelLayoutBinding.java */
/* loaded from: classes.dex */
public final class i implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 2;
    public final TextView b;
    public final ViewGroup c;
    public final View d;
    public final View e;

    public i(View view, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.c = constraintLayout;
        this.d = view;
        this.b = textView;
        this.e = textView2;
    }

    public final ConstraintLayout a() {
        int i = this.a;
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 1:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return (RelativeLayout) this.c;
            case 1:
                return a();
            default:
                return a();
        }
    }

    public i(RelativeLayout relativeLayout, TextView textView, ComposeView composeView, RelativeLayout relativeLayout2) {
        this.c = relativeLayout;
        this.b = textView;
        this.e = composeView;
        this.d = relativeLayout2;
    }

    public i(ConstraintLayout constraintLayout, View view, RecyclerView recyclerView, TextView textView) {
        this.c = constraintLayout;
        this.d = view;
        this.e = recyclerView;
        this.b = textView;
    }
}
