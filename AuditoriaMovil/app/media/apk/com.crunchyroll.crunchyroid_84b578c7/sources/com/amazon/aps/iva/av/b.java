package com.amazon.aps.iva.av;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.mj.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AddToCrunchylistItemLayout.kt */
/* loaded from: classes2.dex */
public final class b extends ConstraintLayout implements c {
    public static final /* synthetic */ int d = 0;
    public final a b;
    public final g c;

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_add_to_crunchylist_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.crunchylist_item_add_image_view;
        ImageView imageView = (ImageView) z.u(R.id.crunchylist_item_add_image_view, inflate);
        if (imageView != null) {
            i2 = R.id.crunchylist_item_number;
            TextView textView = (TextView) z.u(R.id.crunchylist_item_number, inflate);
            if (textView != null) {
                i2 = R.id.crunchylist_item_title;
                TextView textView2 = (TextView) z.u(R.id.crunchylist_item_title, inflate);
                if (textView2 != null) {
                    this.c = new g((ConstraintLayout) inflate, imageView, textView, textView2);
                    setLayoutParams(new ConstraintLayout.b(-1, -2));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // com.amazon.aps.iva.av.c
    public final void K0(int i) {
        ((TextView) this.c.d).setText(getContext().getResources().getQuantityString(R.plurals.crunchylists_add_to_crunchylist_items, i, Integer.valueOf(i)));
    }

    @Override // com.amazon.aps.iva.av.c
    public final void L1(String str) {
        j.f(str, "title");
        ((TextView) this.c.e).setText(str);
    }
}
