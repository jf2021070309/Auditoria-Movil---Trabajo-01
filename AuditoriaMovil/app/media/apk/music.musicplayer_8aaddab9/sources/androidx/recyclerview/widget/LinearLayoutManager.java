package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c.t.m;
import c.u.b.n;
import c.u.b.o;
import c.u.b.s;
import c.u.b.x;
import ch.qos.logback.classic.Level;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements o.g, RecyclerView.w.b {
    public int A;
    public SavedState B;
    public final a C;
    public final b D;
    public int E;
    public int[] F;
    public int r;
    public c s;
    public x t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f493b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f494c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.f493b = parcel.readInt();
            this.f494c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.f493b = savedState.f493b;
            this.f494c = savedState.f494c;
        }

        public boolean b() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.f493b);
            parcel.writeInt(this.f494c ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public x a;

        /* renamed from: b  reason: collision with root package name */
        public int f495b;

        /* renamed from: c  reason: collision with root package name */
        public int f496c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f497d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f498e;

        public a() {
            d();
        }

        public void a() {
            this.f496c = this.f497d ? this.a.g() : this.a.k();
        }

        public void b(View view, int i2) {
            if (this.f497d) {
                this.f496c = this.a.m() + this.a.b(view);
            } else {
                this.f496c = this.a.e(view);
            }
            this.f495b = i2;
        }

        public void c(View view, int i2) {
            int m2 = this.a.m();
            if (m2 >= 0) {
                b(view, i2);
                return;
            }
            this.f495b = i2;
            if (!this.f497d) {
                int e2 = this.a.e(view);
                int k2 = e2 - this.a.k();
                this.f496c = e2;
                if (k2 > 0) {
                    int g2 = (this.a.g() - Math.min(0, (this.a.g() - m2) - this.a.b(view))) - (this.a.c(view) + e2);
                    if (g2 < 0) {
                        this.f496c -= Math.min(k2, -g2);
                        return;
                    }
                    return;
                }
                return;
            }
            int g3 = (this.a.g() - m2) - this.a.b(view);
            this.f496c = this.a.g() - g3;
            if (g3 > 0) {
                int c2 = this.f496c - this.a.c(view);
                int k3 = this.a.k();
                int min = c2 - (Math.min(this.a.e(view) - k3, 0) + k3);
                if (min < 0) {
                    this.f496c = Math.min(g3, -min) + this.f496c;
                }
            }
        }

        public void d() {
            this.f495b = -1;
            this.f496c = Level.ALL_INT;
            this.f497d = false;
            this.f498e = false;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("AnchorInfo{mPosition=");
            y.append(this.f495b);
            y.append(", mCoordinate=");
            y.append(this.f496c);
            y.append(", mLayoutFromEnd=");
            y.append(this.f497d);
            y.append(", mValid=");
            y.append(this.f498e);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f499b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f500c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f501d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f502b;

        /* renamed from: c  reason: collision with root package name */
        public int f503c;

        /* renamed from: d  reason: collision with root package name */
        public int f504d;

        /* renamed from: e  reason: collision with root package name */
        public int f505e;

        /* renamed from: f  reason: collision with root package name */
        public int f506f;

        /* renamed from: g  reason: collision with root package name */
        public int f507g;

        /* renamed from: j  reason: collision with root package name */
        public int f510j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f512l;
        public boolean a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f508h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f509i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.a0> f511k = null;

        public void a(View view) {
            int a;
            int size = this.f511k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f511k.get(i3).f527b;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a = (nVar.a() - this.f504d) * this.f505e) >= 0 && a < i2) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i2 = a;
                }
            }
            if (view2 == null) {
                this.f504d = -1;
            } else {
                this.f504d = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
        }

        public boolean b(RecyclerView.x xVar) {
            int i2 = this.f504d;
            return i2 >= 0 && i2 < xVar.b();
        }

        public View c(RecyclerView.t tVar) {
            List<RecyclerView.a0> list = this.f511k;
            if (list == null) {
                View view = tVar.k(this.f504d, false, Long.MAX_VALUE).f527b;
                this.f504d += this.f505e;
                return view;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = this.f511k.get(i2).f527b;
                RecyclerView.n nVar = (RecyclerView.n) view2.getLayoutParams();
                if (!nVar.c() && this.f504d == nVar.a()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager(int i2, boolean z) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Level.ALL_INT;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        E1(i2);
        e(null);
        if (z == this.v) {
            return;
        }
        this.v = z;
        M0();
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.r = 1;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = true;
        this.z = -1;
        this.A = Level.ALL_INT;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        RecyclerView.m.d U = RecyclerView.m.U(context, attributeSet, i2, i3);
        E1(U.a);
        boolean z = U.f562c;
        e(null);
        if (z != this.v) {
            this.v = z;
            M0();
        }
        F1(U.f563d);
    }

    public boolean A1() {
        return this.t.i() == 0 && this.t.f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void B0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.B = savedState;
            if (this.z != -1) {
                savedState.a = -1;
            }
            M0();
        }
    }

    public final void B1() {
        if (this.r == 1 || !v1()) {
            this.w = this.v;
        } else {
            this.w = !this.v;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable C0() {
        SavedState savedState = this.B;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (A() > 0) {
            h1();
            boolean z = this.u ^ this.w;
            savedState2.f494c = z;
            if (z) {
                View t1 = t1();
                savedState2.f493b = this.t.g() - this.t.b(t1);
                savedState2.a = T(t1);
            } else {
                View u1 = u1();
                savedState2.a = T(u1);
                savedState2.f493b = this.t.e(u1) - this.t.k();
            }
        } else {
            savedState2.a = -1;
        }
        return savedState2;
    }

    public int C1(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (A() == 0 || i2 == 0) {
            return 0;
        }
        h1();
        this.s.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        G1(i3, abs, true, xVar);
        c cVar = this.s;
        int i1 = i1(tVar, cVar, xVar, false) + cVar.f507g;
        if (i1 < 0) {
            return 0;
        }
        if (abs > i1) {
            i2 = i3 * i1;
        }
        this.t.p(-i2);
        this.s.f510j = i2;
        return i2;
    }

    public void D1(int i2, int i3) {
        this.z = i2;
        this.A = i3;
        SavedState savedState = this.B;
        if (savedState != null) {
            savedState.a = -1;
        }
        M0();
    }

    public void E1(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(e.a.d.a.a.e("invalid orientation:", i2));
        }
        e(null);
        if (i2 != this.r || this.t == null) {
            x a2 = x.a(this, i2);
            this.t = a2;
            this.C.a = a2;
            this.r = i2;
            M0();
        }
    }

    public void F1(boolean z) {
        e(null);
        if (this.x == z) {
            return;
        }
        this.x = z;
        M0();
    }

    public final void G1(int i2, int i3, boolean z, RecyclerView.x xVar) {
        int k2;
        this.s.f512l = A1();
        this.s.f506f = i2;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        b1(xVar, iArr);
        int max = Math.max(0, this.F[0]);
        int max2 = Math.max(0, this.F[1]);
        boolean z2 = i2 == 1;
        c cVar = this.s;
        int i4 = z2 ? max2 : max;
        cVar.f508h = i4;
        if (!z2) {
            max = max2;
        }
        cVar.f509i = max;
        if (z2) {
            cVar.f508h = this.t.h() + i4;
            View t1 = t1();
            c cVar2 = this.s;
            cVar2.f505e = this.w ? -1 : 1;
            int T = T(t1);
            c cVar3 = this.s;
            cVar2.f504d = T + cVar3.f505e;
            cVar3.f502b = this.t.b(t1);
            k2 = this.t.b(t1) - this.t.g();
        } else {
            View u1 = u1();
            c cVar4 = this.s;
            cVar4.f508h = this.t.k() + cVar4.f508h;
            c cVar5 = this.s;
            cVar5.f505e = this.w ? 1 : -1;
            int T2 = T(u1);
            c cVar6 = this.s;
            cVar5.f504d = T2 + cVar6.f505e;
            cVar6.f502b = this.t.e(u1);
            k2 = (-this.t.e(u1)) + this.t.k();
        }
        c cVar7 = this.s;
        cVar7.f503c = i3;
        if (z) {
            cVar7.f503c = i3 - k2;
        }
        cVar7.f507g = k2;
    }

    public final void H1(int i2, int i3) {
        this.s.f503c = this.t.g() - i3;
        c cVar = this.s;
        cVar.f505e = this.w ? -1 : 1;
        cVar.f504d = i2;
        cVar.f506f = 1;
        cVar.f502b = i3;
        cVar.f507g = Level.ALL_INT;
    }

    public final void I1(int i2, int i3) {
        this.s.f503c = i3 - this.t.k();
        c cVar = this.s;
        cVar.f504d = i2;
        cVar.f505e = this.w ? 1 : -1;
        cVar.f506f = -1;
        cVar.f502b = i3;
        cVar.f507g = Level.ALL_INT;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int N0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 1) {
            return 0;
        }
        return C1(i2, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(int i2) {
        this.z = i2;
        this.A = Level.ALL_INT;
        SavedState savedState = this.B;
        if (savedState != null) {
            savedState.a = -1;
        }
        M0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.r == 0) {
            return 0;
        }
        return C1(i2, tVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean W0() {
        boolean z;
        if (this.o != 1073741824 && this.f560n != 1073741824) {
            int A = A();
            int i2 = 0;
            while (true) {
                if (i2 >= A) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = z(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean Y() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, RecyclerView.x xVar, int i2) {
        s sVar = new s(recyclerView.getContext());
        sVar.a = i2;
        Z0(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public PointF a(int i2) {
        if (A() == 0) {
            return null;
        }
        int i3 = (i2 < T(z(0))) != this.w ? -1 : 1;
        return this.r == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a1() {
        return this.B == null && this.u == this.x;
    }

    @Override // c.u.b.o.g
    public void b(View view, View view2, int i2, int i3) {
        RecyclerView recyclerView;
        if (this.B == null && (recyclerView = this.f548b) != null) {
            recyclerView.l("Cannot drop a view during a scroll or layout calculation");
        }
        h1();
        B1();
        int T = T(view);
        int T2 = T(view2);
        char c2 = T < T2 ? (char) 1 : (char) 65535;
        if (this.w) {
            if (c2 == 1) {
                D1(T2, this.t.g() - (this.t.c(view) + this.t.e(view2)));
            } else {
                D1(T2, this.t.g() - this.t.b(view2));
            }
        } else if (c2 == 65535) {
            D1(T2, this.t.e(view2));
        } else {
            D1(T2, this.t.b(view2) - this.t.c(view));
        }
    }

    public void b1(RecyclerView.x xVar, int[] iArr) {
        int i2;
        int l2 = xVar.a != -1 ? this.t.l() : 0;
        if (this.s.f506f == -1) {
            i2 = 0;
        } else {
            i2 = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i2;
    }

    public void c1(RecyclerView.x xVar, c cVar, RecyclerView.m.c cVar2) {
        int i2 = cVar.f504d;
        if (i2 < 0 || i2 >= xVar.b()) {
            return;
        }
        ((n.b) cVar2).a(i2, Math.max(0, cVar.f507g));
    }

    public final int d1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        h1();
        return m.c(xVar, this.t, l1(!this.y, true), k1(!this.y, true), this, this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void e(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.f548b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    public final int e1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        h1();
        return m.d(xVar, this.t, l1(!this.y, true), k1(!this.y, true), this, this.y, this.w);
    }

    public final int f1(RecyclerView.x xVar) {
        if (A() == 0) {
            return 0;
        }
        h1();
        return m.e(xVar, this.t, l1(!this.y, true), k1(!this.y, true), this, this.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g() {
        return this.r == 0;
    }

    public int g1(int i2) {
        if (i2 == 1) {
            return (this.r != 1 && v1()) ? 1 : -1;
        } else if (i2 == 2) {
            return (this.r != 1 && v1()) ? -1 : 1;
        } else if (i2 == 17) {
            if (this.r == 0) {
                return -1;
            }
            return Level.ALL_INT;
        } else if (i2 == 33) {
            if (this.r == 1) {
                return -1;
            }
            return Level.ALL_INT;
        } else if (i2 == 66) {
            if (this.r == 0) {
                return 1;
            }
            return Level.ALL_INT;
        } else if (i2 == 130 && this.r == 1) {
            return 1;
        } else {
            return Level.ALL_INT;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean h() {
        return this.r == 1;
    }

    public void h1() {
        if (this.s == null) {
            this.s = new c();
        }
    }

    public int i1(RecyclerView.t tVar, c cVar, RecyclerView.x xVar, boolean z) {
        int i2 = cVar.f503c;
        int i3 = cVar.f507g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f507g = i3 + i2;
            }
            y1(tVar, cVar);
        }
        int i4 = cVar.f503c + cVar.f508h;
        b bVar = this.D;
        while (true) {
            if ((!cVar.f512l && i4 <= 0) || !cVar.b(xVar)) {
                break;
            }
            bVar.a = 0;
            bVar.f499b = false;
            bVar.f500c = false;
            bVar.f501d = false;
            w1(tVar, xVar, cVar, bVar);
            if (!bVar.f499b) {
                int i5 = cVar.f502b;
                int i6 = bVar.a;
                cVar.f502b = (cVar.f506f * i6) + i5;
                if (!bVar.f500c || cVar.f511k != null || !xVar.f596g) {
                    cVar.f503c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.f507g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f507g = i8;
                    int i9 = cVar.f503c;
                    if (i9 < 0) {
                        cVar.f507g = i8 + i9;
                    }
                    y1(tVar, cVar);
                }
                if (z && bVar.f501d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f503c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j0(RecyclerView recyclerView, RecyclerView.t tVar) {
        i0();
    }

    public int j1() {
        View p1 = p1(0, A(), true, false);
        if (p1 == null) {
            return -1;
        }
        return T(p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k(int i2, int i3, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        if (this.r != 0) {
            i2 = i3;
        }
        if (A() == 0 || i2 == 0) {
            return;
        }
        h1();
        G1(i2 > 0 ? 1 : -1, Math.abs(i2), true, xVar);
        c1(xVar, this.s, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View k0(View view, int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        int g1;
        B1();
        if (A() == 0 || (g1 = g1(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        h1();
        G1(g1, (int) (this.t.l() * 0.33333334f), false, xVar);
        c cVar = this.s;
        cVar.f507g = Level.ALL_INT;
        cVar.a = false;
        i1(tVar, cVar, xVar, true);
        View o1 = g1 == -1 ? this.w ? o1(A() - 1, -1) : o1(0, A()) : this.w ? o1(0, A()) : o1(A() - 1, -1);
        View u1 = g1 == -1 ? u1() : t1();
        if (u1.hasFocusable()) {
            if (o1 == null) {
                return null;
            }
            return u1;
        }
        return o1;
    }

    public View k1(boolean z, boolean z2) {
        return this.w ? p1(0, A(), z, z2) : p1(A() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l(int i2, RecyclerView.m.c cVar) {
        boolean z;
        int i3;
        SavedState savedState = this.B;
        if (savedState == null || !savedState.b()) {
            B1();
            z = this.w;
            i3 = this.z;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.B;
            z = savedState2.f494c;
            i3 = savedState2.a;
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < this.E && i3 >= 0 && i3 < i2; i5++) {
            ((n.b) cVar).a(i3, 0);
            i3 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void l0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.t tVar = this.f548b.f520i;
        m0(accessibilityEvent);
        if (A() > 0) {
            accessibilityEvent.setFromIndex(m1());
            accessibilityEvent.setToIndex(n1());
        }
    }

    public View l1(boolean z, boolean z2) {
        return this.w ? p1(A() - 1, -1, z, z2) : p1(0, A(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return d1(xVar);
    }

    public int m1() {
        View p1 = p1(0, A(), false, true);
        if (p1 == null) {
            return -1;
        }
        return T(p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int n(RecyclerView.x xVar) {
        return e1(xVar);
    }

    public int n1() {
        View p1 = p1(A() - 1, -1, false, true);
        if (p1 == null) {
            return -1;
        }
        return T(p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return f1(xVar);
    }

    public View o1(int i2, int i3) {
        int i4;
        int i5;
        h1();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return z(i2);
        }
        if (this.t.e(z(i2)) < this.t.k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.r == 0 ? this.f551e.a(i2, i3, i4, i5) : this.f552f.a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return d1(xVar);
    }

    public View p1(int i2, int i3, boolean z, boolean z2) {
        h1();
        int i4 = z ? 24579 : 320;
        int i5 = z2 ? 320 : 0;
        return this.r == 0 ? this.f551e.a(i2, i3, i4, i5) : this.f552f.a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int q(RecyclerView.x xVar) {
        return e1(xVar);
    }

    public View q1(RecyclerView.t tVar, RecyclerView.x xVar, boolean z, boolean z2) {
        int i2;
        int i3;
        h1();
        int A = A();
        int i4 = -1;
        if (z2) {
            i2 = A() - 1;
            i3 = -1;
        } else {
            i4 = A;
            i2 = 0;
            i3 = 1;
        }
        int b2 = xVar.b();
        int k2 = this.t.k();
        int g2 = this.t.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i4) {
            View z3 = z(i2);
            int T = T(z3);
            int e2 = this.t.e(z3);
            int b3 = this.t.b(z3);
            if (T >= 0 && T < b2) {
                if (!((RecyclerView.n) z3.getLayoutParams()).c()) {
                    boolean z4 = b3 <= k2 && e2 < k2;
                    boolean z5 = e2 >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return z3;
                    }
                    if (z) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = z3;
                        }
                        view2 = z3;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = z3;
                        }
                        view2 = z3;
                    }
                } else if (view3 == null) {
                    view3 = z3;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int r(RecyclerView.x xVar) {
        return f1(xVar);
    }

    public final int r1(int i2, RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int g2;
        int g3 = this.t.g() - i2;
        if (g3 > 0) {
            int i3 = -C1(-g3, tVar, xVar);
            int i4 = i2 + i3;
            if (!z || (g2 = this.t.g() - i4) <= 0) {
                return i3;
            }
            this.t.p(g2);
            return g2 + i3;
        }
        return 0;
    }

    public final int s1(int i2, RecyclerView.t tVar, RecyclerView.x xVar, boolean z) {
        int k2;
        int k3 = i2 - this.t.k();
        if (k3 > 0) {
            int i3 = -C1(k3, tVar, xVar);
            int i4 = i2 + i3;
            if (!z || (k2 = i4 - this.t.k()) <= 0) {
                return i3;
            }
            this.t.p(-k2);
            return i3 - k2;
        }
        return 0;
    }

    public final View t1() {
        return z(this.w ? 0 : A() - 1);
    }

    public final View u1() {
        return z(this.w ? A() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View v(int i2) {
        int A = A();
        if (A == 0) {
            return null;
        }
        int T = i2 - T(z(0));
        if (T >= 0 && T < A) {
            View z = z(T);
            if (T(z) == i2) {
                return z;
            }
        }
        return super.v(i2);
    }

    public boolean v1() {
        return M() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n w() {
        return new RecyclerView.n(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w0(androidx.recyclerview.widget.RecyclerView.t r17, androidx.recyclerview.widget.RecyclerView.x r18) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.w0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public void w1(RecyclerView.t tVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int d2;
        View c2 = cVar.c(tVar);
        if (c2 == null) {
            bVar.f499b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) c2.getLayoutParams();
        if (cVar.f511k == null) {
            if (this.w == (cVar.f506f == -1)) {
                d(c2, -1, false);
            } else {
                d(c2, 0, false);
            }
        } else {
            if (this.w == (cVar.f506f == -1)) {
                d(c2, -1, true);
            } else {
                d(c2, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) c2.getLayoutParams();
        Rect O = this.f548b.O(c2);
        int B = RecyclerView.m.B(this.p, this.f560n, R() + Q() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + O.left + O.right + 0, ((ViewGroup.MarginLayoutParams) nVar2).width, g());
        int B2 = RecyclerView.m.B(this.q, this.o, P() + S() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + O.top + O.bottom + 0, ((ViewGroup.MarginLayoutParams) nVar2).height, h());
        if (V0(c2, B, B2, nVar2)) {
            c2.measure(B, B2);
        }
        bVar.a = this.t.c(c2);
        if (this.r == 1) {
            if (v1()) {
                d2 = this.p - R();
                i5 = d2 - this.t.d(c2);
            } else {
                i5 = Q();
                d2 = this.t.d(c2) + i5;
            }
            if (cVar.f506f == -1) {
                int i6 = cVar.f502b;
                i4 = i6;
                i3 = d2;
                i2 = i6 - bVar.a;
            } else {
                int i7 = cVar.f502b;
                i2 = i7;
                i3 = d2;
                i4 = bVar.a + i7;
            }
        } else {
            int S = S();
            int d3 = this.t.d(c2) + S;
            if (cVar.f506f == -1) {
                int i8 = cVar.f502b;
                i3 = i8;
                i2 = S;
                i4 = d3;
                i5 = i8 - bVar.a;
            } else {
                int i9 = cVar.f502b;
                i2 = S;
                i3 = bVar.a + i9;
                i4 = d3;
                i5 = i9;
            }
        }
        c0(c2, i5, i2, i3, i4);
        if (nVar.c() || nVar.b()) {
            bVar.f500c = true;
        }
        bVar.f501d = c2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void x0(RecyclerView.x xVar) {
        this.B = null;
        this.z = -1;
        this.A = Level.ALL_INT;
        this.C.d();
    }

    public void x1(RecyclerView.t tVar, RecyclerView.x xVar, a aVar, int i2) {
    }

    public final void y1(RecyclerView.t tVar, c cVar) {
        if (!cVar.a || cVar.f512l) {
            return;
        }
        int i2 = cVar.f507g;
        int i3 = cVar.f509i;
        if (cVar.f506f == -1) {
            int A = A();
            if (i2 < 0) {
                return;
            }
            int f2 = (this.t.f() - i2) + i3;
            if (this.w) {
                for (int i4 = 0; i4 < A; i4++) {
                    View z = z(i4);
                    if (this.t.e(z) < f2 || this.t.o(z) < f2) {
                        z1(tVar, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = A - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View z2 = z(i6);
                if (this.t.e(z2) < f2 || this.t.o(z2) < f2) {
                    z1(tVar, i5, i6);
                    return;
                }
            }
        } else if (i2 >= 0) {
            int i7 = i2 - i3;
            int A2 = A();
            if (!this.w) {
                for (int i8 = 0; i8 < A2; i8++) {
                    View z3 = z(i8);
                    if (this.t.b(z3) > i7 || this.t.n(z3) > i7) {
                        z1(tVar, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = A2 - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View z4 = z(i10);
                if (this.t.b(z4) > i7 || this.t.n(z4) > i7) {
                    z1(tVar, i9, i10);
                    return;
                }
            }
        }
    }

    public final void z1(RecyclerView.t tVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                J0(i2, tVar);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            J0(i4, tVar);
        }
    }
}
