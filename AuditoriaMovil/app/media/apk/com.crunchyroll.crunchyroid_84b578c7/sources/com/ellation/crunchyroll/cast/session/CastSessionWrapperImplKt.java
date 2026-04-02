package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.framework.CastSession;
import kotlin.Metadata;
/* compiled from: CastSessionWrapperImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toWrapper", "Lcom/ellation/crunchyroll/cast/session/CastSessionWrapperInternal;", "Lcom/google/android/gms/cast/framework/CastSession;", "cast_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CastSessionWrapperImplKt {
    public static final CastSessionWrapperInternal toWrapper(CastSession castSession) {
        j.f(castSession, "<this>");
        return new CastSessionWrapperImpl(castSession);
    }
}
