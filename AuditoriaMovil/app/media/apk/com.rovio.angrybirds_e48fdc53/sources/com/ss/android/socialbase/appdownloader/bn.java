package com.ss.android.socialbase.appdownloader;

import android.app.Activity;
import android.content.Context;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.downloader.IChunkAdjustCalculator;
import com.ss.android.socialbase.downloader.downloader.IChunkCntCalculator;
import com.ss.android.socialbase.downloader.downloader.IRetryDelayTimeCalculator;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.notification.AbsNotificationItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class bn {
    private String a;
    private boolean at;
    private long b;
    private boolean bk;
    private String bn;
    private com.ss.android.socialbase.appdownloader.o.q ci;
    private IDownloadListener cu;

    /* renamed from: de  reason: collision with root package name */
    private IChunkAdjustCalculator f12de;
    private Activity dr;
    private int e;
    private INotificationClickCallback ed;
    private boolean f;
    private JSONObject ff;
    private List<String> g;
    private Context ge;
    private boolean ho;
    private IChunkCntCalculator i;
    private boolean ii;
    private String il;
    private long j;
    private boolean jy;
    private boolean l;
    private boolean lp;
    private String m;
    private String n;
    private IDownloadMonitorDepend nn;
    private String o;
    private IDownloadFileUriProvider os;
    private IDownloadDepend oz;
    private boolean p;
    private String q;
    private boolean qx;
    private String rb;
    private int ss;
    private AbsNotificationItem tb;
    private int tk;
    private String tw;
    private boolean uq;
    private IDownloadListener v;
    private String vv;
    private int xq;
    private List<HttpHeader> xu;
    private IRetryDelayTimeCalculator z;
    private int[] zh;
    private IDownloadDiskSpaceHandler zq;
    private boolean ll = true;
    private boolean wb = false;
    private boolean t = true;
    private boolean yk = false;
    private String x = AdBaseConstants.MIME_APK;
    private int rt = 5;
    private boolean bg = true;
    private EnqueueType k = EnqueueType.ENQUEUE_NONE;
    private int ux = 150;
    private boolean h = true;
    private List<IDownloadCompleteHandler> r = new ArrayList();
    private boolean vj = true;
    private boolean yd = true;

    public bn(Context context, String str) {
        this.ge = context.getApplicationContext();
        this.o = str;
    }

    public Activity getActivity() {
        return this.dr;
    }

    public Context getContext() {
        return this.ge;
    }

    public String dr() {
        return this.o;
    }

    public String ge() {
        return this.q;
    }

    public String o() {
        return this.rb;
    }

    public List<HttpHeader> g() {
        return this.xu;
    }

    public boolean q() {
        return this.ll;
    }

    public boolean bn() {
        return this.wb;
    }

    public boolean rb() {
        return this.t;
    }

    public boolean xu() {
        return this.yk;
    }

    public IDownloadListener ll() {
        return this.cu;
    }

    public IDownloadListener wb() {
        return this.v;
    }

    public String t() {
        return this.il;
    }

    public String yk() {
        return this.x;
    }

    public boolean cu() {
        return this.lp;
    }

    public AbsNotificationItem v() {
        return this.tb;
    }

    public IChunkCntCalculator il() {
        return this.i;
    }

    public IChunkAdjustCalculator x() {
        return this.f12de;
    }

    public boolean lp() {
        return this.ii;
    }

    public boolean de() {
        return this.uq;
    }

    public int i() {
        return this.tk;
    }

    public void dr(int i) {
        this.tk = i;
    }

    public String z() {
        return this.n;
    }

    public String tb() {
        return this.m;
    }

    public long ii() {
        return this.j;
    }

    public int uq() {
        return this.rt;
    }

    public int n() {
        return this.e;
    }

    public boolean m() {
        return this.qx;
    }

    public String j() {
        return this.a;
    }

    public boolean at() {
        return this.bg;
    }

    public boolean rt() {
        return this.f;
    }

    public IRetryDelayTimeCalculator e() {
        return this.z;
    }

    public int qx() {
        return this.ux;
    }

    public int a() {
        return this.xq;
    }

    public boolean bg() {
        return this.l;
    }

    public boolean f() {
        return this.ho;
    }

    public boolean l() {
        return this.h;
    }

    public boolean ho() {
        return this.bk;
    }

    public EnqueueType k() {
        return this.k;
    }

    public boolean ux() {
        return this.at;
    }

    public String xq() {
        return this.bn;
    }

    public IDownloadMonitorDepend h() {
        return this.nn;
    }

    public IDownloadDepend nn() {
        return this.oz;
    }

    public com.ss.android.socialbase.appdownloader.o.q oz() {
        return this.ci;
    }

    public IDownloadFileUriProvider ci() {
        return this.os;
    }

    public INotificationClickCallback os() {
        return this.ed;
    }

    public List<IDownloadCompleteHandler> zq() {
        return this.r;
    }

    public boolean bk() {
        return this.p;
    }

    public int ed() {
        return this.ss;
    }

    public long p() {
        return this.b;
    }

    public boolean ff() {
        return this.yd;
    }

    public String tw() {
        return this.vv;
    }

    public int[] r() {
        return this.zh;
    }

    public boolean ss() {
        return this.jy;
    }

    public boolean b() {
        return this.vj;
    }

    public bn dr(String str) {
        this.q = str;
        return this;
    }

    public bn ge(String str) {
        this.bn = str;
        return this;
    }

    public bn o(String str) {
        this.rb = str;
        return this;
    }

    public bn dr(List<HttpHeader> list) {
        this.xu = list;
        return this;
    }

    public bn dr(boolean z) {
        this.ll = z;
        return this;
    }

    public bn ge(boolean z) {
        this.wb = z;
        return this;
    }

    public bn o(boolean z) {
        this.yk = z;
        return this;
    }

    public bn dr(IDownloadListener iDownloadListener) {
        this.cu = iDownloadListener;
        return this;
    }

    public bn g(String str) {
        this.il = str;
        return this;
    }

    public bn q(String str) {
        this.x = str;
        return this;
    }

    public bn g(boolean z) {
        this.lp = z;
        return this;
    }

    public bn q(boolean z) {
        this.ii = z;
        return this;
    }

    public bn bn(boolean z) {
        this.uq = z;
        return this;
    }

    public bn bn(String str) {
        this.n = str;
        return this;
    }

    public bn rb(String str) {
        this.m = str;
        return this;
    }

    public bn dr(long j) {
        this.j = j;
        return this;
    }

    public bn ge(int i) {
        this.rt = i;
        return this;
    }

    public bn o(int i) {
        this.e = i;
        return this;
    }

    public bn rb(boolean z) {
        this.qx = z;
        return this;
    }

    public bn xu(String str) {
        this.a = str;
        return this;
    }

    public bn xu(boolean z) {
        this.bk = z;
        return this;
    }

    public bn ll(boolean z) {
        this.bg = z;
        return this;
    }

    public bn wb(boolean z) {
        this.f = z;
        return this;
    }

    public bn t(boolean z) {
        this.l = z;
        return this;
    }

    public bn yk(boolean z) {
        this.ho = z;
        return this;
    }

    public bn g(int i) {
        this.ux = i;
        return this;
    }

    public bn q(int i) {
        this.xq = i;
        return this;
    }

    public bn cu(boolean z) {
        this.h = z;
        return this;
    }

    public bn dr(EnqueueType enqueueType) {
        this.k = enqueueType;
        return this;
    }

    public bn v(boolean z) {
        this.at = z;
        return this;
    }

    public bn dr(IDownloadFileUriProvider iDownloadFileUriProvider) {
        this.os = iDownloadFileUriProvider;
        return this;
    }

    public bn ll(String str) {
        this.vv = str;
        return this;
    }

    public bn wb(String str) {
        this.tw = str;
        return this;
    }

    public String tk() {
        return this.tw;
    }

    public bn bn(int i) {
        this.ss = i;
        return this;
    }

    public List<String> jy() {
        return this.g;
    }

    public bn ge(List<String> list) {
        this.g = list;
        return this;
    }

    public IDownloadDiskSpaceHandler vj() {
        return this.zq;
    }

    public bn dr(IDownloadDiskSpaceHandler iDownloadDiskSpaceHandler) {
        this.zq = iDownloadDiskSpaceHandler;
        return this;
    }

    public JSONObject yd() {
        return this.ff;
    }

    public bn dr(JSONObject jSONObject) {
        this.ff = jSONObject;
        return this;
    }

    public bn dr(IDownloadCompleteHandler iDownloadCompleteHandler) {
        synchronized (this.r) {
            if (iDownloadCompleteHandler != null) {
                if (!this.r.contains(iDownloadCompleteHandler)) {
                    this.r.add(iDownloadCompleteHandler);
                    return this;
                }
            }
            return this;
        }
    }

    public bn il(boolean z) {
        this.jy = z;
        return this;
    }

    public bn x(boolean z) {
        this.vj = z;
        return this;
    }
}
