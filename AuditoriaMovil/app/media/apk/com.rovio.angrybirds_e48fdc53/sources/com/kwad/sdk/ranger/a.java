package com.kwad.sdk.ranger;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.ranger.d;
import com.kwad.sdk.utils.s;
import com.kwad.sdk.utils.y;
import java.util.List;
/* loaded from: classes3.dex */
public final class a {
    public static final String TAG = "Ranger_" + b.class.getSimpleName();

    static void a(Activity activity, List<d.a> list) {
        try {
            for (d.a aVar : list) {
                if (aVar != null) {
                    String str = "";
                    if (TextUtils.equals(activity.getClass().getName(), aVar.aGT)) {
                        str = aVar.aGT;
                    } else if (!TextUtils.isEmpty(aVar.aGU) && activity.getClass().getName().startsWith(aVar.aGT)) {
                        str = e(activity, aVar.aGU);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        int c = y.c("ksadsdk_perf_ranger", str, 0) + 1;
                        y.b("ksadsdk_perf_ranger", str, c);
                        String str2 = TAG;
                        com.kwad.sdk.core.e.c.d(str2, "act:" + str + " num:" + c);
                    }
                }
            }
        } catch (Throwable th) {
            String str3 = TAG;
            com.kwad.sdk.core.e.c.e(str3, "record:" + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(d dVar) {
        final List<d.a> list = dVar.aGP;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.a(new com.kwad.sdk.core.c.d() { // from class: com.kwad.sdk.ranger.a.1
            @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
            /* renamed from: onActivityCreated */
            public final void a(Activity activity, Bundle bundle) {
                super.a(activity, bundle);
                try {
                    a.a(activity, list);
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.e(a.TAG, Log.getStackTraceString(th));
                }
            }
        });
    }

    private static String e(Object obj, String str) {
        Object f;
        return (TextUtils.isEmpty(str) || (f = s.f(obj, str)) == null) ? "" : f.getClass().getName();
    }
}
