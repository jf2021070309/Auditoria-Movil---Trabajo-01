package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import com.amazon.aps.iva.n5.b;
import com.amazon.aps.iva.n5.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class MediaSessionCompat {
    public static int d;
    public final d a;
    public final MediaControllerCompat b;
    public final ArrayList<g> c = new ArrayList<>();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public final ResultReceiver b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object b = new Object();
        public final Object c;
        public android.support.v4.media.session.b d;
        public com.amazon.aps.iva.c9.d e;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, com.amazon.aps.iva.c9.d dVar) {
            this.c = obj;
            this.d = bVar;
            this.e = dVar;
        }

        public final android.support.v4.media.session.b a() {
            android.support.v4.media.session.b bVar;
            synchronized (this.b) {
                bVar = this.d;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.c;
            if (obj2 == null) {
                if (token.c == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.c, i);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        HandlerC0001a mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        final Object mLock = new Object();
        final MediaSession.Callback mCallbackFwk = new b();
        WeakReference<b> mSessionImpl = new WeakReference<>(null);

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0001a extends Handler {
            public HandlerC0001a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                b bVar;
                a aVar;
                HandlerC0001a handlerC0001a;
                if (message.what == 1) {
                    synchronized (a.this.mLock) {
                        bVar = a.this.mSessionImpl.get();
                        aVar = a.this;
                        handlerC0001a = aVar.mCallbackHandler;
                    }
                    if (bVar != null && aVar == bVar.b() && handlerC0001a != null) {
                        bVar.a((b.C0529b) message.obj);
                        a.this.handleMediaPlayPauseIfPendingOnHandler(bVar, handlerC0001a);
                        bVar.a(null);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends MediaSession.Callback {
            public b() {
            }

            public static void b(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String e = cVar.e();
                if (TextUtils.isEmpty(e)) {
                    e = "android.media.session.MediaController";
                }
                cVar.a(new b.C0529b(e, -1, -1));
            }

            public final c a() {
                c cVar;
                synchronized (a.this.mLock) {
                    cVar = (c) a.this.mSessionImpl.get();
                }
                if (cVar == null || a.this != cVar.b()) {
                    return null;
                }
                return cVar;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                QueueItem queueItem;
                IBinder asBinder;
                com.amazon.aps.iva.c9.d dVar;
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = a.b;
                        android.support.v4.media.session.b a2 = token.a();
                        if (a2 == null) {
                            asBinder = null;
                        } else {
                            asBinder = a2.asBinder();
                        }
                        com.amazon.aps.iva.k3.d.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        synchronized (token.b) {
                            dVar = token.e;
                        }
                        if (dVar != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(dVar));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        a.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        a.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        a.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        if (a.h != null) {
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < a.h.size()) {
                                queueItem = a.h.get(i);
                            } else {
                                queueItem = null;
                            }
                            if (queueItem != null) {
                                a.this.onRemoveQueueItem(queueItem.b);
                            }
                        }
                    } else {
                        a.this.onCommand(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                }
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                    a aVar = a.this;
                    if (equals) {
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        aVar.onPlayFromUri((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        aVar.onPrepare();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        aVar.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        aVar.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        aVar.onPrepareFromUri((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        aVar.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        aVar.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        aVar.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle6);
                        aVar.onSetRating((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        aVar.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        aVar.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                }
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onFastForward();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                c a = a();
                if (a == null) {
                    return false;
                }
                b(a);
                boolean onMediaButtonEvent = a.this.onMediaButtonEvent(intent);
                a.a(null);
                if (!onMediaButtonEvent && !super.onMediaButtonEvent(intent)) {
                    return false;
                }
                return true;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onPause();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onPlay();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.onPlayFromMediaId(str, bundle);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.onPlayFromSearch(str, bundle);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.onPlayFromUri(uri, bundle);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onPrepare();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.onPrepareFromMediaId(str, bundle);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.onPrepareFromSearch(str, bundle);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                c a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.onPrepareFromUri(uri, bundle);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onRewind();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onSeekTo(j);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onSetPlaybackSpeed(f);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onSetRating(RatingCompat.a(rating));
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onSkipToNext();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onSkipToPrevious();
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j) {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onSkipToQueueItem(j);
                a.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                c a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.onStop();
                a.a(null);
            }
        }

        public void handleMediaPlayPauseIfPendingOnHandler(b bVar, Handler handler) {
            long j;
            boolean z;
            boolean z2;
            if (!this.mMediaPlayPausePendingOnHandler) {
                return;
            }
            boolean z3 = false;
            this.mMediaPlayPausePendingOnHandler = false;
            handler.removeMessages(1);
            PlaybackStateCompat h = bVar.h();
            if (h == null) {
                j = 0;
            } else {
                j = h.f;
            }
            if (h != null && h.b == 3) {
                z = true;
            } else {
                z = false;
            }
            if ((516 & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((j & 514) != 0) {
                z3 = true;
            }
            if (z && z3) {
                onPause();
            } else if (!z && z2) {
                onPlay();
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            b bVar;
            HandlerC0001a handlerC0001a;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.mLock) {
                bVar = this.mSessionImpl.get();
                handlerC0001a = this.mCallbackHandler;
            }
            if (bVar == null || handlerC0001a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            b.C0529b c = bVar.c();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                handleMediaPlayPauseIfPendingOnHandler(bVar, handlerC0001a);
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                if (this.mMediaPlayPausePendingOnHandler) {
                    handlerC0001a.removeMessages(1);
                    this.mMediaPlayPausePendingOnHandler = false;
                    PlaybackStateCompat h = bVar.h();
                    if (h == null) {
                        j = 0;
                    } else {
                        j = h.f;
                    }
                    if ((j & 32) != 0) {
                        onSkipToNext();
                    }
                } else {
                    this.mMediaPlayPausePendingOnHandler = true;
                    handlerC0001a.sendMessageDelayed(handlerC0001a.obtainMessage(1, c), ViewConfiguration.getDoubleTapTimeout());
                }
            } else {
                handleMediaPlayPauseIfPendingOnHandler(bVar, handlerC0001a);
            }
            return true;
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void setSessionImpl(b bVar, Handler handler) {
            synchronized (this.mLock) {
                this.mSessionImpl = new WeakReference<>(bVar);
                HandlerC0001a handlerC0001a = this.mCallbackHandler;
                HandlerC0001a handlerC0001a2 = null;
                if (handlerC0001a != null) {
                    handlerC0001a.removeCallbacksAndMessages(null);
                }
                if (bVar != null && handler != null) {
                    handlerC0001a2 = new HandlerC0001a(handler.getLooper());
                }
                this.mCallbackHandler = handlerC0001a2;
            }
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPrepare() {
        }

        public void onRewind() {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onStop() {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(b.C0529b c0529b);

        a b();

        b.C0529b c();

        PlaybackStateCompat h();
    }

    /* loaded from: classes.dex */
    public static class d extends c {
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public final MediaSession d(Context context, String str, Bundle bundle) {
            return com.amazon.aps.iva.a3.b.b(context, str, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a();
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        Looper mainLooper;
        int i;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i2 = com.amazon.aps.iva.p5.a.a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        queryBroadcastReceivers.size();
                        componentName = null;
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = 33554432;
                    } else {
                        i = 0;
                    }
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, i);
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    this.a = new f(context, str, bundle);
                } else if (i3 >= 28) {
                    this.a = new e(context, str, bundle);
                } else {
                    this.a = new d(context, str, bundle);
                }
                if (Looper.myLooper() != null) {
                    mainLooper = Looper.myLooper();
                } else {
                    mainLooper = Looper.getMainLooper();
                }
                f(new android.support.v4.media.session.c(), new Handler(mainLooper));
                this.a.a.setMediaButtonReceiver(pendingIntent);
                this.b = new MediaControllerCompat(context, this);
                if (d == 0) {
                    d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat c(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        long j2;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j3 = playbackStateCompat.c;
        long j4 = -1;
        if (j3 == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.b;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.i <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = (playbackStateCompat.e * ((float) (elapsedRealtime - j))) + j3;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.b;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j4 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j4 >= 0 && j5 > j4) {
            j2 = j4;
        } else if (j5 < 0) {
            j2 = 0;
        } else {
            j2 = j5;
        }
        ArrayList arrayList = new ArrayList();
        long j6 = playbackStateCompat.d;
        long j7 = playbackStateCompat.f;
        int i2 = playbackStateCompat.g;
        CharSequence charSequence = playbackStateCompat.h;
        ArrayList arrayList2 = playbackStateCompat.j;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.b, j2, j6, playbackStateCompat.e, j7, i2, charSequence, elapsedRealtime, arrayList, playbackStateCompat.k, playbackStateCompat.l);
    }

    public final b.C0529b b() {
        return this.a.c();
    }

    public final void d() {
        d dVar = this.a;
        dVar.e = true;
        dVar.f.kill();
        int i = Build.VERSION.SDK_INT;
        MediaSession mediaSession = dVar.a;
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception unused) {
            }
        }
        mediaSession.setCallback(null);
        mediaSession.release();
    }

    public final void e(boolean z) {
        this.a.a.setActive(z);
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void f(a aVar, Handler handler) {
        d dVar = this.a;
        if (aVar == null) {
            dVar.f(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        dVar.f(aVar, handler);
    }

    public final void g(MediaMetadataCompat mediaMetadataCompat) {
        d dVar = this.a;
        dVar.i = mediaMetadataCompat;
        if (mediaMetadataCompat.c == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        dVar.a.setMetadata(mediaMetadataCompat.c);
    }

    public final void h(PlaybackStateCompat playbackStateCompat) {
        d dVar = this.a;
        dVar.g = playbackStateCompat;
        synchronized (dVar.c) {
            int beginBroadcast = dVar.f.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    dVar.f.getBroadcastItem(beginBroadcast).n0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            dVar.f.finishBroadcast();
        }
        MediaSession mediaSession = dVar.a;
        if (playbackStateCompat.m == null) {
            PlaybackState.Builder d2 = PlaybackStateCompat.b.d();
            PlaybackStateCompat.b.x(d2, playbackStateCompat.b, playbackStateCompat.c, playbackStateCompat.e, playbackStateCompat.i);
            PlaybackStateCompat.b.u(d2, playbackStateCompat.d);
            PlaybackStateCompat.b.s(d2, playbackStateCompat.f);
            PlaybackStateCompat.b.v(d2, playbackStateCompat.h);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.j) {
                PlaybackState.CustomAction customAction2 = customAction.f;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e2 = PlaybackStateCompat.b.e(customAction.b, customAction.c, customAction.d);
                    PlaybackStateCompat.b.w(e2, customAction.e);
                    customAction2 = PlaybackStateCompat.b.b(e2);
                }
                PlaybackStateCompat.b.a(d2, customAction2);
            }
            PlaybackStateCompat.b.t(d2, playbackStateCompat.k);
            PlaybackStateCompat.c.b(d2, playbackStateCompat.l);
            playbackStateCompat.m = PlaybackStateCompat.b.c(d2);
        }
        mediaSession.setPlaybackState(playbackStateCompat.m);
    }

    public final void i(int i) {
        d dVar = this.a;
        dVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        dVar.a.setPlaybackToLocal(builder.build());
    }

    public final void j(h hVar) {
        if (hVar != null) {
            d dVar = this.a;
            dVar.getClass();
            dVar.a.setPlaybackToRemote(hVar.a());
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public final void k(ArrayList arrayList) {
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                QueueItem queueItem = (QueueItem) it.next();
                if (queueItem != null) {
                    long j = queueItem.c;
                    if (hashSet.contains(Long.valueOf(j))) {
                        new IllegalArgumentException("id of each queue item should be unique");
                    }
                    hashSet.add(Long.valueOf(j));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        d dVar = this.a;
        dVar.h = arrayList;
        MediaSession mediaSession = dVar.a;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            QueueItem queueItem2 = (QueueItem) it2.next();
            MediaSession.QueueItem queueItem3 = queueItem2.d;
            if (queueItem3 == null) {
                queueItem3 = QueueItem.b.a(queueItem2.b.b(), queueItem2.c);
                queueItem2.d = queueItem3;
            }
            arrayList2.add(queueItem3);
        }
        mediaSession.setQueue(arrayList2);
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public final MediaDescriptionCompat b;
        public final long c;
        public MediaSession.QueueItem d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j != -1) {
                this.b = mediaDescriptionCompat;
                this.c = j;
                this.d = queueItem;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.b);
            sb.append(", Id=");
            return com.amazon.aps.iva.c.b.b(sb, this.c, " }");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeLong(this.c);
        }

        public QueueItem(Parcel parcel) {
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.c = parcel.readLong();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        public final MediaSession a;
        public final Token b;
        public final Bundle d;
        public PlaybackStateCompat g;
        public List<QueueItem> h;
        public MediaMetadataCompat i;
        public int j;
        public int k;
        public a l;
        public b.C0529b m;
        public final Object c = new Object();
        public boolean e = false;
        public final RemoteCallbackList<android.support.v4.media.session.a> f = new RemoteCallbackList<>();

        public c(Context context, String str, Bundle bundle) {
            MediaSession d = d(context, str, bundle);
            this.a = d;
            this.b = new Token(d.getSessionToken(), new a((d) this), null);
            this.d = bundle;
            d.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void a(b.C0529b c0529b) {
            synchronized (this.c) {
                this.m = c0529b;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final a b() {
            a aVar;
            synchronized (this.c) {
                aVar = this.l;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public b.C0529b c() {
            b.C0529b c0529b;
            synchronized (this.c) {
                c0529b = this.m;
            }
            return c0529b;
        }

        public MediaSession d(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public final String e() {
            MediaSession mediaSession = this.a;
            try {
                return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void f(a aVar, Handler handler) {
            MediaSession.Callback callback;
            synchronized (this.c) {
                this.l = aVar;
                MediaSession mediaSession = this.a;
                if (aVar == null) {
                    callback = null;
                } else {
                    callback = aVar.mCallbackFwk;
                }
                mediaSession.setCallback(callback, handler);
                if (aVar != null) {
                    aVar.setSessionImpl(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final PlaybackStateCompat h() {
            return this.g;
        }

        /* loaded from: classes.dex */
        public class a extends b.a {
            public final /* synthetic */ c b;

            public a(d dVar) {
                this.b = dVar;
            }

            @Override // android.support.v4.media.session.b
            public final void A(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void C(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final int E() {
                return this.b.k;
            }

            @Override // android.support.v4.media.session.b
            public final void F(int i) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void G() {
                this.b.getClass();
            }

            @Override // android.support.v4.media.session.b
            public final void I(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void J(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void K(long j) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void L(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String M() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void P(android.support.v4.media.session.a aVar) {
                if (this.b.e) {
                    return;
                }
                this.b.f.register(aVar, new b.C0529b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (this.b.c) {
                    this.b.getClass();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void Q(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void R(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean S() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void T(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void W(int i, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final CharSequence X() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void Y(android.support.v4.media.session.a aVar) {
                this.b.f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (this.b.c) {
                    this.b.getClass();
                }
            }

            @Override // android.support.v4.media.session.b
            public final void Z(int i, int i2) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void b() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void c(long j) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void f0(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void g() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat h() {
                c cVar = this.b;
                return MediaSessionCompat.c(cVar.g, cVar.i);
            }

            @Override // android.support.v4.media.session.b
            public final List<QueueItem> h0() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public final void i() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void i0(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final ParcelableVolumeInfo j0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void k(float f) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void l(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final long m() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void m0(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final int n() {
                return this.b.j;
            }

            @Override // android.support.v4.media.session.b
            public final void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void p(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void q(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent s() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final int t() {
                this.b.getClass();
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public final void u(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final Bundle v() {
                c cVar = this.b;
                if (cVar.d == null) {
                    return null;
                }
                return new Bundle(cVar.d);
            }

            @Override // android.support.v4.media.session.b
            public final void x(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean y(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void o() {
            }

            @Override // android.support.v4.media.session.b
            public final void r() throws RemoteException {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final b.C0529b c() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.a.getCurrentControllerInfo();
            return new b.C0529b(currentControllerInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final void a(b.C0529b c0529b) {
        }
    }
}
