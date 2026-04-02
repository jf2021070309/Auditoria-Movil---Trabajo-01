package com.google.android.gms.common.api.internal;

import com.amazon.aps.iva.x.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class zal {
    private int zad;
    private final a zab = new a();
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final a zaa = new a();

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = a.this.d;
    }

    public final Task zaa() {
        return this.zac.getTask();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (this.zae) {
                this.zac.setException(new AvailabilityException(this.zaa));
                return;
            }
            this.zac.setResult(this.zab);
        }
    }
}
