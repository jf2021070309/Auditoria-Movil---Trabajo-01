package com.kwad.components.core.e.d;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.kwad.components.core.e.c.b;
import com.kwad.components.core.e.d.a;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.page.AdWebViewVideoActivityProxy;
import com.kwad.components.core.page.DownloadLandPageActivity;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.api.KsApkDownloadListener;
import com.kwad.sdk.api.KsAppDownloadListener;
import com.kwad.sdk.core.NetworkMonitor;
import com.kwad.sdk.core.diskcache.ApkCacheManager;
import com.kwad.sdk.core.download.f;
import com.kwad.sdk.core.report.a;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.ad;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.v;
import com.kwad.sdk.utils.w;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c implements NetworkMonitor.a, com.kwad.sdk.core.download.d, com.kwad.sdk.core.webview.a {
    private AdTemplate Kb;
    private long Kc;
    private boolean Kd;
    private a Ke;
    private DialogInterface.OnShowListener Kf;
    private List<KsAppDownloadListener> Kg;
    private boolean downloadPauseEnable;
    private AdInfo mAdInfo;
    private Handler mHandler;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private JSONObject mReportExtData;

    /* loaded from: classes.dex */
    public interface a {
        boolean handleDownloadDialog(DialogInterface.OnClickListener onClickListener);
    }

    public c(AdTemplate adTemplate) {
        this(adTemplate, null, null);
    }

    public c(AdTemplate adTemplate, KsAppDownloadListener ksAppDownloadListener) {
        this(adTemplate, null, ksAppDownloadListener);
    }

    public c(AdTemplate adTemplate, KsAppDownloadListener ksAppDownloadListener, String str, String str2) {
        this(adTemplate, null, null);
        this.mAdInfo.adConversionInfo.appDownloadUrl = str;
        this.mAdInfo.adBaseInfo.appPackageName = str2;
        this.mAdInfo.downloadId = ad.bq(str);
    }

    public c(AdTemplate adTemplate, JSONObject jSONObject) {
        this(adTemplate, jSONObject, null);
    }

    public c(AdTemplate adTemplate, JSONObject jSONObject, KsAppDownloadListener ksAppDownloadListener) {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.Kg = new ArrayList();
        this.Kb = adTemplate;
        this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.mReportExtData = jSONObject;
        if (ksAppDownloadListener != null) {
            b(ksAppDownloadListener);
        }
        nz();
        com.kwad.sdk.core.download.c.Av().a(this, this.Kb);
        com.kwad.sdk.core.download.c.Av().at(this.Kb);
        this.downloadPauseEnable = com.kwad.sdk.core.response.b.a.cm(com.kwad.sdk.core.response.b.d.ck(this.Kb));
        if (com.kwad.sdk.core.config.d.zF()) {
            NetworkMonitor.getInstance().a(KsAdSDKImpl.get().getContext(), this);
        }
        com.kwad.sdk.a.a.c.xY().an(this.Kb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(KsAppDownloadListener ksAppDownloadListener) {
        int i = this.mAdInfo.progress;
        int i2 = this.mAdInfo.status;
        if (i2 == 0) {
            ksAppDownloadListener.onIdle();
        } else if (i2 == 1) {
            ksAppDownloadListener.onProgressUpdate(0);
            if (ksAppDownloadListener instanceof com.kwad.sdk.core.download.a.a) {
                ((com.kwad.sdk.core.download.a.a) ksAppDownloadListener).onDownloadStarted();
                return;
            }
            try {
                ksAppDownloadListener.onDownloadStarted();
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            }
        } else if (i2 == 2 || i2 == 3) {
            ksAppDownloadListener.onProgressUpdate(i);
        } else if (i2 == 4) {
            if (ksAppDownloadListener instanceof com.kwad.sdk.core.download.a.a) {
                ((com.kwad.sdk.core.download.a.a) ksAppDownloadListener).onPaused(i);
            }
            try {
                if (ksAppDownloadListener instanceof KsApkDownloadListener) {
                    ((KsApkDownloadListener) ksAppDownloadListener).onPaused(i);
                }
            } catch (Throwable th2) {
            }
        } else if (i2 == 7) {
            ksAppDownloadListener.onDownloadFailed();
        } else if (i2 == 8 || i2 == 9) {
            ksAppDownloadListener.onDownloadFinished();
        } else if (i2 != 12) {
        } else {
            ksAppDownloadListener.onInstalled();
        }
    }

    private static void d(Context context, AdTemplate adTemplate) {
        if (context == null || adTemplate == null) {
            return;
        }
        DownloadLandPageActivity.launch(context, adTemplate, false);
    }

    private int n(a.C0197a c0197a) {
        Context context = c0197a.getContext();
        String cz = com.kwad.sdk.core.response.b.a.cz(this.mAdInfo);
        if (com.kwad.sdk.utils.d.a(context, cz, this.Kb)) {
            com.kwad.sdk.core.report.a.l(this.Kb, 1);
            return 0;
        } else if (com.kwad.sdk.utils.d.f(context, cz, com.kwad.sdk.core.response.b.a.aq(this.mAdInfo))) {
            com.kwad.sdk.core.report.a.l(this.Kb, 0);
            return 0;
        } else if (nK()) {
            return 0;
        } else {
            if (!ag.isNetworkConnected(context)) {
                v.L(context, w.bZ(context));
                return 0;
            } else if (c0197a.nw() && com.kwad.sdk.core.config.d.zh()) {
                return o(c0197a);
            } else {
                if (com.kwad.sdk.core.response.b.d.cA(this.Kb) && c0197a.ny() != 2) {
                    d(c0197a.getContext(), c0197a.getAdTemplate());
                    return 0;
                } else if (c0197a.ns()) {
                    return p(c0197a);
                } else {
                    if (q(c0197a)) {
                        return 0;
                    }
                    return nO();
                }
            }
        }
    }

    private boolean nD() {
        if (Build.VERSION.SDK_INT < 29) {
            if (this.Kb.mIsFromContent && com.kwad.sdk.core.config.d.yU()) {
                r1 = nM();
                if (r1) {
                    com.kwad.sdk.core.report.a.aB(this.Kb);
                }
            } else if (!this.Kb.mIsFromContent && com.kwad.sdk.core.config.d.zt()) {
                boolean ae = com.kwad.components.core.k.b.ae(KsAdSDKImpl.get().getContext());
                com.kwad.sdk.core.e.c.d("ApkDownloadHelper", "handleForceOpenApp enableForceOpen: " + ae);
                r1 = ae ? nM() : false;
                if (r1) {
                    com.kwad.sdk.core.report.a.aC(this.Kb);
                }
            }
        }
        return r1;
    }

    private void nE() {
        this.mHandler.post(new Runnable() { // from class: com.kwad.components.core.e.d.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList<KsAppDownloadListener> arrayList = new ArrayList(c.this.Kg.size());
                arrayList.addAll(c.this.Kg);
                for (KsAppDownloadListener ksAppDownloadListener : arrayList) {
                    if (ksAppDownloadListener != null) {
                        c.this.a(ksAppDownloadListener);
                    }
                }
            }
        });
    }

    private void nF() {
        String str = this.mAdInfo.adBaseInfo.appPackageName;
        Context context = KsAdSDKImpl.get().getContext();
        if (context == null) {
            return;
        }
        if (ak.ak(context, str)) {
            this.mAdInfo.status = 12;
            return;
        }
        if (this.mAdInfo.status == 12) {
            this.mAdInfo.status = 0;
            this.mAdInfo.progress = 0;
        }
        if (this.mAdInfo.status == 8 || this.mAdInfo.status == 9) {
            String str2 = this.mAdInfo.downloadFilePath;
            if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
                this.mAdInfo.status = 0;
                this.mAdInfo.progress = 0;
            }
        }
        if (this.mAdInfo.status == 0) {
            String B = com.kwad.sdk.core.download.a.B(this.mAdInfo);
            if (TextUtils.isEmpty(B) || !new File(B).exists()) {
                return;
            }
            this.mAdInfo.downloadFilePath = B;
            this.mAdInfo.status = 8;
        }
    }

    private boolean nH() {
        String str = this.mAdInfo.adConversionInfo.marketUrl;
        com.kwad.sdk.core.e.c.i("ApkDownloadHelper", "isMarKet URL Schema=" + str);
        boolean f = !TextUtils.isEmpty(str) ? com.kwad.sdk.utils.d.f(KsAdSDKImpl.get().getContext(), str, this.mAdInfo.adBaseInfo.appPackageName) : false;
        if (f) {
            com.kwad.sdk.core.report.a.l(this.Kb, 0);
        }
        return f;
    }

    private boolean nK() {
        a aVar = this.Ke;
        if (aVar != null) {
            return aVar.handleDownloadDialog(new DialogInterface.OnClickListener() { // from class: com.kwad.components.core.e.d.c.4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (i == -1) {
                        switch (c.this.mAdInfo.status) {
                            case 0:
                            case 1:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                c.this.nO();
                                return;
                            case 2:
                            case 3:
                            case 10:
                            default:
                                return;
                            case 8:
                            case 9:
                            case 11:
                                c.this.nN();
                                return;
                            case 12:
                                c.this.nL();
                                return;
                        }
                    }
                }
            });
        }
        return false;
    }

    private boolean nM() {
        Context context = KsAdSDKImpl.get().getContext();
        if (d.b(new a.C0197a(context).S(this.Kb), 1) == 1) {
            return true;
        }
        boolean am = ak.am(context, com.kwad.sdk.core.response.b.a.aq(this.mAdInfo));
        if (am) {
            com.kwad.sdk.core.report.a.aA(this.Kb);
        }
        return am;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nO() {
        com.kwad.sdk.core.download.a.C(this.mAdInfo);
        return 1;
    }

    private void nz() {
        com.kwad.sdk.core.download.c.Av();
        int cI = com.kwad.sdk.core.download.c.cI(nB());
        if (cI != 0) {
            this.mAdInfo.status = cI;
        }
        nF();
        nE();
    }

    private int o(a.C0197a c0197a) {
        Context context = c0197a.getContext();
        AdTemplate adTemplate = c0197a.getAdTemplate();
        int nx = c0197a.nx();
        if (nx != 1) {
            if (nx == 2 && com.kwad.sdk.core.response.b.b.bL(adTemplate)) {
                com.kwad.components.core.e.c.b.a(context, new b.a().R(adTemplate).am(com.kwad.sdk.core.response.b.b.bK(adTemplate)).a(this.Kf).c(this.mOnDismissListener).ng());
            }
            return 0;
        }
        return nO();
    }

    private int p(a.C0197a c0197a) {
        Context context = c0197a.getContext();
        AdTemplate adTemplate = c0197a.getAdTemplate();
        int s = s(c0197a);
        if (s == 1) {
            if (com.kwad.sdk.core.response.b.b.bL(adTemplate)) {
                com.kwad.components.core.e.c.b.a(context, new b.a().R(adTemplate).am(com.kwad.sdk.core.response.b.b.bK(adTemplate)).a(this.Kf).c(this.mOnDismissListener).ng());
            }
            return 0;
        } else if (s == 2) {
            d(c0197a.getContext(), c0197a.getAdTemplate());
            return 0;
        } else if (s == 3 || q(c0197a)) {
            return 0;
        } else {
            return nO();
        }
    }

    private boolean q(a.C0197a c0197a) {
        if (c0197a.nq() || this.mAdInfo.status == 4 || !com.kwad.sdk.core.response.b.b.bO(this.Kb) || !r(c0197a)) {
            return false;
        }
        return com.kwad.components.core.e.c.b.a(c0197a.getContext(), new b.a().R(this.Kb).am(com.kwad.sdk.core.response.b.b.bN(this.Kb)).a(this.Kf).c(this.mOnDismissListener).ng());
    }

    private static boolean r(a.C0197a c0197a) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(c0197a.getAdTemplate());
        if (com.kwad.sdk.core.response.b.a.bk(ck) && (DownloadLandPageActivity.showingAdWebViewLandPage || AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity || c0197a.getAdTemplate().isWebViewDownload)) {
            return true;
        }
        return com.kwad.sdk.core.response.b.a.bl(ck) && !ag.isWifiConnected(c0197a.getContext());
    }

    public static int s(a.C0197a c0197a) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(c0197a.getAdTemplate());
        if (ck.downloadSafeInfo.complianceInfo != null) {
            int cW = c0197a.cW();
            return cW != 2 ? cW != 3 ? ck.downloadSafeInfo.complianceInfo.actionBarType : ck.downloadSafeInfo.complianceInfo.materialJumpType : ck.downloadSafeInfo.complianceInfo.describeBarType;
        }
        return 0;
    }

    public final void a(a aVar) {
        this.Ke = aVar;
    }

    @Override // com.kwad.sdk.core.NetworkMonitor.a
    public final void a(NetworkMonitor.NetworkState networkState) {
        if (this.mAdInfo.status == 7 && networkState == NetworkMonitor.NetworkState.NETWORK_WIFI) {
            nO();
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, int i, int i2, int i3) {
        if (this.mAdInfo.downloadId.equals(str)) {
            this.mAdInfo.status = 3;
            this.mAdInfo.progress = i;
            this.mAdInfo.soFarBytes = i2;
            this.mAdInfo.totalBytes = i3;
            nE();
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, int i, f fVar) {
        final boolean z;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.Kb);
        if (fVar.Ay()) {
            com.kwad.sdk.core.report.a.ay(this.Kb);
            fVar.Ax();
            z = nD();
            com.kwad.sdk.a.a.c.xY().aq(this.Kb);
            com.kwad.sdk.a.a.c.xY().ao(this.Kb);
            com.kwad.sdk.a.a.b.xV().aj(this.Kb);
        } else {
            z = false;
        }
        g.execute(new Runnable() { // from class: com.kwad.components.core.e.d.c.2
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
            }
        });
        com.kwad.sdk.core.a.yQ().cr(ck.downloadId);
        this.mAdInfo.status = 12;
        nE();
        com.kwad.components.core.e.a.e.mR().O(this.Kb);
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, int i, String str2, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            this.mAdInfo.status = 7;
            nE();
            if (fVar.Ay()) {
                a.C0258a c0258a = new a.C0258a(i, str2);
                com.kwad.sdk.core.report.a.a(this.Kb, c0258a);
                com.kwad.components.core.p.a.pC().a(this.Kb, this.mAdInfo.adConversionInfo.appDownloadUrl, c0258a.toJson().toString());
                fVar.Ax();
            }
            if (this.mAdInfo.adConversionInfo.retryH5TimeStep <= 0 || this.Kd || System.currentTimeMillis() - this.Kc >= this.mAdInfo.adConversionInfo.retryH5TimeStep || TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aK(this.mAdInfo))) {
                return;
            }
            AdWebViewActivityProxy.launch(KsAdSDKImpl.get().getContext(), this.Kb);
            this.Kd = true;
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            if (this.mAdInfo.status != 1) {
                if (fVar.Ay()) {
                    com.kwad.sdk.core.report.a.ax(this.Kb);
                    fVar.Ax();
                }
                this.Kc = System.currentTimeMillis();
            }
            this.mAdInfo.status = 1;
            nE();
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void a(String str, String str2, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            this.mAdInfo.downloadFilePath = str2;
            this.mAdInfo.progress = 100;
            if (this.mAdInfo.status != 8 && !this.Kb.mDownloadFinishReported) {
                g.execute(new Runnable() { // from class: com.kwad.components.core.e.d.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
                    }
                });
                if (fVar.Ay()) {
                    com.kwad.sdk.core.report.a.e(this.Kb, this.mReportExtData);
                    fVar.Ax();
                }
                com.kwad.sdk.a.a.c.xY().ap(this.Kb);
                com.kwad.sdk.a.a.c.xY().an(this.Kb);
                com.kwad.sdk.a.a.b.xV().ai(this.Kb);
                this.Kb.mDownloadFinishReported = true;
            }
            this.mAdInfo.status = 8;
            nE();
            ApkCacheManager.getInstance().Ai();
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void ao(String str) {
        if (this.mAdInfo.downloadId.equals(str)) {
            com.kwad.sdk.core.report.a.az(this.Kb);
        }
    }

    public final void ar(int i) {
        this.Kb.downloadSource = i;
    }

    public final void b(final KsAppDownloadListener ksAppDownloadListener) {
        if (ksAppDownloadListener == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mHandler.post(new Runnable() { // from class: com.kwad.components.core.e.d.c.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.Kg.contains(ksAppDownloadListener)) {
                        return;
                    }
                    c.this.Kg.add(0, ksAppDownloadListener);
                }
            });
        } else if (!this.Kg.contains(ksAppDownloadListener)) {
            this.Kg.add(0, ksAppDownloadListener);
        }
        nF();
        a(ksAppDownloadListener);
    }

    @Override // com.kwad.sdk.core.download.d
    public final void b(String str, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            if (this.mAdInfo.status != 4 && fVar.Ay()) {
                com.kwad.sdk.core.report.a.c(this.Kb, this.mReportExtData);
                fVar.Ax();
            }
            this.mAdInfo.status = 4;
            nE();
        }
    }

    public final void c(final KsAppDownloadListener ksAppDownloadListener) {
        if (ksAppDownloadListener == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.Kg.remove(ksAppDownloadListener);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.kwad.components.core.e.d.c.7
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.Kg.remove(ksAppDownloadListener);
                }
            });
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void c(String str, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            if (this.mAdInfo.status != 2 && fVar.Ay()) {
                com.kwad.sdk.core.report.a.d(this.Kb, this.mReportExtData);
                fVar.Ax();
            }
            this.mAdInfo.status = 2;
            nE();
        }
    }

    public final void clear() {
        nP();
        com.kwad.sdk.core.download.c.Av().a(this);
        if (com.kwad.sdk.core.config.d.zF()) {
            NetworkMonitor.getInstance().a(this);
        }
    }

    public final void d(KsAppDownloadListener ksAppDownloadListener) {
        if (ksAppDownloadListener == null) {
            return;
        }
        nF();
        a(ksAppDownloadListener);
    }

    @Override // com.kwad.sdk.core.download.d
    public final void d(String str, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            if (this.mAdInfo.status != 5 && fVar.Ay()) {
                com.kwad.sdk.core.report.a.f(this.Kb, this.mReportExtData);
                fVar.Ax();
            }
            this.mAdInfo.status = 5;
            nE();
        }
    }

    @Override // com.kwad.sdk.core.download.d
    public final void e(String str, f fVar) {
        if (this.mAdInfo.downloadId.equals(str)) {
            if (fVar.Ay()) {
                com.kwad.sdk.core.report.a.i(this.Kb, 2);
                fVar.Ax();
            }
            this.mAdInfo.status = 9;
            nE();
        }
    }

    public final int m(a.C0197a c0197a) {
        this.Kd = false;
        nF();
        switch (this.mAdInfo.status) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 7:
                return n(c0197a);
            case 2:
            case 3:
                if (c0197a.no() && this.downloadPauseEnable) {
                    com.kwad.sdk.core.download.a.cG(this.mAdInfo.downloadId);
                    return 0;
                }
                return 0;
            case 4:
                return nO();
            case 8:
            case 9:
            case 11:
                nN();
                return 0;
            case 10:
            default:
                return 0;
            case 12:
                nL();
                return 0;
        }
    }

    public final int nA() {
        nF();
        if (this.mAdInfo.status == 3) {
            return 2;
        }
        return this.mAdInfo.status;
    }

    @Override // com.kwad.sdk.core.download.d
    public final String nB() {
        return this.mAdInfo.downloadId;
    }

    @Override // com.kwad.sdk.core.download.d
    public final String nC() {
        return this.mAdInfo.adBaseInfo.appPackageName;
    }

    public final boolean nG() {
        switch (this.mAdInfo.status) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                return nH();
            case 2:
            case 3:
            case 10:
            default:
                return false;
            case 8:
            case 9:
            case 11:
                nN();
                return true;
            case 12:
                nL();
                return true;
        }
    }

    public final AdTemplate nI() {
        return this.Kb;
    }

    public final boolean nJ() {
        if (this.mAdInfo.status == 0) {
            return nH();
        }
        return false;
    }

    public final void nL() {
        g.execute(new Runnable() { // from class: com.kwad.components.core.e.d.c.5
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
            }
        });
        if (ak.am(KsAdSDKImpl.get().getContext(), com.kwad.sdk.core.response.b.a.aq(this.mAdInfo))) {
            com.kwad.sdk.core.report.a.aA(this.Kb);
        }
    }

    public final void nN() {
        if (ak.an(KsAdSDKImpl.get().getContext(), this.mAdInfo.downloadFilePath)) {
            com.kwad.sdk.core.report.a.i(this.Kb, 1);
        }
    }

    @Override // com.kwad.sdk.core.webview.a
    public final void nP() {
        List<KsAppDownloadListener> list = this.Kg;
        if (list != null) {
            list.clear();
        }
    }

    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.Kf = onShowListener;
    }
}
