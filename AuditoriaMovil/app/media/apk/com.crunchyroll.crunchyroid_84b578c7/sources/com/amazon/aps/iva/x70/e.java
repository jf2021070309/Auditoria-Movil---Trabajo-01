package com.amazon.aps.iva.x70;

import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: UnbreakableTextViewHolder.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final View a;
    public final Object b;

    public e(View view) {
        j.f(view, "view");
        this.a = view;
        this.b = view.getTag();
    }

    @Override // com.amazon.aps.iva.x70.d
    public final int a() {
        View view = this.a;
        j.d(view, "null cannot be cast to non-null type android.widget.TextView");
        return ((TextView) view).getLineCount();
    }

    @Override // com.amazon.aps.iva.x70.d
    public final void b(int i) {
        t0.h(this.a, null, null, null, Integer.valueOf(i), 7);
    }

    @Override // com.amazon.aps.iva.x70.d
    public final Object getTag() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.x70.d
    public final void hide() {
        this.a.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.x70.d
    public final void show() {
        this.a.setVisibility(0);
    }
}
