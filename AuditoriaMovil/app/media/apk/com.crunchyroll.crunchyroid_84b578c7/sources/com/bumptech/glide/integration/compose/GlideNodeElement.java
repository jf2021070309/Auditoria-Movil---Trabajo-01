package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.ec.f;
import com.amazon.aps.iva.f1.y;
import com.amazon.aps.iva.hc.a;
import com.amazon.aps.iva.hc.e;
import com.amazon.aps.iva.hc.k;
import com.amazon.aps.iva.hc.n;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.ic.h;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.u1.i;
import com.amazon.aps.iva.u1.p;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: GlideModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/bumptech/glide/integration/compose/GlideNodeElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/hc/e;", "compose_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class GlideNodeElement extends f0<e> {
    public final f<Drawable> c;
    public final com.amazon.aps.iva.s1.f d;
    public final a e;
    public final Float f;
    public final y g;
    public final Boolean h;
    public final n.a i;

    public GlideNodeElement(f<Drawable> fVar, com.amazon.aps.iva.s1.f fVar2, a aVar, Float f, y yVar, k kVar, Boolean bool, n.a aVar2) {
        j.f(fVar, "requestBuilder");
        this.c = fVar;
        this.d = fVar2;
        this.e = aVar;
        this.f = f;
        this.g = yVar;
        this.h = bool;
        this.i = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlideNodeElement)) {
            return false;
        }
        GlideNodeElement glideNodeElement = (GlideNodeElement) obj;
        if (!j.a(this.c, glideNodeElement.c) || !j.a(this.d, glideNodeElement.d) || !j.a(this.e, glideNodeElement.e) || !j.a(this.f, glideNodeElement.f) || !j.a(this.g, glideNodeElement.g)) {
            return false;
        }
        glideNodeElement.getClass();
        if (j.a(null, null) && j.a(this.h, glideNodeElement.h) && j.a(this.i, glideNodeElement.i)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        Float f = this.f;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        y yVar = this.g;
        if (yVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = yVar.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + 0) * 31;
        Boolean bool = this.h;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        n.a aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i4 + i;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final e l() {
        e eVar = new e();
        p(eVar);
        return eVar;
    }

    public final String toString() {
        return "GlideNodeElement(requestBuilder=" + this.c + ", contentScale=" + this.d + ", alignment=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ", requestListener=" + ((Object) null) + ", draw=" + this.h + ", transitionFactory=" + this.i + ')';
    }

    @Override // com.amazon.aps.iva.u1.f0
    /* renamed from: x */
    public final void p(e eVar) {
        boolean z;
        float f;
        boolean z2;
        h hVar;
        com.amazon.aps.iva.ab.a aVar;
        j.f(eVar, "node");
        f<Drawable> fVar = this.c;
        j.f(fVar, "requestBuilder");
        com.amazon.aps.iva.s1.f fVar2 = this.d;
        j.f(fVar2, "contentScale");
        a aVar2 = this.e;
        j.f(aVar2, "alignment");
        f<Drawable> fVar3 = eVar.o;
        boolean z3 = false;
        if (fVar3 != null && j.a(fVar, fVar3)) {
            z = false;
        } else {
            z = true;
        }
        eVar.o = fVar;
        eVar.p = fVar2;
        eVar.q = aVar2;
        Float f2 = this.f;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        eVar.s = f;
        eVar.t = this.g;
        eVar.getClass();
        Boolean bool = this.h;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        eVar.v = z2;
        n.a aVar3 = this.i;
        if (aVar3 == null) {
            aVar3 = a.C0329a.a;
        }
        eVar.u = aVar3;
        if (l.h(fVar.l) && l.h(fVar.k)) {
            z3 = true;
        }
        if (z3) {
            hVar = new h(fVar.l, fVar.k);
        } else {
            hVar = null;
        }
        if (hVar != null) {
            aVar = new com.amazon.aps.iva.ic.e(hVar);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            h hVar2 = eVar.E;
            if (hVar2 != null) {
                aVar = new com.amazon.aps.iva.ic.e(hVar2);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new com.amazon.aps.iva.ic.a();
            }
        }
        eVar.r = aVar;
        if (z) {
            eVar.t1();
            eVar.x1(null);
            if (eVar.n) {
                i.f(eVar).h(new com.amazon.aps.iva.hc.h(eVar, fVar));
                return;
            }
            return;
        }
        p.a(eVar);
    }
}
