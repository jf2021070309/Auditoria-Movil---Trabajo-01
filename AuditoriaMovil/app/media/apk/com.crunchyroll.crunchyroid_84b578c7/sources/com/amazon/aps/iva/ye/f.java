package com.amazon.aps.iva.ye;

import com.amazon.aps.iva.ve0.u0;
/* compiled from: CastStateProvider.kt */
/* loaded from: classes.dex */
public interface f {
    b getCastSession();

    com.amazon.aps.iva.ve0.f<d> getCastStateChangeEventFlow();

    u0<c> getCastStateFlow();

    boolean isCastConnected();

    boolean isCastingVideo(String str);

    boolean isTryingToCast();
}
