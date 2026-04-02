package com.facebook.ads.internal.view.c;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.q.a.v;
/* loaded from: classes2.dex */
public class c extends LinearLayout {
    private d a;
    private TextView b;
    private TextView c;

    public c(Context context) {
        super(context);
        a(context);
    }

    public void a(int i, int i2) {
        this.b.setTextColor(i);
        this.c.setTextColor(i2);
    }

    public void a(Context context) {
        int i = (int) (32.0f * v.b);
        setGravity(16);
        this.a = new d(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, (int) (8.0f * v.b), 0);
        addView(this.a, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.b = new TextView(context);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.b.setTypeface(Typeface.SANS_SERIF, 1);
        this.b.setTextSize(2, 16.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setSingleLine(true);
        this.c = new TextView(context);
        this.c.setTypeface(Typeface.SANS_SERIF, 0);
        this.c.setTextSize(2, 14.0f);
        linearLayout.addView(this.b);
        linearLayout.addView(this.c);
        addView(linearLayout, layoutParams2);
    }

    public void a(String str, String str2, String str3) {
        com.facebook.ads.internal.view.b.d dVar = new com.facebook.ads.internal.view.b.d(this.a);
        dVar.a((int) (v.b * 32.0f), (int) (v.b * 32.0f));
        dVar.a(str2);
        this.b.setText(str);
        this.c.setText(str3);
    }
}
