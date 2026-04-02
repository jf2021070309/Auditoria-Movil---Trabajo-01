package com.amazon.aps.iva.os;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.appconfig.ConfigDeltaService;
/* compiled from: RemoteAppConfigLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.ps.b {
    public final ConfigDeltaService a;
    public final String b;

    /* compiled from: RemoteAppConfigLoaderImpl.kt */
    @e(c = "com.ellation.appconfig.loaders.RemoteAppConfigLoaderImpl", f = "RemoteAppConfigLoaderImpl.kt", l = {12}, m = "load")
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public /* synthetic */ Object h;
        public int j;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    public b(ConfigDeltaService configDeltaService, String str) {
        j.f(configDeltaService, "configDeltaService");
        this.a = configDeltaService;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.ps.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.google.gson.JsonObject> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.os.b.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.os.b$a r0 = (com.amazon.aps.iva.os.b.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.os.b$a r0 = new com.amazon.aps.iva.os.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.j = r3
            com.ellation.crunchyroll.api.appconfig.ConfigDeltaService r5 = r4.a
            java.lang.String r2 = "cr-android"
            java.lang.String r3 = r4.b
            java.lang.Object r5 = r5.getConfigDelta(r2, r3, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.google.gson.JsonObject r5 = (com.google.gson.JsonObject) r5
            java.lang.String r0 = "config_delta"
            com.google.gson.JsonObject r5 = r5.getAsJsonObject(r0)
            if (r5 != 0) goto L50
            com.google.gson.JsonObject r5 = new com.google.gson.JsonObject
            r5.<init>()
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.os.b.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
