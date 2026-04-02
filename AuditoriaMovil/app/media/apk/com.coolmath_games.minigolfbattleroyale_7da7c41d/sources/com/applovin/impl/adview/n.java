package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.j;
/* loaded from: classes.dex */
public class n extends FrameLayout {
    private final j a;

    public n(j.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        j a = j.a(aVar, activity);
        this.a = a;
        addView(a);
    }

    public void a(int i, int i2, int i3, int i4) {
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.a.setLayoutParams(layoutParams2);
        this.a.a(i);
    }
}
