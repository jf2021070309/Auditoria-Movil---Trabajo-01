package com.amazon.aps.iva.r4;
/* compiled from: GlanceAppWidget.kt */
/* loaded from: classes.dex */
public final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, Comparable<?>> {
    public static final f0 h = new f0();

    public f0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Comparable<?> invoke(com.amazon.aps.iva.o2.g gVar) {
        long j = gVar.a;
        return Float.valueOf(com.amazon.aps.iva.o2.g.b(j) * com.amazon.aps.iva.o2.g.c(j));
    }
}
