package com.ellation.crunchyroll.cast.mini;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.mini.CastMiniControllerPresenter;
import kotlin.Metadata;
/* compiled from: CastMiniControllerLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerPresenter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastMiniControllerLayout$presenter$2 extends l implements a<CastMiniControllerPresenter> {
    final /* synthetic */ CastMiniControllerLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastMiniControllerLayout$presenter$2(CastMiniControllerLayout castMiniControllerLayout) {
        super(0);
        this.this$0 = castMiniControllerLayout;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final CastMiniControllerPresenter invoke() {
        return CastMiniControllerPresenter.Factory.create$default(CastMiniControllerPresenter.Factory.INSTANCE, this.this$0, null, 2, null);
    }
}
