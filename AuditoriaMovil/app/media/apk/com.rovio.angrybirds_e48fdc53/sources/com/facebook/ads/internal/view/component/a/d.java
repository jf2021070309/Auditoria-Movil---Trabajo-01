package com.facebook.ads.internal.view.component.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.view.a;
/* loaded from: classes2.dex */
public class d extends b {
    private static final int c = Resources.getSystem().getDisplayMetrics().widthPixels;
    private final e d;

    public d(Context context, com.facebook.ads.internal.m.c cVar, a.InterfaceC0118a interfaceC0118a, View view, View view2, View view3, boolean z, j jVar) {
        super(context, cVar, interfaceC0118a, jVar, z);
        this.d = new e(context, view);
        this.d.a(view2, view3, getTextContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(a, a, a, a);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(a, 0, a, 0);
        frameLayout.addView(this.d, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    public void a(String str, String str2, String str3, String str4, String str5, double d) {
        super.a(str, str2, str3, str4, str5, d);
        if (d > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            this.d.a((int) ((c - (a * 2)) * d));
        }
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    public boolean a() {
        return false;
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    protected boolean b() {
        return false;
    }

    @Override // com.facebook.ads.internal.view.component.a.b
    protected boolean c() {
        return false;
    }
}
