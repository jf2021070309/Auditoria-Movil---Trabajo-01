package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.List;
/* compiled from: IMediaSession.java */
/* loaded from: classes.dex */
public interface b extends IInterface {
    void A(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void C(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    int E() throws RemoteException;

    void F(int i) throws RemoteException;

    void G() throws RemoteException;

    void I(Bundle bundle, String str) throws RemoteException;

    void J(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void K(long j) throws RemoteException;

    void L(int i) throws RemoteException;

    String M() throws RemoteException;

    void P(android.support.v4.media.session.a aVar) throws RemoteException;

    void Q(RatingCompat ratingCompat) throws RemoteException;

    void R(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    boolean S() throws RemoteException;

    void T(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void W(int i, int i2) throws RemoteException;

    CharSequence X() throws RemoteException;

    void Y(android.support.v4.media.session.a aVar) throws RemoteException;

    void Z(int i, int i2) throws RemoteException;

    void a0() throws RemoteException;

    void b() throws RemoteException;

    void c(long j) throws RemoteException;

    void f0(boolean z) throws RemoteException;

    void g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    String getTag() throws RemoteException;

    PlaybackStateCompat h() throws RemoteException;

    List<MediaSessionCompat.QueueItem> h0() throws RemoteException;

    void i() throws RemoteException;

    void i0(Bundle bundle, String str) throws RemoteException;

    ParcelableVolumeInfo j0() throws RemoteException;

    void k(float f) throws RemoteException;

    void l(int i) throws RemoteException;

    long m() throws RemoteException;

    void m0(Bundle bundle, String str) throws RemoteException;

    int n() throws RemoteException;

    void next() throws RemoteException;

    void o() throws RemoteException;

    void p(Bundle bundle, String str) throws RemoteException;

    void pause() throws RemoteException;

    void previous() throws RemoteException;

    void q(Uri uri, Bundle bundle) throws RemoteException;

    void r() throws RemoteException;

    PendingIntent s() throws RemoteException;

    void stop() throws RemoteException;

    int t() throws RemoteException;

    void u(Bundle bundle, String str) throws RemoteException;

    Bundle v() throws RemoteException;

    void x(Uri uri, Bundle bundle) throws RemoteException;

    boolean y(KeyEvent keyEvent) throws RemoteException;

    /* compiled from: IMediaSession.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0004a implements b {
            public final IBinder a;

            public C0004a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public final int E() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(47, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final String M() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(6, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void P(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final CharSequence X() throws RemoteException {
                CharSequence charSequence;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(30, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2);
                    } else {
                        charSequence = null;
                    }
                    return charSequence;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void Y(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.a.transact(4, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.v4.media.session.b
            public final void b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(13, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void c(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    if (!this.a.transact(24, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat getMetadata() throws RemoteException {
                MediaMetadataCompat mediaMetadataCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(27, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        mediaMetadataCompat = null;
                    }
                    return mediaMetadataCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat h() throws RemoteException {
                PlaybackStateCompat playbackStateCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(28, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        playbackStateCompat = null;
                    }
                    return playbackStateCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final int n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(37, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(20, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(18, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(21, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent s() throws RemoteException {
                PendingIntent pendingIntent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(8, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                    } else {
                        pendingIntent = null;
                    }
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.a.transact(19, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public final boolean y(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = a.a;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b o0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0004a(iBinder);
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            Uri uri;
            Uri uri2;
            RatingCompat ratingCompat;
            if (i != 1598968902) {
                MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
                Bundle bundle2 = null;
                MediaDescriptionCompat mediaDescriptionCompat = null;
                MediaDescriptionCompat mediaDescriptionCompat2 = null;
                MediaDescriptionCompat mediaDescriptionCompat3 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                Bundle bundle6 = null;
                RatingCompat ratingCompat2 = null;
                Bundle bundle7 = null;
                Bundle bundle8 = null;
                Bundle bundle9 = null;
                android.support.v4.media.session.a aVar = null;
                android.support.v4.media.session.a aVar2 = null;
                KeyEvent keyEvent = null;
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        if (parcel.readInt() != 0) {
                            resultReceiverWrapper = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                        }
                        J(readString, bundle, resultReceiverWrapper);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                        }
                        boolean y = y(keyEvent);
                        parcel2.writeNoException();
                        parcel2.writeInt(y ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.media.session.a)) {
                                aVar2 = (android.support.v4.media.session.a) queryLocalInterface;
                            } else {
                                aVar2 = new a.AbstractBinderC0002a.C0003a(readStrongBinder);
                            }
                        }
                        P(aVar2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof android.support.v4.media.session.a)) {
                                aVar = (android.support.v4.media.session.a) queryLocalInterface2;
                            } else {
                                aVar = new a.AbstractBinderC0002a.C0003a(readStrongBinder2);
                            }
                        }
                        Y(aVar);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        boolean S = S();
                        parcel2.writeNoException();
                        parcel2.writeInt(S ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String M = M();
                        parcel2.writeNoException();
                        parcel2.writeString(M);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String tag = getTag();
                        parcel2.writeNoException();
                        parcel2.writeString(tag);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        PendingIntent s = s();
                        parcel2.writeNoException();
                        if (s != null) {
                            parcel2.writeInt(1);
                            s.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        long m = m();
                        parcel2.writeNoException();
                        parcel2.writeLong(m);
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        ParcelableVolumeInfo j0 = j0();
                        parcel2.writeNoException();
                        if (j0 != null) {
                            parcel2.writeInt(1);
                            j0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        parcel.readString();
                        W(readInt, readInt2);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        parcel.readString();
                        Z(readInt3, readInt4);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        b();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        u(bundle9, readString2);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        i0(bundle8, readString3);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        x(uri, bundle7);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        K(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        pause();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        stop();
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        next();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        previous();
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        a0();
                        parcel2.writeNoException();
                        return true;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        i();
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        c(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                        }
                        Q(ratingCompat2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        p(bundle6, readString4);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        MediaMetadataCompat metadata = getMetadata();
                        parcel2.writeNoException();
                        if (metadata != null) {
                            parcel2.writeInt(1);
                            parcel2.writeBundle(metadata.b);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        PlaybackStateCompat h = h();
                        parcel2.writeNoException();
                        if (h != null) {
                            parcel2.writeInt(1);
                            h.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        List<MediaSessionCompat.QueueItem> h0 = h0();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(h0);
                        return true;
                    case 30:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        CharSequence X = X();
                        parcel2.writeNoException();
                        if (X != null) {
                            parcel2.writeInt(1);
                            TextUtils.writeToParcel(X, parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        Bundle extras = getExtras();
                        parcel2.writeNoException();
                        if (extras != null) {
                            parcel2.writeInt(1);
                            extras.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 32:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int t = t();
                        parcel2.writeNoException();
                        parcel2.writeInt(t);
                        return true;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        g();
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        I(bundle5, readString5);
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        m0(bundle4, readString6);
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        q(uri2, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int n = n();
                        parcel2.writeNoException();
                        parcel2.writeInt(n);
                        return true;
                    case 38:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        o();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    case 39:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        l(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 40:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        parcel.readInt();
                        r();
                        parcel2.writeNoException();
                        return true;
                    case 41:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        T(mediaDescriptionCompat3);
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        C(mediaDescriptionCompat2, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        R(mediaDescriptionCompat);
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        F(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        G();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    case 46:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        f0(z);
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        int E = E();
                        parcel2.writeNoException();
                        parcel2.writeInt(E);
                        return true;
                    case 48:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        L(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        k(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        Bundle v = v();
                        parcel2.writeNoException();
                        if (v != null) {
                            parcel2.writeInt(1);
                            v.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 51:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        if (parcel.readInt() != 0) {
                            ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                        } else {
                            ratingCompat = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        A(ratingCompat, bundle2);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
