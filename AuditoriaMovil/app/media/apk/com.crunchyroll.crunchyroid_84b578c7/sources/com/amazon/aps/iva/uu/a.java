package com.amazon.aps.iva.uu;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.e.z;
import com.crunchyroll.crunchyroid.R;
/* compiled from: DialogToolbarLayoutBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final LinearLayout a;
    public final ImageView b;
    public final TextView c;

    public a(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
    }

    public static a a(View view) {
        int i = R.id.toolbar_close;
        ImageView imageView = (ImageView) z.u(R.id.toolbar_close, view);
        if (imageView != null) {
            i = R.id.toolbar_title;
            TextView textView = (TextView) z.u(R.id.toolbar_title, view);
            if (textView != null) {
                return new a((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
