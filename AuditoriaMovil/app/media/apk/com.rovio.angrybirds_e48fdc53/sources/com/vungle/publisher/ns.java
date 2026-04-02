package com.vungle.publisher;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.vungle.publisher.log.Logger;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
/* loaded from: classes4.dex */
public class ns extends ni<jn> {
    @Inject
    mv q;
    @Inject
    a.C0333a r;

    @Override // com.vungle.publisher.mg
    protected me<?> a() {
        return this.r.a(this);
    }

    @Override // com.vungle.publisher.ni
    public void a(VungleAdActivity vungleAdActivity, jn jnVar, String str, p pVar, Bundle bundle) {
        super.a(vungleAdActivity, (VungleAdActivity) jnVar, str, pVar, bundle);
        vungleAdActivity.getWindow().addFlags(32);
        Display defaultDisplay = ((WindowManager) vungleAdActivity.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getRotation() == 0 || defaultDisplay.getRotation() == 2) {
            b(true);
        } else {
            b(false);
        }
        if (pVar.getFlexViewCloseTimeInSec() > 0) {
            Observable.interval(pVar.getFlexViewCloseTimeInSec(), TimeUnit.SECONDS).takeUntil(this.h).take(1).subscribe(nt.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void a(Long l) {
        a(true, false);
        this.i.a(new si(rx.mraidCloseByTimer));
        this.i.a(new si(rx.mraidClose));
    }

    @Override // com.vungle.publisher.mg
    public void a(Configuration configuration) {
        super.a(configuration);
        if (configuration.orientation == 1) {
            b(true);
        } else if (configuration.orientation == 2) {
            b(false);
        }
    }

    private void b(boolean z) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        VungleAdActivity vungleAdActivity = this.b.get();
        if (vungleAdActivity != null) {
            vungleAdActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (z) {
                vungleAdActivity.getWindow().setLayout(displayMetrics.widthPixels, (int) Math.round(displayMetrics.widthPixels * 0.5625d));
                vungleAdActivity.getWindow().setGravity(83);
            } else {
                vungleAdActivity.getWindow().setLayout((int) Math.round(displayMetrics.heightPixels * 0.5625d), displayMetrics.heightPixels);
                vungleAdActivity.getWindow().setGravity(5);
            }
        }
        this.q.a(displayMetrics, z);
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends me<ns> {
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
            ((ns) this.a).a(true, this.b);
        }

        public void onEvent(sf sfVar) {
            Logger.v(Logger.EVENT_TAG, "processing closeFlexViewAd received from API call");
            if (sfVar.a().equals(((ns) this.a).g)) {
                ((ns) this.a).a(true, false);
                this.eventBus.a(new si(rx.mraidCloseByApi));
                this.eventBus.a(new si(rx.mraidClose));
            }
        }

        public void onEvent(so soVar) {
            ((ns) this.a).a(soVar.a());
        }

        public void onEvent(sk skVar) {
            this.eventBus.a(new si(rx.mraidOpen));
            this.b = true;
        }

        public void onEvent(sl slVar) {
            ((ns) this.a).a(false, this.b);
        }

        public void onEvent(sr srVar) {
            try {
                ry a = srVar.a();
                boolean b = srVar.b();
                if (a == ry.NONE) {
                    if (b) {
                        ((ns) this.a).a(4);
                    } else {
                        a();
                    }
                } else {
                    Logger.v(Logger.EVENT_TAG, "force mraid orientation: " + a);
                    ((ns) this.a).a(a.a());
                }
            } catch (Exception e) {
                Logger.e(Logger.EVENT_TAG, "error setting mraid orientation", e);
            }
        }

        void a() {
            if (Build.VERSION.SDK_INT >= 18) {
                ((ns) this.a).a(14);
            } else {
                ((ns) this.a).a(5);
            }
        }

        @Singleton
        /* renamed from: com.vungle.publisher.ns$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0333a {
            @Inject
            a a;

            public a a(ns nsVar) {
                this.a.a = nsVar;
                this.a.b = false;
                return this.a;
            }
        }
    }
}
