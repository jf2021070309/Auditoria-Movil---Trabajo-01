package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
/* loaded from: classes.dex */
public final class h0 implements IPutIntoJson, y1 {
    public static final b n = new b(null);
    private final BrazeConfigurationProvider b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Boolean i;
    private final Boolean j;
    private final String k;
    private final Boolean l;
    private boolean m;

    /* loaded from: classes.dex */
    public static final class a {
        private final BrazeConfigurationProvider a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private Boolean h;
        private Boolean i;
        private String j;
        private Boolean k;

        public a(BrazeConfigurationProvider brazeConfigurationProvider) {
            com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
            this.a = brazeConfigurationProvider;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Boolean bool) {
            this.h = bool;
            return this;
        }

        public final a d(String str) {
            this.e = str;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }

        public final a f(String str) {
            this.g = str;
            return this;
        }

        public final a g(String str) {
            this.f = str;
            return this;
        }

        public final a a(Boolean bool) {
            this.k = bool;
            return this;
        }

        public final a b(Boolean bool) {
            this.i = bool;
            return this;
        }

        public final a c(String str) {
            this.j = str;
            return this;
        }

        public final h0 a() {
            return new h0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[DeviceKey.values().length];
                try {
                    iArr[DeviceKey.TIMEZONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DeviceKey.CARRIER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DeviceKey.ANDROID_VERSION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DeviceKey.RESOLUTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DeviceKey.LOCALE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DeviceKey.MODEL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DeviceKey.NOTIFICATIONS_ENABLED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DeviceKey.IS_BACKGROUND_RESTRICTED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[DeviceKey.GOOGLE_ADVERTISING_ID.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[DeviceKey.AD_TRACKING_ENABLED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                a = iArr;
            }
        }

        /* renamed from: bo.app.h0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0073b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ DeviceKey b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0073b(DeviceKey deviceKey) {
                super(0);
                this.b = deviceKey;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Not adding device key <" + this.b + "> to export due to allowlist restrictions.";
            }
        }

        public /* synthetic */ b(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final h0 a(BrazeConfigurationProvider brazeConfigurationProvider, com.amazon.aps.iva.if0.c cVar) {
            DeviceKey[] values;
            com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
            com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
            a aVar = new a(brazeConfigurationProvider);
            for (DeviceKey deviceKey : DeviceKey.values()) {
                String key = deviceKey.getKey();
                switch (a.a[deviceKey.ordinal()]) {
                    case 1:
                        aVar.g(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 2:
                        aVar.b(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 3:
                        aVar.a(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 4:
                        aVar.f(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 5:
                        aVar.d(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 6:
                        aVar.e(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 7:
                        if (cVar.has(key)) {
                            aVar.c(Boolean.valueOf(cVar.optBoolean(key, true)));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (cVar.has(key)) {
                            aVar.b(Boolean.valueOf(cVar.optBoolean(key, false)));
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        aVar.c(JsonUtils.getOptionalString(cVar, key));
                        break;
                    case 10:
                        if (cVar.has(key)) {
                            aVar.a(Boolean.valueOf(cVar.optBoolean(key)));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return aVar.a();
        }

        private b() {
        }

        public final void a(BrazeConfigurationProvider brazeConfigurationProvider, com.amazon.aps.iva.if0.c cVar, DeviceKey deviceKey, Object obj) {
            com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
            com.amazon.aps.iva.yb0.j.f(cVar, "deviceExport");
            com.amazon.aps.iva.yb0.j.f(deviceKey, "exportKey");
            if (brazeConfigurationProvider.isDeviceObjectAllowlistEnabled() && !brazeConfigurationProvider.getDeviceObjectAllowlist().contains(deviceKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0073b(deviceKey), 2, (Object) null);
            } else {
                cVar.putOpt(deviceKey.getKey(), obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating device Json.";
        }
    }

    public h0(BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        this.b = brazeConfigurationProvider;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = bool;
        this.j = bool2;
        this.k = str7;
        this.l = bool3;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    @Override // bo.app.y1
    public boolean isEmpty() {
        if (forJsonPut().length() == 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        return forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[Catch: b -> 0x0083, TryCatch #0 {b -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: b -> 0x0083, TryCatch #0 {b -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: b -> 0x0083, TRY_LEAVE, TryCatch #0 {b -> 0x0083, blocks: (B:3:0x0005, B:5:0x004c, B:11:0x0058, B:12:0x0061, B:14:0x0065, B:15:0x006c, B:17:0x0070, B:21:0x0079), top: B:26:0x0005 }] */
    @Override // com.braze.models.IPutIntoJson
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        /*
            r7 = this;
            com.amazon.aps.iva.if0.c r0 = new com.amazon.aps.iva.if0.c
            r0.<init>()
            bo.app.h0$b r1 = bo.app.h0.n     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.ANDROID_VERSION     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r4 = r7.c     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.CARRIER     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r4 = r7.d     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.MODEL     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r4 = r7.e     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.RESOLUTION     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r4 = r7.h     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.LOCALE     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r4 = r7.f     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.NOTIFICATIONS_ENABLED     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.Boolean r4 = r7.i     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.IS_BACKGROUND_RESTRICTED     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.Boolean r4 = r7.j     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r2 = r7.k     // Catch: com.amazon.aps.iva.if0.b -> L83
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L55
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r2)     // Catch: com.amazon.aps.iva.if0.b -> L83
            if (r2 == 0) goto L53
            goto L55
        L53:
            r2 = r3
            goto L56
        L55:
            r2 = r4
        L56:
            if (r2 != 0) goto L61
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r5 = com.braze.enums.DeviceKey.GOOGLE_ADVERTISING_ID     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r6 = r7.k     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r5, r6)     // Catch: com.amazon.aps.iva.if0.b -> L83
        L61:
            java.lang.Boolean r2 = r7.l     // Catch: com.amazon.aps.iva.if0.b -> L83
            if (r2 == 0) goto L6c
            com.braze.configuration.BrazeConfigurationProvider r5 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r6 = com.braze.enums.DeviceKey.AD_TRACKING_ENABLED     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r5, r0, r6, r2)     // Catch: com.amazon.aps.iva.if0.b -> L83
        L6c:
            java.lang.String r2 = r7.g     // Catch: com.amazon.aps.iva.if0.b -> L83
            if (r2 == 0) goto L76
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r2)     // Catch: com.amazon.aps.iva.if0.b -> L83
            if (r2 == 0) goto L77
        L76:
            r3 = r4
        L77:
            if (r3 != 0) goto L8d
            com.braze.configuration.BrazeConfigurationProvider r2 = r7.b     // Catch: com.amazon.aps.iva.if0.b -> L83
            com.braze.enums.DeviceKey r3 = com.braze.enums.DeviceKey.TIMEZONE     // Catch: com.amazon.aps.iva.if0.b -> L83
            java.lang.String r4 = r7.g     // Catch: com.amazon.aps.iva.if0.b -> L83
            r1.a(r2, r0, r3, r4)     // Catch: com.amazon.aps.iva.if0.b -> L83
            goto L8d
        L83:
            r1 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.E
            bo.app.h0$c r4 = bo.app.h0.c.b
            r2.brazelog(r7, r3, r1, r4)
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.h0.forJsonPut():com.amazon.aps.iva.if0.c");
    }

    public final boolean w() {
        return this.m;
    }
}
