package com.amazon.aps.iva.se0;
/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes4.dex */
public abstract class t1 extends d0 {
    public abstract t1 C();

    @Override // com.amazon.aps.iva.se0.d0
    public String toString() {
        t1 t1Var;
        String str;
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        t1 t1Var2 = com.amazon.aps.iva.xe0.k.a;
        if (this == t1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                t1Var = t1Var2.C();
            } catch (UnsupportedOperationException unused) {
                t1Var = null;
            }
            if (this == t1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + j0.e(this);
        }
        return str;
    }
}
