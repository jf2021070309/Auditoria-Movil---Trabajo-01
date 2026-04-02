package com.amazon.aps.iva.f5;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.amazon.aps.iva.f5.b0;
import com.amazon.aps.iva.f5.e;
import com.amazon.aps.iva.f5.j;
import com.amazon.aps.iva.f5.k;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q3.l;
import com.google.android.gms.ads.AdRequest;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: GridLayoutManager.java */
/* loaded from: classes.dex */
public final class f extends RecyclerView.p {
    public static final Rect Q = new Rect();
    public static final int[] R = new int[2];
    public int A;
    public int B;
    public int D;
    public com.amazon.aps.iva.f5.e F;
    public int J;
    public int K;
    public com.amazon.aps.iva.f5.d N;
    public final com.amazon.aps.iva.f5.b b;
    public RecyclerView.b0 e;
    public int f;
    public int g;
    public int[] i;
    public RecyclerView.w j;
    public c o;
    public e p;
    public int r;
    public int t;
    public int u;
    public int v;
    public int[] w;
    public int x;
    public int y;
    public int z;
    public final int a = 10;
    public int c = 0;
    public androidx.recyclerview.widget.a0 d = new androidx.recyclerview.widget.y(this);
    public final SparseIntArray h = new SparseIntArray();
    public int k = 221696;
    public ArrayList<p> l = null;
    public int m = -1;
    public int n = 0;
    public int q = 0;
    public int C = 8388659;
    public int E = 1;
    public int G = 0;
    public final b0 H = new b0();
    public final j I = new j();
    public final int[] L = new int[2];
    public final a0 M = new a0();
    public final a O = new a();
    public final b P = new b();
    public int s = -1;

    /* compiled from: GridLayoutManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.requestLayout();
        }
    }

    /* compiled from: GridLayoutManager.java */
    /* loaded from: classes.dex */
    public class b implements e.b {
        public b() {
        }

        public final void a(Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            e eVar;
            int i7;
            View view = (View) obj;
            f fVar = f.this;
            if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
                if (!fVar.F.c) {
                    i4 = fVar.H.c.j;
                } else {
                    b0.a aVar = fVar.H.c;
                    i4 = aVar.i - aVar.k;
                }
            }
            if (!fVar.F.c) {
                i6 = i2 + i4;
                i5 = i4;
            } else {
                i5 = i4 - i2;
                i6 = i4;
            }
            int i8 = (fVar.i(i3) + fVar.H.d.j) - fVar.t;
            a0 a0Var = fVar.M;
            if (a0Var.c != null) {
                SparseArray<Parcelable> remove = a0Var.c.remove(Integer.toString(i));
                if (remove != null) {
                    view.restoreHierarchyState(remove);
                }
            }
            f.this.r(view, i3, i5, i6, i8);
            if (!fVar.e.g) {
                fVar.L();
            }
            if ((fVar.k & 3) != 1 && (eVar = fVar.p) != null) {
                boolean z = eVar.c;
                f fVar2 = f.this;
                if (z && (i7 = eVar.d) != 0) {
                    eVar.d = fVar2.x(i7, true);
                }
                int i9 = eVar.d;
                if (i9 == 0 || ((i9 > 0 && fVar2.p()) || (eVar.d < 0 && fVar2.o()))) {
                    eVar.setTargetPosition(fVar2.m);
                    eVar.stop();
                }
            }
            fVar.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007d -> B:36:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00b7 -> B:59:0x00b9). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int b(int r9, boolean r10, java.lang.Object[] r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.b.b(int, boolean, java.lang.Object[], boolean):int");
        }

        public final int c() {
            f fVar = f.this;
            return fVar.e.b() + fVar.f;
        }

        public final int d(int i) {
            f fVar = f.this;
            View findViewByPosition = fVar.findViewByPosition(i - fVar.f);
            if ((fVar.k & 262144) != 0) {
                return fVar.m(findViewByPosition);
            }
            return fVar.n(findViewByPosition);
        }

