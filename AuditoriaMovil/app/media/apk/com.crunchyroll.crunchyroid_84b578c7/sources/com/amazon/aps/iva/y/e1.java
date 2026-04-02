package com.amazon.aps.iva.y;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class e1 implements d1 {
    public final boolean a;
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.o2.j, com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(boolean z, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o2.j, ? super com.amazon.aps.iva.o2.j, ? extends com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j>> pVar) {
        this.a = z;
        this.b = pVar;
    }

    @Override // com.amazon.aps.iva.y.d1
    public final boolean a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.y.d1
    public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j> b(long j, long j2) {
        return this.b.invoke(new com.amazon.aps.iva.o2.j(j), new com.amazon.aps.iva.o2.j(j2));
    }
}
