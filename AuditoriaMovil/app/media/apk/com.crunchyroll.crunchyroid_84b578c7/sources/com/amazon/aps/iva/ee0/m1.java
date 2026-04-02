package com.amazon.aps.iva.ee0;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes4.dex */
public abstract class m1 {
    public static final a a = new a();

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes4.dex */
    public static final class a extends m1 {
        @Override // com.amazon.aps.iva.ee0.m1
        public final j1 d(e0 e0Var) {
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public com.amazon.aps.iva.pc0.h c(com.amazon.aps.iva.pc0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        return hVar;
    }

    public abstract j1 d(e0 e0Var);

    public boolean e() {
        return this instanceof a;
    }

    public e0 f(e0 e0Var, v1 v1Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "topLevelType");
        com.amazon.aps.iva.yb0.j.f(v1Var, "position");
        return e0Var;
    }
}
