package e.b.a.a.a0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class d extends BroadcastReceiver {
    public final /* synthetic */ c a;

    public d(c cVar) {
        this.a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.b(context);
    }
}
