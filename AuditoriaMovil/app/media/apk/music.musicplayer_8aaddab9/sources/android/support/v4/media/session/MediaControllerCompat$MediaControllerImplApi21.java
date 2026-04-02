package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import b.a.b.a.a.b;
import b.a.b.a.a.c;
import c.b0.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21 {
    public final MediaController a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f17c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public HashMap<c, a> f18d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final MediaSessionCompat.Token f19e;

    /* loaded from: classes.dex */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> a;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.a = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f16b) {
                MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f19e;
                b s0 = b.a.s0(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
                synchronized (token.a) {
                    token.f25c = s0;
                }
                MediaSessionCompat.Token token2 = mediaControllerCompat$MediaControllerImplApi21.f19e;
                d dVar = null;
                try {
                    Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                    if (bundle2 != null) {
                        bundle2.setClassLoader(c.b0.a.class.getClassLoader());
                        Parcelable parcelable = bundle2.getParcelable("a");
                        if (!(parcelable instanceof ParcelImpl)) {
                            throw new IllegalArgumentException("Invalid parcel");
                        }
                        dVar = ((ParcelImpl) parcelable).a;
                    }
                } catch (RuntimeException unused) {
                }
                synchronized (token2.a) {
                    token2.f26d = dVar;
                }
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a extends c.b {
        public a(c cVar) {
            super(cVar);
        }

        @Override // b.a.b.a.a.c.b, b.a.b.a.a.a
        public void H(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // b.a.b.a.a.c.b, b.a.b.a.a.a
        public void K(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // b.a.b.a.a.c.b, b.a.b.a.a.a
        public void Q0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // b.a.b.a.a.c.b, b.a.b.a.a.a
        public void m0(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // b.a.b.a.a.c.b, b.a.b.a.a.a
        public void p0() throws RemoteException {
            throw new AssertionError();
        }

        @Override // b.a.b.a.a.c.b, b.a.b.a.a.a
        public void r0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f19e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f24b);
        this.a = mediaController;
        if (token.b() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    public void a() {
        if (this.f19e.b() == null) {
            return;
        }
        for (c cVar : this.f17c) {
            a aVar = new a(cVar);
            this.f18d.put(cVar, aVar);
            cVar.a = aVar;
            try {
                this.f19e.b().r(aVar);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        this.f17c.clear();
    }
}
