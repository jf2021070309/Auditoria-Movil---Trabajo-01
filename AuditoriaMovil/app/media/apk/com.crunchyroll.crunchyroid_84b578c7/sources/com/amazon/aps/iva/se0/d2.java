package com.amazon.aps.iva.se0;
/* compiled from: Supervisor.kt */
/* loaded from: classes4.dex */
public final class d2 extends com.amazon.aps.iva.xe0.p {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.ob0.d dVar, int i) {
        super(dVar, gVar);
        this.e = i;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final boolean Q(Throwable th) {
        switch (this.e) {
            case 0:
                return false;
            default:
                if (th instanceof com.amazon.aps.iva.we0.j) {
                    return true;
                }
                return D(th);
        }
    }
}
