package com.kwad.sdk.core.network;

import com.kwad.sdk.core.network.NormalResultData;
import com.kwad.sdk.core.network.o;
/* loaded from: classes.dex */
public abstract class n<R extends o, T extends NormalResultData> extends a<R> {
    private static final String TAG = "NormalNetworking";
    private h<R, T> mListener = null;

    private void onRequest(h<R, T> hVar) {
        this.mListener = hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.sdk.core.network.a
    public void cancel() {
        super.cancel();
        this.mListener = null;
    }

    protected abstract T createResponseData();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kwad.sdk.core.network.a
    protected void fetchImpl() {
        String str;
        o oVar = (o) createRequest();
        c cVar = null;
        try {
            String url = oVar.getUrl();
            cVar = oVar.getMethod().equals("POST") ? com.kwad.sdk.g.wW().doPost(url, oVar.getHeader(), oVar.getBody()) : com.kwad.sdk.g.wW().doGet(url, oVar.getHeader());
            if (cVar == null || cVar.code != 200) {
                str = "normal request failed";
            } else {
                str = "normal request success:" + cVar.code;
            }
            com.kwad.sdk.core.e.c.d(TAG, str);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            if (cVar == null) {
                cVar = new c();
            }
            cVar.code = -1;
            cVar.aoQ = e;
        }
        onResponse((n<R, T>) oVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kwad.sdk.core.network.a
    protected /* bridge */ /* synthetic */ void onResponse(g gVar, c cVar) {
        onResponse((n<R, T>) ((o) gVar), cVar);
    }

    protected void onResponse(R r, c cVar) {
        if (this.mListener == null) {
            return;
        }
        if (!cVar.Bb()) {
            this.mListener.onError(r, cVar.code, cVar.aoQ != null ? cVar.aoQ.getMessage() : "");
            return;
        }
        T createResponseData = createResponseData();
        parseResponse(createResponseData, cVar);
        this.mListener.onSuccess(r, createResponseData);
    }

    protected void parseResponse(T t, c cVar) {
        t.parseResponse(cVar);
    }

    public void request(h<R, T> hVar) {
        onRequest(hVar);
        fetch();
    }
}
