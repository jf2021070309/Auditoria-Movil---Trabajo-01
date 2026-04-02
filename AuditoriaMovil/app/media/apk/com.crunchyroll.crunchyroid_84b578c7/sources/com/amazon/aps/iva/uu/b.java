package com.amazon.aps.iva.uu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LayoutSimpleDialogBinding.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public b(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public static b a(View view) {
        int i = R.id.close_button;
        ImageView imageView = (ImageView) z.u(R.id.close_button, view);
        if (imageView != null) {
            i = R.id.dialog_cta;
            TextView textView = (TextView) z.u(R.id.dialog_cta, view);
            if (textView != null) {
                i = R.id.dialog_subtitle;
                TextView textView2 = (TextView) z.u(R.id.dialog_subtitle, view);
                if (textView2 != null) {
                    i = R.id.dialog_title;
                    TextView textView3 = (TextView) z.u(R.id.dialog_title, view);
                    if (textView3 != null) {
                        return new b((ConstraintLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
