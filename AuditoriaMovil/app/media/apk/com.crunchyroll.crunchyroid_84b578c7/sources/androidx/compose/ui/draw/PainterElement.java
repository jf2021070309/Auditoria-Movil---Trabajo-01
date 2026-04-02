package androidx.compose.ui.draw;

import com.amazon.aps.iva.c1.l;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e1.g;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.i1.c;
import com.amazon.aps.iva.s1.f;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.u1.p;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/c1/l;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PainterElement extends f0<l> {
    public final c c;
    public final boolean d;
    public final com.amazon.aps.iva.a1.a e;
    public final f f;
    public final float g;
    public final y h;

    public PainterElement(c cVar, boolean z, com.amazon.aps.iva.a1.a aVar, f fVar, float f, y yVar) {
        j.f(cVar, "painter");
        this.c = cVar;
        this.d = z;
        this.e = aVar;
        this.f = fVar;
        this.g = f;
        this.h = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (j.a(this.c, painterElement.c) && this.d == painterElement.d && j.a(this.e, painterElement.e) && j.a(this.f, painterElement.f) && Float.compare(this.g, painterElement.g) == 0 && j.a(this.h, painterElement.h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        int b = t0.b(this.g, (hashCode4 + ((hashCode3 + ((hashCode2 + i) * 31)) * 31)) * 31, 31);
        y yVar = this.h;
        if (yVar == null) {
            hashCode = 0;
        } else {
            hashCode = yVar.hashCode();
        }
        return b + hashCode;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final l l() {
        return new l(this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(l lVar) {
        boolean z;
        l lVar2 = lVar;
        j.f(lVar2, "node");
        boolean z2 = lVar2.p;
        c cVar = this.c;
        boolean z3 = this.d;
        if (z2 == z3 && (!z3 || g.a(lVar2.o.mo16getIntrinsicSizeNHjbRc(), cVar.mo16getIntrinsicSizeNHjbRc()))) {
            z = false;
        } else {
            z = true;
        }
        j.f(cVar, "<set-?>");
        lVar2.o = cVar;
        lVar2.p = z3;
        com.amazon.aps.iva.a1.a aVar = this.e;
        j.f(aVar, "<set-?>");
        lVar2.q = aVar;
        f fVar = this.f;
        j.f(fVar, "<set-?>");
        lVar2.r = fVar;
        lVar2.s = this.g;
        lVar2.t = this.h;
        if (z) {
            w.F(lVar2);
        }
        p.a(lVar2);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.c + ", sizeToIntrinsics=" + this.d + ", alignment=" + this.e + ", contentScale=" + this.f + ", alpha=" + this.g + ", colorFilter=" + this.h + ')';
    }
}
