package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.j;
/* loaded from: classes2.dex */
public class i extends LinearLayout {
    private static final float a = Resources.getSystem().getDisplayMetrics().density;
    private static final int b = (int) (6.0f * a);
    private static final int c = (int) (8.0f * a);
    private final TextView d;
    private final TextView e;

    public i(Context context, j jVar, boolean z, boolean z2, boolean z3) {
        super(context);
        setOrientation(1);
        Typeface create = Build.VERSION.SDK_INT >= 21 ? Typeface.create("sans-serif-medium", 0) : Typeface.create(Typeface.SANS_SERIF, 1);
        this.d = new TextView(context);
        this.d.setTypeface(create);
        this.d.setTextSize(2, z2 ? 18.0f : 22.0f);
        this.d.setTextColor(jVar.c(z));
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setLineSpacing(b, 1.0f);
        this.e = new TextView(context);
        this.e.setTypeface(Typeface.SANS_SERIF, 0);
        this.e.setTextSize(2, z2 ? 14.0f : 16.0f);
        this.e.setTextColor(jVar.b(z));
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        this.e.setLineSpacing(b, 1.0f);
        addView(this.d, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, z3 ? c / 2 : c, 0, 0);
        addView(this.e, layoutParams);
    }

    public void a(String str, String str2, boolean z, boolean z2) {
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = TextUtils.isEmpty(str2) ? false : true;
        TextView textView = this.d;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        TextView textView2 = this.e;
        if (!z3) {
            str2 = "";
        }
        textView2.setText(str2);
        if (!z3 || !z4) {
            this.d.setMaxLines(z ? 2 : z2 ? 4 : 3);
            return;
        }
        this.d.setMaxLines(z ? 1 : 2);
        this.e.setMaxLines(z ? 1 : z2 ? 3 : 2);
    }

    public void setAlignment(int i) {
        this.d.setGravity(i);
        this.e.setGravity(i);
    }
}
