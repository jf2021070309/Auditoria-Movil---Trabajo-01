package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.k3.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public static final ThreadLocal<p> f = new ThreadLocal<>();
    public static final a g = new a();
    public long c;
    public long d;
    public final ArrayList<RecyclerView> b = new ArrayList<>();
    public final ArrayList<c> e = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.p.c r7, androidx.recyclerview.widget.p.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.p$c r7 = (androidx.recyclerview.widget.p.c) r7
                androidx.recyclerview.widget.p$c r8 = (androidx.recyclerview.widget.p.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.a
                boolean r3 = r8.a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.b
                int r2 = r7.b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.c
                int r8 = r8.c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.d * 2;
                    int[] iArr = this.c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i3 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 2];
                        this.c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.c;
                    iArr4[i3] = i;
                    iArr4[i3 + 1] = i2;
                    this.d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && pVar != null && pVar.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.g()) {
                        pVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    pVar.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.mState, this);
                }
                int i = this.d;
                if (i > pVar.mPrefetchMaxCountObserved) {
                    pVar.mPrefetchMaxCountObserved = i;
                    pVar.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.o();
                }
            }
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.f0 c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.mChildHelper.h();
        int i2 = 0;
        while (true) {
            if (i2 < h) {
                RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i2));
                if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.f0 m = wVar.m(i, j);
            if (m != null) {
                if (m.isBound() && !m.isInvalid()) {
                    wVar.j(m.itemView);
                } else {
                    wVar.a(m, false);
                }
            }
            return m;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.c == 0) {
            this.c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.a = i;
        bVar.b = i2;
    }

    public final void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z;
        ArrayList<RecyclerView> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.d;
            }
        }
        ArrayList<c> arrayList2 = this.e;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar2.a = z;
                    cVar2.b = abs;
                    cVar2.c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, g);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i7)).d) != null; i7++) {
            if (cVar.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            RecyclerView.f0 c2 = c(recyclerView, cVar.e, j2);
            if (c2 != null && c2.mNestedRecyclerView != null && c2.isBound() && !c2.isInvalid() && (recyclerView2 = c2.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i8 = com.amazon.aps.iva.k3.m.a;
                        m.a.a("RV Nested Prefetch");
                        RecyclerView.b0 b0Var = recyclerView2.mState;
                        RecyclerView.h hVar = recyclerView2.mAdapter;
                        b0Var.d = 1;
                        b0Var.e = hVar.getItemCount();
                        b0Var.g = false;
                        b0Var.h = false;
                        b0Var.i = false;
                        for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                            c(recyclerView2, bVar2.c[i9], j);
                        }
                        m.a.b();
                        cVar.a = false;
                        cVar.b = 0;
                        cVar.c = 0;
                        cVar.d = null;
                        cVar.e = 0;
                    } catch (Throwable th) {
                        int i10 = com.amazon.aps.iva.k3.m.a;
                        m.a.b();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = com.amazon.aps.iva.k3.m.a;
            m.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.b;
            if (arrayList.isEmpty()) {
                this.c = 0L;
                m.a.b();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.c = 0L;
                m.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j) + this.d);
            this.c = 0L;
            m.a.b();
        } catch (Throwable th) {
            this.c = 0L;
            int i3 = com.amazon.aps.iva.k3.m.a;
            m.a.b();
            throw th;
        }
    }
}
