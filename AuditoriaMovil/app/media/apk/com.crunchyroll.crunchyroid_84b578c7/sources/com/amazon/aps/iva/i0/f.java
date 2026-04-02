package com.amazon.aps.iva.i0;

import com.amazon.aps.iva.f1.k0;
import com.amazon.aps.iva.o2.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: RoundedCornerShape.kt */
/* loaded from: classes.dex */
public final class f extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        j.f(bVar, "topStart");
        j.f(bVar2, "topEnd");
        j.f(bVar3, "bottomEnd");
        j.f(bVar4, "bottomStart");
    }

    @Override // com.amazon.aps.iva.i0.a
    public final f b(b bVar, b bVar2, b bVar3, b bVar4) {
        j.f(bVar, "topStart");
        j.f(bVar2, "topEnd");
        j.f(bVar3, "bottomEnd");
        j.f(bVar4, "bottomStart");
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    @Override // com.amazon.aps.iva.i0.a
    public final k0 c(long j, float f, float f2, float f3, float f4, l lVar) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        j.f(lVar, "layoutDirection");
        if (f + f2 + f3 + f4 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new k0.b(com.amazon.aps.iva.ff0.b.h(com.amazon.aps.iva.e1.c.b, j));
        }
        com.amazon.aps.iva.e1.e h = com.amazon.aps.iva.ff0.b.h(com.amazon.aps.iva.e1.c.b, j);
        l lVar2 = l.Ltr;
        if (lVar == lVar2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long f9 = i.f(f5, f5);
        if (lVar == lVar2) {
            f6 = f2;
        } else {
            f6 = f;
        }
        long f10 = i.f(f6, f6);
        if (lVar == lVar2) {
            f7 = f3;
        } else {
            f7 = f4;
        }
        long f11 = i.f(f7, f7);
        if (lVar == lVar2) {
            f8 = f4;
        } else {
            f8 = f3;
        }
        return new k0.c(com.amazon.aps.iva.dg.b.d(h, f9, f10, f11, i.f(f8, f8)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!j.a(this.a, fVar.a)) {
            return false;
        }
        if (!j.a(this.b, fVar.b)) {
            return false;
        }
        if (!j.a(this.c, fVar.c)) {
            return false;
        }
        if (j.a(this.d, fVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
