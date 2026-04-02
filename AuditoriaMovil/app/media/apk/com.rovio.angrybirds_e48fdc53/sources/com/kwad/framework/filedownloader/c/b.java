package com.kwad.framework.filedownloader.c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.kwad.framework.filedownloader.c.a;
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.kwad.framework.filedownloader.c.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0232a implements b {
            public static b adS;
            private IBinder mRemote;

            C0232a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void a(com.kwad.framework.filedownloader.c.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.mRemote.transact(1, obtain, null, 1) || a.va() == null) {
                        return;
                    }
                    a.va().a(aVar);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean aY(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.va().aY(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final byte aZ(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readByte();
                    }
                    return a.va().aZ(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void b(com.kwad.framework.filedownloader.c.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, null, 1) || a.va() == null) {
                        return;
                    }
                    a.va().b(aVar);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void b(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, com.kwad.framework.filedownloader.d.b bVar, boolean z3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    int i4 = 1;
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(z2 ? 1 : 0);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z3) {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                    } else {
                        a.va().b(str, str2, z, i, i2, i3, z2, bVar, z3);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean ba(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.va().ba(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean bs(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.va().bs(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final long bt(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readLong();
                    }
                    return a.va().bt(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final long bu(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readLong();
                    }
                    return a.va().bu(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean isIdle() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.va().isIdle();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final boolean n(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.va().n(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void pauseAllTasks() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                    } else {
                        a.va().pauseAllTasks();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void startForeground(int i, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(12, obtain, null, 1) || a.va() == null) {
                        return;
                    }
                    a.va().startForeground(i, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void stopForeground(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(13, obtain, null, 1) || a.va() == null) {
                        return;
                    }
                    a.va().stopForeground(z);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.kwad.framework.filedownloader.c.b
            public final void uZ() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    if (this.mRemote.transact(15, obtain, obtain2, 0) || a.va() == null) {
                        obtain2.readException();
                    } else {
                        a.va().uZ();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0232a(iBinder) : (b) queryLocalInterface;
        }

        public static b va() {
            return C0232a.adS;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    a(a.AbstractBinderC0230a.c(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    b(a.AbstractBinderC0230a.c(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    boolean n = n(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(n ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    b(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? com.kwad.framework.filedownloader.d.b.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    boolean aY = aY(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(aY ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    pauseAllTasks();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    boolean bs = bs(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(bs ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    long bt = bt(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(bt);
                    return true;
                case 9:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    long bu = bu(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(bu);
                    return true;
                case 10:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    byte aZ = aZ(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeByte(aZ);
                    return true;
                case 11:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    boolean isIdle = isIdle();
                    parcel2.writeNoException();
                    parcel2.writeInt(isIdle ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    startForeground(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    stopForeground(parcel.readInt() != 0);
                    return true;
                case 14:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    boolean ba = ba(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(ba ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface("com.kwad.framework.filedownloader.i.IFileDownloadIPCService");
                    uZ();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void a(com.kwad.framework.filedownloader.c.a aVar);

    boolean aY(int i);

    byte aZ(int i);

    void b(com.kwad.framework.filedownloader.c.a aVar);

    void b(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, com.kwad.framework.filedownloader.d.b bVar, boolean z3);

    boolean ba(int i);

    boolean bs(int i);

    long bt(int i);

    long bu(int i);

    boolean isIdle();

    boolean n(String str, String str2);

    void pauseAllTasks();

    void startForeground(int i, Notification notification);

    void stopForeground(boolean z);

    void uZ();
}
