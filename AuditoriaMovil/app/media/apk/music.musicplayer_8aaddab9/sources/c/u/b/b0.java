package c.u.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c.u.b.a;
/* loaded from: classes.dex */
public class b0 implements a.InterfaceC0054a {
    public final /* synthetic */ RecyclerView a;

    public b0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(a.b bVar) {
        int i2 = bVar.a;
        if (i2 == 1) {
            RecyclerView recyclerView = this.a;
            recyclerView.t.q0(recyclerView, bVar.f2584b, bVar.f2586d);
        } else if (i2 == 2) {
            RecyclerView recyclerView2 = this.a;
            recyclerView2.t.t0(recyclerView2, bVar.f2584b, bVar.f2586d);
        } else if (i2 == 4) {
            RecyclerView recyclerView3 = this.a;
            recyclerView3.t.v0(recyclerView3, bVar.f2584b, bVar.f2586d, bVar.f2585c);
        } else if (i2 != 8) {
        } else {
            RecyclerView recyclerView4 = this.a;
            recyclerView4.t.s0(recyclerView4, bVar.f2584b, bVar.f2586d, 1);
        }
    }

    public RecyclerView.a0 b(int i2) {
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f523l.h();
        int i3 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i3 >= h2) {
                break;
            }
            RecyclerView.a0 N = RecyclerView.N(recyclerView.f523l.g(i3));
            if (N != null && !N.o() && N.f529d == i2) {
                if (!recyclerView.f523l.k(N.f527b)) {
                    a0Var = N;
                    break;
                }
                a0Var = N;
            }
            i3++;
        }
        if (a0Var == null || this.a.f523l.k(a0Var.f527b)) {
            return null;
        }
        return a0Var;
    }

    public void c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f523l.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = recyclerView.f523l.g(i7);
            RecyclerView.a0 N = RecyclerView.N(g2);
            if (N != null && !N.w() && (i5 = N.f529d) >= i2 && i5 < i6) {
                N.c(2);
                N.b(obj);
                ((RecyclerView.n) g2.getLayoutParams()).f565c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f520i;
        int size = tVar.f572c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.a.x0 = true;
                return;
            }
            RecyclerView.a0 a0Var = tVar.f572c.get(size);
            if (a0Var != null && (i4 = a0Var.f529d) >= i2 && i4 < i6) {
                a0Var.c(2);
                tVar.g(size);
            }
        }
    }

    public void d(int i2, int i3) {
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f523l.h();
        for (int i4 = 0; i4 < h2; i4++) {
            RecyclerView.a0 N = RecyclerView.N(recyclerView.f523l.g(i4));
            if (N != null && !N.w() && N.f529d >= i2) {
                N.s(i3, false);
                recyclerView.t0.f595f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f520i;
        int size = tVar.f572c.size();
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.a0 a0Var = tVar.f572c.get(i5);
            if (a0Var != null && a0Var.f529d >= i2) {
                a0Var.s(i3, false);
            }
        }
        recyclerView.requestLayout();
        this.a.w0 = true;
    }

    public void e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.a;
        int h2 = recyclerView.f523l.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            RecyclerView.a0 N = RecyclerView.N(recyclerView.f523l.g(i12));
            if (N != null && (i10 = N.f529d) >= i5 && i10 <= i4) {
                if (i10 == i2) {
                    N.s(i3 - i2, false);
                } else {
                    N.s(i6, false);
                }
                recyclerView.t0.f595f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f520i;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        int size = tVar.f572c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.a0 a0Var = tVar.f572c.get(i13);
            if (a0Var != null && (i9 = a0Var.f529d) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    a0Var.s(i3 - i2, false);
                } else {
                    a0Var.s(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.w0 = true;
    }
}
