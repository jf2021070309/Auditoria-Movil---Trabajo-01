package e.h.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import e.h.g.o1.c;
import e.h.g.s1;
import e.h.g.t1;
/* loaded from: classes2.dex */
public class n0 extends BroadcastReceiver {
    public final /* synthetic */ m0 a;

    public n0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Message obtainMessage;
        try {
            String action = intent.getAction();
            if (action.equals("android.intent.action.MEDIA_EJECT")) {
                t1.h("Media ejected!!!");
                Intent intent2 = new Intent();
                intent2.setData(intent.getData());
                intent2.putExtra("PrivateMethod", 54);
                this.a.k(intent2);
            } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                t1.h("Media mounted!!!!!");
                this.a.j0++;
                Intent intent3 = new Intent();
                intent3.putExtra("PrivateMethod", 43);
                m0 m0Var = this.a;
                c.b bVar = m0Var.f8347i;
                if (bVar != null && (obtainMessage = bVar.obtainMessage(0)) != null) {
                    obtainMessage.arg2 = 2;
                    obtainMessage.obj = intent3;
                    try {
                        bVar.sendMessageDelayed(obtainMessage, 1000);
                    } catch (RuntimeException unused) {
                        m0Var.f8346h.b();
                    }
                }
            }
        } catch (Exception e2) {
            s1.l(e2, true);
            c.i.g.b.m(e2);
        }
    }
}
