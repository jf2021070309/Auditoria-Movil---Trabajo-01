package com.amazon.aps.iva.wv;

import android.content.Context;
/* compiled from: DownloadHistoryCache.kt */
/* loaded from: classes2.dex */
public interface z {
    public static final /* synthetic */ int a = 0;

    /* compiled from: DownloadHistoryCache.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static volatile a0 b;

        public final z a(Context context) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            a0 a0Var = b;
            if (a0Var == null) {
                synchronized (this) {
                    a0Var = b;
                    if (a0Var == null) {
                        Context applicationContext = context.getApplicationContext();
                        com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
                        a0Var = new a0(applicationContext);
                        b = a0Var;
                    }
                }
            }
            return a0Var;
        }
    }

    Object deleteItem(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    Object readItem(String str, com.amazon.aps.iva.ob0.d<? super i> dVar);
}
