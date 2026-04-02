package com.amazon.aps.iva.wy;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.lb0.b0;
import java.util.Set;
/* compiled from: BasePresenterView.kt */
/* loaded from: classes2.dex */
public abstract class g extends FrameLayout implements com.amazon.aps.iva.cz.b, o {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 6, null);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        o a = i0.a(this);
        com.amazon.aps.iva.yb0.j.c(a);
        return a.getLifecycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (k kVar : setupPresenters()) {
            com.ellation.crunchyroll.mvp.lifecycle.a.b(kVar, this);
        }
    }

    public Set<k> setupPresenters() {
        return b0.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }
}
