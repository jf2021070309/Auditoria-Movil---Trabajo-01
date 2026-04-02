package com.amazon.aps.iva.x2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.amazon.aps.iva.x2.q;
import com.amazon.aps.iva.x2.w;
import com.amazon.aps.iva.y2.f;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: MotionLayout.java */
/* loaded from: classes.dex */
public final class o extends ConstraintLayout implements com.amazon.aps.iva.p3.s {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public ArrayList<n> B;
    public ArrayList<n> C;
    public CopyOnWriteArrayList<g> D;
    public int E;
    public long F;
    public float G;
    public int H;
    public float I;
    public float J;
    public boolean K;
    public f L;
    public Runnable M;
    public boolean N;
    public h O;
    public boolean P;
    public View Q;
    public q b;
    public Interpolator c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public float k;
    public float l;
    public float m;
    public long n;
    public float o;
    public boolean p;
    public boolean q;
    public g r;
    public int s;
    public d t;
    public com.amazon.aps.iva.x2.b u;
    public int v;
    public int w;
    public boolean x;
    public long y;
    public float z;

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.L.a();
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.this.L.a();
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.values().length];
            a = iArr;
            try {
                iArr[h.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class d {
        public d(o oVar) {
            new Rect();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(oVar.getContext().getResources().getDisplayMetrics().density * 12.0f);
            new Paint().setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public static class e {
        public static final e b = new e();
        public VelocityTracker a;
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public class f {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public f() {
        }

        public final void a() {
            int i = this.c;
            o oVar = o.this;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    oVar.yh(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        oVar.setState(i, -1, -1);
                    } else {
                        oVar.Oa(i, i2);
                    }
                }
                oVar.setState(h.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                oVar.setProgress(this.a);
                return;
            }
            oVar.X7(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public interface g {
        void a();

        void b();

        void c();
    }

    /* compiled from: MotionLayout.java */
    /* loaded from: classes.dex */
    public enum h {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public final void G(float f2) {
        int i;
        q qVar = this.b;
        if (qVar == null) {
            return;
        }
        float f3 = this.m;
        float f4 = this.l;
        if (f3 != f4 && this.p) {
            this.m = f4;
        }
        float f5 = this.m;
        if (f5 == f2) {
            return;
        }
        this.o = f2;
        q.b bVar = qVar.c;
        if (bVar != null) {
            i = bVar.h;
        } else {
            i = qVar.j;
        }
        this.k = i / 1000.0f;
        setProgress(f2);
        this.c = this.b.d();
        this.p = false;
        getNanoTime();
        this.q = true;
        this.l = f5;
        this.m = f5;
        invalidate();
    }

    public final void G4() {
        CopyOnWriteArrayList<g> copyOnWriteArrayList;
        CopyOnWriteArrayList<g> copyOnWriteArrayList2;
        if ((this.r == null && ((copyOnWriteArrayList2 = this.D) == null || copyOnWriteArrayList2.isEmpty())) || this.H != -1) {
            if (this.r == null && ((copyOnWriteArrayList = this.D) == null || copyOnWriteArrayList.isEmpty())) {
                Runnable runnable = this.M;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            throw null;
        }
        this.H = this.f;
        throw null;
    }

    public final void H6() {
        q.b bVar;
        t tVar;
        View findViewById;
        View findViewById2;
        q qVar = this.b;
        if (qVar == null) {
            return;
        }
        if (qVar.a(this.f, this)) {
            requestLayout();
            return;
        }
        int i = this.f;
        KeyEvent.Callback callback = null;
        if (i != -1) {
            q qVar2 = this.b;
            ArrayList<q.b> arrayList = qVar2.d;
            Iterator<q.b> it = arrayList.iterator();
            while (it.hasNext()) {
                q.b next = it.next();
                if (next.m.size() > 0) {
                    Iterator<q.b.a> it2 = next.m.iterator();
                    while (it2.hasNext()) {
                        int i2 = it2.next().c;
                        if (i2 != -1 && (findViewById2 = findViewById(i2)) != null) {
                            findViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            ArrayList<q.b> arrayList2 = qVar2.f;
            Iterator<q.b> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                q.b next2 = it3.next();
                if (next2.m.size() > 0) {
                    Iterator<q.b.a> it4 = next2.m.iterator();
                    while (it4.hasNext()) {
                        int i3 = it4.next().c;
                        if (i3 != -1 && (findViewById = findViewById(i3)) != null) {
                            findViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            Iterator<q.b> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                q.b next3 = it5.next();
                if (next3.m.size() > 0) {
                    Iterator<q.b.a> it6 = next3.m.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this, i, next3);
                    }
                }
            }
            Iterator<q.b> it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                q.b next4 = it7.next();
                if (next4.m.size() > 0) {
                    Iterator<q.b.a> it8 = next4.m.iterator();
                    while (it8.hasNext()) {
                        it8.next().a(this, i, next4);
                    }
                }
            }
        }
        if (this.b.m() && (bVar = this.b.c) != null && (tVar = bVar.l) != null) {
            int i4 = tVar.d;
            if (i4 != -1) {
                o oVar = tVar.p;
                KeyEvent.Callback findViewById3 = oVar.findViewById(i4);
                if (findViewById3 == null) {
                    com.amazon.aps.iva.x2.a.b(tVar.d, oVar.getContext());
                }
                callback = findViewById3;
            }
            if (callback instanceof NestedScrollView) {
                NestedScrollView nestedScrollView = (NestedScrollView) callback;
                nestedScrollView.setOnTouchListener(new r());
                nestedScrollView.setOnScrollChangeListener(new s());
            }
        }
    }

    public final void Oa(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new f();
            }
            f fVar = this.L;
            fVar.c = i;
            fVar.d = i2;
            return;
        }
        q qVar = this.b;
        if (qVar == null) {
            return;
        }
        this.e = i;
        this.g = i2;
        qVar.l(i, i2);
        this.b.b(i);
        this.b.b(i2);
        throw null;
    }

    public final void U2() {
        CopyOnWriteArrayList<g> copyOnWriteArrayList;
        if ((this.r != null || ((copyOnWriteArrayList = this.D) != null && !copyOnWriteArrayList.isEmpty())) && this.I != this.l) {
            if (this.H != -1) {
                g gVar = this.r;
                if (gVar != null) {
                    gVar.c();
                }
                CopyOnWriteArrayList<g> copyOnWriteArrayList2 = this.D;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<g> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                }
            }
            this.H = -1;
            this.I = this.l;
            g gVar2 = this.r;
            if (gVar2 != null) {
                gVar2.b();
            }
            CopyOnWriteArrayList<g> copyOnWriteArrayList3 = this.D;
            if (copyOnWriteArrayList3 != null) {
                Iterator<g> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().b();
                }
            }
        }
    }

    public final void X7(float f2, float f3) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new f();
            }
            f fVar = this.L;
            fVar.a = f2;
            fVar.b = f3;
            return;
        }
        setProgress(f2);
        setState(h.MOVING);
        this.d = f3;
        float f4 = 0.0f;
        int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i != 0) {
            if (i > 0) {
                f4 = 1.0f;
            }
            G(f4);
        } else if (f2 != 0.0f && f2 != 1.0f) {
            if (f2 > 0.5f) {
                f4 = 1.0f;
            }
            G(f4);
        }
    }

    public final void b1(boolean z) {
        boolean z2;
        int i;
        if (this.n == -1) {
            this.n = getNanoTime();
        }
        float f2 = this.m;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f = -1;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (this.A || (this.q && (z || this.o != f2))) {
            float signum = Math.signum(this.o - f2);
            long nanoTime = getNanoTime();
            float f3 = ((((float) (nanoTime - this.n)) * signum) * 1.0E-9f) / this.k;
            float f4 = this.m + f3;
            if (this.p) {
                f4 = this.o;
            }
            int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i2 > 0 && f4 >= this.o) || (signum <= 0.0f && f4 <= this.o)) {
                f4 = this.o;
                this.q = false;
            }
            this.m = f4;
            this.l = f4;
            this.n = nanoTime;
            this.d = f3;
            if (Math.abs(f3) > 1.0E-5f) {
                setState(h.MOVING);
            }
            if ((i2 > 0 && f4 >= this.o) || (signum <= 0.0f && f4 <= this.o)) {
                f4 = this.o;
                this.q = false;
            }
            if (f4 >= 1.0f || f4 <= 0.0f) {
                this.q = false;
                setState(h.FINISHED);
            }
            int childCount = getChildCount();
            this.A = false;
            getNanoTime();
            this.J = f4;
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                interpolator.getInterpolation(f4);
            }
            Interpolator interpolator2 = this.c;
            if (interpolator2 != null) {
                float interpolation = interpolator2.getInterpolation((signum / this.k) + f4);
                this.d = interpolation;
                this.d = interpolation - this.c.getInterpolation(f4);
            }
            if (childCount <= 0) {
                if ((i2 > 0 && f4 >= this.o) || (signum <= 0.0f && f4 <= this.o)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!this.A && !this.q && z2) {
                    setState(h.FINISHED);
                }
                this.A = (!z2) | this.A;
                if (f4 <= 0.0f && (i = this.e) != -1 && this.f != i) {
                    this.f = i;
                    this.b.b(i).a(this);
                    setState(h.FINISHED);
                    z4 = true;
                }
                if (f4 >= 1.0d) {
                    int i3 = this.f;
                    int i4 = this.g;
                    if (i3 != i4) {
                        this.f = i4;
                        this.b.b(i4).a(this);
                        setState(h.FINISHED);
                        z4 = true;
                    }
                }
                if (!this.A && !this.q) {
                    if ((i2 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                        setState(h.FINISHED);
                    }
                } else {
                    invalidate();
                }
                if (!this.A && !this.q && ((i2 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f))) {
                    H6();
                }
            } else {
                getChildAt(0);
                throw null;
            }
        }
        float f5 = this.m;
        if (f5 >= 1.0f) {
            int i5 = this.f;
            int i6 = this.g;
            if (i5 == i6) {
                z3 = z4;
            }
            this.f = i6;
        } else {
            if (f5 <= 0.0f) {
                int i7 = this.f;
                int i8 = this.e;
                if (i7 == i8) {
                    z3 = z4;
                }
                this.f = i8;
            }
            this.P |= z4;
            if (z4 && !this.K) {
                requestLayout();
            }
            this.l = this.m;
        }
        z4 = z3;
        this.P |= z4;
        if (z4) {
            requestLayout();
        }
        this.l = this.m;
    }

    public final void ci(int i, View... viewArr) {
        androidx.constraintlayout.widget.c b2;
        q qVar = this.b;
        if (qVar != null) {
            x xVar = qVar.q;
            xVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<w> it = xVar.b.iterator();
            while (it.hasNext()) {
                w next = it.next();
                if (next.a == i) {
                    for (View view : viewArr) {
                        if (next.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        o oVar = xVar.a;
                        int currentState = oVar.getCurrentState();
                        if (next.e != 2) {
                            if (currentState == -1) {
                                oVar.toString();
                            } else {
                                q qVar2 = oVar.b;
                                if (qVar2 == null) {
                                    b2 = null;
                                } else {
                                    b2 = qVar2.b(currentState);
                                }
                                androidx.constraintlayout.widget.c cVar = b2;
                                if (cVar != null) {
                                    next.a(xVar, xVar.a, currentState, cVar, viewArr2);
                                }
                            }
                        } else {
                            next.a(xVar, xVar.a, currentState, null, viewArr2);
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String d2;
        long j;
        x xVar;
        ArrayList<w.a> arrayList;
        b1(false);
        q qVar = this.b;
        if (qVar != null && (xVar = qVar.q) != null && (arrayList = xVar.d) != null) {
            Iterator<w.a> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            ArrayList<w.a> arrayList2 = xVar.d;
            ArrayList<w.a> arrayList3 = xVar.e;
            arrayList2.removeAll(arrayList3);
            arrayList3.clear();
            if (xVar.d.isEmpty()) {
                xVar.d = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.b == null) {
            return;
        }
        if ((this.s & 1) == 1 && !isInEditMode()) {
            this.E++;
            long nanoTime = getNanoTime();
            long j2 = this.F;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.G = ((int) ((this.E / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.E = 0;
                    this.F = nanoTime;
                }
            } else {
                this.F = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder b2 = defpackage.c.b(this.G + " fps " + com.amazon.aps.iva.x2.a.d(this.e, this) + " -> ");
            b2.append(com.amazon.aps.iva.x2.a.d(this.g, this));
            b2.append(" (progress: ");
            b2.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
            b2.append(" ) state=");
            int i = this.f;
            if (i == -1) {
                d2 = AdError.UNDEFINED_DOMAIN;
            } else {
                d2 = com.amazon.aps.iva.x2.a.d(i, this);
            }
            b2.append(d2);
            String sb = b2.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb, 10.0f, getHeight() - 30, paint);
        }
        if (this.s > 1) {
            if (this.t == null) {
                this.t = new d(this);
            }
            d dVar = this.t;
            q.b bVar = this.b.c;
            dVar.getClass();
        }
    }

    public int[] getConstraintSetIds() {
        q qVar = this.b;
        if (qVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.c> sparseArray = qVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f;
    }

    public ArrayList<q.b> getDefinedTransitions() {
        q qVar = this.b;
        if (qVar == null) {
            return null;
        }
        return qVar.d;
    }

    public com.amazon.aps.iva.x2.b getDesignTool() {
        if (this.u == null) {
            this.u = new com.amazon.aps.iva.x2.b();
        }
        return this.u;
    }

    public int getEndState() {
        return this.g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.m;
    }

    public q getScene() {
        return this.b;
    }

    public int getStartState() {
        return this.e;
    }

    public float getTargetPosition() {
        return this.o;
    }

    public Bundle getTransitionState() {
        if (this.L == null) {
            this.L = new f();
        }
        f fVar = this.L;
        o oVar = o.this;
        fVar.d = oVar.g;
        fVar.c = oVar.e;
        fVar.b = oVar.getVelocity();
        fVar.a = oVar.getProgress();
        f fVar2 = this.L;
        fVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", fVar2.a);
        bundle.putFloat("motion.velocity", fVar2.b);
        bundle.putInt("motion.StartState", fVar2.c);
        bundle.putInt("motion.EndState", fVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        int i;
        q qVar = this.b;
        if (qVar != null) {
            q.b bVar = qVar.c;
            if (bVar != null) {
                i = bVar.h;
            } else {
                i = qVar.j;
            }
            this.k = i / 1000.0f;
        }
        return this.k * 1000.0f;
    }

    public float getVelocity() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        q.b bVar;
        int i2;
        int i3;
        if (i != 0) {
            try {
                q qVar = new q(getContext(), this, i);
                this.b = qVar;
                int i4 = -1;
                if (this.f == -1) {
                    q.b bVar2 = qVar.c;
                    if (bVar2 == null) {
                        i2 = -1;
                    } else {
                        i2 = bVar2.d;
                    }
                    this.f = i2;
                    if (bVar2 == null) {
                        i3 = -1;
                    } else {
                        i3 = bVar2.d;
                    }
                    this.e = i3;
                    if (bVar2 != null) {
                        i4 = bVar2.c;
                    }
                    this.g = i4;
                }
                if (super.isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display != null) {
                            display.getRotation();
                        }
                        q qVar2 = this.b;
                        if (qVar2 != null) {
                            androidx.constraintlayout.widget.c b2 = qVar2.b(this.f);
                            this.b.k(this);
                            if (b2 != null) {
                                b2.b(this);
                            }
                            this.e = this.f;
                        }
                        H6();
                        f fVar = this.L;
                        if (fVar != null) {
                            if (this.N) {
                                post(new a());
                                return;
                            } else {
                                fVar.a();
                                return;
                            }
                        }
                        q qVar3 = this.b;
                        if (qVar3 != null && (bVar = qVar3.c) != null && bVar.n == 4) {
                            mh();
                            setState(h.SETUP);
                            setState(h.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e2);
                    }
                }
                this.b = null;
                return;
            } catch (Exception e3) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e3);
            }
        }
        this.b = null;
    }

    public final void mh() {
        G(1.0f);
        this.M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        if ((((r9 * r1) - (((r0 * r1) * r1) / 2.0f)) + r7) > 1.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
        if ((((((r0 * r4) * r4) / 2.0f) + (r9 * r4)) + r7) < 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r8 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        r6.b.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        r6.b.e();
        r6.b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nf(int r7, float r8, float r9) {
        /*
            r6 = this;
            com.amazon.aps.iva.x2.q r0 = r6.b
            if (r0 != 0) goto L5
            return
        L5:
            float r0 = r6.m
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto Lc
            return
        Lc:
            r6.getNanoTime()
            com.amazon.aps.iva.x2.q r0 = r6.b
            com.amazon.aps.iva.x2.q$b r1 = r0.c
            if (r1 == 0) goto L18
            int r2 = r1.h
            goto L1a
        L18:
            int r2 = r0.j
        L1a:
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            r6.k = r2
            r6.o = r8
            r8 = 1
            r6.q = r8
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L84
            if (r7 == r8) goto L84
            r4 = 2
            if (r7 == r4) goto L84
            r4 = 4
            if (r7 == r4) goto L80
            r4 = 5
            if (r7 == r4) goto L43
            r8 = 6
            if (r7 == r8) goto L84
            r8 = 7
            if (r7 == r8) goto L84
            r6.p = r2
            r6.getNanoTime()
            r6.invalidate()
            return
        L43:
            float r7 = r6.m
            float r0 = r0.e()
            r1 = 0
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 <= 0) goto L5f
            float r1 = r9 / r0
            float r9 = r9 * r1
            float r0 = r0 * r1
            float r0 = r0 * r1
            float r0 = r0 / r5
            float r9 = r9 - r0
            float r9 = r9 + r7
            r7 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 <= 0) goto L6c
            goto L6d
        L5f:
            float r4 = -r9
            float r4 = r4 / r0
            float r9 = r9 * r4
            float r0 = r0 * r4
            float r0 = r0 * r4
            float r0 = r0 / r5
            float r0 = r0 + r9
            float r0 = r0 + r7
            int r7 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r7 >= 0) goto L6c
            goto L6d
        L6c:
            r8 = r2
        L6d:
            if (r8 == 0) goto L75
            com.amazon.aps.iva.x2.q r7 = r6.b
            r7.e()
            throw r3
        L75:
            com.amazon.aps.iva.x2.q r7 = r6.b
            r7.e()
            com.amazon.aps.iva.x2.q r7 = r6.b
            r7.getClass()
            throw r3
        L80:
            r0.e()
            throw r3
        L84:
            if (r1 == 0) goto L8c
            com.amazon.aps.iva.x2.t r7 = r1.l
            if (r7 == 0) goto L8c
            int r2 = r7.B
        L8c:
            if (r2 == 0) goto L8f
            throw r3
        L8f:
            r0.e()
            com.amazon.aps.iva.x2.q r7 = r6.b
            r7.getClass()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x2.o.nf(int, float, float):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q.b bVar;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        q qVar = this.b;
        if (qVar != null && (i = this.f) != -1) {
            androidx.constraintlayout.widget.c b2 = qVar.b(i);
            this.b.k(this);
            if (b2 != null) {
                b2.b(this);
            }
            this.e = this.f;
        }
        H6();
        f fVar = this.L;
        if (fVar != null) {
            if (this.N) {
                post(new b());
                return;
            } else {
                fVar.a();
                return;
            }
        }
        q qVar2 = this.b;
        if (qVar2 != null && (bVar = qVar2.c) != null && bVar.n == 4) {
            mh();
            setState(h.SETUP);
            setState(h.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t tVar;
        int i;
        RectF b2;
        o oVar;
        int currentState;
        androidx.constraintlayout.widget.c b3;
        boolean z;
        int i2;
        int i3;
        q qVar = this.b;
        if (qVar != null && this.j) {
            x xVar = qVar.q;
            if (xVar != null && (currentState = (oVar = xVar.a).getCurrentState()) != -1) {
                HashSet<View> hashSet = xVar.c;
                ArrayList<w> arrayList = xVar.b;
                if (hashSet == null) {
                    xVar.c = new HashSet<>();
                    Iterator<w> it = arrayList.iterator();
                    while (it.hasNext()) {
                        w next = it.next();
                        int childCount = oVar.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = oVar.getChildAt(i4);
                            if (next.c(childAt)) {
                                childAt.getId();
                                xVar.c.add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<w.a> arrayList2 = xVar.d;
                int i5 = 2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<w.a> it2 = xVar.d.iterator();
                    while (it2.hasNext()) {
                        w.a next2 = it2.next();
                        if (action != 1) {
                            if (action != 2) {
                                next2.getClass();
                            } else {
                                View view = next2.c.a;
                                Rect rect2 = next2.l;
                                view.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !next2.h) {
                                    next2.b();
                                }
                            }
                        } else if (!next2.h) {
                            next2.b();
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    q qVar2 = oVar.b;
                    if (qVar2 == null) {
                        b3 = null;
                    } else {
                        b3 = qVar2.b(currentState);
                    }
                    Iterator<w> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        w next3 = it3.next();
                        int i6 = next3.b;
                        if (i6 != 1 ? !(i6 != i5 ? i6 != 3 || action != 0 : action != 1) : action == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            Iterator<View> it4 = xVar.c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        i2 = i5;
                                        i3 = action;
                                        next3.a(xVar, xVar.a, currentState, b3, next4);
                                    } else {
                                        i2 = i5;
                                        i3 = action;
                                    }
                                    i5 = i2;
                                    action = i3;
                                }
                            }
                        }
                    }
                }
            }
            q.b bVar = this.b.c;
            if (bVar != null && (!bVar.o) && (tVar = bVar.l) != null) {
                if ((motionEvent.getAction() != 0 || (b2 = tVar.b(this, new RectF())) == null || b2.contains(motionEvent.getX(), motionEvent.getY())) && (i = tVar.e) != -1) {
                    View view2 = this.Q;
                    if (view2 == null || view2.getId() != i) {
                        this.Q = findViewById(i);
                    }
                    View view3 = this.Q;
                    if (view3 != null) {
                        view3.getLeft();
                        this.Q.getTop();
                        this.Q.getRight();
                        this.Q.getBottom();
                        throw null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.K = true;
        try {
            if (this.b == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.v == i5 && this.w == i6) {
                this.v = i5;
                this.w = i6;
                return;
            }
            throw null;
        } finally {
            this.K = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        CopyOnWriteArrayList<g> copyOnWriteArrayList;
        if (this.b == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        if (this.h == i && this.i == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.P) {
            this.P = false;
            H6();
            if (this.r == null && ((copyOnWriteArrayList = this.D) == null || copyOnWriteArrayList.isEmpty())) {
                z = true;
            } else {
                throw null;
            }
        }
        if (!this.mDirtyHierarchy) {
            z2 = z;
        }
        this.h = i;
        this.i = i2;
        q.b bVar = this.b.c;
        if (bVar == null) {
            i3 = -1;
        } else {
            i3 = bVar.d;
        }
        if (bVar == null) {
            i4 = -1;
        } else {
            i4 = bVar.c;
        }
        if (z2) {
            if (this.e == -1) {
                if (z2) {
                    super.onMeasure(i, i2);
                }
                getPaddingTop();
                getPaddingBottom();
                getPaddingLeft();
                getPaddingRight();
                this.mLayoutWidget.getClass();
                this.mLayoutWidget.getClass();
                float f2 = 0;
                requestLayout();
                requestLayout();
                setMeasuredDimension((int) ((this.J * f2) + f2), (int) ((this.J * f2) + f2));
                float signum = Math.signum(this.o - this.m);
                float nanoTime = this.m + (((((float) (getNanoTime() - this.n)) * signum) * 1.0E-9f) / this.k);
                if (this.p) {
                    nanoTime = this.o;
                }
                int i5 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
                if ((i5 > 0 && nanoTime >= this.o) || (signum <= 0.0f && nanoTime <= this.o)) {
                    nanoTime = this.o;
                }
                if ((i5 > 0 && nanoTime >= this.o) || (signum <= 0.0f && nanoTime <= this.o)) {
                    nanoTime = this.o;
                }
                this.J = nanoTime;
                int childCount = getChildCount();
                getNanoTime();
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    interpolator.getInterpolation(nanoTime);
                }
                if (childCount <= 0) {
                    return;
                }
                getChildAt(0);
                throw null;
            }
            super.onMeasure(i, i2);
            this.b.b(i3);
            this.b.b(i4);
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        q.b bVar;
        boolean z;
        boolean z2;
        t tVar;
        q.b bVar2;
        t tVar2;
        t tVar3;
        t tVar4;
        int i4;
        q qVar = this.b;
        if (qVar != null && (bVar = qVar.c) != null && (!bVar.o)) {
            int i5 = -1;
            if (z && (tVar4 = bVar.l) != null && (i4 = tVar4.e) != -1 && view.getId() != i4) {
                return;
            }
            q.b bVar3 = qVar.c;
            if (bVar3 != null && (tVar3 = bVar3.l) != null) {
                z2 = tVar3.s;
            } else {
                z2 = false;
            }
            if (z2) {
                t tVar5 = bVar.l;
                if (tVar5 != null && (tVar5.u & 4) != 0) {
                    i5 = i2;
                }
                float f2 = this.l;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            t tVar6 = bVar.l;
            if (tVar6 != null && (tVar6.u & 1) != 0 && (bVar2 = qVar.c) != null && (tVar2 = bVar2.l) != null) {
                o oVar = tVar2.p;
                oVar.getProgress();
                oVar.getViewById(tVar2.d);
                throw null;
            }
            float f3 = this.l;
            long nanoTime = getNanoTime();
            this.z = (float) ((nanoTime - this.y) * 1.0E-9d);
            this.y = nanoTime;
            q.b bVar4 = qVar.c;
            if (bVar4 != null && (tVar = bVar4.l) != null) {
                o oVar2 = tVar.p;
                float progress = oVar2.getProgress();
                if (!tVar.k) {
                    tVar.k = true;
                    oVar2.setProgress(progress);
                }
                oVar2.getViewById(tVar.d);
                throw null;
            }
            if (f3 != this.l) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            b1(false);
            if (iArr[0] != 0 || iArr[1] != 0) {
                this.x = true;
            }
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.y = getNanoTime();
        this.z = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        t tVar;
        q qVar = this.b;
        if (qVar != null) {
            boolean isRtl = isRtl();
            qVar.p = isRtl;
            q.b bVar = qVar.c;
            if (bVar != null && (tVar = bVar.l) != null) {
                tVar.c(isRtl);
            }
        }
    }

    @Override // com.amazon.aps.iva.p3.r
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        q.b bVar;
        t tVar;
        q qVar = this.b;
        if (qVar != null && (bVar = qVar.c) != null && (tVar = bVar.l) != null && (tVar.u & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.p3.r
    public final void onStopNestedScroll(View view, int i) {
        q.b bVar;
        t tVar;
        q qVar = this.b;
        if (qVar != null && this.z != 0.0f && (bVar = qVar.c) != null && (tVar = bVar.l) != null) {
            tVar.k = false;
            o oVar = tVar.p;
            oVar.getProgress();
            oVar.getViewById(tVar.d);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
        if (r9.contains(r14.getX(), r14.getY()) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x070c A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x2.o.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof n) {
            n nVar = (n) view;
            if (this.D == null) {
                this.D = new CopyOnWriteArrayList<>();
            }
            this.D.add(nVar);
            if (nVar.j) {
                if (this.B == null) {
                    this.B = new ArrayList<>();
                }
                this.B.add(nVar);
            }
            if (nVar.k) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                this.C.add(nVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<n> arrayList = this.B;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<n> arrayList2 = this.C;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        q qVar;
        q.b bVar;
        if (this.f == -1 && (qVar = this.b) != null && (bVar = qVar.c) != null) {
            int i = bVar.p;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                if (getChildCount() <= 0) {
                    return;
                }
                getChildAt(0);
                throw null;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.s = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.N = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.j = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.b != null) {
            setState(h.MOVING);
            Interpolator d2 = this.b.d();
            if (d2 != null) {
                setProgress(d2.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<n> arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.C.get(i).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<n> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.B.get(i).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new f();
            }
            this.L.a = f2;
            return;
        }
        if (i <= 0) {
            if (this.m == 1.0f && this.f == this.g) {
                setState(h.MOVING);
            }
            this.f = this.e;
            if (this.m == 0.0f) {
                setState(h.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.m == 0.0f && this.f == this.e) {
                setState(h.MOVING);
            }
            this.f = this.g;
            if (this.m == 1.0f) {
                setState(h.FINISHED);
            }
        } else {
            this.f = -1;
            setState(h.MOVING);
        }
        if (this.b == null) {
            return;
        }
        this.p = true;
        this.o = f2;
        this.l = f2;
        this.n = -1L;
        this.q = true;
        invalidate();
    }

    public void setScene(q qVar) {
        t tVar;
        this.b = qVar;
        boolean isRtl = isRtl();
        qVar.p = isRtl;
        q.b bVar = qVar.c;
        if (bVar != null && (tVar = bVar.l) != null) {
            tVar.c(isRtl);
        }
        throw null;
    }

    public void setStartState(int i) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new f();
            }
            f fVar = this.L;
            fVar.c = i;
            fVar.d = i;
            return;
        }
        this.f = i;
    }

    public void setState(h hVar) {
        h hVar2 = h.FINISHED;
        if (hVar == hVar2 && this.f == -1) {
            return;
        }
        h hVar3 = this.O;
        this.O = hVar;
        h hVar4 = h.MOVING;
        if (hVar3 == hVar4 && hVar == hVar4) {
            U2();
        }
        int i = c.a[hVar3.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && hVar == hVar2) {
                G4();
                return;
            }
            return;
        }
        if (hVar == hVar4) {
            U2();
        }
        if (hVar == hVar2) {
            G4();
        }
    }

    public void setTransition(int i) {
        q.b bVar;
        q qVar = this.b;
        if (qVar != null) {
            Iterator<q.b> it = qVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.a == i) {
                    break;
                }
            }
            this.e = bVar.d;
            this.g = bVar.c;
            if (!super.isAttachedToWindow()) {
                if (this.L == null) {
                    this.L = new f();
                }
                f fVar = this.L;
                fVar.c = this.e;
                fVar.d = this.g;
                return;
            }
            q qVar2 = this.b;
            qVar2.c = bVar;
            t tVar = bVar.l;
            if (tVar != null) {
                tVar.c(qVar2.p);
            }
            this.b.b(this.e);
            this.b.b(this.g);
            throw null;
        }
    }

    public void setTransitionDuration(int i) {
        q qVar = this.b;
        if (qVar == null) {
            return;
        }
        q.b bVar = qVar.c;
        if (bVar != null) {
            bVar.h = Math.max(i, 8);
        } else {
            qVar.j = i;
        }
    }

    public void setTransitionListener(g gVar) {
        this.r = gVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.L == null) {
            this.L = new f();
        }
        f fVar = this.L;
        fVar.getClass();
        fVar.a = bundle.getFloat("motion.progress");
        fVar.b = bundle.getFloat("motion.velocity");
        fVar.c = bundle.getInt("motion.StartState");
        fVar.d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.L.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return com.amazon.aps.iva.x2.a.b(this.e, context) + "->" + com.amazon.aps.iva.x2.a.b(this.g, context) + " (pos:" + this.m + " Dpos/Dt:" + this.d;
    }

    public final void yh(int i) {
        int i2;
        com.amazon.aps.iva.y2.f fVar;
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new f();
            }
            this.L.d = i;
            return;
        }
        q qVar = this.b;
        if (qVar != null && (fVar = qVar.b) != null) {
            int i3 = this.f;
            float f2 = -1;
            f.a aVar = fVar.b.get(i);
            if (aVar == null) {
                i3 = i;
            } else {
                int i4 = (f2 > (-1.0f) ? 1 : (f2 == (-1.0f) ? 0 : -1));
                ArrayList<f.b> arrayList = aVar.b;
                int i5 = aVar.c;
                if (i4 != 0 && i4 != 0) {
                    Iterator<f.b> it = arrayList.iterator();
                    f.b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            f.b next = it.next();
                            if (next.a(f2, f2)) {
                                if (i3 == next.e) {
                                    break;
                                }
                                bVar = next;
                            }
                        } else if (bVar != null) {
                            i3 = bVar.e;
                        }
                    }
                } else if (i5 != i3) {
                    Iterator<f.b> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i3 == it2.next().e) {
                            break;
                        }
                    }
                    i3 = i5;
                }
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i6 = this.f;
        if (i6 != i) {
            if (this.e == i) {
                G(0.0f);
            } else if (this.g == i) {
                G(1.0f);
            } else {
                this.g = i;
                if (i6 != -1) {
                    Oa(i6, i);
                    G(1.0f);
                    this.m = 0.0f;
                    mh();
                    return;
                }
                this.o = 1.0f;
                this.l = 0.0f;
                this.m = 0.0f;
                this.n = getNanoTime();
                getNanoTime();
                this.p = false;
                q qVar2 = this.b;
                q.b bVar2 = qVar2.c;
                if (bVar2 != null) {
                    i2 = bVar2.h;
                } else {
                    i2 = qVar2.j;
                }
                this.k = i2 / 1000.0f;
                this.e = -1;
                qVar2.l(-1, this.g);
                new SparseArray();
                getChildCount();
                throw null;
            }
        }
    }

    @Override // com.amazon.aps.iva.p3.s
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.x || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.x = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) {
        setState(h.SETUP);
        this.f = i;
        this.e = -1;
        this.g = -1;
        com.amazon.aps.iva.y2.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.b(i, i2, i3);
            return;
        }
        q qVar = this.b;
        if (qVar != null) {
            qVar.b(i).b(this);
        }
    }

    public void setTransition(q.b bVar) {
        t tVar;
        q qVar = this.b;
        qVar.c = bVar;
        if (bVar != null && (tVar = bVar.l) != null) {
            tVar.c(qVar.p);
        }
        setState(h.SETUP);
        int i = this.f;
        q.b bVar2 = this.b.c;
        if (i == (bVar2 == null ? -1 : bVar2.c)) {
            this.m = 1.0f;
            this.l = 1.0f;
            this.o = 1.0f;
        } else {
            this.m = 0.0f;
            this.l = 0.0f;
            this.o = 0.0f;
        }
        this.n = (bVar.q & 1) != 0 ? -1L : getNanoTime();
        q qVar2 = this.b;
        q.b bVar3 = qVar2.c;
        int i2 = bVar3 == null ? -1 : bVar3.d;
        int i3 = bVar3 != null ? bVar3.c : -1;
        if (i2 == this.e && i3 == this.g) {
            return;
        }
        this.e = i2;
        this.g = i3;
        qVar2.l(i2, i3);
        this.b.b(this.e);
        this.b.b(this.g);
        throw null;
    }
}
