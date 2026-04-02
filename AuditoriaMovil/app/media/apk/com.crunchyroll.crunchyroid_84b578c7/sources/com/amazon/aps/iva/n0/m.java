package com.amazon.aps.iva.n0;

import android.content.Context;
import android.view.ViewGroup;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
/* compiled from: RippleContainer.android.kt */
/* loaded from: classes.dex */
public final class m extends ViewGroup {
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final n e;
    public int f;

    public m(Context context) {
        super(context);
        this.b = 5;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        this.e = new n(0);
        setClipChildren(false);
        o oVar = new o(context);
        addView(oVar);
        arrayList.add(oVar);
        arrayList2.add(oVar);
        this.f = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
