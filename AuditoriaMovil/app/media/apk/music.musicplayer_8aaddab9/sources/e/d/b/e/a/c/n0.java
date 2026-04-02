package e.d.b.e.a.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.AssetPackExtractionService;
import java.util.Arrays;
/* loaded from: classes2.dex */
public abstract class n0 extends g0 implements IInterface {
    public n0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // e.d.b.e.a.c.g0
    public final boolean s0(int i2, Parcel parcel) throws RemoteException {
        String[] packagesForUid;
        Bundle bundle;
        p0 p0Var = null;
        if (i2 == 2) {
            Bundle bundle2 = (Bundle) h0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                p0Var = queryLocalInterface instanceof p0 ? (p0) queryLocalInterface : new o0(readStrongBinder);
            }
            e.d.b.e.a.a.x xVar = (e.d.b.e.a.a.x) this;
            xVar.a.a(3, "updateServiceState AIDL call", new Object[0]);
            if (q.a(xVar.f6970b) && (packagesForUid = xVar.f6970b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
                AssetPackExtractionService assetPackExtractionService = xVar.f6971c;
                synchronized (assetPackExtractionService) {
                    int i3 = bundle2.getInt("action_type");
                    e eVar = assetPackExtractionService.a;
                    Integer valueOf = Integer.valueOf(i3);
                    eVar.a(3, "updateServiceState: %d", new Object[]{valueOf});
                    if (i3 == 1) {
                        assetPackExtractionService.b(bundle2);
                    } else if (i3 == 2) {
                        assetPackExtractionService.a();
                    } else {
                        assetPackExtractionService.a.a(6, "Unknown action type received: %d", new Object[]{valueOf});
                    }
                    bundle = new Bundle();
                }
                p0Var.c(bundle, new Bundle());
            } else {
                p0Var.b(new Bundle());
                xVar.f6971c.a();
            }
        } else if (i2 != 3) {
            return false;
        } else {
            Bundle bundle3 = (Bundle) h0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                p0Var = queryLocalInterface2 instanceof p0 ? (p0) queryLocalInterface2 : new o0(readStrongBinder2);
            }
            e.d.b.e.a.a.z.j(((e.d.b.e.a.a.x) this).f6972d.r());
            p0Var.g0(new Bundle());
        }
        return true;
    }
}
