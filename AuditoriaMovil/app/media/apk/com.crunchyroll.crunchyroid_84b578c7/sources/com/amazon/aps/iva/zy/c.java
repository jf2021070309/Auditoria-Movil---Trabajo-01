package com.amazon.aps.iva.zy;

import android.content.SharedPreferences;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.ve0.g;
import com.google.gson.Gson;
/* compiled from: PreferencesGsonFlowCollectorImpl.kt */
/* loaded from: classes2.dex */
public final class c<T> implements a<T> {
    public final String b = "player_preferred_video_quality";
    public final SharedPreferences c;
    public final g<T> d;
    public final Gson e;
    public T f;

    /* JADX WARN: Incorrect type for immutable var: ssa=com.amazon.aps.iva.rl.a, code=java.lang.Object, for r3v0, types: [com.amazon.aps.iva.rl.a] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.Object r3, android.content.SharedPreferences r4, com.amazon.aps.iva.ve0.l0 r5, com.google.gson.Gson r6) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "player_preferred_video_quality"
            r2.b = r0
            r2.c = r4
            r2.d = r5
            r2.e = r6
            boolean r5 = r4.contains(r0)
            r1 = 0
            if (r5 == 0) goto L1e
            java.lang.String r4 = r4.getString(r0, r1)
            java.lang.Class<com.amazon.aps.iva.rl.a> r5 = com.amazon.aps.iva.rl.a.class
            java.lang.Object r1 = r6.fromJson(r4, r5)
        L1e:
            if (r1 != 0) goto L21
            goto L22
        L21:
            r3 = r1
        L22:
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zy.c.<init>(com.amazon.aps.iva.rl.a, android.content.SharedPreferences, com.amazon.aps.iva.ve0.l0, com.google.gson.Gson):void");
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(T t, d<? super q> dVar) {
        this.f = t;
        this.c.edit().putString(this.b, this.e.toJson(t)).apply();
        Object a = this.d.a(t, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.zy.a
    public final T getValue() {
        return this.f;
    }
}
