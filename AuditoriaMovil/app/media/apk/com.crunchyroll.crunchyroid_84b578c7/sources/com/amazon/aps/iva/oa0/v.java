package com.amazon.aps.iva.oa0;

import android.content.Context;
import com.amazon.aps.iva.oa0.s;
import java.util.concurrent.Executors;
/* compiled from: ConfigManagerRepoStorage.java */
/* loaded from: classes4.dex */
public final class v extends s {
    public static final /* synthetic */ int b = 0;
    public final Context a;

    /* compiled from: ConfigManagerRepoStorage.java */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public final /* synthetic */ s.a b;

        public a(s.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s.a aVar = this.b;
            try {
                String string = v.this.a.getSharedPreferences("singular-pref-config-manager", 0).getString("config_manager_config", null);
                if (string == null) {
                    if (aVar != null) {
                        aVar.onError();
                        return;
                    }
                    return;
                }
                h0 a = h0.a(new com.amazon.aps.iva.if0.c(string));
                if (aVar != null) {
                    aVar.a(a);
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

    static {
        new com.amazon.aps.iva.b30.j(v.class.getSimpleName());
    }

    public v(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.oa0.s
    public final void a(s.a aVar) {
        Executors.newSingleThreadExecutor().execute(new a(aVar));
    }

    @Override // com.amazon.aps.iva.oa0.s
    public final void b(h0 h0Var) {
        Executors.newSingleThreadExecutor().execute(new w(this, h0Var));
    }
}
