package com.amazon.aps.iva.l1;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlatformHapticFeedback.android.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final View a;

    public b(View view) {
        j.f(view, "view");
        this.a = view;
    }

    @Override // com.amazon.aps.iva.l1.a
    public final void a() {
        this.a.performHapticFeedback(9);
    }
}
