package com.amazon.aps.iva.o6;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.r0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: BaseMediaSource.java */
/* loaded from: classes.dex */
public abstract class a implements v {
    public final ArrayList<v.c> a = new ArrayList<>(1);
    public final HashSet<v.c> b = new HashSet<>(1);
    public final z.a c = new z.a();
    public final e.a d = new e.a();
    public Looper e;
    public r0 f;
    public p1 g;

    @Override // com.amazon.aps.iva.o6.v
    public final void a(Handler handler, com.amazon.aps.iva.g6.e eVar) {
        this.d.a(handler, eVar);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void d(v.c cVar, com.amazon.aps.iva.w5.y yVar, p1 p1Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.g = p1Var;
        r0 r0Var = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(cVar);
            r(yVar);
        } else if (r0Var != null) {
            m(cVar);
            cVar.b(this, r0Var);
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void e(v.c cVar) {
        HashSet<v.c> hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(cVar);
        if (z && hashSet.isEmpty()) {
            p();
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void f(z zVar) {
        CopyOnWriteArrayList<z.a.C0556a> copyOnWriteArrayList = this.c.c;
        Iterator<z.a.C0556a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            z.a.C0556a next = it.next();
            if (next.b == zVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void g(Handler handler, z zVar) {
        z.a aVar = this.c;
        aVar.getClass();
        aVar.c.add(new z.a.C0556a(handler, zVar));
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void i(com.amazon.aps.iva.g6.e eVar) {
        CopyOnWriteArrayList<e.a.C0291a> copyOnWriteArrayList = this.d.c;
        Iterator<e.a.C0291a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            e.a.C0291a next = it.next();
            if (next.b == eVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void m(v.c cVar) {
        this.e.getClass();
        HashSet<v.c> hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (isEmpty) {
            q();
        }
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void n(v.c cVar) {
        ArrayList<v.c> arrayList = this.a;
        arrayList.remove(cVar);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            t();
            return;
        }
        e(cVar);
    }

    public final z.a o(v.b bVar) {
        return new z.a(this.c.c, 0, bVar);
    }

    public abstract void r(com.amazon.aps.iva.w5.y yVar);

    public final void s(r0 r0Var) {
        this.f = r0Var;
        Iterator<v.c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(this, r0Var);
        }
    }

    public abstract void t();

    public void p() {
    }

    public void q() {
    }
}
