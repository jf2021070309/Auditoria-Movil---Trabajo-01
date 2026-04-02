package com.amazon.aps.iva.c6;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.g6.b;
import com.amazon.aps.iva.m6.n;
import com.amazon.aps.iva.q.i1;
import com.amazon.aps.iva.q5.y0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.m;
import java.util.Random;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                j.a aVar = (j.a) obj2;
                aVar.getClass();
                int i2 = g0.a;
                aVar.b.i((Exception) obj);
                return;
            case 1:
                b.d dVar = (b.d) obj2;
                com.amazon.aps.iva.q5.v vVar = (com.amazon.aps.iva.q5.v) obj;
                com.amazon.aps.iva.g6.b bVar = com.amazon.aps.iva.g6.b.this;
                if (bVar.p != 0 && !dVar.d) {
                    Looper looper = bVar.t;
                    looper.getClass();
                    dVar.c = bVar.e(looper, dVar.b, vVar, false);
                    bVar.n.add(dVar);
                    return;
                }
                return;
            case 2:
                com.amazon.aps.iva.m6.n.a((com.amazon.aps.iva.m6.n) obj, ((n.a) obj2).c.m);
                return;
            case 3:
                m.a aVar2 = (m.a) obj2;
                aVar2.getClass();
                int i3 = g0.a;
                aVar2.b.B((y0) obj);
                return;
            case 4:
            default:
                com.amazon.aps.iva.xb0.l lVar = (com.amazon.aps.iva.xb0.l) obj2;
                com.amazon.aps.iva.yb0.j.f(lVar, "$action");
                lVar.invoke(obj);
                return;
            case 5:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = ProfileInstallerInitializer.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new i1(context, 5), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
