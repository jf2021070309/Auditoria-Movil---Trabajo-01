package androidx.compose.foundation.text.modifiers;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.c2.p;
import com.amazon.aps.iva.c2.y;
import com.amazon.aps.iva.e1.e;
import com.amazon.aps.iva.f1.z;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.k0.i;
import com.amazon.aps.iva.k0.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import kotlin.Metadata;
/* compiled from: TextAnnotatedStringElement.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/k0/o;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends f0<o> {
    public final b c;
    public final a0 d;
    public final k.a e;
    public final l<y, q> f;
    public final int g;
    public final boolean h;
    public final int i;
    public final int j;
    public final List<b.C0158b<p>> k;
    public final l<List<e>, q> l;
    public final i m;
    public final z n;

    public TextAnnotatedStringElement(b bVar, a0 a0Var, k.a aVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, z zVar) {
        j.f(bVar, "text");
        j.f(a0Var, "style");
        j.f(aVar, "fontFamilyResolver");
        this.c = bVar;
        this.d = a0Var;
        this.e = aVar;
        this.f = lVar;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.j = i3;
        this.k = list;
        this.l = lVar2;
        this.m = null;
        this.n = zVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!j.a(this.n, textAnnotatedStringElement.n) || !j.a(this.c, textAnnotatedStringElement.c) || !j.a(this.d, textAnnotatedStringElement.d) || !j.a(this.k, textAnnotatedStringElement.k) || !j.a(this.e, textAnnotatedStringElement.e) || !j.a(this.f, textAnnotatedStringElement.f)) {
            return false;
        }
        if (this.g == textAnnotatedStringElement.g) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.j == textAnnotatedStringElement.j && j.a(this.l, textAnnotatedStringElement.l) && j.a(this.m, textAnnotatedStringElement.m)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
        int i5 = 0;
        l<y, q> lVar = this.f;
        if (lVar != null) {
            i = lVar.hashCode();
        } else {
            i = 0;
        }
        int b = (((r.b(this.h, r.a(this.g, (hashCode + i) * 31, 31), 31) + this.i) * 31) + this.j) * 31;
        List<b.C0158b<p>> list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (b + i2) * 31;
        l<List<e>, q> lVar2 = this.l;
        if (lVar2 != null) {
            i3 = lVar2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        i iVar = this.m;
        if (iVar != null) {
            i4 = iVar.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        z zVar = this.n;
        if (zVar != null) {
            i5 = zVar.hashCode();
        }
        return i8 + i5;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final o l() {
        return new o(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // com.amazon.aps.iva.u1.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.amazon.aps.iva.k0.o r11) {
        /*
            r10 = this;
            com.amazon.aps.iva.k0.o r11 = (com.amazon.aps.iva.k0.o) r11
            java.lang.String r0 = "node"
            com.amazon.aps.iva.yb0.j.f(r11, r0)
            java.lang.String r0 = "style"
            com.amazon.aps.iva.c2.a0 r1 = r10.d
            com.amazon.aps.iva.yb0.j.f(r1, r0)
            com.amazon.aps.iva.f1.z r0 = r11.z
            com.amazon.aps.iva.f1.z r2 = r10.n
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r2, r0)
            r3 = 1
            r0 = r0 ^ r3
            r11.z = r2
            r2 = 0
            if (r0 != 0) goto L39
            com.amazon.aps.iva.c2.a0 r0 = r11.p
            java.lang.String r4 = "other"
            com.amazon.aps.iva.yb0.j.f(r0, r4)
            if (r1 == r0) goto L33
            com.amazon.aps.iva.c2.u r1 = r1.a
            com.amazon.aps.iva.c2.u r0 = r0.a
            boolean r0 = r1.d(r0)
            if (r0 == 0) goto L31
            goto L33
        L31:
            r0 = r2
            goto L34
        L33:
            r0 = r3
        L34:
            if (r0 != 0) goto L37
            goto L39
        L37:
            r8 = r2
            goto L3a
        L39:
            r8 = r3
        L3a:
            java.lang.String r0 = "text"
            com.amazon.aps.iva.c2.b r1 = r10.c
            com.amazon.aps.iva.yb0.j.f(r1, r0)
            com.amazon.aps.iva.c2.b r0 = r11.o
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r0, r1)
            if (r0 == 0) goto L4b
            r9 = r2
            goto L4e
        L4b:
            r11.o = r1
            r9 = r3
        L4e:
            com.amazon.aps.iva.c2.a0 r1 = r10.d
            java.util.List<com.amazon.aps.iva.c2.b$b<com.amazon.aps.iva.c2.p>> r2 = r10.k
            int r3 = r10.j
            int r4 = r10.i
            boolean r5 = r10.h
            com.amazon.aps.iva.h2.k$a r6 = r10.e
            int r7 = r10.g
            r0 = r11
            boolean r0 = r0.x1(r1, r2, r3, r4, r5, r6, r7)
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> r1 = r10.f
            com.amazon.aps.iva.xb0.l<java.util.List<com.amazon.aps.iva.e1.e>, com.amazon.aps.iva.kb0.q> r2 = r10.l
            com.amazon.aps.iva.k0.i r3 = r10.m
            boolean r1 = r11.w1(r1, r2, r3)
            r11.t1(r8, r9, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.p(com.amazon.aps.iva.a1.f$c):void");
    }
}
