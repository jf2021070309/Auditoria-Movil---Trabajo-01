package com.amazon.aps.iva.mt;

import com.amazon.aps.iva.e0.e0;
import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: ContinueWatchingCarousel.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ float i;
    public final /* synthetic */ com.amazon.aps.iva.fs.b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, float f, com.amazon.aps.iva.fs.b bVar) {
        super(1);
        this.h = iVar;
        this.i = f;
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "$this$LazyRow");
        i iVar = this.h;
        List<com.amazon.aps.iva.yx.g> items$home_feed_release = iVar.getItems$home_feed_release();
        e0Var2.a(items$home_feed_release.size(), new d(items$home_feed_release), com.amazon.aps.iva.v0.b.c(-1091073711, new e(items$home_feed_release, iVar, this.i, this.j), true));
        return q.a;
    }
}
