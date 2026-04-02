package com.iab.omid.library.applovin.walking.a;

import com.iab.omid.library.applovin.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class a extends b {
    public final HashSet<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f4833b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4834c;

    public a(b.InterfaceC0100b interfaceC0100b, HashSet<String> hashSet, JSONObject jSONObject, long j2) {
        super(interfaceC0100b);
        this.a = new HashSet<>(hashSet);
        this.f4833b = jSONObject;
        this.f4834c = j2;
    }
}
