package com.amazon.aps.iva.mh;

import com.amazon.aps.iva.cx.r;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: AcceptedTosMonitor.kt */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: AcceptedTosMonitor.kt */
    /* renamed from: com.amazon.aps.iva.mh.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0516a {
        public static b a(CrunchyrollApplication crunchyrollApplication, r rVar) {
            return new b(new d(crunchyrollApplication), rVar);
        }
    }

    boolean a();

    void b();

    void onSignIn();
}
