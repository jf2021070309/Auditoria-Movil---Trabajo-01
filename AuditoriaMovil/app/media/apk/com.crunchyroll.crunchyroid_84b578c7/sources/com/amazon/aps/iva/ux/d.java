package com.amazon.aps.iva.ux;

import android.content.Context;
import com.amazon.aps.iva.cg.v;
import com.amazon.aps.iva.cg.x;
import com.amazon.aps.iva.sd.g;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WidgetsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class d implements g, x {
    public final /* synthetic */ x b;

    public d(v vVar) {
        this.b = vVar.a;
    }

    @Override // com.amazon.aps.iva.sd.g, com.amazon.aps.iva.cg.x
    public final void a(Context context) {
        this.b.a(context);
    }

    @Override // com.amazon.aps.iva.sd.g, com.amazon.aps.iva.cg.x
    public final void b(Context context, String str) {
        j.f(str, "contentId");
        this.b.b(context, str);
    }

    @Override // com.amazon.aps.iva.sd.g, com.amazon.aps.iva.cg.x
    public final void c(Context context) {
        this.b.c(context);
    }
}
