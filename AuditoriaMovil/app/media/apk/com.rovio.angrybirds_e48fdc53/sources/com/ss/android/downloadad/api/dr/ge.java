package com.ss.android.downloadad.api.dr;

import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.wb;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge implements dr {
    private int a;
    private long at;
    private long b;
    private String bg;
    private long bk;
    private long bn;
    private int ci;
    private int cu;

    /* renamed from: de  reason: collision with root package name */
    private String f9de;
    protected boolean dr;
    private long e;
    private boolean ed;
    private boolean f;
    private String ff;
    public final AtomicBoolean g;
    protected boolean ge;
    private String h;
    private boolean ho;
    private String i;
    private JSONObject ii;
    private int il;
    private int j;
    private boolean jy;
    private boolean k;
    private String l;
    private String ll;
    private String lp;
    private int m;
    private boolean n;
    private boolean nn;
    public final AtomicBoolean o;
    private int os;
    private boolean oz;
    private boolean p;
    private long q;
    private int qx;
    private boolean r;
    private String rb;
    private long rt;
    private boolean ss;
    private String t;
    private long tb;
    private transient boolean tk;
    private boolean tw;
    private int uq;
    private boolean ux;
    private int v;
    private boolean vj;
    private boolean vv;
    private String wb;
    private int x;
    private String xq;
    private int xu;
    private boolean yd;
    private String yk;
    private boolean z;
    private boolean zh;
    private long zq;

    private ge() {
        this.xu = 1;
        this.z = true;
        this.n = false;
        this.m = 0;
        this.j = 0;
        this.f = false;
        this.ho = false;
        this.k = true;
        this.ux = true;
        this.dr = true;
        this.ge = true;
        this.o = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.os = 1;
        this.ed = true;
        this.b = -1L;
    }

    public ge(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        this(downloadModel, downloadEventConfig, downloadController, 0);
    }

    public ge(DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, int i) {
        this.xu = 1;
        this.z = true;
        this.n = false;
        this.m = 0;
        this.j = 0;
        this.f = false;
        this.ho = false;
        this.k = true;
        this.ux = true;
        this.dr = true;
        this.ge = true;
        this.o = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.os = 1;
        this.ed = true;
        this.b = -1L;
        this.q = downloadModel.getId();
        this.bn = downloadModel.getExtraValue();
        this.rb = downloadModel.getLogExtra();
        this.ll = downloadModel.getPackageName();
        this.ii = downloadModel.getExtra();
        this.z = downloadModel.isAd();
        this.x = downloadModel.getVersionCode();
        this.lp = downloadModel.getVersionName();
        this.wb = downloadModel.getDownloadUrl();
        if (downloadModel.getDeepLink() != null) {
            this.t = downloadModel.getDeepLink().getOpenUrl();
            this.yk = downloadModel.getDeepLink().getWebUrl();
        }
        this.cu = downloadModel.getModelType();
        this.f9de = downloadModel.getName();
        this.i = downloadModel.getAppIcon();
        this.l = downloadModel.getMimeType();
        this.xq = downloadEventConfig.getClickButtonTag();
        this.h = downloadEventConfig.getRefer();
        this.nn = downloadEventConfig.isEnableV3Event();
        this.n = downloadController.isEnableBackDialog();
        this.v = downloadController.getLinkMode();
        this.il = downloadController.getDownloadMode();
        this.ed = downloadController.enableShowComplianceDialog();
        this.p = downloadController.isAutoDownloadOnCardShow();
        this.k = downloadController.enableNewActivity();
        this.dr = downloadController.enableAH();
        this.ge = downloadController.enableAM();
        this.uq = i;
        long currentTimeMillis = System.currentTimeMillis();
        this.tb = currentTimeMillis;
        this.at = currentTimeMillis;
        this.ho = downloadModel.shouldDownloadWithPatchApply();
    }

    public int n() {
        return this.m;
    }

    public void dr(int i) {
        this.m = i;
    }

    public synchronized void m() {
        this.m++;
    }

    public int j() {
        return this.j;
    }

    public void ge(int i) {
        this.j = i;
    }

    public synchronized void at() {
        this.j++;
    }

    public long rt() {
        long j = this.at;
        if (j == 0) {
            return this.tb;
        }
        return j;
    }

    public void dr(long j) {
        this.at = j;
    }

    public long e() {
        return this.rt;
    }

    public void ge(long j) {
        this.rt = j;
    }

    public void o(long j) {
        this.e = j;
    }

    public int qx() {
        return this.qx;
    }

    public void o(int i) {
        this.qx = i;
    }

    public int a() {
        return this.a;
    }

    public void g(int i) {
        this.a = i;
    }

    public String bg() {
        return this.bg;
    }

    public void dr(String str) {
        this.bg = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public long ge() {
        return this.q;
    }

    public void g(long j) {
        this.q = j;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public long yk() {
        return this.bn;
    }

    public void q(long j) {
        this.bn = j;
    }

    public int f() {
        return this.xu;
    }

    public void q(int i) {
        this.xu = i;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String q() {
        return this.ll;
    }

    public void ge(String str) {
        this.ll = str;
    }

    public long l() {
        return this.tb;
    }

    public void bn(long j) {
        if (j > 0) {
            this.tb = j;
        }
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String g() {
        return this.rb;
    }

    public void o(String str) {
        this.rb = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public boolean o() {
        return this.z;
    }

    public void dr(boolean z) {
        this.z = z;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject rb() {
        return this.ii;
    }

    public void dr(JSONObject jSONObject) {
        this.ii = jSONObject;
    }

    public void bn(int i) {
        this.x = i;
    }

    public void g(String str) {
        this.lp = str;
    }

    public int ho() {
        return this.x;
    }

    public String k() {
        return this.lp;
    }

    public void rb(int i) {
        this.uq = i;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public int i() {
        return this.uq;
    }

    public void ge(boolean z) {
        this.nn = z;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public boolean cu() {
        return this.nn;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public List<String> v() {
        return null;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject de() {
        return null;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public Object il() {
        return null;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject x() {
        return null;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject t() {
        return null;
    }

    public void xu(int i) {
        this.ci = i;
    }

    public int ux() {
        return this.ci;
    }

    public void ll(int i) {
        this.os = i;
    }

    public void q(String str) {
        this.yk = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public int xu() {
        return this.os;
    }

    public void o(boolean z) {
        this.n = z;
    }

    public boolean xq() {
        return this.n;
    }

    public void bn(String str) {
        this.xq = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String wb() {
        return this.xq;
    }

    public void rb(String str) {
        this.h = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String ll() {
        return this.h;
    }

    public void xu(String str) {
        this.wb = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String dr() {
        return this.wb;
    }

    public void ll(String str) {
        this.t = str;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String bn() {
        return this.t;
    }

    public void rb(long j) {
        this.b = j;
    }

    public long h() {
        return this.b;
    }

    public void wb(String str) {
        this.f9de = str;
    }

    public String nn() {
        return this.f9de;
    }

    public void t(String str) {
        this.i = str;
    }

    public void wb(int i) {
        this.v = i;
    }

    public int oz() {
        return this.v;
    }

    public void t(int i) {
        this.il = i;
    }

    public void yk(int i) {
        this.cu = i;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public int z() {
        return -1;
    }

    public void g(boolean z) {
        this.tw = z;
    }

    public String ci() {
        return this.ff;
    }

    public void yk(String str) {
        this.ff = str;
    }

    public boolean os() {
        return this.r;
    }

    public void q(boolean z) {
        this.r = z;
    }

    public boolean zq() {
        return this.oz;
    }

    public void bn(boolean z) {
        this.oz = z;
    }

    public boolean bk() {
        return this.ss;
    }

    public void rb(boolean z) {
        this.ss = z;
    }

    public long ed() {
        return this.zq;
    }

    public void xu(long j) {
        this.zq = j;
    }

    public long p() {
        return this.bk;
    }

    public void ll(long j) {
        this.bk = j;
    }

    public boolean ff() {
        return this.f;
    }

    public void xu(boolean z) {
        this.f = z;
    }

    public String tw() {
        return this.l;
    }

    public void cu(String str) {
        this.l = str;
    }

    public boolean r() {
        return this.ho;
    }

    public void ll(boolean z) {
        this.ho = z;
    }

    public boolean ss() {
        return this.tk;
    }

    public void wb(boolean z) {
        this.tk = z;
    }

    public boolean b() {
        return this.jy;
    }

    public void t(boolean z) {
        this.jy = z;
    }

    public boolean tk() {
        return this.yd;
    }

    public void yk(boolean z) {
        this.yd = z;
    }

    public boolean jy() {
        return this.vj;
    }

    public void cu(boolean z) {
        this.vj = z;
    }

    public boolean vj() {
        return this.vv;
    }

    public void v(boolean z) {
        this.vv = z;
    }

    public boolean yd() {
        return this.zh;
    }

    public void il(boolean z) {
        this.zh = z;
    }

    public void x(boolean z) {
        this.ed = z;
    }

    public void lp(boolean z) {
        this.p = z;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public boolean lp() {
        return this.k;
    }

    public void de(boolean z) {
        this.k = z;
    }

    public void i(boolean z) {
        this.ux = z;
    }

    public void z(boolean z) {
        this.dr = z;
    }

    public void tb(boolean z) {
        this.ge = z;
    }

    public JSONObject vv() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mId", this.q);
            jSONObject.put("mExtValue", this.bn);
            jSONObject.put("mLogExtra", this.rb);
            jSONObject.put("mDownloadStatus", this.xu);
            jSONObject.put("mPackageName", this.ll);
            jSONObject.put("mIsAd", this.z);
            jSONObject.put("mTimeStamp", this.tb);
            jSONObject.put("mExtras", this.ii);
            jSONObject.put("mVersionCode", this.x);
            jSONObject.put("mVersionName", this.lp);
            jSONObject.put("mDownloadId", this.uq);
            jSONObject.put("mIsV3Event", this.nn);
            jSONObject.put("mScene", this.ci);
            jSONObject.put("mEventTag", this.xq);
            jSONObject.put("mEventRefer", this.h);
            jSONObject.put("mDownloadUrl", this.wb);
            jSONObject.put("mEnableBackDialog", this.n);
            jSONObject.put("hasSendInstallFinish", this.o.get());
            jSONObject.put("hasSendDownloadFailedFinally", this.g.get());
            jSONObject.put("mLastFailedErrCode", this.a);
            jSONObject.put("mLastFailedErrMsg", this.bg);
            jSONObject.put("mOpenUrl", this.t);
            jSONObject.put("mLinkMode", this.v);
            jSONObject.put("mDownloadMode", this.il);
            jSONObject.put("mModelType", this.cu);
            jSONObject.put("mAppName", this.f9de);
            jSONObject.put("mAppIcon", this.i);
            jSONObject.put("mDownloadFailedTimes", this.m);
            long j = this.at;
            if (j == 0) {
                j = this.tb;
            }
            jSONObject.put("mRecentDownloadResumeTime", j);
            jSONObject.put("mClickPauseTimes", this.j);
            jSONObject.put("mJumpInstallTime", this.rt);
            jSONObject.put("mCancelInstallTime", this.e);
            jSONObject.put("mLastFailedResumeCount", this.qx);
            jSONObject.put("mIsUpdateDownload", this.f);
            jSONObject.put("mOriginMimeType", this.l);
            jSONObject.put("mIsPatchApplyHandled", this.ho);
            jSONObject.put("downloadFinishReason", this.ff);
            jSONObject.put("clickDownloadTime", this.zq);
            jSONObject.put("clickDownloadSize", this.bk);
            jSONObject.put("installAfterCleanSpace", this.oz);
            jSONObject.put("funnelType", this.os);
            jSONObject.put("webUrl", this.yk);
            jSONObject.put("enableShowComplianceDialog", this.ed);
            jSONObject.put("isAutoDownloadOnCardShow", this.p);
            int i = 1;
            jSONObject.put("enable_new_activity", this.k ? 1 : 0);
            jSONObject.put("enable_pause", this.ux ? 1 : 0);
            jSONObject.put("enable_ah", this.dr ? 1 : 0);
            if (!this.ge) {
                i = 0;
            }
            jSONObject.put("enable_am", i);
        } catch (Exception e) {
            wb.i().dr(e, "NativeDownloadModel toJson");
        }
        return jSONObject;
    }

    public static ge ge(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ge geVar = new ge();
        try {
            geVar.g(com.ss.android.download.api.o.ge.dr(jSONObject, "mId"));
            geVar.q(com.ss.android.download.api.o.ge.dr(jSONObject, "mExtValue"));
            geVar.o(jSONObject.optString("mLogExtra"));
            geVar.q(jSONObject.optInt("mDownloadStatus"));
            geVar.ge(jSONObject.optString("mPackageName"));
            boolean z = true;
            geVar.dr(jSONObject.optBoolean("mIsAd", true));
            geVar.bn(com.ss.android.download.api.o.ge.dr(jSONObject, "mTimeStamp"));
            geVar.bn(jSONObject.optInt("mVersionCode"));
            geVar.g(jSONObject.optString("mVersionName"));
            geVar.rb(jSONObject.optInt("mDownloadId"));
            geVar.ge(jSONObject.optBoolean("mIsV3Event"));
            geVar.xu(jSONObject.optInt("mScene"));
            geVar.bn(jSONObject.optString("mEventTag"));
            geVar.rb(jSONObject.optString("mEventRefer"));
            geVar.xu(jSONObject.optString("mDownloadUrl"));
            geVar.o(jSONObject.optBoolean("mEnableBackDialog"));
            geVar.o.set(jSONObject.optBoolean("hasSendInstallFinish"));
            geVar.g.set(jSONObject.optBoolean("hasSendDownloadFailedFinally"));
            geVar.g(jSONObject.optInt("mLastFailedErrCode"));
            geVar.dr(jSONObject.optString("mLastFailedErrMsg"));
            geVar.ll(jSONObject.optString("mOpenUrl"));
            geVar.wb(jSONObject.optInt("mLinkMode"));
            geVar.t(jSONObject.optInt("mDownloadMode"));
            geVar.yk(jSONObject.optInt("mModelType"));
            geVar.wb(jSONObject.optString("mAppName"));
            geVar.t(jSONObject.optString("mAppIcon"));
            geVar.dr(jSONObject.optInt("mDownloadFailedTimes", 0));
            geVar.dr(com.ss.android.download.api.o.ge.dr(jSONObject, "mRecentDownloadResumeTime"));
            geVar.ge(jSONObject.optInt("mClickPauseTimes"));
            geVar.ge(com.ss.android.download.api.o.ge.dr(jSONObject, "mJumpInstallTime"));
            geVar.o(com.ss.android.download.api.o.ge.dr(jSONObject, "mCancelInstallTime"));
            geVar.o(jSONObject.optInt("mLastFailedResumeCount"));
            geVar.yk(jSONObject.optString("downloadFinishReason"));
            geVar.ll(jSONObject.optLong("clickDownloadSize"));
            geVar.xu(jSONObject.optLong("clickDownloadTime"));
            geVar.xu(jSONObject.optBoolean("mIsUpdateDownload"));
            geVar.cu(jSONObject.optString("mOriginMimeType"));
            geVar.ll(jSONObject.optBoolean("mIsPatchApplyHandled"));
            geVar.bn(jSONObject.optBoolean("installAfterCleanSpace"));
            geVar.ll(jSONObject.optInt("funnelType", 1));
            geVar.q(jSONObject.optString("webUrl"));
            geVar.x(jSONObject.optBoolean("enableShowComplianceDialog", true));
            geVar.lp(jSONObject.optBoolean("isAutoDownloadOnCardShow"));
            geVar.de(jSONObject.optInt("enable_new_activity", 1) == 1);
            geVar.i(jSONObject.optInt("enable_pause", 1) == 1);
            geVar.z(jSONObject.optInt("enable_ah", 1) == 1);
            if (jSONObject.optInt("enable_am", 1) != 1) {
                z = false;
            }
            geVar.tb(z);
            geVar.dr(jSONObject.optJSONObject("mExtras"));
        } catch (Exception e) {
            wb.i().dr(e, "NativeDownloadModel fromJson");
        }
        return geVar;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public DownloadModel tb() {
        return zh();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public DownloadEventConfig ii() {
        return rr();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public DownloadController uq() {
        return sn();
    }

    public AdDownloadModel zh() {
        return new AdDownloadModel.Builder().setAdId(this.q).setExtraValue(this.bn).setLogExtra(this.rb).setPackageName(this.ll).setExtra(this.ii).setIsAd(this.z).setVersionCode(this.x).setVersionName(this.lp).setDownloadUrl(this.wb).setModelType(this.cu).setMimeType(this.l).setAppName(this.f9de).setAppIcon(this.i).setDeepLink(new DeepLink(this.t, this.yk, null)).build();
    }

    public AdDownloadEventConfig rr() {
        return new AdDownloadEventConfig.Builder().setClickButtonTag(this.xq).setRefer(this.h).setIsEnableV3Event(this.nn).build();
    }

    public AdDownloadController sn() {
        return new AdDownloadController.Builder().setIsEnableBackDialog(this.n).setLinkMode(this.v).setDownloadMode(this.il).setEnableShowComplianceDialog(this.ed).setEnableAH(this.dr).setEnableAM(this.ge).build();
    }
}
