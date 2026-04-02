package com.amazon.aps.iva.ba;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ha.r;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.InterfaceC0165a, j, d {
    public final d0 e;
    public final com.amazon.aps.iva.ia.b f;
    public final float[] h;
    public final com.amazon.aps.iva.aa.a i;
    public final com.amazon.aps.iva.ca.d j;
    public final com.amazon.aps.iva.ca.f k;
    public final ArrayList l;
    public final com.amazon.aps.iva.ca.d m;
    public com.amazon.aps.iva.ca.r n;
    public com.amazon.aps.iva.ca.a<Float, Float> o;
    public float p;
    public final com.amazon.aps.iva.ca.c q;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: com.amazon.aps.iva.ba.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0137a {
        public final ArrayList a = new ArrayList();
        public final t b;

        public C0137a(t tVar) {
            this.b = tVar;
        }
    }

    public a(d0 d0Var, com.amazon.aps.iva.ia.b bVar, Paint.Cap cap, Paint.Join join, float f, com.amazon.aps.iva.ga.d dVar, com.amazon.aps.iva.ga.b bVar2, List<com.amazon.aps.iva.ga.b> list, com.amazon.aps.iva.ga.b bVar3) {
        com.amazon.aps.iva.aa.a aVar = new com.amazon.aps.iva.aa.a(1);
        this.i = aVar;
        this.p = 0.0f;
        this.e = d0Var;
        this.f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f);
        this.k = (com.amazon.aps.iva.ca.f) dVar.d();
        this.j = (com.amazon.aps.iva.ca.d) bVar2.d();
        if (bVar3 == null) {
            this.m = null;
        } else {
            this.m = (com.amazon.aps.iva.ca.d) bVar3.d();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).d());
        }
        bVar.g(this.k);
        bVar.g(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            bVar.g((com.amazon.aps.iva.ca.a) this.l.get(i2));
        }
        com.amazon.aps.iva.ca.d dVar2 = this.m;
        if (dVar2 != null) {
            bVar.g(dVar2);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((com.amazon.aps.iva.ca.a) this.l.get(i3)).a(this);
        }
        com.amazon.aps.iva.ca.d dVar3 = this.m;
        if (dVar3 != null) {
            dVar3.a(this);
        }
        if (bVar.m() != null) {
            com.amazon.aps.iva.ca.a<Float, Float> d = ((com.amazon.aps.iva.ga.b) bVar.m().b).d();
            this.o = d;
            d.a(this);
            bVar.g(this.o);
        }
        if (bVar.n() != null) {
            this.q = new com.amazon.aps.iva.ca.c(this, bVar, bVar.n());
        }
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.e.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C0137a c0137a = null;
        t tVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList2.get(size);
            if (bVar instanceof t) {
                t tVar2 = (t) bVar;
                if (tVar2.c == r.a.INDIVIDUALLY) {
                    tVar = tVar2;
                }
            }
        }
        if (tVar != null) {
            tVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof t) {
                t tVar3 = (t) bVar2;
                if (tVar3.c == r.a.INDIVIDUALLY) {
                    if (c0137a != null) {
                        arrayList.add(c0137a);
                    }
                    C0137a c0137a2 = new C0137a(tVar3);
                    tVar3.d(this);
                    c0137a = c0137a2;
                }
            }
            if (bVar2 instanceof l) {
                if (c0137a == null) {
                    c0137a = new C0137a(tVar);
                }
                c0137a.a.add((l) bVar2);
            }
        }
        if (c0137a != null) {
            arrayList.add(c0137a);
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, this);
    }

    @Override // com.amazon.aps.iva.ba.d
    public final void f(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i < arrayList.size()) {
                C0137a c0137a = (C0137a) arrayList.get(i);
                for (int i2 = 0; i2 < c0137a.a.size(); i2++) {
                    path.addPath(((l) c0137a.a.get(i2)).b(), matrix);
                }
                i++;
            } else {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float l = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - l, rectF2.top - l, rectF2.right + l, rectF2.bottom + l);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                z.s();
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ba.d
    public void h(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        float[] fArr;
        float floatValue;
        boolean z2;
        float f;
        float f2;
        float f3;
        BlurMaskFilter blurMaskFilter;
        a aVar = this;
        float[] fArr2 = com.amazon.aps.iva.ma.g.d.get();
        boolean z3 = false;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            z.s();
            return;
        }
        com.amazon.aps.iva.ca.f fVar = aVar.k;
        float l = (i / 255.0f) * fVar.l(fVar.b(), fVar.d());
        float f4 = 100.0f;
        PointF pointF = com.amazon.aps.iva.ma.f.a;
        int max = Math.max(0, Math.min(255, (int) ((l / 100.0f) * 255.0f)));
        com.amazon.aps.iva.aa.a aVar2 = aVar.i;
        aVar2.setAlpha(max);
        aVar2.setStrokeWidth(com.amazon.aps.iva.ma.g.d(matrix) * aVar.j.l());
        if (aVar2.getStrokeWidth() <= 0.0f) {
            z.s();
            return;
        }
        ArrayList arrayList = aVar.l;
        if (arrayList.isEmpty()) {
            z.s();
        } else {
            float d = com.amazon.aps.iva.ma.g.d(matrix);
            int i2 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = aVar.h;
                if (i2 >= size) {
                    break;
                }
                float floatValue2 = ((Float) ((com.amazon.aps.iva.ca.a) arrayList.get(i2)).f()).floatValue();
                fArr[i2] = floatValue2;
                if (i2 % 2 == 0) {
                    if (floatValue2 < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else if (floatValue2 < 0.1f) {
                    fArr[i2] = 0.1f;
                }
                fArr[i2] = fArr[i2] * d;
                i2++;
            }
            com.amazon.aps.iva.ca.d dVar = aVar.m;
            if (dVar == null) {
                floatValue = 0.0f;
            } else {
                floatValue = dVar.f().floatValue() * d;
            }
            aVar2.setPathEffect(new DashPathEffect(fArr, floatValue));
            z.s();
        }
        com.amazon.aps.iva.ca.r rVar = aVar.n;
        if (rVar != null) {
            aVar2.setColorFilter((ColorFilter) rVar.f());
        }
        com.amazon.aps.iva.ca.a<Float, Float> aVar3 = aVar.o;
        if (aVar3 != null) {
            float floatValue3 = aVar3.f().floatValue();
            if (floatValue3 == 0.0f) {
                aVar2.setMaskFilter(null);
            } else if (floatValue3 != aVar.p) {
                com.amazon.aps.iva.ia.b bVar = aVar.f;
                if (bVar.A == floatValue3) {
                    blurMaskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue3 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter2;
                    bVar.A = floatValue3;
                    blurMaskFilter = blurMaskFilter2;
                }
                aVar2.setMaskFilter(blurMaskFilter);
            }
            aVar.p = floatValue3;
        }
        com.amazon.aps.iva.ca.c cVar = aVar.q;
        if (cVar != null) {
            cVar.b(aVar2);
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = aVar.g;
            if (i3 < arrayList2.size()) {
                C0137a c0137a = (C0137a) arrayList2.get(i3);
                t tVar = c0137a.b;
                Path path = aVar.b;
                ArrayList arrayList3 = c0137a.a;
                if (tVar != null) {
                    path.reset();
                    int size2 = arrayList3.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        path.addPath(((l) arrayList3.get(size2)).b(), matrix);
                    }
                    t tVar2 = c0137a.b;
                    float floatValue4 = tVar2.d.f().floatValue() / f4;
                    float floatValue5 = tVar2.e.f().floatValue() / f4;
                    float floatValue6 = tVar2.f.f().floatValue() / 360.0f;
                    if (floatValue4 < 0.01f && floatValue5 > 0.99f) {
                        canvas.drawPath(path, aVar2);
                        z.s();
                    } else {
                        PathMeasure pathMeasure = aVar.a;
                        pathMeasure.setPath(path, z3);
                        float length = pathMeasure.getLength();
                        while (pathMeasure.nextContour()) {
                            length = pathMeasure.getLength() + length;
                        }
                        float f5 = floatValue6 * length;
                        float f6 = (floatValue4 * length) + f5;
                        float min = Math.min((floatValue5 * length) + f5, (f6 + length) - 1.0f);
                        int size3 = arrayList3.size() - 1;
                        float f7 = 0.0f;
                        while (size3 >= 0) {
                            Path path2 = aVar.c;
                            path2.set(((l) arrayList3.get(size3)).b());
                            path2.transform(matrix);
                            pathMeasure.setPath(path2, z3);
                            float length2 = pathMeasure.getLength();
                            if (min > length) {
                                float f8 = min - length;
                                if (f8 < f7 + length2 && f7 < f8) {
                                    if (f6 > length) {
                                        f3 = (f6 - length) / length2;
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    com.amazon.aps.iva.ma.g.a(path2, f3, Math.min(f8 / length2, 1.0f), 0.0f);
                                    canvas.drawPath(path2, aVar2);
                                    f7 += length2;
                                    size3--;
                                    aVar = this;
                                    z3 = false;
                                }
                            }
                            float f9 = f7 + length2;
                            if (f9 >= f6 && f7 <= min) {
                                if (f9 <= min && f6 < f7) {
                                    canvas.drawPath(path2, aVar2);
                                } else {
                                    if (f6 < f7) {
                                        f = 0.0f;
                                    } else {
                                        f = (f6 - f7) / length2;
                                    }
                                    if (min > f9) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = (min - f7) / length2;
                                    }
                                    com.amazon.aps.iva.ma.g.a(path2, f, f2, 0.0f);
                                    canvas.drawPath(path2, aVar2);
                                }
                            }
                            f7 += length2;
                            size3--;
                            aVar = this;
                            z3 = false;
                        }
                        z.s();
                    }
                    z2 = true;
                } else {
                    path.reset();
                    z2 = true;
                    for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                        path.addPath(((l) arrayList3.get(size4)).b(), matrix);
                    }
                    z.s();
                    canvas.drawPath(path, aVar2);
                    z.s();
                }
                i3++;
                aVar = this;
                z3 = false;
                f4 = 100.0f;
            } else {
                z.s();
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (obj == h0.d) {
            this.k.k(cVar);
        } else if (obj == h0.s) {
            this.j.k(cVar);
        } else {
            ColorFilter colorFilter = h0.K;
            com.amazon.aps.iva.ia.b bVar = this.f;
            if (obj == colorFilter) {
                com.amazon.aps.iva.ca.r rVar = this.n;
                if (rVar != null) {
                    bVar.q(rVar);
                }
                if (cVar == null) {
                    this.n = null;
                    return;
                }
                com.amazon.aps.iva.ca.r rVar2 = new com.amazon.aps.iva.ca.r(cVar, null);
                this.n = rVar2;
                rVar2.a(this);
                bVar.g(this.n);
            } else if (obj == h0.j) {
                com.amazon.aps.iva.ca.a<Float, Float> aVar = this.o;
                if (aVar != null) {
                    aVar.k(cVar);
                    return;
                }
                com.amazon.aps.iva.ca.r rVar3 = new com.amazon.aps.iva.ca.r(cVar, null);
                this.o = rVar3;
                rVar3.a(this);
                bVar.g(this.o);
            } else {
                Integer num = h0.e;
                com.amazon.aps.iva.ca.c cVar2 = this.q;
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
    }
}
