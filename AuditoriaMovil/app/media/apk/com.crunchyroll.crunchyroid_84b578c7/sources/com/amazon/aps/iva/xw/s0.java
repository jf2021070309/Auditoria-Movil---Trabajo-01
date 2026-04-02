package com.amazon.aps.iva.xw;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s0 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ ViewGroup a;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        ViewGroup viewGroup = this.a;
        com.amazon.aps.iva.yb0.j.f(viewGroup, "$viewGroup");
        com.amazon.aps.iva.yb0.j.f(view, "<anonymous parameter 0>");
        com.amazon.aps.iva.yb0.j.f(windowInsets, "insets");
        Iterator<View> it = w0.a(viewGroup).iterator();
        boolean z = false;
        while (true) {
            u0 u0Var = (u0) it;
            if (!u0Var.hasNext()) {
                break;
            } else if (((View) u0Var.next()).dispatchApplyWindowInsets(windowInsets).isConsumed()) {
                z = true;
            }
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsets2 = WindowInsets.CONSUMED;
                return windowInsets2;
            }
            return windowInsets.consumeSystemWindowInsets();
        }
        return windowInsets;
    }
}
