package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: IMediaControllerCallback.java */
/* loaded from: classes.dex */
public interface a extends IInterface {
    void B() throws RemoteException;

    void D(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void H(int i) throws RemoteException;

    void O(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void U(Bundle bundle) throws RemoteException;

    void V(ArrayList arrayList) throws RemoteException;

    void e0(CharSequence charSequence) throws RemoteException;

    void n0(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void w(int i) throws RemoteException;

    /* compiled from: IMediaControllerCallback.java */
    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0002a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IMediaControllerCallback.java */
        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0003a implements a {
            public final IBinder a;

            public C0003a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public final void B() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.a.transact(2, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void D(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(mediaMetadataCompat.b);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(4, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void H(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    if (!this.a.transact(12, obtain, null, 1)) {
                        int i2 = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void O(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(8, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void U(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(7, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void V(ArrayList arrayList) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(arrayList);
                    if (!this.a.transact(5, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.v4.media.session.a
            public final void e0(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(6, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void n0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(3, obtain, null, 1)) {
                        int i = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public final void w(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    if (!this.a.transact(9, obtain, null, 1)) {
                        int i2 = AbstractBinderC0002a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0002a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i != 1598968902) {
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        MediaControllerCompat.a aVar = ((MediaControllerCompat.a.c) this).b.get();
                        if (aVar != null) {
                            aVar.postToHandler(1, readString, bundle);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        B();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        ((MediaControllerCompat.a.c) this).n0(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        D(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        V(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        e0(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        U(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        O(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        ((MediaControllerCompat.a.c) this).w(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        MediaControllerCompat.a aVar2 = ((MediaControllerCompat.a.c) this).b.get();
                        if (aVar2 != null) {
                            aVar2.postToHandler(11, Boolean.valueOf(z), null);
                        }
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        ((MediaControllerCompat.a.c) this).H(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        MediaControllerCompat.a aVar3 = ((MediaControllerCompat.a.c) this).b.get();
                        if (aVar3 != null) {
                            aVar3.postToHandler(13, null, null);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
