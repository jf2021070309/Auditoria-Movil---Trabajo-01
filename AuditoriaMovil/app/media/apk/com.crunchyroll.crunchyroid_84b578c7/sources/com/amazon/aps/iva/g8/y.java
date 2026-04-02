package com.amazon.aps.iva.g8;
/* compiled from: NavDeepLink.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u uVar) {
        super(0);
        this.h = uVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) this.h.j.getValue();
        if (jVar != null) {
            return (String) jVar.c;
        }
        return null;
    }
}
