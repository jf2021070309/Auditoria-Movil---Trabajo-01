package androidx.compose.foundation.text.modifiers;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.c2.p;
import com.amazon.aps.iva.c2.y;
import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.e1.e;
import com.amazon.aps.iva.f1.z;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.k0.f;
import com.amazon.aps.iva.k0.i;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SelectableTextAnnotatedStringElement.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/k0/f;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends f0<f> {
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

    public SelectableTextAnnotatedStringElement(b bVar, a0 a0Var, k.a aVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, i iVar, z zVar) {
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
        this.m = iVar;
        this.n = zVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (!j.a(this.n, selectableTextAnnotatedStringElement.n) || !j.a(this.c, selectableTextAnnotatedStringElement.c) || !j.a(this.d, selectableTextAnnotatedStringElement.d) || !j.a(this.k, selectableTextAnnotatedStringElement.k) || !j.a(this.e, selectableTextAnnotatedStringElement.e) || !j.a(this.f, selectableTextAnnotatedStringElement.f)) {
            return false;
        }
        if (this.g == selectableTextAnnotatedStringElement.g) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.j == selectableTextAnnotatedStringElement.j && j.a(this.l, selectableTextAnnotatedStringElement.l) && j.a(this.m, selectableTextAnnotatedStringElement.m)) {
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
    public final f l() {
        return new f(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    @Override // com.amazon.aps.iva.u1.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.amazon.aps.iva.k0.f r14) {
        /*
            r13 = this;
            com.amazon.aps.iva.k0.f r14 = (com.amazon.aps.iva.k0.f) r14
            java.lang.String r0 = "node"
            com.amazon.aps.iva.yb0.j.f(r14, r0)
            java.util.List<com.amazon.aps.iva.c2.b$b<com.amazon.aps.iva.c2.p>> r3 = r13.k
            int r4 = r13.j
            int r5 = r13.i
            boolean r6 = r13.h
            int r8 = r13.g
            java.lang.String r0 = "text"
            com.amazon.aps.iva.c2.b r1 = r13.c
            com.amazon.aps.iva.yb0.j.f(r1, r0)
            java.lang.String r0 = "style"
            com.amazon.aps.iva.c2.a0 r2 = r13.d
            com.amazon.aps.iva.yb0.j.f(r2, r0)
            java.lang.String r0 = "fontFamilyResolver"
            com.amazon.aps.iva.h2.k$a r7 = r13.e
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            com.amazon.aps.iva.k0.o r0 = r14.r
            r0.getClass()
            com.amazon.aps.iva.f1.z r9 = r0.z
            com.amazon.aps.iva.f1.z r10 = r13.n
            boolean r9 = com.amazon.aps.iva.yb0.j.a(r10, r9)
            r11 = 1
            r9 = r9 ^ r11
            r0.z = r10
            r10 = 0
            if (r9 != 0) goto L56
            com.amazon.aps.iva.c2.a0 r9 = r0.p
            java.lang.String r12 = "other"
            com.amazon.aps.iva.yb0.j.f(r9, r12)
            if (r2 == r9) goto L50
            com.amazon.aps.iva.c2.u r12 = r2.a
            com.amazon.aps.iva.c2.u r9 = r9.a
            boolean r9 = r12.d(r9)
            if (r9 == 0) goto L4e
            goto L50
        L4e:
            r9 = r10
            goto L51
        L50:
            r9 = r11
        L51:
            if (r9 != 0) goto L54
            goto L56
        L54:
            r9 = r10
            goto L57
        L56:
            r9 = r11
        L57:
            com.amazon.aps.iva.c2.b r12 = r0.o
            boolean r12 = com.amazon.aps.iva.yb0.j.a(r12, r1)
            if (r12 == 0) goto L61
            r11 = r10
            goto L63
        L61:
            r0.o = r1
        L63:
            com.amazon.aps.iva.k0.o r1 = r14.r
            boolean r1 = r1.x1(r2, r3, r4, r5, r6, r7, r8)
            com.amazon.aps.iva.k0.i r2 = r13.m
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> r3 = r13.f
            com.amazon.aps.iva.xb0.l<java.util.List<com.amazon.aps.iva.e1.e>, com.amazon.aps.iva.kb0.q> r4 = r13.l
            boolean r2 = r0.w1(r3, r4, r2)
            r0.t1(r9, r11, r1, r2)
            com.amazon.aps.iva.e.w.F(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.p(com.amazon.aps.iva.a1.f$c):void");
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.c) + ", style=" + this.d + ", fontFamilyResolver=" + this.e + ", onTextLayout=" + this.f + ", overflow=" + ((Object) d.l(this.g)) + ", softWrap=" + this.h + ", maxLines=" + this.i + ", minLines=" + this.j + ", placeholders=" + this.k + ", onPlaceholderLayout=" + this.l + ", selectionController=" + this.m + ", color=" + this.n + ')';
    }
}
