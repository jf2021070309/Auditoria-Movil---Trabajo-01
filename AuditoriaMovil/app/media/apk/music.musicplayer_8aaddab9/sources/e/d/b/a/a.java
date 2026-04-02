package e.d.b.a;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public class a implements IInterface {
    public final IBinder a;

    public a(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
