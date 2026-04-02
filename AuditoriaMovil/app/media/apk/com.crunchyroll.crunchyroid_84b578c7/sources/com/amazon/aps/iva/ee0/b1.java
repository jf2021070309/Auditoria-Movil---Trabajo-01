package com.amazon.aps.iva.ee0;

import java.util.ArrayDeque;
/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes4.dex */
public class b1 {
    public final boolean a;
    public final boolean b;
    public final com.amazon.aps.iva.he0.n c;
    public final com.amazon.aps.iva.ab.a d;
    public final com.amazon.aps.iva.ab.a e;
    public int f;
    public ArrayDeque<com.amazon.aps.iva.he0.i> g;
    public com.amazon.aps.iva.me0.d h;

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes4.dex */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: com.amazon.aps.iva.ee0.b1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0221a implements a {
            public boolean a;

            @Override // com.amazon.aps.iva.ee0.b1.a
            public final void a(f fVar) {
                if (this.a) {
                    return;
                }
                this.a = ((Boolean) fVar.invoke()).booleanValue();
            }
        }

        void a(f fVar);
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes4.dex */
    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* loaded from: classes4.dex */
    public static abstract class c {

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes4.dex */
        public static abstract class a extends c {
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes4.dex */
        public static final class b extends c {
            public static final b a = new b();

            @Override // com.amazon.aps.iva.ee0.b1.c
            public final com.amazon.aps.iva.he0.i a(b1 b1Var, com.amazon.aps.iva.he0.h hVar) {
                com.amazon.aps.iva.yb0.j.f(b1Var, "state");
                com.amazon.aps.iva.yb0.j.f(hVar, "type");
                return b1Var.c.b(hVar);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: com.amazon.aps.iva.ee0.b1$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0222c extends c {
            public static final C0222c a = new C0222c();

            @Override // com.amazon.aps.iva.ee0.b1.c
            public final com.amazon.aps.iva.he0.i a(b1 b1Var, com.amazon.aps.iva.he0.h hVar) {
                com.amazon.aps.iva.yb0.j.f(b1Var, "state");
                com.amazon.aps.iva.yb0.j.f(hVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* loaded from: classes4.dex */
        public static final class d extends c {
            public static final d a = new d();

            @Override // com.amazon.aps.iva.ee0.b1.c
            public final com.amazon.aps.iva.he0.i a(b1 b1Var, com.amazon.aps.iva.he0.h hVar) {
                com.amazon.aps.iva.yb0.j.f(b1Var, "state");
                com.amazon.aps.iva.yb0.j.f(hVar, "type");
                return b1Var.c.b0(hVar);
            }
        }

        public abstract com.amazon.aps.iva.he0.i a(b1 b1Var, com.amazon.aps.iva.he0.h hVar);
    }

    public b1(boolean z, boolean z2, com.amazon.aps.iva.he0.n nVar, com.amazon.aps.iva.ab.a aVar, com.amazon.aps.iva.ab.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(nVar, "typeSystemContext");
        com.amazon.aps.iva.yb0.j.f(aVar, "kotlinTypePreparator");
        com.amazon.aps.iva.yb0.j.f(aVar2, "kotlinTypeRefiner");
        this.a = z;
        this.b = z2;
        this.c = nVar;
        this.d = aVar;
        this.e = aVar2;
    }

    public final void a() {
        ArrayDeque<com.amazon.aps.iva.he0.i> arrayDeque = this.g;
        com.amazon.aps.iva.yb0.j.c(arrayDeque);
        arrayDeque.clear();
        com.amazon.aps.iva.me0.d dVar = this.h;
        com.amazon.aps.iva.yb0.j.c(dVar);
        dVar.clear();
    }

    public boolean b(com.amazon.aps.iva.he0.h hVar, com.amazon.aps.iva.he0.h hVar2) {
        com.amazon.aps.iva.yb0.j.f(hVar, "subType");
        com.amazon.aps.iva.yb0.j.f(hVar2, "superType");
        return true;
    }

    public final void c() {
        if (this.g == null) {
            this.g = new ArrayDeque<>(4);
        }
        if (this.h == null) {
            this.h = new com.amazon.aps.iva.me0.d();
        }
    }

    public final com.amazon.aps.iva.he0.h d(com.amazon.aps.iva.he0.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "type");
        return this.d.m(hVar);
    }
}
