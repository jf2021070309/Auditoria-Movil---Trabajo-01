package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.w0;
import java.util.Map;
/* compiled from: SelectionRegistrar.kt */
/* loaded from: classes.dex */
public final class v {
    public static final w0 a = com.amazon.aps.iva.o0.l0.b(a.h);

    /* compiled from: SelectionRegistrar.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<u> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ u invoke() {
            return null;
        }
    }

    public static final boolean a(u uVar, long j) {
        Map<Long, j> b;
        if (uVar != null && (b = uVar.b()) != null) {
            return b.containsKey(Long.valueOf(j));
        }
        return false;
    }
}
