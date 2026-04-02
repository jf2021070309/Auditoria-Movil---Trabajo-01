package com.amazon.aps.iva.ke0;
/* compiled from: modifierChecks.kt */
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static String a(f fVar, com.amazon.aps.iva.oc0.v vVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "functionDescriptor");
            if (!fVar.b(vVar)) {
                return fVar.getDescription();
            }
            return null;
        }
    }

    String a(com.amazon.aps.iva.oc0.v vVar);

    boolean b(com.amazon.aps.iva.oc0.v vVar);

    String getDescription();
}
