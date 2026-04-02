package com.amazon.aps.iva.ex;

import android.content.Context;
import com.amazon.aps.iva.hv.p;
import com.amazon.aps.iva.r30.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: CrunchylistsFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class f implements p, com.amazon.aps.iva.r30.a {
    public final /* synthetic */ com.amazon.aps.iva.r30.b a;

    public f(Context context) {
        this.a = a.C0662a.a(context);
    }

    @Override // com.amazon.aps.iva.hv.p, com.amazon.aps.iva.r30.a
    public final String a(Panel panel) {
        j.f(panel, "panel");
        return this.a.a(panel);
    }

    @Override // com.amazon.aps.iva.r30.a
    public final String b(ContentContainer contentContainer) {
        j.f(contentContainer, "contentContainer");
        return this.a.b(contentContainer);
    }
}
