package com.fyber.inneractive.sdk.util;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
/* loaded from: classes.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable th) {
            IAlog.a(q.a(th), new Object[0]);
            return false;
        }
    }
}
