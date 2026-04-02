package com.amazon.aps.iva.on;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* compiled from: ItemFilterChipBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final TextView c;
    public final ImageView d;

    public /* synthetic */ c(LinearLayout linearLayout, ImageView imageView, TextView textView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.d = imageView;
        this.c = textView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        LinearLayout linearLayout = this.b;
        switch (i) {
            case 0:
            default:
                return linearLayout;
        }
    }
}
