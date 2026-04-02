package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.a.b;
import com.iab.omid.library.vungle.walking.a.d;
import com.iab.omid.library.vungle.walking.a.e;
import com.iab.omid.library.vungle.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b implements b.InterfaceC0078b {
    private JSONObject a;
    private final com.iab.omid.library.vungle.walking.a.c b;

    public b(com.iab.omid.library.vungle.walking.a.c cVar) {
        this.b = cVar;
    }

    public void a() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.a.b.InterfaceC0078b
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    @Override // com.iab.omid.library.vungle.walking.a.b.InterfaceC0078b
    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}
