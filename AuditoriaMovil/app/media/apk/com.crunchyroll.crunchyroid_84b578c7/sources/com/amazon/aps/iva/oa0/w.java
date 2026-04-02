package com.amazon.aps.iva.oa0;

import android.content.SharedPreferences;
import com.amazon.aps.iva.oa0.s;
import com.google.gson.Gson;
/* compiled from: ConfigManagerRepoStorage.java */
/* loaded from: classes4.dex */
public final class w implements Runnable {
    public final /* synthetic */ h0 b;
    public final /* synthetic */ s.a c = null;
    public final /* synthetic */ v d;

    public w(v vVar, h0 h0Var) {
        this.d = vVar;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.b;
        s.a aVar = this.c;
        try {
            SharedPreferences.Editor edit = this.d.a.getSharedPreferences("singular-pref-config-manager", 0).edit();
            h0Var.getClass();
            edit.putString("config_manager_config", new com.amazon.aps.iva.if0.c(new Gson().toJson(h0Var)).toString());
            edit.commit();
            if (aVar != null) {
                aVar.a(h0Var);
            }
        } catch (Throwable th) {
            int i = v.b;
            f1.b(th);
            if (aVar != null) {
                aVar.onError();
            }
        }
    }
}
