package com.amazon.aps.iva.b40;

import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.iva.xb0.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ l b;
    public final /* synthetic */ b c;

    public /* synthetic */ a(l lVar, b bVar) {
        this.b = lVar;
        this.c = bVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l lVar = this.b;
        com.amazon.aps.iva.yb0.j.f(lVar, "$listener");
        b bVar = this.c;
        com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
        lVar.invoke(Boolean.valueOf(!bVar.b.isChecked()));
        return false;
    }
}
