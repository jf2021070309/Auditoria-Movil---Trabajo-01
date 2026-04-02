package com.google.android.gms.common.api.internal;

import c.f.a;
import c.f.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class zal {
    private int zad;
    private final a<ApiKey<?>, String> zab = new a<>();
    private final TaskCompletionSource<Map<ApiKey<?>, String>> zac = new TaskCompletionSource<>();
    private boolean zae = false;
    private final a<ApiKey<?>, ConnectionResult> zaa = new a<>();

    public zal(Iterable<? extends HasApiKey<?>> iterable) {
        for (HasApiKey<?> hasApiKey : iterable) {
            this.zaa.put(hasApiKey.getApiKey(), null);
        }
        this.zad = ((g.c) this.zaa.keySet()).size();
    }

    public final Task<Map<ApiKey<?>, String>> zaa() {
        return this.zac.getTask();
    }

    public final Set<ApiKey<?>> zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey<?> apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(this.zab);
                return;
            }
            this.zac.setException(new AvailabilityException(this.zaa));
        }
    }
}
