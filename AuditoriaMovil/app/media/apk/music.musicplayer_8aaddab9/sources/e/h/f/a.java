package e.h.f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.i.g.h;
import com.android.music.MediaPlaybackService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: e.h.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0175a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: e.h.f.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0176a implements a {
            public IBinder a;

            public C0176a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // e.h.f.a
            public void A(long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeLong(j2);
                    if (!this.a.transact(27, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long B(long j2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeLong(j2);
                    if (!this.a.transact(12, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void E0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(8, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void F(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeInt(i2);
                    if (!this.a.transact(26, obtain, obtain2, 0)) {
                        int i3 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public boolean I() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(35, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int I0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int J() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(34, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void J0(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeInt(i2);
                    if (!this.a.transact(21, obtain, obtain2, 0)) {
                        int i3 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void K0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(28, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void L0(long[] jArr, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeLongArray(jArr);
                    obtain.writeInt(i2);
                    if (!this.a.transact(18, obtain, obtain2, 0)) {
                        int i3 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long M() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(15, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long N0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(23, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int Q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(31, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int R() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(33, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long W() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(11, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long a0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(10, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // e.h.f.a
            public String b0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(13, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public String d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(14, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public String e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(16, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int getAudioSessionId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(32, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public String getPath() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(22, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(25, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(7, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public boolean isPlaying() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(4, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long[] j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(19, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.createLongArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void j0(long[] jArr, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeLongArray(jArr);
                    obtain.writeInt(i2);
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i3 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void k(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeInt(i2);
                    if (!this.a.transact(29, obtain, obtain2, 0)) {
                        int i3 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void k0(int i2, int i3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (!this.a.transact(20, obtain, obtain2, 0)) {
                        int i4 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public int m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(30, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void n(int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeInt(i2);
                    if (!this.a.transact(24, obtain, obtain2, 0)) {
                        int i3 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(9, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public long p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(17, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(6, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    if (!this.a.transact(5, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void v0(int i2, int i3, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.a.transact(36, obtain, obtain2, 0)) {
                        int i4 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.h.f.a
            public void z0(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.jrtstudio.music.IMediaPlaybackService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i2 = AbstractBinderC0175a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0175a() {
            attachInterface(this, "com.jrtstudio.music.IMediaPlaybackService");
        }

        public static a R0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.jrtstudio.music.IMediaPlaybackService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0176a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString("com.jrtstudio.music.IMediaPlaybackService");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).z0(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).j0(parcel.createLongArray(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int I0 = ((MediaPlaybackService.a) this).I0();
                    parcel2.writeNoException();
                    parcel2.writeInt(I0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    boolean isPlaying = ((MediaPlaybackService.a) this).isPlaying();
                    parcel2.writeNoException();
                    parcel2.writeInt(isPlaying ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).stop();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).pause();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).i();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).E0();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).next();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    long a0 = ((MediaPlaybackService.a) this).a0();
                    parcel2.writeNoException();
                    parcel2.writeLong(a0);
                    return true;
                case 11:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    long W = ((MediaPlaybackService.a) this).W();
                    parcel2.writeNoException();
                    parcel2.writeLong(W);
                    return true;
                case 12:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).B(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeLong(-1L);
                    return true;
                case 13:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    String b0 = ((MediaPlaybackService.a) this).b0();
                    parcel2.writeNoException();
                    parcel2.writeString(b0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    String d2 = ((MediaPlaybackService.a) this).d();
                    parcel2.writeNoException();
                    parcel2.writeString(d2);
                    return true;
                case 15:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    long M = ((MediaPlaybackService.a) this).M();
                    parcel2.writeNoException();
                    parcel2.writeLong(M);
                    return true;
                case 16:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    String e2 = ((MediaPlaybackService.a) this).e();
                    parcel2.writeNoException();
                    parcel2.writeString(e2);
                    return true;
                case 17:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    long p = ((MediaPlaybackService.a) this).p();
                    parcel2.writeNoException();
                    parcel2.writeLong(p);
                    return true;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).L0(parcel.createLongArray(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    long[] j2 = ((MediaPlaybackService.a) this).j();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(j2);
                    return true;
                case 20:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).k0(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).J0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    String path = ((MediaPlaybackService.a) this).getPath();
                    parcel2.writeNoException();
                    parcel2.writeString(path);
                    return true;
                case ConnectionResult.API_DISABLED /* 23 */:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    long N0 = ((MediaPlaybackService.a) this).N0();
                    parcel2.writeNoException();
                    parcel2.writeLong(N0);
                    return true;
                case 24:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).n(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int q = h.q();
                    parcel2.writeNoException();
                    parcel2.writeInt(q);
                    return true;
                case 26:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).F(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).A(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).K0();
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).k(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int o = h.o();
                    parcel2.writeNoException();
                    parcel2.writeInt(o);
                    return true;
                case 31:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int Q = ((MediaPlaybackService.a) this).Q();
                    parcel2.writeNoException();
                    parcel2.writeInt(Q);
                    return true;
                case 32:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int audioSessionId = ((MediaPlaybackService.a) this).getAudioSessionId();
                    parcel2.writeNoException();
                    parcel2.writeInt(audioSessionId);
                    return true;
                case 33:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int R = ((MediaPlaybackService.a) this).R();
                    parcel2.writeNoException();
                    parcel2.writeInt(R);
                    return true;
                case 34:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    int J = ((MediaPlaybackService.a) this).J();
                    parcel2.writeNoException();
                    parcel2.writeInt(J);
                    return true;
                case 35:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    boolean I = ((MediaPlaybackService.a) this).I();
                    parcel2.writeNoException();
                    parcel2.writeInt(I ? 1 : 0);
                    return true;
                case 36:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).v0(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).U0(parcel.readFloat(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    h.C("ap", parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).T0(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.jrtstudio.music.IMediaPlaybackService");
                    ((MediaPlaybackService.a) this).S0();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void A(long j2) throws RemoteException;

    long B(long j2) throws RemoteException;

    void E0() throws RemoteException;

    void F(int i2) throws RemoteException;

    boolean I() throws RemoteException;

    int I0() throws RemoteException;

    int J() throws RemoteException;

    void J0(int i2) throws RemoteException;

    void K0() throws RemoteException;

    void L0(long[] jArr, int i2) throws RemoteException;

    long M() throws RemoteException;

    long N0() throws RemoteException;

    int Q() throws RemoteException;

    int R() throws RemoteException;

    long W() throws RemoteException;

    long a0() throws RemoteException;

    String b0() throws RemoteException;

    String d() throws RemoteException;

    String e() throws RemoteException;

    int getAudioSessionId() throws RemoteException;

    String getPath() throws RemoteException;

    int h() throws RemoteException;

    void i() throws RemoteException;

    boolean isPlaying() throws RemoteException;

    long[] j() throws RemoteException;

    void j0(long[] jArr, int i2) throws RemoteException;

    void k(int i2) throws RemoteException;

    void k0(int i2, int i3) throws RemoteException;

    int m() throws RemoteException;

    void n(int i2) throws RemoteException;

    void next() throws RemoteException;

    long p() throws RemoteException;

    void pause() throws RemoteException;

    void stop() throws RemoteException;

    void v0(int i2, int i3, boolean z) throws RemoteException;

    void z0(String str, String str2) throws RemoteException;
}
