package com.amazon.aps.iva.g8;

import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.ne0.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
/* compiled from: Navigator.kt */
/* loaded from: classes.dex */
public abstract class r0<D extends g0> {
    public u0 a;
    public boolean b;

    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: Navigator.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    /* compiled from: Navigator.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<f, f> {
        public final /* synthetic */ r0<D> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0<D> r0Var, o0 o0Var, a aVar) {
            super(1);
            this.h = r0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final f invoke(f fVar) {
            f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "backStackEntry");
            g0 g0Var = fVar2.c;
            if (!(g0Var instanceof g0)) {
                g0Var = null;
            }
            if (g0Var == null) {
                return null;
            }
            fVar2.g();
            r0<D> r0Var = this.h;
            g0 c = r0Var.c(g0Var);
            if (c == null) {
                fVar2 = null;
            } else if (!com.amazon.aps.iva.yb0.j.a(c, g0Var)) {
                fVar2 = r0Var.b().a(c, c.d(fVar2.g()));
            }
            return fVar2;
        }
    }

    public abstract D a();

    public final u0 b() {
        u0 u0Var = this.a;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void d(List<f> list, o0 o0Var, a aVar) {
        e.a aVar2 = new e.a(com.amazon.aps.iva.ne0.s.W(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.lb0.x.k0(list), new c(this, o0Var, aVar)), com.amazon.aps.iva.ne0.q.h));
        while (aVar2.hasNext()) {
            b().e((f) aVar2.next());
        }
    }

    public void e(f fVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(fVar, "popUpTo");
        List list = (List) b().e.getValue();
        if (list.contains(fVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            f fVar2 = null;
            while (f()) {
                fVar2 = (f) listIterator.previous();
                if (com.amazon.aps.iva.yb0.j.a(fVar2, fVar)) {
                    break;
                }
            }
            if (fVar2 != null) {
                b().c(fVar2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + fVar + " which does not exist in back stack " + list).toString());
    }

    public boolean f() {
        return true;
    }

    public g0 c(g0 g0Var) {
        return g0Var;
    }
}
