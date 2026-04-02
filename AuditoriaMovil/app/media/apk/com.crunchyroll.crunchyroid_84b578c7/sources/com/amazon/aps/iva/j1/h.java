package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.f1.m0;
import com.amazon.aps.iva.j1.f;
import java.util.List;
/* compiled from: PathParser.kt */
/* loaded from: classes.dex */
public final class h {
    public static final void a(m0 m0Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        boolean z3;
        double d8;
        double d9;
        boolean z4;
        double d10 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d2 * sin) + (d * cos)) / d5;
        double d12 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d13 = ((d4 * sin) + (d3 * cos)) / d5;
        double d14 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d16 * d16) + (d15 * d15);
        if (d20 == 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(m0Var, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d15 * sqrt2;
        double d23 = sqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d12 - d9, d11 - d8);
        double atan22 = Math.atan2(d14 - d9, d13 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 != z4) {
            if (i > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d24 = d5;
        double d25 = d8 * d24;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        double d29 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d29) / 3.141592653589793d));
        double cos2 = Math.cos(d10);
        double sin2 = Math.sin(d10);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d24;
        double d31 = d30 * cos2;
        double d32 = d6 * sin2;
        double d33 = d30 * sin2;
        double d34 = d6 * cos2;
        double d35 = atan22 / ceil;
        double d36 = d;
        double d37 = d2;
        double d38 = (cos3 * d34) + (sin3 * d33);
        double d39 = (d31 * sin3) - (d32 * cos3);
        int i2 = 0;
        double d40 = atan2;
        while (i2 < ceil) {
            double d41 = d40 + d35;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            double d42 = d35;
            double d43 = (((d24 * cos2) * cos4) + d27) - (d32 * sin4);
            double d44 = sin2;
            double d45 = (d34 * sin4) + (d24 * sin2 * cos4) + d28;
            double d46 = (d31 * sin4) - (d32 * cos4);
            double d47 = (cos4 * d34) + (sin4 * d33);
            double d48 = d41 - d40;
            double tan = Math.tan(d48 / d17);
            double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d29) - 1) * Math.sin(d48)) / 3;
            m0Var.l((float) ((d39 * sqrt3) + d36), (float) ((d38 * sqrt3) + d37), (float) (d43 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d43, (float) d45);
            i2++;
            ceil = ceil;
            d24 = d5;
            d33 = d33;
            d36 = d43;
            d37 = d45;
            d40 = d41;
            d38 = d47;
            d39 = d46;
            d17 = d17;
            d35 = d42;
            sin2 = d44;
        }
    }

    public static final void b(List list, m0 m0Var) {
        f fVar;
        int i;
        f fVar2;
        int i2;
        int i3;
        float f;
        f fVar3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        List list2 = list;
        m0 m0Var2 = m0Var;
        com.amazon.aps.iva.yb0.j.f(list2, "<this>");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "target");
        int g = m0Var.g();
        m0Var.i();
        m0Var2.f(g);
        if (list.isEmpty()) {
            fVar = f.b.c;
        } else {
            fVar = (f) list2.get(0);
        }
        int size = list.size();
        float f26 = 0.0f;
        int i4 = 0;
        float f27 = 0.0f;
        float f28 = 0.0f;
        float f29 = 0.0f;
        float f30 = 0.0f;
        float f31 = 0.0f;
        float f32 = 0.0f;
        while (i4 < size) {
            f fVar4 = (f) list2.get(i4);
            if (fVar4 instanceof f.b) {
                m0Var.close();
                m0Var2.j(f31, f32);
                f24 = f31;
                f23 = f24;
                f25 = f32;
                f17 = f25;
            } else if (fVar4 instanceof f.n) {
                f.n nVar = (f.n) fVar4;
                float f33 = nVar.c;
                float f34 = nVar.d;
                float f35 = f30 + f34;
                m0Var2.b(f33, f34);
                f24 = f29 + f33;
                f17 = f35;
                f31 = f27;
                f23 = f24;
                f32 = f28;
                f25 = f17;
            } else {
                if (fVar4 instanceof f.C0395f) {
                    f.C0395f c0395f = (f.C0395f) fVar4;
                    f20 = c0395f.c;
                    f18 = c0395f.d;
                    m0Var2.j(f20, f18);
                    f19 = f20;
                    f17 = f18;
                } else {
                    if (fVar4 instanceof f.m) {
                        f.m mVar = (f.m) fVar4;
                        float f36 = mVar.c;
                        f21 = mVar.d;
                        m0Var2.m(f36, f21);
                        f29 += mVar.c;
                    } else {
                        if (fVar4 instanceof f.e) {
                            f.e eVar = (f.e) fVar4;
                            float f37 = eVar.c;
                            float f38 = eVar.d;
                            m0Var2.n(f37, f38);
                            f22 = eVar.c;
                            f17 = f32;
                            f18 = f38;
                        } else if (fVar4 instanceof f.l) {
                            f.l lVar = (f.l) fVar4;
                            m0Var2.m(lVar.c, f26);
                            f29 += lVar.c;
                            f19 = f31;
                            f17 = f32;
                            f20 = f29;
                            f18 = f30;
                        } else if (fVar4 instanceof f.d) {
                            f.d dVar = (f.d) fVar4;
                            m0Var2.n(dVar.c, f30);
                            f22 = dVar.c;
                            f17 = f32;
                            f18 = f30;
                        } else if (fVar4 instanceof f.r) {
                            f.r rVar = (f.r) fVar4;
                            m0Var2.m(f26, rVar.c);
                            f21 = rVar.c;
                        } else if (fVar4 instanceof f.s) {
                            f.s sVar = (f.s) fVar4;
                            m0Var2.n(f29, sVar.c);
                            f17 = f32;
                            f18 = sVar.c;
                            f19 = f31;
                            f20 = f29;
                        } else {
                            if (fVar4 instanceof f.k) {
                                f.k kVar = (f.k) fVar4;
                                i = size;
                                fVar2 = fVar4;
                                m0Var.c(kVar.c, kVar.d, kVar.e, kVar.f, kVar.g, kVar.h);
                                f10 = kVar.e + f29;
                                f11 = kVar.f + f30;
                                f29 += kVar.g;
                                f16 = kVar.h;
                            } else {
                                i = size;
                                fVar2 = fVar4;
                                if (fVar2 instanceof f.c) {
                                    f.c cVar = (f.c) fVar2;
                                    m0Var.l(cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h);
                                    f10 = cVar.e;
                                    f11 = cVar.f;
                                    f12 = cVar.g;
                                    f13 = cVar.h;
                                } else if (fVar2 instanceof f.p) {
                                    if (fVar.a) {
                                        f14 = f29 - f27;
                                        f15 = f30 - f28;
                                    } else {
                                        f14 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    f.p pVar = (f.p) fVar2;
                                    m0Var.c(f14, f15, pVar.c, pVar.d, pVar.e, pVar.f);
                                    f10 = pVar.c + f29;
                                    f11 = pVar.d + f30;
                                    f29 += pVar.e;
                                    f16 = pVar.f;
                                } else if (fVar2 instanceof f.h) {
                                    if (fVar.a) {
                                        float f39 = 2;
                                        f9 = (f39 * f30) - f28;
                                        f8 = (f29 * f39) - f27;
                                    } else {
                                        f8 = f29;
                                        f9 = f30;
                                    }
                                    f.h hVar = (f.h) fVar2;
                                    m0Var.l(f8, f9, hVar.c, hVar.d, hVar.e, hVar.f);
                                    f10 = hVar.c;
                                    f11 = hVar.d;
                                    f12 = hVar.e;
                                    f13 = hVar.f;
                                } else {
                                    if (fVar2 instanceof f.o) {
                                        f.o oVar = (f.o) fVar2;
                                        float f40 = oVar.c;
                                        float f41 = oVar.d;
                                        f7 = oVar.e;
                                        f4 = oVar.f;
                                        m0Var2.e(f40, f41, f7, f4);
                                        f5 = oVar.c + f29;
                                        f6 = f41 + f30;
                                    } else {
                                        if (fVar2 instanceof f.g) {
                                            f.g gVar = (f.g) fVar2;
                                            float f42 = gVar.c;
                                            float f43 = gVar.d;
                                            float f44 = gVar.e;
                                            float f45 = gVar.f;
                                            m0Var2.d(f42, f43, f44, f45);
                                            f29 = f44;
                                            f30 = f45;
                                            i2 = i4;
                                            fVar3 = fVar2;
                                            i3 = i;
                                            f = 0.0f;
                                            f27 = gVar.c;
                                            f28 = f43;
                                        } else if (fVar2 instanceof f.q) {
                                            if (fVar.b) {
                                                f2 = f29 - f27;
                                                f3 = f30 - f28;
                                            } else {
                                                f2 = 0.0f;
                                                f3 = 0.0f;
                                            }
                                            f.q qVar = (f.q) fVar2;
                                            float f46 = qVar.c;
                                            f4 = qVar.d;
                                            m0Var2.e(f2, f3, f46, f4);
                                            f5 = f2 + f29;
                                            f6 = f3 + f30;
                                            f7 = qVar.c;
                                        } else if (fVar2 instanceof f.i) {
                                            if (fVar.b) {
                                                float f47 = 2;
                                                f29 = (f29 * f47) - f27;
                                                f30 = (f47 * f30) - f28;
                                            }
                                            f.i iVar = (f.i) fVar2;
                                            float f48 = iVar.c;
                                            float f49 = iVar.d;
                                            m0Var2.d(f29, f30, f48, f49);
                                            f27 = f29;
                                            f28 = f30;
                                            i2 = i4;
                                            fVar3 = fVar2;
                                            i3 = i;
                                            f = 0.0f;
                                            f29 = iVar.c;
                                            f30 = f49;
                                        } else if (fVar2 instanceof f.j) {
                                            f.j jVar = (f.j) fVar2;
                                            float f50 = jVar.h + f29;
                                            float f51 = jVar.i + f30;
                                            i2 = i4;
                                            f = 0.0f;
                                            i3 = i;
                                            fVar3 = fVar2;
                                            a(m0Var, f29, f30, f50, f51, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g);
                                            f27 = f50;
                                            f29 = f27;
                                            f31 = f31;
                                            f32 = f32;
                                            f28 = f51;
                                            f30 = f28;
                                        } else {
                                            float f52 = f31;
                                            float f53 = f32;
                                            i2 = i4;
                                            i3 = i;
                                            f = 0.0f;
                                            if (fVar2 instanceof f.a) {
                                                f.a aVar = (f.a) fVar2;
                                                float f54 = aVar.i;
                                                fVar3 = fVar2;
                                                a(m0Var, f29, f30, aVar.h, f54, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
                                                f29 = aVar.h;
                                                f27 = f29;
                                                f28 = f54;
                                                f30 = f28;
                                            } else {
                                                fVar3 = fVar2;
                                            }
                                            f31 = f52;
                                            f32 = f53;
                                        }
                                        i4 = i2 + 1;
                                        list2 = list;
                                        m0Var2 = m0Var;
                                        f26 = f;
                                        size = i3;
                                        fVar = fVar3;
                                    }
                                    f29 += f7;
                                    f30 += f4;
                                    f27 = f5;
                                    f28 = f6;
                                    i2 = i4;
                                    fVar3 = fVar2;
                                    i3 = i;
                                    f = 0.0f;
                                    i4 = i2 + 1;
                                    list2 = list;
                                    m0Var2 = m0Var;
                                    f26 = f;
                                    size = i3;
                                    fVar = fVar3;
                                }
                                f30 = f13;
                                f29 = f12;
                                f28 = f11;
                                i2 = i4;
                                fVar3 = fVar2;
                                i3 = i;
                                f = 0.0f;
                                f27 = f10;
                                i4 = i2 + 1;
                                list2 = list;
                                m0Var2 = m0Var;
                                f26 = f;
                                size = i3;
                                fVar = fVar3;
                            }
                            f30 += f16;
                            f28 = f11;
                            i2 = i4;
                            fVar3 = fVar2;
                            i3 = i;
                            f = 0.0f;
                            f27 = f10;
                            i4 = i2 + 1;
                            list2 = list;
                            m0Var2 = m0Var;
                            f26 = f;
                            size = i3;
                            fVar = fVar3;
                        }
                        float f55 = f31;
                        f20 = f22;
                        f19 = f55;
                    }
                    f30 += f21;
                    f19 = f31;
                    f17 = f32;
                    f20 = f29;
                    f18 = f30;
                }
                float f56 = f27;
                f23 = f19;
                f24 = f20;
                f31 = f56;
                float f57 = f18;
                f32 = f28;
                f25 = f57;
            }
            f29 = f24;
            f30 = f25;
            fVar3 = fVar4;
            f28 = f32;
            f = f26;
            i2 = i4;
            i3 = size;
            f32 = f17;
            float f58 = f31;
            f31 = f23;
            f27 = f58;
            i4 = i2 + 1;
            list2 = list;
            m0Var2 = m0Var;
            f26 = f;
            size = i3;
            fVar = fVar3;
        }
    }
}
