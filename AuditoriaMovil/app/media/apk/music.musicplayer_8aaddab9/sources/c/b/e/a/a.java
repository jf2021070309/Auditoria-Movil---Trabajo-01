package c.b.e.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import c.b.e.a.b;
import c.b.e.a.d;
import c.f.i;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends c.b.e.a.d implements c.i.e.m.a {
    public c p;
    public g q;
    public int r;
    public int s;
    public boolean t;

    /* loaded from: classes.dex */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super(null);
            this.a = animatable;
        }

        @Override // c.b.e.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // c.b.e.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d.a {
        public c.f.e<Long> K;
        public i<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new c.f.e<>();
            this.L = new i<>();
        }

        public static long h(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        @Override // c.b.e.a.d.a, c.b.e.a.b.c
        public void e() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int i(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.d(i2, 0).intValue();
        }

        @Override // c.b.e.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // c.b.e.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {
        public final c.a0.a.a.b a;

        public d(c.a0.a.a.b bVar) {
            super(null);
            this.a = bVar;
        }

        @Override // c.b.e.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // c.b.e.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {
        public final ObjectAnimator a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f876b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.f878c);
            ofInt.setInterpolator(fVar);
            this.f876b = z2;
            this.a = ofInt;
        }

        @Override // c.b.e.a.a.g
        public boolean a() {
            return this.f876b;
        }

        @Override // c.b.e.a.a.g
        public void b() {
            this.a.reverse();
        }

        @Override // c.b.e.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // c.b.e.a.a.g
        public void d() {
            this.a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {
        public int[] a;

        /* renamed from: b  reason: collision with root package name */
        public int f877b;

        /* renamed from: c  reason: collision with root package name */
        public int f878c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f877b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f878c = i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f878c) + 0.5f);
            int i3 = this.f877b;
            int[] iArr = this.a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f878c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public g(C0016a c0016a) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        c cVar2 = new c(cVar, this, resources);
        super.e(cVar2);
        this.p = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0219, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(e.a.d.a.a.u(r21, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.b.e.a.a g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.a.a.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):c.b.e.a.a");
    }

    @Override // c.b.e.a.d, c.b.e.a.b
    public b.c b() {
        return new c(this.p, this, null);
    }

    @Override // c.b.e.a.d, c.b.e.a.b
    public void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }

    @Override // c.b.e.a.d
    public d.a f() {
        return new c(this.p, this, null);
    }

    @Override // c.b.e.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            d(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // c.b.e.a.d, c.b.e.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.e();
                this.t = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    @Override // c.b.e.a.d, c.b.e.a.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.a.a.onStateChange(int[]):boolean");
    }

    @Override // c.b.e.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.q;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
