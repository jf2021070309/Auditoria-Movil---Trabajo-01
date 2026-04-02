package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.k0.b;
import c.u.b.n;
import ch.qos.logback.classic.Level;
import java.util.Objects;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean G;
    public int H;
    public int[] I;
    public View[] J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public c M;
    public final Rect N;

    /* loaded from: classes.dex */
    public static final class a extends c {
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f490e;

        /* renamed from: f  reason: collision with root package name */
        public int f491f;

        public b(int i2, int i3) {
            super(i2, i3);
            this.f490e = -1;
            this.f491f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f490e = -1;
            this.f491f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f490e = -1;
            this.f491f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f490e = -1;
            this.f491f = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f492b = new SparseIntArray();

        public int a(int i2, int i3) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i4++;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i3 ? i5 + 1 : i5;
        }
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(i3, z);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        R1(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        R1(RecyclerView.m.U(context, attributeSet, i2, i3).f561b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int C(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 1) {
            return this.H;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return M1(tVar, xVar, xVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void F1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        e(null);
        if (this.x) {
            this.x = false;
            M0();
        }
    }

    public final void J1(int i2) {
        int i3;
        int[] iArr = this.I;
        int i4 = this.H;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.I = iArr;
    }

    public final void K1() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public int L1(int i2, int i3) {
        if (this.r != 1 || !v1()) {
            int[] iArr = this.I;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.I;
        int i4 = this.H;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public final int M1(RecyclerView.t tVar, RecyclerView.x xVar, int i2) {
        if (xVar.f596g) {
            int c2 = tVar.c(i2);
            if (c2 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
                return 0;
            }
            return this.M.a(c2, this.H);
        }
        return this.M.a(i2, this.H);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int N0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        S1();
        K1();
        if (this.r == 1) {
            return 0;
        }
        return C1(i2, tVar, xVar);
    }

    public final int N1(RecyclerView.t tVar, RecyclerView.x xVar, int i2) {
        if (!xVar.f596g) {
            c cVar = this.M;
            int i3 = this.H;
            Objects.requireNonNull(cVar);
            return i2 % i3;
        }
        int i4 = this.L.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int c2 = tVar.c(i2);
        if (c2 != -1) {
            c cVar2 = this.M;
            int i5 = this.H;
            Objects.requireNonNull(cVar2);
            return c2 % i5;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    public final int O1(RecyclerView.t tVar, RecyclerView.x xVar, int i2) {
        if (!xVar.f596g) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        int i3 = this.K.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (tVar.c(i2) != -1) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        S1();
        K1();
        if (this.r == 0) {
            return 0;
        }
        return C1(i2, tVar, xVar);
    }

    public final void P1(View view, int i2, boolean z) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f564b;
        int i5 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i6 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int L1 = L1(bVar.f490e, bVar.f491f);
        if (this.r == 1) {
            i4 = RecyclerView.m.B(L1, i2, i6, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.m.B(this.t.l(), this.o, i5, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int B = RecyclerView.m.B(L1, i2, i5, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int B2 = RecyclerView.m.B(this.t.l(), this.f560n, i6, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = B;
            i4 = B2;
        }
        Q1(view, i4, i3, z);
    }

    public final void Q1(View view, int i2, int i3, boolean z) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z ? X0(view, i2, i3, nVar) : V0(view, i2, i3, nVar)) {
            view.measure(i2, i3);
        }
    }

    public void R1(int i2) {
        if (i2 == this.H) {
            return;
        }
        this.G = true;
        if (i2 < 1) {
            throw new IllegalArgumentException(e.a.d.a.a.e("Span count should be at least 1. Provided ", i2));
        }
        this.H = i2;
        this.M.a.clear();
        M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void S0(Rect rect, int i2, int i3) {
        int j2;
        int j3;
        if (this.I == null) {
            super.S0(rect, i2, i3);
        }
        int R = R() + Q();
        int P = P() + S();
        if (this.r == 1) {
            j3 = RecyclerView.m.j(i3, rect.height() + P, N());
            int[] iArr = this.I;
            j2 = RecyclerView.m.j(i2, iArr[iArr.length - 1] + R, O());
        } else {
            j2 = RecyclerView.m.j(i2, rect.width() + R, O());
            int[] iArr2 = this.I;
            j3 = RecyclerView.m.j(i3, iArr2[iArr2.length - 1] + P, N());
        }
        RecyclerView.h(this.f548b, j2, j3);
    }

    public final void S1() {
        int P;
        int S;
        if (this.r == 1) {
            P = this.p - R();
            S = Q();
        } else {
            P = this.q - P();
            S = S();
        }
        J1(P - S);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int V(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 0) {
            return this.H;
        }
        if (xVar.b() < 1) {
            return 0;
        }
        return M1(tVar, xVar, xVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean a1() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void c1(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i2 = this.H;
        for (int i3 = 0; i3 < this.H && cVar.b(xVar) && i2 > 0; i3++) {
            ((n.b) cVar2).a(cVar.f504d, Math.max(0, cVar.f507g));
            Objects.requireNonNull(this.M);
            i2--;
            cVar.f504d += cVar.f505e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean i(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View k0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.k0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return e1(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return f1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void o0(RecyclerView.t tVar, RecyclerView.x xVar, View view, c.i.k.k0.b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            n0(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int M1 = M1(tVar, xVar, bVar2.a());
        if (this.r == 0) {
            bVar.j(b.c.a(bVar2.f490e, bVar2.f491f, M1, 1, false, false));
        } else {
            bVar.j(b.c.a(M1, 1, bVar2.f490e, bVar2.f491f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int q(RecyclerView.x xVar) {
        return e1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void q0(RecyclerView recyclerView, int i2, int i3) {
        this.M.a.clear();
        this.M.f492b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View q1(RecyclerView.t tVar, RecyclerView.x xVar, boolean z, boolean z2) {
        int i2;
        int A = A();
        int i3 = -1;
        int i4 = 1;
        if (z2) {
            i2 = A() - 1;
            i4 = -1;
        } else {
            i3 = A;
            i2 = 0;
        }
        int b2 = xVar.b();
        h1();
        int k2 = this.t.k();
        int g2 = this.t.g();
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View z3 = z(i2);
            int T = T(z3);
            if (T >= 0 && T < b2 && N1(tVar, xVar, T) == 0) {
                if (((RecyclerView.n) z3.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = z3;
                    }
                } else if (this.t.e(z3) < g2 && this.t.b(z3) >= k2) {
                    return z3;
                } else {
                    if (view == null) {
                        view = z3;
                    }
                }
            }
            i2 += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int r(RecyclerView.x xVar) {
        return f1(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void r0(RecyclerView recyclerView) {
        this.M.a.clear();
        this.M.f492b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void s0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.M.a.clear();
        this.M.f492b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void t0(RecyclerView recyclerView, int i2, int i3) {
        this.M.a.clear();
        this.M.f492b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.M.a.clear();
        this.M.f492b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w() {
        return this.r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void w0(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (xVar.f596g) {
            int A = A();
            for (int i2 = 0; i2 < A; i2++) {
                b bVar = (b) z(i2).getLayoutParams();
                int a2 = bVar.a();
                this.K.put(a2, bVar.f491f);
                this.L.put(a2, bVar.f490e);
            }
        }
        super.w0(tVar, xVar);
        this.K.clear();
        this.L.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        r21.f499b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w1(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.x r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.w1(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n x(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void x0(RecyclerView.x xVar) {
        this.B = null;
        this.z = -1;
        this.A = Level.ALL_INT;
        this.C.d();
        this.G = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void x1(RecyclerView.t tVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i2) {
        S1();
        if (xVar.b() > 0 && !xVar.f596g) {
            boolean z = i2 == 1;
            int N1 = N1(tVar, xVar, aVar.f495b);
            if (z) {
                while (N1 > 0) {
                    int i3 = aVar.f495b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    aVar.f495b = i4;
                    N1 = N1(tVar, xVar, i4);
                }
            } else {
                int b2 = xVar.b() - 1;
                int i5 = aVar.f495b;
                while (i5 < b2) {
                    int i6 = i5 + 1;
                    int N12 = N1(tVar, xVar, i6);
                    if (N12 <= N1) {
                        break;
                    }
                    i5 = i6;
                    N1 = N12;
                }
                aVar.f495b = i5;
            }
        }
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n y(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }
}
