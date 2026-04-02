package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.h2.k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes.dex */
public final class g implements k {
    public final com.amazon.aps.iva.c2.b a;
    public final List<b.C0158b<p>> b;
    public final com.amazon.aps.iva.kb0.e c;
    public final com.amazon.aps.iva.kb0.e d;
    public final ArrayList e;

    /* compiled from: MultiParagraphIntrinsics.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            Object obj;
            float f;
            k kVar;
            ArrayList arrayList = g.this.e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float b = ((j) obj2).a.b();
                int B = f1.B(arrayList);
                int i = 1;
                if (1 <= B) {
                    while (true) {
                        Object obj3 = arrayList.get(i);
                        float b2 = ((j) obj3).a.b();
                        if (Float.compare(b, b2) < 0) {
                            obj2 = obj3;
                            b = b2;
                        }
                        if (i == B) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            j jVar = (j) obj;
            if (jVar != null && (kVar = jVar.a) != null) {
                f = kVar.b();
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }
    }

    /* compiled from: MultiParagraphIntrinsics.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Float invoke() {
            Object obj;
            float f;
            k kVar;
            ArrayList arrayList = g.this.e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float c = ((j) obj2).a.c();
                int B = f1.B(arrayList);
                int i = 1;
                if (1 <= B) {
                    while (true) {
                        Object obj3 = arrayList.get(i);
                        float c2 = ((j) obj3).a.c();
                        if (Float.compare(c, c2) < 0) {
                            obj2 = obj3;
                            c = c2;
                        }
                        if (i == B) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            j jVar = (j) obj;
            if (jVar != null && (kVar = jVar.a) != null) {
                f = kVar.c();
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.amazon.aps.iva.c2.b bVar, a0 a0Var, List<b.C0158b<p>> list, com.amazon.aps.iva.o2.c cVar, k.a aVar) {
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        ArrayList arrayList;
        List list2;
        ArrayList arrayList2;
        String str3;
        List list3;
        int i4;
        boolean z;
        com.amazon.aps.iva.c2.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "annotatedString");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(list, "placeholders");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        this.a = bVar2;
        this.b = list;
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.NONE;
        this.c = com.amazon.aps.iva.kb0.f.a(gVar, new b());
        this.d = com.amazon.aps.iva.kb0.f.a(gVar, new a());
        com.amazon.aps.iva.c2.b bVar3 = c.a;
        n nVar = a0Var.b;
        com.amazon.aps.iva.yb0.j.f(nVar, "defaultParagraphStyle");
        String str4 = bVar2.b;
        int length = str4.length();
        List list4 = com.amazon.aps.iva.lb0.z.b;
        List list5 = bVar2.d;
        list5 = list5 == null ? list4 : list5;
        ArrayList arrayList3 = new ArrayList();
        int size = list5.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            b.C0158b<n> c0158b = list5.get(i5);
            n nVar2 = c0158b.a;
            List list6 = list5;
            int i7 = c0158b.b;
            int i8 = size;
            if (i7 != i6) {
                arrayList3.add(new b.C0158b(i6, i7, nVar));
            }
            n a2 = nVar.a(nVar2);
            int i9 = c0158b.c;
            arrayList3.add(new b.C0158b(i7, i9, a2));
            i5++;
            i6 = i9;
            list5 = list6;
            size = i8;
        }
        if (i6 != length) {
            arrayList3.add(new b.C0158b(i6, length, nVar));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new b.C0158b(0, 0, nVar));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i10 = i;
        while (i10 < size2) {
            b.C0158b c0158b2 = (b.C0158b) arrayList3.get(i10);
            int i11 = c0158b2.b;
            int i12 = c0158b2.c;
            if (i11 != i12) {
                str2 = str4.substring(i11, i12);
                str = str4;
                com.amazon.aps.iva.yb0.j.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = str4;
                str2 = "";
            }
            List b2 = c.b(bVar2, i11, i12);
            n nVar3 = (n) c0158b2.a;
            if (nVar3.b != null) {
                i2 = i10;
                i3 = size2;
                arrayList = arrayList4;
                list2 = list4;
                arrayList2 = arrayList3;
                str3 = str2;
            } else {
                i2 = i10;
                i3 = size2;
                arrayList = arrayList4;
                list2 = list4;
                arrayList2 = arrayList3;
                str3 = str2;
                nVar3 = new n(nVar3.a, nVar.b, nVar3.c, nVar3.d, nVar3.e, nVar3.f, nVar3.g, nVar3.h, nVar3.i);
            }
            a0 a0Var2 = new a0(a0Var.a, nVar.a(nVar3));
            if (b2 == null) {
                list3 = list2;
            } else {
                list3 = b2;
            }
            List<b.C0158b<p>> list7 = this.b;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i13 = 0;
            while (true) {
                i4 = c0158b2.b;
                if (i13 >= size3) {
                    break;
                }
                b.C0158b<p> c0158b3 = list7.get(i13);
                b.C0158b<p> c0158b4 = c0158b3;
                if (c.c(i4, i12, c0158b4.b, c0158b4.c)) {
                    arrayList5.add(c0158b3);
                }
                i13++;
            }
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i14 = 0; i14 < size4; i14++) {
                b.C0158b c0158b5 = (b.C0158b) arrayList5.get(i14);
                int i15 = c0158b5.b;
                int i16 = c0158b5.c;
                if (i4 <= i15 && i16 <= i12) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList6.add(new b.C0158b(i15 - i4, i16 - i4, c0158b5.a));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
            }
            ArrayList arrayList7 = arrayList;
            arrayList7.add(new j(l.a(a0Var2, aVar, cVar, str3, list3, arrayList6), i4, i12));
            i10 = i2 + 1;
            bVar2 = bVar;
            size2 = i3;
            arrayList4 = arrayList7;
            str4 = str;
            list4 = list2;
            arrayList3 = arrayList2;
        }
        this.e = arrayList4;
    }

    @Override // com.amazon.aps.iva.c2.k
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((j) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.c2.k
    public final float b() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // com.amazon.aps.iva.c2.k
    public final float c() {
        return ((Number) this.c.getValue()).floatValue();
    }
}
