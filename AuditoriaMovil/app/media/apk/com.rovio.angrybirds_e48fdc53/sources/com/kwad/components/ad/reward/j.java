package com.kwad.components.ad.reward;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.components.ad.reward.KSRewardVideoActivityProxy;
import com.kwad.components.ad.reward.j.r;
import com.kwad.components.ad.reward.k;
import com.kwad.components.ad.reward.presenter.platdetail.actionbar.RewardActionBarControl;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.i.a;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.b.c.d;
import com.kwad.components.offline.api.core.adlive.IAdLiveOfflineView;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsVideoPlayConfig;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.utils.bi;
import com.kwad.sdk.utils.bj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j extends com.kwad.components.core.l.a {
    public boolean fz;
    public com.kwad.components.ad.reward.e.b mAdOpenInteractionListener;
    public com.kwad.components.ad.reward.e.d mAdRewardStepListener;
    public com.kwad.components.core.e.d.c mApkDownloadHelper;
    public boolean mCheckExposureResult;
    private Handler mHandler;
    public long mPageEnterTime;
    public JSONObject mReportExtData;
    private boolean mRewardVerifyCalled;
    public AdBaseFrameLayout mRootContainer;
    public int mScreenOrientation;
    public bi mTimerHelper;
    public KsVideoPlayConfig mVideoPlayConfig;
    public boolean oY;
    public com.kwad.components.ad.reward.l.d oZ;
    private boolean pA;
    private List<DialogInterface.OnDismissListener> pB;
    public com.kwad.components.ad.reward.e.m pC;
    public boolean pD;
    public com.kwad.components.ad.reward.k.b.a pE;
    public com.kwad.components.ad.reward.k.a.a pF;
    public int pG;
    private int pH;
    public long pI;
    public long pJ;
    public boolean pK;
    private boolean pL;
    private boolean pM;
    public boolean pN;
    public boolean pO;
    public boolean pP;
    public LoadStrategy pQ;
    private RewardRenderResult pR;
    private List<a> pS;
    private List<b> pT;
    private List<a.InterfaceC0202a> pU;
    public IAdLiveOfflineView pa;
    public com.kwad.components.core.playable.a pb;
    public RewardActionBarControl pc;
    public l pd;
    public com.kwad.components.ad.k.a pe;
    public g pf;
    private final PriorityQueue<com.kwad.components.ad.reward.e.f> pg;
    public final List<com.kwad.components.ad.reward.j.a> ph;
    private final List<r> pi;
    public Set<com.kwad.components.ad.reward.e.e> pj;
    private com.kwad.components.core.webview.b.e.a pk;
    private boolean pl;
    private boolean pm;
    public boolean pn;
    public boolean po;
    public boolean pp;
    public boolean pq;
    private boolean pr;
    public boolean ps;
    public boolean pt;
    public List<Integer> pu;
    public int pv;
    public boolean pw;
    public com.kwad.components.ad.reward.m.p px;
    public boolean py;
    private PlayableSource pz;

    /* loaded from: classes.dex */
    public interface a {
        void gl();

        void gm();

        void gn();

        void go();
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean interceptPlayCardResume();
    }

    public j(com.kwad.components.core.l.b<?> bVar) {
        super(bVar);
        this.oY = false;
        this.pg = new PriorityQueue<>();
        this.ph = new CopyOnWriteArrayList();
        this.pi = new CopyOnWriteArrayList();
        this.pj = new HashSet();
        this.pl = false;
        this.pm = false;
        this.po = false;
        this.pp = false;
        this.pq = false;
        this.pr = false;
        this.ps = false;
        this.mRewardVerifyCalled = false;
        this.pt = false;
        this.pu = new ArrayList();
        this.mCheckExposureResult = true;
        this.pv = 0;
        this.pw = false;
        this.py = false;
        this.pz = null;
        this.pA = false;
        this.pB = new CopyOnWriteArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.pD = false;
        this.pH = 2;
        this.pL = false;
        this.pM = false;
        this.pN = false;
        this.pO = false;
        this.pP = false;
        this.pQ = LoadStrategy.FULL_TK;
        this.pS = new CopyOnWriteArrayList();
        this.pT = new CopyOnWriteArrayList();
        this.pU = new CopyOnWriteArrayList();
        this.Lm.add(new com.kwad.components.core.l.a.a() { // from class: com.kwad.components.ad.reward.j.1
            @Override // com.kwad.components.core.l.a.a
            public final void c(com.kwad.components.core.o.c cVar) {
                j.this.fN();
            }

            @Override // com.kwad.components.core.l.a.a
            public final void d(com.kwad.components.core.o.c cVar) {
                j.this.fO();
            }

            @Override // com.kwad.components.core.l.a.a
            public final void gg() {
                j.this.fM();
            }

            @Override // com.kwad.components.core.l.a.a
            public final void gh() {
                j.this.fP();
            }
        });
    }

    public static long a(long j, AdInfo adInfo) {
        return Math.min(com.kwad.sdk.core.response.b.a.Y(adInfo), j);
    }

    public static com.kwad.components.core.i.c a(List<com.kwad.components.core.i.c> list, long j) {
        if (j >= 0 && list != null) {
            for (com.kwad.components.core.i.c cVar : list) {
                if (com.kwad.sdk.core.response.b.d.cu(cVar.getAdTemplate()) == j) {
                    return cVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, com.kwad.sdk.core.report.j jVar) {
        if (jVar == null) {
            jVar = new com.kwad.sdk.core.report.j();
        }
        jVar.cg(i);
        jVar.c(this.mRootContainer.getTouchCoords());
        com.kwad.components.ad.reward.i.b.a(this.mAdTemplate, (String) null, (String) null, jVar, this.mReportExtData);
        com.kwad.components.ad.reward.c.a.gY().d(this.mAdTemplate, com.kwad.components.ad.reward.c.b.STATUS_NONE);
        this.mAdOpenInteractionListener.bF();
    }

    public static void a(Activity activity, j jVar) {
        com.kwad.sdk.core.e.c.d("RewardCallerContext", "showExtraDialog");
        com.kwad.components.ad.reward.j.a.b.a(jVar, activity, jVar.oZ.getPlayDuration(), new DialogInterface.OnDismissListener() { // from class: com.kwad.components.ad.reward.j.2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                j.this.d(dialogInterface);
                com.kwad.sdk.core.c.b.AT();
                Activity currentActivity = com.kwad.sdk.core.c.b.getCurrentActivity();
                if (currentActivity == null || !currentActivity.equals(j.this.getActivity())) {
                    return;
                }
                j.this.oZ.resume();
            }
        }, new k.b() { // from class: com.kwad.components.ad.reward.j.3
            @Override // com.kwad.components.ad.reward.k.b, com.kwad.components.core.webview.b.e.c
            public final void gi() {
                j.this.oZ.pause();
            }
        });
    }

    public static void a(Context context, j jVar, ViewGroup viewGroup) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate);
        com.kwad.components.core.n.a.a.a aVar = (com.kwad.components.core.n.a.a.a) com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.a.a.class);
        if (aVar != null && aVar.oi() && com.kwad.sdk.core.response.b.a.cw(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate))) {
            IAdLiveOfflineView view = aVar.getView(context, com.kwad.sdk.core.response.b.a.aX(ck) == 8 ? 1 : 0);
            View view2 = view.getView();
            jVar.pa = view;
            viewGroup.addView(view2);
            jVar.oZ.a(jVar.mAdTemplate, aVar.getAdLivePlayModule(view, KsAdSDKImpl.get().getAppId(), String.valueOf(com.kwad.sdk.core.response.b.a.bR(ck))));
        }
    }

    public static void a(j jVar, final k.c cVar, final k.a aVar) {
        if (!jVar.oZ.jT()) {
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate);
            r1 = com.kwad.components.ad.reward.a.b.j(ck) || com.kwad.sdk.core.response.b.a.bN(ck) == 2 ? f(jVar) : null;
            if (r1 == null) {
                r1 = g(jVar);
            }
        }
        com.kwad.components.ad.reward.j.a.b bVar = r1;
        if (bVar != null) {
            com.kwad.components.ad.reward.j.a.b.a(bVar, jVar.getActivity(), jVar.oZ.getPlayDuration(), aVar, new d.a() { // from class: com.kwad.components.ad.reward.j.10
                @Override // com.kwad.components.core.webview.b.c.d.a
                public final boolean gk() {
                    j.b(j.this, cVar, aVar);
                    return true;
                }
            });
        } else {
            b(jVar, cVar, aVar);
        }
    }

    public static <T> void a(List<T> list, com.kwad.sdk.g.a<T> aVar) {
        if (list != null) {
            for (T t : list) {
                aVar.accept(t);
            }
        }
    }

    public static boolean a(j jVar) {
        AdMatrixInfo.FullScreenInfo bQ;
        return (!com.kwad.sdk.core.config.d.zq() || com.kwad.sdk.core.response.b.a.aV(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate)) || (bQ = com.kwad.sdk.core.response.b.b.bQ(jVar.mAdTemplate)) == null || bQ.renderType != 1 || com.kwad.sdk.core.response.b.a.aR(jVar.mAdTemplate)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(j jVar, k.c cVar, k.a aVar) {
        boolean e = e(jVar);
        com.kwad.sdk.core.e.c.d("RewardCallerContext", "showNativeCloseDialog isCloseDialogShowing: " + e);
        if (e) {
            return;
        }
        k.a(jVar.getActivity(), jVar.mAdTemplate, cVar, aVar);
    }

    public static boolean b(j jVar) {
        boolean z = false;
        if (jVar.oZ.jT() || !com.kwad.sdk.core.config.d.zq() || com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.c.c.class) == null) {
            return false;
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate);
        boolean z2 = (com.kwad.sdk.core.response.b.a.cq(ck) || (com.kwad.sdk.core.response.b.a.bv(ck) && com.kwad.components.ad.reward.a.b.gL()) || com.kwad.sdk.core.response.b.d.cw(jVar.mAdTemplate)) ? false : true;
        jVar.pp = z2 && !jVar.pO;
        if (z2 && !jVar.pO) {
            z = true;
        }
        jVar.B(z);
        return z2;
    }

    public static boolean c(j jVar) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate);
        boolean z = false;
        if (jVar.oZ.jT() || com.kwad.sdk.core.response.b.a.cw(ck) || !com.kwad.sdk.core.config.d.zq() || com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.c.c.class) == null || a(jVar)) {
            return false;
        }
        boolean z2 = com.kwad.components.ad.reward.a.b.j(ck) || !(com.kwad.components.ad.reward.a.b.i(ck) || com.kwad.sdk.core.response.b.d.cx(jVar.mAdTemplate) || com.kwad.sdk.core.response.b.a.cq(ck));
        if (z2 && !jVar.pO) {
            z = true;
        }
        jVar.pp = z;
        return z2;
    }

    public static boolean d(j jVar) {
        if (jVar.oZ.jT() || !com.kwad.sdk.core.config.d.zq() || com.kwad.sdk.components.c.f(com.kwad.components.core.n.a.c.c.class) == null || jVar.pN) {
            return false;
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate);
        if (com.kwad.sdk.core.response.b.a.cA(ck)) {
            return true;
        }
        return (t(jVar.mAdTemplate) || u(jVar.mAdTemplate) || !(com.kwad.components.ad.reward.a.b.j(ck) || (!com.kwad.components.ad.reward.a.b.i(ck) && !com.kwad.sdk.core.response.b.a.cq(ck) && !(com.kwad.sdk.core.response.b.a.bv(ck) && com.kwad.components.ad.reward.a.b.gL()) && !com.kwad.sdk.core.response.b.d.cx(jVar.mAdTemplate) && !com.kwad.sdk.core.response.b.a.aR(jVar.mAdTemplate)))) ? false : true;
    }

    public static boolean e(j jVar) {
        return jVar.pl;
    }

    private static com.kwad.components.ad.reward.j.a.b f(j jVar) {
        d.b bVar = new d.b();
        bVar.setAdTemplate(jVar.mAdTemplate);
        bVar.aP("ksad-video-confirm-card");
        bVar.aP(false);
        bVar.aQ(true);
        return com.kwad.components.ad.reward.j.a.b.a(jVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fM() {
        for (a aVar : this.pS) {
            aVar.gl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fN() {
        if (this.pm || this.pl || this.pL) {
            return;
        }
        boolean z = false;
        for (b bVar : this.pT) {
            z |= bVar.interceptPlayCardResume();
        }
        if (z) {
            return;
        }
        for (a aVar : this.pS) {
            aVar.gm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fO() {
        for (a aVar : this.pS) {
            aVar.gn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fP() {
        for (a aVar : this.pS) {
            aVar.go();
        }
    }

    private void fS() {
        this.pg.clear();
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.clear();
        }
        l lVar = this.pd;
        if (lVar != null) {
            lVar.release();
        }
        g gVar = this.pf;
        if (gVar != null) {
            gVar.release();
        }
        Set<com.kwad.components.ad.reward.e.e> set = this.pj;
        if (set != null) {
            set.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fU() {
        int size = this.pg.size();
        for (int i = 0; i < size; i++) {
            com.kwad.components.ad.reward.e.f poll = this.pg.poll();
            if (poll != null) {
                poll.bE();
            }
        }
    }

    private static com.kwad.components.ad.reward.j.a.b g(j jVar) {
        if (com.kwad.sdk.core.response.b.a.bN(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate)) == 4 || com.kwad.sdk.core.response.b.a.bN(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate)) == 3) {
            d.b bVar = new d.b();
            bVar.setAdTemplate(jVar.mAdTemplate);
            bVar.aP("ksad-video-confirm-card");
            bVar.aP(false);
            bVar.aQ(true);
            return com.kwad.components.ad.reward.j.a.b.a(jVar, bVar);
        }
        return null;
    }

    public static boolean g(AdInfo adInfo) {
        return com.kwad.sdk.core.response.b.b.g(adInfo) && !com.kwad.components.ad.reward.a.b.k(adInfo);
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean t(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.d.f(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
    }

    public static boolean u(AdTemplate adTemplate) {
        return com.kwad.sdk.core.response.b.d.u(adTemplate);
    }

    public static boolean v(AdTemplate adTemplate) {
        if (com.kwad.sdk.core.response.b.a.cA(com.kwad.sdk.core.response.b.d.ck(adTemplate))) {
            return false;
        }
        return t(adTemplate) || u(adTemplate);
    }

    public final void A(boolean z) {
        this.pM = z;
    }

    public final void B(boolean z) {
        this.pr = z;
    }

    public final void C(boolean z) {
        this.pA = true;
    }

    public final void D(boolean z) {
        this.pL = true;
    }

    public final void E(boolean z) {
        this.pl = z;
    }

    public final void F(final boolean z) {
        if (z != this.mRewardVerifyCalled) {
            a(this.pi, new com.kwad.sdk.g.a<r>() { // from class: com.kwad.components.ad.reward.j.9
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.kwad.sdk.g.a
                /* renamed from: c */
                public void accept(r rVar) {
                    rVar.ab(z);
                }
            });
        }
        this.mRewardVerifyCalled = z;
    }

    public final void G(String str) {
        int i = -1;
        try {
            if (com.kwad.sdk.core.config.d.xM()) {
                i = com.kwad.components.ad.reward.i.a.a(getActivity());
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        com.kwad.components.ad.reward.i.b.a(this.mContext, this.mAdTemplate, str, i, this.mReportExtData);
    }

    public final void K(int i) {
        this.pH = i;
    }

    public final void a(int i, Context context, int i2, int i3) {
        b(i, context, i2, i3);
    }

    public final void a(int i, Context context, int i2, int i3, long j) {
        a(1, context, 40, 1, j, false, null);
    }

    public final void a(int i, Context context, final int i2, int i3, long j, boolean z, final com.kwad.sdk.core.report.j jVar) {
        com.kwad.components.core.e.d.a.a(new a.C0197a(context).S(this.mAdTemplate).b(this.mApkDownloadHelper).al(false).ao(i3).s(j).an(i2).am(i).an(fR()).a(new Callable<String>() { // from class: com.kwad.components.ad.reward.j.6
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: gj */
            public String call() {
                return j.this.oZ.jU().getCurrentShowShopItemInfo().itemId;
            }
        }).a(new a.b() { // from class: com.kwad.components.ad.reward.j.5
            @Override // com.kwad.components.core.e.d.a.b
            public final void onAdClicked() {
                j.this.a(i2, jVar);
            }
        }));
    }

    public final void a(long j, long j2, int i) {
        for (com.kwad.components.ad.reward.e.e eVar : this.pj) {
            eVar.bZ();
        }
    }

    public final void a(DialogInterface.OnDismissListener onDismissListener) {
        this.pB.add(onDismissListener);
    }

    public final void a(RewardRenderResult rewardRenderResult) {
        this.pR = rewardRenderResult;
    }

    public final void a(com.kwad.components.ad.reward.e.m mVar) {
        this.pC = mVar;
    }

    public final void a(a aVar) {
        this.pS.add(aVar);
    }

    public final void a(b bVar) {
        this.pT.add(bVar);
    }

    public final void a(com.kwad.components.ad.reward.j.a aVar) {
        this.ph.add(aVar);
    }

    public final void a(r rVar) {
        this.pi.add(rVar);
    }

    public final void a(a.InterfaceC0202a interfaceC0202a) {
        List<a.InterfaceC0202a> list = this.pU;
        if (list != null) {
            list.add(interfaceC0202a);
        }
    }

    public final void a(final com.kwad.components.core.i.c cVar) {
        final com.kwad.components.core.i.d C = KSRewardVideoActivityProxy.a.C(this.mAdTemplate.getUniqueId());
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.j.7
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.components.core.i.d dVar = C;
                if (dVar != null) {
                    dVar.c(cVar);
                }
            }
        });
    }

    public final void a(com.kwad.components.core.webview.b.e.a aVar) {
        this.pk = aVar;
    }

    public final void b(int i, Context context, int i2, int i3) {
        a(i, context, i2, i3, 0L, false, null);
    }

    public final void b(DialogInterface.OnDismissListener onDismissListener) {
        this.pB.remove(onDismissListener);
    }

    public final void b(com.kwad.components.ad.reward.c.b bVar) {
        com.kwad.components.ad.reward.c.a.gY().a(this.mAdTemplate, bVar);
    }

    public final void b(com.kwad.components.ad.reward.e.f fVar) {
        this.pg.offer(fVar);
    }

    public final void b(a aVar) {
        this.pS.remove(aVar);
    }

    public final void b(b bVar) {
        this.pT.remove(bVar);
    }

    public final void b(com.kwad.components.ad.reward.j.a aVar) {
        this.ph.remove(aVar);
    }

    public final void b(r rVar) {
        this.pi.remove(rVar);
    }

    public final void b(a.InterfaceC0202a interfaceC0202a) {
        List<a.InterfaceC0202a> list = this.pU;
        if (list != null) {
            list.remove(interfaceC0202a);
        }
    }

    public final void b(final com.kwad.components.core.i.c cVar) {
        final com.kwad.components.core.i.d C = KSRewardVideoActivityProxy.a.C(this.mAdTemplate.getUniqueId());
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.ad.reward.j.8
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.components.core.i.d dVar = C;
                if (dVar != null) {
                    dVar.d(cVar);
                }
            }
        });
    }

    public final void c(com.kwad.components.ad.reward.e.f fVar) {
        this.pg.remove(fVar);
    }

    public final void c(final boolean z, final boolean z2) {
        if (this.oZ.jT()) {
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.j.11
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.oZ.jU().setAudioEnabled(z, z2);
                }
            }, 500L);
        }
    }

    public final void d(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.pB) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public final void d(PlayableSource playableSource) {
        this.pz = playableSource;
    }

    public final boolean fQ() {
        return this.pm;
    }

    public final String fR() {
        if (this.mAdTemplate.tkLiveShopItemInfo == null) {
            return null;
        }
        return this.mAdTemplate.tkLiveShopItemInfo.itemId;
    }

    public final void fT() {
        if (isMainThread()) {
            fU();
        } else {
            this.mHandler.post(new Runnable() { // from class: com.kwad.components.ad.reward.j.4
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.fU();
                }
            });
        }
    }

    public final boolean fV() {
        return this.pM;
    }

    public final void fW() {
        com.kwad.components.core.webview.b.e.a aVar = this.pk;
        if (aVar == null) {
            return;
        }
        aVar.cl();
    }

    public final boolean fX() {
        return this.pr;
    }

    public final PlayableSource fY() {
        return this.pz;
    }

    public final boolean fZ() {
        return this.pA;
    }

    public final List<a.InterfaceC0202a> ga() {
        return this.pU;
    }

    public final RewardRenderResult gb() {
        return this.pR;
    }

    public final boolean gc() {
        return this.pL;
    }

    public final boolean gd() {
        return this.pl;
    }

    public final boolean ge() {
        return this.mRewardVerifyCalled;
    }

    public final void gf() {
        long j = this.pJ;
        com.kwad.sdk.core.report.a.d(this.mAdTemplate, com.kwad.sdk.core.response.b.a.W(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)), j != 0 ? (int) (j / 1000) : 0);
    }

    @Override // com.kwad.components.core.l.a, com.kwad.sdk.mvp.a
    public final void release() {
        fS();
        this.oZ.release();
    }

    public final void z(boolean z) {
        this.pm = z;
        if (z) {
            fO();
        } else {
            fN();
        }
    }
}
