package c.u.b;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n implements Runnable {
    public static final ThreadLocal<n> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static Comparator<c> f2677b = new a();

    /* renamed from: d  reason: collision with root package name */
    public long f2679d;

    /* renamed from: e  reason: collision with root package name */
    public long f2680e;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<RecyclerView> f2678c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<c> f2681f = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return r1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(c.u.b.n.c r7, c.u.b.n.c r8) {
            /*
                r6 = this;
                c.u.b.n$c r7 = (c.u.b.n.c) r7
                c.u.b.n$c r8 = (c.u.b.n.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2687d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2687d
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.a
                boolean r3 = r8.a
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.f2685b
                int r1 = r7.f2685b
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.f2686c
                int r8 = r8.f2686c
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: c.u.b.n.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.m.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2682b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2683c;

        /* renamed from: d  reason: collision with root package name */
        public int f2684d;

        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f2684d * 2;
            int[] iArr = this.f2683c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2683c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f2683c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2683c;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f2684d++;
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.f2684d = 0;
            int[] iArr = this.f2683c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.t;
            if (recyclerView.s == null || mVar == null || !mVar.f557k) {
                return;
            }
            if (z) {
                if (!recyclerView.f522k.g()) {
                    mVar.l(recyclerView.s.b(), this);
                }
            } else if (!recyclerView.P()) {
                mVar.k(this.a, this.f2682b, recyclerView.t0, this);
            }
            int i2 = this.f2684d;
            if (i2 > mVar.f558l) {
                mVar.f558l = i2;
                mVar.f559m = z;
                recyclerView.f520i.m();
            }
        }

        public boolean c(int i2) {
            if (this.f2683c != null) {
                int i3 = this.f2684d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f2683c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f2685b;

        /* renamed from: c  reason: collision with root package name */
        public int f2686c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2687d;

        /* renamed from: e  reason: collision with root package name */
        public int f2688e;
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f2679d == 0) {
            this.f2679d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.s0;
        bVar.a = i2;
        bVar.f2682b = i3;
    }

    public void b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2678c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = this.f2678c.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.s0.b(recyclerView3, false);
                i2 += recyclerView3.s0.f2684d;
            }
        }
        this.f2681f.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = this.f2678c.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.s0;
                int abs = Math.abs(bVar.f2682b) + Math.abs(bVar.a);
                for (int i6 = 0; i6 < bVar.f2684d * 2; i6 += 2) {
                    if (i4 >= this.f2681f.size()) {
                        cVar2 = new c();
                        this.f2681f.add(cVar2);
                    } else {
                        cVar2 = this.f2681f.get(i4);
                    }
                    int[] iArr = bVar.f2683c;
                    int i7 = iArr[i6 + 1];
                    cVar2.a = i7 <= abs;
                    cVar2.f2685b = abs;
                    cVar2.f2686c = i7;
                    cVar2.f2687d = recyclerView4;
                    cVar2.f2688e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f2681f, f2677b);
        for (int i8 = 0; i8 < this.f2681f.size() && (recyclerView = (cVar = this.f2681f.get(i8)).f2687d) != null; i8++) {
            RecyclerView.a0 c2 = c(recyclerView, cVar.f2688e, cVar.a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.f528c != null && c2.l() && !c2.m() && (recyclerView2 = c2.f528c.get()) != null) {
                if (recyclerView2.L && recyclerView2.f523l.h() != 0) {
                    recyclerView2.h0();
                }
                b bVar2 = recyclerView2.s0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2684d != 0) {
                    try {
                        int i9 = c.i.g.g.a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.t0;
                        RecyclerView.e eVar = recyclerView2.s;
                        xVar.f593d = 1;
                        xVar.f594e = eVar.b();
                        xVar.f596g = false;
                        xVar.f597h = false;
                        xVar.f598i = false;
                        for (int i10 = 0; i10 < bVar2.f2684d * 2; i10 += 2) {
                            c(recyclerView2, bVar2.f2683c[i10], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i11 = c.i.g.g.a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.a = false;
            cVar.f2685b = 0;
            cVar.f2686c = 0;
            cVar.f2687d = null;
            cVar.f2688e = 0;
        }
    }

    public final RecyclerView.a0 c(RecyclerView recyclerView, int i2, long j2) {
        boolean z;
        int h2 = recyclerView.f523l.h();
        int i3 = 0;
        while (true) {
            if (i3 >= h2) {
                z = false;
                break;
            }
            RecyclerView.a0 N = RecyclerView.N(recyclerView.f523l.g(i3));
            if (N.f529d == i2 && !N.m()) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f520i;
        try {
            recyclerView.Y();
            RecyclerView.a0 k2 = tVar.k(i2, false, j2);
            if (k2 != null) {
                if (!k2.l() || k2.m()) {
                    tVar.a(k2, false);
                } else {
                    tVar.h(k2.f527b);
                }
            }
            return k2;
        } finally {
            recyclerView.Z(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i2 = c.i.g.g.a;
            Trace.beginSection("RV Prefetch");
            if (this.f2678c.isEmpty()) {
                this.f2679d = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f2678c.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = this.f2678c.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f2679d = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2680e);
            this.f2679d = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f2679d = 0L;
            int i4 = c.i.g.g.a;
            Trace.endSection();
            throw th;
        }
    }
}
