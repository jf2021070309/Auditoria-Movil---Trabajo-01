package com.ellation.widgets.unbreakabletextviewgroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.x70.a;
import com.amazon.aps.iva.x70.b;
import com.amazon.aps.iva.x70.c;
import com.amazon.aps.iva.x70.e;
import com.amazon.aps.iva.xw.u0;
import com.amazon.aps.iva.xw.v0;
import com.amazon.aps.iva.xw.w0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: UnbreakableTextViewGroup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/widgets/unbreakabletextviewgroup/UnbreakableTextViewGroup;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/x70/c;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UnbreakableTextViewGroup extends LinearLayout implements c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnbreakableTextViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        int[] iArr = R.styleable.UnbreakableTextViewGroup;
        j.e(iArr, "UnbreakableTextViewGroup");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        String nonResourceString = obtainStyledAttributes.getNonResourceString(R.styleable.UnbreakableTextViewGroup_dividerTag);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.UnbreakableTextViewGroup_verticalSpaceBetweenItems, 0);
        if (isLaidOut()) {
            j.e(nonResourceString, "divider");
            v0 a = w0.a(this);
            ArrayList arrayList = new ArrayList(r.Y(a));
            Iterator<View> it = a.iterator();
            while (true) {
                u0 u0Var = (u0) it;
                if (!u0Var.hasNext()) {
                    break;
                }
                arrayList.add(new e((View) u0Var.next()));
            }
            new b(this, nonResourceString, arrayList, dimensionPixelOffset).onCreate();
        } else {
            getViewTreeObserver().addOnGlobalLayoutListener(new a(dimensionPixelOffset, this, nonResourceString));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.amazon.aps.iva.x70.c
    public final void Ze() {
        setOrientation(0);
    }

    @Override // com.amazon.aps.iva.x70.c
    public final void j4() {
        setOrientation(1);
    }
}
