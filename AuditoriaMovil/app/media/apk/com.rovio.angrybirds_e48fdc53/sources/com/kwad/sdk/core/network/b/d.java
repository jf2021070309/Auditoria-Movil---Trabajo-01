package com.kwad.sdk.core.network.b;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.kwad.sdk.core.network.j;
import com.kwad.sdk.core.network.k;
import com.kwad.sdk.core.network.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.s;
import java.util.Random;
import okhttp3.internal.Version;
/* loaded from: classes.dex */
public final class d implements b {
    private static boolean aqg = true;
    public static double aqh = 1.0d;
    private static volatile boolean aql = false;
    private static String aqm = "";
    private long aqi = -1;
    private long aqj = -1;
    private long aqk = -1;
    private k aqn = new k();

    public d() {
        aqh = new Random().nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: BA */
    public d Br() {
        this.aqn.apy = SystemClock.elapsedRealtime();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: BB */
    public d Bs() {
        this.aqj = SystemClock.elapsedRealtime();
        dk("this.responseReceiveTime:" + this.aqj);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: BC */
    public d Bt() {
        if (Y(this.aqi) && Y(this.aqj)) {
            this.aqn.apF = this.aqj - this.aqi;
            dk("info.waiting_response_cost:" + this.aqn.apF);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: BD */
    public d Bu() {
        if (Y(this.aqn.apy)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.aqi = elapsedRealtime;
            k kVar = this.aqn;
            kVar.aps = elapsedRealtime - kVar.apy;
            if (Y(this.aqn.apq)) {
                k kVar2 = this.aqn;
                kVar2.apr = kVar2.aps - this.aqn.apq;
            }
            dk("info.request_create_cost:" + this.aqn.aps);
            dk("info.requestAddParamsCost:" + this.aqn.apr);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: BE */
    public d Bw() {
        if (Y(this.aqj)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.aqk = elapsedRealtime;
            this.aqn.apD = elapsedRealtime - this.aqj;
            dk("info.response_parse_cost:" + this.aqn.apD);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: BF */
    public d Bx() {
        if (Y(this.aqk)) {
            this.aqn.apK = SystemClock.elapsedRealtime() - this.aqk;
            BG();
            dk("info.response_done_cost:" + this.aqn.apK);
        }
        return this;
    }

    private void BG() {
        k kVar = this.aqn;
        if (kVar == null || kVar.apJ != 1 || ab(this.aqn.apK)) {
            return;
        }
        this.aqn.apK = -1L;
    }

    private d BH() {
        this.aqn.apN = (int) com.kwad.sdk.ip.direct.a.FE();
        this.aqn.apO = (int) com.kwad.sdk.ip.direct.a.FF();
        this.aqn.apP = (int) com.kwad.sdk.ip.direct.a.FG();
        return this;
    }

    private void BI() {
        j b = b(this.aqn);
        l lVar = (l) ServiceProvider.get(l.class);
        if (lVar != null) {
            lVar.a(b);
        }
        dk("reportError" + b.toString());
    }

    private static String Bz() {
        if (aql) {
            return aqm;
        }
        try {
            aqm = Version.userAgent();
        } catch (Throwable th) {
            try {
                aqm = (String) s.c(Version.class, TTDownloadField.TT_USERAGENT);
            } catch (Exception e) {
            }
        }
        aql = true;
        return aqm;
    }

    private static boolean Y(long j) {
        return j != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: Z */
    public d X(long j) {
        this.aqn.apE = j;
        dk("responseSize:" + j);
        return this;
    }

    private d aa(long j) {
        this.aqn.apG = j;
        dk("totalCost:" + j);
        return this;
    }

    private static boolean ab(long j) {
        return j >= 50;
    }

    private static j b(k kVar) {
        j jVar = new j();
        jVar.errorMsg = kVar.errorMsg;
        jVar.host = kVar.host;
        jVar.httpCode = kVar.httpCode;
        jVar.apn = kVar.apn;
        jVar.url = kVar.url;
        jVar.apo = kVar.apo;
        jVar.app = kVar.app;
        return jVar;
    }

    private static boolean b(j jVar) {
        if (TextUtils.isEmpty(jVar.url)) {
            return true;
        }
        String lowerCase = jVar.url.toLowerCase();
        return lowerCase.contains("beta") || lowerCase.contains("test") || lowerCase.contains("staging");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: cd */
    public d bZ(int i) {
        this.aqn.httpCode = i;
        dk("http_code:" + i);
        return this;
    }

    private d ce(int i) {
        this.aqn.apJ = i;
        dk("hasData:" + i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: cf */
    public d cb(int i) {
        this.aqn.result = i;
        dk("result:" + i);
        return this;
    }

    private static void dk(String str) {
        if (aqg) {
            com.kwad.sdk.core.e.c.d("NetworkMonitorRecorder", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: dl */
    public d df(String str) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        this.aqn.url = str;
        if (str.contains("?")) {
            String[] split = str.split("\\?");
            if (split.length > 0) {
                str = split[0];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            dk("url:" + str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: dm */
    public d dg(String str) {
        try {
            Uri parse = Uri.parse(str);
            this.aqn.host = parse.getHost();
            dk("host:" + this.aqn.host);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.e("NetworkMonitorRecorder", Log.getStackTraceString(e));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: dn */
    public d dh(String str) {
        this.aqn.errorMsg = str;
        dk(str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: do  reason: not valid java name */
    public d di(String str) {
        this.aqn.apn = str;
        dk("reqType:" + str);
        dq(com.kwad.sdk.ip.direct.a.FD());
        BH();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.sdk.core.network.b.b
    /* renamed from: dp */
    public d dj(String str) {
        this.aqn.apI = str;
        dk("requestId:" + str);
        return this;
    }

    private d dq(String str) {
        this.aqn.apL = str;
        return this;
    }

    @Override // com.kwad.sdk.core.network.b.b
    public final b Bv() {
        if (Y(this.aqn.apy)) {
            this.aqn.apq = SystemClock.elapsedRealtime() - this.aqn.apy;
            dk("info.request_prepare_cost:" + this.aqn.apq);
        }
        return this;
    }

    @Override // com.kwad.sdk.core.network.b.b
    public final /* synthetic */ b ca(int i) {
        return ce(1);
    }

    @Override // com.kwad.sdk.core.network.b.b
    public final b cc(int i) {
        this.aqn.apM = i;
        if (i != 0) {
            this.aqn.apo = 1;
        }
        return this;
    }

    @Override // com.kwad.sdk.core.network.b.b
    public final void report() {
        if (b((j) this.aqn)) {
            return;
        }
        this.aqn.app = Bz();
        if (this.aqn.httpCode != 200) {
            BI();
            return;
        }
        long elapsedRealtime = Y(this.aqn.apy) ? SystemClock.elapsedRealtime() - this.aqn.apy : -1L;
        aa(elapsedRealtime);
        if (elapsedRealtime > 30000 || elapsedRealtime <= -1) {
            return;
        }
        l lVar = (l) ServiceProvider.get(l.class);
        if (lVar != null) {
            lVar.a(this.aqn);
        }
        dk("report normal" + this.aqn.toString());
    }
}
