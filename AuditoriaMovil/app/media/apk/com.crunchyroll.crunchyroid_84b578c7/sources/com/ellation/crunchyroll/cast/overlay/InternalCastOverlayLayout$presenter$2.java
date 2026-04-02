package com.ellation.crunchyroll.cast.overlay;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.df.b;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.overlay.CastOverlayPresenter;
import com.ellation.crunchyroll.cast.session.SessionManagerProviderHolder;
import kotlin.Metadata;
/* compiled from: InternalCastOverlayLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/overlay/CastOverlayPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InternalCastOverlayLayout$presenter$2 extends l implements a<CastOverlayPresenter> {
    final /* synthetic */ Context $context;
    final /* synthetic */ InternalCastOverlayLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCastOverlayLayout$presenter$2(InternalCastOverlayLayout internalCastOverlayLayout, Context context) {
        super(0);
        this.this$0 = internalCastOverlayLayout;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final CastOverlayPresenter invoke() {
        CastOverlayPresenter.Companion companion = CastOverlayPresenter.Companion;
        InternalCastOverlayLayout internalCastOverlayLayout = this.this$0;
        Activity a = q.a(this.$context);
        j.d(a, "null cannot be cast to non-null type com.crunchyroll.cast.overlay.toolbar.CastOverlayViewModelProvider");
        return companion.create(internalCastOverlayLayout, ((b) a).X7(), SessionManagerProviderHolder.get());
    }
}
