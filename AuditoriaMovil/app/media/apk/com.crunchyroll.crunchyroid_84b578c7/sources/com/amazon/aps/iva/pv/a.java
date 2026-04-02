package com.amazon.aps.iva.pv;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.nv.e;
import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
/* compiled from: DeleteCrunchylistFailedException.kt */
/* loaded from: classes2.dex */
public final class a extends Throwable {
    public final e b;
    public final int c;
    public final Exception d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i, IOException iOException) {
        super(iOException);
        j.f(eVar, "crunchylistItemUiModel");
        this.b = eVar;
        this.c = i;
        this.d = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && this.c == aVar.c && j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + r.a(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "DeleteCrunchylistFailedException(crunchylistItemUiModel=" + this.b + ", positionInList=" + this.c + ", exception=" + this.d + ")";
    }
}
