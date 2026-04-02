package com.ellation.crunchyroll.cast.castlistener;

import android.app.Activity;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator;
import com.ellation.crunchyroll.cast.session.SessionManagerProviderHolder;
import kotlin.Metadata;
/* compiled from: VideoCastControllerFactory.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ellation/crunchyroll/cast/castlistener/VideoCastControllerImpl;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoCastControllerFactory$create$1 extends l implements a<VideoCastControllerImpl> {
    final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCastControllerFactory$create$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final VideoCastControllerImpl invoke() {
        return new VideoCastControllerImpl(SessionManagerProviderHolder.get(), UIMediaControllerDecorator.Companion.create(this.$activity));
    }
}
