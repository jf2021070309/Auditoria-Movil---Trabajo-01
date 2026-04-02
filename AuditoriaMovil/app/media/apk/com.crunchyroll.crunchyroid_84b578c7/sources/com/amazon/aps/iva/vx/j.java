package com.amazon.aps.iva.vx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: HomeFeedFeature.kt */
/* loaded from: classes2.dex */
public interface j {
    boolean b(Intent intent);

    com.amazon.aps.iva.ph.a c();

    String d();

    com.amazon.aps.iva.ct.d e();

    n f();

    com.amazon.aps.iva.rh.a g();

    EtpContentService getEtpContentService();

    com.amazon.aps.iva.xb0.a<Boolean> getHasPremiumBenefit();

    com.amazon.aps.iva.n70.d h(Activity activity, com.amazon.aps.iva.gn.c cVar);

    a i();

    boolean j();

    void k(com.amazon.aps.iva.i5.o oVar, com.ellation.crunchyroll.feed.l lVar);

    com.amazon.aps.iva.n70.d l(Activity activity, com.amazon.aps.iva.gn.c cVar);

    com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.yh.c> m();

    com.amazon.aps.iva.xb0.a<Boolean> n();

    View o(Context context);

    com.amazon.aps.iva.nh.d p();

    com.amazon.aps.iva.vw.a q();

    com.amazon.aps.iva.n60.b r();

    void s(com.amazon.aps.iva.i5.o oVar, u uVar);

    com.amazon.aps.iva.xb0.l<Activity, com.amazon.aps.iva.oh.g> t();

    com.amazon.aps.iva.xb0.a<Boolean> u();
}
