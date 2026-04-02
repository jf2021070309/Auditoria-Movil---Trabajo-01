package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import com.amazon.aps.iva.q3.l;
/* loaded from: classes3.dex */
class ClickActionDelegate extends com.amazon.aps.iva.p3.a {
    private final l.a clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new l.a(16, context.getString(i));
    }

    @Override // com.amazon.aps.iva.p3.a
    public void onInitializeAccessibilityNodeInfo(View view, l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        lVar.b(this.clickAction);
    }
}
