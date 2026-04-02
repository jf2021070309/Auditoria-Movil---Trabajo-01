package com.amazon.aps.iva.sf;

import android.content.Context;
import android.util.AttributeSet;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BaseContentRatingLayout.kt */
/* loaded from: classes.dex */
public abstract class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
    }

    public abstract void b1(e eVar);

    public abstract void setVisibilityChangeListener(h hVar);
}
