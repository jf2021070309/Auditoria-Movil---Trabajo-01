package com.iab.omid.library.vungle.walking.a;

import com.iab.omid.library.vungle.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class a extends b {
    protected final HashSet<String> a;
    protected final JSONObject b;
    protected final long c;

    public a(b.InterfaceC0078b interfaceC0078b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0078b);
        this.a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}
