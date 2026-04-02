package com.amazon.aps.iva.ne0;

import com.amazon.aps.iva.e4.l1;
import java.util.Iterator;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Sequences.kt */
/* loaded from: classes4.dex */
public class k extends l1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements h<T> {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // com.amazon.aps.iva.ne0.h
        public final Iterator<T> iterator() {
            return this.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<T> {
        public final /* synthetic */ T h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t) {
            super(0);
            this.h = t;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final T invoke() {
            return this.h;
        }
    }

    public static final <T> h<T> O(Iterator<? extends T> it) {
        com.amazon.aps.iva.yb0.j.f(it, "<this>");
        return P(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> P(h<? extends T> hVar) {
        if (!(hVar instanceof com.amazon.aps.iva.ne0.a)) {
            return new com.amazon.aps.iva.ne0.a(hVar);
        }
        return hVar;
    }

    public static final f Q(h hVar) {
        boolean z = hVar instanceof u;
        l lVar = l.h;
        if (z) {
            u uVar = (u) hVar;
            com.amazon.aps.iva.yb0.j.f(lVar, "iterator");
            return new f(uVar.a, uVar.b, lVar);
        }
        return new f(hVar, m.h, lVar);
    }

    public static final <T> h<T> R(T t, com.amazon.aps.iva.xb0.l<? super T, ? extends T> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "nextFunction");
        if (t == null) {
            return d.a;
        }
        return new g(new b(t), lVar);
    }

    public static final <T> h<T> S(T... tArr) {
        boolean z;
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return d.a;
        }
        return com.amazon.aps.iva.lb0.o.M(tArr);
    }
}
