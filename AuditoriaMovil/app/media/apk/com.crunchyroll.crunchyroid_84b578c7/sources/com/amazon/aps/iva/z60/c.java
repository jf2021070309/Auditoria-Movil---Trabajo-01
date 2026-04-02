package com.amazon.aps.iva.z60;

import android.content.Context;
import androidx.recyclerview.widget.u;
/* compiled from: ScrollToggleRecyclerView.kt */
/* loaded from: classes2.dex */
public final class c extends u {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, Context context) {
        super(context);
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.u
    public final int getHorizontalSnapPreference() {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.u
    public final int getVerticalSnapPreference() {
        return this.a;
    }
}
