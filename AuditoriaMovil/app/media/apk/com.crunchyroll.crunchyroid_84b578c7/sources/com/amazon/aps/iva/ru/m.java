package com.amazon.aps.iva.ru;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hu.c> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar) {
        super(0);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.hu.c invoke() {
        r rVar = this.h;
        b bVar = rVar.a;
        com.amazon.aps.iva.fc0.l<?> lVar = r.s[1];
        h0 g = rVar.g();
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        return new com.amazon.aps.iva.hu.e(bVar, (com.amazon.aps.iva.hu.h) rVar.f.getValue(rVar, lVar), g);
    }
}
