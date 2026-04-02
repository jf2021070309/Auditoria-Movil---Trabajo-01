package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import java.io.IOException;
import java.net.SocketTimeoutException;
import javax.inject.Inject;
import org.json.JSONException;
/* loaded from: classes4.dex */
public abstract class tx {
    @Inject
    protected uj a;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ub ubVar, tw twVar) {
        try {
            if (a(twVar.b())) {
                try {
                    try {
                        c(ubVar, twVar);
                        return;
                    } catch (IOException e) {
                        Logger.e(Logger.NETWORK_TAG, "IOException while handling response: " + twVar, e);
                        twVar.a(600);
                    }
                } catch (SocketTimeoutException e2) {
                    Logger.d(Logger.NETWORK_TAG, e2);
                    twVar.a(603);
                } catch (JSONException e3) {
                    Logger.e(Logger.NETWORK_TAG, "JSONException while handling response: " + twVar, e3);
                    twVar.a(604);
                }
            }
            b(ubVar, twVar);
        } catch (Exception e4) {
            a(ubVar, twVar, e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(ub ubVar, tw twVar) {
        d(ubVar, twVar);
    }

    protected void c(ub ubVar, tw twVar) {
    }

    protected void a(ub ubVar, tw twVar, Exception exc) {
        Logger.e(Logger.NETWORK_TAG, "error while handling response: " + twVar, exc);
        d(ubVar, twVar);
    }

    protected void d(ub ubVar, tw twVar) {
        Logger.w(Logger.NETWORK_TAG, ubVar.a() + " failed permanently with response code " + twVar.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(int i) {
        return i == 200;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(int i) {
        return (i == 408 || i == 603) ? false : true;
    }
}
