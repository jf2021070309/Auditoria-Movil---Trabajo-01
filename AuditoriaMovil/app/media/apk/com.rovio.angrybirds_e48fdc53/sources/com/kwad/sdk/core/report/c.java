package com.kwad.sdk.core.report;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.kwad.sdk.core.network.BaseResultData;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.report.g;
import com.kwad.sdk.core.response.model.BatchReportResult;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.service.ServiceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class c<T extends g, R extends com.kwad.sdk.core.network.g> {
    private T aqP;
    private Context mContext;
    private static volatile Handler mHandler = null;
    private static ExecutorService aqM = null;
    private volatile long aqK = 120000;
    private o aqL = new q();
    private AtomicInteger aqN = new AtomicInteger(0);
    private AtomicInteger mRetryCount = new AtomicInteger(0);
    private int aqO = 5;

    /* JADX INFO: Access modifiers changed from: protected */
    public c() {
        if (aqM == null) {
            aqM = GlobalThreadPools.CT();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean BO() {
        int i = this.mRetryCount.get();
        if (i > 16) {
            i = 16;
        }
        w wVar = (w) ServiceProvider.get(w.class);
        return this.aqL.size() >= (wVar != null ? (long) (wVar.xq() << i) : 20L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void BQ() {
        int andIncrement = this.mRetryCount.getAndIncrement();
        if (andIncrement <= this.aqO) {
            if (andIncrement > 0) {
                this.aqK *= 2;
            }
            ad(this.aqK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ad(long j) {
        if (mHandler == null) {
            return;
        }
        mHandler.removeMessages(16843025);
        Message obtain = Message.obtain(mHandler, a(this.mContext, this.aqL, this.aqN));
        obtain.what = 16843025;
        mHandler.sendMessageDelayed(obtain, j);
    }

    private void c(final n<T> nVar) {
        new com.kwad.sdk.core.network.m<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.c.4
            private static BatchReportResult ds(String str) {
                JSONObject jSONObject = new JSONObject(str);
                BatchReportResult batchReportResult = new BatchReportResult();
                batchReportResult.parseJson(jSONObject);
                return batchReportResult;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.kwad.sdk.core.network.a
            public final R createRequest() {
                g BT = nVar.BT();
                c.this.aqP = BT;
                return (R) c.this.a((c) BT);
            }

            @Override // com.kwad.sdk.core.network.m
            public final boolean enableMonitorReport() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.a
            public final ExecutorService getExecutor() {
                return c.aqM;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ BatchReportResult parseData(String str) {
                return ds(str);
            }
        }.request(new com.kwad.sdk.core.network.p<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.c.5
            private void a(BatchReportResult batchReportResult) {
                com.kwad.sdk.core.e.c.d("BaseBatchReporter", "立即上报 onSuccess action= " + c.this.aqP + " result " + batchReportResult.getResult());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final void onError(R r, int i, String str) {
                c.this.a((n) new n<T>() { // from class: com.kwad.sdk.core.report.c.5.1
                    @Override // com.kwad.sdk.core.report.n
                    public final T BT() {
                        return (T) c.this.aqP;
                    }
                });
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(com.kwad.sdk.core.network.g gVar, BaseResultData baseResultData) {
                a((BatchReportResult) baseResultData);
            }
        });
    }

    public final void BP() {
        ad(0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public R a(T t) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return s(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Runnable a(Context context, o<T> oVar, AtomicInteger atomicInteger) {
        return new aa(context, oVar, this, atomicInteger);
    }

    public final void a(final n<T> nVar) {
        aqM.execute(new Runnable() { // from class: com.kwad.sdk.core.report.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.mHandler != null && !c.mHandler.hasMessages(16843025)) {
                    c cVar = c.this;
                    cVar.ad(cVar.aqK);
                }
                g BT = nVar.BT();
                if (BT != null) {
                    c.this.aqL.j(BT);
                }
                if (c.this.BO()) {
                    c.this.BP();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(o oVar) {
        this.aqL = oVar;
    }

    public final void a(final List<T> list, final AtomicBoolean atomicBoolean) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.aqN.getAndIncrement();
        new com.kwad.sdk.core.network.m<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.c.2
            private static BatchReportResult ds(String str) {
                JSONObject jSONObject = new JSONObject(str);
                BatchReportResult batchReportResult = new BatchReportResult();
                batchReportResult.parseJson(jSONObject);
                return batchReportResult;
            }

            @Override // com.kwad.sdk.core.network.a
            public final R createRequest() {
                return (R) c.this.s(list);
            }

            @Override // com.kwad.sdk.core.network.m
            public final boolean enableMonitorReport() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.a
            public final ExecutorService getExecutor() {
                return c.aqM;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ BatchReportResult parseData(String str) {
                return ds(str);
            }
        }.request(new com.kwad.sdk.core.network.p<R, BatchReportResult>() { // from class: com.kwad.sdk.core.report.c.3
            private void a(BatchReportResult batchReportResult) {
                c.this.aqL.t(list);
                if (c.this.aqN.decrementAndGet() == 0 && atomicBoolean.get()) {
                    c.this.BQ();
                }
                c.this.ac(batchReportResult.getInterval());
                c cVar = c.this;
                cVar.ad(cVar.aqK);
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final void onError(R r, int i, String str) {
                atomicBoolean.set(true);
                if (c.this.aqN.decrementAndGet() == 0) {
                    c.this.BQ();
                }
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onSuccess(com.kwad.sdk.core.network.g gVar, BaseResultData baseResultData) {
                a((BatchReportResult) baseResultData);
            }
        });
    }

    protected final void ac(long j) {
        this.aqK = j < 60 ? 60000L : j * 1000;
    }

    public final void b(n<T> nVar) {
        try {
            c(nVar);
        } catch (Throwable th) {
            ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(th);
        }
    }

    public synchronized void i(Context context, int i) {
        this.mContext = context;
        if (mHandler == null) {
            mHandler = com.kwad.sdk.core.threads.a.CN();
        }
    }

    protected abstract R s(List<T> list);
}
