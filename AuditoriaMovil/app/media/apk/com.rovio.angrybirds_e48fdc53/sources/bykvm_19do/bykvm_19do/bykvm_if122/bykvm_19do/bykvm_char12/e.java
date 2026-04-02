package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.l0;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e extends a {
    private static volatile e e;
    protected final Map<String, String> c;
    private final Map<String, double[]> d;

    private e() {
        super("label_v_v_s");
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        c();
    }

    private Map<String, JSONObject> a(String str, double[] dArr) {
        JSONObject jSONObject;
        JSONException e2;
        HashMap hashMap = new HashMap();
        String a = a(dArr);
        JSONObject jSONObject2 = null;
        try {
        } catch (JSONException e3) {
            jSONObject = null;
            e2 = e3;
        }
        if (!a.equals(GMNetworkPlatformConst.AD_NETWORK_NO_PRICE)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("input", b(a));
                jSONObject.putOpt("timestamp", String.valueOf(System.currentTimeMillis()));
            } catch (JSONException e4) {
                e2 = e4;
                e2.printStackTrace();
                jSONObject2 = jSONObject;
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt(RewardItem.KEY_ECPM, a);
                jSONObject4.putOpt("timestamp", String.valueOf(System.currentTimeMillis()));
                jSONObject3.putOpt("ecpm_info", jSONObject4);
                hashMap.put("config_req_label_value", jSONObject2);
                hashMap.put("event_label_value", jSONObject3);
                return hashMap;
            }
            jSONObject2 = jSONObject;
        }
        JSONObject jSONObject32 = new JSONObject();
        JSONObject jSONObject42 = new JSONObject();
        try {
            jSONObject42.putOpt(RewardItem.KEY_ECPM, a);
            jSONObject42.putOpt("timestamp", String.valueOf(System.currentTimeMillis()));
            jSONObject32.putOpt("ecpm_info", jSONObject42);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        hashMap.put("config_req_label_value", jSONObject2);
        hashMap.put("event_label_value", jSONObject32);
        return hashMap;
    }

    private Map<String, double[]> b(Map<String, String> map) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(value)) {
                        String[] split = value.split("_");
                        String str = split[0];
                        String str2 = split[1];
                        String str3 = split[2];
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(System.currentTimeMillis() - Long.parseLong(split[2]))) {
                                double[] dArr = (double[]) concurrentHashMap.get(str);
                                if (dArr == null) {
                                    dArr = new double[2];
                                }
                                dArr[0] = dArr[0] + 1.0d;
                                dArr[1] = dArr[1] + Double.parseDouble(str2);
                                concurrentHashMap.put(str, dArr);
                            }
                        }
                    }
                } catch (Exception e2) {
                }
            }
        }
        return concurrentHashMap;
    }

    private void b(JSONObject jSONObject) {
        Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> p = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().p();
        if (p.size() > 0 && jSONObject == null) {
            jSONObject = new JSONObject();
        }
        for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> entry : p.entrySet()) {
            String key = entry.getKey();
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e value = entry.getValue();
            if (value != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject(String.valueOf(key));
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        jSONObject.put(String.valueOf(key), optJSONObject);
                        optJSONObject.put("ecpm_info", new JSONObject());
                    }
                    optJSONObject.putOpt("label_info", a(value));
                    optJSONObject.putOpt("ecpm_ttl", Integer.valueOf(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().g()));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void c(int i) {
        if (i == 2) {
            this.d.clear();
            return;
        }
        this.c.clear();
        f0 f0Var = this.b;
        if (f0Var != null) {
            f0Var.a();
        }
    }

    public static String d() {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            Set<Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e>> entrySet = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().p().entrySet();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> entry : entrySet) {
                String key = entry.getKey();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e value = entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("label_name", value.b());
                    jSONObject2.putOpt("timestamp", value.e());
                    jSONObject2.putOpt("lower_bound", Double.valueOf(value.d()));
                    jSONObject2.putOpt("upper_bound", Double.valueOf(value.f()));
                    jSONObject.putOpt(a.a(Integer.parseInt(key)), jSONObject2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return jSONObject.toString();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0003, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(int r4) {
        /*
            r0 = 55
            r1 = 0
        L3:
            r2 = 72
        L5:
            r3 = 0
            switch(r2) {
                case 72: goto L36;
                case 73: goto L19;
                case 74: goto La;
                default: goto L9;
            }
        L9:
            goto L3
        La:
            r2 = 52
            if (r1 == r2) goto L3
            r2 = 53
            if (r1 == r2) goto L13
            goto L41
        L13:
            switch(r0) {
                case 29: goto L40;
                case 30: goto L3;
                case 31: goto La;
                default: goto L16;
            }
        L16:
            r0 = 30
            goto L13
        L19:
            r2 = 57
            if (r1 > r2) goto L41
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()
            java.util.Map r0 = r0.p()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e r4 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e) r4
            if (r4 == 0) goto L40
            java.lang.String r3 = r4.b()
            goto L40
        L36:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()
            boolean r1 = r1.b()
            if (r1 != 0) goto L41
        L40:
            return r3
        L41:
            r1 = 16
            r2 = 73
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.d(int):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0002, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e e() {
        /*
            java.lang.Class<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e> r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.class
        L2:
            r1 = 74
            r2 = 55
        L6:
            switch(r1) {
                case 72: goto L2;
                case 73: goto Lc;
                case 74: goto Lf;
                default: goto L9;
            }
        L9:
            r1 = 72
            goto L6
        Lc:
            switch(r2) {
                case 94: goto L17;
                case 95: goto L1c;
                case 96: goto L1c;
                default: goto Lf;
            }
        Lf:
            r1 = 56
            if (r2 == r1) goto L2
            r1 = 57
            if (r2 == r1) goto L1c
        L17:
            r1 = 73
            r2 = 96
            goto L6
        L1c:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e
            if (r1 != 0) goto L31
            monitor-enter(r0)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e r1 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L2c
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e r1 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e = r1     // Catch: java.lang.Throwable -> L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
        L31:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e r0 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.e():bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e");
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected Map<String, String> a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0000, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected org.json.JSONObject a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e r5) {
        /*
            r4 = this;
        L0:
            r0 = 95
            r1 = r0
        L3:
            switch(r0) {
                case 94: goto Le;
                case 95: goto L7;
                case 96: goto La;
                default: goto L6;
            }
        L6:
            goto L63
        L7:
            switch(r1) {
                case 94: goto L0;
                case 95: goto L63;
                case 96: goto L0;
                default: goto La;
            }
        La:
            switch(r1) {
                case 55: goto L63;
                case 56: goto L63;
                case 57: goto L63;
                default: goto Ld;
            }
        Ld:
            goto L13
        Le:
            r0 = 39
            if (r1 != r0) goto L13
            goto L0
        L13:
            if (r5 == 0) goto L61
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            r0.<init>()     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "label_name"
            java.lang.String r2 = r5.b()     // Catch: org.json.JSONException -> L5d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "label_id"
            int r2 = r5.a()     // Catch: org.json.JSONException -> L5d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L5d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "label_version"
            java.lang.String r2 = r5.c()     // Catch: org.json.JSONException -> L5d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "upper_bound"
            double r2 = r5.f()     // Catch: org.json.JSONException -> L5d
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: org.json.JSONException -> L5d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "lower_bound"
            double r2 = r5.d()     // Catch: org.json.JSONException -> L5d
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: org.json.JSONException -> L5d
            r0.putOpt(r1, r2)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "timestamp"
            java.lang.String r5 = r5.e()     // Catch: org.json.JSONException -> L5d
            r0.putOpt(r1, r5)     // Catch: org.json.JSONException -> L5d
            goto L62
        L5d:
            r5 = move-exception
            r5.printStackTrace()
        L61:
            r0 = 0
        L62:
            return r0
        L63:
            r0 = 94
            r1 = 125(0x7d, float:1.75E-43)
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e):org.json.JSONObject");
    }

    public void a(int i, double d) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            String valueOf = String.valueOf(i);
            double[] dArr = this.d.get(valueOf);
            if (dArr == null) {
                dArr = new double[2];
            }
            dArr[0] = dArr[0] + 1.0d;
            dArr[1] = dArr[1] + d;
            this.d.put(valueOf, dArr);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected void a(String str, int i, String str2) {
        if (i == 2) {
            this.c.put(str, str2);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    protected void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.startsWith("cpm_key_")) {
            return;
        }
        this.c.put(str, str2);
    }

    public void a(Map<String, Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>>> map) {
        char c;
        char c2;
        Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> value;
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            c = ']';
            c2 = '\b';
        } else if (map == null || map.size() <= 0) {
            return;
        } else {
            for (Map.Entry<String, Map<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>>> entry : map.entrySet()) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.c a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().a(entry.getKey(), 101);
                if (a != null && a.i() == 1 && (value = entry.getValue()) != null) {
                    for (Map.Entry<String, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e>> entry2 : value.entrySet()) {
                        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e> value2 = entry2.getValue();
                        if (value2 != null && value2.size() > 0 && value2.get(0) != null && value2.get(0).a != null) {
                            l0.a(value2);
                            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122.e eVar = value2.get(0);
                            a(eVar.a.getAdType(), eVar.a.getCpm());
                        }
                    }
                }
            }
            c = 'W';
            c2 = '\n';
        }
        if (c <= 5 || c2 != '\b') {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.b.a(bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()).a(2);
        }
    }

    public void a(JSONObject jSONObject) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e> entry : bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().p().entrySet()) {
                String key = entry.getKey();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e value = entry.getValue();
                if (value != null) {
                    try {
                        jSONObject2.putOpt(key, a(value));
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.length();
            }
            try {
                jSONObject.putOpt("last_label_outputs", jSONObject2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() && jSONObject2 != null) {
            try {
                jSONObject.putOpt("label_inputs", jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.d dVar, JSONObject jSONObject, Map<String, Object> map) {
        dVar.a("reason", Integer.valueOf(!z ? 1 : 0));
        if (map != null) {
            b(jSONObject);
            if (jSONObject != null) {
                map.put(TTDownloadField.TT_LABEL, jSONObject);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0000, code lost:
        continue;
     */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(java.lang.String r2, org.json.JSONObject r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r1 = this;
        L0:
            r4 = 95
            r0 = r4
        L3:
            switch(r4) {
                case 94: goto Lf;
                case 95: goto L7;
                case 96: goto La;
                default: goto L6;
            }
        L6:
            goto L4e
        L7:
            switch(r0) {
                case 94: goto L0;
                case 95: goto L4e;
                case 96: goto L0;
                default: goto La;
            }
        La:
            r4 = 56
            if (r0 == r4) goto L4e
            goto L14
        Lf:
            r4 = 39
            if (r0 != r4) goto L14
            goto L0
        L14:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()
            java.util.Map r4 = r4.p()
            java.lang.Object r4 = r4.get(r2)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e r4 = (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.e) r4
            if (r4 == 0) goto L4c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L48
            r0.<init>()     // Catch: org.json.JSONException -> L48
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L48
            java.lang.String r2 = "label_info"
            org.json.JSONObject r3 = r1.a(r4)     // Catch: org.json.JSONException -> L48
            r0.putOpt(r2, r3)     // Catch: org.json.JSONException -> L48
            java.lang.String r2 = "ecpm_ttl"
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f()     // Catch: org.json.JSONException -> L48
            int r3 = r3.g()     // Catch: org.json.JSONException -> L48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: org.json.JSONException -> L48
            r0.putOpt(r2, r3)     // Catch: org.json.JSONException -> L48
            r2 = 1
            goto L4d
        L48:
            r2 = move-exception
            r2.printStackTrace()
        L4c:
            r2 = 0
        L4d:
            return r2
        L4e:
            r4 = 94
            r0 = 125(0x7d, float:1.75E-43)
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12.e.a(java.lang.String, org.json.JSONObject, java.util.Map):boolean");
    }

    public Map<String, JSONObject> b(int i) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (Map.Entry<String, double[]> entry : (i == 2 ? this.d : b(this.c)).entrySet()) {
                String key = entry.getKey();
                double[] value = entry.getValue();
                try {
                    if (!TextUtils.isEmpty(key)) {
                        Map<String, JSONObject> a = a(key, value);
                        JSONObject jSONObject3 = a.get("config_req_label_value");
                        JSONObject jSONObject4 = a.get("event_label_value");
                        if (jSONObject4 != null) {
                            jSONObject.putOpt(key, jSONObject4);
                        }
                        if (jSONObject3 != null) {
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            jSONObject2.putOpt(key, jSONObject3);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            hashMap.put("event_label_value_root", jSONObject);
            if (jSONObject2 != null) {
                hashMap.put("config_req_label_value_root", jSONObject2);
            }
            c(i);
            return hashMap;
        }
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i, double d) {
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b()) {
            a(2, String.valueOf(i), 1, d);
        }
    }
}
