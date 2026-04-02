package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.a;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class u {
    static final String a = u.class.getSimpleName();
    com.ironsource.sdk.service.e b;
    Context d;
    private final String e = "oneToken";
    com.ironsource.sdk.service.c c = new com.ironsource.sdk.service.c();
    private com.ironsource.environment.e.b f = new com.ironsource.environment.e.b();

    /* loaded from: classes2.dex */
    static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public u(Context context, com.ironsource.sdk.service.e eVar) {
        this.b = eVar;
        this.d = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a() {
        JSONObject a2 = this.f.a();
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a2.get(next);
            if (obj instanceof String) {
                a2.put(next, a.AnonymousClass1.a((String) obj));
            }
        }
        return a2;
    }
}
