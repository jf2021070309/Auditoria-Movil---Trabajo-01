package com.amazon.aps.iva.ba;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public final class g implements d, a.InterfaceC0165a, j {
    public final String a;
    public final boolean b;
    public final com.amazon.aps.iva.ia.b c;
    public final com.amazon.aps.iva.x.f<LinearGradient> d = new com.amazon.aps.iva.x.f<>();
    public final com.amazon.aps.iva.x.f<RadialGradient> e = new com.amazon.aps.iva.x.f<>();
    public final Path f;
    public final com.amazon.aps.iva.aa.a g;
    public final RectF h;
    public final ArrayList i;
    public final com.amazon.aps.iva.ha.f j;
    public final com.amazon.aps.iva.ca.e k;
    public final com.amazon.aps.iva.ca.f l;
    public final com.amazon.aps.iva.ca.k m;
    public final com.amazon.aps.iva.ca.k n;
    public com.amazon.aps.iva.ca.r o;
    public com.amazon.aps.iva.ca.r p;
    public final d0 q;
    public final int r;
    public com.amazon.aps.iva.ca.a<Float, Float> s;
    public float t;
    public final com.amazon.aps.iva.ca.c u;

    public g(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.d dVar) {
        Path path = new Path();
        this.f = path;
        this.g = new com.amazon.aps.iva.aa.a(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = bVar;
        this.a = dVar.g;
        this.b = dVar.h;
        this.q = d0Var;
        this.j = dVar.a;
        path.setFillType(dVar.b);
        this.r = (int) (hVar.b() / 32.0f);
        com.amazon.aps.iva.ca.a<com.amazon.aps.iva.ha.c, com.amazon.aps.iva.ha.c> d = dVar.c.d();
        this.k = (com.amazon.aps.iva.ca.e) d;
        d.a(this);
        bVar.g(d);
        com.amazon.aps.iva.ca.a<Integer, Integer> d2 = dVar.d.d();
        this.l = (com.amazon.aps.iva.ca.f) d2;
        d2.a(this);
        bVar.g(d2);
        com.amazon.aps.iva.ca.a<PointF, PointF> d3 = dVar.e.d();
        this.m = (com.amazon.aps.iva.ca.k) d3;
        d3.a(this);
        bVar.g(d3);
        com.amazon.aps.iva.ca.a<PointF, PointF> d4 = dVar.f.d();
        this.n = (com.amazon.aps.iva.ca.k) d4;
        d4.a(this);
        bVar.g(d4);
        if (bVar.m() != null) {
            com.amazon.aps.iva.ca.a<Float, Float> d5 = ((com.amazon.aps.iva.ga.b) bVar.m().b).d();
            this.s = d5;
            d5.a(this);
            bVar.g(this.s);
        }
        if (bVar.n() != null) {
            this.u = new com.amazon.aps.iva.ca.c(this, bVar, bVar.n());
        }
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            b bVar = list2.get(i);
            if (bVar instanceof l) {
                this.i.add((l) bVar);
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, this);
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                path.addPath(((l) arrayList.get(i)).b(), matrix);
                i++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int[] g(int[] iArr) {
        com.amazon.aps.iva.ca.r rVar = this.p;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.ba.d
    public final void h(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((l) arrayList.get(i2)).b(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        com.amazon.aps.iva.ha.f fVar = com.amazon.aps.iva.ha.f.LINEAR;
        com.amazon.aps.iva.ha.f fVar2 = this.j;
        com.amazon.aps.iva.ca.e eVar = this.k;
        com.amazon.aps.iva.ca.k kVar = this.n;
        com.amazon.aps.iva.ca.k kVar2 = this.m;
        if (fVar2 == fVar) {
            long j = j();
            com.amazon.aps.iva.x.f<LinearGradient> fVar3 = this.d;
            shader = (LinearGradient) fVar3.d(j, null);
            if (shader == null) {
                PointF f = kVar2.f();
                PointF f2 = kVar.f();
                com.amazon.aps.iva.ha.c f3 = eVar.f();
                shader = new LinearGradient(f.x, f.y, f2.x, f2.y, g(f3.b), f3.a, Shader.TileMode.CLAMP);
                fVar3.f(j, shader);
            }
        } else {
            long j2 = j();
            com.amazon.aps.iva.x.f<RadialGradient> fVar4 = this.e;
            shader = (RadialGradient) fVar4.d(j2, null);
            if (shader == null) {
                PointF f4 = kVar2.f();
                PointF f5 = kVar.f();
                com.amazon.aps.iva.ha.c f6 = eVar.f();
                int[] g = g(f6.b);
                float[] fArr = f6.a;
                float f7 = f4.x;
                float f8 = f4.y;
                float hypot = (float) Math.hypot(f5.x - f7, f5.y - f8);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                shader = new RadialGradient(f7, f8, hypot, g, fArr, Shader.TileMode.CLAMP);
                fVar4.f(j2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        com.amazon.aps.iva.aa.a aVar = this.g;
        aVar.setShader(shader);
        com.amazon.aps.iva.ca.r rVar = this.o;
        if (rVar != null) {
            aVar.setColorFilter((ColorFilter) rVar.f());
        }
        com.amazon.aps.iva.ca.a<Float, Float> aVar2 = this.s;
        if (aVar2 != null) {
            float floatValue = aVar2.f().floatValue();
            if (floatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (floatValue != this.t) {
                aVar.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = floatValue;
        }
        com.amazon.aps.iva.ca.c cVar = this.u;
        if (cVar != null) {
            cVar.b(aVar);
        }
        PointF pointF = com.amazon.aps.iva.ma.f.a;
        aVar.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * this.l.f().intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, aVar);
        z.s();
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (obj == h0.d) {
            this.l.k(cVar);
            return;
        }
        ColorFilter colorFilter = h0.K;
        com.amazon.aps.iva.ia.b bVar = this.c;
        if (obj == colorFilter) {
            com.amazon.aps.iva.ca.r rVar = this.o;
            if (rVar != null) {
                bVar.q(rVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            com.amazon.aps.iva.ca.r rVar2 = new com.amazon.aps.iva.ca.r(cVar, null);
            this.o = rVar2;
            rVar2.a(this);
            bVar.g(this.o);
        } else if (obj == h0.L) {
            com.amazon.aps.iva.ca.r rVar3 = this.p;
            if (rVar3 != null) {
                bVar.q(rVar3);
            }
            if (cVar == null) {
                this.p = null;
                return;
            }
            this.d.a();
            this.e.a();
            com.amazon.aps.iva.ca.r rVar4 = new com.amazon.aps.iva.ca.r(cVar, null);
            this.p = rVar4;
            rVar4.a(this);
            bVar.g(this.p);
        } else if (obj == h0.j) {
            com.amazon.aps.iva.ca.a<Float, Float> aVar = this.s;
            if (aVar != null) {
                aVar.k(cVar);
                return;
            }
            com.amazon.aps.iva.ca.r rVar5 = new com.amazon.aps.iva.ca.r(cVar, null);
            this.s = rVar5;
            rVar5.a(this);
            bVar.g(this.s);
        } else {
            Integer num = h0.e;
            com.amazon.aps.iva.ca.c cVar2 = this.u;
            if (obj == num && cVar2 != null) {
                cVar2.b.k(cVar);
            } else if (obj == h0.G && cVar2 != null) {
                cVar2.c(cVar);
            } else if (obj == h0.H && cVar2 != null) {
                cVar2.d.k(cVar);
            } else if (obj == h0.I && cVar2 != null) {
                cVar2.e.k(cVar);
            } else if (obj == h0.J && cVar2 != null) {
                cVar2.f.k(cVar);
            }
        }
    }

    public final int j() {
        int i;
        float f = this.m.d;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.d * f2);
        int round3 = Math.round(this.k.d * f2);
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }
}
