package com.amazon.aps.iva.y4;

import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.y0;
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class m implements n.c {
    public final l b;
    public final l c;
    public final l d;
    public final l e;
    public final l f;
    public final l g;

    public m() {
        this(null, null, null, null, 63);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final <R> R a(R r, com.amazon.aps.iva.xb0.p<? super R, ? super n.c, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean b(y0.c cVar) {
        return n.c.a.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean c(com.amazon.aps.iva.xb0.l<? super n.c, Boolean> lVar) {
        return n.c.a.b(this, lVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final com.amazon.aps.iva.p4.n d(com.amazon.aps.iva.p4.n nVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "other");
        return n.b.a(this, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, mVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, mVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, mVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, mVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, mVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, mVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.b + ", start=" + this.c + ", top=" + this.d + ", right=" + this.e + ", end=" + this.f + ", bottom=" + this.g + ')';
    }

    public m(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6) {
        com.amazon.aps.iva.yb0.j.f(lVar, "left");
        com.amazon.aps.iva.yb0.j.f(lVar2, "start");
        com.amazon.aps.iva.yb0.j.f(lVar3, "top");
        com.amazon.aps.iva.yb0.j.f(lVar4, "right");
        com.amazon.aps.iva.yb0.j.f(lVar5, "end");
        com.amazon.aps.iva.yb0.j.f(lVar6, "bottom");
        this.b = lVar;
        this.c = lVar2;
        this.d = lVar3;
        this.e = lVar4;
        this.f = lVar5;
        this.g = lVar6;
    }

    public /* synthetic */ m(l lVar, l lVar2, l lVar3, l lVar4, int i) {
        this((i & 1) != 0 ? new l(0.0f, 3) : null, (i & 2) != 0 ? new l(0.0f, 3) : lVar, (i & 4) != 0 ? new l(0.0f, 3) : lVar2, (i & 8) != 0 ? new l(0.0f, 3) : null, (i & 16) != 0 ? new l(0.0f, 3) : lVar3, (i & 32) != 0 ? new l(0.0f, 3) : lVar4);
    }
}
