package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.o0.t1;
import java.util.ArrayList;
/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public final class e {
    public final b a;
    public final a b = new a();
    public final ArrayList c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        public long a = 0;
        public a b;

        public final void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i);
        }

        public final int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return Long.bitCount(this.a) + aVar.b(i - 64);
            }
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final boolean d(int i) {
            if (i >= 64) {
                c();
                return this.b.d(i - 64);
            } else if ((this.a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final void e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            boolean z;
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i >= 64) {
                c();
                this.b.h(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public e(RecyclerView.e eVar) {
        this.a = eVar;
    }

    public final void a(View view, int i, boolean z) {
        int f;
        b bVar = this.a;
        if (i < 0) {
            f = ((RecyclerView.e) bVar).a();
        } else {
            f = f(i);
        }
        this.b.e(f, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.addView(view, f);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int f;
        b bVar = this.a;
        if (i < 0) {
            f = ((RecyclerView.e) bVar).a();
        } else {
            f = f(i);
        }
        this.b.e(f, z);
        if (z) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) bVar;
        eVar.getClass();
        RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = RecyclerView.this;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(t1.a(recyclerView, sb));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, f, layoutParams);
    }

    public final void c(int i) {
        RecyclerView.f0 childViewHolderInt;
        int f = f(i);
        this.b.f(f);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        View childAt = RecyclerView.this.getChildAt(f);
        RecyclerView recyclerView = RecyclerView.this;
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(t1.a(recyclerView, sb));
            }
            childViewHolderInt.addFlags(256);
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i) {
        return RecyclerView.this.getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView.e) this.a).a() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = ((RecyclerView.e) this.a).a();
        int i2 = i;
        while (i2 < a2) {
            a aVar = this.b;
            int b2 = i - (i2 - aVar.b(i2));
            if (b2 == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView.e) this.a).a();
    }

    public final void i(View view) {
        this.c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        eVar.getClass();
        RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public final int j(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        a aVar = this.b;
        if (aVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - aVar.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.c.contains(view);
    }

    public final void l(int i) {
        int f = f(i);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        View childAt = RecyclerView.this.getChildAt(f);
        if (childAt == null) {
            return;
        }
        if (this.b.f(f)) {
            m(childAt);
        }
        eVar.b(f);
    }

    public final void m(View view) {
        if (this.c.remove(view)) {
            RecyclerView.e eVar = (RecyclerView.e) this.a;
            eVar.getClass();
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
