package androidx.compose.foundation.layout;

import com.amazon.aps.iva.d0.r;
import com.amazon.aps.iva.d0.s;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/s;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FillElement extends f0<s> {
    public final r c;
    public final float d;

    public FillElement(r rVar, float f, String str) {
        j.f(rVar, "direction");
        this.c = rVar;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.c != fillElement.c) {
            return false;
        }
        if (this.d == fillElement.d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Float.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final s l() {
        return new s(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(s sVar) {
        s sVar2 = sVar;
        j.f(sVar2, "node");
        r rVar = this.c;
        j.f(rVar, "<set-?>");
        sVar2.o = rVar;
        sVar2.p = this.d;
    }
}
