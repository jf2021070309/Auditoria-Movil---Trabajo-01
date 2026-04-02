package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.h1.a;
import com.amazon.aps.iva.lb0.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public final class c extends i {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public List<? extends f> d;
    public boolean e;
    public com.amazon.aps.iva.f1.m f;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> g;
    public String h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;

    public c() {
        int i = o.a;
        this.d = z.b;
        this.e = true;
        this.h = "";
        this.l = 1.0f;
        this.m = 1.0f;
        this.p = true;
    }

    @Override // com.amazon.aps.iva.j1.i
    public final void a(com.amazon.aps.iva.h1.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        if (this.p) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = com.amazon.aps.iva.aq.k.k();
                this.b = fArr;
            } else {
                com.amazon.aps.iva.aq.k.A(fArr);
            }
            com.amazon.aps.iva.aq.k.P(fArr, this.j + this.n, this.k + this.o);
            double d = (this.i * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = (sin * f2) + (cos * f);
            float f4 = -sin;
            float f5 = (f2 * cos) + (f * f4);
            float f6 = fArr[1];
            float f7 = fArr[5];
            float f8 = (sin * f7) + (cos * f6);
            float f9 = (f7 * cos) + (f6 * f4);
            float f10 = fArr[2];
            float f11 = fArr[6];
            float f12 = (sin * f11) + (cos * f10);
            float f13 = (f11 * cos) + (f10 * f4);
            float f14 = fArr[3];
            float f15 = fArr[7];
            float f16 = (sin * f15) + (cos * f14);
            float f17 = (cos * f15) + (f4 * f14);
            fArr[0] = f3;
            fArr[1] = f8;
            fArr[2] = f12;
            fArr[3] = f16;
            fArr[4] = f5;
            fArr[5] = f9;
            fArr[6] = f13;
            fArr[7] = f17;
            float f18 = this.l;
            float f19 = this.m;
            fArr[0] = f3 * f18;
            fArr[1] = f8 * f18;
            fArr[2] = f12 * f18;
            fArr[3] = f16 * f18;
            fArr[4] = f5 * f19;
            fArr[5] = f9 * f19;
            fArr[6] = f13 * f19;
            fArr[7] = f17 * f19;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            com.amazon.aps.iva.aq.k.P(fArr, -this.j, -this.k);
            this.p = false;
        }
        if (this.e) {
            if (!this.d.isEmpty()) {
                com.amazon.aps.iva.f1.m mVar = this.f;
                if (mVar == null) {
                    mVar = com.amazon.aps.iva.cq.b.j();
                    this.f = mVar;
                }
                h.b(this.d, mVar);
            }
            this.e = false;
        }
        a.b R0 = eVar.R0();
        long h = R0.h();
        R0.a().n();
        float[] fArr2 = this.b;
        com.amazon.aps.iva.h1.b bVar = R0.a;
        if (fArr2 != null) {
            bVar.f(fArr2);
        }
        com.amazon.aps.iva.f1.m mVar2 = this.f;
        if ((!this.d.isEmpty()) && mVar2 != null) {
            bVar.a(mVar2, 1);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i) arrayList.get(i)).a(eVar);
        }
        R0.a().g();
        R0.b(h);
    }

    @Override // com.amazon.aps.iva.j1.i
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> b() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.j1.i
    public final void d(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.g = aVar;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i) arrayList.get(i)).d(aVar);
        }
    }

    public final void e(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((i) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.h);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(((i) arrayList.get(i)).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
