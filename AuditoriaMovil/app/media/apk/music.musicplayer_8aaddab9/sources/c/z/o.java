package c.z;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c.z.i;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o extends i {
    public int z;
    public ArrayList<i> x = new ArrayList<>();
    public boolean y = true;
    public boolean A = false;
    public int B = 0;

    /* loaded from: classes.dex */
    public class a extends l {
        public final /* synthetic */ i a;

        public a(o oVar, i iVar) {
            this.a = iVar;
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            this.a.B();
            iVar.y(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {
        public o a;

        public b(o oVar) {
            this.a = oVar;
        }

        @Override // c.z.l, c.z.i.d
        public void a(i iVar) {
            o oVar = this.a;
            if (oVar.A) {
                return;
            }
            oVar.I();
            this.a.A = true;
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            o oVar = this.a;
            int i2 = oVar.z - 1;
            oVar.z = i2;
            if (i2 == 0) {
                oVar.A = false;
                oVar.o();
            }
            iVar.y(this);
        }
    }

    @Override // c.z.i
    public void A(View view) {
        super.A(view);
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).A(view);
        }
    }

    @Override // c.z.i
    public void B() {
        if (this.x.isEmpty()) {
            I();
            o();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.z = this.x.size();
        if (this.y) {
            Iterator<i> it2 = this.x.iterator();
            while (it2.hasNext()) {
                it2.next().B();
            }
            return;
        }
        for (int i2 = 1; i2 < this.x.size(); i2++) {
            this.x.get(i2 - 1).a(new a(this, this.x.get(i2)));
        }
        i iVar = this.x.get(0);
        if (iVar != null) {
            iVar.B();
        }
    }

    @Override // c.z.i
    public i C(long j2) {
        ArrayList<i> arrayList;
        this.f2887f = j2;
        if (j2 >= 0 && (arrayList = this.x) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.x.get(i2).C(j2);
            }
        }
        return this;
    }

    @Override // c.z.i
    public void D(i.c cVar) {
        this.v = cVar;
        this.B |= 8;
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).D(cVar);
        }
    }

    @Override // c.z.i
    public i E(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.x.get(i2).E(timeInterpolator);
            }
        }
        this.f2888g = timeInterpolator;
        return this;
    }

    @Override // c.z.i
    public void F(e eVar) {
        if (eVar == null) {
            this.w = i.f2883b;
        } else {
            this.w = eVar;
        }
        this.B |= 4;
        if (this.x != null) {
            for (int i2 = 0; i2 < this.x.size(); i2++) {
                this.x.get(i2).F(eVar);
            }
        }
    }

    @Override // c.z.i
    public void G(n nVar) {
        this.B |= 2;
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).G(nVar);
        }
    }

    @Override // c.z.i
    public i H(long j2) {
        this.f2886e = j2;
        return this;
    }

    @Override // c.z.i
    public String J(String str) {
        String J = super.J(str);
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            StringBuilder A = e.a.d.a.a.A(J, "\n");
            A.append(this.x.get(i2).J(str + "  "));
            J = A.toString();
        }
        return J;
    }

    public o K(i iVar) {
        this.x.add(iVar);
        iVar.f2893l = this;
        long j2 = this.f2887f;
        if (j2 >= 0) {
            iVar.C(j2);
        }
        if ((this.B & 1) != 0) {
            iVar.E(this.f2888g);
        }
        if ((this.B & 2) != 0) {
            iVar.G(null);
        }
        if ((this.B & 4) != 0) {
            iVar.F(this.w);
        }
        if ((this.B & 8) != 0) {
            iVar.D(this.v);
        }
        return this;
    }

    public i L(int i2) {
        if (i2 < 0 || i2 >= this.x.size()) {
            return null;
        }
        return this.x.get(i2);
    }

    public o N(int i2) {
        if (i2 == 0) {
            this.y = true;
        } else if (i2 != 1) {
            throw new AndroidRuntimeException(e.a.d.a.a.e("Invalid parameter for TransitionSet ordering: ", i2));
        } else {
            this.y = false;
        }
        return this;
    }

    @Override // c.z.i
    public i a(i.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // c.z.i
    public i b(View view) {
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            this.x.get(i2).b(view);
        }
        this.f2890i.add(view);
        return this;
    }

    @Override // c.z.i
    public void cancel() {
        super.cancel();
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).cancel();
        }
    }

    @Override // c.z.i
    public void d(q qVar) {
        if (u(qVar.f2907b)) {
            Iterator<i> it = this.x.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.u(qVar.f2907b)) {
                    next.d(qVar);
                    qVar.f2908c.add(next);
                }
            }
        }
    }

    @Override // c.z.i
    public void f(q qVar) {
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).f(qVar);
        }
    }

    @Override // c.z.i
    public void g(q qVar) {
        if (u(qVar.f2907b)) {
            Iterator<i> it = this.x.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.u(qVar.f2907b)) {
                    next.g(qVar);
                    qVar.f2908c.add(next);
                }
            }
        }
    }

    @Override // c.z.i
    /* renamed from: l */
    public i clone() {
        o oVar = (o) super.clone();
        oVar.x = new ArrayList<>();
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            i clone = this.x.get(i2).clone();
            oVar.x.add(clone);
            clone.f2893l = oVar;
        }
        return oVar;
    }

    @Override // c.z.i
    public void n(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j2 = this.f2886e;
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.x.get(i2);
            if (j2 > 0 && (this.y || i2 == 0)) {
                long j3 = iVar.f2886e;
                if (j3 > 0) {
                    iVar.H(j3 + j2);
                } else {
                    iVar.H(j2);
                }
            }
            iVar.n(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // c.z.i
    public void x(View view) {
        super.x(view);
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).x(view);
        }
    }

    @Override // c.z.i
    public i y(i.d dVar) {
        super.y(dVar);
        return this;
    }

    @Override // c.z.i
    public i z(View view) {
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            this.x.get(i2).z(view);
        }
        this.f2890i.remove(view);
        return this;
    }
}
