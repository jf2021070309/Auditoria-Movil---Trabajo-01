package com.amazon.aps.iva.ba;

import android.graphics.Path;
import android.graphics.PointF;
import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.ha.i;
import com.amazon.aps.iva.ha.r;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.z9.d0;
import com.amazon.aps.iva.z9.h0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public final class m implements l, a.InterfaceC0165a, j {
    public final String b;
    public final d0 c;
    public final i.a d;
    public final boolean e;
    public final boolean f;
    public final com.amazon.aps.iva.ca.d g;
    public final com.amazon.aps.iva.ca.a<?, PointF> h;
    public final com.amazon.aps.iva.ca.d i;
    public final com.amazon.aps.iva.ca.d j;
    public final com.amazon.aps.iva.ca.d k;
    public final com.amazon.aps.iva.ca.d l;
    public final com.amazon.aps.iva.ca.d m;
    public boolean o;
    public final Path a = new Path();
    public final i0 n = new i0();

    /* compiled from: PolystarContent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.a.values().length];
            a = iArr;
            try {
                iArr[i.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public m(d0 d0Var, com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.i iVar) {
        this.c = d0Var;
        this.b = iVar.a;
        i.a aVar = iVar.b;
        this.d = aVar;
        this.e = iVar.j;
        this.f = iVar.k;
        com.amazon.aps.iva.ca.a<?, ?> d = iVar.c.d();
        this.g = (com.amazon.aps.iva.ca.d) d;
        com.amazon.aps.iva.ca.a<PointF, PointF> d2 = iVar.d.d();
        this.h = d2;
        com.amazon.aps.iva.ca.a<?, ?> d3 = iVar.e.d();
        this.i = (com.amazon.aps.iva.ca.d) d3;
        com.amazon.aps.iva.ca.a<?, ?> d4 = iVar.g.d();
        this.k = (com.amazon.aps.iva.ca.d) d4;
        com.amazon.aps.iva.ca.a<?, ?> d5 = iVar.i.d();
        this.m = (com.amazon.aps.iva.ca.d) d5;
        i.a aVar2 = i.a.STAR;
        if (aVar == aVar2) {
            this.j = (com.amazon.aps.iva.ca.d) iVar.f.d();
            this.l = (com.amazon.aps.iva.ca.d) iVar.h.d();
        } else {
            this.j = null;
            this.l = null;
        }
        bVar.g(d);
        bVar.g(d2);
        bVar.g(d3);
        bVar.g(d4);
        bVar.g(d5);
        if (aVar == aVar2) {
            bVar.g(this.j);
            bVar.g(this.l);
        }
        d.a(this);
        d2.a(this);
        d3.a(this);
        d4.a(this);
        d5.a(this);
        if (aVar == aVar2) {
            this.j.a(this);
            this.l.a(this);
        }
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        this.o = false;
        this.c.invalidateSelf();
    }

    @Override // com.amazon.aps.iva.ba.l
    public final Path b() {
        double floatValue;
        float f;
        float f2;
        float f3;
        float cos;
        float f4;
        double d;
        float f5;
        Path path;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Path path2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        double floatValue2;
        int i;
        com.amazon.aps.iva.ca.a<?, PointF> aVar;
        double d2;
        double d3;
        float f19;
        double d4;
        boolean z = this.o;
        Path path3 = this.a;
        if (z) {
            return path3;
        }
        path3.reset();
        if (this.e) {
            this.o = true;
            return path3;
        }
        int i2 = a.a[this.d.ordinal()];
        com.amazon.aps.iva.ca.a<?, PointF> aVar2 = this.h;
        com.amazon.aps.iva.ca.d dVar = this.m;
        com.amazon.aps.iva.ca.d dVar2 = this.k;
        com.amazon.aps.iva.ca.d dVar3 = this.i;
        com.amazon.aps.iva.ca.d dVar4 = this.g;
        if (i2 != 1) {
            if (i2 == 2) {
                int floor = (int) Math.floor(dVar4.f().floatValue());
                if (dVar3 == null) {
                    floatValue2 = 0.0d;
                } else {
                    floatValue2 = dVar3.f().floatValue();
                }
                double radians = Math.toRadians(floatValue2 - 90.0d);
                double d5 = floor;
                float floatValue3 = dVar.f().floatValue() / 100.0f;
                float floatValue4 = dVar2.f().floatValue();
                double d6 = floatValue4;
                float cos2 = (float) (Math.cos(radians) * d6);
                float sin = (float) (Math.sin(radians) * d6);
                path3.moveTo(cos2, sin);
                double d7 = (float) (6.283185307179586d / d5);
                double d8 = radians + d7;
                double ceil = Math.ceil(d5);
                int i3 = 0;
                double d9 = d7;
                while (i3 < ceil) {
                    float cos3 = (float) (Math.cos(d8) * d6);
                    float sin2 = (float) (Math.sin(d8) * d6);
                    if (floatValue3 != 0.0f) {
                        double d10 = d6;
                        i = i3;
                        double atan2 = (float) (Math.atan2(sin, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        aVar = aVar2;
                        d2 = d8;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f20 = floatValue4 * floatValue3 * 0.25f;
                        d3 = d9;
                        f19 = sin2;
                        d4 = d10;
                        path3.cubicTo(cos2 - (cos4 * f20), sin - (((float) Math.sin(atan2)) * f20), (((float) Math.cos(atan22)) * f20) + cos3, (f20 * ((float) Math.sin(atan22))) + sin2, cos3, f19);
                    } else {
                        i = i3;
                        aVar = aVar2;
                        d2 = d8;
                        d3 = d9;
                        f19 = sin2;
                        d4 = d6;
                        path3.lineTo(cos3, f19);
                    }
                    double d11 = d2 + d3;
                    sin = f19;
                    d6 = d4;
                    d9 = d3;
                    aVar2 = aVar;
                    d8 = d11;
                    cos2 = cos3;
                    i3 = i + 1;
                }
                PointF f21 = aVar2.f();
                path3.offset(f21.x, f21.y);
                path3.close();
            }
            path = path3;
        } else {
            com.amazon.aps.iva.ca.a<?, PointF> aVar3 = aVar2;
            float floatValue5 = dVar4.f().floatValue();
            if (dVar3 == null) {
                floatValue = 0.0d;
            } else {
                floatValue = dVar3.f().floatValue();
            }
            double radians2 = Math.toRadians(floatValue - 90.0d);
            double d12 = floatValue5;
            float f22 = (float) (6.283185307179586d / d12);
            if (this.f) {
                f22 *= -1.0f;
            }
            float f23 = f22;
            float f24 = f23 / 2.0f;
            float f25 = floatValue5 - ((int) floatValue5);
            int i4 = (f25 > 0.0f ? 1 : (f25 == 0.0f ? 0 : -1));
            if (i4 != 0) {
                radians2 += (1.0f - f25) * f24;
            }
            float floatValue6 = dVar2.f().floatValue();
            float floatValue7 = this.j.f().floatValue();
            com.amazon.aps.iva.ca.d dVar5 = this.l;
            if (dVar5 != null) {
                f = dVar5.f().floatValue() / 100.0f;
            } else {
                f = 0.0f;
            }
            if (dVar != null) {
                f2 = dVar.f().floatValue() / 100.0f;
            } else {
                f2 = 0.0f;
            }
            if (i4 != 0) {
                float a2 = t0.a(floatValue6, floatValue7, f25, floatValue7);
                double d13 = a2;
                f3 = floatValue7;
                cos = (float) (Math.cos(radians2) * d13);
                float sin3 = (float) (d13 * Math.sin(radians2));
                path3.moveTo(cos, sin3);
                f4 = sin3;
                d = radians2 + ((f23 * f25) / 2.0f);
                f5 = a2;
            } else {
                f3 = floatValue7;
                double d14 = floatValue6;
                cos = (float) (Math.cos(radians2) * d14);
                float sin4 = (float) (d14 * Math.sin(radians2));
                path3.moveTo(cos, sin4);
                f4 = sin4;
                d = radians2 + f24;
                f5 = 0.0f;
            }
            double ceil2 = Math.ceil(d12) * 2.0d;
            int i5 = 0;
            double d15 = 2.0d;
            double d16 = d;
            boolean z2 = false;
            float f26 = floatValue6;
            while (true) {
                double d17 = i5;
                if (d17 >= ceil2) {
                    break;
                }
                if (z2) {
                    f6 = f26;
                } else {
                    f6 = f3;
                }
                int i6 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                if (i6 != 0 && d17 == ceil2 - d15) {
                    f7 = f5;
                    f8 = (f23 * f25) / 2.0f;
                } else {
                    f7 = f5;
                    f8 = f24;
                }
                if (i6 != 0 && d17 == ceil2 - 1.0d) {
                    f9 = f23;
                    f6 = f7;
                } else {
                    f9 = f23;
                }
                double d18 = f6;
                com.amazon.aps.iva.ca.a<?, PointF> aVar4 = aVar3;
                float cos5 = (float) (Math.cos(d16) * d18);
                float sin5 = (float) (d18 * Math.sin(d16));
                if (f == 0.0f && f2 == 0.0f) {
                    path3.lineTo(cos5, sin5);
                    f17 = f24;
                    path2 = path3;
                    f18 = f8;
                    f10 = sin5;
                    f16 = f26;
                    f15 = f3;
                } else {
                    float f27 = f24;
                    float f28 = f4;
                    double atan23 = (float) (Math.atan2(f4, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    float f29 = f8;
                    f10 = sin5;
                    path2 = path3;
                    double atan24 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    if (z2) {
                        f11 = f;
                    } else {
                        f11 = f2;
                    }
                    if (z2) {
                        f12 = f2;
                    } else {
                        f12 = f;
                    }
                    if (z2) {
                        f13 = f3;
                    } else {
                        f13 = f26;
                    }
                    if (z2) {
                        f14 = f26;
                    } else {
                        f14 = f3;
                    }
                    float f30 = f13 * f11 * 0.47829f;
                    float f31 = cos6 * f30;
                    float f32 = f30 * sin6;
                    float f33 = f14 * f12 * 0.47829f;
                    float f34 = cos7 * f33;
                    float f35 = f33 * sin7;
                    if (i4 != 0) {
                        if (i5 == 0) {
                            f31 *= f25;
                            f32 *= f25;
                        } else if (d17 == ceil2 - 1.0d) {
                            f34 *= f25;
                            f35 *= f25;
                        }
                    }
                    f15 = f3;
                    f16 = f26;
                    f17 = f27;
                    path2.cubicTo(cos - f31, f28 - f32, cos5 + f34, f10 + f35, cos5, f10);
                    f18 = f29;
                }
                d16 += f18;
                z2 = !z2;
                i5++;
                cos = cos5;
                f3 = f15;
                f26 = f16;
                f24 = f17;
                f5 = f7;
                f23 = f9;
                aVar3 = aVar4;
                path3 = path2;
                d15 = 2.0d;
                f4 = f10;
            }
            PointF f36 = aVar3.f();
            path = path3;
            path.offset(f36.x, f36.y);
            path.close();
        }
        path.close();
        this.n.a(path);
        this.o = true;
        return path;
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                b bVar = (b) arrayList.get(i);
                if (bVar instanceof t) {
                    t tVar = (t) bVar;
                    if (tVar.c == r.a.SIMULTANEOUSLY) {
                        ((List) this.n.b).add(tVar);
                        tVar.d(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void d(com.amazon.aps.iva.fa.e eVar, int i, ArrayList arrayList, com.amazon.aps.iva.fa.e eVar2) {
        com.amazon.aps.iva.ma.f.d(eVar, i, arrayList, eVar2, this);
    }

    @Override // com.amazon.aps.iva.ba.b
    public final String getName() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.fa.f
    public final void i(com.amazon.aps.iva.na.c cVar, Object obj) {
        com.amazon.aps.iva.ca.d dVar;
        com.amazon.aps.iva.ca.d dVar2;
        if (obj == h0.w) {
            this.g.k(cVar);
        } else if (obj == h0.x) {
            this.i.k(cVar);
        } else if (obj == h0.n) {
            this.h.k(cVar);
        } else if (obj == h0.y && (dVar2 = this.j) != null) {
            dVar2.k(cVar);
        } else if (obj == h0.z) {
            this.k.k(cVar);
        } else if (obj == h0.A && (dVar = this.l) != null) {
            dVar.k(cVar);
        } else if (obj == h0.B) {
            this.m.k(cVar);
        }
    }
}
