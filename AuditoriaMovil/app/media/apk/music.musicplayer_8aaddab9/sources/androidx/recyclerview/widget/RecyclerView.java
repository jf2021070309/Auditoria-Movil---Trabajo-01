package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import c.i.k.d0;
import c.i.k.e0;
import c.u.b.a;
import c.u.b.b0;
import c.u.b.c0;
import c.u.b.e;
import c.u.b.f0;
import c.u.b.g0;
import c.u.b.n;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements c.i.k.o {
    public static final int[] a = {16843830};

    /* renamed from: b */
    public static final boolean f513b;

    /* renamed from: c */
    public static final boolean f514c;

    /* renamed from: d */
    public static final boolean f515d;

    /* renamed from: e */
    public static final boolean f516e;

    /* renamed from: f */
    public static final Class<?>[] f517f;

    /* renamed from: g */
    public static final Interpolator f518g;
    public boolean A;
    public c0 A0;
    public boolean B;
    public h B0;
    public boolean C;
    public final int[] C0;
    public int D;
    public c.i.k.p D0;
    public boolean E;
    public final int[] E0;
    public boolean F;
    public final int[] F0;
    public boolean G;
    public final int[] G0;
    public int H;
    public final List<a0> H0;
    public boolean I;
    public Runnable I0;
    public final AccessibilityManager J;
    public boolean J0;
    public List<o> K;
    public int K0;
    public boolean L;
    public int L0;
    public boolean M;
    public final g0.b M0;
    public int N;
    public int O;
    public i P;
    public EdgeEffect U;
    public EdgeEffect V;
    public EdgeEffect W;
    public EdgeEffect a0;
    public j b0;
    public int c0;
    public int d0;
    public VelocityTracker e0;
    public int f0;
    public int g0;

    /* renamed from: h */
    public final v f519h;
    public int h0;

    /* renamed from: i */
    public final t f520i;
    public int i0;

    /* renamed from: j */
    public SavedState f521j;
    public int j0;

    /* renamed from: k */
    public c.u.b.a f522k;
    public p k0;

    /* renamed from: l */
    public c.u.b.e f523l;
    public final int l0;

    /* renamed from: m */
    public final g0 f524m;
    public final int m0;

    /* renamed from: n */
    public boolean f525n;
    public float n0;
    public final Runnable o;
    public float o0;
    public final Rect p;
    public boolean p0;
    public final Rect q;
    public final z q0;
    public final RectF r;
    public c.u.b.n r0;
    public e s;
    public n.b s0;
    public m t;
    public final x t0;
    public u u;
    public r u0;
    public final List<u> v;
    public List<r> v0;
    public final ArrayList<l> w;
    public boolean w0;
    public final ArrayList<q> x;
    public boolean x0;
    public q y;
    public j.b y0;
    public boolean z;
    public boolean z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c */
        public Parcelable f526c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f526c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeParcelable(this.f526c, 0);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.C || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.z) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.F) {
                recyclerView2.E = true;
            } else {
                recyclerView2.q();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
        public static final List<Object> a = Collections.emptyList();

        /* renamed from: b */
        public final View f527b;

        /* renamed from: c */
        public WeakReference<RecyclerView> f528c;

        /* renamed from: k */
        public int f536k;
        public RecyclerView s;
        public e<? extends a0> t;

        /* renamed from: d */
        public int f529d = -1;

        /* renamed from: e */
        public int f530e = -1;

        /* renamed from: f */
        public long f531f = -1;

        /* renamed from: g */
        public int f532g = -1;

        /* renamed from: h */
        public int f533h = -1;

        /* renamed from: i */
        public a0 f534i = null;

        /* renamed from: j */
        public a0 f535j = null;

        /* renamed from: l */
        public List<Object> f537l = null;

        /* renamed from: m */
        public List<Object> f538m = null;

        /* renamed from: n */
        public int f539n = 0;
        public t o = null;
        public boolean p = false;
        public int q = 0;
        public int r = -1;

        public a0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f527b = view;
        }

        public void b(Object obj) {
            if (obj == null) {
                c(1024);
            } else if ((1024 & this.f536k) == 0) {
                if (this.f537l == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f537l = arrayList;
                    this.f538m = Collections.unmodifiableList(arrayList);
                }
                this.f537l.add(obj);
            }
        }

        public void c(int i2) {
            this.f536k = i2 | this.f536k;
        }

        public void d() {
            this.f530e = -1;
            this.f533h = -1;
        }

        public void e() {
            this.f536k &= -33;
        }

        public final int f() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.K(this);
        }

        @Deprecated
        public final int g() {
            RecyclerView recyclerView;
            e<? extends a0> adapter;
            int K;
            if (this.t == null || (recyclerView = this.s) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.s.K(this)) == -1 || this.t != adapter) {
                return -1;
            }
            return K;
        }

        public final int h() {
            int i2 = this.f533h;
            return i2 == -1 ? this.f529d : i2;
        }

        public List<Object> i() {
            if ((this.f536k & 1024) == 0) {
                List<Object> list = this.f537l;
                return (list == null || list.size() == 0) ? a : this.f538m;
            }
            return a;
        }

        public boolean j(int i2) {
            return (i2 & this.f536k) != 0;
        }

        public boolean k() {
            return (this.f527b.getParent() == null || this.f527b.getParent() == this.s) ? false : true;
        }

        public boolean l() {
            return (this.f536k & 1) != 0;
        }

        public boolean m() {
            return (this.f536k & 4) != 0;
        }

        public final boolean n() {
            if ((this.f536k & 16) == 0) {
                View view = this.f527b;
                AtomicInteger atomicInteger = d0.a;
                if (!d0.c.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean o() {
            return (this.f536k & 8) != 0;
        }

        public boolean p() {
            return this.o != null;
        }

        public boolean q() {
            return (this.f536k & 256) != 0;
        }

        public boolean r() {
            return (this.f536k & 2) != 0;
        }

        public void s(int i2, boolean z) {
            if (this.f530e == -1) {
                this.f530e = this.f529d;
            }
            if (this.f533h == -1) {
                this.f533h = this.f529d;
            }
            if (z) {
                this.f533h += i2;
            }
            this.f529d += i2;
            if (this.f527b.getLayoutParams() != null) {
                ((n) this.f527b.getLayoutParams()).f565c = true;
            }
        }

        public void t() {
            this.f536k = 0;
            this.f529d = -1;
            this.f530e = -1;
            this.f531f = -1L;
            this.f533h = -1;
            this.f539n = 0;
            this.f534i = null;
            this.f535j = null;
            List<Object> list = this.f537l;
            if (list != null) {
                list.clear();
            }
            this.f536k &= -1025;
            this.q = 0;
            this.r = -1;
            RecyclerView.n(this);
        }

        public String toString() {
            StringBuilder A = e.a.d.a.a.A(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            A.append(Integer.toHexString(hashCode()));
            A.append(" position=");
            A.append(this.f529d);
            A.append(" id=");
            A.append(this.f531f);
            A.append(", oldPos=");
            A.append(this.f530e);
            A.append(", pLpos:");
            A.append(this.f533h);
            StringBuilder sb = new StringBuilder(A.toString());
            if (p()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m()) {
                sb.append(" invalid");
            }
            if (!l()) {
                sb.append(" unbound");
            }
            boolean z = false;
            if ((this.f536k & 2) != 0) {
                sb.append(" update");
            }
            if (o()) {
                sb.append(" removed");
            }
            if (w()) {
                sb.append(" ignored");
            }
            if (q()) {
                sb.append(" tmpDetached");
            }
            if (!n()) {
                StringBuilder y = e.a.d.a.a.y(" not recyclable(");
                y.append(this.f539n);
                y.append(")");
                sb.append(y.toString());
            }
            if (((this.f536k & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 || m()) ? true : true) {
                sb.append(" undefined adapter position");
            }
            if (this.f527b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void u(int i2, int i3) {
            this.f536k = (i2 & i3) | (this.f536k & (i3 ^ (-1)));
        }

        public final void v(boolean z) {
            int i2 = this.f539n;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f539n = i3;
            if (i3 < 0) {
                this.f539n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i3 == 1) {
                this.f536k |= 16;
            } else if (z && i3 == 0) {
                this.f536k &= -17;
            }
        }

        public boolean w() {
            return (this.f536k & 128) != 0;
        }

        public boolean x() {
            return (this.f536k & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = RecyclerView.this.b0;
            if (jVar != null) {
                jVar.i();
            }
            RecyclerView.this.z0 = false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d implements g0.b {
        public d() {
            RecyclerView.this = r1;
        }

        public void a(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            a0Var.v(false);
            c.u.b.d0 d0Var = (c.u.b.d0) recyclerView.b0;
            Objects.requireNonNull(d0Var);
            if (cVar == null || ((i2 = cVar.a) == (i3 = cVar2.a) && cVar.f547b == cVar2.f547b)) {
                c.u.b.f fVar = (c.u.b.f) d0Var;
                fVar.o(a0Var);
                a0Var.f527b.setAlpha(0.0f);
                fVar.f2603j.add(a0Var);
                z = true;
            } else {
                z = d0Var.j(a0Var, i2, cVar.f547b, i3, cVar2.f547b);
            }
            if (z) {
                recyclerView.d0();
            }
        }

        public void b(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z;
            RecyclerView.this.f520i.l(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i(a0Var);
            a0Var.v(false);
            c.u.b.d0 d0Var = (c.u.b.d0) recyclerView.b0;
            Objects.requireNonNull(d0Var);
            int i2 = cVar.a;
            int i3 = cVar.f547b;
            View view = a0Var.f527b;
            int left = cVar2 == null ? view.getLeft() : cVar2.a;
            int top = cVar2 == null ? view.getTop() : cVar2.f547b;
            if (a0Var.o() || (i2 == left && i3 == top)) {
                c.u.b.f fVar = (c.u.b.f) d0Var;
                fVar.o(a0Var);
                fVar.f2602i.add(a0Var);
                z = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z = d0Var.j(a0Var, i2, i3, left, top);
            }
            if (z) {
                recyclerView.d0();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<VH extends a0> {
        public final f a = new f();

        /* renamed from: b */
        public boolean f540b = false;

        /* renamed from: c */
        public a f541c = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public abstract int b();

        public long c(int i2) {
            return -1L;
        }

        public int d(int i2) {
            return 0;
        }

        public final void e(int i2, Object obj) {
            this.a.d(i2, 1, obj);
        }

        public abstract void f(VH vh, int i2);

        public void g(VH vh, int i2, List<Object> list) {
            f(vh, i2);
        }

        public abstract VH h(ViewGroup viewGroup, int i2);

        public void i(boolean z) {
            if (this.a.a()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f540b = z;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Observable<g> {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i2, i3, 1);
            }
        }

        public void d(int i2, int i3, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i2, i3, obj);
            }
        }

        public void e(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i2, i3);
            }
        }

        public void f(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i2, i3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3, Object obj) {
            b(i2, i3);
        }

        public void d(int i2, int i3) {
        }

        public void e(int i2, int i3, int i4) {
        }

        public void f(int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public b a = null;

        /* renamed from: b */
        public ArrayList<a> f542b = new ArrayList<>();

        /* renamed from: c */
        public long f543c = 120;

        /* renamed from: d */
        public long f544d = 120;

        /* renamed from: e */
        public long f545e = 250;

        /* renamed from: f */
        public long f546f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {
            public int a;

            /* renamed from: b */
            public int f547b;
        }

        public static int b(a0 a0Var) {
            int i2 = a0Var.f536k & 14;
            if (a0Var.m()) {
                return 4;
            }
            if ((i2 & 4) == 0) {
                int i3 = a0Var.f530e;
                int f2 = a0Var.f();
                return (i3 == -1 || f2 == -1 || i3 == f2) ? i2 : i2 | ThrowableProxyConverter.BUILDER_CAPACITY;
            }
            return i2;
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public final void c(a0 a0Var) {
            b bVar = this.a;
            if (bVar != null) {
                k kVar = (k) bVar;
                Objects.requireNonNull(kVar);
                boolean z = true;
                a0Var.v(true);
                if (a0Var.f534i != null && a0Var.f535j == null) {
                    a0Var.f534i = null;
                }
                a0Var.f535j = null;
                if ((a0Var.f536k & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = a0Var.f527b;
                recyclerView.q0();
                c.u.b.e eVar = recyclerView.f523l;
                int indexOfChild = ((c.u.b.a0) eVar.a).a.indexOfChild(view);
                if (indexOfChild == -1) {
                    eVar.l(view);
                } else if (eVar.f2596b.d(indexOfChild)) {
                    eVar.f2596b.f(indexOfChild);
                    eVar.l(view);
                    ((c.u.b.a0) eVar.a).c(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    a0 N = RecyclerView.N(view);
                    recyclerView.f520i.l(N);
                    recyclerView.f520i.i(N);
                }
                recyclerView.s0(!z);
                if (z || !a0Var.q()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(a0Var.f527b, false);
            }
        }

        public final void d() {
            int size = this.f542b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f542b.get(i2).a();
            }
            this.f542b.clear();
        }

        public abstract void e(a0 a0Var);

        public abstract void f();

        public abstract boolean g();

        public c h(a0 a0Var) {
            c cVar = new c();
            View view = a0Var.f527b;
            cVar.a = view.getLeft();
            cVar.f547b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract void i();
    }

    /* loaded from: classes.dex */
    public class k implements j.b {
        public k() {
            RecyclerView.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void f(Rect rect, View view, RecyclerView recyclerView, x xVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView, x xVar) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public c.u.b.e a;

        /* renamed from: b */
        public RecyclerView f548b;

        /* renamed from: c */
        public final f0.b f549c;

        /* renamed from: d */
        public final f0.b f550d;

        /* renamed from: e */
        public f0 f551e;

        /* renamed from: f */
        public f0 f552f;

        /* renamed from: g */
        public w f553g;

        /* renamed from: h */
        public boolean f554h;

        /* renamed from: i */
        public boolean f555i;

        /* renamed from: j */
        public boolean f556j;

        /* renamed from: k */
        public boolean f557k;

        /* renamed from: l */
        public int f558l;

        /* renamed from: m */
        public boolean f559m;

        /* renamed from: n */
        public int f560n;
        public int o;
        public int p;
        public int q;

        /* loaded from: classes.dex */
        public class a implements f0.b {
            public a() {
                m.this = r1;
            }

            @Override // c.u.b.f0.b
            public int a(View view) {
                return m.this.F(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // c.u.b.f0.b
            public int b() {
                return m.this.Q();
            }

            @Override // c.u.b.f0.b
            public int c() {
                m mVar = m.this;
                return mVar.p - mVar.R();
            }

            @Override // c.u.b.f0.b
            public View d(int i2) {
                return m.this.z(i2);
            }

            @Override // c.u.b.f0.b
            public int e(View view) {
                return m.this.I(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements f0.b {
            public b() {
                m.this = r1;
            }

            @Override // c.u.b.f0.b
            public int a(View view) {
                return m.this.J(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // c.u.b.f0.b
            public int b() {
                return m.this.S();
            }

            @Override // c.u.b.f0.b
            public int c() {
                m mVar = m.this;
                return mVar.q - mVar.P();
            }

            @Override // c.u.b.f0.b
            public View d(int i2) {
                return m.this.z(i2);
            }

            @Override // c.u.b.f0.b
            public int e(View view) {
                return m.this.D(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;

            /* renamed from: b */
            public int f561b;

            /* renamed from: c */
            public boolean f562c;

            /* renamed from: d */
            public boolean f563d;
        }

        public m() {
            a aVar = new a();
            this.f549c = aVar;
            b bVar = new b();
            this.f550d = bVar;
            this.f551e = new f0(aVar);
            this.f552f = new f0(bVar);
            this.f554h = false;
            this.f555i = false;
            this.f556j = true;
            this.f557k = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int B(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.B(int, int, int, int, boolean):int");
        }

        public static d U(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.u.a.a, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(0, 1);
            dVar.f561b = obtainStyledAttributes.getInt(10, 1);
            dVar.f562c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f563d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean a0(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 <= 0 || i2 == i4) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i2;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i2;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static int j(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        public int A() {
            c.u.b.e eVar = this.a;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public boolean A0(RecyclerView recyclerView, View view, View view2) {
            return z0(recyclerView);
        }

        public void B0(Parcelable parcelable) {
        }

        public int C(t tVar, x xVar) {
            return -1;
        }

        public Parcelable C0() {
            return null;
        }

        public int D(View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).f564b.bottom;
        }

        public void D0(int i2) {
        }

        public void E(View view, Rect rect) {
            int[] iArr = RecyclerView.a;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f564b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public boolean E0(int i2) {
            int S;
            int Q;
            int i3;
            int i4;
            RecyclerView recyclerView = this.f548b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                S = recyclerView.canScrollVertically(1) ? (this.q - S()) - P() : 0;
                if (this.f548b.canScrollHorizontally(1)) {
                    Q = (this.p - Q()) - R();
                    i4 = Q;
                    i3 = S;
                }
                i3 = S;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                S = recyclerView.canScrollVertically(-1) ? -((this.q - S()) - P()) : 0;
                if (this.f548b.canScrollHorizontally(-1)) {
                    Q = -((this.p - Q()) - R());
                    i4 = Q;
                    i3 = S;
                }
                i3 = S;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.f548b.p0(i4, i3, null, Level.ALL_INT, true);
            return true;
        }

        public int F(View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).f564b.left;
        }

        public boolean F0() {
            return false;
        }

        public int G(View view) {
            Rect rect = ((n) view.getLayoutParams()).f564b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void G0(t tVar) {
            for (int A = A() - 1; A >= 0; A--) {
                if (!RecyclerView.N(z(A)).w()) {
                    J0(A, tVar);
                }
            }
        }

        public int H(View view) {
            Rect rect = ((n) view.getLayoutParams()).f564b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void H0(t tVar) {
            int size = tVar.a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = tVar.a.get(i2).f527b;
                a0 N = RecyclerView.N(view);
                if (!N.w()) {
                    N.v(false);
                    if (N.q()) {
                        this.f548b.removeDetachedView(view, false);
                    }
                    j jVar = this.f548b.b0;
                    if (jVar != null) {
                        jVar.e(N);
                    }
                    N.v(true);
                    a0 N2 = RecyclerView.N(view);
                    N2.o = null;
                    N2.p = false;
                    N2.e();
                    tVar.i(N2);
                }
            }
            tVar.a.clear();
            ArrayList<a0> arrayList = tVar.f571b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f548b.invalidate();
            }
        }

        public int I(View view) {
            return view.getRight() + ((n) view.getLayoutParams()).f564b.right;
        }

        public void I0(View view, t tVar) {
            c.u.b.e eVar = this.a;
            int indexOfChild = ((c.u.b.a0) eVar.a).a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (eVar.f2596b.f(indexOfChild)) {
                    eVar.l(view);
                }
                ((c.u.b.a0) eVar.a).c(indexOfChild);
            }
            tVar.h(view);
        }

        public int J(View view) {
            return view.getTop() - ((n) view.getLayoutParams()).f564b.top;
        }

        public void J0(int i2, t tVar) {
            View z = z(i2);
            K0(i2);
            tVar.h(z);
        }

        public View K() {
            View focusedChild;
            RecyclerView recyclerView = this.f548b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.f2597c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void K0(int i2) {
            c.u.b.e eVar;
            int f2;
            View a2;
            if (z(i2) == null || (a2 = ((c.u.b.a0) eVar.a).a((f2 = (eVar = this.a).f(i2)))) == null) {
                return;
            }
            if (eVar.f2596b.f(f2)) {
                eVar.l(a2);
            }
            ((c.u.b.a0) eVar.a).c(f2);
        }

        public int L() {
            RecyclerView recyclerView = this.f548b;
            e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.b();
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x00b8, code lost:
            if (r1 == false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean L0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.Q()
                int r4 = r18.S()
                int r5 = r0.p
                int r6 = r18.R()
                int r5 = r5 - r6
                int r6 = r0.q
                int r7 = r18.P()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.M()
                r11 = 1
                if (r6 != r11) goto L63
                if (r5 == 0) goto L5e
                goto L6b
            L5e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L6b
            L63:
                if (r10 == 0) goto L66
                goto L6a
            L66:
                int r10 = java.lang.Math.min(r7, r5)
            L6a:
                r5 = r10
            L6b:
                if (r4 == 0) goto L6e
                goto L72
            L6e:
                int r4 = java.lang.Math.min(r8, r1)
            L72:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto Lba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L83
                goto Lb7
            L83:
                int r2 = r18.Q()
                int r4 = r18.S()
                int r5 = r0.p
                int r6 = r18.R()
                int r5 = r5 - r6
                int r6 = r0.q
                int r7 = r18.P()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f548b
                android.graphics.Rect r7 = r7.p
                r0.E(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto Lb7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto Lb7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto Lb7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto Lb5
                goto Lb7
            Lb5:
                r1 = 1
                goto Lb8
            Lb7:
                r1 = 0
            Lb8:
                if (r1 == 0) goto Lbf
            Lba:
                if (r13 != 0) goto Lc0
                if (r14 == 0) goto Lbf
                goto Lc0
            Lbf:
                return r3
            Lc0:
                if (r22 == 0) goto Lc8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto Ld4
            Lc8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.p0(r13, r14, r15, r16, r17)
            Ld4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.L0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int M() {
            RecyclerView recyclerView = this.f548b;
            AtomicInteger atomicInteger = d0.a;
            return d0.d.d(recyclerView);
        }

        public void M0() {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int N() {
            RecyclerView recyclerView = this.f548b;
            AtomicInteger atomicInteger = d0.a;
            return d0.c.d(recyclerView);
        }

        public int N0(int i2, t tVar, x xVar) {
            return 0;
        }

        public int O() {
            RecyclerView recyclerView = this.f548b;
            AtomicInteger atomicInteger = d0.a;
            return d0.c.e(recyclerView);
        }

        public void O0(int i2) {
        }

        public int P() {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int P0(int i2, t tVar, x xVar) {
            return 0;
        }

        public int Q() {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void Q0(RecyclerView recyclerView) {
            R0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int R() {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void R0(int i2, int i3) {
            this.p = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.f560n = mode;
            if (mode == 0 && !RecyclerView.f514c) {
                this.p = 0;
            }
            this.q = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.o = mode2;
            if (mode2 != 0 || RecyclerView.f514c) {
                return;
            }
            this.q = 0;
        }

        public int S() {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void S0(Rect rect, int i2, int i3) {
            int R = R() + Q() + rect.width();
            int P = P() + S() + rect.height();
            this.f548b.setMeasuredDimension(j(i2, R, O()), j(i3, P, N()));
        }

        public int T(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public void T0(int i2, int i3) {
            int A = A();
            if (A == 0) {
                this.f548b.r(i2, i3);
                return;
            }
            int i4 = Level.ALL_INT;
            int i5 = Level.ALL_INT;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < A; i8++) {
                View z = z(i8);
                Rect rect = this.f548b.p;
                E(z, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f548b.p.set(i6, i7, i4, i5);
            S0(this.f548b.p, i2, i3);
        }

        public void U0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f548b = null;
                this.a = null;
                this.p = 0;
                this.q = 0;
            } else {
                this.f548b = recyclerView;
                this.a = recyclerView.f523l;
                this.p = recyclerView.getWidth();
                this.q = recyclerView.getHeight();
            }
            this.f560n = 1073741824;
            this.o = 1073741824;
        }

        public int V(t tVar, x xVar) {
            return -1;
        }

        public boolean V0(View view, int i2, int i3, n nVar) {
            return (!view.isLayoutRequested() && this.f556j && a0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) nVar).width) && a0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public int W() {
            return 0;
        }

        public boolean W0() {
            return false;
        }

        public void X(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((n) view.getLayoutParams()).f564b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f548b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f548b.r;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean X0(View view, int i2, int i3, n nVar) {
            return (this.f556j && a0(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) nVar).width) && a0(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) nVar).height)) ? false : true;
        }

        public boolean Y() {
            return false;
        }

        public void Y0(RecyclerView recyclerView, x xVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public boolean Z() {
            return false;
        }

        public void Z0(w wVar) {
            w wVar2 = this.f553g;
            if (wVar2 != null && wVar != wVar2 && wVar2.f581e) {
                wVar2.d();
            }
            this.f553g = wVar;
            RecyclerView recyclerView = this.f548b;
            recyclerView.q0.stop();
            if (wVar.f584h) {
                StringBuilder y = e.a.d.a.a.y("An instance of ");
                y.append(wVar.getClass().getSimpleName());
                y.append(" was started more than once. Each instance of");
                y.append(wVar.getClass().getSimpleName());
                y.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", y.toString());
            }
            wVar.f578b = recyclerView;
            wVar.f579c = this;
            int i2 = wVar.a;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.t0.a = i2;
            wVar.f581e = true;
            wVar.f580d = true;
            wVar.f582f = recyclerView.t.v(i2);
            wVar.f578b.q0.a();
            wVar.f584h = true;
        }

        public boolean a1() {
            return false;
        }

        public boolean b0(View view, boolean z) {
            boolean z2 = this.f551e.b(view, 24579) && this.f552f.b(view, 24579);
            return z ? z2 : !z2;
        }

        public void c(View view) {
            d(view, -1, false);
        }

        public void c0(View view, int i2, int i3, int i4, int i5) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f564b;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public final void d(View view, int i2, boolean z) {
            a0 N = RecyclerView.N(view);
            if (z || N.o()) {
                this.f548b.f524m.a(N);
            } else {
                this.f548b.f524m.f(N);
            }
            n nVar = (n) view.getLayoutParams();
            if (N.x() || N.p()) {
                if (N.p()) {
                    N.o.l(N);
                } else {
                    N.e();
                }
                this.a.b(view, i2, view.getLayoutParams(), false);
            } else {
                if (view.getParent() == this.f548b) {
                    int j2 = this.a.j(view);
                    if (i2 == -1) {
                        i2 = this.a.e();
                    }
                    if (j2 == -1) {
                        StringBuilder y = e.a.d.a.a.y("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        y.append(this.f548b.indexOfChild(view));
                        throw new IllegalStateException(e.a.d.a.a.c(this.f548b, y));
                    } else if (j2 != i2) {
                        m mVar = this.f548b.t;
                        View z2 = mVar.z(j2);
                        if (z2 == null) {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j2 + mVar.f548b.toString());
                        }
                        mVar.z(j2);
                        mVar.t(j2);
                        n nVar2 = (n) z2.getLayoutParams();
                        a0 N2 = RecyclerView.N(z2);
                        if (N2.o()) {
                            mVar.f548b.f524m.a(N2);
                        } else {
                            mVar.f548b.f524m.f(N2);
                        }
                        mVar.a.b(z2, i2, nVar2, N2.o());
                    }
                } else {
                    this.a.a(view, i2, false);
                    nVar.f565c = true;
                    w wVar = this.f553g;
                    if (wVar != null && wVar.f581e) {
                        Objects.requireNonNull(wVar.f578b);
                        a0 N3 = RecyclerView.N(view);
                        if ((N3 != null ? N3.h() : -1) == wVar.a) {
                            wVar.f582f = view;
                        }
                    }
                }
            }
            if (nVar.f566d) {
                N.f527b.invalidate();
                nVar.f566d = false;
            }
        }

        public void d0(int i2) {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                int e2 = recyclerView.f523l.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f523l.d(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public void e(String str) {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                recyclerView.l(str);
            }
        }

        public void e0(int i2) {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView != null) {
                int e2 = recyclerView.f523l.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f523l.d(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public void f(View view, Rect rect) {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.O(view));
            }
        }

        public void f0(e eVar, e eVar2) {
        }

        public boolean g() {
            return false;
        }

        public boolean g0() {
            return false;
        }

        public boolean h() {
            return false;
        }

        public void h0() {
        }

        public boolean i(n nVar) {
            return nVar != null;
        }

        @Deprecated
        public void i0() {
        }

        public void j0(RecyclerView recyclerView, t tVar) {
            i0();
        }

        public void k(int i2, int i3, x xVar, c cVar) {
        }

        public View k0(View view, int i2, t tVar, x xVar) {
            return null;
        }

        public void l(int i2, c cVar) {
        }

        public void l0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f548b;
            t tVar = recyclerView.f520i;
            x xVar = recyclerView.t0;
            m0(accessibilityEvent);
        }

        public int m(x xVar) {
            return 0;
        }

        public void m0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f548b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f548b.canScrollVertically(-1) && !this.f548b.canScrollHorizontally(-1) && !this.f548b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            e eVar = this.f548b.s;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.b());
            }
        }

        public int n(x xVar) {
            return 0;
        }

        public void n0(View view, c.i.k.k0.b bVar) {
            a0 N = RecyclerView.N(view);
            if (N == null || N.o() || this.a.k(N.f527b)) {
                return;
            }
            RecyclerView recyclerView = this.f548b;
            o0(recyclerView.f520i, recyclerView.t0, view, bVar);
        }

        public int o(x xVar) {
            return 0;
        }

        public void o0(t tVar, x xVar, View view, c.i.k.k0.b bVar) {
        }

        public int p(x xVar) {
            return 0;
        }

        public View p0() {
            return null;
        }

        public int q(x xVar) {
            return 0;
        }

        public void q0(RecyclerView recyclerView, int i2, int i3) {
        }

        public int r(x xVar) {
            return 0;
        }

        public void r0(RecyclerView recyclerView) {
        }

        public void s(t tVar) {
            int A = A();
            while (true) {
                A--;
                if (A < 0) {
                    return;
                }
                View z = z(A);
                a0 N = RecyclerView.N(z);
                if (!N.w()) {
                    if (!N.m() || N.o() || this.f548b.s.f540b) {
                        z(A);
                        t(A);
                        tVar.j(z);
                        this.f548b.f524m.f(N);
                    } else {
                        K0(A);
                        tVar.i(N);
                    }
                }
            }
        }

        public void s0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public final void t(int i2) {
            this.a.c(i2);
        }

        public void t0(RecyclerView recyclerView, int i2, int i3) {
        }

        public View u(View view) {
            View F;
            RecyclerView recyclerView = this.f548b;
            if (recyclerView == null || (F = recyclerView.F(view)) == null || this.a.f2597c.contains(F)) {
                return null;
            }
            return F;
        }

        public void u0() {
        }

        public View v(int i2) {
            int A = A();
            for (int i3 = 0; i3 < A; i3++) {
                View z = z(i3);
                a0 N = RecyclerView.N(z);
                if (N != null && N.h() == i2 && !N.w() && (this.f548b.t0.f596g || !N.o())) {
                    return z;
                }
            }
            return null;
        }

        public void v0(RecyclerView recyclerView, int i2, int i3, Object obj) {
            u0();
        }

        public abstract n w();

        public void w0(t tVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public n x(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void x0(x xVar) {
        }

        public n y(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public void y0(int i2, int i3) {
            this.f548b.r(i2, i3);
        }

        public View z(int i2) {
            c.u.b.e eVar = this.a;
            if (eVar != null) {
                return ((c.u.b.a0) eVar.a).a(eVar.f(i2));
            }
            return null;
        }

        @Deprecated
        public boolean z0(RecyclerView recyclerView) {
            w wVar = this.f553g;
            return (wVar != null && wVar.f581e) || recyclerView.S();
        }
    }

    /* loaded from: classes.dex */
    public static class n extends ViewGroup.MarginLayoutParams {
        public a0 a;

        /* renamed from: b */
        public final Rect f564b;

        /* renamed from: c */
        public boolean f565c;

        /* renamed from: d */
        public boolean f566d;

        public n(int i2, int i3) {
            super(i2, i3);
            this.f564b = new Rect();
            this.f565c = true;
            this.f566d = false;
        }

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f564b = new Rect();
            this.f565c = true;
            this.f566d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f564b = new Rect();
            this.f565c = true;
            this.f566d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f564b = new Rect();
            this.f565c = true;
            this.f566d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f564b = new Rect();
            this.f565c = true;
            this.f566d = false;
        }

        public int a() {
            return this.a.h();
        }

        public boolean b() {
            return this.a.r();
        }

        public boolean c() {
            return this.a.o();
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public static class s {
        public SparseArray<a> a = new SparseArray<>();

        /* renamed from: b */
        public int f567b = 0;

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList<a0> a = new ArrayList<>();

            /* renamed from: b */
            public int f568b = 5;

            /* renamed from: c */
            public long f569c = 0;

            /* renamed from: d */
            public long f570d = 0;
        }

        public final a a(int i2) {
            a aVar = this.a.get(i2);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i2, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public long b(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }
    }

    /* loaded from: classes.dex */
    public final class t {
        public final ArrayList<a0> a;

        /* renamed from: b */
        public ArrayList<a0> f571b;

        /* renamed from: c */
        public final ArrayList<a0> f572c;

        /* renamed from: d */
        public final List<a0> f573d;

        /* renamed from: e */
        public int f574e;

        /* renamed from: f */
        public int f575f;

        /* renamed from: g */
        public s f576g;

        public t() {
            RecyclerView.this = r2;
            ArrayList<a0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.f571b = null;
            this.f572c = new ArrayList<>();
            this.f573d = Collections.unmodifiableList(arrayList);
            this.f574e = 2;
            this.f575f = 2;
        }

        public void a(a0 a0Var, boolean z) {
            RecyclerView.n(a0Var);
            View view = a0Var.f527b;
            c0 c0Var = RecyclerView.this.A0;
            if (c0Var != null) {
                c.i.k.e j2 = c0Var.j();
                d0.A(view, j2 instanceof c0.a ? ((c0.a) j2).f2590e.remove(view) : null);
            }
            if (z) {
                u uVar = RecyclerView.this.u;
                if (uVar != null) {
                    uVar.a(a0Var);
                }
                int size = RecyclerView.this.v.size();
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView.this.v.get(i2).a(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                e eVar = recyclerView.s;
                if (recyclerView.t0 != null) {
                    recyclerView.f524m.g(a0Var);
                }
            }
            a0Var.t = null;
            a0Var.s = null;
            s d2 = d();
            Objects.requireNonNull(d2);
            int i3 = a0Var.f532g;
            ArrayList<a0> arrayList = d2.a(i3).a;
            if (d2.a.get(i3).f568b <= arrayList.size()) {
                return;
            }
            a0Var.t();
            arrayList.add(a0Var);
        }

        public void b() {
            this.a.clear();
            f();
        }

        public int c(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.t0.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.t0.f596g ? i2 : recyclerView.f522k.f(i2, 0);
            }
            StringBuilder z = e.a.d.a.a.z("invalid position ", i2, ". State item count is ");
            z.append(RecyclerView.this.t0.b());
            throw new IndexOutOfBoundsException(e.a.d.a.a.c(RecyclerView.this, z));
        }

        public s d() {
            if (this.f576g == null) {
                this.f576g = new s();
            }
            return this.f576g;
        }

        public final void e(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    e((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void f() {
            for (int size = this.f572c.size() - 1; size >= 0; size--) {
                g(size);
            }
            this.f572c.clear();
            if (RecyclerView.f516e) {
                n.b bVar = RecyclerView.this.s0;
                int[] iArr = bVar.f2683c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2684d = 0;
            }
        }

        public void g(int i2) {
            a(this.f572c.get(i2), true);
            this.f572c.remove(i2);
        }

        public void h(View view) {
            a0 N = RecyclerView.N(view);
            if (N.q()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (N.p()) {
                N.o.l(N);
            } else if (N.x()) {
                N.e();
            }
            i(N);
            if (RecyclerView.this.b0 == null || N.n()) {
                return;
            }
            RecyclerView.this.b0.e(N);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x009c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:127:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(androidx.recyclerview.widget.RecyclerView.a0 r6) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.i(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void j(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.N(r5)
                r0 = 12
                boolean r0 = r5.j(r0)
                r1 = 0
                if (r0 != 0) goto L58
                boolean r0 = r5.r()
                if (r0 == 0) goto L58
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.b0
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.i()
                c.u.b.f r0 = (c.u.b.f) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.f2595g
                if (r0 == 0) goto L33
                boolean r0 = r5.m()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = 0
                goto L34
            L33:
                r0 = 1
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = 0
                goto L3a
            L39:
                r0 = 1
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = 0
                goto L40
            L3f:
                r0 = 1
            L40:
                if (r0 == 0) goto L43
                goto L58
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f571b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f571b = r0
            L4e:
                r5.o = r4
                r5.p = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f571b
                r0.add(r5)
                goto L88
            L58:
                boolean r0 = r5.m()
                if (r0 == 0) goto L7f
                boolean r0 = r5.o()
                if (r0 != 0) goto L7f
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.s
                boolean r0 = r0.f540b
                if (r0 == 0) goto L6d
                goto L7f
            L6d:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = e.a.d.a.a.c(r1, r0)
                r5.<init>(r0)
                throw r5
            L7f:
                r5.o = r4
                r5.p = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.a
                r0.add(r5)
            L88:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.j(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:514:0x02ff, code lost:
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:586:0x045b, code lost:
            if (r7.m() == false) goto L240;
         */
        /* JADX WARN: Code restructure failed: missing block: B:596:0x0491, code lost:
            if ((r10 == 0 || r10 + r8 < r20) == false) goto L240;
         */
        /* JADX WARN: Removed duplicated region for block: B:385:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:390:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:444:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:572:0x0423  */
        /* JADX WARN: Removed duplicated region for block: B:580:0x044d  */
        /* JADX WARN: Removed duplicated region for block: B:589:0x047a  */
        /* JADX WARN: Removed duplicated region for block: B:600:0x04a1  */
        /* JADX WARN: Removed duplicated region for block: B:601:0x04a3  */
        /* JADX WARN: Removed duplicated region for block: B:603:0x04a6  */
        /* JADX WARN: Removed duplicated region for block: B:609:0x04ca  */
        /* JADX WARN: Removed duplicated region for block: B:623:0x0513  */
        /* JADX WARN: Removed duplicated region for block: B:638:0x054e  */
        /* JADX WARN: Removed duplicated region for block: B:642:0x0559  */
        /* JADX WARN: Removed duplicated region for block: B:643:0x0567  */
        /* JADX WARN: Removed duplicated region for block: B:649:0x0583 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.a0 k(int r18, boolean r19, long r20) {
            /*
                Method dump skipped, instructions count: 1468
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.k(int, boolean, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public void l(a0 a0Var) {
            if (a0Var.p) {
                this.f571b.remove(a0Var);
            } else {
                this.a.remove(a0Var);
            }
            a0Var.o = null;
            a0Var.p = false;
            a0Var.e();
        }

        public void m() {
            m mVar = RecyclerView.this.t;
            this.f575f = this.f574e + (mVar != null ? mVar.f558l : 0);
            for (int size = this.f572c.size() - 1; size >= 0 && this.f572c.size() > this.f575f; size--) {
                g(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        void a(a0 a0Var);
    }

    /* loaded from: classes.dex */
    public class v extends g {
        public v() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            RecyclerView.this.l(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.t0.f595f = true;
            recyclerView.f0(true);
            if (RecyclerView.this.f522k.g()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i2, int i3, Object obj) {
            RecyclerView.this.l(null);
            c.u.b.a aVar = RecyclerView.this.f522k;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i3 >= 1) {
                aVar.f2579b.add(aVar.h(4, i2, i3, obj));
                aVar.f2583f |= 4;
                if (aVar.f2579b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i2, int i3) {
            RecyclerView.this.l(null);
            c.u.b.a aVar = RecyclerView.this.f522k;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i3 >= 1) {
                aVar.f2579b.add(aVar.h(1, i2, i3, null));
                aVar.f2583f |= 1;
                if (aVar.f2579b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i2, int i3, int i4) {
            RecyclerView.this.l(null);
            c.u.b.a aVar = RecyclerView.this.f522k;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i2 != i3) {
                if (i4 != 1) {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
                aVar.f2579b.add(aVar.h(8, i2, i3, null));
                aVar.f2583f |= 8;
                if (aVar.f2579b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i2, int i3) {
            RecyclerView.this.l(null);
            c.u.b.a aVar = RecyclerView.this.f522k;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i3 >= 1) {
                aVar.f2579b.add(aVar.h(2, i2, i3, null));
                aVar.f2583f |= 2;
                if (aVar.f2579b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                g();
            }
        }

        public void g() {
            if (RecyclerView.f515d) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.A && recyclerView.z) {
                    Runnable runnable = recyclerView.o;
                    AtomicInteger atomicInteger = d0.a;
                    d0.c.m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.I = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class w {

        /* renamed from: b */
        public RecyclerView f578b;

        /* renamed from: c */
        public m f579c;

        /* renamed from: d */
        public boolean f580d;

        /* renamed from: e */
        public boolean f581e;

        /* renamed from: f */
        public View f582f;

        /* renamed from: h */
        public boolean f584h;
        public int a = -1;

        /* renamed from: g */
        public final a f583g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            public int a;

            /* renamed from: b */
            public int f585b;

            /* renamed from: d */
            public int f587d = -1;

            /* renamed from: f */
            public boolean f589f = false;

            /* renamed from: g */
            public int f590g = 0;

            /* renamed from: c */
            public int f586c = Level.ALL_INT;

            /* renamed from: e */
            public Interpolator f588e = null;

            public a(int i2, int i3) {
                this.a = i2;
                this.f585b = i3;
            }

            public void a(RecyclerView recyclerView) {
                int i2 = this.f587d;
                if (i2 >= 0) {
                    this.f587d = -1;
                    recyclerView.T(i2);
                    this.f589f = false;
                } else if (!this.f589f) {
                    this.f590g = 0;
                } else {
                    Interpolator interpolator = this.f588e;
                    if (interpolator != null && this.f586c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i3 = this.f586c;
                    if (i3 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    recyclerView.q0.b(this.a, this.f585b, i3, interpolator);
                    int i4 = this.f590g + 1;
                    this.f590g = i4;
                    if (i4 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f589f = false;
                }
            }

            public void b(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.f585b = i3;
                this.f586c = i4;
                this.f588e = interpolator;
                this.f589f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            m mVar = this.f579c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i2);
            }
            StringBuilder y = e.a.d.a.a.y("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            y.append(b.class.getCanonicalName());
            Log.w("RecyclerView", y.toString());
            return null;
        }

        public void b(int i2, int i3) {
            PointF a2;
            RecyclerView recyclerView = this.f578b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.f580d && this.f582f == null && this.f579c != null && (a2 = a(this.a)) != null) {
                float f2 = a2.x;
                if (f2 != 0.0f || a2.y != 0.0f) {
                    recyclerView.m0((int) Math.signum(f2), (int) Math.signum(a2.y), null);
                }
            }
            this.f580d = false;
            View view = this.f582f;
            if (view != null) {
                Objects.requireNonNull(this.f578b);
                a0 N = RecyclerView.N(view);
                if ((N != null ? N.h() : -1) == this.a) {
                    c(this.f582f, recyclerView.t0, this.f583g);
                    this.f583g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f582f = null;
                }
            }
            if (this.f581e) {
                x xVar = recyclerView.t0;
                a aVar = this.f583g;
                c.u.b.s sVar = (c.u.b.s) this;
                if (sVar.f578b.t.A() == 0) {
                    sVar.d();
                } else {
                    int i4 = sVar.o;
                    int i5 = i4 - i2;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    sVar.o = i5;
                    int i6 = sVar.p;
                    int i7 = i6 - i3;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    sVar.p = i7;
                    if (i5 == 0 && i7 == 0) {
                        PointF a3 = sVar.a(sVar.a);
                        if (a3 != null) {
                            float f3 = a3.x;
                            if (f3 != 0.0f || a3.y != 0.0f) {
                                float f4 = a3.y;
                                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                                float f5 = a3.x / sqrt;
                                a3.x = f5;
                                float f6 = a3.y / sqrt;
                                a3.y = f6;
                                sVar.f2730k = a3;
                                sVar.o = (int) (f5 * 10000.0f);
                                sVar.p = (int) (f6 * 10000.0f);
                                aVar.b((int) (sVar.o * 1.2f), (int) (sVar.p * 1.2f), (int) (sVar.g(10000) * 1.2f), sVar.f2728i);
                            }
                        }
                        aVar.f587d = sVar.a;
                        sVar.d();
                    }
                }
                a aVar2 = this.f583g;
                boolean z = aVar2.f587d >= 0;
                aVar2.a(recyclerView);
                if (z && this.f581e) {
                    this.f580d = true;
                    recyclerView.q0.a();
                }
            }
        }

        public abstract void c(View view, x xVar, a aVar);

        public final void d() {
            if (this.f581e) {
                this.f581e = false;
                c.u.b.s sVar = (c.u.b.s) this;
                sVar.p = 0;
                sVar.o = 0;
                sVar.f2730k = null;
                this.f578b.t0.a = -1;
                this.f582f = null;
                this.a = -1;
                this.f580d = false;
                m mVar = this.f579c;
                if (mVar.f553g == this) {
                    mVar.f553g = null;
                }
                this.f579c = null;
                this.f578b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class x {
        public int a = -1;

        /* renamed from: b */
        public int f591b = 0;

        /* renamed from: c */
        public int f592c = 0;

        /* renamed from: d */
        public int f593d = 1;

        /* renamed from: e */
        public int f594e = 0;

        /* renamed from: f */
        public boolean f595f = false;

        /* renamed from: g */
        public boolean f596g = false;

        /* renamed from: h */
        public boolean f597h = false;

        /* renamed from: i */
        public boolean f598i = false;

        /* renamed from: j */
        public boolean f599j = false;

        /* renamed from: k */
        public boolean f600k = false;

        /* renamed from: l */
        public int f601l;

        /* renamed from: m */
        public long f602m;

        /* renamed from: n */
        public int f603n;

        public void a(int i2) {
            if ((this.f593d & i2) != 0) {
                return;
            }
            StringBuilder y = e.a.d.a.a.y("Layout state should be one of ");
            y.append(Integer.toBinaryString(i2));
            y.append(" but it is ");
            y.append(Integer.toBinaryString(this.f593d));
            throw new IllegalStateException(y.toString());
        }

        public int b() {
            return this.f596g ? this.f591b - this.f592c : this.f594e;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("State{mTargetPosition=");
            y.append(this.a);
            y.append(", mData=");
            y.append((Object) null);
            y.append(", mItemCount=");
            y.append(this.f594e);
            y.append(", mIsMeasuring=");
            y.append(this.f598i);
            y.append(", mPreviousLayoutItemCount=");
            y.append(this.f591b);
            y.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            y.append(this.f592c);
            y.append(", mStructureChanged=");
            y.append(this.f595f);
            y.append(", mInPreLayout=");
            y.append(this.f596g);
            y.append(", mRunSimpleAnimations=");
            y.append(this.f599j);
            y.append(", mRunPredictiveAnimations=");
            y.append(this.f600k);
            y.append('}');
            return y.toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {
        public int a;

        /* renamed from: b */
        public int f604b;

        /* renamed from: c */
        public OverScroller f605c;

        /* renamed from: d */
        public Interpolator f606d;

        /* renamed from: e */
        public boolean f607e;

        /* renamed from: f */
        public boolean f608f;

        public z() {
            RecyclerView.this = r3;
            Interpolator interpolator = RecyclerView.f518g;
            this.f606d = interpolator;
            this.f607e = false;
            this.f608f = false;
            this.f605c = new OverScroller(r3.getContext(), interpolator);
        }

        public void a() {
            if (this.f607e) {
                this.f608f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            AtomicInteger atomicInteger = d0.a;
            d0.c.m(recyclerView, this);
        }

        public void b(int i2, int i3, int i4, Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i4 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.f518g;
            }
            if (this.f606d != interpolator) {
                this.f606d = interpolator;
                this.f605c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f604b = 0;
            this.a = 0;
            RecyclerView.this.setScrollState(2);
            this.f605c.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f605c.computeScrollOffset();
            }
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.t == null) {
                stop();
                return;
            }
            this.f608f = false;
            this.f607e = true;
            recyclerView.q();
            OverScroller overScroller = this.f605c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.a;
                int i5 = currY - this.f604b;
                this.a = currX;
                this.f604b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.G0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.w(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.G0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.p(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.s != null) {
                    int[] iArr3 = recyclerView3.G0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m0(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.G0;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    w wVar = recyclerView4.t.f553g;
                    if (wVar != null && !wVar.f580d && wVar.f581e) {
                        int b2 = recyclerView4.t0.b();
                        if (b2 == 0) {
                            wVar.d();
                        } else if (wVar.a >= b2) {
                            wVar.a = b2 - 1;
                            wVar.b(i3, i2);
                        } else {
                            wVar.b(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.w.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.G0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.x(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.G0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.y(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                w wVar2 = recyclerView7.t.f553g;
                if ((wVar2 != null && wVar2.f580d) || !z) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    c.u.b.n nVar = recyclerView8.r0;
                    if (nVar != null) {
                        nVar.a(recyclerView8, i3, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i8 < 0) {
                            recyclerView9.A();
                            if (recyclerView9.U.isFinished()) {
                                recyclerView9.U.onAbsorb(-i8);
                            }
                        } else if (i8 > 0) {
                            recyclerView9.B();
                            if (recyclerView9.W.isFinished()) {
                                recyclerView9.W.onAbsorb(i8);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.C();
                            if (recyclerView9.V.isFinished()) {
                                recyclerView9.V.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.z();
                            if (recyclerView9.a0.isFinished()) {
                                recyclerView9.a0.onAbsorb(currVelocity);
                            }
                        }
                        if (i8 != 0 || currVelocity != 0) {
                            AtomicInteger atomicInteger = d0.a;
                            d0.c.k(recyclerView9);
                        }
                    }
                    if (RecyclerView.f516e) {
                        n.b bVar = RecyclerView.this.s0;
                        int[] iArr7 = bVar.f2683c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f2684d = 0;
                    }
                }
            }
            w wVar3 = RecyclerView.this.t.f553g;
            if (wVar3 != null && wVar3.f580d) {
                wVar3.b(0, 0);
            }
            this.f607e = false;
            if (!this.f608f) {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.t0(1);
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView10 = RecyclerView.this;
            AtomicInteger atomicInteger2 = d0.a;
            d0.c.m(recyclerView10, this);
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f605c.abortAnimation();
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f513b = i2 == 19 || i2 == 20;
        f514c = i2 >= 23;
        f515d = true;
        f516e = i2 >= 21;
        Class<?> cls = Integer.TYPE;
        f517f = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f518g = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        char c2;
        Constructor constructor;
        Object[] objArr;
        this.f519h = new v();
        this.f520i = new t();
        this.f524m = new g0();
        this.o = new a();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new RectF();
        this.v = new ArrayList();
        this.w = new ArrayList<>();
        this.x = new ArrayList<>();
        this.D = 0;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = new i();
        this.b0 = new c.u.b.f();
        this.c0 = 0;
        this.d0 = -1;
        this.n0 = Float.MIN_VALUE;
        this.o0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.p0 = true;
        this.q0 = new z();
        this.s0 = f516e ? new n.b() : null;
        this.t0 = new x();
        this.w0 = false;
        this.x0 = false;
        this.y0 = new k();
        this.z0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new ArrayList();
        this.I0 = new b();
        this.K0 = 0;
        this.L0 = 0;
        this.M0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j0 = viewConfiguration.getScaledTouchSlop();
        Method method = e0.a;
        int i3 = Build.VERSION.SDK_INT;
        this.n0 = i3 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : e0.a(viewConfiguration, context);
        this.o0 = i3 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : e0.a(viewConfiguration, context);
        this.l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.b0.a = this.y0;
        this.f522k = new c.u.b.a(new b0(this));
        this.f523l = new c.u.b.e(new c.u.b.a0(this));
        AtomicInteger atomicInteger = d0.a;
        if ((i3 >= 26 ? d0.j.b(this) : 0) == 0 && i3 >= 26) {
            d0.j.l(this, 8);
        }
        if (d0.c.c(this) == 0) {
            d0.c.s(this, 1);
        }
        this.J = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new c0(this));
        int[] iArr = c.u.a.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        d0.z(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f525n = obtainStyledAttributes.getBoolean(1, true);
        boolean z3 = obtainStyledAttributes.getBoolean(3, false);
        this.B = z3;
        if (z3) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(e.a.d.a.a.c(this, e.a.d.a.a.y("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            new c.u.b.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + CoreConstants.DOT + trim;
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(f517f);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = a;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            d0.z(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public static RecyclerView I(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView I = I(viewGroup.getChildAt(i2));
                if (I != null) {
                    return I;
                }
            }
            return null;
        }
        return null;
    }

    public static a0 N(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).a;
    }

    private c.i.k.p getScrollingChildHelper() {
        if (this.D0 == null) {
            this.D0 = new c.i.k.p(this);
        }
        return this.D0;
    }

    public static /* synthetic */ void h(RecyclerView recyclerView, int i2, int i3) {
        recyclerView.setMeasuredDimension(i2, i3);
    }

    public static void n(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f528c;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == a0Var.f527b) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            a0Var.f528c = null;
        }
    }

    public void A() {
        if (this.U != null) {
            return;
        }
        EdgeEffect a2 = this.P.a(this);
        this.U = a2;
        if (this.f525n) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void B() {
        if (this.W != null) {
            return;
        }
        EdgeEffect a2 = this.P.a(this);
        this.W = a2;
        if (this.f525n) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void C() {
        if (this.V != null) {
            return;
        }
        EdgeEffect a2 = this.P.a(this);
        this.V = a2;
        if (this.f525n) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String D() {
        StringBuilder y2 = e.a.d.a.a.y(" ");
        y2.append(super.toString());
        y2.append(", adapter:");
        y2.append(this.s);
        y2.append(", layout:");
        y2.append(this.t);
        y2.append(", context:");
        y2.append(getContext());
        return y2.toString();
    }

    public final void E(x xVar) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(xVar);
            return;
        }
        OverScroller overScroller = this.q0.f605c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(xVar);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View F(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F(android.view.View):android.view.View");
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = this.x.get(i2);
            if (qVar.c(this, motionEvent) && action != 3) {
                this.y = qVar;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int e2 = this.f523l.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Level.ALL_INT;
        for (int i4 = 0; i4 < e2; i4++) {
            a0 N = N(this.f523l.d(i4));
            if (!N.w()) {
                int h2 = N.h();
                if (h2 < i2) {
                    i2 = h2;
                }
                if (h2 > i3) {
                    i3 = h2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public a0 J(int i2) {
        a0 a0Var = null;
        if (this.L) {
            return null;
        }
        int h2 = this.f523l.h();
        for (int i3 = 0; i3 < h2; i3++) {
            a0 N = N(this.f523l.g(i3));
            if (N != null && !N.o() && K(N) == i2) {
                if (!this.f523l.k(N.f527b)) {
                    return N;
                }
                a0Var = N;
            }
        }
        return a0Var;
    }

    public int K(a0 a0Var) {
        if (!a0Var.j(524) && a0Var.l()) {
            c.u.b.a aVar = this.f522k;
            int i2 = a0Var.f529d;
            int size = aVar.f2579b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.f2579b.get(i3);
                int i4 = bVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.f2584b;
                        if (i5 <= i2) {
                            int i6 = bVar.f2586d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.f2584b;
                        if (i7 == i2) {
                            i2 = bVar.f2586d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.f2586d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.f2584b <= i2) {
                    i2 += bVar.f2586d;
                }
            }
            return i2;
        }
        return -1;
    }

    public long L(a0 a0Var) {
        return this.s.f540b ? a0Var.f531f : a0Var.f529d;
    }

    public a0 M(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return N(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public Rect O(View view) {
        n nVar = (n) view.getLayoutParams();
        if (nVar.f565c) {
            if (this.t0.f596g && (nVar.b() || nVar.a.m())) {
                return nVar.f564b;
            }
            Rect rect = nVar.f564b;
            rect.set(0, 0, 0, 0);
            int size = this.w.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.set(0, 0, 0, 0);
                this.w.get(i2).f(this.p, view, this, this.t0);
                int i3 = rect.left;
                Rect rect2 = this.p;
                rect.left = i3 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            nVar.f565c = false;
            return rect;
        }
        return nVar.f564b;
    }

    public boolean P() {
        return !this.C || this.L || this.f522k.g();
    }

    public void Q() {
        this.a0 = null;
        this.V = null;
        this.W = null;
        this.U = null;
    }

    public void R() {
        if (this.w.size() == 0) {
            return;
        }
        m mVar = this.t;
        if (mVar != null) {
            mVar.e("Cannot invalidate item decorations during a scroll or layout");
        }
        U();
        requestLayout();
    }

    public boolean S() {
        return this.N > 0;
    }

    public void T(int i2) {
        if (this.t == null) {
            return;
        }
        setScrollState(2);
        this.t.O0(i2);
        awakenScrollBars();
    }

    public void U() {
        int h2 = this.f523l.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((n) this.f523l.g(i2).getLayoutParams()).f565c = true;
        }
        t tVar = this.f520i;
        int size = tVar.f572c.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = (n) tVar.f572c.get(i3).f527b.getLayoutParams();
            if (nVar != null) {
                nVar.f565c = true;
            }
        }
    }

    public void V(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f523l.h();
        for (int i5 = 0; i5 < h2; i5++) {
            a0 N = N(this.f523l.g(i5));
            if (N != null && !N.w()) {
                int i6 = N.f529d;
                if (i6 >= i4) {
                    N.s(-i3, z2);
                    this.t0.f595f = true;
                } else if (i6 >= i2) {
                    N.c(8);
                    N.s(-i3, z2);
                    N.f529d = i2 - 1;
                    this.t0.f595f = true;
                }
            }
        }
        t tVar = this.f520i;
        int size = tVar.f572c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            a0 a0Var = tVar.f572c.get(size);
            if (a0Var != null) {
                int i7 = a0Var.f529d;
                if (i7 >= i4) {
                    a0Var.s(-i3, z2);
                } else if (i7 >= i2) {
                    a0Var.c(8);
                    tVar.g(size);
                }
            }
        }
    }

    public void W() {
    }

    public void X() {
    }

    public void Y() {
        this.N++;
    }

    public void Z(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.N - 1;
        this.N = i3;
        if (i3 < 1) {
            this.N = 0;
            if (z2) {
                int i4 = this.H;
                this.H = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.J;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(ThrowableProxyConverter.BUILDER_CAPACITY);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.H0.size() - 1; size >= 0; size--) {
                    a0 a0Var = this.H0.get(size);
                    if (a0Var.f527b.getParent() == this && !a0Var.w() && (i2 = a0Var.r) != -1) {
                        View view = a0Var.f527b;
                        AtomicInteger atomicInteger = d0.a;
                        d0.c.s(view, i2);
                        a0Var.r = -1;
                    }
                }
                this.H0.clear();
            }
        }
    }

    public final void a0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.d0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.d0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.h0 = x2;
            this.f0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.i0 = y2;
            this.g0 = y2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.t;
        if (mVar == null || !mVar.g0()) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void b0() {
    }

    public void c0() {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.t.i((n) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        m mVar = this.t;
        if (mVar != null && mVar.g()) {
            return this.t.m(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        m mVar = this.t;
        if (mVar != null && mVar.g()) {
            return this.t.n(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        m mVar = this.t;
        if (mVar != null && mVar.g()) {
            return this.t.o(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        m mVar = this.t;
        if (mVar != null && mVar.h()) {
            return this.t.p(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        m mVar = this.t;
        if (mVar != null && mVar.h()) {
            return this.t.q(this.t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        m mVar = this.t;
        if (mVar != null && mVar.h()) {
            return this.t.r(this.t0);
        }
        return 0;
    }

    public void d0() {
        if (this.z0 || !this.z) {
            return;
        }
        Runnable runnable = this.I0;
        AtomicInteger atomicInteger = d0.a;
        d0.c.m(this, runnable);
        this.z0 = true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.w.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.w.get(i2).h(canvas, this, this.t0);
        }
        EdgeEffect edgeEffect = this.U;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f525n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.U;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f525n) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.V;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f525n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.W;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f525n) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.b0 == null || this.w.size() <= 0 || !this.b0.g()) {
            z4 = z2;
        }
        if (z4) {
            AtomicInteger atomicInteger = d0.a;
            d0.c.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0() {
        boolean z2;
        boolean z3 = false;
        if (this.L) {
            c.u.b.a aVar = this.f522k;
            aVar.l(aVar.f2579b);
            aVar.l(aVar.f2580c);
            aVar.f2583f = 0;
            if (this.M) {
                this.t.r0(this);
            }
        }
        if (this.b0 != null && this.t.a1()) {
            this.f522k.j();
        } else {
            this.f522k.c();
        }
        boolean z4 = this.w0 || this.x0;
        x xVar = this.t0;
        boolean z5 = this.C && this.b0 != null && ((z2 = this.L) || z4 || this.t.f554h) && (!z2 || this.s.f540b);
        xVar.f599j = z5;
        if (z5 && z4 && !this.L) {
            if (this.b0 != null && this.t.a1()) {
                z3 = true;
            }
        }
        xVar.f600k = z3;
    }

    public void f0(boolean z2) {
        this.M = z2 | this.M;
        this.L = true;
        int h2 = this.f523l.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 N = N(this.f523l.g(i2));
            if (N != null && !N.w()) {
                N.c(6);
            }
        }
        U();
        t tVar = this.f520i;
        int size = tVar.f572c.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = tVar.f572c.get(i3);
            if (a0Var != null) {
                a0Var.c(6);
                a0Var.b(null);
            }
        }
        e eVar = RecyclerView.this.s;
        if (eVar == null || !eVar.f540b) {
            tVar.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x016b, code lost:
        if (r3 > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0185, code lost:
        if (r6 > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0188, code lost:
        if (r3 < 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x018b, code lost:
        if (r6 < 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0194, code lost:
        if ((r6 * r1) <= 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x019d, code lost:
        if ((r6 * r1) >= 0) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:289:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g0(a0 a0Var, j.c cVar) {
        a0Var.u(0, Compressor.BUFFER_SIZE);
        if (this.t0.f597h && a0Var.r() && !a0Var.o() && !a0Var.w()) {
            this.f524m.f2628b.g(L(a0Var), a0Var);
        }
        this.f524m.c(a0Var, cVar);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.t;
        if (mVar != null) {
            return mVar.w();
        }
        throw new IllegalStateException(e.a.d.a.a.c(this, e.a.d.a.a.y("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.t;
        if (mVar != null) {
            return mVar.x(getContext(), attributeSet);
        }
        throw new IllegalStateException(e.a.d.a.a.c(this, e.a.d.a.a.y("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.t;
        if (mVar != null) {
            return mVar.y(layoutParams);
        }
        throw new IllegalStateException(e.a.d.a.a.c(this, e.a.d.a.a.y("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.s;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.t;
        if (mVar != null) {
            Objects.requireNonNull(mVar);
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        h hVar = this.B0;
        if (hVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        c.u.b.q qVar = (c.u.b.q) hVar;
        c.u.b.o oVar = qVar.a;
        View view = oVar.x;
        if (view == null) {
            return i3;
        }
        int i4 = oVar.y;
        if (i4 == -1) {
            i4 = oVar.r.indexOfChild(view);
            qVar.a.y = i4;
        }
        return i3 == i2 + (-1) ? i4 : i3 < i4 ? i3 : i3 + 1;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f525n;
    }

    public c0 getCompatAccessibilityDelegate() {
        return this.A0;
    }

    public i getEdgeEffectFactory() {
        return this.P;
    }

    public j getItemAnimator() {
        return this.b0;
    }

    public int getItemDecorationCount() {
        return this.w.size();
    }

    public m getLayoutManager() {
        return this.t;
    }

    public int getMaxFlingVelocity() {
        return this.m0;
    }

    public int getMinFlingVelocity() {
        return this.l0;
    }

    public long getNanoTime() {
        if (f516e) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return this.k0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.p0;
    }

    public s getRecycledViewPool() {
        return this.f520i.d();
    }

    public int getScrollState() {
        return this.c0;
    }

    public void h0() {
        j jVar = this.b0;
        if (jVar != null) {
            jVar.f();
        }
        m mVar = this.t;
        if (mVar != null) {
            mVar.G0(this.f520i);
            this.t.H0(this.f520i);
        }
        this.f520i.b();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public final void i(a0 a0Var) {
        View view = a0Var.f527b;
        boolean z2 = view.getParent() == this;
        this.f520i.l(M(view));
        if (a0Var.q()) {
            this.f523l.b(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f523l.a(view, -1, true);
        } else {
            c.u.b.e eVar = this.f523l;
            int indexOfChild = ((c.u.b.a0) eVar.a).a.indexOfChild(view);
            if (indexOfChild >= 0) {
                eVar.f2596b.h(indexOfChild);
                eVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void i0(l lVar) {
        m mVar = this.t;
        if (mVar != null) {
            mVar.e("Cannot remove item decoration during a scroll  or layout");
        }
        this.w.remove(lVar);
        if (this.w.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        U();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.z;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.F;
    }

    @Override // android.view.View, c.i.k.o
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2212d;
    }

    public void j(l lVar) {
        m mVar = this.t;
        if (mVar != null) {
            mVar.e("Cannot add item decoration during a scroll  or layout");
        }
        if (this.w.isEmpty()) {
            setWillNotDraw(false);
        }
        this.w.add(lVar);
        U();
        requestLayout();
    }

    public final void j0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f565c) {
                Rect rect = nVar.f564b;
                Rect rect2 = this.p;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.p);
            offsetRectIntoDescendantCoords(view, this.p);
        }
        this.t.L0(this, view, this.p, !this.C, view2 == null);
    }

    public void k(r rVar) {
        if (this.v0 == null) {
            this.v0 = new ArrayList();
        }
        this.v0.add(rVar);
    }

    public final void k0() {
        VelocityTracker velocityTracker = this.e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        t0(0);
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.a0.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = d0.a;
            d0.c.k(this);
        }
    }

    public void l(String str) {
        if (S()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(e.a.d.a.a.c(this, e.a.d.a.a.y("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else if (this.O > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(e.a.d.a.a.c(this, e.a.d.a.a.y(""))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void m() {
        k0();
        setScrollState(0);
    }

    public void m0(int i2, int i3, int[] iArr) {
        a0 a0Var;
        q0();
        Y();
        int i4 = c.i.g.g.a;
        Trace.beginSection("RV Scroll");
        E(this.t0);
        int N0 = i2 != 0 ? this.t.N0(i2, this.f520i, this.t0) : 0;
        int P0 = i3 != 0 ? this.t.P0(i3, this.f520i, this.t0) : 0;
        Trace.endSection();
        int e2 = this.f523l.e();
        for (int i5 = 0; i5 < e2; i5++) {
            View d2 = this.f523l.d(i5);
            a0 M = M(d2);
            if (M != null && (a0Var = M.f535j) != null) {
                View view = a0Var.f527b;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Z(true);
        s0(false);
        if (iArr != null) {
            iArr[0] = N0;
            iArr[1] = P0;
        }
    }

    public void n0(int i2) {
        if (this.F) {
            return;
        }
        u0();
        m mVar = this.t;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        mVar.O0(i2);
        awakenScrollBars();
    }

    public void o() {
        int h2 = this.f523l.h();
        for (int i2 = 0; i2 < h2; i2++) {
            a0 N = N(this.f523l.g(i2));
            if (!N.w()) {
                N.d();
            }
        }
        t tVar = this.f520i;
        int size = tVar.f572c.size();
        for (int i3 = 0; i3 < size; i3++) {
            tVar.f572c.get(i3).d();
        }
        int size2 = tVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            tVar.a.get(i4).d();
        }
        ArrayList<a0> arrayList = tVar.f571b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                tVar.f571b.get(i5).d();
            }
        }
    }

    public boolean o0(a0 a0Var, int i2) {
        if (S()) {
            a0Var.r = i2;
            this.H0.add(a0Var);
            return false;
        }
        View view = a0Var.f527b;
        AtomicInteger atomicInteger = d0.a;
        d0.c.s(view, i2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = 0;
        this.z = true;
        this.C = this.C && !isLayoutRequested();
        m mVar = this.t;
        if (mVar != null) {
            mVar.f555i = true;
            mVar.h0();
        }
        this.z0 = false;
        if (f516e) {
            ThreadLocal<c.u.b.n> threadLocal = c.u.b.n.a;
            c.u.b.n nVar = threadLocal.get();
            this.r0 = nVar;
            if (nVar == null) {
                this.r0 = new c.u.b.n();
                AtomicInteger atomicInteger = d0.a;
                Display b2 = d0.d.b(this);
                float f2 = 60.0f;
                if (!isInEditMode() && b2 != null) {
                    float refreshRate = b2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                c.u.b.n nVar2 = this.r0;
                nVar2.f2680e = 1.0E9f / f2;
                threadLocal.set(nVar2);
            }
            this.r0.f2678c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        c.u.b.n nVar;
        super.onDetachedFromWindow();
        j jVar = this.b0;
        if (jVar != null) {
            jVar.f();
        }
        u0();
        this.z = false;
        m mVar = this.t;
        if (mVar != null) {
            t tVar = this.f520i;
            mVar.f555i = false;
            mVar.j0(this, tVar);
        }
        this.H0.clear();
        removeCallbacks(this.I0);
        Objects.requireNonNull(this.f524m);
        do {
        } while (g0.a.a.b() != null);
        if (!f516e || (nVar = this.r0) == null) {
            return;
        }
        nVar.f2678c.remove(this);
        this.r0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.w.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.w.get(i2).g(canvas, this, this.t0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.F) {
            return false;
        }
        this.y = null;
        if (G(motionEvent)) {
            m();
            return true;
        }
        m mVar = this.t;
        if (mVar == null) {
            return false;
        }
        boolean g2 = mVar.g();
        boolean h2 = this.t.h();
        if (this.e0 == null) {
            this.e0 = VelocityTracker.obtain();
        }
        this.e0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.G) {
                this.G = false;
            }
            this.d0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.h0 = x2;
            this.f0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.i0 = y2;
            this.g0 = y2;
            if (this.c0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t0(1);
            }
            int[] iArr = this.F0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = g2;
            if (h2) {
                i2 = (g2 ? 1 : 0) | 2;
            }
            r0(i2, 0);
        } else if (actionMasked == 1) {
            this.e0.clear();
            t0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.d0);
            if (findPointerIndex < 0) {
                StringBuilder y3 = e.a.d.a.a.y("Error processing scroll; pointer index for id ");
                y3.append(this.d0);
                y3.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", y3.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.c0 != 1) {
                int i3 = x3 - this.f0;
                int i4 = y4 - this.g0;
                if (!g2 || Math.abs(i3) <= this.j0) {
                    z2 = false;
                } else {
                    this.h0 = x3;
                    z2 = true;
                }
                if (h2 && Math.abs(i4) > this.j0) {
                    this.i0 = y4;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m();
        } else if (actionMasked == 5) {
            this.d0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.h0 = x4;
            this.f0 = x4;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.i0 = y5;
            this.g0 = y5;
        } else if (actionMasked == 6) {
            a0(motionEvent);
        }
        return this.c0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = c.i.g.g.a;
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.C = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        m mVar = this.t;
        if (mVar == null) {
            r(i2, i3);
            return;
        }
        boolean z2 = false;
        if (mVar.Y()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.t.y0(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.J0 = z2;
            if (z2 || this.s == null) {
                return;
            }
            if (this.t0.f593d == 1) {
                u();
            }
            this.t.R0(i2, i3);
            this.t0.f598i = true;
            v();
            this.t.T0(i2, i3);
            if (this.t.W0()) {
                this.t.R0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.t0.f598i = true;
                v();
                this.t.T0(i2, i3);
            }
            this.K0 = getMeasuredWidth();
            this.L0 = getMeasuredHeight();
        } else if (this.A) {
            this.t.y0(i2, i3);
        } else {
            if (this.I) {
                q0();
                Y();
                e0();
                Z(true);
                x xVar = this.t0;
                if (xVar.f600k) {
                    xVar.f596g = true;
                } else {
                    this.f522k.c();
                    this.t0.f596g = false;
                }
                this.I = false;
                s0(false);
            } else if (this.t0.f600k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.s;
            if (eVar != null) {
                this.t0.f594e = eVar.b();
            } else {
                this.t0.f594e = 0;
            }
            q0();
            this.t.y0(i2, i3);
            s0(false);
            this.t0.f596g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (S()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f521j = savedState;
        super.onRestoreInstanceState(savedState.f369b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f521j;
        if (savedState2 != null) {
            savedState.f526c = savedState2.f526c;
        } else {
            m mVar = this.t;
            if (mVar != null) {
                savedState.f526c = mVar.C0();
            } else {
                savedState.f526c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:465:0x0321, code lost:
        if (r3 < r8) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x03a4, code lost:
        if (r8 != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x03e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.U;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.U.onRelease();
            z2 = this.U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.W.onRelease();
            z2 |= this.W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.V.onRelease();
            z2 |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.a0.onRelease();
            z2 |= this.a0.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = d0.a;
            d0.c.k(this);
        }
    }

    public void p0(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        m mVar = this.t;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.F) {
        } else {
            if (!mVar.g()) {
                i2 = 0;
            }
            if (!this.t.h()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
                scrollBy(i2, i3);
                return;
            }
            if (z2) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                r0(i5, 1);
            }
            this.q0.b(i2, i3, i4, interpolator);
        }
    }

    public void q() {
        if (!this.C || this.L) {
            int i2 = c.i.g.g.a;
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
        } else if (this.f522k.g()) {
            c.u.b.a aVar = this.f522k;
            int i3 = aVar.f2583f;
            boolean z2 = false;
            if ((i3 & 4) != 0) {
                if (!((i3 & 11) != 0)) {
                    int i4 = c.i.g.g.a;
                    Trace.beginSection("RV PartialInvalidate");
                    q0();
                    Y();
                    this.f522k.j();
                    if (!this.E) {
                        int e2 = this.f523l.e();
                        int i5 = 0;
                        while (true) {
                            if (i5 < e2) {
                                a0 N = N(this.f523l.d(i5));
                                if (N != null && !N.w() && N.r()) {
                                    z2 = true;
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        if (z2) {
                            t();
                        } else {
                            this.f522k.b();
                        }
                    }
                    s0(true);
                    Z(true);
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.g()) {
                int i6 = c.i.g.g.a;
                Trace.beginSection("RV FullInvalidate");
                t();
                Trace.endSection();
            }
        }
    }

    public void q0() {
        int i2 = this.D + 1;
        this.D = i2;
        if (i2 != 1 || this.F) {
            return;
        }
        this.E = false;
    }

    public void r(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        AtomicInteger atomicInteger = d0.a;
        setMeasuredDimension(m.j(i2, paddingRight, d0.c.e(this)), m.j(i3, getPaddingBottom() + getPaddingTop(), d0.c.d(this)));
    }

    public boolean r0(int i2, int i3) {
        return getScrollingChildHelper().j(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        a0 N = N(view);
        if (N != null) {
            if (N.q()) {
                N.f536k &= -257;
            } else if (!N.w()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N);
                throw new IllegalArgumentException(e.a.d.a.a.c(this, sb));
            }
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.t.A0(this, view, view2) && view2 != null) {
            j0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.t.L0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.D != 0 || this.F) {
            this.E = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(View view) {
        a0 N = N(view);
        X();
        e eVar = this.s;
        if (eVar != null && N != null) {
            Objects.requireNonNull(eVar);
        }
        List<o> list = this.K;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.K.get(size).b(view);
            }
        }
    }

    public void s0(boolean z2) {
        if (this.D < 1) {
            this.D = 1;
        }
        if (!z2 && !this.F) {
            this.E = false;
        }
        if (this.D == 1) {
            if (z2 && this.E && !this.F && this.t != null && this.s != null) {
                t();
            }
            if (!this.F) {
                this.E = false;
            }
        }
        this.D--;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        m mVar = this.t;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.F) {
        } else {
            boolean g2 = mVar.g();
            boolean h2 = this.t.h();
            if (g2 || h2) {
                if (!g2) {
                    i2 = 0;
                }
                if (!h2) {
                    i3 = 0;
                }
                l0(i2, i3, null, 0);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (S()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.H |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(c0 c0Var) {
        this.A0 = c0Var;
        d0.A(this, c0Var);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.s;
        if (eVar2 != null) {
            eVar2.a.unregisterObserver(this.f519h);
            Objects.requireNonNull(this.s);
        }
        h0();
        c.u.b.a aVar = this.f522k;
        aVar.l(aVar.f2579b);
        aVar.l(aVar.f2580c);
        aVar.f2583f = 0;
        e eVar3 = this.s;
        this.s = eVar;
        if (eVar != null) {
            eVar.a.registerObserver(this.f519h);
        }
        m mVar = this.t;
        if (mVar != null) {
            mVar.f0(eVar3, this.s);
        }
        t tVar = this.f520i;
        e eVar4 = this.s;
        tVar.b();
        s d2 = tVar.d();
        Objects.requireNonNull(d2);
        if (eVar3 != null) {
            d2.f567b--;
        }
        if (d2.f567b == 0) {
            for (int i2 = 0; i2 < d2.a.size(); i2++) {
                d2.a.valueAt(i2).a.clear();
            }
        }
        if (eVar4 != null) {
            d2.f567b++;
        }
        this.t0.f595f = true;
        f0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == this.B0) {
            return;
        }
        this.B0 = hVar;
        setChildrenDrawingOrderEnabled(hVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f525n) {
            Q();
        }
        this.f525n = z2;
        super.setClipToPadding(z2);
        if (this.C) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        Objects.requireNonNull(iVar);
        this.P = iVar;
        Q();
    }

    public void setHasFixedSize(boolean z2) {
        this.A = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.b0;
        if (jVar2 != null) {
            jVar2.f();
            this.b0.a = null;
        }
        this.b0 = jVar;
        if (jVar != null) {
            jVar.a = this.y0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        t tVar = this.f520i;
        tVar.f574e = i2;
        tVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(m mVar) {
        if (mVar == this.t) {
            return;
        }
        u0();
        if (this.t != null) {
            j jVar = this.b0;
            if (jVar != null) {
                jVar.f();
            }
            this.t.G0(this.f520i);
            this.t.H0(this.f520i);
            this.f520i.b();
            if (this.z) {
                m mVar2 = this.t;
                t tVar = this.f520i;
                mVar2.f555i = false;
                mVar2.j0(this, tVar);
            }
            this.t.U0(null);
            this.t = null;
        } else {
            this.f520i.b();
        }
        c.u.b.e eVar = this.f523l;
        e.a aVar = eVar.f2596b;
        aVar.a = 0L;
        e.a aVar2 = aVar.f2598b;
        if (aVar2 != null) {
            aVar2.g();
        }
        int size = eVar.f2597c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            c.u.b.a0 a0Var = (c.u.b.a0) eVar.a;
            Objects.requireNonNull(a0Var);
            a0 N = N(eVar.f2597c.get(size));
            if (N != null) {
                a0Var.a.o0(N, N.q);
                N.q = 0;
            }
            eVar.f2597c.remove(size);
        }
        c.u.b.a0 a0Var2 = (c.u.b.a0) eVar.a;
        int b2 = a0Var2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            View a2 = a0Var2.a(i2);
            a0Var2.a.s(a2);
            a2.clearAnimation();
        }
        a0Var2.a.removeAllViews();
        this.t = mVar;
        if (mVar != null) {
            if (mVar.f548b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(mVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(e.a.d.a.a.c(mVar.f548b, sb));
            }
            mVar.U0(this);
            if (this.z) {
                m mVar3 = this.t;
                mVar3.f555i = true;
                mVar3.h0();
            }
        }
        this.f520i.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().i(z2);
    }

    public void setOnFlingListener(p pVar) {
        this.k0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.u0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.p0 = z2;
    }

    public void setRecycledViewPool(s sVar) {
        s sVar2;
        t tVar = this.f520i;
        if (tVar.f576g != null) {
            sVar2.f567b--;
        }
        tVar.f576g = sVar;
        if (sVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        tVar.f576g.f567b++;
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.u = uVar;
    }

    public void setScrollState(int i2) {
        w wVar;
        if (i2 == this.c0) {
            return;
        }
        this.c0 = i2;
        if (i2 != 2) {
            this.q0.stop();
            m mVar = this.t;
            if (mVar != null && (wVar = mVar.f553g) != null) {
                wVar.d();
            }
        }
        m mVar2 = this.t;
        if (mVar2 != null) {
            mVar2.D0(i2);
        }
        b0();
        r rVar = this.u0;
        if (rVar != null) {
            rVar.a(this, i2);
        }
        List<r> list = this.v0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.v0.get(size).a(this, i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.j0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.j0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(y yVar) {
        Objects.requireNonNull(this.f520i);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().j(i2, 0);
    }

    @Override // android.view.View, c.i.k.o
    public void stopNestedScroll() {
        getScrollingChildHelper().k(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.F) {
            l("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.F = true;
                this.G = true;
                u0();
                return;
            }
            this.F = false;
            if (this.E && this.t != null && this.s != null) {
                requestLayout();
            }
            this.E = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:401:0x0350, code lost:
        if (r15.f523l.k(getFocusedChild()) == false) goto L222;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public void t0(int i2) {
        getScrollingChildHelper().k(i2);
    }

    public final void u() {
        View F;
        this.t0.a(1);
        E(this.t0);
        this.t0.f598i = false;
        q0();
        g0 g0Var = this.f524m;
        g0Var.a.clear();
        g0Var.f2628b.b();
        Y();
        e0();
        View focusedChild = (this.p0 && hasFocus() && this.s != null) ? getFocusedChild() : null;
        a0 M = (focusedChild == null || (F = F(focusedChild)) == null) ? null : M(F);
        if (M == null) {
            x xVar = this.t0;
            xVar.f602m = -1L;
            xVar.f601l = -1;
            xVar.f603n = -1;
        } else {
            x xVar2 = this.t0;
            xVar2.f602m = this.s.f540b ? M.f531f : -1L;
            xVar2.f601l = this.L ? -1 : M.o() ? M.f530e : M.f();
            x xVar3 = this.t0;
            View view = M.f527b;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            xVar3.f603n = id;
        }
        x xVar4 = this.t0;
        xVar4.f597h = xVar4.f599j && this.x0;
        this.x0 = false;
        this.w0 = false;
        xVar4.f596g = xVar4.f600k;
        xVar4.f594e = this.s.b();
        H(this.C0);
        if (this.t0.f599j) {
            int e2 = this.f523l.e();
            for (int i2 = 0; i2 < e2; i2++) {
                a0 N = N(this.f523l.d(i2));
                if (!N.w() && (!N.m() || this.s.f540b)) {
                    j jVar = this.b0;
                    j.b(N);
                    N.i();
                    this.f524m.c(N, jVar.h(N));
                    if (this.t0.f597h && N.r() && !N.o() && !N.w() && !N.m()) {
                        this.f524m.f2628b.g(L(N), N);
                    }
                }
            }
        }
        if (this.t0.f600k) {
            int h2 = this.f523l.h();
            for (int i3 = 0; i3 < h2; i3++) {
                a0 N2 = N(this.f523l.g(i3));
                if (!N2.w() && N2.f530e == -1) {
                    N2.f530e = N2.f529d;
                }
            }
            x xVar5 = this.t0;
            boolean z2 = xVar5.f595f;
            xVar5.f595f = false;
            this.t.w0(this.f520i, xVar5);
            this.t0.f595f = z2;
            for (int i4 = 0; i4 < this.f523l.e(); i4++) {
                a0 N3 = N(this.f523l.d(i4));
                if (!N3.w()) {
                    g0.a orDefault = this.f524m.a.getOrDefault(N3, null);
                    if (!((orDefault == null || (orDefault.f2629b & 4) == 0) ? false : true)) {
                        j.b(N3);
                        boolean j2 = N3.j(Compressor.BUFFER_SIZE);
                        j jVar2 = this.b0;
                        N3.i();
                        j.c h3 = jVar2.h(N3);
                        if (j2) {
                            g0(N3, h3);
                        } else {
                            g0 g0Var2 = this.f524m;
                            g0.a orDefault2 = g0Var2.a.getOrDefault(N3, null);
                            if (orDefault2 == null) {
                                orDefault2 = g0.a.a();
                                g0Var2.a.put(N3, orDefault2);
                            }
                            orDefault2.f2629b |= 2;
                            orDefault2.f2630c = h3;
                        }
                    }
                }
            }
            o();
        } else {
            o();
        }
        Z(true);
        s0(false);
        this.t0.f593d = 2;
    }

    public void u0() {
        w wVar;
        setScrollState(0);
        this.q0.stop();
        m mVar = this.t;
        if (mVar == null || (wVar = mVar.f553g) == null) {
            return;
        }
        wVar.d();
    }

    public final void v() {
        q0();
        Y();
        this.t0.a(6);
        this.f522k.c();
        this.t0.f594e = this.s.b();
        this.t0.f592c = 0;
        if (this.f521j != null) {
            e eVar = this.s;
            int ordinal = eVar.f541c.ordinal();
            if (ordinal == 1 ? eVar.b() > 0 : ordinal != 2) {
                Parcelable parcelable = this.f521j.f526c;
                if (parcelable != null) {
                    this.t.B0(parcelable);
                }
                this.f521j = null;
            }
        }
        x xVar = this.t0;
        xVar.f596g = false;
        this.t.w0(this.f520i, xVar);
        x xVar2 = this.t0;
        xVar2.f595f = false;
        xVar2.f599j = xVar2.f599j && this.b0 != null;
        xVar2.f593d = 4;
        Z(true);
        s0(false);
    }

    public boolean w(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void x(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void y(int i2, int i3) {
        this.O++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        c0();
        r rVar = this.u0;
        if (rVar != null) {
            rVar.b(this, i2, i3);
        }
        List<r> list = this.v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.v0.get(size).b(this, i2, i3);
            }
        }
        this.O--;
    }

    public void z() {
        if (this.a0 != null) {
            return;
        }
        EdgeEffect a2 = this.P.a(this);
        this.a0 = a2;
        if (this.f525n) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
