package com.applovin.impl.adview.activity.a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.m;
/* loaded from: classes.dex */
public abstract class a {
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f3155b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3156c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f3157d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout.LayoutParams f3158e;

    public a(e eVar, Activity activity, m mVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f3158e = layoutParams;
        this.f3156c = eVar;
        this.a = mVar;
        this.f3155b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f3157d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(e.c cVar, int i2, com.applovin.impl.adview.m mVar) {
        mVar.a(cVar.a, cVar.f3879e, cVar.f3878d, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        int i3 = cVar.f3877c;
        layoutParams.setMargins(i3, cVar.f3876b, i3, 0);
        layoutParams.gravity = i2;
        this.f3157d.addView(mVar, layoutParams);
    }
}
