package com.amazon.aps.iva.wa;

import com.amazon.aps.iva.util.LogUtils;
import lombok.NonNull;
/* compiled from: WebViewAdapter.java */
/* loaded from: classes.dex */
public class t {
    public final s a;

    public t(@NonNull b bVar) {
        this.a = bVar;
    }

    public final void a(@NonNull String str) {
        if (str != null) {
            b(str, null);
            return;
        }
        throw new NullPointerException("jsCmd is marked non-null but is null");
    }

    public final void b(@NonNull String str, j jVar) {
        if (str != null) {
            s sVar = this.a;
            if (sVar != null) {
                ((b) sVar).a(str, jVar);
                return;
            } else {
                LogUtils.e("q", "WebView not ready to run commands");
                throw new com.amazon.aps.iva.ua.b();
            }
        }
        throw new NullPointerException("jsCmd is marked non-null but is null");
    }
}
