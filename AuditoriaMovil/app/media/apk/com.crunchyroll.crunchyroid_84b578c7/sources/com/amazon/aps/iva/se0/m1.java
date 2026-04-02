package com.amazon.aps.iva.se0;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public class m1 extends o1 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j1 j1Var) {
        super(true);
        r rVar;
        r rVar2;
        boolean z = true;
        e0(j1Var);
        q a0 = a0();
        if (a0 instanceof r) {
            rVar = (r) a0;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            o1 r = rVar.r();
            while (!r.X()) {
                q a02 = r.a0();
                if (a02 instanceof r) {
                    rVar2 = (r) a02;
                } else {
                    rVar2 = null;
                }
                if (rVar2 != null) {
                    r = rVar2.r();
                }
            }
            this.c = z;
        }
        z = false;
        this.c = z;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final boolean X() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final boolean Y() {
        return true;
    }
}
