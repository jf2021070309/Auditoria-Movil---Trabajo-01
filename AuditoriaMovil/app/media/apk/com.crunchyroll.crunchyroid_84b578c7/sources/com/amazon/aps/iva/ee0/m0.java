package com.amazon.aps.iva.ee0;
/* compiled from: KotlinType.kt */
/* loaded from: classes4.dex */
public abstract class m0 extends u1 implements com.amazon.aps.iva.he0.i, com.amazon.aps.iva.he0.j {
    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: P0 */
    public abstract m0 M0(boolean z);

    @Override // com.amazon.aps.iva.ee0.u1
    /* renamed from: Q0 */
    public abstract m0 O0(a1 a1Var);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (com.amazon.aps.iva.pc0.c cVar : getAnnotations()) {
            String[] strArr = {"[", com.amazon.aps.iva.pd0.c.c.p(cVar, null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(I0());
        if (!G0().isEmpty()) {
            com.amazon.aps.iva.lb0.x.A0(G0(), sb, ", ", "<", ">", null, 112);
        }
        if (J0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
