package com.facebook.ads.internal.view.d;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.component.i;
import com.facebook.ads.internal.view.e.b.z;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class a extends LinearLayout {
    private static final int a = (int) (12.0f * v.b);
    private static final int b = (int) (16.0f * v.b);
    private final i c;
    private final ImageView d;
    private final RelativeLayout e;
    private final com.facebook.ads.internal.view.component.a f;
    private final int g;

    public a(Context context, int i, j jVar, com.facebook.ads.internal.m.c cVar, a.InterfaceC0118a interfaceC0118a, boolean z, boolean z2) {
        super(context);
        this.g = i;
        this.d = new com.facebook.ads.internal.view.component.e(context);
        v.a(this.d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.setMargins(0, 0, a, 0);
        if (z2) {
            this.d.setVisibility(8);
        }
        this.c = new i(context, jVar, true, z, true);
        this.c.setAlignment(8388611);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.d.getId());
        layoutParams2.addRule(15);
        this.f = new com.facebook.ads.internal.view.component.a(context, true, false, z.REWARDED_VIDEO_AD_CLICK.a(), jVar, cVar, interfaceC0118a);
        this.f.setVisibility(8);
        this.e = new RelativeLayout(context);
        v.a(this.e);
        this.e.addView(this.d, layoutParams);
        this.e.addView(this.c, layoutParams2);
        addView(this.e, new LinearLayout.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -15658735});
        gradientDrawable.setCornerRadius(0.0f);
        v.a(this, gradientDrawable);
    }

    public void a() {
        this.f.setVisibility(0);
    }

    public void a(int i) {
        v.b(this.f);
        boolean z = i == 1;
        setOrientation(z ? 1 : 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z ? -1 : 0, -2);
        layoutParams.weight = 1.0f;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(z ? -1 : -2, -2);
        layoutParams2.setMargins(z ? 0 : b, z ? b : 0, 0, 0);
        layoutParams2.gravity = 80;
        this.e.setLayoutParams(layoutParams);
        addView(this.f, layoutParams2);
    }

    public void setInfo(ad adVar) {
        this.c.a(adVar.f(), adVar.g(), false, false);
        this.f.a(adVar.q(), adVar.p(), adVar.b(), new HashMap());
        if (TextUtils.isEmpty(adVar.i())) {
            return;
        }
        new com.facebook.ads.internal.view.b.d(this.d).a(this.g, this.g).a(adVar.i());
    }
}
