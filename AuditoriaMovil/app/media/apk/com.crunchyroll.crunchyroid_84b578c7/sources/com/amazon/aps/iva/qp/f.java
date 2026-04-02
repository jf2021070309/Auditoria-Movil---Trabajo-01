package com.amazon.aps.iva.qp;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: UploadStatus.kt */
/* loaded from: classes2.dex */
public enum f {
    SUCCESS(false),
    NETWORK_ERROR(true),
    INVALID_TOKEN_ERROR(false),
    HTTP_REDIRECTION(false),
    HTTP_CLIENT_ERROR(false),
    HTTP_SERVER_ERROR(true),
    HTTP_CLIENT_RATE_LIMITING(true),
    UNKNOWN_ERROR(false);
    
    private final boolean shouldRetry;

    /* compiled from: UploadStatus.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            iArr[f.NETWORK_ERROR.ordinal()] = 1;
            iArr[f.INVALID_TOKEN_ERROR.ordinal()] = 2;
            iArr[f.HTTP_REDIRECTION.ordinal()] = 3;
            iArr[f.HTTP_CLIENT_ERROR.ordinal()] = 4;
            iArr[f.HTTP_CLIENT_RATE_LIMITING.ordinal()] = 5;
            iArr[f.HTTP_SERVER_ERROR.ordinal()] = 6;
            iArr[f.UNKNOWN_ERROR.ordinal()] = 7;
            iArr[f.SUCCESS.ordinal()] = 8;
            a = iArr;
        }
    }

    f(boolean z) {
        this.shouldRetry = z;
    }

    public static /* synthetic */ void logStatus$default(f fVar, String str, int i, com.amazon.aps.iva.iq.a aVar, boolean z, boolean z2, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 32) != 0) {
                str2 = null;
            }
            fVar.logStatus(str, i, aVar, z, z2, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logStatus");
    }

    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    public final void logStatus(String str, int i, com.amazon.aps.iva.iq.a aVar, boolean z, boolean z2, String str2) {
        String c;
        j.f(str, "context");
        j.f(aVar, "logger");
        if (str2 == null) {
            c = "Batch [" + i + " bytes] (" + str + ")";
        } else {
            StringBuilder sb = new StringBuilder("Batch ");
            sb.append(str2);
            sb.append(" [");
            sb.append(i);
            sb.append(" bytes] (");
            c = defpackage.b.c(sb, str, ")");
        }
        switch (a.a[ordinal()]) {
            case 1:
                com.amazon.aps.iva.iq.a.a(aVar, c + " failed because of a network error; we will retry later.", null, 6);
                return;
            case 2:
                if (!z) {
                    com.amazon.aps.iva.iq.a.a(aVar, c + " failed because your token is invalid. Make sure that the provided token still exists and you're targeting the relevant Datadog site.", null, 6);
                    return;
                }
                return;
            case 3:
                com.amazon.aps.iva.iq.a.e(aVar, c + " failed because of a network redirection; the batch was dropped.", null, 6);
                return;
            case 4:
                String f = com.amazon.aps.iva.c80.a.f(c, " failed because of a processing error or invalid data; the batch was dropped.");
                if (z2) {
                    l1.z(aVar, f, null, 6);
                    return;
                } else {
                    com.amazon.aps.iva.iq.a.a(aVar, f, null, 6);
                    return;
                }
            case 5:
                String f2 = com.amazon.aps.iva.c80.a.f(c, " failed because of a request error; we will retry later.");
                if (z2) {
                    l1.z(aVar, f2, null, 6);
                    return;
                } else {
                    com.amazon.aps.iva.iq.a.a(aVar, f2, null, 6);
                    return;
                }
            case 6:
                com.amazon.aps.iva.iq.a.a(aVar, c + " failed because of a server processing error; we will retry later.", null, 6);
                return;
            case 7:
                com.amazon.aps.iva.iq.a.a(aVar, c + " failed because of an unknown error; the batch was dropped.", null, 6);
                return;
            case 8:
                if (!z) {
                    String f3 = com.amazon.aps.iva.c80.a.f(c, " sent successfully.");
                    a0 a0Var = a0.b;
                    j.f(f3, "message");
                    com.amazon.aps.iva.iq.a.c(aVar, 2, f3, null, a0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
