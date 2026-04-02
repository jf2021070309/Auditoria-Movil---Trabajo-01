package com.amazon.aps.iva.ka;

import android.graphics.Rect;
import com.amazon.aps.iva.ia.e;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public final class w {
    public static final c.a a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final c.a b = c.a.a("id", "layers", "w", "h", "p", "u");
    public static final c.a c = c.a.a("list");
    public static final c.a d = c.a.a("cm", "tm", "dr");

    public static com.amazon.aps.iva.z9.h a(com.amazon.aps.iva.la.d dVar) throws IOException {
        float f;
        HashMap hashMap;
        ArrayList arrayList;
        com.amazon.aps.iva.x.i<com.amazon.aps.iva.fa.d> iVar;
        int i;
        com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar;
        float f2;
        float f3;
        boolean z;
        int i2;
        float f4;
        com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar2;
        float f5;
        float f6;
        float f7;
        HashMap hashMap2;
        ArrayList arrayList2;
        com.amazon.aps.iva.x.i<com.amazon.aps.iva.fa.d> iVar2;
        float f8;
        float f9;
        com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar3;
        float c2 = com.amazon.aps.iva.ma.g.c();
        com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar4 = new com.amazon.aps.iva.x.f<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        com.amazon.aps.iva.x.i<com.amazon.aps.iva.fa.d> iVar3 = new com.amazon.aps.iva.x.i<>();
        com.amazon.aps.iva.z9.h hVar = new com.amazon.aps.iva.z9.h();
        dVar.c();
        int i3 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i4 = 0;
        while (dVar.k()) {
            float f13 = f10;
            switch (dVar.x(a)) {
                case 0:
                    f7 = c2;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    iVar2 = iVar3;
                    f8 = f11;
                    f9 = f12;
                    fVar3 = fVar4;
                    i4 = dVar.p();
                    fVar4 = fVar3;
                    f10 = f13;
                    c2 = f7;
                    f11 = f8;
                    arrayList4 = arrayList2;
                    f12 = f9;
                    hashMap5 = hashMap2;
                    iVar3 = iVar2;
                case 1:
                    f7 = c2;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    iVar2 = iVar3;
                    f8 = f11;
                    f9 = f12;
                    fVar3 = fVar4;
                    i3 = dVar.p();
                    fVar4 = fVar3;
                    f10 = f13;
                    c2 = f7;
                    f11 = f8;
                    arrayList4 = arrayList2;
                    f12 = f9;
                    hashMap5 = hashMap2;
                    iVar3 = iVar2;
                case 2:
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    fVar = fVar4;
                    f11 = (float) dVar.n();
                    f10 = f13;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 3:
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    fVar = fVar4;
                    f12 = ((float) dVar.n()) - 0.01f;
                    f10 = f13;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 4:
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    fVar = fVar4;
                    f10 = (float) dVar.n();
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 5:
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    f2 = f11;
                    f3 = f12;
                    fVar = fVar4;
                    String[] split = dVar.s().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || parseInt3 >= 0)))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        hVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 6:
                    f = c2;
                    com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar5 = fVar4;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    f2 = f11;
                    f3 = f12;
                    dVar.a();
                    int i5 = 0;
                    while (dVar.k()) {
                        com.amazon.aps.iva.ia.e a2 = v.a(dVar, hVar);
                        if (a2.e == e.a.IMAGE) {
                            i5++;
                        }
                        arrayList3.add(a2);
                        com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar6 = fVar5;
                        fVar6.f(a2.d, a2);
                        if (i5 > 4) {
                            com.amazon.aps.iva.ma.c.b("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        fVar5 = fVar6;
                    }
                    fVar = fVar5;
                    dVar.f();
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 7:
                    arrayList = arrayList4;
                    f2 = f11;
                    f3 = f12;
                    dVar.a();
                    while (dVar.k()) {
                        ArrayList arrayList5 = new ArrayList();
                        com.amazon.aps.iva.x.f fVar7 = new com.amazon.aps.iva.x.f();
                        dVar.c();
                        HashMap hashMap6 = hashMap5;
                        String str = null;
                        String str2 = null;
                        int i6 = 0;
                        int i7 = 0;
                        while (dVar.k()) {
                            com.amazon.aps.iva.x.i<com.amazon.aps.iva.fa.d> iVar4 = iVar3;
                            int x = dVar.x(b);
                            if (x != 0) {
                                i2 = i3;
                                if (x != 1) {
                                    if (x != 2) {
                                        if (x != 3) {
                                            if (x != 4) {
                                                if (x != 5) {
                                                    dVar.y();
                                                    dVar.A();
                                                    f4 = c2;
                                                    fVar2 = fVar4;
                                                } else {
                                                    dVar.s();
                                                }
                                            } else {
                                                str2 = dVar.s();
                                            }
                                        } else {
                                            i7 = dVar.p();
                                        }
                                    } else {
                                        i6 = dVar.p();
                                    }
                                } else {
                                    dVar.a();
                                    while (dVar.k()) {
                                        com.amazon.aps.iva.ia.e a3 = v.a(dVar, hVar);
                                        fVar7.f(a3.d, a3);
                                        arrayList5.add(a3);
                                        c2 = c2;
                                        fVar4 = fVar4;
                                    }
                                    f4 = c2;
                                    fVar2 = fVar4;
                                    dVar.f();
                                }
                                c2 = f4;
                                iVar3 = iVar4;
                                i3 = i2;
                                fVar4 = fVar2;
                            } else {
                                i2 = i3;
                                str = dVar.s();
                            }
                            iVar3 = iVar4;
                            i3 = i2;
                        }
                        float f14 = c2;
                        com.amazon.aps.iva.x.f<com.amazon.aps.iva.ia.e> fVar8 = fVar4;
                        com.amazon.aps.iva.x.i<com.amazon.aps.iva.fa.d> iVar5 = iVar3;
                        int i8 = i3;
                        dVar.h();
                        if (str2 != null) {
                            hashMap4.put(str, new com.amazon.aps.iva.z9.e0(i6, i7, str, str2));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        c2 = f14;
                        hashMap5 = hashMap6;
                        iVar3 = iVar5;
                        i3 = i8;
                        fVar4 = fVar8;
                    }
                    f = c2;
                    hashMap = hashMap5;
                    iVar = iVar3;
                    i = i3;
                    dVar.f();
                    fVar = fVar4;
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 8:
                    f2 = f11;
                    f3 = f12;
                    dVar.c();
                    while (dVar.k()) {
                        if (dVar.x(c) != 0) {
                            dVar.y();
                            dVar.A();
                        } else {
                            dVar.a();
                            while (dVar.k()) {
                                c.a aVar = n.a;
                                dVar.c();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (dVar.k()) {
                                    int x2 = dVar.x(n.a);
                                    if (x2 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (x2 != 1) {
                                            if (x2 != 2) {
                                                if (x2 != 3) {
                                                    dVar.y();
                                                    dVar.A();
                                                } else {
                                                    dVar.n();
                                                }
                                            } else {
                                                str5 = dVar.s();
                                            }
                                        } else {
                                            str4 = dVar.s();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str3 = dVar.s();
                                    }
                                }
                                dVar.h();
                                hashMap5.put(str4, new com.amazon.aps.iva.fa.c(str3, str4, str5));
                                arrayList4 = arrayList4;
                            }
                            dVar.f();
                        }
                    }
                    arrayList = arrayList4;
                    dVar.h();
                    f = c2;
                    hashMap = hashMap5;
                    iVar = iVar3;
                    i = i3;
                    fVar = fVar4;
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 9:
                    f2 = f11;
                    f3 = f12;
                    dVar.a();
                    while (dVar.k()) {
                        c.a aVar2 = m.a;
                        ArrayList arrayList7 = new ArrayList();
                        dVar.c();
                        double d2 = 0.0d;
                        String str6 = null;
                        String str7 = null;
                        char c3 = 0;
                        while (dVar.k()) {
                            int x3 = dVar.x(m.a);
                            if (x3 != 0) {
                                if (x3 != 1) {
                                    if (x3 != 2) {
                                        if (x3 != 3) {
                                            if (x3 != 4) {
                                                if (x3 != 5) {
                                                    dVar.y();
                                                    dVar.A();
                                                } else {
                                                    dVar.c();
                                                    while (dVar.k()) {
                                                        if (dVar.x(m.b) != 0) {
                                                            dVar.y();
                                                            dVar.A();
                                                        } else {
                                                            dVar.a();
                                                            while (dVar.k()) {
                                                                arrayList7.add((com.amazon.aps.iva.ha.o) h.a(dVar, hVar));
                                                            }
                                                            dVar.f();
                                                        }
                                                    }
                                                    dVar.h();
                                                }
                                            } else {
                                                str7 = dVar.s();
                                            }
                                        } else {
                                            str6 = dVar.s();
                                        }
                                    } else {
                                        d2 = dVar.n();
                                    }
                                } else {
                                    dVar.n();
                                }
                            } else {
                                c3 = dVar.s().charAt(0);
                            }
                        }
                        dVar.h();
                        com.amazon.aps.iva.fa.d dVar2 = new com.amazon.aps.iva.fa.d(arrayList7, c3, d2, str6, str7);
                        iVar3.f(dVar2.hashCode(), dVar2);
                    }
                    dVar.f();
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    fVar = fVar4;
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                case 10:
                    dVar.a();
                    while (dVar.k()) {
                        dVar.c();
                        String str8 = null;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (dVar.k()) {
                            int x4 = dVar.x(d);
                            if (x4 != 0) {
                                f5 = f12;
                                if (x4 != 1) {
                                    if (x4 != 2) {
                                        dVar.y();
                                        dVar.A();
                                    } else {
                                        f6 = f11;
                                        f16 = (float) dVar.n();
                                    }
                                } else {
                                    f6 = f11;
                                    f15 = (float) dVar.n();
                                }
                                f11 = f6;
                            } else {
                                f5 = f12;
                                str8 = dVar.s();
                            }
                            f12 = f5;
                        }
                        dVar.h();
                        arrayList4.add(new com.amazon.aps.iva.fa.h(str8, f15, f16));
                        f11 = f11;
                        f12 = f12;
                    }
                    f2 = f11;
                    f3 = f12;
                    dVar.f();
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    fVar = fVar4;
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
                default:
                    f = c2;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    iVar = iVar3;
                    i = i3;
                    f2 = f11;
                    f3 = f12;
                    fVar = fVar4;
                    dVar.y();
                    dVar.A();
                    f10 = f13;
                    f11 = f2;
                    f12 = f3;
                    fVar4 = fVar;
                    c2 = f;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    iVar3 = iVar;
                    i3 = i;
            }
        }
        float f17 = c2;
        hVar.j = new Rect(0, 0, (int) (i4 * f17), (int) (i3 * f17));
        hVar.k = f11;
        hVar.l = f12;
        hVar.m = f10;
        hVar.i = arrayList3;
        hVar.h = fVar4;
        hVar.c = hashMap3;
        hVar.d = hashMap4;
        hVar.g = iVar3;
        hVar.e = hashMap5;
        hVar.f = arrayList4;
        return hVar;
    }
}
