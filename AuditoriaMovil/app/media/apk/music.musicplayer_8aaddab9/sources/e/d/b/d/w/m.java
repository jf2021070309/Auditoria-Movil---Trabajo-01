package e.d.b.d.w;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class m {
    @Deprecated
    public float a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f6651b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f6652c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f6653d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f6654e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f6655f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f6656g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f6657h = new ArrayList();

    /* loaded from: classes2.dex */
    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f6658b;

        public a(c cVar) {
            this.f6658b = cVar;
        }

        @Override // e.d.b.d.w.m.f
        public void a(Matrix matrix, e.d.b.d.v.a aVar, int i2, Canvas canvas) {
            c cVar = this.f6658b;
            float f2 = cVar.f6667g;
            float f3 = cVar.f6668h;
            c cVar2 = this.f6658b;
            RectF rectF = new RectF(cVar2.f6663c, cVar2.f6664d, cVar2.f6665e, cVar2.f6666f);
            boolean z = f3 < 0.0f;
            Path path = aVar.f6587k;
            if (z) {
                int[] iArr = e.d.b.d.v.a.f6579c;
                iArr[0] = 0;
                iArr[1] = aVar.f6586j;
                iArr[2] = aVar.f6585i;
                iArr[3] = aVar.f6584h;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = -i2;
                rectF.inset(f4, f4);
                int[] iArr2 = e.d.b.d.v.a.f6579c;
                iArr2[0] = 0;
                iArr2[1] = aVar.f6584h;
                iArr2[2] = aVar.f6585i;
                iArr2[3] = aVar.f6586j;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f5 = 1.0f - (i2 / width);
            float[] fArr = e.d.b.d.v.a.f6580d;
            fArr[1] = f5;
            fArr[2] = ((1.0f - f5) / 2.0f) + f5;
            aVar.f6582f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, e.d.b.d.v.a.f6579c, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f6588l);
            }
            canvas.drawArc(rectF, f2, f3, true, aVar.f6582f);
            canvas.restore();
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f6659b;

        /* renamed from: c  reason: collision with root package name */
        public final float f6660c;

        /* renamed from: d  reason: collision with root package name */
        public final float f6661d;

        public b(d dVar, float f2, float f3) {
            this.f6659b = dVar;
            this.f6660c = f2;
            this.f6661d = f3;
        }

        @Override // e.d.b.d.w.m.f
        public void a(Matrix matrix, e.d.b.d.v.a aVar, int i2, Canvas canvas) {
            d dVar = this.f6659b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f6670c - this.f6661d, dVar.f6669b - this.f6660c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f6660c, this.f6661d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += i2;
            rectF.offset(0.0f, -i2);
            int[] iArr = e.d.b.d.v.a.a;
            iArr[0] = aVar.f6586j;
            iArr[1] = aVar.f6585i;
            iArr[2] = aVar.f6584h;
            Paint paint = aVar.f6583g;
            float f2 = rectF.left;
            paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, e.d.b.d.v.a.f6578b, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f6583g);
            canvas.restore();
        }

        public float b() {
            d dVar = this.f6659b;
            return (float) Math.toDegrees(Math.atan((dVar.f6670c - this.f6661d) / (dVar.f6669b - this.f6660c)));
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public static final RectF f6662b = new RectF();
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f6663c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f6664d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f6665e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f6666f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f6667g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        public float f6668h;

        public c(float f2, float f3, float f4, float f5) {
            this.f6663c = f2;
            this.f6664d = f3;
            this.f6665e = f4;
            this.f6666f = f5;
        }

        @Override // e.d.b.d.w.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f6662b;
            rectF.set(this.f6663c, this.f6664d, this.f6665e, this.f6666f);
            path.arcTo(rectF, this.f6667g, this.f6668h, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f6669b;

        /* renamed from: c  reason: collision with root package name */
        public float f6670c;

        @Override // e.d.b.d.w.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f6669b, this.f6670c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes2.dex */
    public static abstract class f {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, e.d.b.d.v.a aVar, int i2, Canvas canvas);
    }

    public m() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f6667g = f6;
        cVar.f6668h = f7;
        this.f6656g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.f6657h.add(aVar);
        this.f6654e = f9;
        double d2 = f8;
        this.f6652c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f6653d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.f6654e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f6652c;
        float f6 = this.f6653d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f6667g = this.f6654e;
        cVar.f6668h = f4;
        this.f6657h.add(new a(cVar));
        this.f6654e = f2;
    }

    public void c(Matrix matrix, Path path) {
        int size = this.f6656g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6656g.get(i2).a(matrix, path);
        }
    }

    public void d(float f2, float f3) {
        d dVar = new d();
        dVar.f6669b = f2;
        dVar.f6670c = f3;
        this.f6656g.add(dVar);
        b bVar = new b(dVar, this.f6652c, this.f6653d);
        b(bVar.b() + 270.0f);
        this.f6657h.add(bVar);
        this.f6654e = bVar.b() + 270.0f;
        this.f6652c = f2;
        this.f6653d = f3;
    }

    public void e(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.f6651b = f3;
        this.f6652c = f2;
        this.f6653d = f3;
        this.f6654e = f4;
        this.f6655f = (f4 + f5) % 360.0f;
        this.f6656g.clear();
        this.f6657h.clear();
    }
}
