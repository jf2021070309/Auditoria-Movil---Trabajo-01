package com.kwad.components.ad.reward.presenter.platdetail.actionbar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kwad.components.ad.reward.j;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class RewardActionBarControl {
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private Context mContext;
    private j qB;
    private b uF;
    private e uJ;
    private c uK;
    private d uL;
    private final long uN;
    private a uM = new a((byte) 0);
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean uO = false;
    private boolean uP = false;

    /* loaded from: classes.dex */
    public enum ShowActionBarResult {
        SHOW_NATIVE_DEFAULT,
        SHOW_H5_SUCCESS,
        SHOW_H5_FAILURE,
        SHOW_ORDER,
        TK,
        SHOW_NATIVE_ORDER,
        SHOW_NATIVE_JINNIU,
        SHOW_NATIVE_PLAYABLE_PORTRAIT,
        SHOW_NATIVE_LIVE_SUBSCRIBE,
        SHOW_NATIVE_ORIGIN_LIVE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements com.kwad.components.ad.reward.presenter.platdetail.actionbar.a {
        private List<com.kwad.components.ad.reward.presenter.platdetail.actionbar.a> uU;
        private ShowActionBarResult uV;

        private a() {
            this.uU = new CopyOnWriteArrayList();
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // com.kwad.components.ad.reward.presenter.platdetail.actionbar.a
        public final void a(ShowActionBarResult showActionBarResult, View view) {
            com.kwad.sdk.core.e.c.d("ActionBarControl", "onActionBarShown result: " + showActionBarResult);
            this.uV = showActionBarResult;
            for (com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar : this.uU) {
                aVar.a(showActionBarResult, view);
            }
        }

        public final void c(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
            this.uU.add(aVar);
        }

        public final void d(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
            this.uU.remove(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z, com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void e(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void f(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean g(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar);
    }

    public RewardActionBarControl(j jVar, Context context, AdTemplate adTemplate) {
        this.qB = jVar;
        this.mContext = context;
        this.mAdTemplate = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        long ba = com.kwad.sdk.core.response.b.b.ba(adTemplate) > 0 ? com.kwad.sdk.core.response.b.b.ba(adTemplate) : 1000L;
        this.uN = ba > 0 ? ba : 1000L;
    }

    private ShowActionBarResult Q(boolean z) {
        c cVar;
        d dVar;
        if (j.d(this.qB) && (dVar = this.uL) != null) {
            dVar.f(this.uM);
            return ShowActionBarResult.TK;
        } else if (com.kwad.components.ad.reward.a.b.i(this.mAdInfo) && (cVar = this.uK) != null) {
            cVar.e(this.uM);
            return ShowActionBarResult.SHOW_ORDER;
        } else if (!com.kwad.sdk.core.response.b.b.bb(this.mAdTemplate) || com.kwad.sdk.core.response.b.a.aV(this.mAdInfo) || this.uJ == null) {
            R(z);
            return ShowActionBarResult.SHOW_NATIVE_DEFAULT;
        } else {
            com.kwad.sdk.core.e.c.d("ActionBarControl", "showWebActionBar success in " + this.uN);
            return this.uJ.g(this.uM) ? ShowActionBarResult.SHOW_H5_SUCCESS : ShowActionBarResult.SHOW_H5_FAILURE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(boolean z) {
        if (this.uF != null) {
            com.kwad.sdk.core.e.c.d("ActionBarControl", "showNativeActionBar");
            this.uP = true;
            this.uF.a(z, this.uM);
        }
    }

    public static void a(final com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar, final View view, final ShowActionBarResult showActionBarResult) {
        if (aVar != null) {
            view.post(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.kwad.components.ad.reward.presenter.platdetail.actionbar.a.this.a(showActionBarResult, view);
                }
            });
        }
    }

    static /* synthetic */ boolean a(RewardActionBarControl rewardActionBarControl, boolean z) {
        rewardActionBarControl.uO = true;
        return true;
    }

    public final void P(boolean z) {
        ShowActionBarResult Q = Q(z);
        com.kwad.sdk.core.e.c.d("ActionBarControl", "showActionBarOnVideoStart result: " + Q);
        if (Q != ShowActionBarResult.SHOW_H5_FAILURE) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl.1
            @Override // java.lang.Runnable
            public final void run() {
                RewardActionBarControl.a(RewardActionBarControl.this, true);
                com.kwad.sdk.core.e.c.d("ActionBarControl", "mHasOutTime");
                if (RewardActionBarControl.this.uJ != null && !RewardActionBarControl.this.uP && RewardActionBarControl.this.uJ.g(RewardActionBarControl.this.uM)) {
                    com.kwad.sdk.core.e.c.d("ActionBarControl", "showWebActionBar success on " + RewardActionBarControl.this.uN);
                    return;
                }
                com.kwad.sdk.core.e.c.d("ActionBarControl", "showWebActionBar out " + RewardActionBarControl.this.uN);
                com.kwad.components.core.p.a.pC().i(RewardActionBarControl.this.mAdTemplate, RewardActionBarControl.this.uN);
                com.kwad.components.ad.reward.monitor.a.a(RewardActionBarControl.this.qB.pn, "play_card", com.kwad.sdk.core.response.b.b.aZ(RewardActionBarControl.this.qB.mAdTemplate), RewardActionBarControl.this.uN, 1);
                RewardActionBarControl.this.R(true);
            }
        }, this.uN);
    }

    public final void a(b bVar) {
        this.uF = bVar;
    }

    public final void a(c cVar) {
        this.uK = cVar;
    }

    public final void a(d dVar) {
        this.uL = dVar;
    }

    public final void a(e eVar) {
        this.uJ = eVar;
    }

    public final void a(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
        this.uM.c(aVar);
    }

    public final void b(com.kwad.components.ad.reward.presenter.platdetail.actionbar.a aVar) {
        this.uM.d(aVar);
    }

    public final void io() {
        if (this.uO) {
            com.kwad.sdk.core.e.c.i("ActionBarControl", "showWebActionBar time out on pageStatus");
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        Q(true);
    }

    public final ShowActionBarResult ip() {
        return this.uM.uV;
    }
}
