package androidx.compose.foundation.text.modifiers;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.f1.z;
import com.amazon.aps.iva.h2.k;
import com.amazon.aps.iva.k0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: TextStringSimpleElement.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/k0/q;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends f0<q> {
    public final String c;
    public final a0 d;
    public final k.a e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final z j;

    public TextStringSimpleElement(String str, a0 a0Var, k.a aVar, int i, boolean z, int i2, int i3, z zVar) {
        j.f(str, "text");
        j.f(a0Var, "style");
        j.f(aVar, "fontFamilyResolver");
        this.c = str;
        this.d = a0Var;
        this.e = aVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = zVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (!j.a(this.j, textStringSimpleElement.j) || !j.a(this.c, textStringSimpleElement.c) || !j.a(this.d, textStringSimpleElement.d) || !j.a(this.e, textStringSimpleElement.e)) {
            return false;
        }
        if (this.f == textStringSimpleElement.f) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h && this.i == textStringSimpleElement.i) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        int i;
        int hashCode = this.d.hashCode();
        int hashCode2 = this.e.hashCode();
        int b = (((r.b(this.g, r.a(this.f, (hashCode2 + ((hashCode + (this.c.hashCode() * 31)) * 31)) * 31, 31), 31) + this.h) * 31) + this.i) * 31;
        z zVar = this.j;
        if (zVar != null) {
            i = zVar.hashCode();
        } else {
            i = 0;
        }
        return b + i;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final q l() {
        return new q(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.u1.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.amazon.aps.iva.k0.q r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.p(com.amazon.aps.iva.a1.f$c):void");
    }
}
