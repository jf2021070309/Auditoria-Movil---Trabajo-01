package com.amazon.aps.iva.p000do;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d9.a;
/* compiled from: LayoutMigrationUpsellBannerBinding.java */
/* renamed from: com.amazon.aps.iva.do.e  reason: invalid package */
/* loaded from: classes2.dex */
public final class e implements a {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final View c;
    public final View d;
    public final View e;

    public e(View view, TextView textView, FrameLayout frameLayout, TextView textView2) {
        this.c = view;
        this.b = textView;
        this.e = frameLayout;
        this.d = textView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        View view = this.c;
        switch (i) {
            case 0:
                return view;
            default:
                return (ConstraintLayout) view;
        }
    }

    public e(ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout) {
        this.c = constraintLayout;
        this.d = imageView;
        this.e = imageView2;
        this.b = textView;
    }
}
