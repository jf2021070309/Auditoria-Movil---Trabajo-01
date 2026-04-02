package e.b.a.a.a0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
/* loaded from: classes.dex */
public class e extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ Context a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f5237b;

    public e(c cVar, Context context) {
        this.f5237b = cVar;
        this.a = context;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        this.f5237b.b(this.a);
    }
}
