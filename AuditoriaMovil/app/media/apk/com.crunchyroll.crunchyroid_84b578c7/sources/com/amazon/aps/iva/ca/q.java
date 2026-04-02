package com.amazon.aps.iva.ca;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.k.w;
import com.amazon.aps.iva.z9.h0;
import java.util.Collections;
/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class q {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public a<PointF, PointF> f;
    public a<?, PointF> g;
    public a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> h;
    public a<Float, Float> i;
    public a<Integer, Integer> j;
    public d k;
    public d l;
    public a<?, Float> m;
    public a<?, Float> n;

    public q(com.amazon.aps.iva.ga.k kVar) {
        a<PointF, PointF> d;
        a<PointF, PointF> d2;
        a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> d3;
        a<Float, Float> d4;
        d dVar;
        d dVar2;
        w wVar = kVar.a;
        if (wVar == null) {
            d = null;
        } else {
            d = wVar.d();
        }
        this.f = d;
        com.amazon.aps.iva.ga.l<PointF, PointF> lVar = kVar.b;
        if (lVar == null) {
            d2 = null;
        } else {
            d2 = lVar.d();
        }
        this.g = d2;
        com.amazon.aps.iva.ga.f fVar = kVar.c;
        if (fVar == null) {
            d3 = null;
        } else {
            d3 = fVar.d();
        }
        this.h = d3;
        com.amazon.aps.iva.ga.b bVar = kVar.d;
        if (bVar == null) {
            d4 = null;
        } else {
            d4 = bVar.d();
        }
        this.i = d4;
        com.amazon.aps.iva.ga.b bVar2 = kVar.f;
        if (bVar2 == null) {
            dVar = null;
        } else {
            dVar = (d) bVar2.d();
        }
        this.k = dVar;
        if (dVar != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        com.amazon.aps.iva.ga.b bVar3 = kVar.g;
        if (bVar3 == null) {
            dVar2 = null;
        } else {
            dVar2 = (d) bVar3.d();
        }
        this.l = dVar2;
        com.amazon.aps.iva.ga.d dVar3 = kVar.e;
        if (dVar3 != null) {
            this.j = dVar3.d();
        }
        com.amazon.aps.iva.ga.b bVar4 = kVar.h;
        if (bVar4 != null) {
            this.m = bVar4.d();
        } else {
            this.m = null;
        }
        com.amazon.aps.iva.ga.b bVar5 = kVar.i;
        if (bVar5 != null) {
            this.n = bVar5.d();
        } else {
            this.n = null;
        }
    }

    public final void a(com.amazon.aps.iva.ia.b bVar) {
        bVar.g(this.j);
        bVar.g(this.m);
        bVar.g(this.n);
        bVar.g(this.f);
        bVar.g(this.g);
        bVar.g(this.h);
        bVar.g(this.i);
        bVar.g(this.k);
        bVar.g(this.l);
    }

    public final void b(a.InterfaceC0165a interfaceC0165a) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a(interfaceC0165a);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0165a);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0165a);
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0165a);
        }
        a<?, PointF> aVar5 = this.g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0165a);
        }
        a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> aVar6 = this.h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0165a);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0165a);
        }
        d dVar = this.k;
        if (dVar != null) {
            dVar.a(interfaceC0165a);
        }
        d dVar2 = this.l;
        if (dVar2 != null) {
            dVar2.a(interfaceC0165a);
        }
    }

    public final boolean c(com.amazon.aps.iva.na.c cVar, Object obj) {
        if (obj == h0.f) {
            a<PointF, PointF> aVar = this.f;
            if (aVar == null) {
                this.f = new r(cVar, new PointF());
                return true;
            }
            aVar.k(cVar);
            return true;
        } else if (obj == h0.g) {
            a<?, PointF> aVar2 = this.g;
            if (aVar2 == null) {
                this.g = new r(cVar, new PointF());
                return true;
            }
            aVar2.k(cVar);
            return true;
        } else {
            if (obj == h0.h) {
                a<?, PointF> aVar3 = this.g;
                if (aVar3 instanceof n) {
                    n nVar = (n) aVar3;
                    com.amazon.aps.iva.na.c<Float> cVar2 = nVar.m;
                    nVar.m = cVar;
                    return true;
                }
            }
            if (obj == h0.i) {
                a<?, PointF> aVar4 = this.g;
                if (aVar4 instanceof n) {
                    n nVar2 = (n) aVar4;
                    com.amazon.aps.iva.na.c<Float> cVar3 = nVar2.n;
                    nVar2.n = cVar;
                    return true;
                }
            }
            if (obj == h0.o) {
                a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> aVar5 = this.h;
                if (aVar5 == null) {
                    this.h = new r(cVar, new com.amazon.aps.iva.na.d());
                    return true;
                }
                aVar5.k(cVar);
                return true;
            } else if (obj == h0.p) {
                a<Float, Float> aVar6 = this.i;
                if (aVar6 == null) {
                    this.i = new r(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.k(cVar);
                return true;
            } else if (obj == h0.c) {
                a<Integer, Integer> aVar7 = this.j;
                if (aVar7 == null) {
                    this.j = new r(cVar, 100);
                    return true;
                }
                aVar7.k(cVar);
                return true;
            } else if (obj == h0.C) {
                a<?, Float> aVar8 = this.m;
                if (aVar8 == null) {
                    this.m = new r(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.k(cVar);
                return true;
            } else if (obj == h0.D) {
                a<?, Float> aVar9 = this.n;
                if (aVar9 == null) {
                    this.n = new r(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.k(cVar);
                return true;
            } else if (obj == h0.q) {
                if (this.k == null) {
                    this.k = new d(Collections.singletonList(new com.amazon.aps.iva.na.a(Float.valueOf(0.0f))));
                }
                this.k.k(cVar);
                return true;
            } else if (obj == h0.r) {
                if (this.l == null) {
                    this.l = new d(Collections.singletonList(new com.amazon.aps.iva.na.a(Float.valueOf(0.0f))));
                }
                this.l.k(cVar);
                return true;
            } else {
                return false;
            }
        }
    }

    public final Matrix d() {
        d dVar;
        PointF f;
        d dVar2;
        float cos;
        d dVar3;
        float sin;
        float[] fArr;
        float l;
        PointF f2;
        Matrix matrix = this.a;
        matrix.reset();
        a<?, PointF> aVar = this.g;
        if (aVar != null && (f2 = aVar.f()) != null) {
            float f3 = f2.x;
            if (f3 != 0.0f || f2.y != 0.0f) {
                matrix.preTranslate(f3, f2.y);
            }
        }
        a<Float, Float> aVar2 = this.i;
        if (aVar2 != null) {
            if (aVar2 instanceof r) {
                l = aVar2.f().floatValue();
            } else {
                l = ((d) aVar2).l();
            }
            if (l != 0.0f) {
                matrix.preRotate(l);
            }
        }
        if (this.k != null) {
            if (this.l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-dVar2.l()) + 90.0f));
            }
            if (this.l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-dVar3.l()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(dVar.l()));
            int i = 0;
            while (true) {
                fArr = this.e;
                if (i >= 9) {
                    break;
                }
                fArr[i] = 0.0f;
                i++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f4 = -sin;
            fArr[3] = f4;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                fArr[i2] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            for (int i3 = 0; i3 < 9; i3++) {
                fArr[i3] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f4;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> aVar3 = this.h;
        if (aVar3 != null) {
            com.amazon.aps.iva.na.d f5 = aVar3.f();
            float f6 = f5.a;
            if (f6 != 1.0f || f5.b != 1.0f) {
                matrix.preScale(f6, f5.b);
            }
        }
        a<PointF, PointF> aVar4 = this.f;
        if (aVar4 != null && (((f = aVar4.f()) != null && f.x != 0.0f) || f.y != 0.0f)) {
            matrix.preTranslate(-f.x, -f.y);
        }
        return matrix;
    }

    public final Matrix e(float f) {
        PointF f2;
        com.amazon.aps.iva.na.d f3;
        float f4;
        a<?, PointF> aVar = this.g;
        PointF pointF = null;
        if (aVar == null) {
            f2 = null;
        } else {
            f2 = aVar.f();
        }
        a<com.amazon.aps.iva.na.d, com.amazon.aps.iva.na.d> aVar2 = this.h;
        if (aVar2 == null) {
            f3 = null;
        } else {
            f3 = aVar2.f();
        }
        Matrix matrix = this.a;
        matrix.reset();
        if (f2 != null) {
            matrix.preTranslate(f2.x * f, f2.y * f);
        }
        if (f3 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(f3.a, d), (float) Math.pow(f3.b, d));
        }
        a<Float, Float> aVar3 = this.i;
        if (aVar3 != null) {
            float floatValue = aVar3.f().floatValue();
            a<PointF, PointF> aVar4 = this.f;
            if (aVar4 != null) {
                pointF = aVar4.f();
            }
            float f5 = floatValue * f;
            float f6 = 0.0f;
            if (pointF == null) {
                f4 = 0.0f;
            } else {
                f4 = pointF.x;
            }
            if (pointF != null) {
                f6 = pointF.y;
            }
            matrix.preRotate(f5, f4, f6);
        }
        return matrix;
    }
}
