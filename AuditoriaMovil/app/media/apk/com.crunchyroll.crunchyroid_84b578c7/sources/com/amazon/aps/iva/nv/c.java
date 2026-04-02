package com.amazon.aps.iva.nv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ov.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.overflow.OverflowButton;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: CrunchylistItemLayout.kt */
/* loaded from: classes2.dex */
public final class c extends ConstraintLayout implements f {
    public static final /* synthetic */ int d = 0;
    public final d b;
    public final h c;

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new d(this, new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()));
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_crunchylist_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.crunchylist_item_number;
        TextView textView = (TextView) z.u(R.id.crunchylist_item_number, inflate);
        if (textView != null) {
            i2 = R.id.crunchylist_item_title;
            TextView textView2 = (TextView) z.u(R.id.crunchylist_item_title, inflate);
            if (textView2 != null) {
                i2 = R.id.crunchylist_item_update_date;
                TextView textView3 = (TextView) z.u(R.id.crunchylist_item_update_date, inflate);
                if (textView3 != null) {
                    i2 = R.id.crunchylist_overflow_button;
                    OverflowButton overflowButton = (OverflowButton) z.u(R.id.crunchylist_overflow_button, inflate);
                    if (overflowButton != null) {
                        this.c = new h((ConstraintLayout) inflate, textView, textView2, textView3, overflowButton);
                        setLayoutParams(new ConstraintLayout.b(-1, -2));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // com.amazon.aps.iva.nv.f
    public final void Hf(String str) {
        this.c.d.setText(getContext().getResources().getString(R.string.crunchylists_crunchylist_updated_on, str));
    }

    @Override // com.amazon.aps.iva.nv.f
    public final void K0(int i) {
        this.c.b.setText(getContext().getResources().getQuantityString(R.plurals.crunchylists_add_to_crunchylist_items, i, Integer.valueOf(i)));
    }

    @Override // com.amazon.aps.iva.nv.f
    public final void L1(String str) {
        j.f(str, "title");
        this.c.c.setText(str);
    }
}