        public final int e(int i) {
            f fVar = f.this;
            View findViewByPosition = fVar.findViewByPosition(i - fVar.f);
            Rect rect = f.Q;
            fVar.getDecoratedBoundsWithMargins(findViewByPosition, rect);
            if (fVar.c == 0) {
                return rect.width();
            }
            return rect.height();
        }
    }

    /* compiled from: GridLayoutManager.java */
    /* loaded from: classes.dex */
    public abstract class c extends androidx.recyclerview.widget.u {
        public boolean a;

        public c() {
            super(f.this.b.getContext());
        }

        public void a() {
            View findViewByPosition = findViewByPosition(getTargetPosition());
            f fVar = f.this;
            if (findViewByPosition == null) {
                if (getTargetPosition() >= 0) {
                    fVar.D(getTargetPosition(), 0, 0, false);
                    return;
                }
                return;
            }
            if (fVar.m != getTargetPosition()) {
                fVar.m = getTargetPosition();
            }
            if (fVar.hasFocus()) {
                fVar.k |= 32;
                findViewByPosition.requestFocus();
                fVar.k &= -33;
            }
            fVar.b();
            fVar.c();
        }

        @Override // androidx.recyclerview.widget.u
        public final int calculateTimeForScrolling(int i) {
            int calculateTimeForScrolling = super.calculateTimeForScrolling(i);
            int i2 = f.this.H.c.i;
            if (i2 > 0) {
                float f = (30.0f / i2) * i;
                if (calculateTimeForScrolling < f) {
                    return (int) f;
                }
                return calculateTimeForScrolling;
            }
            return calculateTimeForScrolling;
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
        public final void onStop() {
            super.onStop();
            if (!this.a) {
                a();
            }
            f fVar = f.this;
            if (fVar.o == this) {
                fVar.o = null;
            }
            if (fVar.p == this) {
                fVar.p = null;
            }
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.a0
        public final void onTargetFound(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            int i;
            int i2;
            int[] iArr = f.R;
            f fVar = f.this;
            if (fVar.j(view, null, iArr)) {
                if (fVar.c == 0) {
                    i = iArr[0];
                    i2 = iArr[1];
                } else {
                    i = iArr[1];
                    i2 = iArr[0];
                }
                aVar.b(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration((int) Math.sqrt((i2 * i2) + (i * i))));
            }
        }
    }

    /* compiled from: GridLayoutManager.java */
    /* loaded from: classes.dex */
    public static final class d extends RecyclerView.q {
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int[] k;
        public k l;

        public d() {
            super(-2, -2);
        }

        public d(d dVar) {
            super((RecyclerView.q) dVar);
        }
    }

    /* compiled from: GridLayoutManager.java */
    /* loaded from: classes.dex */
    public final class e extends c {
        public final boolean c;
        public int d;

        public e(int i, boolean z) {
            super();
            this.d = i;
            this.c = z;
            setTargetPosition(-2);
        }

        @Override // com.amazon.aps.iva.f5.f.c
        public final void a() {
            super.a();
            this.d = 0;
            View findViewByPosition = findViewByPosition(getTargetPosition());
            if (findViewByPosition != null) {
                f.this.F(findViewByPosition, true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public final PointF computeScrollVectorForPosition(int i) {
            int i2;
            int i3 = this.d;
            if (i3 == 0) {
                return null;
            }
            f fVar = f.this;
            if ((fVar.k & 262144) == 0 ? i3 < 0 : i3 > 0) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            if (fVar.c == 0) {
                return new PointF(i2, 0.0f);
            }
            return new PointF(0.0f, i2);
        }

        @Override // androidx.recyclerview.widget.u
        public final void updateActionForInterimTarget(RecyclerView.a0.a aVar) {
            if (this.d == 0) {
                return;
            }
            super.updateActionForInterimTarget(aVar);
        }
    }

    public f(com.amazon.aps.iva.f5.b bVar) {
        this.b = bVar;
        setItemPrefetchEnabled(false);
    }

    public static int d(View view) {
        d dVar;
        if (view == null || (dVar = (d) view.getLayoutParams()) == null || dVar.d()) {
            return -1;
        }
        return dVar.a();
    }

    public static int l(View view, View view2) {
        k kVar;
        if (view != null && view2 != null && (kVar = ((d) view.getLayoutParams()).l) != null) {
            k.a[] aVarArr = kVar.a;
            if (aVarArr.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i = 1; i < aVarArr.length; i++) {
                            if (aVarArr[i].a == id) {
                                return i;
                            }
                        }
                        continue;
                    }
                    view2 = (View) view2.getParent();
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public final void A(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.j == null) {
            RecyclerView.b0 b0Var2 = this.e;
        }
        this.j = wVar;
        this.e = b0Var;
        this.f = 0;
        this.g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r7 > r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r7 < r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
        r7 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B(int r7) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.B(int):int");
    }

    public final int C(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int childCount = getChildCount();
        if (this.c == 0) {
            while (i2 < childCount) {
                getChildAt(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < childCount) {
                getChildAt(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.t += i;
        M();
        this.b.invalidate();
        return i;
    }

    public final void D(int i, int i2, int i3, boolean z) {
        this.r = i3;
        View findViewByPosition = findViewByPosition(i);
        boolean z2 = true;
        boolean z3 = !isSmoothScrolling();
        com.amazon.aps.iva.f5.b bVar = this.b;
        if (z3 && !bVar.isLayoutRequested() && findViewByPosition != null && d(findViewByPosition) == i) {
            this.k |= 32;
            F(findViewByPosition, z);
            this.k &= -33;
            return;
        }
        int i4 = this.k;
        if ((i4 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && (i4 & 64) == 0) {
            if (z && !bVar.isLayoutRequested()) {
                this.m = i;
                this.n = i2;
                this.q = Integer.MIN_VALUE;
                if (this.F == null) {
                    z2 = false;
                }
                if (!z2) {
                    bVar.getId();
                    return;
                }
                g gVar = new g(this);
                gVar.setTargetPosition(i);
                startSmoothScroll(gVar);
                int targetPosition = gVar.getTargetPosition();
                if (targetPosition != this.m) {
                    this.m = targetPosition;
                    this.n = 0;
                    return;
                }
                return;
            }
            if (!z3) {
                c cVar = this.o;
                if (cVar != null) {
                    cVar.a = true;
                }
                bVar.stopScroll();
            }
            if (!bVar.isLayoutRequested() && findViewByPosition != null && d(findViewByPosition) == i) {
                this.k |= 32;
                F(findViewByPosition, z);
                this.k &= -33;
                return;
            }
            this.m = i;
            this.n = i2;
            this.q = Integer.MIN_VALUE;
            this.k |= 256;
            requestLayout();
            return;
        }
        this.m = i;
        this.n = i2;
        this.q = Integer.MIN_VALUE;
    }

    public final void E(View view, View view2, boolean z, int i, int i2) {
        if ((this.k & 64) != 0) {
            return;
        }
        int d2 = d(view);
        int l = l(view, view2);
        int i3 = this.m;
        com.amazon.aps.iva.f5.b bVar = this.b;
        if (d2 != i3 || l != this.n) {
            this.m = d2;
            this.n = l;
            this.q = 0;
            if ((this.k & 3) != 1) {
                b();
            }
            if (bVar.G()) {
                bVar.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && bVar.hasFocus()) {
            view.requestFocus();
        }
        if ((this.k & 131072) == 0 && z) {
            return;
        }
        int[] iArr = R;
        if (j(view, view2, iArr) || i != 0 || i2 != 0) {
            int i4 = iArr[0] + i;
            int i5 = iArr[1] + i2;
            if ((this.k & 3) == 1) {
                B(i4);
                C(i5);
                return;
            }
            if (this.c != 0) {
                i5 = i4;
                i4 = i5;
            }
            if (z) {
                bVar.smoothScrollBy(i4, i5);
                return;
            }
            bVar.scrollBy(i4, i5);
            c();
        }
    }

    public final void F(View view, boolean z) {
        E(view, view.findFocus(), z, 0, 0);
    }

    public final void G(int i) {
        if (i < 0 && i != -2) {
            throw new IllegalArgumentException(c0.a("Invalid row height: ", i));
        }
        this.u = i;
    }

    public final void H(int i, boolean z) {
        if ((this.m != i && i != -1) || this.n != 0 || this.r != 0) {
            D(i, 0, 0, z);
        }
    }

    public final void I() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            J(getChildAt(i));
        }
    }

    public final void J(View view) {
        d dVar = (d) view.getLayoutParams();
        k kVar = dVar.l;
        j jVar = this.I;
        if (kVar == null) {
            j.a aVar = jVar.b;
            dVar.i = l.a(view, aVar, aVar.e);
            j.a aVar2 = jVar.a;
            dVar.j = l.a(view, aVar2, aVar2.e);
            return;
        }
        int i = this.c;
        k.a[] aVarArr = kVar.a;
        int[] iArr = dVar.k;
        if (iArr == null || iArr.length != aVarArr.length) {
            dVar.k = new int[aVarArr.length];
        }
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            dVar.k[i2] = l.a(view, aVarArr[i2], i);
        }
        if (i == 0) {
            dVar.i = dVar.k[0];
        } else {
            dVar.j = dVar.k[0];
        }
        if (this.c == 0) {
            j.a aVar3 = jVar.a;
            dVar.j = l.a(view, aVar3, aVar3.e);
            return;
        }
        j.a aVar4 = jVar.b;
        dVar.i = l.a(view, aVar4, aVar4.e);
    }

    public final void K() {
        if (getChildCount() > 0) {
            this.f = this.F.f - ((d) getChildAt(0).getLayoutParams()).b();
        } else {
            this.f = 0;
        }
    }

    public final void L() {
        int i;
        int i2;
        int b2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int top;
        int i6;
        int top2;
        int i7;
        boolean z3;
        boolean z4;
        if (this.e.b() == 0) {
            return;
        }
        if ((this.k & 262144) == 0) {
            i3 = this.F.g;
            i = this.F.f;
            i2 = this.e.b() - 1;
            b2 = 0;
        } else {
            com.amazon.aps.iva.f5.e eVar = this.F;
            int i8 = eVar.f;
            i = eVar.g;
            i2 = 0;
            b2 = this.e.b() - 1;
            i3 = i8;
        }
        if (i3 >= 0 && i >= 0) {
            if (i3 == i2) {
                z = true;
            } else {
                z = false;
            }
            if (i == b2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            b0 b0Var = this.H;
            if (!z) {
                b0.a aVar = b0Var.c;
                if (aVar.a == Integer.MAX_VALUE) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && !z2) {
                    if (aVar.b == Integer.MIN_VALUE) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return;
                    }
                }
            }
            int[] iArr = R;
            if (z) {
                i10 = this.F.e(true, iArr);
                View findViewByPosition = findViewByPosition(iArr[1]);
                if (this.c == 0) {
                    d dVar = (d) findViewByPosition.getLayoutParams();
                    dVar.getClass();
                    top2 = findViewByPosition.getLeft() + dVar.e;
                    i7 = dVar.i;
                } else {
                    d dVar2 = (d) findViewByPosition.getLayoutParams();
                    dVar2.getClass();
                    top2 = findViewByPosition.getTop() + dVar2.f;
                    i7 = dVar2.j;
                }
                int i11 = i7 + top2;
                int[] iArr2 = ((d) findViewByPosition.getLayoutParams()).k;
                if (iArr2 != null && iArr2.length > 0) {
                    i4 = (iArr2[iArr2.length - 1] - iArr2[0]) + i11;
                } else {
                    i4 = i11;
                }
            } else {
                i4 = Integer.MAX_VALUE;
            }
            if (z2) {
                i9 = this.F.g(false, iArr);
                View findViewByPosition2 = findViewByPosition(iArr[1]);
                if (this.c == 0) {
                    d dVar3 = (d) findViewByPosition2.getLayoutParams();
                    dVar3.getClass();
                    top = findViewByPosition2.getLeft() + dVar3.e;
                    i6 = dVar3.i;
                } else {
                    d dVar4 = (d) findViewByPosition2.getLayoutParams();
                    dVar4.getClass();
                    top = findViewByPosition2.getTop() + dVar4.f;
                    i6 = dVar4.j;
                }
                i5 = top + i6;
            } else {
                i5 = Integer.MIN_VALUE;
            }
            b0Var.c.c(i9, i10, i5, i4);
        }
    }

    public final void M() {
        b0.a aVar = this.H.d;
        int i = aVar.j - this.t;
        int k = k() + i;
        aVar.c(i, k, i, k);
    }

    public final void a() {
        int i;
        com.amazon.aps.iva.f5.e eVar = this.F;
        if ((this.k & 262144) != 0) {
            i = (-this.K) - this.g;
        } else {
            i = this.J + this.K + this.g;
        }
        eVar.a(i, false);
    }

    public final void b() {
        boolean z;
        View findViewByPosition;
        ArrayList<p> arrayList = this.l;
        if (arrayList != null && arrayList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        int i = this.m;
        if (i == -1) {
            findViewByPosition = null;
        } else {
            findViewByPosition = findViewByPosition(i);
        }
        com.amazon.aps.iva.f5.b bVar = this.b;
        if (findViewByPosition != null) {
            RecyclerView.f0 childViewHolder = bVar.getChildViewHolder(findViewByPosition);
            int i2 = this.m;
            ArrayList<p> arrayList2 = this.l;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.l.get(size).a(bVar, childViewHolder, i2);
                }
            }
        } else {
            ArrayList<p> arrayList3 = this.l;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    this.l.get(size2).a(bVar, null, -1);
                }
            }
        }
        if ((this.k & 3) != 1 && !bVar.isLayoutRequested()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    WeakHashMap<View, r0> weakHashMap = g0.a;
                    g0.d.m(bVar, this.O);
                    return;
                }
            }
        }
    }

    public final void c() {
        boolean z;
        View findViewByPosition;
        ArrayList<p> arrayList = this.l;
        if (arrayList != null && arrayList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        int i = this.m;
        if (i == -1) {
            findViewByPosition = null;
        } else {
            findViewByPosition = findViewByPosition(i);
        }
        if (findViewByPosition != null) {
            this.b.getChildViewHolder(findViewByPosition);
            ArrayList<p> arrayList2 = this.l;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.l.get(size).getClass();
                    } else {
                        return;
                    }
                }
            }
        } else {
            ArrayList<p> arrayList3 = this.l;
            if (arrayList3 != null) {
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        this.l.get(size2).getClass();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean canScrollHorizontally() {
        if (this.c == 0 || this.D > 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean canScrollVertically() {
        if (this.c == 1 || this.D > 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int i3;
        try {
            A(null, b0Var);
            if (this.c != 0) {
                i = i2;
            }
            if (getChildCount() != 0 && i != 0) {
                if (i < 0) {
                    i3 = -this.K;
                } else {
                    i3 = this.J + this.K;
                }
                this.F.d(i3, i, cVar);
            }
        } finally {
            s();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void collectInitialPrefetchPositions(int i, RecyclerView.p.c cVar) {
        int i2 = this.b.g;
        if (i != 0 && i2 != 0) {
            int max = Math.max(0, Math.min(this.m - ((i2 - 1) / 2), i - i2));
            for (int i3 = max; i3 < i && i3 < max + i2; i3++) {
                ((p.b) cVar).a(i3, 0);
            }
        }
    }

    public final int e(View view) {
        d dVar = (d) view.getLayoutParams();
        return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
    }

    public final int f(View view) {
        d dVar = (d) view.getLayoutParams();
        return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
        if (r10 != 130) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        if ((r9.k & 524288) == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
        if ((r9.k & 524288) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r10 != 130) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(int r10) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 17
            if (r0 != 0) goto L2b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L25
            if (r10 == r3) goto L23
            if (r10 == r2) goto L1d
            if (r10 == r1) goto L1b
            goto L46
        L1b:
            r4 = r5
            goto L47
        L1d:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 != 0) goto L47
            goto L38
        L23:
            r4 = r6
            goto L47
        L25:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 != 0) goto L38
            goto L47
        L2b:
            if (r0 != r7) goto L46
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L40
            if (r10 == r3) goto L47
            if (r10 == r2) goto L3a
            if (r10 == r1) goto L38
            goto L46
        L38:
            r4 = r7
            goto L47
        L3a:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 != 0) goto L23
            goto L1b
        L40:
            int r10 = r9.k
            r10 = r10 & r0
            if (r10 != 0) goto L1b
            goto L23
        L46:
            r4 = r8
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.g(int):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateDefaultLayoutParams() {
        return new d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.f5.e eVar;
        if (this.c == 1 && (eVar = this.F) != null) {
            return eVar.e;
        }
        return super.getColumnCountForAccessibility(wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getDecoratedBottom(View view) {
        return super.getDecoratedBottom(view) - ((d) view.getLayoutParams()).h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        d dVar = (d) view.getLayoutParams();
        rect.left += dVar.e;
        rect.top += dVar.f;
        rect.right -= dVar.g;
        rect.bottom -= dVar.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getDecoratedLeft(View view) {
        return super.getDecoratedLeft(view) + ((d) view.getLayoutParams()).e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getDecoratedRight(View view) {
        return super.getDecoratedRight(view) - ((d) view.getLayoutParams()).g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getDecoratedTop(View view) {
        return super.getDecoratedTop(view) + ((d) view.getLayoutParams()).f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        com.amazon.aps.iva.f5.e eVar;
        if (this.c == 0 && (eVar = this.F) != null) {
            return eVar.e;
        }
        return super.getRowCountForAccessibility(wVar, b0Var);
    }

    public final int h(int i) {
        int i2 = this.v;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.w;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    public final int i(int i) {
        int i2 = 0;
        if ((this.k & 524288) != 0) {
            for (int i3 = this.D - 1; i3 > i; i3--) {
                i2 += h(i3) + this.B;
            }
            return i2;
        }
        int i4 = 0;
        while (i2 < i) {
            i4 += h(i2) + this.B;
            i2++;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.View r17, android.view.View r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.j(android.view.View, android.view.View, int[]):boolean");
    }

    public final int k() {
        int i;
        if ((this.k & 524288) != 0) {
            i = 0;
        } else {
            i = this.D - 1;
        }
        return h(i) + i(i);
    }

    public final int m(View view) {
        return this.d.b(view);
    }

    public final int n(View view) {
        return this.d.e(view);
    }

    public final boolean o() {
        if (getItemCount() != 0 && this.b.findViewHolderForAdapterPosition(0) == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        if (hVar != null) {
            this.F = null;
            this.w = null;
            this.k &= -1025;
            this.m = -1;
            this.q = 0;
            com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = this.M.c;
            if (gVar != null) {
                gVar.evictAll();
            }
        }
        if (hVar2 instanceof com.amazon.aps.iva.f5.d) {
            this.N = (com.amazon.aps.iva.f5.d) hVar2;
        } else {
            this.N = null;
        }
        super.onAdapterChanged(hVar, hVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList<android.view.View> r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.onAddFocusables(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, com.amazon.aps.iva.q3.l lVar) {
        boolean z;
        l.a aVar;
        l.a aVar2;
        A(wVar, b0Var);
        int b2 = b0Var.b();
        if ((this.k & 262144) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (b2 > 1 && !q(0)) {
            if (this.c == 0) {
                if (z) {
                    aVar2 = l.a.r;
                } else {
                    aVar2 = l.a.p;
                }
                lVar.b(aVar2);
            } else {
                lVar.b(l.a.o);
            }
            lVar.l(true);
        }
        if (b2 > 1 && !q(b2 - 1)) {
            if (this.c == 0) {
                if (z) {
                    aVar = l.a.p;
                } else {
                    aVar = l.a.r;
                }
                lVar.b(aVar);
            } else {
                lVar.b(l.a.q);
            }
            lVar.l(true);
        }
        lVar.i(l.f.a(getRowCountForAccessibility(wVar, b0Var), getColumnCountForAccessibility(wVar, b0Var), getSelectionModeForAccessibility(wVar, b0Var), isLayoutHierarchical(wVar, b0Var)));
        s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, com.amazon.aps.iva.q3.l lVar) {
        e.a j;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.F != null && (layoutParams instanceof d)) {
            int a2 = ((d) layoutParams).a();
            int i = -1;
            if (a2 >= 0 && (j = this.F.j(a2)) != null) {
                i = j.a;
            }
            int i2 = i;
            if (i2 < 0) {
                return;
            }
            int i3 = a2 / this.F.e;
            if (this.c == 0) {
                lVar.j(l.g.a(i2, 1, i3, 1, false, false));
            } else {
                lVar.j(l.g.a(i3, 1, i2, 1, false, false));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onInterceptFocusSearch(android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.onInterceptFocusSearch(android.view.View, int):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.f5.e eVar;
        int i3;
        int i4 = this.m;
        if (i4 != -1 && (eVar = this.F) != null && eVar.f >= 0 && (i3 = this.q) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.q = i3 + i2;
        }
        com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = this.M.c;
        if (gVar != null) {
            gVar.evictAll();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.q = 0;
        com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = this.M.c;
        if (gVar != null) {
            gVar.evictAll();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        int i4;
        int i5 = this.m;
        if (i5 != -1 && (i4 = this.q) != Integer.MIN_VALUE) {
            int i6 = i5 + i4;
            if (i <= i6 && i6 < i + i3) {
                this.q = (i2 - i) + i4;
            } else if (i < i6 && i2 > i6 - i3) {
                this.q = i4 - i3;
            } else if (i > i6 && i2 < i6) {
                this.q = i4 + i3;
            }
        }
        com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = this.M.c;
        if (gVar != null) {
            gVar.evictAll();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        com.amazon.aps.iva.f5.e eVar;
        int i3;
        int i4;
        int i5 = this.m;
        if (i5 != -1 && (eVar = this.F) != null && eVar.f >= 0 && (i3 = this.q) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.m = (i - i4) + i3 + i5;
                this.q = Integer.MIN_VALUE;
            } else {
                this.q = i3 - i2;
            }
        }
        com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = this.M.c;
        if (gVar != null) {
            gVar.evictAll();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            a0 a0Var = this.M;
            com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = a0Var.c;
            if (gVar != null && gVar.size() != 0) {
                a0Var.c.remove(Integer.toString(i));
            }
            i++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 447
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.w r28, androidx.recyclerview.widget.RecyclerView.b0 r29) {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onMeasure(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i, int i2) {
        int size;
        int size2;
        int mode;
        int paddingLeft;
        int paddingRight;
        int i3;
        A(wVar, b0Var);
        if (this.c == 0) {
            size2 = View.MeasureSpec.getSize(i);
            size = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i2);
            paddingLeft = getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i);
            size2 = View.MeasureSpec.getSize(i2);
            mode = View.MeasureSpec.getMode(i);
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int i4 = paddingRight + paddingLeft;
        this.x = size;
        int i5 = this.u;
        if (i5 == -2) {
            int i6 = this.E;
            if (i6 == 0) {
                i6 = 1;
            }
            this.D = i6;
            this.v = 0;
            int[] iArr = this.w;
            if (iArr == null || iArr.length != i6) {
                this.w = new int[i6];
            }
            if (this.e.g) {
                K();
            }
            w(true);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        size = this.x;
                    } else {
                        throw new IllegalStateException("wrong spec");
                    }
                } else {
                    i3 = k();
                    size = i3 + i4;
                }
            } else {
                size = Math.min(k() + i4, this.x);
            }
        } else {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        throw new IllegalStateException("wrong spec");
                    }
                } else {
                    if (i5 == 0) {
                        i5 = size - i4;
                    }
                    this.v = i5;
                    int i7 = this.E;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    this.D = i7;
                    i3 = ((i7 - 1) * this.B) + (i5 * i7);
                    size = i3 + i4;
                }
            }
            int i8 = this.E;
            if (i8 == 0 && i5 == 0) {
                this.D = 1;
                this.v = size - i4;
            } else if (i8 == 0) {
                this.v = i5;
                int i9 = this.B;
                this.D = (size + i9) / (i5 + i9);
            } else if (i5 == 0) {
                this.D = i8;
                this.v = ((size - i4) - ((i8 - 1) * this.B)) / i8;
            } else {
                this.D = i8;
                this.v = i5;
            }
            if (mode == Integer.MIN_VALUE) {
                int i10 = this.v;
                int i11 = this.D;
                int i12 = ((i11 - 1) * this.B) + (i10 * i11) + i4;
                if (i12 < size) {
                    size = i12;
                }
            }
        }
        if (this.c == 0) {
            setMeasuredDimension(size2, size);
        } else {
            setMeasuredDimension(size, size2);
        }
        s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        if ((this.k & 32768) == 0 && d(view) != -1 && (this.k & 35) == 0) {
            E(view, view2, true, 0, 0);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0240f)) {
            return;
        }
        C0240f c0240f = (C0240f) parcelable;
        this.m = c0240f.b;
        this.q = 0;
        Bundle bundle = c0240f.c;
        a0 a0Var = this.M;
        com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = a0Var.c;
        if (gVar != null && bundle != null) {
            gVar.evictAll();
            for (String str : bundle.keySet()) {
                a0Var.c.put(str, bundle.getSparseParcelableArray(str));
            }
        }
        this.k |= 256;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final Parcelable onSaveInstanceState() {
        Bundle bundle;
        C0240f c0240f = new C0240f();
        c0240f.b = this.m;
        a0 a0Var = this.M;
        com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = a0Var.c;
        if (gVar != null && gVar.size() != 0) {
            Map<String, SparseArray<Parcelable>> snapshot = a0Var.c.snapshot();
            bundle = new Bundle();
            for (Map.Entry<String, SparseArray<Parcelable>> entry : snapshot.entrySet()) {
                bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
            }
        } else {
            bundle = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int d2 = d(childAt);
            if (d2 != -1 && a0Var.a != 0) {
                String num = Integer.toString(d2);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                childAt.saveHierarchyState(sparseArray);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray(num, sparseArray);
            }
        }
        c0240f.c = bundle;
        return c0240f;
    }

    public final boolean p() {
        int itemCount = getItemCount();
        if (itemCount == 0 || this.b.findViewHolderForAdapterPosition(itemCount - 1) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        r6 = 4096;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r6 == com.amazon.aps.iva.q3.l.a.q.a()) goto L15;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.w r4, androidx.recyclerview.widget.RecyclerView.b0 r5, int r6, android.os.Bundle r7) {
        /*
            r3 = this;
            int r7 = r3.k
            r0 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r0
            r0 = 0
            r1 = 1
            if (r7 == 0) goto Lb
            r7 = r1
            goto Lc
        Lb:
            r7 = r0
        Lc:
            if (r7 != 0) goto Lf
            return r1
        Lf:
            r3.A(r4, r5)
            int r4 = r3.k
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L1b
            r4 = r1
            goto L1c
        L1b:
            r4 = r0
        L1c:
            int r5 = r3.c
            r7 = 8192(0x2000, float:1.14794E-41)
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 != 0) goto L3d
            com.amazon.aps.iva.q3.l$a r5 = com.amazon.aps.iva.q3.l.a.p
            int r5 = r5.a()
            if (r6 != r5) goto L32
            if (r4 == 0) goto L30
        L2e:
            r6 = r2
            goto L4f
        L30:
            r6 = r7
            goto L4f
        L32:
            com.amazon.aps.iva.q3.l$a r5 = com.amazon.aps.iva.q3.l.a.r
            int r5 = r5.a()
            if (r6 != r5) goto L4f
            if (r4 == 0) goto L2e
            goto L30
        L3d:
            com.amazon.aps.iva.q3.l$a r4 = com.amazon.aps.iva.q3.l.a.o
            int r4 = r4.a()
            if (r6 != r4) goto L46
            goto L30
        L46:
            com.amazon.aps.iva.q3.l$a r4 = com.amazon.aps.iva.q3.l.a.q
            int r4 = r4.a()
            if (r6 != r4) goto L4f
            goto L2e
        L4f:
            if (r6 == r2) goto L5c
            if (r6 == r7) goto L54
            goto L62
        L54:
            r3.v(r0)
            r4 = -1
            r3.x(r4, r0)
            goto L62
        L5c:
            r3.v(r1)
            r3.x(r1, r0)
        L62:
            r3.s()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, int, android.os.Bundle):boolean");
    }

    public final boolean q(int i) {
        com.amazon.aps.iva.f5.b bVar = this.b;
        RecyclerView.f0 findViewHolderForAdapterPosition = bVar.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView.getLeft() < 0 || findViewHolderForAdapterPosition.itemView.getRight() > bVar.getWidth() || findViewHolderForAdapterPosition.itemView.getTop() < 0 || findViewHolderForAdapterPosition.itemView.getBottom() > bVar.getHeight()) {
            return false;
        }
        return true;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        int f;
        int i5;
        int h;
        int i6;
        if (this.c == 0) {
            f = e(view);
        } else {
            f = f(view);
        }
        int i7 = this.v;
        if (i7 > 0) {
            f = Math.min(f, i7);
        }
        int i8 = this.C;
        int i9 = i8 & 112;
        if ((this.k & 786432) != 0) {
            i5 = Gravity.getAbsoluteGravity(i8 & 8388615, 1);
        } else {
            i5 = i8 & 7;
        }
        int i10 = this.c;
        if ((i10 != 0 || i9 != 48) && (i10 != 1 || i5 != 3)) {
            if ((i10 == 0 && i9 == 80) || (i10 == 1 && i5 == 5)) {
                h = h(i) - f;
            } else if ((i10 == 0 && i9 == 16) || (i10 == 1 && i5 == 1)) {
                h = (h(i) - f) / 2;
            }
            i4 += h;
        }
        if (this.c == 0) {
            i6 = f + i4;
        } else {
            int i11 = f + i4;
            int i12 = i4;
            i4 = i2;
            i2 = i12;
            i6 = i3;
            i3 = i11;
        }
        d dVar = (d) view.getLayoutParams();
        layoutDecoratedWithMargins(view, i2, i4, i3, i6);
        Rect rect = Q;
        super.getDecoratedBoundsWithMargins(view, rect);
        int i13 = i2 - rect.left;
        int i14 = i4 - rect.top;
        int i15 = rect.right - i3;
        dVar.e = i13;
        dVar.f = i14;
        dVar.g = i15;
        dVar.h = rect.bottom - i6;
        J(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void removeAndRecycleAllViews(RecyclerView.w wVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            removeAndRecycleViewAt(childCount, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    public final void s() {
        this.j = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int scrollHorizontallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z;
        int C;
        if ((this.k & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            if (this.F != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                A(wVar, b0Var);
                this.k = (this.k & (-4)) | 2;
                if (this.c == 0) {
                    C = B(i);
                } else {
                    C = C(i);
                }
                s();
                this.k &= -4;
                return C;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void scrollToPosition(int i) {
        H(i, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final int scrollVerticallyBy(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        boolean z;
        int C;
        int i2 = this.k;
        if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            if (this.F != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.k = (i2 & (-4)) | 2;
                A(wVar, b0Var);
                if (this.c == 1) {
                    C = B(i);
                } else {
                    C = C(i);
                }
                s();
                this.k &= -4;
                return C;
            }
        }
        return 0;
    }

    public final void setOrientation(int i) {
        if (i != 0 && i != 1) {
            return;
        }
        this.c = i;
        this.d = androidx.recyclerview.widget.a0.a(this, i);
        b0 b0Var = this.H;
        b0Var.getClass();
        b0.a aVar = b0Var.b;
        b0.a aVar2 = b0Var.a;
        if (i == 0) {
            b0Var.c = aVar;
            b0Var.d = aVar2;
        } else {
            b0Var.c = aVar2;
            b0Var.d = aVar;
        }
        j jVar = this.I;
        jVar.getClass();
        if (i == 0) {
            jVar.c = jVar.b;
        } else {
            jVar.c = jVar.a;
        }
        this.k |= 256;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i) {
        H(i, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void startSmoothScroll(RecyclerView.a0 a0Var) {
        c cVar = this.o;
        if (cVar != null) {
            cVar.a = true;
        }
        super.startSmoothScroll(a0Var);
        if (a0Var.isRunning() && (a0Var instanceof c)) {
            c cVar2 = (c) a0Var;
            this.o = cVar2;
            if (cVar2 instanceof e) {
                this.p = (e) cVar2;
                return;
            } else {
                this.p = null;
                return;
            }
        }
        this.o = null;
        this.p = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean supportsPredictiveItemAnimations() {
        return true;
    }

    public final void t(View view) {
        int makeMeasureSpec;
        int childMeasureSpec;
        int i;
        d dVar = (d) view.getLayoutParams();
        Rect rect = Q;
        calculateItemDecorationsForChild(view, rect);
        int i2 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin + rect.left + rect.right;
        int i3 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin + rect.top + rect.bottom;
        if (this.u == -2) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.v, Ints.MAX_POWER_OF_TWO);
        }
        if (this.c == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i2, ((ViewGroup.MarginLayoutParams) dVar).width);
            i = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i3, ((ViewGroup.MarginLayoutParams) dVar).height);
        } else {
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i3, ((ViewGroup.MarginLayoutParams) dVar).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i2, ((ViewGroup.MarginLayoutParams) dVar).width);
            i = childMeasureSpec2;
        }
        view.measure(childMeasureSpec, i);
    }

    public final void u() {
        int i;
        com.amazon.aps.iva.f5.e eVar = this.F;
        if ((this.k & 262144) != 0) {
            i = this.J + this.K + this.g;
        } else {
            i = (-this.K) - this.g;
        }
        eVar.l(i, false);
    }

    public final void v(boolean z) {
        if (z) {
            if (p()) {
                return;
            }
        } else if (o()) {
            return;
        }
        e eVar = this.p;
        int i = -1;
        boolean z2 = true;
        if (eVar == null) {
            this.b.stopScroll();
            if (z) {
                i = 1;
            }
            if (this.D <= 1) {
                z2 = false;
            }
            e eVar2 = new e(i, z2);
            this.q = 0;
            startSmoothScroll(eVar2);
        } else if (z) {
            int i2 = eVar.d;
            if (i2 < f.this.a) {
                eVar.d = i2 + 1;
            }
        } else {
            int i3 = eVar.d;
            if (i3 > (-f.this.a)) {
                eVar.d = i3 - 1;
            }
        }
    }

    public final boolean w(boolean z) {
        com.amazon.aps.iva.x.d[] i;
        com.amazon.aps.iva.x.d dVar;
        int i2;
        int i3;
        int f;
        if (this.v != 0 || this.w == null) {
            return false;
        }
        com.amazon.aps.iva.f5.e eVar = this.F;
        if (eVar == null) {
            i = null;
        } else {
            i = eVar.i(eVar.f, eVar.g);
        }
        boolean z2 = false;
        int i4 = -1;
        for (int i5 = 0; i5 < this.D; i5++) {
            if (i == null) {
                dVar = null;
            } else {
                dVar = i[i5];
            }
            if (dVar == null) {
                i2 = 0;
            } else {
                i2 = (dVar.c - dVar.b) & dVar.d;
            }
            int i6 = -1;
            for (int i7 = 0; i7 < i2; i7 += 2) {
                int b2 = dVar.b(i7 + 1);
                for (int b3 = dVar.b(i7); b3 <= b2; b3++) {
                    View findViewByPosition = findViewByPosition(b3 - this.f);
                    if (findViewByPosition != null) {
                        if (z) {
                            t(findViewByPosition);
                        }
                        if (this.c == 0) {
                            f = e(findViewByPosition);
                        } else {
                            f = f(findViewByPosition);
                        }
                        if (f > i6) {
                            i6 = f;
                        }
                    }
                }
            }
            int b4 = this.e.b();
            com.amazon.aps.iva.f5.b bVar = this.b;
            if (!bVar.hasFixedSize() && z && i6 < 0 && b4 > 0) {
                if (i4 < 0) {
                    int i8 = this.m;
                    if (i8 < 0) {
                        i8 = 0;
                    } else if (i8 >= b4) {
                        i8 = b4 - 1;
                    }
                    if (getChildCount() > 0) {
                        int layoutPosition = bVar.getChildViewHolder(getChildAt(0)).getLayoutPosition();
                        int layoutPosition2 = bVar.getChildViewHolder(getChildAt(getChildCount() - 1)).getLayoutPosition();
                        if (i8 >= layoutPosition && i8 <= layoutPosition2) {
                            i8 = i8 - layoutPosition <= layoutPosition2 - i8 ? layoutPosition - 1 : layoutPosition2 + 1;
                            if (i8 < 0 && layoutPosition2 < b4 - 1) {
                                i8 = layoutPosition2 + 1;
                            } else if (i8 >= b4 && layoutPosition > 0) {
                                i8 = layoutPosition - 1;
                            }
                        }
                    }
                    if (i8 >= 0 && i8 < b4) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        View d2 = this.j.d(i8);
                        int[] iArr = this.L;
                        if (d2 != null) {
                            d dVar2 = (d) d2.getLayoutParams();
                            Rect rect = Q;
                            calculateItemDecorationsForChild(d2, rect);
                            d2.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) dVar2).width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) dVar2).height));
                            iArr[0] = f(d2);
                            iArr[1] = e(d2);
                            this.j.j(d2);
                        }
                        if (this.c == 0) {
                            i3 = iArr[1];
                        } else {
                            i3 = iArr[0];
                        }
                        i4 = i3;
                    }
                }
                if (i4 >= 0) {
                    i6 = i4;
                }
            }
            if (i6 < 0) {
                i6 = 0;
            }
            int[] iArr2 = this.w;
            if (iArr2[i5] != i6) {
                iArr2[i5] = i6;
                z2 = true;
            }
        }
        return z2;
    }

    public final int x(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        e.a j;
        com.amazon.aps.iva.f5.e eVar = this.F;
        if (eVar == null) {
            return i;
        }
        int i5 = this.m;
        if (i5 != -1 && (j = eVar.j(i5)) != null) {
            i2 = j.a;
        } else {
            i2 = -1;
        }
        int childCount = getChildCount();
        View view = null;
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            if (i6 >= childCount || i == 0) {
                break;
            }
            if (i > 0) {
                i3 = i6;
            } else {
                i3 = (childCount - 1) - i6;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 0 || (hasFocus() && !childAt.hasFocusable())) {
                z2 = false;
            }
            if (z2) {
                int d2 = d(getChildAt(i3));
                e.a j2 = this.F.j(d2);
                if (j2 == null) {
                    i4 = -1;
                } else {
                    i4 = j2.a;
                }
                if (i2 == -1) {
                    i5 = d2;
                    i2 = i4;
                } else if (i4 == i2 && ((i > 0 && d2 > i5) || (i < 0 && d2 < i5))) {
                    if (i > 0) {
                        i--;
                    } else {
                        i++;
                    }
                    i5 = d2;
                }
                view = childAt;
            }
            i6++;
        }
        if (view != null) {
            if (z) {
                if (hasFocus()) {
                    this.k |= 32;
                    view.requestFocus();
                    this.k &= -33;
                }
                this.m = i5;
                this.n = 0;
            } else {
                F(view, true);
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r7 = this;
            int r0 = r7.k
            r1 = 65600(0x10040, float:9.1925E-41)
            r1 = r1 & r0
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r2) goto L74
            com.amazon.aps.iva.f5.e r1 = r7.F
            int r2 = r7.m
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L17
            int r0 = r7.K
            int r0 = -r0
            goto L1c
        L17:
            int r0 = r7.J
            int r3 = r7.K
            int r0 = r0 + r3
        L1c:
            int r3 = r1.g
            int r4 = r1.f
            if (r3 < r4) goto L69
            if (r3 <= r2) goto L69
            boolean r4 = r1.c
            r5 = 1
            if (r4 != 0) goto L34
            com.amazon.aps.iva.f5.e$b r4 = r1.b
            com.amazon.aps.iva.f5.f$b r4 = (com.amazon.aps.iva.f5.f.b) r4
            int r3 = r4.d(r3)
            if (r3 < r0) goto L40
            goto L3e
        L34:
            com.amazon.aps.iva.f5.e$b r4 = r1.b
            com.amazon.aps.iva.f5.f$b r4 = (com.amazon.aps.iva.f5.f.b) r4
            int r3 = r4.d(r3)
            if (r3 > r0) goto L40
        L3e:
            r3 = r5
            goto L41
        L40:
            r3 = 0
        L41:
            if (r3 == 0) goto L69
            com.amazon.aps.iva.f5.e$b r3 = r1.b
            int r4 = r1.g
            com.amazon.aps.iva.f5.f$b r3 = (com.amazon.aps.iva.f5.f.b) r3
            com.amazon.aps.iva.f5.f r3 = com.amazon.aps.iva.f5.f.this
            int r6 = r3.f
            int r4 = r4 - r6
            android.view.View r4 = r3.findViewByPosition(r4)
            int r6 = r3.k
            r6 = r6 & 3
            if (r6 != r5) goto L5e
            androidx.recyclerview.widget.RecyclerView$w r6 = r3.j
            r3.detachAndScrapView(r4, r6)
            goto L63
        L5e:
            androidx.recyclerview.widget.RecyclerView$w r6 = r3.j
            r3.removeAndRecycleView(r4, r6)
        L63:
            int r3 = r1.g
            int r3 = r3 - r5
            r1.g = r3
            goto L1c
        L69:
            int r0 = r1.g
            int r2 = r1.f
            if (r0 >= r2) goto L74
            r0 = -1
            r1.g = r0
            r1.f = r0
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.y():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        if ((((com.amazon.aps.iva.f5.f.b) r1.b).d(r1.f) + r3) <= r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if ((((com.amazon.aps.iva.f5.f.b) r1.b).d(r1.f) - r3) >= r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() {
        /*
            r7 = this;
            int r0 = r7.k
            r1 = 65600(0x10040, float:9.1925E-41)
            r1 = r1 & r0
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r2) goto L82
            com.amazon.aps.iva.f5.e r1 = r7.F
            int r2 = r7.m
            r3 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L19
            int r0 = r7.J
            int r3 = r7.K
            int r0 = r0 + r3
            goto L1c
        L19:
            int r0 = r7.K
            int r0 = -r0
        L1c:
            int r3 = r1.g
            int r4 = r1.f
            if (r3 < r4) goto L77
            if (r4 >= r2) goto L77
            com.amazon.aps.iva.f5.e$b r3 = r1.b
            com.amazon.aps.iva.f5.f$b r3 = (com.amazon.aps.iva.f5.f.b) r3
            int r3 = r3.e(r4)
            boolean r4 = r1.c
            r5 = 1
            if (r4 != 0) goto L3f
            com.amazon.aps.iva.f5.e$b r4 = r1.b
            int r6 = r1.f
            com.amazon.aps.iva.f5.f$b r4 = (com.amazon.aps.iva.f5.f.b) r4
            int r4 = r4.d(r6)
            int r4 = r4 + r3
            if (r4 > r0) goto L4e
            goto L4c
        L3f:
            com.amazon.aps.iva.f5.e$b r4 = r1.b
            int r6 = r1.f
            com.amazon.aps.iva.f5.f$b r4 = (com.amazon.aps.iva.f5.f.b) r4
            int r4 = r4.d(r6)
            int r4 = r4 - r3
            if (r4 < r0) goto L4e
        L4c:
            r3 = r5
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 == 0) goto L77
            com.amazon.aps.iva.f5.e$b r3 = r1.b
            int r4 = r1.f
            com.amazon.aps.iva.f5.f$b r3 = (com.amazon.aps.iva.f5.f.b) r3
            com.amazon.aps.iva.f5.f r3 = com.amazon.aps.iva.f5.f.this
            int r6 = r3.f
            int r4 = r4 - r6
            android.view.View r4 = r3.findViewByPosition(r4)
            int r6 = r3.k
            r6 = r6 & 3
            if (r6 != r5) goto L6c
            androidx.recyclerview.widget.RecyclerView$w r6 = r3.j
            r3.detachAndScrapView(r4, r6)
            goto L71
        L6c:
            androidx.recyclerview.widget.RecyclerView$w r6 = r3.j
            r3.removeAndRecycleView(r4, r6)
        L71:
            int r3 = r1.f
            int r3 = r3 + r5
            r1.f = r3
            goto L1c
        L77:
            int r0 = r1.g
            int r2 = r1.f
            if (r0 >= r2) goto L82
            r0 = -1
            r1.g = r0
            r1.f = r0
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.f.z():void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.q) {
            return new d((RecyclerView.q) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    /* compiled from: GridLayoutManager.java */
    /* renamed from: com.amazon.aps.iva.f5.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0240f implements Parcelable {
        public static final Parcelable.Creator<C0240f> CREATOR = new a();
        public int b;
        public Bundle c;

        /* compiled from: GridLayoutManager.java */
        /* renamed from: com.amazon.aps.iva.f5.f$f$a */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<C0240f> {
            @Override // android.os.Parcelable.Creator
            public final C0240f createFromParcel(Parcel parcel) {
                return new C0240f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0240f[] newArray(int i) {
                return new C0240f[i];
            }
        }

        public C0240f(Parcel parcel) {
            this.c = Bundle.EMPTY;
            this.b = parcel.readInt();
            this.c = parcel.readBundle(f.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeBundle(this.c);
        }

        public C0240f() {
            this.c = Bundle.EMPTY;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onLayoutCompleted(RecyclerView.b0 b0Var) {
    }
}
