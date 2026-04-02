package com.kwad.components.ad.interstitial.aggregate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class TransViewPager extends com.kwad.sdk.widget.d {
    private float iu;
    private int iv;
    private Map<Integer, com.kwad.components.ad.interstitial.f.c> map;

    public TransViewPager(Context context) {
        this(context, null);
    }

    public TransViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.map = new HashMap();
        this.iv = 0;
    }

    private void a(View view, View view2, float f) {
        if (this.iv == 0 && f != 0.0f) {
            float f2 = this.iu;
            if (f2 != 0.0f) {
                if (f > f2) {
                    this.iv = 1;
                } else {
                    this.iv = 2;
                }
            }
        }
        if (this.iv == 1 && view2 != null) {
            if (f > 0.5d || f <= 0.0f) {
                view2.setTranslationX((1.0f - f) * 240.0f);
            } else {
                view2.setTranslationX(240.0f * f);
            }
        }
        if (this.iv == 2 && view != null) {
            if (f > 0.5d || f < 0.0f) {
                view.setTranslationX((1.0f - f) * (-240.0f));
            } else {
                view.setTranslationX((-240.0f) * f);
            }
        }
        this.iu = f;
        if (f == 0.0f) {
            this.iv = 0;
        }
    }

    public final void a(int i, com.kwad.components.ad.interstitial.f.c cVar) {
        this.map.put(Integer.valueOf(i), cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.view.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        a(x(i), x(i + 1), f);
        super.onPageScrolled(i, f, i2);
    }

    public final com.kwad.components.ad.interstitial.f.c x(int i) {
        return this.map.get(Integer.valueOf(i));
    }
}
