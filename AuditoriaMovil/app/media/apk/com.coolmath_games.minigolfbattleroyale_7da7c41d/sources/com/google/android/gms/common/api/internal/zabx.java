package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
/* loaded from: classes.dex */
public final class zabx<T> implements OnCompleteListener<T> {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey<?> zac;
    private final long zad;

    zabx(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey, long j, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zabx<T> zaa(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey) {
        boolean z;
        if (googleApiManager.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                z = true;
            } else if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            } else {
                z = config.getMethodTimingTelemetryEnabled();
                zabl zag = googleApiManager.zag(apiKey);
                if (zag != null) {
                    if (!(zag.zaf() instanceof BaseGmsClient)) {
                        return null;
                    }
                    BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zag, baseGmsClient, i);
                        if (zab == null) {
                            return null;
                        }
                        zag.zas();
                        z = zab.getMethodTimingTelemetryEnabled();
                    }
                }
            }
            return new zabx<>(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration zab(zabl<?> zablVar, BaseGmsClient<?> baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zablVar.zar() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<T> task) {
        zabl zag;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (this.zaa.zam()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zag = this.zaa.zag(this.zac)) != null && (zag.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zag.zaf();
                boolean z = true;
                boolean z2 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i6 = 100;
                if (config != null) {
                    z2 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zag, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                            z = false;
                        }
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z2 = z;
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (task.isCanceled()) {
                        i4 = -1;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            i6 = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            i4 = connectionResult == null ? -1 : connectionResult.getErrorCode();
                        } else {
                            i4 = -1;
                            i5 = 101;
                        }
                    }
                    i5 = i6;
                }
                if (z2) {
                    j = this.zad;
                    j2 = System.currentTimeMillis();
                } else {
                    j = 0;
                    j2 = 0;
                }
                googleApiManager.zar(new MethodInvocation(this.zab, i5, i4, j, j2, null, null, gCoreServiceId), i, i3, i2);
            }
        }
    }
}
