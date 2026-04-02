package com.ellation.crunchyroll.cast.overlay.toolbar;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.df.b;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarPresenter;
import kotlin.Metadata;
/* compiled from: CastOverlayToolbarLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/overlay/toolbar/CastOverlayToolbarPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastOverlayToolbarLayout$presenter$2 extends l implements a<CastOverlayToolbarPresenter> {
    final /* synthetic */ Context $context;
    final /* synthetic */ CastOverlayToolbarLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastOverlayToolbarLayout$presenter$2(CastOverlayToolbarLayout castOverlayToolbarLayout, Context context) {
        super(0);
        this.this$0 = castOverlayToolbarLayout;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final CastOverlayToolbarPresenter invoke() {
        CastOverlayToolbarPresenter.Companion companion = CastOverlayToolbarPresenter.Companion;
        CastOverlayToolbarLayout castOverlayToolbarLayout = this.this$0;
        Activity a = q.a(this.$context);
        b bVar = a instanceof b ? (b) a : null;
        j.c(bVar);
        return companion.create(castOverlayToolbarLayout, bVar.X7());
    }
}
