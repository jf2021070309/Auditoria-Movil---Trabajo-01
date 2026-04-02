package com.amazon.aps.iva.f8;

import android.media.MediaRouter;
import com.amazon.aps.iva.f8.o0;
/* compiled from: MediaRouterJellybeanMr1.java */
/* loaded from: classes.dex */
public final class p0<T extends o0> extends l0<T> {
    public p0(T t) {
        super(t);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ((o0) this.a).d(routeInfo);
    }
}
