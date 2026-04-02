package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.b.h.i.g;
import c.b.h.i.n;
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // c.b.h.i.n
    public void b(g gVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
