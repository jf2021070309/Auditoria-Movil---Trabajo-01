package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.a.b;
import com.iab.omid.library.applovin.walking.a.d;
import com.iab.omid.library.applovin.walking.a.e;
import com.iab.omid.library.applovin.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b implements b.InterfaceC0100b {
    private JSONObject a;

    /* renamed from: b  reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.a.c f4840b;

    public b(com.iab.omid.library.applovin.walking.a.c cVar) {
        this.f4840b = cVar;
    }

    public void a() {
        this.f4840b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.a.b.InterfaceC0100b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f4840b.b(new f(this, hashSet, jSONObject, j2));
    }

    @Override // com.iab.omid.library.applovin.walking.a.b.InterfaceC0100b
    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f4840b.b(new e(this, hashSet, jSONObject, j2));
    }
}
