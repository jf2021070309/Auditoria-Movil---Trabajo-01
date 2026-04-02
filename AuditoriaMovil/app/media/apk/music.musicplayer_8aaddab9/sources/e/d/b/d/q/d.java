package e.d.b.d.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import c.i.k.d0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.d.b.d.r.g;
import e.d.b.d.w.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class d {
    public static final TimeInterpolator a = e.d.b.d.c.a.f6328c;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f6482b = {16842919, 16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f6483c = {16843623, 16842908, 16842910};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f6484d = {16842908, 16842910};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f6485e = {16843623, 16842910};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f6486f = {16842910};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f6487g = new int[0];
    public ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: h  reason: collision with root package name */
    public j f6488h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6489i;

    /* renamed from: k  reason: collision with root package name */
    public float f6491k;

    /* renamed from: l  reason: collision with root package name */
    public float f6492l;

    /* renamed from: m  reason: collision with root package name */
    public float f6493m;

    /* renamed from: n  reason: collision with root package name */
    public final e.d.b.d.r.g f6494n;
    public Animator o;
    public e.d.b.d.c.g p;
    public e.d.b.d.c.g q;
    public float r;
    public int t;
    public ArrayList<Animator.AnimatorListener> v;
    public ArrayList<Animator.AnimatorListener> w;
    public ArrayList<f> x;
    public final FloatingActionButton y;
    public final e.d.b.d.v.b z;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6490j = true;
    public float s = 1.0f;
    public int u = 0;
    public final Rect A = new Rect();
    public final RectF B = new RectF();
    public final RectF C = new RectF();
    public final Matrix D = new Matrix();

    /* loaded from: classes2.dex */
    public class a extends e.d.b.d.c.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            d.this.s = f2;
            matrix.getValues(this.a);
            matrix2.getValues(this.f6332b);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f6332b;
                float f3 = fArr[i2];
                float[] fArr2 = this.a;
                fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
            }
            this.f6333c.setValues(this.f6332b);
            return this.f6333c;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f6496b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f6497c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f6498d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f6499e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f6500f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f6501g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f6502h;

        public b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix) {
            this.a = f2;
            this.f6496b = f3;
            this.f6497c = f4;
            this.f6498d = f5;
            this.f6499e = f6;
            this.f6500f = f7;
            this.f6501g = f8;
            this.f6502h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.y.setAlpha(e.d.b.d.c.a.b(this.a, this.f6496b, 0.0f, 0.2f, floatValue));
            d.this.y.setScaleX(e.d.b.d.c.a.a(this.f6497c, this.f6498d, floatValue));
            d.this.y.setScaleY(e.d.b.d.c.a.a(this.f6499e, this.f6498d, floatValue));
            d.this.s = e.d.b.d.c.a.a(this.f6500f, this.f6501g, floatValue);
            d.this.a(e.d.b.d.c.a.a(this.f6500f, this.f6501g, floatValue), this.f6502h);
            d.this.y.setImageMatrix(this.f6502h);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends i {
        public c(d dVar) {
            super(null);
        }

        @Override // e.d.b.d.q.d.i
        public float a() {
            return 0.0f;
        }
    }

    /* renamed from: e.d.b.d.q.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0142d extends i {
        public C0142d() {
            super(null);
        }

        @Override // e.d.b.d.q.d.i
        public float a() {
            d dVar = d.this;
            return dVar.f6491k + dVar.f6492l;
        }
    }

    /* loaded from: classes2.dex */
    public class e extends i {
        public e() {
            super(null);
        }

        @Override // e.d.b.d.q.d.i
        public float a() {
            d dVar = d.this;
            return dVar.f6491k + dVar.f6493m;
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public interface g {
    }

    /* loaded from: classes2.dex */
    public class h extends i {
        public h() {
            super(null);
        }

        @Override // e.d.b.d.q.d.i
        public float a() {
            return d.this.f6491k;
        }
    }

    /* loaded from: classes2.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public float f6507b;

        public i(e.d.b.d.q.b bVar) {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                Objects.requireNonNull(d.this);
                this.f6507b = a();
                this.a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, e.d.b.d.v.b bVar) {
        this.y = floatingActionButton;
        this.z = bVar;
        e.d.b.d.r.g gVar = new e.d.b.d.r.g();
        this.f6494n = gVar;
        gVar.a(f6482b, d(new e()));
        gVar.a(f6483c, d(new C0142d()));
        gVar.a(f6484d, d(new C0142d()));
        gVar.a(f6485e, d(new C0142d()));
        gVar.a(f6486f, d(new h()));
        gVar.a(f6487g, d(new c(this)));
        this.r = floatingActionButton.getRotation();
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable == null || this.t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.t;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.t;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public final AnimatorSet b(e.d.b.d.c.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        gVar.d("scale").a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new e.d.b.d.q.e(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        gVar.d("scale").a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new e.d.b.d.q.e(this));
        }
        arrayList.add(ofFloat3);
        a(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new e.d.b.d.c.e(), new a(), new Matrix(this.D));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        e.d.b.d.a.V(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4) {
        TimeInterpolator pathInterpolator;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.y.getAlpha(), f2, this.y.getScaleX(), f3, this.y.getScaleY(), this.s, f4, new Matrix(this.D)));
        arrayList.add(ofFloat);
        e.d.b.d.a.V(animatorSet, arrayList);
        Context context = this.y.getContext();
        int integer = this.y.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue Z = e.d.b.d.a.Z(context, R.attr.motionDurationLong1);
        if (Z != null && Z.type == 16) {
            integer = Z.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.y.getContext();
        TimeInterpolator timeInterpolator = e.d.b.d.c.a.f6327b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (e.d.b.d.a.K(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length != 4) {
                    StringBuilder y = e.a.d.a.a.y("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    y.append(split.length);
                    throw new IllegalArgumentException(y.toString());
                }
                float E = e.d.b.d.a.E(split, 0);
                float E2 = e.d.b.d.a.E(split, 1);
                float E3 = e.d.b.d.a.E(split, 2);
                float E4 = e.d.b.d.a.E(split, 3);
                if (Build.VERSION.SDK_INT >= 21) {
                    pathInterpolator = new PathInterpolator(E, E2, E3, E4);
                } else {
                    Path path = new Path();
                    path.moveTo(0.0f, 0.0f);
                    path.cubicTo(E, E2, E3, E4, 1.0f, 1.0f);
                    pathInterpolator = new c.i.k.l0.a(path);
                }
            } else if (!e.d.b.d.a.K(valueOf, "path")) {
                throw new IllegalArgumentException(e.a.d.a.a.k("Invalid motion easing type: ", valueOf));
            } else {
                Path q = c.i.a.q(valueOf.substring(5, valueOf.length() - 1));
                pathInterpolator = Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(q) : new c.i.k.l0.a(q);
            }
            timeInterpolator = pathInterpolator;
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float e() {
        return this.f6491k;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f6489i ? (0 - this.y.getSizeDimension()) / 2 : 0;
        float e2 = this.f6490j ? e() + this.f6493m : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(e2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(e2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public boolean g() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    public boolean h() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }

    public void i() {
        e.d.b.d.r.g gVar = this.f6494n;
        ValueAnimator valueAnimator = gVar.f6528c;
        if (valueAnimator != null) {
            valueAnimator.end();
            gVar.f6528c = null;
        }
    }

    public void j() {
    }

    public void k(int[] iArr) {
        g.b bVar;
        ValueAnimator valueAnimator;
        e.d.b.d.r.g gVar = this.f6494n;
        int size = gVar.a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bVar = null;
                break;
            }
            bVar = gVar.a.get(i2);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i2++;
        }
        g.b bVar2 = gVar.f6527b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null && (valueAnimator = gVar.f6528c) != null) {
            valueAnimator.cancel();
            gVar.f6528c = null;
        }
        gVar.f6527b = bVar;
        if (bVar != null) {
            ValueAnimator valueAnimator2 = bVar.f6530b;
            gVar.f6528c = valueAnimator2;
            valueAnimator2.start();
        }
    }

    public void l(float f2, float f3, float f4) {
        u();
        throw null;
    }

    public void m() {
        ArrayList<f> arrayList = this.x;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void n() {
        ArrayList<f> arrayList = this.x;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void o(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        a(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    public void p(ColorStateList colorStateList) {
    }

    public boolean q() {
        return true;
    }

    public final boolean r() {
        FloatingActionButton floatingActionButton = this.y;
        AtomicInteger atomicInteger = d0.a;
        return d0.f.c(floatingActionButton) && !this.y.isInEditMode();
    }

    public final boolean s() {
        return !this.f6489i || this.y.getSizeDimension() >= 0;
    }

    public void t() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                if (this.y.getLayerType() != 1) {
                    this.y.setLayerType(1, null);
                }
            } else if (this.y.getLayerType() != 0) {
                this.y.setLayerType(0, null);
            }
        }
    }

    public final void u() {
        Rect rect = this.A;
        f(rect);
        c.i.a.i(null, "Didn't initialize content background");
        if (q()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.z;
            Objects.requireNonNull(bVar);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull((FloatingActionButton.b) this.z);
        }
        e.d.b.d.v.b bVar2 = this.z;
        int i2 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
