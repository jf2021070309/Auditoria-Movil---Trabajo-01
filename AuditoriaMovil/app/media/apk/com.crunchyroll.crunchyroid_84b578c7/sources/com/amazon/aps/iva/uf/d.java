package com.amazon.aps.iva.uf;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.contentrating.controls.RatingControlsLayout;
/* compiled from: RatingControls.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.j50.f, com.amazon.aps.iva.l60.a {
    public final /* synthetic */ com.amazon.aps.iva.l60.b a;

    public d(RatingControlsLayout ratingControlsLayout) {
        Context context = ratingControlsLayout.getContext();
        j.e(context, "context");
        this.a = new com.amazon.aps.iva.l60.b(context);
    }

    @Override // com.amazon.aps.iva.j50.f, com.amazon.aps.iva.l60.a
    public final String a(int i) {
        return this.a.b(i);
    }

    @Override // com.amazon.aps.iva.l60.a
    public final String b(long j) {
        return this.a.b(j);
    }
}
