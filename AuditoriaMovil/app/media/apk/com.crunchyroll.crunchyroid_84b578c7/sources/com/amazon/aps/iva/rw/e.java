package com.amazon.aps.iva.rw;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.rw.b;
import com.amazon.aps.iva.sv.i;
import com.amazon.aps.iva.sv.o2;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SyncQualityStore.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.wg.a {
    public final Context b;
    public final com.amazon.aps.iva.xb0.a<String> c;
    public final com.amazon.aps.iva.xb0.a<o2> d;
    public SharedPreferences e;
    public final v<com.amazon.aps.iva.wg.b> f;

    public e(Context context, i.h hVar, i.C0716i c0716i) {
        j.f(hVar, "getUserId");
        j.f(c0716i, "getConfiguration");
        this.b = context;
        this.c = hVar;
        this.d = c0716i;
        this.e = context.getSharedPreferences("sync_quality_store", 0);
        this.f = new v<>(J());
    }

    @Override // com.amazon.aps.iva.wg.a
    public final void H2() {
        this.e = this.b.getSharedPreferences("sync_quality_store", 0);
        this.f.k(J());
    }

    @Override // com.amazon.aps.iva.wg.a
    public final com.amazon.aps.iva.wg.b J() {
        this.d.invoke().h();
        SharedPreferences sharedPreferences = this.e;
        String invoke = this.c.invoke();
        int i = sharedPreferences.getInt("sync_quality_value_" + ((Object) invoke), -1);
        b.C0686b c0686b = b.C0686b.g;
        if (i != c0686b.f) {
            b.c cVar = b.c.g;
            if (i != cVar.f) {
                return b.a.g;
            }
            return cVar;
        }
        return c0686b;
    }

    @Override // com.amazon.aps.iva.wg.a
    public final v<com.amazon.aps.iva.wg.b> T() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.wg.a
    public final void n0(com.amazon.aps.iva.wg.b bVar) {
        j.f(bVar, "qualityOption");
        this.d.invoke().h();
        SharedPreferences.Editor edit = this.e.edit();
        String invoke = this.c.invoke();
        edit.putInt("sync_quality_value_" + ((Object) invoke), bVar.getHeight()).apply();
        this.f.k(bVar);
    }
}
