package c.d.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.a.a.b;
/* loaded from: classes.dex */
public abstract class d implements ServiceConnection {

    /* loaded from: classes.dex */
    public class a extends b {
        public a(d dVar, b.a.a.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.a.a.b c0005a;
        int i2 = b.a.a;
        if (iBinder == null) {
            c0005a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            c0005a = (queryLocalInterface == null || !(queryLocalInterface instanceof b.a.a.b)) ? new b.a.C0005a(iBinder) : (b.a.a.b) queryLocalInterface;
        }
        onCustomTabsServiceConnected(componentName, new a(this, c0005a, componentName));
    }
}
