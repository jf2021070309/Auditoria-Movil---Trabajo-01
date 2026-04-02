package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.xb0.p;
/* compiled from: Saver.kt */
/* loaded from: classes.dex */
public final class m {
    public static final n a = a(a.h, b.h);

    /* compiled from: Saver.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<o, Object, Object> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(o oVar, Object obj) {
            com.amazon.aps.iva.yb0.j.f(oVar, "$this$Saver");
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, Object> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "it");
            return obj;
        }
    }

    public static final n a(p pVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "save");
        com.amazon.aps.iva.yb0.j.f(lVar, "restore");
        return new n(pVar, lVar);
    }
}
