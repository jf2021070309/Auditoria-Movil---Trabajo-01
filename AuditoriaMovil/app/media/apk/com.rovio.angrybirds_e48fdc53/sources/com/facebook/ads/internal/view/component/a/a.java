package com.facebook.ads.internal.view.component.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.a;
/* loaded from: classes2.dex */
public class a extends b {
    public a(Context context, com.facebook.ads.internal.m.c cVar, a.InterfaceC0118a interfaceC0118a, View view, View view2, View view3, int i, j jVar, boolean z) {
        super(context, cVar, interfaceC0118a, jVar, true);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setGradientType(0);
        v.a(relativeLayout, gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(z ? 0 : 1);
        linearLayout.setGravity(80);
        v.a(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(a, 0, a, view2 == null ? a : a / 2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? a : 0, z ? 0 : a, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTextContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        if (view2 != null) {
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(0, 0, 0, 0);
            layoutParams5.addRule(3, linearLayout.getId());
            relativeLayout.addView(view2, layoutParams5);
        }
        addView(view, new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
        if (view3 != null) {
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(b, b);
            layoutParams6.addRule(10);
            layoutParams6.addRule(11);
            layoutParams6.setMargins(a, a + i, a, a);
            addView(view3, layoutParams6);
        }
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    public boolean a() {
        return true;
    }
}
