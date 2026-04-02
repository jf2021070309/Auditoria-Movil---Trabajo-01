package com.amazon.aps.iva.g8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: NavigatorState.kt */
/* loaded from: classes.dex */
public abstract class u0 {
    public final ReentrantLock a = new ReentrantLock(true);
    public final com.amazon.aps.iva.ve0.v0 b;
    public final com.amazon.aps.iva.ve0.v0 c;
    public boolean d;
    public final com.amazon.aps.iva.ve0.i0 e;
    public final com.amazon.aps.iva.ve0.i0 f;

    public u0() {
        com.amazon.aps.iva.ve0.v0 e = com.amazon.aps.iva.ab.x.e(com.amazon.aps.iva.lb0.z.b);
        this.b = e;
        com.amazon.aps.iva.ve0.v0 e2 = com.amazon.aps.iva.ab.x.e(com.amazon.aps.iva.lb0.b0.b);
        this.c = e2;
        this.e = com.amazon.aps.iva.dg.b.h(e);
        this.f = com.amazon.aps.iva.dg.b.h(e2);
    }

    public abstract f a(g0 g0Var, Bundle bundle);

    public void b(f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "entry");
        com.amazon.aps.iva.ve0.v0 v0Var = this.c;
        v0Var.setValue(com.amazon.aps.iva.lb0.m0.O((Set) v0Var.getValue(), fVar));
    }

    public void c(f fVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(fVar, "popUpTo");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            com.amazon.aps.iva.ve0.v0 v0Var = this.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) v0Var.getValue()) {
                if (!(!com.amazon.aps.iva.yb0.j.a((f) obj, fVar))) {
                    break;
                }
                arrayList.add(obj);
            }
            v0Var.setValue(arrayList);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(f fVar, boolean z) {
        boolean z2;
        boolean z3;
        Object obj;
        boolean z4;
        boolean z5;
        boolean z6;
        com.amazon.aps.iva.yb0.j.f(fVar, "popUpTo");
        com.amazon.aps.iva.ve0.v0 v0Var = this.c;
        Iterable<f> iterable = (Iterable) v0Var.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (f fVar2 : iterable) {
                if (fVar2 == fVar) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        com.amazon.aps.iva.ve0.i0 i0Var = this.e;
        if (z3) {
            Iterable<f> iterable2 = (Iterable) i0Var.getValue();
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (f fVar3 : iterable2) {
                    if (fVar3 == fVar) {
                        z5 = true;
                        continue;
                    } else {
                        z5 = false;
                        continue;
                    }
                    if (z5) {
                        z6 = false;
                        break;
                    }
                }
            }
            z6 = true;
            if (z6) {
                return;
            }
        }
        v0Var.setValue(com.amazon.aps.iva.lb0.m0.R((Set) v0Var.getValue(), fVar));
        List list = (List) i0Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                f fVar4 = (f) obj;
                if (!com.amazon.aps.iva.yb0.j.a(fVar4, fVar) && ((List) i0Var.getValue()).lastIndexOf(fVar4) < ((List) i0Var.getValue()).lastIndexOf(fVar)) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        f fVar5 = (f) obj;
        if (fVar5 != null) {
            v0Var.setValue(com.amazon.aps.iva.lb0.m0.R((Set) v0Var.getValue(), fVar5));
        }
        c(fVar, z);
    }

    public void e(f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            com.amazon.aps.iva.ve0.v0 v0Var = this.b;
            v0Var.setValue(com.amazon.aps.iva.lb0.x.M0((Collection) v0Var.getValue(), fVar));
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
