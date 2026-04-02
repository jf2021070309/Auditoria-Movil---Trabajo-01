package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.view.p;
import com.facebook.ads.internal.view.s;
/* loaded from: classes2.dex */
public class c extends LinearLayout {
    private ImageView a;
    private b b;
    private TextView c;
    private LinearLayout d;

    public c(Context context, com.facebook.ads.internal.n.e eVar, com.facebook.ads.internal.n.h hVar, boolean z, int i) {
        super(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        setVerticalGravity(16);
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(Math.round(15.0f * displayMetrics.density), Math.round(15.0f * displayMetrics.density), Math.round(15.0f * displayMetrics.density), Math.round(15.0f * displayMetrics.density));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        this.d = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        this.d.setOrientation(0);
        this.d.setGravity(16);
        layoutParams2.weight = 3.0f;
        this.d.setLayoutParams(layoutParams2);
        linearLayout.addView(this.d);
        this.a = new g(getContext());
        int a = a(z, i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(Math.round(a * displayMetrics.density), Math.round(a * displayMetrics.density));
        layoutParams3.setMargins(0, 0, Math.round(15.0f * displayMetrics.density), 0);
        this.a.setLayoutParams(layoutParams3);
        com.facebook.ads.internal.n.e.a(eVar.i(), this.a);
        this.d.addView(this.a);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.d.addView(linearLayout2);
        this.b = new b(getContext(), eVar, hVar);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.setMargins(0, 0, Math.round(15.0f * displayMetrics.density), 0);
        layoutParams4.weight = 0.5f;
        this.b.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.b);
        this.c = new TextView(getContext());
        this.c.setPadding(Math.round(6.0f * displayMetrics.density), Math.round(6.0f * displayMetrics.density), Math.round(6.0f * displayMetrics.density), Math.round(6.0f * displayMetrics.density));
        this.c.setText(eVar.p());
        this.c.setTextColor(hVar.f());
        this.c.setTextSize(14.0f);
        this.c.setTypeface(hVar.a(), 1);
        this.c.setMaxLines(2);
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        this.c.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(hVar.e());
        gradientDrawable.setCornerRadius(displayMetrics.density * 5.0f);
        gradientDrawable.setStroke(1, hVar.g());
        this.c.setBackgroundDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.weight = 0.25f;
        this.c.setLayoutParams(layoutParams5);
        if (!eVar.h()) {
            this.c.setVisibility(4);
        }
        linearLayout2.addView(this.c);
        if (z) {
            s sVar = new s(getContext());
            sVar.setText(eVar.n());
            p.b(sVar, hVar);
            sVar.setMinTextSize(hVar.i() - 1);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams6.weight = 1.0f;
            sVar.setLayoutParams(layoutParams6);
            sVar.setGravity(80);
            linearLayout.addView(sVar);
        }
    }

    private int a(boolean z, int i) {
        return (int) ((i - 30) * (3.0d / ((z ? 1 : 0) + 3)));
    }

    public TextView getCallToActionView() {
        return this.c;
    }

    public ImageView getIconView() {
        return this.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView titleTextView = this.b.getTitleTextView();
        if (titleTextView.getLayout().getLineEnd(titleTextView.getLineCount() - 1) < this.b.getMinVisibleTitleCharacters()) {
            this.d.removeView(this.a);
            super.onMeasure(i, i2);
        }
    }
}
