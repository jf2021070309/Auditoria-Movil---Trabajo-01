package com.amazon.aps.iva.sx;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchScreenDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<Context, a> {
    public static final b h = new b();

    public b() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final a invoke(Context context) {
        Context context2 = context;
        j.f(context2, "it");
        return new a(context2);
    }
}
