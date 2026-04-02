package com.amazon.aps.iva.b9;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.amazon.aps.iva.f3.j;
import com.amazon.aps.iva.g3.h;
import com.amazon.aps.iva.h3.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.b9.e {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public g c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {
        public int a;
        public C0136f b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public g(g gVar) {
            this.c = null;
            this.d = f.k;
            if (gVar != null) {
                this.a = gVar.a;
                C0136f c0136f = new C0136f(gVar.b);
                this.b = c0136f;
                if (gVar.b.e != null) {
                    c0136f.e = new Paint(gVar.b.e);
                }
                if (gVar.b.d != null) {
                    this.b.d = new Paint(gVar.b.d);
                }
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public g() {
            this.c = null;
            this.d = f.k;
            this.b = new C0136f();
        }
    }

    public f() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = new g();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r10 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b9.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return a.C0318a.a(drawable);
        }
        return this.c.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b != null) {
            return new h(this.b.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.c.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.c.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return a.C0318a.d(drawable);
        }
        return this.c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.c;
            if (gVar != null) {
                C0136f c0136f = gVar.b;
                if (c0136f.n == null) {
                    c0136f.n = Boolean.valueOf(c0136f.g.a());
                }
                if (c0136f.n.booleanValue() || ((colorStateList = this.c.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new g(this.c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.c;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList != null && (mode = gVar.d) != null) {
            this.d = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        C0136f c0136f = gVar.b;
        if (c0136f.n == null) {
            c0136f.n = Boolean.valueOf(c0136f.g.a());
        }
        if (c0136f.n.booleanValue()) {
            boolean b2 = gVar.b.g.b(iArr);
            gVar.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.c.b.getRootAlpha() != i) {
            this.c.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            a.C0318a.e(drawable, z);
        } else {
            this.c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            com.amazon.aps.iva.h3.a.a(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.c;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.d = a(colorStateList, gVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.c;
        if (gVar.d != mode) {
            gVar.d = mode;
            this.d = a(gVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public h(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.b = (VectorDrawable) this.a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.b = (VectorDrawable) this.a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return fVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e extends d {
        public h.a[] a;
        public String b;
        public int c;
        public final int d;

        public e() {
            this.a = null;
            this.c = 0;
        }

        public h.a[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(h.a[] aVarArr) {
            if (!com.amazon.aps.iva.g3.h.a(this.a, aVarArr)) {
                this.a = com.amazon.aps.iva.g3.h.e(aVarArr);
                return;
            }
            h.a[] aVarArr2 = this.a;
            for (int i = 0; i < aVarArr.length; i++) {
                aVarArr2[i].a = aVarArr[i].a;
                int i2 = 0;
                while (true) {
                    float[] fArr = aVarArr[i].b;
                    if (i2 < fArr.length) {
                        aVarArr2[i].b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.a = null;
            this.c = 0;
            this.b = eVar.b;
            this.d = eVar.d;
            this.a = com.amazon.aps.iva.g3.h.e(eVar.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0136f c0136f;
        int i;
        int i2;
        int i3;
        boolean z;
        char c2;
        char c3;
        Resources resources2 = resources;
        Drawable drawable = this.b;
        if (drawable != null) {
            a.b.d(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.c;
        gVar.b = new C0136f();
        TypedArray i4 = j.i(resources2, theme, attributeSet, com.amazon.aps.iva.b9.a.a);
        g gVar2 = this.c;
        C0136f c0136f2 = gVar2.b;
        int e2 = j.e(i4, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (e2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (e2 != 5) {
            if (e2 != 9) {
                switch (e2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.d = mode;
        ColorStateList b2 = j.b(i4, xmlPullParser, theme);
        if (b2 != null) {
            gVar2.c = b2;
        }
        boolean z2 = gVar2.e;
        if (j.h(xmlPullParser, "autoMirrored")) {
            z2 = i4.getBoolean(5, z2);
        }
        gVar2.e = z2;
        c0136f2.j = j.d(i4, xmlPullParser, "viewportWidth", 7, c0136f2.j);
        float d2 = j.d(i4, xmlPullParser, "viewportHeight", 8, c0136f2.k);
        c0136f2.k = d2;
        if (c0136f2.j <= 0.0f) {
            throw new XmlPullParserException(i4.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (d2 > 0.0f) {
            c0136f2.h = i4.getDimension(3, c0136f2.h);
            int i6 = 2;
            float dimension = i4.getDimension(2, c0136f2.i);
            c0136f2.i = dimension;
            if (c0136f2.h <= 0.0f) {
                throw new XmlPullParserException(i4.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                c0136f2.setAlpha(j.d(i4, xmlPullParser, "alpha", 4, c0136f2.getAlpha()));
                boolean z3 = false;
                String string = i4.getString(0);
                if (string != null) {
                    c0136f2.m = string;
                    c0136f2.o.put(string, c0136f2);
                }
                i4.recycle();
                gVar.a = getChangingConfigurations();
                int i7 = 1;
                gVar.k = true;
                g gVar3 = this.c;
                C0136f c0136f3 = gVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0136f3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == i6) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        com.amazon.aps.iva.x.a<String, Object> aVar = c0136f3.o;
                        c0136f = c0136f3;
                        if (equals) {
                            b bVar = new b();
                            TypedArray i8 = j.i(resources2, theme, attributeSet, com.amazon.aps.iva.b9.a.c);
                            if (j.h(xmlPullParser, "pathData")) {
                                String string2 = i8.getString(0);
                                if (string2 != null) {
                                    bVar.b = string2;
                                }
                                String string3 = i8.getString(2);
                                if (string3 != null) {
                                    bVar.a = com.amazon.aps.iva.g3.h.c(string3);
                                }
                                bVar.g = j.c(i8, xmlPullParser, theme, "fillColor", 1);
                                i = depth;
                                bVar.i = j.d(i8, xmlPullParser, "fillAlpha", 12, bVar.i);
                                int e3 = j.e(i8, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = bVar.m;
                                if (e3 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (e3 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (e3 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                bVar.m = cap;
                                int e4 = j.e(i8, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = bVar.n;
                                if (e4 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (e4 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (e4 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bVar.n = join;
                                bVar.o = j.d(i8, xmlPullParser, "strokeMiterLimit", 10, bVar.o);
                                bVar.e = j.c(i8, xmlPullParser, theme, "strokeColor", 3);
                                bVar.h = j.d(i8, xmlPullParser, "strokeAlpha", 11, bVar.h);
                                bVar.f = j.d(i8, xmlPullParser, "strokeWidth", 4, bVar.f);
                                bVar.k = j.d(i8, xmlPullParser, "trimPathEnd", 6, bVar.k);
                                bVar.l = j.d(i8, xmlPullParser, "trimPathOffset", 7, bVar.l);
                                bVar.j = j.d(i8, xmlPullParser, "trimPathStart", 5, bVar.j);
                                bVar.c = j.e(i8, xmlPullParser, "fillType", 13, bVar.c);
                            } else {
                                i = depth;
                            }
                            i8.recycle();
                            cVar.b.add(bVar);
                            if (bVar.getPathName() != null) {
                                aVar.put(bVar.getPathName(), bVar);
                            }
                            gVar3.a = bVar.d | gVar3.a;
                            z = false;
                            c3 = 4;
                            c2 = 5;
                            z4 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                a aVar2 = new a();
                                if (j.h(xmlPullParser, "pathData")) {
                                    TypedArray i9 = j.i(resources2, theme, attributeSet, com.amazon.aps.iva.b9.a.d);
                                    String string4 = i9.getString(0);
                                    if (string4 != null) {
                                        aVar2.b = string4;
                                    }
                                    String string5 = i9.getString(1);
                                    if (string5 != null) {
                                        aVar2.a = com.amazon.aps.iva.g3.h.c(string5);
                                    }
                                    aVar2.c = j.e(i9, xmlPullParser, "fillType", 2, 0);
                                    i9.recycle();
                                }
                                cVar.b.add(aVar2);
                                if (aVar2.getPathName() != null) {
                                    aVar.put(aVar2.getPathName(), aVar2);
                                }
                                gVar3.a |= aVar2.d;
                            } else if ("group".equals(name)) {
                                c cVar2 = new c();
                                TypedArray i10 = j.i(resources2, theme, attributeSet, com.amazon.aps.iva.b9.a.b);
                                c2 = 5;
                                cVar2.c = j.d(i10, xmlPullParser, "rotation", 5, cVar2.c);
                                cVar2.d = i10.getFloat(1, cVar2.d);
                                cVar2.e = i10.getFloat(2, cVar2.e);
                                cVar2.f = j.d(i10, xmlPullParser, "scaleX", 3, cVar2.f);
                                c3 = 4;
                                cVar2.g = j.d(i10, xmlPullParser, "scaleY", 4, cVar2.g);
                                cVar2.h = j.d(i10, xmlPullParser, "translateX", 6, cVar2.h);
                                cVar2.i = j.d(i10, xmlPullParser, "translateY", 7, cVar2.i);
                                z = false;
                                String string6 = i10.getString(0);
                                if (string6 != null) {
                                    cVar2.l = string6;
                                }
                                cVar2.c();
                                i10.recycle();
                                cVar.b.add(cVar2);
                                arrayDeque.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    aVar.put(cVar2.getGroupName(), cVar2);
                                }
                                gVar3.a = cVar2.k | gVar3.a;
                            }
                            z = false;
                            c3 = 4;
                            c2 = 5;
                        }
                        i2 = 3;
                        i3 = 1;
                    } else {
                        c0136f = c0136f3;
                        i = depth;
                        i2 = i5;
                        i3 = i7;
                        z = z3;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    z3 = z;
                    i5 = i2;
                    i7 = i3;
                    c0136f3 = c0136f;
                    depth = i;
                    i6 = 2;
                }
                if (!z4) {
                    this.d = a(gVar.c, gVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(i4.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(i4.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public f(g gVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.c = gVar;
        this.d = a(gVar.c, gVar.d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {
        public com.amazon.aps.iva.f3.c e;
        public float f;
        public com.amazon.aps.iva.f3.c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
        public Paint.Cap m;
        public Paint.Join n;
        public float o;

        public b() {
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.o = 4.0f;
        }

        @Override // com.amazon.aps.iva.b9.f.d
        public final boolean a() {
            if (!this.g.b() && !this.e.b()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // com.amazon.aps.iva.b9.f.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                com.amazon.aps.iva.f3.c r0 = r6.g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.c
                if (r1 == r4) goto L1c
                r0.c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                com.amazon.aps.iva.f3.c r1 = r6.e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.c
                if (r7 == r4) goto L36
                r1.c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b9.f.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.i;
        }

        public int getFillColor() {
            return this.g.c;
        }

        public float getStrokeAlpha() {
            return this.h;
        }

        public int getStrokeColor() {
            return this.e.c;
        }

        public float getStrokeWidth() {
            return this.f;
        }

        public float getTrimPathEnd() {
            return this.k;
        }

        public float getTrimPathOffset() {
            return this.l;
        }

        public float getTrimPathStart() {
            return this.j;
        }

        public void setFillAlpha(float f) {
            this.i = f;
        }

        public void setFillColor(int i) {
            this.g.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.h = f;
        }

        public void setStrokeColor(int i) {
            this.e.c = i;
        }

        public void setStrokeWidth(float f) {
            this.f = f;
        }

        public void setTrimPathEnd(float f) {
            this.k = f;
        }

        public void setTrimPathOffset(float f) {
            this.l = f;
        }

        public void setTrimPathStart(float f) {
            this.j = f;
        }

        public b(b bVar) {
            super(bVar);
            this.f = 0.0f;
            this.h = 1.0f;
            this.i = 1.0f;
            this.j = 0.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = Paint.Cap.BUTT;
            this.n = Paint.Join.MITER;
            this.o = 4.0f;
            this.e = bVar.e;
            this.f = bVar.f;
            this.h = bVar.h;
            this.g = bVar.g;
            this.c = bVar.c;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends d {
        public final Matrix a;
        public final ArrayList<d> b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public final int k;
        public String l;

        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.l = null;
        }

        @Override // com.amazon.aps.iva.b9.f.d
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList<d> arrayList = this.b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // com.amazon.aps.iva.b9.f.d
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean z = false;
            while (true) {
                ArrayList<d> arrayList = this.b;
                if (i < arrayList.size()) {
                    z |= arrayList.get(i).b(iArr);
                    i++;
                } else {
                    return z;
                }
            }
        }

        public final void c() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.c, 0.0f, 0.0f);
            matrix.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.l;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                c();
            }
        }

        public c(c cVar, com.amazon.aps.iva.x.a<String, Object> aVar) {
            e aVar2;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.l = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            String str = cVar.l;
            this.l = str;
            this.k = cVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.j);
            ArrayList<d> arrayList = cVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                d dVar = arrayList.get(i);
                if (dVar instanceof c) {
                    this.b.add(new c((c) dVar, aVar));
                } else {
                    if (dVar instanceof b) {
                        aVar2 = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        aVar2 = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(aVar2);
                    String str2 = aVar2.b;
                    if (str2 != null) {
                        aVar.put(str2, aVar2);
                    }
                }
            }
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: com.amazon.aps.iva.b9.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0136f {
        public static final Matrix p = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final c g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final com.amazon.aps.iva.x.a<String, Object> o;

        public C0136f() {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new com.amazon.aps.iva.x.a<>();
            this.g = new c();
            this.a = new Path();
            this.b = new Path();
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            float f2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.a.set(matrix);
            Matrix matrix2 = cVar.a;
            matrix2.preConcat(cVar.j);
            canvas.save();
            char c = 0;
            int i4 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.b;
                if (i4 < arrayList.size()) {
                    d dVar = arrayList.get(i4);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i, i2);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f3 = i / this.j;
                        float f4 = i2 / this.k;
                        float min = Math.min(f3, f4);
                        Matrix matrix3 = this.c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f3, f4);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        i3 = i4;
                        float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                        float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), hypot);
                        if (max > 0.0f) {
                            f = Math.abs(f5) / max;
                        } else {
                            f = 0.0f;
                        }
                        if (f != 0.0f) {
                            eVar.getClass();
                            Path path = this.a;
                            path.reset();
                            h.a[] aVarArr = eVar.a;
                            if (aVarArr != null) {
                                h.a.b(aVarArr, path);
                            }
                            Path path2 = this.b;
                            path2.reset();
                            if (eVar instanceof a) {
                                if (eVar.c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f6 = bVar.j;
                                if (f6 != 0.0f || bVar.k != 1.0f) {
                                    float f7 = bVar.l;
                                    float f8 = (f6 + f7) % 1.0f;
                                    float f9 = (bVar.k + f7) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, false);
                                    float length = this.f.getLength();
                                    float f10 = f8 * length;
                                    float f11 = f9 * length;
                                    path.reset();
                                    if (f10 > f11) {
                                        this.f.getSegment(f10, length, path, true);
                                        f2 = 0.0f;
                                        this.f.getSegment(0.0f, f11, path, true);
                                    } else {
                                        f2 = 0.0f;
                                        this.f.getSegment(f10, f11, path, true);
                                    }
                                    path.rLineTo(f2, f2);
                                }
                                path2.addPath(path, matrix3);
                                com.amazon.aps.iva.f3.c cVar2 = bVar.g;
                                if (cVar2.a != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z && cVar2.c == 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (this.e == null) {
                                        Paint paint = new Paint(1);
                                        this.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.e;
                                    Shader shader = cVar2.a;
                                    if (shader != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i5 = cVar2.c;
                                        float f12 = bVar.i;
                                        PorterDuff.Mode mode = f.k;
                                        paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (bVar.c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                com.amazon.aps.iva.f3.c cVar3 = bVar.e;
                                if (cVar3.a != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3 && cVar3.c == 0) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (z4) {
                                    if (this.d == null) {
                                        z5 = true;
                                        Paint paint3 = new Paint(1);
                                        this.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z5 = true;
                                    }
                                    Paint paint4 = this.d;
                                    Paint.Join join = bVar.n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.o);
                                    Shader shader2 = cVar3.a;
                                    if (shader2 == null) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i6 = cVar3.c;
                                        float f13 = bVar.h;
                                        PorterDuff.Mode mode2 = f.k;
                                        paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f * f * min);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        i4 = i3 + 1;
                        c = 0;
                    }
                    i3 = i4;
                    i4 = i3 + 1;
                    c = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }

        public C0136f(C0136f c0136f) {
            this.c = new Matrix();
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 255;
            this.m = null;
            this.n = null;
            com.amazon.aps.iva.x.a<String, Object> aVar = new com.amazon.aps.iva.x.a<>();
            this.o = aVar;
            this.g = new c(c0136f.g, aVar);
            this.a = new Path(c0136f.a);
            this.b = new Path(c0136f.b);
            this.h = c0136f.h;
            this.i = c0136f.i;
            this.j = c0136f.j;
            this.k = c0136f.k;
            this.l = c0136f.l;
            this.m = c0136f.m;
            String str = c0136f.m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.n = c0136f.n;
        }
    }
}
