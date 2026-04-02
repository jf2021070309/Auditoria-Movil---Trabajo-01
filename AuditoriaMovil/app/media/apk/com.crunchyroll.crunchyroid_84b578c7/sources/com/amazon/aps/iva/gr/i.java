package com.amazon.aps.iva.gr;

import android.app.Fragment;
import com.amazon.aps.iva.lb0.a0;
import java.util.Map;
/* compiled from: FragmentViewTrackingStrategy.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Fragment, Map<String, ? extends Object>> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Map<String, ? extends Object> invoke(Fragment fragment) {
        Fragment fragment2 = fragment;
        com.amazon.aps.iva.yb0.j.f(fragment2, "it");
        if (this.h.b) {
            return d.c(fragment2.getArguments());
        }
        return a0.b;
    }
}
