package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes2.dex */
public class x extends View {
    private w a;

    public x(Context context, w wVar) {
        super(context);
        this.a = wVar;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }
}
