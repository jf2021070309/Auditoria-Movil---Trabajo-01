package com.ellation.crunchyroll.cast.expanded;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: CastControllerPresenter.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0 implements w, f {
    private final /* synthetic */ l function;

    public CastControllerPresenterImpl$sam$androidx_lifecycle_Observer$0(l lVar) {
        j.f(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w) || !(obj instanceof f)) {
            return false;
        }
        return j.a(getFunctionDelegate(), ((f) obj).getFunctionDelegate());
    }

    @Override // com.amazon.aps.iva.yb0.f
    public final a<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.amazon.aps.iva.i5.w
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
