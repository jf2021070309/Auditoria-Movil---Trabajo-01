package com.zipoapps.premiumhelper.toto;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.zipoapps.premiumhelper.toto.TotoRegisterWorker;
import com.zipoapps.premiumhelper.toto.TotoService;
import e.j.d.a0.a;
import e.j.d.c0.a0;
import e.j.d.i;
import e.j.d.w;
import e.j.d.y.b;
import h.d;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class TotoFeature {
    private final b configuration;
    private final Context context;
    private ResponseStats getConfigResponseStats;
    private final i preferences;
    private final d service$delegate;
    private final d serviceConfig$delegate;
    private final d userAgent$delegate;

    /* loaded from: classes2.dex */
    public static final class ResponseStats {
        private final String code;
        private final long latency;

        public ResponseStats(String str, long j2) {
            j.e(str, "code");
            this.code = str;
            this.latency = j2;
        }

        public static /* synthetic */ ResponseStats copy$default(ResponseStats responseStats, String str, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = responseStats.code;
            }
            if ((i2 & 2) != 0) {
                j2 = responseStats.latency;
            }
            return responseStats.copy(str, j2);
        }

        public final String component1() {
            return this.code;
        }

        public final long component2() {
            return this.latency;
        }

        public final ResponseStats copy(String str, long j2) {
            j.e(str, "code");
            return new ResponseStats(str, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ResponseStats) {
                ResponseStats responseStats = (ResponseStats) obj;
                return j.a(this.code, responseStats.code) && this.latency == responseStats.latency;
            }
            return false;
        }

        public final String getCode() {
            return this.code;
        }

        public final long getLatency() {
            return this.latency;
        }

        public int hashCode() {
            return a.a(this.latency) + (this.code.hashCode() * 31);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("ResponseStats(code=");
            y.append(this.code);
            y.append(", latency=");
            y.append(this.latency);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class TotoResponse<T> {
        private final ResponseStats responseStats;
        private final a0<m.a0<T>> result;

        public TotoResponse(a0<m.a0<T>> a0Var, ResponseStats responseStats) {
            j.e(a0Var, "result");
            j.e(responseStats, "responseStats");
            this.result = a0Var;
            this.responseStats = responseStats;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TotoResponse copy$default(TotoResponse totoResponse, a0 a0Var, ResponseStats responseStats, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                a0Var = totoResponse.result;
            }
            if ((i2 & 2) != 0) {
                responseStats = totoResponse.responseStats;
            }
            return totoResponse.copy(a0Var, responseStats);
        }

        public final a0<m.a0<T>> component1() {
            return this.result;
        }

        public final ResponseStats component2() {
            return this.responseStats;
        }

        public final TotoResponse<T> copy(a0<m.a0<T>> a0Var, ResponseStats responseStats) {
            j.e(a0Var, "result");
            j.e(responseStats, "responseStats");
            return new TotoResponse<>(a0Var, responseStats);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TotoResponse) {
                TotoResponse totoResponse = (TotoResponse) obj;
                return j.a(this.result, totoResponse.result) && j.a(this.responseStats, totoResponse.responseStats);
            }
            return false;
        }

        public final ResponseStats getResponseStats() {
            return this.responseStats;
        }

        public final a0<m.a0<T>> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.responseStats.hashCode() + (this.result.hashCode() * 31);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("TotoResponse(result=");
            y.append(this.result);
            y.append(", responseStats=");
            y.append(this.responseStats);
            y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return y.toString();
        }
    }

    public TotoFeature(Context context, b bVar, i iVar) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(bVar, "configuration");
        j.e(iVar, "preferences");
        this.context = context;
        this.configuration = bVar;
        this.preferences = iVar;
        this.userAgent$delegate = w.Z(new TotoFeature$userAgent$2(this));
        this.serviceConfig$delegate = w.Z(new TotoFeature$serviceConfig$2(this));
        this.service$delegate = w.Z(new TotoFeature$service$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0069, B:26:0x0074), top: B:43:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004d, B:25:0x0069, B:26:0x0074), top: B:43:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object callApi(h.o.b.l<? super h.m.d<? super m.a0<T>>, ? extends java.lang.Object> r10, h.m.d<? super com.zipoapps.premiumhelper.toto.TotoFeature.TotoResponse<T>> r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoFeature.callApi(h.o.b.l, h.m.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:16:0x0046). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object callApiWithRetry(int r9, h.o.b.l<? super h.m.d<? super m.a0<T>>, ? extends java.lang.Object> r10, h.m.d<? super com.zipoapps.premiumhelper.toto.TotoFeature.TotoResponse<T>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1
            if (r0 == 0) goto L13
            r0 = r11
            com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1 r0 = (com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1 r0 = new com.zipoapps.premiumhelper.toto.TotoFeature$callApiWithRetry$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.j.d.w.E0(r11)
            goto L86
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            h.o.b.l r2 = (h.o.b.l) r2
            java.lang.Object r5 = r0.L$0
            com.zipoapps.premiumhelper.toto.TotoFeature r5 = (com.zipoapps.premiumhelper.toto.TotoFeature) r5
            e.j.d.w.E0(r11)
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r2
        L46:
            r2 = r1
            r1 = r7
            goto L67
        L49:
            e.j.d.w.E0(r11)
            r11 = 0
            r5 = r8
        L4e:
            if (r11 >= r9) goto L78
            int r11 = r11 + 1
            r0.L$0 = r5
            r0.L$1 = r10
            r0.I$0 = r9
            r0.I$1 = r11
            r0.label = r4
            java.lang.Object r2 = r5.callApi(r10, r0)
            if (r2 != r1) goto L63
            return r1
        L63:
            r7 = r0
            r0 = r11
            r11 = r2
            goto L46
        L67:
            com.zipoapps.premiumhelper.toto.TotoFeature$TotoResponse r11 = (com.zipoapps.premiumhelper.toto.TotoFeature.TotoResponse) r11
            e.j.d.c0.a0 r6 = r11.getResult()
            boolean r6 = e.j.d.w.W(r6)
            if (r6 == 0) goto L74
            return r11
        L74:
            r11 = r0
            r0 = r1
            r1 = r2
            goto L4e
        L78:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r11 = r5.callApi(r10, r0)
            if (r11 != r1) goto L86
            return r1
        L86:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoFeature.callApiWithRetry(int, h.o.b.l, h.m.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TotoService.TotoServiceApi getService() {
        return (TotoService.TotoServiceApi) this.service$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TotoService.ServiceConfig getServiceConfig() {
        return (TotoService.ServiceConfig) this.serviceConfig$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserAgent() {
        return (String) this.userAgent$delegate.getValue();
    }

    public static /* synthetic */ void scheduleRegister$default(TotoFeature totoFeature, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        totoFeature.scheduleRegister(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getConfig(h.m.d<? super e.j.d.c0.a0<? extends java.lang.Object>> r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoFeature.getConfig(h.m.d):java.lang.Object");
    }

    public final ResponseStats getGetConfigResponseStats() {
        return this.getConfigResponseStats;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0173  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postConfig(h.m.d<? super e.j.d.c0.a0<? extends java.lang.Object>> r23) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoFeature.postConfig(h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerFcmToken(java.lang.String r23, h.m.d<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.toto.TotoFeature.registerFcmToken(java.lang.String, h.m.d):java.lang.Object");
    }

    public final void scheduleRegister(boolean z) {
        if (z || !this.preferences.a.getBoolean("is_fcm_registered", false)) {
            TotoRegisterWorker.Companion.schedule$default(TotoRegisterWorker.Companion, this.context, null, 2, null);
        }
    }

    public final void setGetConfigResponseStats(ResponseStats responseStats) {
        this.getConfigResponseStats = responseStats;
    }
}
