package com.amazon.aps.iva.un;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mn.f;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SortAndFilterCheckBoxGroup.kt */
/* loaded from: classes2.dex */
public final class b<T extends f> extends LinearLayout {
    public final boolean b;
    public CheckBox c;

    public b(Context context) {
        super(context);
        this.b = true;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.custom_radio_group_horizontal_margin);
        t0.j(this, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), null, 10);
        setOrientation(1);
    }

    public final void setChecked(boolean z) {
        CheckBox checkBox = this.c;
        if (checkBox != null) {
            checkBox.setChecked(z);
        } else {
            j.m("checkBox");
            throw null;
        }
    }

    public final void setOnCheckedChangeListener(final l<? super Boolean, q> lVar) {
        j.f(lVar, "onChange");
        CheckBox checkBox = this.c;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.amazon.aps.iva.un.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    b bVar = b.this;
                    j.f(bVar, "this$0");
                    l lVar2 = lVar;
                    j.f(lVar2, "$onChange");
                    if (bVar.b) {
                        CheckBox checkBox2 = bVar.c;
                        if (checkBox2 != null) {
                            lVar2.invoke(Boolean.valueOf(checkBox2.isChecked()));
                        } else {
                            j.m("checkBox");
                            throw null;
                        }
                    }
                }
            });
        } else {
            j.m("checkBox");
            throw null;
        }
    }
}
