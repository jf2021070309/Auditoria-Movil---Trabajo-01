package androidx.compose.foundation.layout;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.v1.v1;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/d0/d;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AspectRatioElement extends f0<com.amazon.aps.iva.d0.d> {
    public final float c;
    public final boolean d;
    public final l<v1, q> e;

    public AspectRatioElement(float f, boolean z) {
        boolean z2;
        t1.a aVar = t1.a;
        j.f(aVar, "inspectorInfo");
        this.c = f;
        this.d = z;
        this.e = aVar;
        if (f > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
    }

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.c == aspectRatioElement.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.d == ((AspectRatioElement) obj).d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final com.amazon.aps.iva.d0.d l() {
        return new com.amazon.aps.iva.d0.d(this.c, this.d);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(com.amazon.aps.iva.d0.d dVar) {
        com.amazon.aps.iva.d0.d dVar2 = dVar;
        j.f(dVar2, "node");
        dVar2.o = this.c;
        dVar2.p = this.d;
    }
}
