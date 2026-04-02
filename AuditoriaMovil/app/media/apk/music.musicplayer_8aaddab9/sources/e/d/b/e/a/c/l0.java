package e.d.b.e.a.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class l0 extends g0 implements m0 {
    public l0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // e.d.b.e.a.c.g0
    public final boolean s0(int i2, Parcel parcel) throws RemoteException {
        switch (i2) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) h0.a(parcel, Bundle.CREATOR);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onStartDownload(%d)", new Object[]{Integer.valueOf(readInt)});
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onCancelDownload(%d)", new Object[]{Integer.valueOf(readInt2)});
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onGetSession(%d)", new Object[]{Integer.valueOf(readInt3)});
                break;
            case 5:
                a(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) h0.a(parcel, creator);
                Bundle bundle5 = (Bundle) h0.a(parcel, creator);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onNotifyChunkTransferred(%s, %s, %d, session=%d)", new Object[]{bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id"))});
                break;
            case 7:
                b((Bundle) h0.a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) h0.a(parcel, creator2);
                Bundle bundle7 = (Bundle) h0.a(parcel, creator2);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onNotifyModuleCompleted(%s, sessionId=%d)", new Object[]{bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt("session_id"))});
                break;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) h0.a(parcel, creator3);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onNotifySessionFailed(%d)", new Object[]{Integer.valueOf(((Bundle) h0.a(parcel, creator3)).getInt("session_id"))});
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                c((Bundle) h0.a(parcel, creator4), (Bundle) h0.a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                f0((Bundle) h0.a(parcel, creator5), (Bundle) h0.a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) h0.a(parcel, creator6);
                Bundle bundle10 = (Bundle) h0.a(parcel, creator6);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) h0.a(parcel, creator7);
                Bundle bundle12 = (Bundle) h0.a(parcel, creator7);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) h0.a(parcel, Bundle.CREATOR);
                ((e.d.b.e.a.a.j) this).f6821b.f6876e.a();
                e.d.b.e.a.a.o.a.a(4, "onCancelDownloads()", new Object[0]);
                break;
        }
        return true;
    }
}
