package com.fyber.inneractive.sdk.h;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z extends ab<com.fyber.inneractive.sdk.j.e> implements j {
    StringBuffer a;
    com.fyber.inneractive.sdk.config.a.s b;
    private final InneractiveAdRequest g;
    private Map<String, String> h;
    private final com.fyber.inneractive.sdk.l.c i;
    private com.fyber.inneractive.sdk.dv.g j;

    @Override // com.fyber.inneractive.sdk.h.y
    public final boolean g() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int h() {
        return 0;
    }

    public z(r<com.fyber.inneractive.sdk.j.e> rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.a.s sVar) {
        this(rVar, inneractiveAdRequest, new com.fyber.inneractive.sdk.l.b(sVar), new f(), sVar);
    }

    private z(r<com.fyber.inneractive.sdk.j.e> rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.l.c cVar, e eVar, com.fyber.inneractive.sdk.config.a.s sVar) {
        super(rVar, eVar);
        this.j = null;
        this.b = sVar;
        this.g = inneractiveAdRequest;
        this.i = cVar;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final u c() {
        return u.POST;
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final Map<String, String> d() {
        String e = com.fyber.inneractive.sdk.config.f.e();
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mockadnetworkresponseid", e);
        IAlog.b("NetworkRequestAd: Adding mock response header - %s", e);
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final int m() {
        return ah.a;
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final com.fyber.inneractive.sdk.config.a.s o() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final byte[] e() {
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray i = this.i.i();
            if (i != null && i.length() > 0) {
                jSONObject2.put("experiments", i);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a = com.fyber.inneractive.sdk.l.a.a(this.g.getSpotId());
            JSONArray a2 = IAConfigManager.n().a.a(a);
            if (a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            int a3 = IAConfigManager.c().a.a("dv_enabled", 0, 0);
            if (a != null && a3 == 1) {
                com.fyber.inneractive.sdk.dv.g a4 = IAConfigManager.d().a(a);
                this.j = a4;
                if (a4 != null) {
                    jSONObject.put("gdem_signal", a4.a.getQuery());
                }
            }
            if (Build.VERSION.SDK_INT >= 19) {
                bArr = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            } else {
                bArr = jSONObject.toString().getBytes("UTF-8");
            }
            IAlog.b("request json body - %s", jSONObject.toString());
        } catch (Exception unused) {
            IAlog.b("Failed building body for ad request!", new Object[0]);
        }
        return bArr;
    }

    @Override // com.fyber.inneractive.sdk.h.j
    public final Map<String, String> a() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.h.j
    public final StringBuffer b() {
        return this.a;
    }

    private static StringBuffer a(InputStream inputStream) {
        try {
            return com.fyber.inneractive.sdk.util.q.a(inputStream);
        } catch (Exception e) {
            IAlog.a("failed create response builder in network request ad", e, new Object[0]);
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.h.y
    public final String k() {
        String a;
        String a2 = com.fyber.inneractive.sdk.config.f.a();
        if (TextUtils.isEmpty(a2)) {
            a = "https://" + IAConfigManager.n.h.g;
        } else {
            a = com.fyber.inneractive.sdk.config.a.a(a2, "clientRequestEnhancedXmlAd");
        }
        return com.fyber.inneractive.sdk.util.ai.a(a, new aa(this.g, this.i).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:21:0x0048, B:23:0x0054, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x006f, B:35:0x0078, B:37:0x008f, B:38:0x0096, B:39:0x00a9, B:40:0x00aa, B:42:0x00c5, B:43:0x00ca, B:45:0x00d0), top: B:49:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:21:0x0048, B:23:0x0054, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x006f, B:35:0x0078, B:37:0x008f, B:38:0x0096, B:39:0x00a9, B:40:0x00aa, B:42:0x00c5, B:43:0x00ca, B:45:0x00d0), top: B:49:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:21:0x0048, B:23:0x0054, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x006f, B:35:0x0078, B:37:0x008f, B:38:0x0096, B:39:0x00a9, B:40:0x00aa, B:42:0x00c5, B:43:0x00ca, B:45:0x00d0), top: B:49:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:21:0x0048, B:23:0x0054, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x006f, B:35:0x0078, B:37:0x008f, B:38:0x0096, B:39:0x00a9, B:40:0x00aa, B:42:0x00c5, B:43:0x00ca, B:45:0x00d0), top: B:49:0x0048 }] */
    /* JADX WARN: Type inference failed for: r7v11, types: [T, com.fyber.inneractive.sdk.j.e] */
    @Override // com.fyber.inneractive.sdk.h.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.h.w<com.fyber.inneractive.sdk.j.e> a(java.io.InputStream r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L38
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r7 == 0) goto L36
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L12
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L12
            int r4 = r3.size()
            if (r4 <= 0) goto L12
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L12
        L36:
            r5.h = r0
        L38:
            if (r6 == 0) goto L40
            java.lang.StringBuffer r6 = a(r6)
            r5.a = r6
        L40:
            com.fyber.inneractive.sdk.h.x r6 = new com.fyber.inneractive.sdk.h.x
            r6.<init>()
            r0 = 0
            if (r7 == 0) goto L5e
            com.fyber.inneractive.sdk.h.i r1 = com.fyber.inneractive.sdk.h.i.RETURNED_AD_TYPE     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = r1.E     // Catch: java.lang.Exception -> L5b
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Exception -> L5b
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L5b
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L5b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L5b
            goto L5f
        L5b:
            r6 = move-exception
            goto Ld8
        L5e:
            r7 = r0
        L5f:
            if (r7 == 0) goto L66
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L5b
            goto L67
        L66:
            r7 = 6
        L67:
            com.fyber.inneractive.sdk.j.a r1 = com.fyber.inneractive.sdk.j.a.a(r7)     // Catch: java.lang.Exception -> L5b
            if (r1 != 0) goto L6f
            com.fyber.inneractive.sdk.j.a r1 = com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_MRAID     // Catch: java.lang.Exception -> L5b
        L6f:
            com.fyber.inneractive.sdk.c.c r2 = com.fyber.inneractive.sdk.c.c.a.a     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.j.b r1 = r2.a(r1)     // Catch: java.lang.Exception -> L5b
            r2 = 1
            if (r1 != 0) goto Laa
            java.lang.String r6 = "Received ad type %s does not have an appropriate parser!"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L5b
            r0[r8] = r1     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.util.IAlog.d(r6, r0)     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.c.c r6 = com.fyber.inneractive.sdk.c.c.a.a     // Catch: java.lang.Exception -> L5b
            java.util.HashMap<com.fyber.inneractive.sdk.j.a, com.fyber.inneractive.sdk.c.c$b> r6 = r6.a     // Catch: java.lang.Exception -> L5b
            int r6 = r6.size()     // Catch: java.lang.Exception -> L5b
            if (r6 != 0) goto L96
            java.lang.String r6 = "Inneractive_error"
            java.lang.String r0 = "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project"
            android.util.Log.e(r6, r0)     // Catch: java.lang.Exception -> L5b
        L96:
            com.fyber.inneractive.sdk.h.v r6 = new com.fyber.inneractive.sdk.h.v     // Catch: java.lang.Exception -> L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = "Could not find parser for ad type "
            r0.<init>(r1)     // Catch: java.lang.Exception -> L5b
            r0.append(r7)     // Catch: java.lang.Exception -> L5b
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L5b
            r6.<init>(r7)     // Catch: java.lang.Exception -> L5b
            throw r6     // Catch: java.lang.Exception -> L5b
        Laa:
            java.lang.String r3 = "Received ad type %s - Got parser! %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L5b
            r4[r8] = r7     // Catch: java.lang.Exception -> L5b
            r4[r2] = r1     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.util.IAlog.b(r3, r4)     // Catch: java.lang.Exception -> L5b
            r1.a(r5)     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.j.e r7 = r1.a(r0)     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.dv.g r0 = r5.j     // Catch: java.lang.Exception -> L5b
            if (r0 == 0) goto Lca
            com.fyber.inneractive.sdk.dv.g r0 = r5.j     // Catch: java.lang.Exception -> L5b
            r7.a(r0)     // Catch: java.lang.Exception -> L5b
        Lca:
            r6.a = r7     // Catch: java.lang.Exception -> L5b
            com.fyber.inneractive.sdk.h.y$a r7 = r5.f     // Catch: java.lang.Exception -> L5b
            if (r7 == 0) goto Ld7
            com.fyber.inneractive.sdk.h.y$a r7 = r5.f     // Catch: java.lang.Exception -> L5b
            java.lang.String r0 = "sdkParsedResponse"
            r7.a(r0)     // Catch: java.lang.Exception -> L5b
        Ld7:
            return r6
        Ld8:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.a(r8, r6, r7)
            com.fyber.inneractive.sdk.h.v r7 = new com.fyber.inneractive.sdk.h.v
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.h.z.a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.h.w");
    }

    @Override // com.fyber.inneractive.sdk.h.ab, com.fyber.inneractive.sdk.h.y
    public final ak q() {
        com.fyber.inneractive.sdk.config.a.a.a aVar;
        com.fyber.inneractive.sdk.config.a.s sVar = this.b;
        if (sVar != null && (aVar = (com.fyber.inneractive.sdk.config.a.a.a) sVar.a(com.fyber.inneractive.sdk.config.a.a.a.class)) != null) {
            return new ak(Math.max(aVar.a("connect_timeout", 5000), 1), Math.max(aVar.a("read_timeout", 5000), 1));
        }
        return super.q();
    }
}
