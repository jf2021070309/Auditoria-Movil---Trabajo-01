package e.d.b.e.a.c;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class j0 extends g0 implements k0 {
    public static k0 R0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof k0 ? (k0) queryLocalInterface : new i0(iBinder);
    }
}
