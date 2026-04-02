package com.amazon.aps.iva.w90;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toolbar;
import com.amazon.aps.iva.v90.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ToolbarViewTransformer.kt */
@SuppressLint({"NewApi"})
/* loaded from: classes4.dex */
public final class a implements i {
    public static final a b = new a();

    @Override // com.amazon.aps.iva.v90.i
    public final View e(View view, AttributeSet attributeSet) {
        if (view instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) view;
            Context context = toolbar.getContext();
            j.b(context, "context");
            int a = i.a.a(context, attributeSet, 16843233);
            Context context2 = toolbar.getContext();
            j.b(context2, "context");
            int a2 = i.a.a(context2, attributeSet, R.attr.title);
            Context context3 = toolbar.getContext();
            j.b(context3, "context");
            int a3 = i.a.a(context3, attributeSet, 16843473);
            Context context4 = toolbar.getContext();
            j.b(context4, "context");
            int a4 = i.a.a(context4, attributeSet, R.attr.subtitle);
            if (a > 0) {
                toolbar.setTitle(a);
            } else if (a2 > 0) {
                toolbar.setTitle(a2);
            }
            if (a3 > 0) {
                toolbar.setSubtitle(a3);
            } else if (a4 > 0) {
                toolbar.setSubtitle(a4);
            }
        }
        return view;
    }
}
