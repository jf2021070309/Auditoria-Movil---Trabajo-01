package com.kwad.sdk.core.report;

import android.text.TextUtils;
import androidx.renderscript.ScriptIntrinsicBLAS;
import com.kwad.sdk.api.model.AdExposureFailedReason;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.ak;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private static ExecutorService aqD = GlobalThreadPools.CU();
    public static JSONObject aqE;
    public static boolean aqF;

    /* renamed from: com.kwad.sdk.core.report.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0258a extends com.kwad.sdk.core.response.a.a {
        public int code;
        public String msg;

        public C0258a(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }

    private static int BM() {
        return ai.IL() ? 2 : 1;
    }

    private static boolean D(AdInfo adInfo) {
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        if (eVar == null) {
            return false;
        }
        String aq = com.kwad.sdk.core.response.b.a.aq(adInfo);
        if (TextUtils.isEmpty(aq)) {
            return false;
        }
        return ak.ak(eVar.getContext(), aq);
    }

    public static void a(AdTemplate adTemplate, int i, long j, int i2, long j2, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.vC = j;
        bVar.atC = i2;
        bVar.atb = i;
        z.a aVar = new z.a();
        aVar.duration = j2;
        bVar.atA = aVar;
        b(adTemplate, 3, bVar, (JSONObject) null);
    }

    @Deprecated
    public static void a(AdTemplate adTemplate, int i, long j, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.atb = i;
        z.a aVar = new z.a();
        aVar.duration = j;
        bVar.atA = aVar;
        b(adTemplate, 3, bVar, jSONObject);
    }

    public static void a(AdTemplate adTemplate, int i, AdExposureFailedReason adExposureFailedReason) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            z.b bVar = new z.b();
            bVar.atf = i;
            if (adExposureFailedReason != null && i == 2) {
                bVar.atg = adExposureFailedReason.winEcpm;
                try {
                    bVar.adnType = adExposureFailedReason.adnType;
                    if (adExposureFailedReason.adnType == 2) {
                        bVar.adnName = adExposureFailedReason.adnName;
                    }
                } catch (Throwable th) {
                }
            }
            b(adTemplate, 809, bVar, (JSONObject) null);
        }
    }

    public static void a(AdTemplate adTemplate, int i, z.b bVar, JSONObject jSONObject) {
        bVar.atc = i;
        b(adTemplate, 140, bVar, (JSONObject) null);
    }

    @Deprecated
    public static void a(AdTemplate adTemplate, int i, ac.a aVar) {
        z.b bVar = new z.b();
        bVar.jI = i;
        if (aVar != null) {
            bVar.jK = aVar;
        }
        a(adTemplate, bVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, int i, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.asZ = i;
        b(adTemplate, 402, bVar, jSONObject);
    }

    public static void a(AdTemplate adTemplate, int i, JSONObject jSONObject, String str) {
        z.b bVar = new z.b();
        bVar.US = str;
        b(adTemplate, i, bVar, jSONObject);
    }

    public static void a(AdTemplate adTemplate, long j, JSONObject jSONObject) {
        z.b bVar = new z.b();
        z.a aVar = new z.a();
        if (j != -1) {
            aVar.duration = j;
            bVar.atA = aVar;
        }
        b(adTemplate, 934, bVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, C0258a c0258a) {
        z.b bVar = new z.b();
        bVar.ato = c0258a.toJson().toString();
        b(adTemplate, 40, bVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, j jVar) {
        b(adTemplate, (int) ScriptIntrinsicBLAS.LEFT, jVar != null ? jVar.BZ() : null, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, j jVar, JSONObject jSONObject) {
        a(adTemplate, jVar != null ? jVar.BZ() : null, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AdTemplate adTemplate, z.b bVar) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        String str = ck.downloadFilePath;
        if (str == null) {
            return;
        }
        String aq = com.kwad.sdk.core.response.b.a.aq(ck);
        String fD = ak.fD(str);
        if (fD == null || TextUtils.isEmpty(fD) || fD.equals(aq)) {
            return;
        }
        bVar.atr = fD;
        bVar.atq = aq;
        ck.adBaseInfo.appPackageName = fD;
    }

    public static void a(AdTemplate adTemplate, z.b bVar, JSONObject jSONObject) {
        if (bVar != null && adTemplate.fromCache) {
            bVar.a(k.aN(adTemplate));
        }
        b(adTemplate, 2, bVar, jSONObject);
    }

    public static void a(AdTemplate adTemplate, String str, int i) {
        z.b bVar = new z.b();
        bVar.atj = i;
        if (!str.equals("")) {
            bVar.atk = str;
        }
        b(adTemplate, 803, bVar, (JSONObject) null);
    }

    public static void a(AdTemplate adTemplate, String str, int i, z.b bVar) {
        if (bVar == null) {
            bVar = new z.b();
        }
        bVar.atj = i;
        if (!str.equals("")) {
            bVar.atk = str;
        }
        b(adTemplate, 320, bVar, (JSONObject) null);
    }

    public static void aA(AdTemplate adTemplate) {
        r(adTemplate, 38);
    }

    public static void aB(AdTemplate adTemplate) {
        r(adTemplate, 41);
    }

    public static void aC(AdTemplate adTemplate) {
        z.b bVar = new z.b();
        bVar.atq = com.kwad.sdk.core.response.b.a.aq(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        b(adTemplate, 768, bVar, new JSONObject());
    }

    public static void aD(AdTemplate adTemplate) {
        g(adTemplate, null);
    }

    public static void aE(AdTemplate adTemplate) {
        h(adTemplate, null);
    }

    public static void aF(AdTemplate adTemplate) {
        r(adTemplate, 58);
    }

    public static void aG(AdTemplate adTemplate) {
        r(adTemplate, 914);
    }

    public static void aH(AdTemplate adTemplate) {
        z.b bVar = new z.b();
        bVar.aty = com.kwad.sdk.core.response.b.a.bo(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        com.kwad.sdk.core.e.c.d("AdReportManager", "reportDownloadCardClose downloadStatus=" + bVar.aty);
        b(adTemplate, 713, bVar, (JSONObject) null);
    }

    public static void aI(AdTemplate adTemplate) {
        r(adTemplate, 722);
    }

    public static void aJ(AdTemplate adTemplate) {
        r(adTemplate, 721);
    }

    public static void aK(AdTemplate adTemplate) {
        j jVar = new j();
        z.a aVar = new z.a();
        aVar.asS = 1;
        jVar.a(aVar);
        b(adTemplate, 804, jVar.BZ(), (JSONObject) null);
    }

    public static void aL(AdTemplate adTemplate) {
        j jVar = new j();
        z.a aVar = new z.a();
        aVar.asS = 2;
        jVar.a(aVar);
        b(adTemplate, 804, jVar.BZ(), (JSONObject) null);
    }

    private static boolean aM(AdTemplate adTemplate) {
        if (com.kwad.sdk.core.response.b.d.cc(adTemplate)) {
            return true;
        }
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        return eVar != null && eVar.af(adTemplate);
    }

    public static void aw(AdTemplate adTemplate) {
        r(adTemplate, 4);
    }

    public static void ax(AdTemplate adTemplate) {
        z.b bVar = new z.b();
        bVar.downloadSource = adTemplate.downloadSource;
        b(adTemplate, 30, bVar, (JSONObject) null);
    }

    public static void ay(final AdTemplate adTemplate) {
        aqD.submit(new Runnable() { // from class: com.kwad.sdk.core.report.a.2
            @Override // java.lang.Runnable
            public final void run() {
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(AdTemplate.this);
                int aq = ak.aq(ck.downloadId, com.kwad.sdk.core.response.b.a.aq(ck));
                z.b bVar = new z.b();
                bVar.downloadSource = AdTemplate.this.downloadSource;
                bVar.atm = aq;
                bVar.atn = AdTemplate.this.installFrom;
                a.b(AdTemplate.this, 32, bVar, (JSONObject) null);
            }
        });
    }

    public static void az(AdTemplate adTemplate) {
        r(adTemplate, 36);
    }

    public static void b(final AdTemplate adTemplate, final int i, final z.b bVar, final JSONObject jSONObject) {
        if (adTemplate == null || !aM(adTemplate)) {
            return;
        }
        if (bVar == null) {
            bVar = new z.b();
        }
        bVar.atz = com.kwad.sdk.core.response.b.a.aL(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        com.kwad.sdk.core.e.c.d("AdReportManager", sb.toString());
        bVar.adxResult = adTemplate.adxResult;
        if (i == 2 && aqF) {
            if (bVar.atA == null) {
                bVar.atA = new z.a();
            }
            bVar.atA.asV = aqE;
        }
        new y() { // from class: com.kwad.sdk.core.report.a.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: BN */
            public z createRequest() {
                return new z(AdTemplate.this, i, bVar, jSONObject);
            }
        }.fetch();
    }

    @Deprecated
    public static void b(AdTemplate adTemplate, int i, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.atc = i;
        b(adTemplate, 140, bVar, jSONObject);
    }

    public static void b(AdTemplate adTemplate, j jVar, JSONObject jSONObject) {
        b(adTemplate, 3, jVar != null ? jVar.BZ() : null, jSONObject);
    }

    public static void b(AdTemplate adTemplate, z.b bVar) {
        b(adTemplate, 50, bVar, (JSONObject) null);
    }

    public static void b(AdTemplate adTemplate, String str, int i, z.b bVar) {
        if (bVar == null) {
            bVar = new z.b();
        }
        bVar.atj = i;
        if (!str.equals("")) {
            bVar.atk = str;
        }
        b(adTemplate, 321, bVar, (JSONObject) null);
    }

    public static void b(AdTemplate adTemplate, JSONObject jSONObject, j jVar) {
        if (adTemplate.mPvReported) {
            return;
        }
        adTemplate.mPvReported = true;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.cr(BM());
        z.b BZ = jVar.BZ();
        if (adTemplate.fromCache) {
            BZ.a(k.aN(adTemplate));
        }
        BZ.atx = D(ck) ? 1 : 0;
        b(adTemplate, 1, BZ, jSONObject);
    }

    public static void c(AdTemplate adTemplate, int i, int i2) {
        z.b bVar = new z.b();
        bVar.atw = i;
        bVar.atK = i2;
        b(adTemplate, 323, bVar, (JSONObject) null);
    }

    public static void c(AdTemplate adTemplate, int i, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.atq = com.kwad.sdk.core.response.b.a.aq(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        bVar.atc = 93;
        b(adTemplate, 140, bVar, (JSONObject) null);
    }

    public static void c(AdTemplate adTemplate, z.b bVar) {
        b(adTemplate, 51, bVar, (JSONObject) null);
    }

    public static void c(AdTemplate adTemplate, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.downloadSource = adTemplate.downloadSource;
        b(adTemplate, 33, bVar, jSONObject);
    }

    public static void c(AdTemplate adTemplate, JSONObject jSONObject, j jVar) {
        b(adTemplate, 451, jVar != null ? jVar.BZ() : null, (JSONObject) null);
    }

    public static void d(AdTemplate adTemplate, int i, int i2) {
        z.b bVar = new z.b();
        bVar.atc = 69;
        bVar.ats = i;
        bVar.att = i2;
        b(adTemplate, 501, bVar, (JSONObject) null);
    }

    private static void d(AdTemplate adTemplate, int i, JSONObject jSONObject) {
        b(adTemplate, i, (z.b) null, jSONObject);
    }

    public static void d(AdTemplate adTemplate, z.b bVar) {
        b(adTemplate, 52, bVar, (JSONObject) null);
    }

    public static void d(AdTemplate adTemplate, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.downloadSource = adTemplate.downloadSource;
        b(adTemplate, 34, bVar, jSONObject);
    }

    public static void d(AdTemplate adTemplate, JSONObject jSONObject, j jVar) {
        b(adTemplate, 140, jVar != null ? jVar.BZ() : null, jSONObject);
    }

    public static void e(AdTemplate adTemplate, z.b bVar) {
        b(adTemplate, 59, bVar, (JSONObject) null);
    }

    public static void e(final AdTemplate adTemplate, final JSONObject jSONObject) {
        aqD.submit(new Runnable() { // from class: com.kwad.sdk.core.report.a.1
            @Override // java.lang.Runnable
            public final void run() {
                z.b bVar = new z.b();
                bVar.downloadSource = AdTemplate.this.downloadSource;
                a.a(AdTemplate.this, bVar);
                a.b(AdTemplate.this, 31, bVar, jSONObject);
                AdInfo ck = com.kwad.sdk.core.response.b.d.ck(AdTemplate.this);
                ak.ap(ck.downloadFilePath, ck.downloadId);
            }
        });
    }

    public static void f(AdTemplate adTemplate, JSONObject jSONObject) {
        z.b bVar = new z.b();
        bVar.downloadSource = adTemplate.downloadSource;
        b(adTemplate, 35, bVar, jSONObject);
    }

    public static void g(AdTemplate adTemplate, JSONObject jSONObject) {
        d(adTemplate, 399, jSONObject);
    }

    public static void h(AdTemplate adTemplate, JSONObject jSONObject) {
        d(adTemplate, 400, jSONObject);
    }

    public static void i(AdTemplate adTemplate, int i) {
        z.b bVar = new z.b();
        bVar.atG = i;
        b(adTemplate, 37, bVar, (JSONObject) null);
    }

    public static void i(AdTemplate adTemplate, JSONObject jSONObject) {
        d(adTemplate, 501, jSONObject);
    }

    public static void j(AdTemplate adTemplate, int i) {
        z.b bVar = new z.b();
        bVar.ati = i;
        b(adTemplate, 923, bVar, (JSONObject) null);
    }

    public static void j(AdTemplate adTemplate, long j) {
        z.b bVar = new z.b();
        bVar.ate = j;
        b(adTemplate, 600, bVar, (JSONObject) null);
    }

    public static void j(AdTemplate adTemplate, JSONObject jSONObject) {
        d(adTemplate, 450, jSONObject);
    }

    public static void k(AdTemplate adTemplate, int i) {
        z.b bVar = new z.b();
        bVar.atl = i;
        b(adTemplate, "wxsmallapp", 1, bVar);
    }

    public static void k(AdTemplate adTemplate, long j) {
        z.b bVar = new z.b();
        bVar.atv = j;
        b(adTemplate, 401, bVar, (JSONObject) null);
    }

    public static void k(AdTemplate adTemplate, JSONObject jSONObject) {
        d(adTemplate, 451, jSONObject);
    }

    public static void l(AdTemplate adTemplate, int i) {
        c(adTemplate, i, 0);
    }

    public static void m(AdTemplate adTemplate, int i) {
        z.b bVar = new z.b();
        bVar.ata = i;
        b(adTemplate, 759, bVar, (JSONObject) null);
    }

    public static void n(AdTemplate adTemplate, int i) {
        z.b bVar = new z.b();
        bVar.asZ = i;
        b(adTemplate, 28, bVar, (JSONObject) null);
    }

    public static void o(AdTemplate adTemplate, int i) {
        if (adTemplate == null) {
            return;
        }
        z.b bVar = new z.b();
        bVar.atq = com.kwad.sdk.core.response.b.a.aq(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        b(adTemplate, i, bVar, new JSONObject());
    }

    public static void p(AdTemplate adTemplate, int i) {
        b(adTemplate, i, new z.b(), new JSONObject());
    }

    @Deprecated
    public static void q(AdTemplate adTemplate, int i) {
        a(adTemplate, new j().ci(i));
    }

    private static void r(AdTemplate adTemplate, int i) {
        b(adTemplate, i, (z.b) null, new JSONObject());
    }
}
