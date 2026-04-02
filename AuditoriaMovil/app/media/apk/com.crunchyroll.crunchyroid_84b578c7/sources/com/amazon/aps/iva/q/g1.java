package com.amazon.aps.iva.q;

import android.view.View;
import android.view.Window;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class g1 implements View.OnClickListener {
    public final com.amazon.aps.iva.p.a b;
    public final /* synthetic */ androidx.appcompat.widget.c c;

    public g1(androidx.appcompat.widget.c cVar) {
        this.c = cVar;
        this.b = new com.amazon.aps.iva.p.a(cVar.a.getContext(), cVar.i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.c cVar = this.c;
        Window.Callback callback = cVar.l;
        if (callback != null && cVar.m) {
            callback.onMenuItemSelected(0, this.b);
        }
    }
}
