package com.kwad.sdk.core.report;

import android.content.Context;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.report.g;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.be;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class aa<T extends g, R extends com.kwad.sdk.core.network.g> implements Runnable {
    private static long atN = -1;
    protected final o<T> aqL;
    protected final c<T, R> atO;
    protected final AtomicInteger atP;
    protected final Context mContext;

    public aa(Context context, o<T> oVar, c<T, R> cVar, AtomicInteger atomicInteger) {
        this.mContext = context;
        this.aqL = oVar;
        this.atO = cVar;
        this.atP = atomicInteger;
    }

    private void Cp() {
        long JF = be.JF();
        if (JF >= atN * 2) {
            try {
                List<T> BW = this.aqL.BW();
                if (BW.isEmpty()) {
                    return;
                }
                w(BW);
            } catch (OutOfMemoryError e) {
                atN = JF;
                ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(e);
            } catch (Throwable th) {
                ((com.kwad.sdk.service.a.d) ServiceProvider.get(com.kwad.sdk.service.a.d.class)).gatherException(th);
            }
        }
    }

    private void w(List<T> list) {
        List d = com.kwad.sdk.utils.z.d(list, 200);
        int size = d.size();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (int i = 0; i < size; i++) {
            this.atO.a((List) d.get(i), atomicBoolean);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.atP.get() > 0 || !ag.isNetworkConnected(this.mContext)) {
            return;
        }
        Cp();
    }
}
