package com.amazon.aps.iva.oc0;
/* compiled from: Visibility.kt */
/* loaded from: classes4.dex */
public abstract class g1 {
    public final String a;
    public final boolean b;

    public g1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public Integer a(g1 g1Var) {
        com.amazon.aps.iva.yb0.j.f(g1Var, "visibility");
        com.amazon.aps.iva.mb0.b bVar = f1.a;
        if (this == g1Var) {
            return 0;
        }
        com.amazon.aps.iva.mb0.b bVar2 = f1.a;
        Integer num = (Integer) bVar2.get(this);
        Integer num2 = (Integer) bVar2.get(g1Var);
        if (num != null && num2 != null && !com.amazon.aps.iva.yb0.j.a(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public String b() {
        return this.a;
    }

    public final String toString() {
        return b();
    }

    public g1 c() {
        return this;
    }
}
