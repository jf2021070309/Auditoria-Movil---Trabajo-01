package com.amazon.aps.iva.us;

import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: UserSessionAnalytics.kt */
/* loaded from: classes2.dex */
public interface w {

    /* compiled from: UserSessionAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final z a;

        static {
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            com.amazon.aps.iva.bo.f b = CrunchyrollApplication.a.a().b();
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            a = new z(b);
        }
    }

    void a();

    void b();

    void c();

    void d(String str);
}
