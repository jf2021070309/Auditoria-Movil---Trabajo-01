package com.vungle.publisher;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.vungle.publisher.ji;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.ob;
import com.vungle.publisher.op;
import com.vungle.publisher.ys;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class oy extends mg<jh<?, ?, ?>> {
    @Inject
    a.C0334a l;
    @Inject
    ys.a m;
    @Inject
    op.a n;
    @Inject
    ob.a o;
    @Inject
    com.vungle.publisher.env.o p;
    private op q;
    private ob r;

    @Override // com.vungle.publisher.mg
    public void a(VungleAdActivity vungleAdActivity, jh<?, ?, ?> jhVar, String str, p pVar, Bundle bundle) {
        em v;
        try {
            Logger.d(Logger.AD_TAG, "create video ad");
            vungleAdActivity.getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
            super.a(vungleAdActivity, (VungleAdActivity) jhVar, str, pVar, bundle);
            vungleAdActivity.setRequestedOrientation(a(pVar, jhVar.D()));
            s b = this.p.b(str);
            boolean z = b != null && b.c;
            this.q = this.n.a(vungleAdActivity, jhVar, pVar, z, str);
            if ((jhVar instanceof el) && (v = ((el) jhVar).v()) != null) {
                this.r = this.o.a(vungleAdActivity, jhVar.c_(), v.K(), pVar, z, x.a(jhVar.s));
            }
            if ("postRollFragment".equals(this.f)) {
                d();
            } else {
                e();
            }
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error playing video ad", e);
            a(false, false);
        }
    }

    @Override // com.vungle.publisher.mg
    protected me<?> a() {
        return this.l.a(this);
    }

    @Override // com.vungle.publisher.mg
    protected yj<?> b() {
        return this.m.a((jh) this.a);
    }

    int a(p pVar, jg<?> jgVar) {
        Orientation orientation = pVar.getOrientation();
        switch (orientation) {
            case autoRotate:
                Logger.d(Logger.AD_TAG, "ad orientation " + orientation);
                return 10;
            default:
                if (jgVar.K()) {
                    Logger.d(Logger.AD_TAG, "ad orientation " + orientation + " (landscape)");
                    return 6;
                } else if (jgVar.L()) {
                    Logger.d(Logger.AD_TAG, "ad orientation " + orientation + " (portrait)");
                    return 7;
                } else {
                    Logger.d(Logger.AD_TAG, "ad orientation " + orientation + " (unknown) --> auto-rotate");
                    return 10;
                }
        }
    }

    void d() {
        if (this.r == null) {
            a(true, false);
            return;
        }
        this.i.a(new ap());
        a(this.r);
    }

    void e() {
        if (this.q == null) {
            d();
        } else {
            a(this.q);
        }
    }

    void a(ji.a aVar) {
        boolean z;
        String str = null;
        try {
            str = ((jh) this.a).y();
            Logger.v(Logger.AD_TAG, "call to action destination " + str);
            if (str != null) {
                Intent a2 = this.j.a("android.intent.action.VIEW", Uri.parse(str));
                a2.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                this.i.a(new ab(this.a, "unknown_placement", aVar));
                VungleAdActivity vungleAdActivity = this.b.get();
                if (vungleAdActivity != null) {
                    vungleAdActivity.startActivity(a2);
                }
            }
            z = true;
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "error loading call-to-action URL " + str, e);
            z = false;
        }
        a(z, true);
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends me<oy> {
        @Override // com.vungle.publisher.me
        public /* bridge */ /* synthetic */ void onEvent(aq aqVar) {
            super.onEvent(aqVar);
        }

        @Override // com.vungle.publisher.me
        public /* bridge */ /* synthetic */ void onEvent(bg bgVar) {
            super.onEvent(bgVar);
        }

        public void onEvent(aa aaVar) {
            ji.a a = aaVar.a();
            Logger.v(Logger.EVENT_TAG, "cta click event: " + a);
            ((oy) this.a).a(a);
        }

        public void onEvent(ay ayVar) {
            Logger.v(Logger.EVENT_TAG, "video.onCancel()");
            ((oy) this.a).d();
        }

        public void onEvent(az azVar) {
            Logger.v(Logger.EVENT_TAG, "video.onNext()");
            ((oy) this.a).d();
        }

        public void onEvent(ao aoVar) {
            Logger.v(Logger.EVENT_TAG, "postRoll.onCancel()");
            ((oy) this.a).a(true, false);
        }

        @Singleton
        /* renamed from: com.vungle.publisher.oy$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0334a {
            @Inject
            a a;

            public a a(oy oyVar) {
                this.a.a = oyVar;
                return this.a;
            }
        }
    }
}
