package com.amazon.aps.iva.on;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.v60.g;
/* compiled from: LayoutEmptyFilterResultBinding.java */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final Object e;
    public final View f;

    public e(ConstraintLayout constraintLayout, TextView textView, TextView textView2, RecyclerView recyclerView, TextView textView3) {
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.f = recyclerView;
        this.e = textView3;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (i) {
            case 0:
            default:
                return constraintLayout;
        }
    }

    public e(ConstraintLayout constraintLayout, g gVar, ImageView imageView, TextView textView, TextView textView2) {
        this.b = constraintLayout;
        this.e = gVar;
        this.f = imageView;
        this.c = textView;
        this.d = textView2;
    }
}
