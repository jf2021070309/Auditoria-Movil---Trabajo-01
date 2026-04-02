package com.amazon.aps.iva.y;
/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.l, Integer> {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i) {
        super(1);
        this.h = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Integer invoke(com.amazon.aps.iva.s1.l lVar) {
        com.amazon.aps.iva.s1.l lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "it");
        return Integer.valueOf(lVar2.P(this.h));
    }
}
