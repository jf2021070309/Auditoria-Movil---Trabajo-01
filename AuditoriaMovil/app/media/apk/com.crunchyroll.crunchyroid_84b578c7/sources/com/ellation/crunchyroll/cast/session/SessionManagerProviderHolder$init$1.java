package com.ellation.crunchyroll.cast.session;

import android.content.Context;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: SessionManagerProviderHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/session/SessionManagerProviderImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionManagerProviderHolder$init$1 extends l implements a<SessionManagerProviderImpl> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionManagerProviderHolder$init$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final SessionManagerProviderImpl invoke() {
        return new SessionManagerProviderImpl(this.$context, null, 2, null);
    }
}
