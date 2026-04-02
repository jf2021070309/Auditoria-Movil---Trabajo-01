package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.i;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class m extends FrameLayout {
    private i a;

    /* renamed from: b  reason: collision with root package name */
    private int f3237b;

    public m(i.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        i a = i.a(aVar, activity);
        this.a = a;
        addView(a);
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f3237b = i2;
        int i6 = i3 + i2 + i4;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i6;
            layoutParams.width = i6;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i6, i6));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2, i5);
        layoutParams2.setMargins(i4, i4, i4, 0);
        this.a.setLayoutParams(layoutParams2);
        this.a.a(i2);
    }

    public void a(i.a aVar) {
        if (aVar == null || aVar == this.a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        removeView(this.a);
        i a = i.a(aVar, getContext());
        this.a = a;
        addView(a);
        this.a.setLayoutParams(layoutParams);
        this.a.a(this.f3237b);
    }
}
