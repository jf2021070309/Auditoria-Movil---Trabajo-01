package com.ss.android.downloadlib.q;

import android.text.TextUtils;
/* loaded from: classes3.dex */
public class ge {

    /* loaded from: classes3.dex */
    public interface dr<T> {
        T ge();
    }

    public static <T> T dr(boolean z, String str, dr<T> drVar) {
        try {
            return drVar.ge();
        } catch (Throwable th) {
            if (th instanceof com.ss.android.downloadlib.q.dr) {
                throw th;
            }
            o.dr().dr(z, th, str);
            if (TextUtils.isEmpty(str)) {
                throw th;
            }
            return null;
        }
    }

    public static <T> T dr(dr<T> drVar) {
        return (T) dr(true, null, drVar);
    }

    public static void dr(final Runnable runnable) {
        dr(new dr<Void>() { // from class: com.ss.android.downloadlib.q.ge.1
            @Override // com.ss.android.downloadlib.q.ge.dr
            /* renamed from: dr */
            public Void ge() {
                runnable.run();
                return null;
            }
        });
    }
}
