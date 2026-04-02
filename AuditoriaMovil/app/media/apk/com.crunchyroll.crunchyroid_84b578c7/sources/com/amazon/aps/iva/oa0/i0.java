package com.amazon.aps.iva.oa0;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.oa0.c0;
/* compiled from: SLSingularDeviceIdentifier.java */
/* loaded from: classes4.dex */
public final class i0 {
    public static final /* synthetic */ int b = 0;
    public String a;

    /* compiled from: SLSingularDeviceIdentifier.java */
    /* loaded from: classes4.dex */
    public class a implements c0.a {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.oa0.c0.a
        public final void a(int i, String str) {
            Context context = this.a;
            i0 i0Var = i0.this;
            if (i == 200 && !f1.i(str)) {
                try {
                    com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(str);
                    if (cVar.has("sdid")) {
                        String string = cVar.getString("sdid");
                        if (!f1.i(string)) {
                            int i2 = i0.b;
                            i0Var.getClass();
                            SharedPreferences.Editor edit = context.getSharedPreferences("singular-pref-session", 0).edit();
                            edit.putString("pref-singular-device-id", string);
                            edit.commit();
                            i0Var.a = context.getSharedPreferences("singular-pref-session", 0).getString("pref-singular-device-id", null);
                        }
                    } else {
                        int i3 = i0.b;
                    }
                } catch (com.amazon.aps.iva.if0.b e) {
                    int i4 = i0.b;
                    f1.b(e);
                }
            }
        }

        @Override // com.amazon.aps.iva.oa0.c0.a
        public final void onFailure(String str) {
            int i = i0.b;
        }
    }

    static {
        new com.amazon.aps.iva.b30.j(i0.class.getSimpleName());
    }

    public final void a(y yVar, Context context) {
        if (!f1.i(this.a)) {
            return;
        }
        b0 b0Var = new b0();
        b1 b1Var = new b1();
        b1Var.g(yVar);
        b0Var.b("/resolve", b1Var, null, new a(context));
    }
}
