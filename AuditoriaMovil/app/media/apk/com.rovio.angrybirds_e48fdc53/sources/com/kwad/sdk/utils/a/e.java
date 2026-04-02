package com.kwad.sdk.utils.a;

import android.content.Context;
import android.util.Log;
import com.kwad.sdk.utils.a.c;
import com.kwad.sdk.utils.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public final class e {
    static ExecutorService aLC = Executors.newSingleThreadExecutor();
    static boolean aGV = Kz();

    private static boolean Kz() {
        d.setExecutor(aLC);
        d.a(new c.d() { // from class: com.kwad.sdk.utils.a.e.1
            @Override // com.kwad.sdk.utils.a.c.d
            public final void a(String str, Exception exc) {
                com.kwad.sdk.core.e.c.w("Ks_UnionKv", "name:" + str + " msg:" + Log.getStackTraceString(exc));
            }

            @Override // com.kwad.sdk.utils.a.c.d
            public final void e(String str, Throwable th) {
                com.kwad.sdk.core.e.c.e("Ks_UnionKv", "name:" + str + " msg:" + Log.getStackTraceString(th));
            }

            @Override // com.kwad.sdk.utils.a.c.d
            public final void i(String str, String str2) {
                com.kwad.sdk.core.e.c.i("Ks_UnionKv", "name:" + str + " msg:" + str2);
            }
        });
        aGV = true;
        return true;
    }

    public static c at(Context context, String str) {
        if (!aGV) {
            Kz();
        }
        return new c.a(q.K(context, "ks_union"), str).Kx();
    }
}
