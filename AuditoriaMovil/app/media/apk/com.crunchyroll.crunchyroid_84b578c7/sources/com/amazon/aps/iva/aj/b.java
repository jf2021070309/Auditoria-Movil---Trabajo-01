package com.amazon.aps.iva.aj;

import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRatingKt;
/* compiled from: MaturityRestrictionProviderImpl.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.xb0.a<Boolean> a;
    public final com.amazon.aps.iva.xb0.a<String> b;

    public b(i iVar, g gVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "showParentalControls");
        this.a = iVar;
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.aj.a
    public final String a() {
        return this.b.invoke();
    }

    @Override // com.amazon.aps.iva.aj.a
    public final boolean b(String str) {
        if (!this.a.invoke().booleanValue()) {
            return false;
        }
        com.amazon.aps.iva.xb0.a<String> aVar = this.b;
        if (aVar.invoke() == null || ExtendedMaturityRatingKt.getAllowedAgeFromRating(str) <= ExtendedMaturityRatingKt.getAllowedAgeFromRating(aVar.invoke())) {
            return false;
        }
        return true;
    }
}
