package com.amazon.aps.iva.f8;

import android.media.MediaRouter;
import com.amazon.aps.iva.f8.m0;
/* compiled from: MediaRouterJellybean.java */
/* loaded from: classes.dex */
public final class n0<T extends m0> extends MediaRouter.VolumeCallback {
    public final T a;

    public n0(T t) {
        this.a = t;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.i(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.e(routeInfo, i);
    }
}
