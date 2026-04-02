package com.kwad.sdk.core.network;

import android.text.TextUtils;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.idc.DomainException;
import com.kwad.sdk.export.proxy.AdHttpProxy;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ag;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class m<R extends g, T extends BaseResultData> extends a<R> {
    private static final String TAG = "Networking";
    private h<R, T> mListener = null;
    private final com.kwad.sdk.core.network.b.b mMonitorRecorder = com.kwad.sdk.core.network.b.c.By();

    private void checkAndSetHasData(BaseResultData baseResultData) {
        if (baseResultData.hasData()) {
            this.mMonitorRecorder.ca(1);
        }
    }

    private void checkIpDirect(c cVar) {
        com.kwad.sdk.service.a.e eVar;
        if (cVar == null || cVar.Bb() || (eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)) == null || !ag.isNetworkConnected(eVar.getContext())) {
            return;
        }
        com.kwad.sdk.ip.direct.a.FP();
    }

    private void notifyOnErrorListener(R r, int i, String str) {
        i.Bf().b(r, i);
        h<R, T> hVar = this.mListener;
        if (hVar == null) {
            return;
        }
        hVar.onError(r, i, str);
        this.mMonitorRecorder.Bx();
    }

    private void notifyOnErrorListener(R r, c cVar, String str) {
        String url = r.getUrl();
        com.kwad.sdk.core.network.idc.a.Bm().a(url, url.contains("/rest/zt/emoticon/package/list") ? "zt" : "api", new DomainException(cVar.aoP, cVar.aoQ));
        notifyOnErrorListener((m<R, T>) r, cVar.code, str);
    }

    private void notifyOnStartRequest(R r) {
        h<R, T> hVar = this.mListener;
        if (hVar == null) {
            return;
        }
        hVar.onStartRequest(r);
    }

    private void notifyOnSuccess(R r, T t) {
        h<R, T> hVar = this.mListener;
        if (hVar == null) {
            return;
        }
        hVar.onSuccess(r, t);
        this.mMonitorRecorder.Bx();
    }

    private void onRequest(h<R, T> hVar) {
        this.mMonitorRecorder.Br();
        this.mListener = hVar;
    }

    private void parseCommonData(String str, String str2) {
        try {
            r.Bi().K(str, new JSONObject(str2).optString("requestSessionData"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setMonitorRequestId(g gVar) {
        Map<String, String> header = gVar.getHeader();
        if (header != null) {
            String str = header.get(d.TRACK_ID_KEY);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mMonitorRecorder.dj(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void afterParseData(T t) {
    }

    @Override // com.kwad.sdk.core.network.a
    public void cancel() {
        super.cancel();
        this.mListener = null;
    }

    protected boolean enableMonitorReport() {
        return true;
    }

    @Override // com.kwad.sdk.core.network.a
    protected void fetchImpl() {
        try {
            this.mMonitorRecorder.Bv();
            R createRequest = createRequest();
            notifyOnStartRequest(createRequest);
            this.mMonitorRecorder.df(createRequest.getUrl()).dg(createRequest.getUrl());
            setMonitorRequestId(createRequest);
            if (ag.isNetworkConnected(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext())) {
                c cVar = null;
                try {
                    String url = createRequest.getUrl();
                    AdHttpProxy wW = com.kwad.sdk.g.wW();
                    (wW instanceof com.kwad.sdk.core.network.c.b ? this.mMonitorRecorder.di("ok_http") : this.mMonitorRecorder.di("http")).Bu();
                    cVar = isPostByJson() ? wW.doPost(url, createRequest.getHeader(), createRequest.getBody()) : wW.doPost(url, createRequest.getHeader(), createRequest.getBodyMap());
                } catch (Exception e) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                    com.kwad.sdk.core.network.b.b bVar = this.mMonitorRecorder;
                    bVar.dh("requestError:" + e.getMessage());
                }
                this.mMonitorRecorder.Bs().Bt().cc(com.kwad.sdk.ip.direct.a.getType());
                try {
                    onResponse(createRequest, cVar);
                } catch (Exception e2) {
                    com.kwad.sdk.core.network.b.b bVar2 = this.mMonitorRecorder;
                    bVar2.dh("onResponseError:" + e2.getMessage());
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e2);
                }
            } else {
                notifyOnErrorListener((m<R, T>) createRequest, f.aoX.errorCode, f.aoX.msg);
                this.mMonitorRecorder.bZ(f.aoX.errorCode).dh(f.aoX.msg);
            }
            try {
                if (enableMonitorReport()) {
                    this.mMonitorRecorder.report();
                }
            } catch (Exception e3) {
            }
        } catch (Throwable th) {
            try {
                try {
                    com.kwad.sdk.core.network.b.b bVar3 = this.mMonitorRecorder;
                    bVar3.dh("requestError:" + th.getMessage());
                } catch (Throwable th2) {
                    try {
                        if (enableMonitorReport()) {
                            this.mMonitorRecorder.report();
                        }
                    } catch (Exception e4) {
                    }
                    throw th2;
                }
            } catch (Exception e5) {
            }
            com.kwad.sdk.core.e.c.printStackTrace(th);
            try {
                if (enableMonitorReport()) {
                    this.mMonitorRecorder.report();
                }
            } catch (Exception e6) {
            }
        }
    }

    protected boolean isPostByJson() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.a
    public void onResponse(R r, c cVar) {
        if (cVar == null) {
            notifyOnErrorListener((m<R, T>) r, f.aoX.errorCode, f.aoX.msg);
            this.mMonitorRecorder.dh("responseBase is null");
            com.kwad.sdk.core.e.c.e(TAG, "request responseBase is null");
            return;
        }
        this.mMonitorRecorder.bZ(cVar.code);
        checkIpDirect(cVar);
        if (TextUtils.isEmpty(cVar.aoR) || !cVar.Bb()) {
            notifyOnErrorListener((m<R, T>) r, cVar, "网络错误");
            com.kwad.sdk.core.network.b.b bVar = this.mMonitorRecorder;
            bVar.dh("httpCodeError:" + cVar.code + ":" + cVar.aoR);
            StringBuilder sb = new StringBuilder("request responseBase httpCodeError:");
            sb.append(cVar.code);
            com.kwad.sdk.core.e.c.w(TAG, sb.toString());
            return;
        }
        try {
            parseCommonData(r.getUrl(), cVar.aoR);
            T parseData = parseData(cVar.aoR);
            afterParseData(parseData);
            if (cVar.aoR != null) {
                this.mMonitorRecorder.X(cVar.aoR.length()).Bw().cb(parseData.result);
            }
            if (!parseData.isResultOk()) {
                com.kwad.sdk.core.network.b.b bVar2 = this.mMonitorRecorder;
                bVar2.dh("serverCodeError:" + parseData.result + ":" + parseData.errorMsg);
                if (parseData.notifyFailOnResultError()) {
                    notifyOnErrorListener((m<R, T>) r, parseData.result, parseData.errorMsg);
                    return;
                }
            }
            if (parseData.isDataEmpty()) {
                notifyOnErrorListener((m<R, T>) r, f.aoZ.errorCode, !TextUtils.isEmpty(parseData.testErrorMsg) ? parseData.testErrorMsg : f.aoZ.msg);
                return;
            }
            checkAndSetHasData(parseData);
            notifyOnSuccess(r, parseData);
        } catch (Exception e) {
            notifyOnErrorListener((m<R, T>) r, f.aoY.errorCode, f.aoY.msg);
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            com.kwad.sdk.core.network.b.b bVar3 = this.mMonitorRecorder;
            bVar3.dh("parseDataError:" + e.getMessage());
        }
    }

    protected abstract T parseData(String str);

    public void request(h<R, T> hVar) {
        onRequest(hVar);
        fetch();
    }
}
