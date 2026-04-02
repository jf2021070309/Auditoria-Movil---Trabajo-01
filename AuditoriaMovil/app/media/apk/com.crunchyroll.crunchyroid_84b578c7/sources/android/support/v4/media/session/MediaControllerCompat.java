package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class MediaControllerCompat {
    public final MediaControllerImplApi21 a;
    public final MediaSessionCompat.Token b;
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<a, Boolean> c = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 {
        public final MediaController a;
        public final Object b = new Object();
        public final ArrayList c = new ArrayList();
        public final HashMap<a, a> d = new HashMap<>();
        public final MediaSessionCompat.Token e;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public final WeakReference<MediaControllerImplApi21> b;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.b = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.b.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.b) {
                        MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                        android.support.v4.media.session.b o0 = b.a.o0(com.amazon.aps.iva.k3.d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        synchronized (token.b) {
                            token.d = o0;
                        }
                        MediaSessionCompat.Token token2 = mediaControllerImplApi21.e;
                        com.amazon.aps.iva.c9.d a = com.amazon.aps.iva.c9.a.a(bundle);
                        synchronized (token2.b) {
                            token2.e = a;
                        }
                        mediaControllerImplApi21.a();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends a.c {
            @Override // android.support.v4.media.session.a
            public final void B() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void D(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void O(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void U(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void V(ArrayList arrayList) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void e0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.c);
            this.a = mediaController;
            if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public final void a() {
            MediaSessionCompat.Token token = this.e;
            if (token.a() == null) {
                return;
            }
            ArrayList arrayList = this.c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                a aVar2 = new a(aVar);
                this.d.put(aVar, aVar2);
                aVar.mIControllerCallback = aVar2;
                try {
                    token.a().P(aVar2);
                    aVar.postToHandler(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            arrayList.clear();
        }

        public final void b(a aVar) {
            this.a.unregisterCallback(aVar.mCallbackFwk);
            synchronized (this.b) {
                if (this.e.a() != null) {
                    try {
                        a remove = this.d.remove(aVar);
                        if (remove != null) {
                            aVar.mIControllerCallback = null;
                            this.e.a().Y(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.c.remove(aVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends MediaControllerImplApi21 {
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* loaded from: classes.dex */
    public static abstract class d {
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public final MediaController.TransportControls a;

        public e(MediaController.TransportControls transportControls) {
            this.a = transportControls;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
    }

    /* loaded from: classes.dex */
    public static class g extends f {
    }

    /* loaded from: classes.dex */
    public static class h extends g {
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token token = mediaSessionCompat.a.b;
            this.b = token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new b(context, token);
                return;
            } else {
                this.a = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = this.a.a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.a(metadata);
        }
        return null;
    }

    public final PlaybackStateCompat b() {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.a;
        MediaSessionCompat.Token token = mediaControllerImplApi21.e;
        if (token.a() != null) {
            try {
                return token.a().h();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = mediaControllerImplApi21.a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public final g c() {
        MediaController.TransportControls transportControls = this.a.a.getTransportControls();
        if (Build.VERSION.SDK_INT >= 29) {
            return new h(transportControls);
        }
        return new g(transportControls);
    }

    public final void d(a aVar) {
        if (aVar != null) {
            if (this.c.putIfAbsent(aVar, Boolean.TRUE) == null) {
                Handler handler = new Handler();
                aVar.setHandler(handler);
                MediaControllerImplApi21 mediaControllerImplApi21 = this.a;
                mediaControllerImplApi21.a.registerCallback(aVar.mCallbackFwk, handler);
                synchronized (mediaControllerImplApi21.b) {
                    if (mediaControllerImplApi21.e.a() != null) {
                        MediaControllerImplApi21.a aVar2 = new MediaControllerImplApi21.a(aVar);
                        mediaControllerImplApi21.d.put(aVar, aVar2);
                        aVar.mIControllerCallback = aVar2;
                        try {
                            mediaControllerImplApi21.e.a().P(aVar2);
                            aVar.postToHandler(13, null, null);
                        } catch (RemoteException unused) {
                        }
                    } else {
                        aVar.mIControllerCallback = null;
                        mediaControllerImplApi21.c.add(aVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public final void e(a aVar) {
        if (aVar != null) {
            if (this.c.remove(aVar) == null) {
                return;
            }
            try {
                this.a.b(aVar);
                return;
            } finally {
                aVar.setHandler(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.b = token;
            this.a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {
        final MediaController.Callback mCallbackFwk = new C0000a(this);
        b mHandler;
        android.support.v4.media.session.a mIControllerCallback;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0000a extends MediaController.Callback {
            public final WeakReference<a> a;

            public C0000a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.a.get();
                if (aVar != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                    aVar.onAudioInfoChanged(new c());
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.onExtrasChanged(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.onMetadataChanged(MediaMetadataCompat.a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.a.get();
                if (aVar != null && aVar.mIControllerCallback == null) {
                    aVar.onPlaybackStateChanged(PlaybackStateCompat.a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                a aVar = this.a.get();
                if (aVar != null) {
                    ArrayList arrayList = null;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (MediaSession.QueueItem queueItem2 : list) {
                            if (queueItem2 != null) {
                                MediaSession.QueueItem queueItem3 = queueItem2;
                                queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.b.b(queueItem3)), MediaSessionCompat.QueueItem.b.c(queueItem3));
                            } else {
                                queueItem = null;
                            }
                            arrayList2.add(queueItem);
                        }
                        arrayList = arrayList2;
                    }
                    aVar.onQueueChanged(arrayList);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.onSessionDestroyed();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    android.support.v4.media.session.a aVar2 = aVar.mIControllerCallback;
                    aVar.onSessionEvent(str, bundle);
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends Handler {
            public boolean a;

            public b(Looper looper) {
                super(looper);
                this.a = false;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (!this.a) {
                    return;
                }
                int i = message.what;
                a aVar = a.this;
                switch (i) {
                    case 1:
                        Bundle data = message.getData();
                        MediaSessionCompat.a(data);
                        aVar.onSessionEvent((String) message.obj, data);
                        return;
                    case 2:
                        aVar.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        aVar.onMetadataChanged((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        aVar.onAudioInfoChanged((c) message.obj);
                        return;
                    case 5:
                        aVar.onQueueChanged((List) message.obj);
                        return;
                    case 6:
                        aVar.onQueueTitleChanged((CharSequence) message.obj);
                        return;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        MediaSessionCompat.a(bundle);
                        aVar.onExtrasChanged(bundle);
                        return;
                    case 8:
                        aVar.onSessionDestroyed();
                        return;
                    case 9:
                        aVar.onRepeatModeChanged(((Integer) message.obj).intValue());
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        aVar.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        aVar.onShuffleModeChanged(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        aVar.onSessionReady();
                        return;
                }
            }
        }

        /* loaded from: classes.dex */
        public static class c extends a.AbstractBinderC0002a {
            public final WeakReference<a> b;

            public c(a aVar) {
                this.b = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public final void H(int i) throws RemoteException {
                a aVar = this.b.get();
                if (aVar != null) {
                    aVar.postToHandler(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void n0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.b.get();
                if (aVar != null) {
                    aVar.postToHandler(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void w(int i) throws RemoteException {
                a aVar = this.b.get();
                if (aVar != null) {
                    aVar.postToHandler(9, Integer.valueOf(i), null);
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            postToHandler(8, null, null);
        }

        public android.support.v4.media.session.a getIControllerCallback() {
            return this.mIControllerCallback;
        }

        public void postToHandler(int i, Object obj, Bundle bundle) {
            b bVar = this.mHandler;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void setHandler(Handler handler) {
            if (handler == null) {
                b bVar = this.mHandler;
                if (bVar != null) {
                    bVar.a = false;
                    bVar.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.mHandler = bVar2;
            bVar2.a = true;
        }

        public void onSessionDestroyed() {
        }

        public void onSessionReady() {
        }

        public void onAudioInfoChanged(c cVar) {
        }

        public void onCaptioningEnabledChanged(boolean z) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i) {
        }

        public void onShuffleModeChanged(int i) {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }
    }
}
