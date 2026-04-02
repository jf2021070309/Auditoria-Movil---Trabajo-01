package com.amazon.aps.iva.lo;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.qo.u;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: WatchScreenDependencies.kt */
/* loaded from: classes2.dex */
public interface b {
    com.amazon.aps.iva.ye.a a();

    boolean b();

    com.amazon.aps.iva.ph.a c();

    String d();

    com.amazon.aps.iva.aj.f e();

    com.amazon.aps.iva.bp.c f();

    l<Context, com.amazon.aps.iva.tg.a> g();

    EtpContentService getContentService();

    com.amazon.aps.iva.fp.f getMaturePreferenceInteractor();

    com.amazon.aps.iva.cj.l getPlayerFeature();

    TalkboxService getTalkboxService();

    com.amazon.aps.iva.ff.a h();

    com.amazon.aps.iva.bp.e j();

    p<Activity, Boolean, u> k();

    com.amazon.aps.iva.fg.a l();
}
