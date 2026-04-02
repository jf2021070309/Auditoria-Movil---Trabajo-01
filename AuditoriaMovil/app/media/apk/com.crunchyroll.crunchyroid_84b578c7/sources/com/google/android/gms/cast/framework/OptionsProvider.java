package com.google.android.gms.cast.framework;

import android.content.Context;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public interface OptionsProvider {
    /* renamed from: getAdditionalSessionProviders */
    List<SessionProvider> mo27getAdditionalSessionProviders(Context context);

    CastOptions getCastOptions(Context context);
}
