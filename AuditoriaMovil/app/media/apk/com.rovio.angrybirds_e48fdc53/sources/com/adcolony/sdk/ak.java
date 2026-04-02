package com.adcolony.sdk;

import com.adcolony.sdk.aj;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ak implements aj.a {
    public void a() {
        a.a("WebServices.download", new f() { // from class: com.adcolony.sdk.ak.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                new aj(dVar, ak.this);
            }
        });
        a.a("WebServices.get", new f() { // from class: com.adcolony.sdk.ak.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                new aj(dVar, ak.this);
            }
        });
        a.a("WebServices.post", new f() { // from class: com.adcolony.sdk.ak.3
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                new aj(dVar, ak.this);
            }
        });
    }

    @Override // com.adcolony.sdk.aj.a
    public void a(aj ajVar, d dVar, Map<String, List<String>> map) {
        JSONObject a = as.a();
        as.a(a, "url", ajVar.b);
        as.a(a, "success", ajVar.d);
        as.b(a, "status", ajVar.f);
        as.a(a, "body", ajVar.c);
        as.b(a, "size", ajVar.e);
        if (map != null) {
            JSONObject a2 = as.a();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String obj = entry.getValue().toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (entry.getKey() != null) {
                    as.a(a2, entry.getKey(), substring);
                }
            }
            as.a(a, "headers", a2);
        }
        dVar.a(a).a();
        ajVar.a.shutdown();
    }
}
