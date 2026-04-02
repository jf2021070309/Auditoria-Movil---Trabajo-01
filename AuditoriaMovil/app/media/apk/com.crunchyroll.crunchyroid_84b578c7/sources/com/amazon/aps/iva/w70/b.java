package com.amazon.aps.iva.w70;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
/* compiled from: CustomTabItemLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.g implements d {
    public final com.amazon.aps.iva.mj.a b;
    public final c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i) {
        super(context, null, 0, 6, null);
        j.f(str, "tabTitle");
        View inflate = LayoutInflater.from(context).inflate(R.layout.custom_tab_item_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.tab_image;
        ImageView imageView = (ImageView) z.u(R.id.tab_image, inflate);
        if (imageView != null) {
            i2 = R.id.tab_text;
            TextView textView = (TextView) z.u(R.id.tab_text, inflate);
            if (textView != null) {
                this.b = new com.amazon.aps.iva.mj.a((LinearLayout) inflate, imageView, textView, 3);
                this.c = new c(this, str, i);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // com.amazon.aps.iva.w70.d
    public void setIcon(int i) {
        ((ImageView) this.b.c).setImageResource(i);
    }

    @Override // com.amazon.aps.iva.w70.d
    public void setTitle(String str) {
        j.f(str, "tabTitle");
        ((TextView) this.b.d).setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.c);
    }
}
