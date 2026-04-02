package com.amazon.aps.iva.ru;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.mu.a> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar) {
        super(0);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.mu.a invoke() {
        r rVar = this.h;
        b bVar = rVar.a;
        com.amazon.aps.iva.fc0.l<?> lVar = r.s[4];
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        com.amazon.aps.iva.iu.a aVar = rVar.j;
        com.amazon.aps.iva.yb0.j.f(aVar, "accountPendingStateRouter");
        return new com.amazon.aps.iva.mu.b(bVar, (com.amazon.aps.iva.mu.h) rVar.i.getValue(rVar, lVar), aVar);
    }
}
