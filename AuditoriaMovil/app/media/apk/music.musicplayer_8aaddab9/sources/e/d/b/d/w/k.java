package e.d.b.d.w;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import e.d.b.d.w.g;
import e.d.b.d.w.m;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
/* loaded from: classes2.dex */
public class k {
    public final m[] a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f6638b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f6639c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f6640d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f6641e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f6642f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final m f6643g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f6644h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f6645i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f6646j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f6647k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f6648l = true;

    /* loaded from: classes2.dex */
    public static class a {
        public static final k a = new k();
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public k() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new m();
            this.f6638b[i2] = new Matrix();
            this.f6639c[i2] = new Matrix();
        }
    }

    public void a(j jVar, float f2, RectF rectF, b bVar, Path path) {
        float[] fArr;
        path.rewind();
        this.f6641e.rewind();
        this.f6642f.rewind();
        this.f6642f.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (i2 < 4) {
            c cVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? jVar.f6620f : jVar.f6619e : jVar.f6622h : jVar.f6621g;
            d dVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? jVar.f6616b : jVar.a : jVar.f6618d : jVar.f6617c;
            m mVar = this.a[i2];
            Objects.requireNonNull(dVar);
            dVar.a(mVar, 90.0f, f2, cVar.a(rectF));
            int i3 = i2 + 1;
            float f3 = i3 * 90;
            this.f6638b[i2].reset();
            PointF pointF = this.f6640d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.f6638b[i2];
            PointF pointF2 = this.f6640d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f6638b[i2].preRotate(f3);
            float[] fArr2 = this.f6644h;
            m[] mVarArr = this.a;
            fArr2[0] = mVarArr[i2].f6652c;
            fArr2[1] = mVarArr[i2].f6653d;
            this.f6638b[i2].mapPoints(fArr2);
            this.f6639c[i2].reset();
            Matrix matrix2 = this.f6639c[i2];
            float[] fArr3 = this.f6644h;
            matrix2.setTranslate(fArr3[0], fArr3[1]);
            this.f6639c[i2].preRotate(f3);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < 4) {
            float[] fArr4 = this.f6644h;
            m[] mVarArr2 = this.a;
            fArr4[0] = mVarArr2[i4].a;
            fArr4[1] = mVarArr2[i4].f6651b;
            this.f6638b[i4].mapPoints(fArr4);
            if (i4 == 0) {
                float[] fArr5 = this.f6644h;
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                float[] fArr6 = this.f6644h;
                path.lineTo(fArr6[0], fArr6[1]);
            }
            this.a[i4].c(this.f6638b[i4], path);
            if (bVar != null) {
                m mVar2 = this.a[i4];
                Matrix matrix3 = this.f6638b[i4];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.f6594f;
                Objects.requireNonNull(mVar2);
                bitSet.set(i4, false);
                m.f[] fVarArr = g.this.f6592d;
                mVar2.b(mVar2.f6655f);
                fVarArr[i4] = new l(mVar2, new ArrayList(mVar2.f6657h), new Matrix(matrix3));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr7 = this.f6644h;
            m[] mVarArr3 = this.a;
            fArr7[0] = mVarArr3[i4].f6652c;
            fArr7[1] = mVarArr3[i4].f6653d;
            this.f6638b[i4].mapPoints(fArr7);
            float[] fArr8 = this.f6645i;
            m[] mVarArr4 = this.a;
            fArr8[0] = mVarArr4[i6].a;
            fArr8[1] = mVarArr4[i6].f6651b;
            this.f6638b[i6].mapPoints(fArr8);
            float f4 = this.f6644h[0];
            float[] fArr9 = this.f6645i;
            float max = Math.max(((float) Math.hypot(f4 - fArr9[0], fArr[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.f6644h;
            m[] mVarArr5 = this.a;
            fArr10[0] = mVarArr5[i4].f6652c;
            fArr10[1] = mVarArr5[i4].f6653d;
            this.f6638b[i4].mapPoints(fArr10);
            float abs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - this.f6644h[0]) : Math.abs(rectF.centerY() - this.f6644h[1]);
            this.f6643g.e(0.0f, 0.0f, 270.0f, 0.0f);
            (i4 != 1 ? i4 != 2 ? i4 != 3 ? jVar.f6624j : jVar.f6623i : jVar.f6626l : jVar.f6625k).a(max, abs, f2, this.f6643g);
            this.f6646j.reset();
            this.f6643g.c(this.f6639c[i4], this.f6646j);
            if (this.f6648l && (b(this.f6646j, i4) || b(this.f6646j, i6))) {
                Path path2 = this.f6646j;
                path2.op(path2, this.f6642f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f6644h;
                m mVar3 = this.f6643g;
                fArr11[0] = mVar3.a;
                fArr11[1] = mVar3.f6651b;
                this.f6639c[i4].mapPoints(fArr11);
                Path path3 = this.f6641e;
                float[] fArr12 = this.f6644h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.f6643g.c(this.f6639c[i4], this.f6641e);
            } else {
                this.f6643g.c(this.f6639c[i4], path);
            }
            if (bVar != null) {
                m mVar4 = this.f6643g;
                Matrix matrix4 = this.f6639c[i4];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(mVar4);
                g.this.f6594f.set(i4 + 4, false);
                m.f[] fVarArr2 = g.this.f6593e;
                mVar4.b(mVar4.f6655f);
                fVarArr2[i4] = new l(mVar4, new ArrayList(mVar4.f6657h), new Matrix(matrix4));
            }
            i4 = i5;
        }
        path.close();
        this.f6641e.close();
        if (this.f6641e.isEmpty()) {
            return;
        }
        path.op(this.f6641e, Path.Op.UNION);
    }

    public final boolean b(Path path, int i2) {
        this.f6647k.reset();
        this.a[i2].c(this.f6638b[i2], this.f6647k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f6647k.computeBounds(rectF, true);
        path.op(this.f6647k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
