package com.vungle.publisher;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class nk extends ni<dq> {
    @Inject
    a.C0332a q;

    @Override // com.vungle.publisher.ni, com.vungle.publisher.mg
    public void a(VungleAdActivity vungleAdActivity, dq dqVar, String str, p pVar, Bundle bundle) {
        super.a(vungleAdActivity, (VungleAdActivity) dqVar, str, pVar, bundle);
        Logger.d(Logger.AD_TAG, "create mraid ad");
        if (Build.VERSION.SDK_INT >= 24) {
            e();
        }
    }

    @Override // com.vungle.publisher.mg
    protected me<?> a() {
        return this.q.a(this);
    }

    @Override // com.vungle.publisher.ni, com.vungle.publisher.mg
    protected yj<?> b() {
        return this.n.a((dq) this.a);
    }

    private void e() {
        View view = this.m.get();
        if (view != null) {
            view.setOnApplyWindowInsetsListener(nl.a(this, view));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ WindowInsets a(View view, View view2, WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        try {
            if (this.l.get() != null && this.l.get().isInMultiWindowMode() && windowInsets.hasStableInsets()) {
                i3 = windowInsets.getStableInsetLeft();
                i2 = windowInsets.getStableInsetTop();
                i4 = windowInsets.getStableInsetRight();
                i = windowInsets.getStableInsetBottom();
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            view.getRootView().setPadding(i3, i2, i4, i);
        } catch (Exception e) {
            Logger.e(Logger.AD_TAG, "Exception setting root view padding to avoid system controls overlap", e);
        }
        return windowInsets;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends me<nk> {
        private boolean b;

        @Override // com.vungle.publisher.me
        public /* bridge */ /* synthetic */ void onEvent(aq aqVar) {
            super.onEvent(aqVar);
        }

        @Override // com.vungle.publisher.me
        public /* bridge */ /* synthetic */ void onEvent(bg bgVar) {
            super.onEvent(bgVar);
        }

        public void onEvent(sj sjVar) {
            Logger.v(Logger.EVENT_TAG, "mraidAd.onClose()");
            this.eventBus.a(new si(rx.mraidClose));
            ((nk) this.a).a(true, this.b);
        }

        public void onEvent(so soVar) {
            ((nk) this.a).a(soVar.a());
        }

        public void onEvent(sk skVar) {
            this.eventBus.a(new si(rx.mraidOpen));
            this.b = true;
        }

        public void onEvent(sl slVar) {
            ((nk) this.a).a(false, this.b);
        }

        public void onEvent(sr srVar) {
            try {
                ry a = srVar.a();
                boolean b = srVar.b();
                if (a == ry.NONE) {
                    if (b) {
                        ((nk) this.a).a(4);
                    } else {
                        a();
                    }
                } else {
                    Logger.v(Logger.EVENT_TAG, "force mraid orientation: " + a);
                    ((nk) this.a).a(a.a());
                }
            } catch (Exception e) {
                Logger.e(Logger.EVENT_TAG, "error setting mraid orientation", e);
            }
        }

        void a() {
            if (Build.VERSION.SDK_INT >= 18) {
                ((nk) this.a).a(14);
            } else {
                ((nk) this.a).a(5);
            }
        }

        @Singleton
        /* renamed from: com.vungle.publisher.nk$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0332a {
            @Inject
            a a;

            public a a(nk nkVar) {
                this.a.a = nkVar;
                this.a.b = false;
                return this.a;
            }
        }
    }
}
