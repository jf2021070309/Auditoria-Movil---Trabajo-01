package c.a0.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class g extends c.a0.a.a.f {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f706b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public h f707c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuffColorFilter f708d;

    /* renamed from: e  reason: collision with root package name */
    public ColorFilter f709e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f710f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f711g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f712h;

    /* renamed from: i  reason: collision with root package name */
    public final Matrix f713i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f714j;

    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f715e;

        /* renamed from: f  reason: collision with root package name */
        public c.i.d.c.d f716f;

        /* renamed from: g  reason: collision with root package name */
        public float f717g;

        /* renamed from: h  reason: collision with root package name */
        public c.i.d.c.d f718h;

        /* renamed from: i  reason: collision with root package name */
        public float f719i;

        /* renamed from: j  reason: collision with root package name */
        public float f720j;

        /* renamed from: k  reason: collision with root package name */
        public float f721k;

        /* renamed from: l  reason: collision with root package name */
        public float f722l;

        /* renamed from: m  reason: collision with root package name */
        public float f723m;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Cap f724n;
        public Paint.Join o;
        public float p;

        public c() {
            this.f717g = 0.0f;
            this.f719i = 1.0f;
            this.f720j = 1.0f;
            this.f721k = 0.0f;
            this.f722l = 1.0f;
            this.f723m = 0.0f;
            this.f724n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f717g = 0.0f;
            this.f719i = 1.0f;
            this.f720j = 1.0f;
            this.f721k = 0.0f;
            this.f722l = 1.0f;
            this.f723m = 0.0f;
            this.f724n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f715e = cVar.f715e;
            this.f716f = cVar.f716f;
            this.f717g = cVar.f717g;
            this.f719i = cVar.f719i;
            this.f718h = cVar.f718h;
            this.f738c = cVar.f738c;
            this.f720j = cVar.f720j;
            this.f721k = cVar.f721k;
            this.f722l = cVar.f722l;
            this.f723m = cVar.f723m;
            this.f724n = cVar.f724n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        @Override // c.a0.a.a.g.e
        public boolean a() {
            return this.f718h.c() || this.f716f.c();
        }

        @Override // c.a0.a.a.g.e
        public boolean b(int[] iArr) {
            return this.f716f.d(iArr) | this.f718h.d(iArr);
        }

        public float getFillAlpha() {
            return this.f720j;
        }

        public int getFillColor() {
            return this.f718h.f2007c;
        }

        public float getStrokeAlpha() {
            return this.f719i;
        }

        public int getStrokeColor() {
            return this.f716f.f2007c;
        }

        public float getStrokeWidth() {
            return this.f717g;
        }

        public float getTrimPathEnd() {
            return this.f722l;
        }

        public float getTrimPathOffset() {
            return this.f723m;
        }

        public float getTrimPathStart() {
            return this.f721k;
        }

        public void setFillAlpha(float f2) {
            this.f720j = f2;
        }

        public void setFillColor(int i2) {
            this.f718h.f2007c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f719i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f716f.f2007c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f717g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f722l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f723m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f721k = f2;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {
        public final Matrix a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f725b;

        /* renamed from: c  reason: collision with root package name */
        public float f726c;

        /* renamed from: d  reason: collision with root package name */
        public float f727d;

        /* renamed from: e  reason: collision with root package name */
        public float f728e;

        /* renamed from: f  reason: collision with root package name */
        public float f729f;

        /* renamed from: g  reason: collision with root package name */
        public float f730g;

        /* renamed from: h  reason: collision with root package name */
        public float f731h;

        /* renamed from: i  reason: collision with root package name */
        public float f732i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f733j;

        /* renamed from: k  reason: collision with root package name */
        public int f734k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f735l;

        /* renamed from: m  reason: collision with root package name */
        public String f736m;

        public d() {
            super(null);
            this.a = new Matrix();
            this.f725b = new ArrayList<>();
            this.f726c = 0.0f;
            this.f727d = 0.0f;
            this.f728e = 0.0f;
            this.f729f = 1.0f;
            this.f730g = 1.0f;
            this.f731h = 0.0f;
            this.f732i = 0.0f;
            this.f733j = new Matrix();
            this.f736m = null;
        }

        public d(d dVar, c.f.a<String, Object> aVar) {
            super(null);
            f bVar;
            this.a = new Matrix();
            this.f725b = new ArrayList<>();
            this.f726c = 0.0f;
            this.f727d = 0.0f;
            this.f728e = 0.0f;
            this.f729f = 1.0f;
            this.f730g = 1.0f;
            this.f731h = 0.0f;
            this.f732i = 0.0f;
            Matrix matrix = new Matrix();
            this.f733j = matrix;
            this.f736m = null;
            this.f726c = dVar.f726c;
            this.f727d = dVar.f727d;
            this.f728e = dVar.f728e;
            this.f729f = dVar.f729f;
            this.f730g = dVar.f730g;
            this.f731h = dVar.f731h;
            this.f732i = dVar.f732i;
            this.f735l = dVar.f735l;
            String str = dVar.f736m;
            this.f736m = str;
            this.f734k = dVar.f734k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f733j);
            ArrayList<e> arrayList = dVar.f725b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f725b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        bVar = new b((b) eVar);
                    }
                    this.f725b.add(bVar);
                    String str2 = bVar.f737b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // c.a0.a.a.g.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f725b.size(); i2++) {
                if (this.f725b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // c.a0.a.a.g.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.f725b.size(); i2++) {
                z |= this.f725b.get(i2).b(iArr);
            }
            return z;
        }

        public final void c() {
            this.f733j.reset();
            this.f733j.postTranslate(-this.f727d, -this.f728e);
            this.f733j.postScale(this.f729f, this.f730g);
            this.f733j.postRotate(this.f726c, 0.0f, 0.0f);
            this.f733j.postTranslate(this.f731h + this.f727d, this.f732i + this.f728e);
        }

        public String getGroupName() {
            return this.f736m;
        }

        public Matrix getLocalMatrix() {
            return this.f733j;
        }

        public float getPivotX() {
            return this.f727d;
        }

        public float getPivotY() {
            return this.f728e;
        }

        public float getRotation() {
            return this.f726c;
        }

        public float getScaleX() {
            return this.f729f;
        }

        public float getScaleY() {
            return this.f730g;
        }

        public float getTranslateX() {
            return this.f731h;
        }

        public float getTranslateY() {
            return this.f732i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f727d) {
                this.f727d = f2;
                c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f728e) {
                this.f728e = f2;
                c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f726c) {
                this.f726c = f2;
                c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f729f) {
                this.f729f = f2;
                c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f730g) {
                this.f730g = f2;
                c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f731h) {
                this.f731h = f2;
                c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f732i) {
                this.f732i = f2;
                c();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public e(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f extends e {
        public c.i.e.d[] a;

        /* renamed from: b  reason: collision with root package name */
        public String f737b;

        /* renamed from: c  reason: collision with root package name */
        public int f738c;

        /* renamed from: d  reason: collision with root package name */
        public int f739d;

        public f() {
            super(null);
            this.a = null;
            this.f738c = 0;
        }

        public f(f fVar) {
            super(null);
            this.a = null;
            this.f738c = 0;
            this.f737b = fVar.f737b;
            this.f739d = fVar.f739d;
            this.a = c.i.a.r(fVar.a);
        }

        public c.i.e.d[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.f737b;
        }

        public void setPathData(c.i.e.d[] dVarArr) {
            if (!c.i.a.g(this.a, dVarArr)) {
                this.a = c.i.a.r(dVarArr);
                return;
            }
            c.i.e.d[] dVarArr2 = this.a;
            for (int i2 = 0; i2 < dVarArr.length; i2++) {
                dVarArr2[i2].a = dVarArr[i2].a;
                for (int i3 = 0; i3 < dVarArr[i2].f2039b.length; i3++) {
                    dVarArr2[i2].f2039b[i3] = dVarArr[i2].f2039b[i3];
                }
            }
        }
    }

    /* renamed from: c.a0.a.a.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0013g {
        public static final Matrix a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final Path f740b;

        /* renamed from: c  reason: collision with root package name */
        public final Path f741c;

        /* renamed from: d  reason: collision with root package name */
        public final Matrix f742d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f743e;

        /* renamed from: f  reason: collision with root package name */
        public Paint f744f;

        /* renamed from: g  reason: collision with root package name */
        public PathMeasure f745g;

        /* renamed from: h  reason: collision with root package name */
        public int f746h;

        /* renamed from: i  reason: collision with root package name */
        public final d f747i;

        /* renamed from: j  reason: collision with root package name */
        public float f748j;

        /* renamed from: k  reason: collision with root package name */
        public float f749k;

        /* renamed from: l  reason: collision with root package name */
        public float f750l;

        /* renamed from: m  reason: collision with root package name */
        public float f751m;

        /* renamed from: n  reason: collision with root package name */
        public int f752n;
        public String o;
        public Boolean p;
        public final c.f.a<String, Object> q;

        public C0013g() {
            this.f742d = new Matrix();
            this.f748j = 0.0f;
            this.f749k = 0.0f;
            this.f750l = 0.0f;
            this.f751m = 0.0f;
            this.f752n = 255;
            this.o = null;
            this.p = null;
            this.q = new c.f.a<>();
            this.f747i = new d();
            this.f740b = new Path();
            this.f741c = new Path();
        }

        public C0013g(C0013g c0013g) {
            this.f742d = new Matrix();
            this.f748j = 0.0f;
            this.f749k = 0.0f;
            this.f750l = 0.0f;
            this.f751m = 0.0f;
            this.f752n = 255;
            this.o = null;
            this.p = null;
            c.f.a<String, Object> aVar = new c.f.a<>();
            this.q = aVar;
            this.f747i = new d(c0013g.f747i, aVar);
            this.f740b = new Path(c0013g.f740b);
            this.f741c = new Path(c0013g.f741c);
            this.f748j = c0013g.f748j;
            this.f749k = c0013g.f749k;
            this.f750l = c0013g.f750l;
            this.f751m = c0013g.f751m;
            this.f746h = c0013g.f746h;
            this.f752n = c0013g.f752n;
            this.o = c0013g.o;
            String str = c0013g.o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.p = c0013g.p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            C0013g c0013g;
            C0013g c0013g2 = this;
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f733j);
            canvas.save();
            ?? r11 = 0;
            int i4 = 0;
            while (i4 < dVar.f725b.size()) {
                e eVar = dVar.f725b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f2 = i2 / c0013g2.f750l;
                    float f3 = i3 / c0013g2.f751m;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar.a;
                    c0013g2.f742d.set(matrix2);
                    c0013g2.f742d.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[r11], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs == 0.0f) {
                        c0013g = this;
                    } else {
                        c0013g = this;
                        Path path = c0013g.f740b;
                        Objects.requireNonNull(fVar);
                        path.reset();
                        c.i.e.d[] dVarArr = fVar.a;
                        if (dVarArr != null) {
                            c.i.e.d.b(dVarArr, path);
                        }
                        Path path2 = c0013g.f740b;
                        c0013g.f741c.reset();
                        if (fVar instanceof b) {
                            c0013g.f741c.setFillType(fVar.f738c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            c0013g.f741c.addPath(path2, c0013g.f742d);
                            canvas.clipPath(c0013g.f741c);
                        } else {
                            c cVar = (c) fVar;
                            float f5 = cVar.f721k;
                            if (f5 != 0.0f || cVar.f722l != 1.0f) {
                                float f6 = cVar.f723m;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (cVar.f722l + f6) % 1.0f;
                                if (c0013g.f745g == null) {
                                    c0013g.f745g = new PathMeasure();
                                }
                                c0013g.f745g.setPath(c0013g.f740b, r11);
                                float length = c0013g.f745g.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path2.reset();
                                if (f9 > f10) {
                                    c0013g.f745g.getSegment(f9, length, path2, true);
                                    c0013g.f745g.getSegment(0.0f, f10, path2, true);
                                } else {
                                    c0013g.f745g.getSegment(f9, f10, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            c0013g.f741c.addPath(path2, c0013g.f742d);
                            c.i.d.c.d dVar2 = cVar.f718h;
                            if (dVar2.b() || dVar2.f2007c != 0) {
                                c.i.d.c.d dVar3 = cVar.f718h;
                                if (c0013g.f744f == null) {
                                    Paint paint = new Paint(1);
                                    c0013g.f744f = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = c0013g.f744f;
                                if (dVar3.b()) {
                                    Shader shader = dVar3.a;
                                    shader.setLocalMatrix(c0013g.f742d);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f720j * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = dVar3.f2007c;
                                    float f11 = cVar.f720j;
                                    PorterDuff.Mode mode = g.f706b;
                                    paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                }
                                paint2.setColorFilter(colorFilter);
                                c0013g.f741c.setFillType(cVar.f738c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(c0013g.f741c, paint2);
                            }
                            c.i.d.c.d dVar4 = cVar.f716f;
                            if (dVar4.b() || dVar4.f2007c != 0) {
                                c.i.d.c.d dVar5 = cVar.f716f;
                                if (c0013g.f743e == null) {
                                    Paint paint3 = new Paint(1);
                                    c0013g.f743e = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c0013g.f743e;
                                Paint.Join join = cVar.o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.f724n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.p);
                                if (dVar5.b()) {
                                    Shader shader2 = dVar5.a;
                                    shader2.setLocalMatrix(c0013g.f742d);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f719i * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = dVar5.f2007c;
                                    float f12 = cVar.f719i;
                                    PorterDuff.Mode mode2 = g.f706b;
                                    paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint4.setColorFilter(colorFilter);
                                paint4.setStrokeWidth(cVar.f717g * abs * min);
                                canvas.drawPath(c0013g.f741c, paint4);
                            }
                        }
                    }
                    i4++;
                    c0013g2 = c0013g;
                    r11 = 0;
                }
                c0013g = c0013g2;
                i4++;
                c0013g2 = c0013g;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f752n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f752n = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public C0013g f753b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f754c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f755d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f756e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f757f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f758g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f759h;

        /* renamed from: i  reason: collision with root package name */
        public int f760i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f761j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f762k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f763l;

        public h() {
            this.f754c = null;
            this.f755d = g.f706b;
            this.f753b = new C0013g();
        }

        public h(h hVar) {
            this.f754c = null;
            this.f755d = g.f706b;
            if (hVar != null) {
                this.a = hVar.a;
                C0013g c0013g = new C0013g(hVar.f753b);
                this.f753b = c0013g;
                if (hVar.f753b.f744f != null) {
                    c0013g.f744f = new Paint(hVar.f753b.f744f);
                }
                if (hVar.f753b.f743e != null) {
                    this.f753b.f743e = new Paint(hVar.f753b.f743e);
                }
                this.f754c = hVar.f754c;
                this.f755d = hVar.f755d;
                this.f756e = hVar.f756e;
            }
        }

        public boolean a() {
            C0013g c0013g = this.f753b;
            if (c0013g.p == null) {
                c0013g.p = Boolean.valueOf(c0013g.f747i.a());
            }
            return c0013g.p.booleanValue();
        }

        public void b(int i2, int i3) {
            this.f757f.eraseColor(0);
            Canvas canvas = new Canvas(this.f757f);
            C0013g c0013g = this.f753b;
            c0013g.a(c0013g.f747i, C0013g.a, canvas, i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.a = (VectorDrawable) this.a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.a = (VectorDrawable) this.a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f711g = true;
        this.f712h = new float[9];
        this.f713i = new Matrix();
        this.f714j = new Rect();
        this.f707c = new h();
    }

    public g(h hVar) {
        this.f711g = true;
        this.f712h = new float[9];
        this.f713i = new Matrix();
        this.f714j = new Rect();
        this.f707c = hVar;
        this.f708d = b(hVar.f754c, hVar.f755d);
    }

    public static g a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.f(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f757f.getHeight()) == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a0.a.a.g.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.f707c.f753b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f707c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }
        return this.f709e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a == null || Build.VERSION.SDK_INT < 24) {
            this.f707c.a = getChangingConfigurations();
            return this.f707c;
        }
        return new i(this.a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f707c.f753b.f749k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f707c.f753b.f748j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a0.a.a.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.f707c.f756e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f707c) != null && (hVar.a() || ((colorStateList = this.f707c.f754c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f710f && super.mutate() == this) {
            this.f707c = new h(this.f707c);
            this.f710f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f707c;
        ColorStateList colorStateList = hVar.f754c;
        if (colorStateList != null && (mode = hVar.f755d) != null) {
            this.f708d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.a()) {
            boolean b2 = hVar.f753b.f747i.b(iArr);
            hVar.f762k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f707c.f753b.getRootAlpha() != i2) {
            this.f707c.f753b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f707c.f756e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f709e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.i0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.j0(drawable, colorStateList);
            return;
        }
        h hVar = this.f707c;
        if (hVar.f754c != colorStateList) {
            hVar.f754c = colorStateList;
            this.f708d = b(colorStateList, hVar.f755d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.k0(drawable, mode);
            return;
        }
        h hVar = this.f707c;
        if (hVar.f755d != mode) {
            hVar.f755d = mode;
            this.f708d = b(hVar.f754c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
