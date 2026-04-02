package c.u.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class e {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2596b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f2597c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {
        public long a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2598b;

        public void a(int i2) {
            if (i2 < 64) {
                this.a &= (1 << i2) ^ (-1);
                return;
            }
            a aVar = this.f2598b;
            if (aVar != null) {
                aVar.a(i2 - 64);
            }
        }

        public int b(int i2) {
            a aVar = this.f2598b;
            if (aVar == null) {
                return i2 >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i2) - 1));
            } else if (i2 < 64) {
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else {
                return Long.bitCount(this.a) + aVar.b(i2 - 64);
            }
        }

        public final void c() {
            if (this.f2598b == null) {
                this.f2598b = new a();
            }
        }

        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            c();
            return this.f2598b.d(i2 - 64);
        }

        public void e(int i2, boolean z) {
            if (i2 >= 64) {
                c();
                this.f2598b.e(i2 - 64, z);
                return;
            }
            long j2 = this.a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.a = ((j2 & (j3 ^ (-1))) << 1) | (j2 & j3);
            if (z) {
                h(i2);
            } else {
                a(i2);
            }
            if (z2 || this.f2598b != null) {
                c();
                this.f2598b.e(0, z2);
            }
        }

        public boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f2598b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (j2 ^ (-1));
            this.a = j4;
            long j5 = j2 - 1;
            this.a = (j4 & j5) | Long.rotateRight((j5 ^ (-1)) & j4, 1);
            a aVar = this.f2598b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2598b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0L;
            a aVar = this.f2598b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i2) {
            if (i2 < 64) {
                this.a |= 1 << i2;
                return;
            }
            c();
            this.f2598b.h(i2 - 64);
        }

        public String toString() {
            if (this.f2598b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.f2598b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public e(b bVar) {
        this.a = bVar;
    }

    public void a(View view, int i2, boolean z) {
        int b2 = i2 < 0 ? ((a0) this.a).b() : f(i2);
        this.f2596b.e(b2, z);
        if (z) {
            i(view);
        }
        a0 a0Var = (a0) this.a;
        a0Var.a.addView(view, b2);
        RecyclerView recyclerView = a0Var.a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.N(view);
        recyclerView.W();
        List<RecyclerView.o> list = recyclerView.K;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            recyclerView.K.get(size).d(view);
        }
    }

    public void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b2 = i2 < 0 ? ((a0) this.a).b() : f(i2);
        this.f2596b.e(b2, z);
        if (z) {
            i(view);
        }
        a0 a0Var = (a0) this.a;
        Objects.requireNonNull(a0Var);
        RecyclerView.a0 N = RecyclerView.N(view);
        if (N != null) {
            if (!N.q() && !N.w()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(N);
                throw new IllegalArgumentException(e.a.d.a.a.c(a0Var.a, sb));
            }
            N.f536k &= -257;
        }
        a0Var.a.attachViewToParent(view, b2, layoutParams);
    }

    public void c(int i2) {
        RecyclerView.a0 N;
        int f2 = f(i2);
        this.f2596b.f(f2);
        a0 a0Var = (a0) this.a;
        View childAt = a0Var.a.getChildAt(f2);
        if (childAt != null && (N = RecyclerView.N(childAt)) != null) {
            if (N.q() && !N.w()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(N);
                throw new IllegalArgumentException(e.a.d.a.a.c(a0Var.a, sb));
            }
            N.c(256);
        }
        a0Var.a.detachViewFromParent(f2);
    }

    public View d(int i2) {
        return ((a0) this.a).a(f(i2));
    }

    public int e() {
        return ((a0) this.a).b() - this.f2597c.size();
    }

    public final int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int b2 = ((a0) this.a).b();
        int i3 = i2;
        while (i3 < b2) {
            int b3 = i2 - (i3 - this.f2596b.b(i3));
            if (b3 == 0) {
                while (this.f2596b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b3;
        }
        return -1;
    }

    public View g(int i2) {
        return ((a0) this.a).a.getChildAt(i2);
    }

    public int h() {
        return ((a0) this.a).b();
    }

    public final void i(View view) {
        this.f2597c.add(view);
        a0 a0Var = (a0) this.a;
        Objects.requireNonNull(a0Var);
        RecyclerView.a0 N = RecyclerView.N(view);
        if (N != null) {
            RecyclerView recyclerView = a0Var.a;
            int i2 = N.r;
            if (i2 != -1) {
                N.q = i2;
            } else {
                View view2 = N.f527b;
                AtomicInteger atomicInteger = c.i.k.d0.a;
                N.q = d0.c.c(view2);
            }
            recyclerView.o0(N, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((a0) this.a).a.indexOfChild(view);
        if (indexOfChild == -1 || this.f2596b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f2596b.b(indexOfChild);
    }

    public boolean k(View view) {
        return this.f2597c.contains(view);
    }

    public final boolean l(View view) {
        if (this.f2597c.remove(view)) {
            a0 a0Var = (a0) this.a;
            Objects.requireNonNull(a0Var);
            RecyclerView.a0 N = RecyclerView.N(view);
            if (N != null) {
                a0Var.a.o0(N, N.q);
                N.q = 0;
                return true;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f2596b.toString() + ", hidden list:" + this.f2597c.size();
    }
}
