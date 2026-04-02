package com.me.game.pm_tools;

import android.app.Activity;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class p {
    private static volatile p b;
    private HashMap<String, o> a = new HashMap<>();

    private p() {
    }

    public static p a() {
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    b = new p();
                }
            }
        }
        return b;
    }

    public void b(Activity activity) {
        o oVar = this.a.get(activity.toString());
        if (oVar != null) {
            oVar.e(activity);
        }
    }

    public void c(Activity activity) {
        o oVar = this.a.get(activity.toString());
        if (oVar != null) {
            oVar.f(activity);
        }
    }

    public void d(Activity activity) {
        if (b.d.c() && !b.d.b() && !b.d.a()) {
            o oVar = this.a.get(activity.toString());
            if (oVar == null) {
                oVar = new o();
                this.a.put(activity.toString(), oVar);
            }
            oVar.g(activity);
            return;
        }
        c(activity);
        b(activity);
    }
}
