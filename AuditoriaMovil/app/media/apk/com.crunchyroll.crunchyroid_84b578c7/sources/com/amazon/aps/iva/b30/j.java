package com.amazon.aps.iva.b30;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.amazon.aps.iva.cg.x;
import com.amazon.aps.iva.se0.u;
import com.amazon.aps.iva.xe0.s;
import com.amazon.aps.iva.xw.d0;
import com.amazon.aps.iva.xw.e0;
import okhttp3.Call;
/* compiled from: SubscriptionProductSynchronizer.kt */
/* loaded from: classes2.dex */
public final class j implements x, com.amazon.aps.iva.ur.d, com.amazon.aps.iva.qs.a {
    public static l b;
    public static final j c = new j();
    public static final s d = new s("REMOVED_TASK");
    public static final s e = new s("CLOSED_EMPTY");

    public /* synthetic */ j(Object obj) {
    }

    public static String e(String str) {
        boolean z;
        if (com.amazon.aps.iva.oe0.m.b0("app_widget")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = str + "?launch_source=app_widget";
            com.amazon.aps.iva.yb0.j.e(str2, "{\n            StringBuil…ce\").toString()\n        }");
            return str2;
        }
        return str;
    }

    public static final u f(Call call) {
        com.amazon.aps.iva.yb0.j.f(call, "<this>");
        u e2 = com.amazon.aps.iva.a60.b.e();
        e2.s0(new d0(e2, call));
        call.enqueue(new e0(e2));
        return e2;
    }

    @Override // com.amazon.aps.iva.cg.x
    public void a(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(e("crunchyroll://signin")));
        intent.addFlags(268468224);
        context.startActivity(intent);
    }

    @Override // com.amazon.aps.iva.cg.x
    public void b(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(e("crunchyroll://watch/".concat(str))));
        intent.addFlags(268468224);
        context.startActivity(intent);
    }

    @Override // com.amazon.aps.iva.cg.x
    public void c(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(e("crunchyroll://browse/popular")));
        intent.addFlags(268468224);
        context.startActivity(intent);
    }

    @Override // com.amazon.aps.iva.qs.a
    public void d(String str) {
    }
}
