package com.amazon.aps.iva.hf;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.yb0.j;
/* compiled from: BaseCommentsEntryPoint.kt */
/* loaded from: classes.dex */
public abstract class b extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
    }

    public abstract void b1(FragmentManager fragmentManager, String str);
}
