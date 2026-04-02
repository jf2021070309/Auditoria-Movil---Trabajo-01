package c.g.b.a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.b.a.d;
import c.g.c.c;
import c.i.k.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class c extends ConstraintLayout implements r {
    public static final /* synthetic */ int u = 0;
    public long A;
    public float B;
    public float C;
    public float D;
    public long E;
    public float F;
    public InterfaceC0030c G;
    public int H;
    public c.g.b.a.a I;
    public long J;
    public boolean K;
    public ArrayList<c.g.b.a.b> L;
    public ArrayList<c.g.b.a.b> M;
    public CopyOnWriteArrayList<InterfaceC0030c> N;
    public int O;
    public float P;
    public float U;
    public boolean V;
    public b W;
    public boolean a0;
    public d b0;
    public boolean c0;
    public float v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.W.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public float a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f1812b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f1813c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1814d = -1;

        public b() {
        }

        public void a() {
            int a;
            int i2 = this.f1813c;
            if (i2 != -1 || this.f1814d != -1) {
                if (i2 == -1) {
                    c.this.x(this.f1814d);
                } else {
                    int i3 = this.f1814d;
                    if (i3 == -1) {
                        c cVar = c.this;
                        Objects.requireNonNull(cVar);
                        cVar.setState(d.SETUP);
                        cVar.x = i2;
                        cVar.w = -1;
                        cVar.y = -1;
                        c.g.c.c cVar2 = cVar.f291l;
                        if (cVar2 != null) {
                            float f2 = -1;
                            int i4 = cVar2.f1830b;
                            if (i4 == i2) {
                                c.a valueAt = i2 == -1 ? cVar2.f1832d.valueAt(0) : cVar2.f1832d.get(i4);
                                int i5 = cVar2.f1831c;
                                if ((i5 == -1 || !valueAt.f1834b.get(i5).a(f2, f2)) && cVar2.f1831c != (a = valueAt.a(f2, f2))) {
                                    c.g.c.d dVar = a == -1 ? null : valueAt.f1834b.get(a).f1841f;
                                    if (a != -1) {
                                        int i6 = valueAt.f1834b.get(a).f1840e;
                                    }
                                    if (dVar != null) {
                                        cVar2.f1831c = a;
                                        dVar.a(cVar2.a);
                                    }
                                }
                            } else {
                                cVar2.f1830b = i2;
                                c.a aVar = cVar2.f1832d.get(i2);
                                int a2 = aVar.a(f2, f2);
                                c.g.c.d dVar2 = a2 == -1 ? aVar.f1836d : aVar.f1834b.get(a2).f1841f;
                                if (a2 != -1) {
                                    int i7 = aVar.f1834b.get(a2).f1840e;
                                }
                                if (dVar2 != null) {
                                    cVar2.f1831c = a2;
                                    dVar2.a(cVar2.a);
                                }
                            }
                        }
                    } else {
                        c.this.w(i2, i3);
                    }
                }
                c.this.setState(d.SETUP);
            }
            if (Float.isNaN(this.f1812b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                c.this.setProgress(this.a);
                return;
            }
            c.this.v(this.a, this.f1812b);
            this.a = Float.NaN;
            this.f1812b = Float.NaN;
            this.f1813c = -1;
            this.f1814d = -1;
        }
    }

    /* renamed from: c.g.b.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0030c {
        void a(c cVar, int i2, int i3, float f2);

        void b(c cVar, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        s(false);
        super.dispatchDraw(canvas);
    }

    @Override // c.i.k.r
    public void e(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.x;
    }

    public ArrayList<d.a> getDefinedTransitions() {
        return null;
    }

    public c.g.b.a.a getDesignTool() {
        if (this.I == null) {
            this.I = new c.g.b.a.a(this);
        }
        return this.I;
    }

    public int getEndState() {
        return this.y;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.D;
    }

    public c.g.b.a.d getScene() {
        return null;
    }

    public int getStartState() {
        return this.w;
    }

    public float getTargetPosition() {
        return this.F;
    }

    public Bundle getTransitionState() {
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        c cVar = c.this;
        bVar.f1814d = cVar.y;
        bVar.f1813c = cVar.w;
        bVar.f1812b = cVar.getVelocity();
        bVar.a = c.this.getProgress();
        b bVar2 = this.W;
        Objects.requireNonNull(bVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.a);
        bundle.putFloat("motion.velocity", bVar2.f1812b);
        bundle.putInt("motion.StartState", bVar2.f1813c);
        bundle.putInt("motion.EndState", bVar2.f1814d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return this.B * 1000.0f;
    }

    public float getVelocity() {
        return this.v;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void i(int i2) {
        this.f291l = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // c.i.k.q
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // c.i.k.q
    public boolean l(View view, View view2, int i2, int i3) {
        return false;
    }

    @Override // c.i.k.q
    public void m(View view, View view2, int i2, int i3) {
        this.J = getNanoTime();
    }

    @Override // c.i.k.q
    public void n(View view, int i2) {
    }

    @Override // c.i.k.q
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.W;
        if (bVar != null) {
            if (this.a0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.V = true;
        try {
            super.onLayout(z, i2, i3, i4, i5);
        } finally {
            this.V = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.i.k.s
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c.g.b.a.b) {
            c.g.b.a.b bVar = (c.g.b.a.b) view;
            if (this.N == null) {
                this.N = new CopyOnWriteArrayList<>();
            }
            this.N.add(bVar);
            if (bVar.f1808i) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                this.L.add(bVar);
            }
            if (bVar.f1809j) {
                if (this.M == null) {
                    this.M = new ArrayList<>();
                }
                this.M.add(bVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c.g.b.a.b> arrayList = this.L;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c.g.b.a.b> arrayList2 = this.M;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        int i2 = this.x;
        super.requestLayout();
    }

    public void s(boolean z) {
        boolean z2;
        int i2;
        if (this.E == -1) {
            this.E = getNanoTime();
        }
        float f2 = this.D;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.x = -1;
        }
        boolean z3 = false;
        if (this.K) {
            float signum = Math.signum(this.F - f2);
            long nanoTime = getNanoTime();
            float f3 = ((((float) (nanoTime - this.E)) * signum) * 1.0E-9f) / this.B;
            float f4 = this.D + f3;
            if ((signum > 0.0f && f4 >= this.F) || (signum <= 0.0f && f4 <= this.F)) {
                f4 = this.F;
            }
            this.D = f4;
            this.C = f4;
            this.E = nanoTime;
            this.v = f3;
            if (Math.abs(f3) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((signum > 0.0f && f4 >= this.F) || (signum <= 0.0f && f4 <= this.F)) {
                f4 = this.F;
            }
            if (f4 >= 1.0f || f4 <= 0.0f) {
                setState(d.FINISHED);
            }
            int childCount = getChildCount();
            this.K = false;
            getNanoTime();
            this.U = f4;
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z4 = (signum > 0.0f && f4 >= this.F) || (signum <= 0.0f && f4 <= this.F);
            if (!this.K && z4) {
                setState(d.FINISHED);
            }
            boolean z5 = (!z4) | this.K;
            this.K = z5;
            if (f4 <= 0.0f && (i2 = this.w) != -1 && this.x != i2) {
                this.x = i2;
                throw null;
            }
            if (f4 >= 1.0d) {
                int i3 = this.x;
                int i4 = this.y;
                if (i3 != i4) {
                    this.x = i4;
                    throw null;
                }
            }
            if (z5) {
                invalidate();
            } else if ((signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                setState(d.FINISHED);
            }
            if (!this.K && (signum <= 0.0f || f4 != 1.0f)) {
                int i5 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            }
        }
        float f5 = this.D;
        if (f5 < 1.0f) {
            if (f5 <= 0.0f) {
                int i6 = this.x;
                int i7 = this.w;
                z2 = i6 != i7;
                this.x = i7;
            }
            this.c0 |= z3;
            if (z3 && !this.V) {
                requestLayout();
            }
            this.C = this.D;
        }
        int i8 = this.x;
        int i9 = this.y;
        z2 = i8 != i9;
        this.x = i9;
        z3 = z2;
        this.c0 |= z3;
        if (z3) {
            requestLayout();
        }
        this.C = this.D;
    }

    public void setDebugMode(int i2) {
        this.H = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.a0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.z = z;
    }

    public void setInterpolatedProgress(float f2) {
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<c.g.b.a.b> arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.M.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<c.g.b.a.b> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.L.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.W == null) {
                this.W = new b();
            }
            this.W.a = f2;
        } else if (f2 <= 0.0f) {
            if (this.D == 1.0f && this.x == this.y) {
                setState(d.MOVING);
            }
            this.x = this.w;
            if (this.D == 0.0f) {
                setState(d.FINISHED);
            }
        } else if (f2 < 1.0f) {
            this.x = -1;
            setState(d.MOVING);
        } else {
            if (this.D == 0.0f && this.x == this.w) {
                setState(d.MOVING);
            }
            this.x = this.y;
            if (this.D == 1.0f) {
                setState(d.FINISHED);
            }
        }
    }

    public void setScene(c.g.b.a.d dVar) {
        h();
        throw null;
    }

    public void setStartState(int i2) {
        if (super.isAttachedToWindow()) {
            this.x = i2;
            return;
        }
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        bVar.f1813c = i2;
        bVar.f1814d = i2;
    }

    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.x == -1) {
            return;
        }
        d dVar3 = this.b0;
        this.b0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            t();
        }
        int ordinal = dVar3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && dVar == dVar2) {
                u();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            t();
        }
        if (dVar == dVar2) {
            u();
        }
    }

    public void setTransition(int i2) {
    }

    public void setTransition(d.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i2) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(InterfaceC0030c interfaceC0030c) {
        this.G = interfaceC0030c;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        Objects.requireNonNull(bVar);
        bVar.a = bundle.getFloat("motion.progress");
        bVar.f1812b = bundle.getFloat("motion.velocity");
        bVar.f1813c = bundle.getInt("motion.StartState");
        bVar.f1814d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.W.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<InterfaceC0030c> copyOnWriteArrayList;
        if ((this.G == null && ((copyOnWriteArrayList = this.N) == null || copyOnWriteArrayList.isEmpty())) || this.P == this.C) {
            return;
        }
        if (this.O != -1) {
            InterfaceC0030c interfaceC0030c = this.G;
            if (interfaceC0030c != null) {
                interfaceC0030c.b(this, this.w, this.y);
            }
            CopyOnWriteArrayList<InterfaceC0030c> copyOnWriteArrayList2 = this.N;
            if (copyOnWriteArrayList2 != null) {
                Iterator<InterfaceC0030c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, this.w, this.y);
                }
            }
        }
        this.O = -1;
        float f2 = this.C;
        this.P = f2;
        InterfaceC0030c interfaceC0030c2 = this.G;
        if (interfaceC0030c2 != null) {
            interfaceC0030c2.a(this, this.w, this.y, f2);
        }
        CopyOnWriteArrayList<InterfaceC0030c> copyOnWriteArrayList3 = this.N;
        if (copyOnWriteArrayList3 != null) {
            Iterator<InterfaceC0030c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.w, this.y, this.C);
            }
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return c.e.a.d(context, this.w) + "->" + c.e.a.d(context, this.y) + " (pos:" + this.D + " Dpos/Dt:" + this.v;
    }

    public void u() {
        CopyOnWriteArrayList<InterfaceC0030c> copyOnWriteArrayList;
        CopyOnWriteArrayList<InterfaceC0030c> copyOnWriteArrayList2;
        if (!(this.G == null && ((copyOnWriteArrayList2 = this.N) == null || copyOnWriteArrayList2.isEmpty())) && this.O == -1) {
            this.O = this.x;
            throw null;
        } else if (this.G != null || ((copyOnWriteArrayList = this.N) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public void v(float f2, float f3) {
        if (!super.isAttachedToWindow()) {
            if (this.W == null) {
                this.W = new b();
            }
            b bVar = this.W;
            bVar.a = f2;
            bVar.f1812b = f3;
            return;
        }
        setProgress(f2);
        setState(d.MOVING);
        this.v = f3;
        if (f3 == 0.0f && f2 != 0.0f) {
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        }
    }

    public void w(int i2, int i3) {
        if (super.isAttachedToWindow()) {
            return;
        }
        if (this.W == null) {
            this.W = new b();
        }
        b bVar = this.W;
        bVar.f1813c = i2;
        bVar.f1814d = i3;
    }

    public void x(int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.W == null) {
                this.W = new b();
            }
            this.W.f1814d = i2;
            return;
        }
        int i3 = this.x;
        if (i3 == i2 || this.w == i2 || this.y == i2) {
            return;
        }
        this.y = i2;
        if (i3 != -1) {
            w(i3, i2);
            this.D = 0.0f;
            return;
        }
        this.F = 1.0f;
        this.C = 0.0f;
        this.D = 0.0f;
        this.E = getNanoTime();
        this.A = getNanoTime();
        throw null;
    }
}
