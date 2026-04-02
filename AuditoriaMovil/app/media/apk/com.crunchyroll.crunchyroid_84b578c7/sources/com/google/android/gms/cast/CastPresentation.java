package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@TargetApi(19)
@Deprecated
/* loaded from: classes2.dex */
public abstract class CastPresentation extends Presentation {
    public CastPresentation(Context context, Display display) {
        super(context, display);
        zza();
    }

    private final void zza() {
        Window window = getWindow();
        if (window != null) {
            window.setType(2030);
            window.addFlags(268435456);
            window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            window.addFlags(1024);
        }
    }

    public CastPresentation(Context context, Display display, int i) {
        super(context, display, i);
        zza();
    }
}
