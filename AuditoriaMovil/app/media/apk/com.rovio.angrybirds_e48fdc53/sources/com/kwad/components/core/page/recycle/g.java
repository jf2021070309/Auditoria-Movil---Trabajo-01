package com.kwad.components.core.page.recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class g extends RecyclerView {
    private boolean Op;

    public g(Context context) {
        super(context);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        boolean z2 = this.Op;
        super.removeDetachedView(view, z);
    }

    public void setIngoreTmpDetachedFlag(boolean z) {
        this.Op = z;
    }
}
