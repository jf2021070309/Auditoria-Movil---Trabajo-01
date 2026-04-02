package androidx.compose.ui.layout;

import com.amazon.aps.iva.s1.r;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: LayoutId.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Lcom/amazon/aps/iva/u1/f0;", "Lcom/amazon/aps/iva/s1/r;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class LayoutIdElement extends f0<r> {
    public final Object c;

    public LayoutIdElement(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutIdElement) && j.a(this.c, ((LayoutIdElement) obj).c)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final r l() {
        return new r(this.c);
    }

    @Override // com.amazon.aps.iva.u1.f0
    public final void p(r rVar) {
        r rVar2 = rVar;
        j.f(rVar2, "node");
        Object obj = this.c;
        j.f(obj, "<set-?>");
        rVar2.o = obj;
    }

    public final String toString() {
        return defpackage.b.b(new StringBuilder("LayoutIdElement(layoutId="), this.c, ')');
    }
}
