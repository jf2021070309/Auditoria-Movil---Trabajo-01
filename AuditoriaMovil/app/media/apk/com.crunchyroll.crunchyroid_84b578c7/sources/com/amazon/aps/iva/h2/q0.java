package com.amazon.aps.iva.h2;

import com.amazon.aps.iva.o0.p3;
/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public interface q0 extends p3<Object> {

    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    public static final class a implements q0, p3<Object> {
        public final e b;

        public a(e eVar) {
            this.b = eVar;
        }

        @Override // com.amazon.aps.iva.h2.q0
        public final boolean c() {
            return this.b.h;
        }

        @Override // com.amazon.aps.iva.o0.p3
        public final Object getValue() {
            return this.b.getValue();
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    public static final class b implements q0 {
        public final Object b;
        public final boolean c;

        public b(Object obj, boolean z) {
            com.amazon.aps.iva.yb0.j.f(obj, "value");
            this.b = obj;
            this.c = z;
        }

        @Override // com.amazon.aps.iva.h2.q0
        public final boolean c() {
            return this.c;
        }

        @Override // com.amazon.aps.iva.o0.p3
        public final Object getValue() {
            return this.b;
        }
    }

    boolean c();
}
