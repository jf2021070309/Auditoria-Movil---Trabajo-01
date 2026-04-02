package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
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
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import b.a.b.a.a.b;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.AdSize;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class MediaSessionCompat {
    public static final int a;

    /* renamed from: b  reason: collision with root package name */
    public static int f20b;

    /* renamed from: c  reason: collision with root package name */
    public final b f21c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<j> f22d = new ArrayList<>();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public final MediaDescriptionCompat a;

        /* renamed from: b  reason: collision with root package name */
        public final long f23b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j2) {
                return new MediaSession.QueueItem(mediaDescription, j2);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j2 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.a = mediaDescriptionCompat;
            this.f23b = j2;
        }

        public QueueItem(Parcel parcel) {
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f23b = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("MediaSession.QueueItem {Description=");
            y.append(this.a);
            y.append(", Id=");
            return e.a.d.a.a.q(y, this.f23b, " }");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.a.writeToParcel(parcel, i2);
            parcel.writeLong(this.f23b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.a.writeToParcel(parcel, i2);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final Object f24b;

        /* renamed from: c  reason: collision with root package name */
        public b.a.b.a.a.b f25c;

        /* renamed from: d  reason: collision with root package name */
        public c.b0.d f26d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder(), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i2) {
                return new Token[i2];
            }
        }

        public Token(Object obj, b.a.b.a.a.b bVar, c.b0.d dVar) {
            this.f24b = obj;
            this.f25c = bVar;
            this.f26d = dVar;
        }

        public b.a.b.a.a.b b() {
            b.a.b.a.a.b bVar;
            synchronized (this.a) {
                bVar = this.f25c;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Token token = (Token) obj;
                Object obj2 = this.f24b;
                if (obj2 == null) {
                    return token.f24b == null;
                }
                Object obj3 = token.f24b;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f24b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f24b, i2);
            } else {
                parcel.writeStrongBinder((IBinder) this.f24b);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public final Object a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final MediaSession.Callback f27b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28c;

        /* renamed from: d  reason: collision with root package name */
        public WeakReference<b> f29d;

        /* renamed from: e  reason: collision with root package name */
        public HandlerC0000a f30e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0000a extends Handler {
            public HandlerC0000a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar;
                a aVar;
                HandlerC0000a handlerC0000a;
                if (message.what == 1) {
                    synchronized (a.this.a) {
                        bVar = a.this.f29d.get();
                        aVar = a.this;
                        handlerC0000a = aVar.f30e;
                    }
                    if (bVar == null || aVar != bVar.e() || handlerC0000a == null) {
                        return;
                    }
                    bVar.j((c.r.a) message.obj);
                    a.this.a(bVar, handlerC0000a);
                    bVar.j(null);
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends MediaSession.Callback {
            public b() {
            }

            public final e a() {
                e eVar;
                a aVar;
                synchronized (a.this.a) {
                    eVar = (e) a.this.f29d.get();
                }
                if (eVar != null) {
                    a aVar2 = a.this;
                    synchronized (eVar.f32c) {
                        aVar = eVar.f38i;
                    }
                    if (aVar2 == aVar) {
                        return eVar;
                    }
                }
                return null;
            }

            public final void b(b bVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String n2 = ((e) bVar).n();
                if (TextUtils.isEmpty(n2)) {
                    n2 = "android.media.session.MediaController";
                }
                bVar.j(new c.r.a(n2, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                c.b0.d dVar;
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = a.f31b;
                        b.a.b.a.a.b b2 = token.b();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", b2 == null ? null : b2.asBinder());
                        synchronized (token.a) {
                            dVar = token.f26d;
                        }
                        if (dVar != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(dVar));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        a aVar = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        Objects.requireNonNull(aVar);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        a aVar2 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        Objects.requireNonNull(aVar2);
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        a aVar3 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        Objects.requireNonNull(aVar3);
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        Objects.requireNonNull(a.this);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        Objects.requireNonNull(a.this);
                    } else {
                        a.this.b(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                e a = a();
                if (a == null) {
                    return false;
                }
                b(a);
                boolean c2 = a.this.c(intent);
                a.j(null);
                return c2 || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.d();
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.e();
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.f(str, bundle);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                a.this.g(str, bundle);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                e a = a();
                if (a == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j2) {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.h(j2);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f2) {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                Objects.requireNonNull(a.this);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a aVar = a.this;
                RatingCompat.b(rating);
                Objects.requireNonNull(aVar);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.i();
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.j();
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j2) {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.k(j2);
                a.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                e a = a();
                if (a == null) {
                    return;
                }
                b(a);
                a.this.l();
                a.j(null);
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f27b = new b();
            } else {
                this.f27b = null;
            }
            this.f29d = new WeakReference<>(null);
        }

        public void a(b bVar, Handler handler) {
            if (this.f28c) {
                this.f28c = false;
                handler.removeMessages(1);
                PlaybackStateCompat g2 = bVar.g();
                long j2 = g2 == null ? 0L : g2.f64e;
                boolean z = g2 != null && g2.a == 3;
                boolean z2 = (516 & j2) != 0;
                boolean z3 = (j2 & 514) != 0;
                if (z && z3) {
                    d();
                } else if (z || !z2) {
                } else {
                    e();
                }
            }
        }

        public void b(String str, Bundle bundle) {
        }

        public boolean c(Intent intent) {
            b bVar;
            HandlerC0000a handlerC0000a;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.a) {
                bVar = this.f29d.get();
                handlerC0000a = this.f30e;
            }
            if (bVar == null || handlerC0000a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            c.r.a l2 = bVar.l();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(bVar, handlerC0000a);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(bVar, handlerC0000a);
            } else if (this.f28c) {
                handlerC0000a.removeMessages(1);
                this.f28c = false;
                PlaybackStateCompat g2 = bVar.g();
                if (((g2 == null ? 0L : g2.f64e) & 32) != 0) {
                    i();
                }
            } else {
                this.f28c = true;
                handlerC0000a.sendMessageDelayed(handlerC0000a.obtainMessage(1, l2), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void d() {
        }

        public void e() {
        }

        public void f(String str, Bundle bundle) {
        }

        public void g(String str, Bundle bundle) {
        }

        public void h(long j2) {
        }

        public void i() {
        }

        public void j() {
        }

        public void k(long j2) {
        }

        public void l() {
        }

        public void m(b bVar, Handler handler) {
            synchronized (this.a) {
                this.f29d = new WeakReference<>(bVar);
                HandlerC0000a handlerC0000a = this.f30e;
                HandlerC0000a handlerC0000a2 = null;
                if (handlerC0000a != null) {
                    handlerC0000a.removeCallbacksAndMessages(null);
                }
                if (bVar != null && handler != null) {
                    handlerC0000a2 = new HandlerC0000a(handler.getLooper());
                }
                this.f30e = handlerC0000a2;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a();

        void b(int i2);

        Token c();

        void d(a aVar, Handler handler);

        a e();

        void f(MediaMetadataCompat mediaMetadataCompat);

        PlaybackStateCompat g();

        void h(PendingIntent pendingIntent);

        void i(boolean z);

        void j(c.r.a aVar);

        void k(PlaybackStateCompat playbackStateCompat);

        c.r.a l();

        void release();

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static class c extends i {
        public static boolean x = true;

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j2) {
                c.this.p(18, -1, -1, Long.valueOf(j2), null);
            }
        }

        public c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, c.b0.d dVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, dVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i, android.support.v4.media.session.MediaSessionCompat.b
        public void d(a aVar, Handler handler) {
            super.d(aVar, handler);
            if (aVar == null) {
                this.f49j.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f49j.setPlaybackPositionUpdateListener(new a());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public int o(long j2) {
            int o = super.o(j2);
            return (j2 & 256) != 0 ? o | 256 : o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public void q(PendingIntent pendingIntent, ComponentName componentName) {
            if (x) {
                try {
                    this.f48i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    x = false;
                }
            }
            if (x) {
                return;
            }
            this.f48i.registerMediaButtonEventReceiver(componentName);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public void r(PlaybackStateCompat playbackStateCompat) {
            long j2 = playbackStateCompat.f61b;
            float f2 = playbackStateCompat.f63d;
            long j3 = playbackStateCompat.f67h;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = playbackStateCompat.a;
            if (i2 == 3) {
                long j4 = 0;
                if (j2 > 0) {
                    if (j3 > 0) {
                        j4 = elapsedRealtime - j3;
                        if (f2 > 0.0f && f2 != 1.0f) {
                            j4 = ((float) j4) * f2;
                        }
                    }
                    j2 += j4;
                }
            }
            this.f49j.setPlaybackState(n(i2), j2, f2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public void s(PendingIntent pendingIntent, ComponentName componentName) {
            if (x) {
                this.f48i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                this.f48i.unregisterMediaButtonEventReceiver(componentName);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* loaded from: classes.dex */
        public class a implements RemoteControlClient.OnMetadataUpdateListener {
            public a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i2, Object obj) {
                if (i2 == 268435457 && (obj instanceof Rating)) {
                    d.this.p(19, -1, -1, RatingCompat.b(obj), null);
                }
            }
        }

        public d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, c.b0.d dVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, dVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.i, android.support.v4.media.session.MediaSessionCompat.b
        public void d(a aVar, Handler handler) {
            super.d(aVar, handler);
            if (aVar == null) {
                this.f49j.setMetadataUpdateListener(null);
                return;
            }
            this.f49j.setMetadataUpdateListener(new a());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.i
        public RemoteControlClient.MetadataEditor m(Bundle bundle) {
            RemoteControlClient.MetadataEditor m2 = super.m(bundle);
            PlaybackStateCompat playbackStateCompat = this.t;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.f64e) & 128) != 0) {
                m2.addEditableKey(268435457);
            }
            if (bundle == null) {
                return m2;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                m2.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                m2.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                m2.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return m2;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.i
        public int o(long j2) {
            int o = super.o(j2);
            return (j2 & 128) != 0 ? o | AdRequest.MAX_CONTENT_URL_LENGTH : o;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements b {
        public final MediaSession a;

        /* renamed from: b  reason: collision with root package name */
        public final Token f31b;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f33d;

        /* renamed from: g  reason: collision with root package name */
        public PlaybackStateCompat f36g;

        /* renamed from: h  reason: collision with root package name */
        public MediaMetadataCompat f37h;

        /* renamed from: i  reason: collision with root package name */
        public a f38i;

        /* renamed from: j  reason: collision with root package name */
        public c.r.a f39j;

        /* renamed from: c  reason: collision with root package name */
        public final Object f32c = new Object();

        /* renamed from: e  reason: collision with root package name */
        public boolean f34e = false;

        /* renamed from: f  reason: collision with root package name */
        public final RemoteCallbackList<b.a.b.a.a.a> f35f = new RemoteCallbackList<>();

        /* loaded from: classes.dex */
        public class a extends b.a {
            public a() {
            }

            @Override // b.a.b.a.a.b
            public void B0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public int C() {
                Objects.requireNonNull(e.this);
                return 0;
            }

            @Override // b.a.b.a.a.b
            public void C0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void E(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void F0(long j2) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void G() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void G0(boolean z) throws RemoteException {
            }

            @Override // b.a.b.a.a.b
            public ParcelableVolumeInfo H0() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public CharSequence L() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public String M0() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void N(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public Bundle O() {
                if (e.this.f33d == null) {
                    return null;
                }
                return new Bundle(e.this.f33d);
            }

            @Override // b.a.b.a.a.b
            public void P(b.a.b.a.a.a aVar) {
                e.this.f35f.unregister(aVar);
            }

            @Override // b.a.b.a.a.b
            public void T(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void V(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void X() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void Z(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void c0(long j2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public String f() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public PlaybackStateCompat g() {
                e eVar = e.this;
                return MediaSessionCompat.b(eVar.f36g, eVar.f37h);
            }

            @Override // b.a.b.a.a.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public int h() {
                Objects.requireNonNull(e.this);
                return 0;
            }

            @Override // b.a.b.a.a.b
            public void i() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void i0(float f2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public List<QueueItem> j() {
                return null;
            }

            @Override // b.a.b.a.a.b
            public void k(int i2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public long l() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public boolean l0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public int m() {
                Objects.requireNonNull(e.this);
                return 0;
            }

            @Override // b.a.b.a.a.b
            public void n(int i2) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void n0(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void o0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void q(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void q0(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void r(b.a.b.a.a.a aVar) {
                if (e.this.f34e) {
                    return;
                }
                e.this.f35f.register(aVar, new c.r.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // b.a.b.a.a.b
            public boolean s() {
                return false;
            }

            @Override // b.a.b.a.a.b
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void t(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void u(int i2, int i3, String str) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void u0(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void v(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void w(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public boolean x() {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void x0(int i2) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public void y(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // b.a.b.a.a.b
            public boolean y0() {
                Objects.requireNonNull(e.this);
                return false;
            }

            @Override // b.a.b.a.a.b
            public PendingIntent z() {
                throw new AssertionError();
            }
        }

        public e(Context context, String str, c.b0.d dVar, Bundle bundle) {
            MediaSession m2 = m(context, str, bundle);
            this.a = m2;
            this.f31b = new Token(m2.getSessionToken(), new a(), dVar);
            this.f33d = bundle;
            m2.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public boolean a() {
            return this.a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        @SuppressLint({"WrongConstant"})
        public void b(int i2) {
            this.a.setFlags(i2 | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Token c() {
            return this.f31b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void d(a aVar, Handler handler) {
            synchronized (this.f32c) {
                this.f38i = aVar;
                this.a.setCallback(aVar == null ? null : aVar.f27b, handler);
                if (aVar != null) {
                    aVar.m(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public a e() {
            a aVar;
            synchronized (this.f32c) {
                aVar = this.f38i;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void f(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f37h = mediaMetadataCompat;
            MediaSession mediaSession = this.a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                if (mediaMetadataCompat.f13c == null && Build.VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeBundle(mediaMetadataCompat.f12b);
                    obtain.setDataPosition(0);
                    mediaMetadataCompat.f13c = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                mediaMetadata = mediaMetadataCompat.f13c;
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public PlaybackStateCompat g() {
            return this.f36g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i(boolean z) {
            this.a.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(c.r.a aVar) {
            synchronized (this.f32c) {
                this.f39j = aVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f36g = playbackStateCompat;
            for (int beginBroadcast = this.f35f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f35f.getBroadcastItem(beginBroadcast).O0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f35f.finishBroadcast();
            MediaSession mediaSession = this.a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                if (playbackStateCompat.f71l == null && Build.VERSION.SDK_INT >= 21) {
                    PlaybackState.Builder d2 = PlaybackStateCompat.b.d();
                    PlaybackStateCompat.b.x(d2, playbackStateCompat.a, playbackStateCompat.f61b, playbackStateCompat.f63d, playbackStateCompat.f67h);
                    PlaybackStateCompat.b.u(d2, playbackStateCompat.f62c);
                    PlaybackStateCompat.b.s(d2, playbackStateCompat.f64e);
                    PlaybackStateCompat.b.v(d2, playbackStateCompat.f66g);
                    for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f68i) {
                        PlaybackState.CustomAction customAction2 = customAction.f75e;
                        if (customAction2 == null && Build.VERSION.SDK_INT >= 21) {
                            PlaybackState.CustomAction.Builder e2 = PlaybackStateCompat.b.e(customAction.a, customAction.f72b, customAction.f73c);
                            PlaybackStateCompat.b.w(e2, customAction.f74d);
                            customAction2 = PlaybackStateCompat.b.b(e2);
                        }
                        PlaybackStateCompat.b.a(d2, customAction2);
                    }
                    PlaybackStateCompat.b.t(d2, playbackStateCompat.f69j);
                    if (Build.VERSION.SDK_INT >= 22) {
                        PlaybackStateCompat.c.b(d2, playbackStateCompat.f70k);
                    }
                    playbackStateCompat.f71l = PlaybackStateCompat.b.c(d2);
                }
                playbackState = playbackStateCompat.f71l;
            }
            mediaSession.setPlaybackState(playbackState);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public c.r.a l() {
            c.r.a aVar;
            synchronized (this.f32c) {
                aVar = this.f39j;
            }
            return aVar;
        }

        public MediaSession m(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public String n() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.a, new Object[0]);
            } catch (Exception e2) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e2);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void release() {
            this.f34e = true;
            this.f35f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e2) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e2);
                }
            }
            this.a.setCallback(null);
            this.a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f(Context context, String str, c.b0.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public g(Context context, String str, c.b0.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.b
        public void j(c.r.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.b
        public final c.r.a l() {
            return new c.r.a(this.a.getCurrentControllerInfo());
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(Context context, String str, c.b0.d dVar, Bundle bundle) {
            super(context, str, dVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public MediaSession m(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements b {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final ComponentName f41b;

        /* renamed from: c  reason: collision with root package name */
        public final PendingIntent f42c;

        /* renamed from: d  reason: collision with root package name */
        public final b f43d;

        /* renamed from: e  reason: collision with root package name */
        public final Token f44e;

        /* renamed from: f  reason: collision with root package name */
        public final String f45f;

        /* renamed from: g  reason: collision with root package name */
        public final Bundle f46g;

        /* renamed from: h  reason: collision with root package name */
        public final String f47h;

        /* renamed from: i  reason: collision with root package name */
        public final AudioManager f48i;

        /* renamed from: j  reason: collision with root package name */
        public final RemoteControlClient f49j;

        /* renamed from: m  reason: collision with root package name */
        public c f52m;
        public volatile a p;
        public c.r.a q;
        public MediaMetadataCompat s;
        public PlaybackStateCompat t;
        public Bundle u;
        public int v;
        public int w;

        /* renamed from: k  reason: collision with root package name */
        public final Object f50k = new Object();

        /* renamed from: l  reason: collision with root package name */
        public final RemoteCallbackList<b.a.b.a.a.a> f51l = new RemoteCallbackList<>();

        /* renamed from: n  reason: collision with root package name */
        public boolean f53n = false;
        public boolean o = false;
        public int r = 3;

        /* loaded from: classes.dex */
        public static final class a {
            public final String a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f54b;

            /* renamed from: c  reason: collision with root package name */
            public final ResultReceiver f55c;

            public a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.a = str;
                this.f54b = bundle;
                this.f55c = resultReceiver;
            }
        }

        /* loaded from: classes.dex */
        public class b extends b.a {
            public b() {
            }

            @Override // b.a.b.a.a.b
            public void B0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                T0(1, new a(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.a));
            }

            @Override // b.a.b.a.a.b
            public int C() {
                Objects.requireNonNull(i.this);
                return 0;
            }

            @Override // b.a.b.a.a.b
            public void C0() throws RemoteException {
                R0(17);
            }

            @Override // b.a.b.a.a.b
            public void E(String str, Bundle bundle) throws RemoteException {
                U0(5, str, bundle);
            }

            @Override // b.a.b.a.a.b
            public void F0(long j2) {
                T0(11, Long.valueOf(j2));
            }

            @Override // b.a.b.a.a.b
            public void G() throws RemoteException {
                R0(3);
            }

            @Override // b.a.b.a.a.b
            public void G0(boolean z) throws RemoteException {
            }

            @Override // b.a.b.a.a.b
            public ParcelableVolumeInfo H0() {
                int i2;
                int i3;
                int streamMaxVolume;
                int streamVolume;
                synchronized (i.this.f50k) {
                    i iVar = i.this;
                    i2 = iVar.v;
                    i3 = iVar.w;
                    Objects.requireNonNull(iVar);
                    if (i2 == 2) {
                        throw null;
                    }
                    streamMaxVolume = i.this.f48i.getStreamMaxVolume(i3);
                    streamVolume = i.this.f48i.getStreamVolume(i3);
                }
                return new ParcelableVolumeInfo(i2, i3, 2, streamMaxVolume, streamVolume);
            }

            @Override // b.a.b.a.a.b
            public CharSequence L() {
                Objects.requireNonNull(i.this);
                return null;
            }

            @Override // b.a.b.a.a.b
            public String M0() {
                return i.this.f45f;
            }

            @Override // b.a.b.a.a.b
            public void N(String str, Bundle bundle) throws RemoteException {
                U0(4, str, bundle);
            }

            @Override // b.a.b.a.a.b
            public Bundle O() {
                if (i.this.f46g == null) {
                    return null;
                }
                return new Bundle(i.this.f46g);
            }

            @Override // b.a.b.a.a.b
            public void P(b.a.b.a.a.a aVar) {
                i.this.f51l.unregister(aVar);
            }

            public void R0(int i2) {
                i.this.p(i2, 0, 0, null, null);
            }

            public void S0(int i2, int i3) {
                i.this.p(i2, i3, 0, null, null);
            }

            @Override // b.a.b.a.a.b
            public void T(String str, Bundle bundle) throws RemoteException {
                U0(8, str, bundle);
            }

            public void T0(int i2, Object obj) {
                i.this.p(i2, 0, 0, obj, null);
            }

            public void U0(int i2, Object obj, Bundle bundle) {
                i.this.p(i2, 0, 0, obj, bundle);
            }

            @Override // b.a.b.a.a.b
            public void V(String str, Bundle bundle) throws RemoteException {
                U0(9, str, bundle);
            }

            @Override // b.a.b.a.a.b
            public void X() throws RemoteException {
                R0(16);
            }

            @Override // b.a.b.a.a.b
            public void Z(Uri uri, Bundle bundle) throws RemoteException {
                U0(10, uri, bundle);
            }

            @Override // b.a.b.a.a.b
            public void c0(long j2) throws RemoteException {
                T0(18, Long.valueOf(j2));
            }

            @Override // b.a.b.a.a.b
            public String f() {
                return i.this.f47h;
            }

            @Override // b.a.b.a.a.b
            public PlaybackStateCompat g() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (i.this.f50k) {
                    i iVar = i.this;
                    playbackStateCompat = iVar.t;
                    mediaMetadataCompat = iVar.s;
                }
                return MediaSessionCompat.b(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // b.a.b.a.a.b
            public Bundle getExtras() {
                Bundle bundle;
                synchronized (i.this.f50k) {
                    bundle = i.this.u;
                }
                return bundle;
            }

            @Override // b.a.b.a.a.b
            public MediaMetadataCompat getMetadata() {
                return i.this.s;
            }

            @Override // b.a.b.a.a.b
            public int h() {
                Objects.requireNonNull(i.this);
                return 0;
            }

            @Override // b.a.b.a.a.b
            public void i() throws RemoteException {
                R0(7);
            }

            @Override // b.a.b.a.a.b
            public void i0(float f2) throws RemoteException {
                T0(32, Float.valueOf(f2));
            }

            @Override // b.a.b.a.a.b
            public List<QueueItem> j() {
                synchronized (i.this.f50k) {
                    Objects.requireNonNull(i.this);
                }
                return null;
            }

            @Override // b.a.b.a.a.b
            public void k(int i2) throws RemoteException {
                S0(23, i2);
            }

            @Override // b.a.b.a.a.b
            public long l() {
                long j2;
                synchronized (i.this.f50k) {
                    j2 = i.this.r;
                }
                return j2;
            }

            @Override // b.a.b.a.a.b
            public boolean l0(KeyEvent keyEvent) {
                T0(21, keyEvent);
                return true;
            }

            @Override // b.a.b.a.a.b
            public int m() {
                Objects.requireNonNull(i.this);
                return 0;
            }

            @Override // b.a.b.a.a.b
            public void n(int i2) throws RemoteException {
                S0(30, i2);
            }

            @Override // b.a.b.a.a.b
            public void n0(int i2, int i3, String str) {
                i iVar = i.this;
                if (iVar.v == 2) {
                    return;
                }
                iVar.f48i.adjustStreamVolume(iVar.w, i2, i3);
            }

            @Override // b.a.b.a.a.b
            public void next() throws RemoteException {
                R0(14);
            }

            @Override // b.a.b.a.a.b
            public void o0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                U0(31, ratingCompat, bundle);
            }

            @Override // b.a.b.a.a.b
            public void pause() throws RemoteException {
                R0(12);
            }

            @Override // b.a.b.a.a.b
            public void previous() throws RemoteException {
                R0(15);
            }

            @Override // b.a.b.a.a.b
            public void q(String str, Bundle bundle) throws RemoteException {
                U0(20, str, bundle);
            }

            @Override // b.a.b.a.a.b
            public void q0(MediaDescriptionCompat mediaDescriptionCompat, int i2) {
                i.this.p(26, i2, 0, mediaDescriptionCompat, null);
            }

            @Override // b.a.b.a.a.b
            public void r(b.a.b.a.a.a aVar) {
                if (i.this.f53n) {
                    try {
                        aVar.p0();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                String nameForUid = i.this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
                if (TextUtils.isEmpty(nameForUid)) {
                    nameForUid = "android.media.session.MediaController";
                }
                i.this.f51l.register(aVar, new c.r.a(nameForUid, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // b.a.b.a.a.b
            public boolean s() {
                return false;
            }

            @Override // b.a.b.a.a.b
            public void stop() throws RemoteException {
                R0(13);
            }

            @Override // b.a.b.a.a.b
            public void t(RatingCompat ratingCompat) throws RemoteException {
                T0(19, ratingCompat);
            }

            @Override // b.a.b.a.a.b
            public void u(int i2, int i3, String str) {
                i iVar = i.this;
                if (iVar.v == 2) {
                    return;
                }
                iVar.f48i.setStreamVolume(iVar.w, i2, i3);
            }

            @Override // b.a.b.a.a.b
            public void u0(boolean z) throws RemoteException {
                T0(29, Boolean.valueOf(z));
            }

            @Override // b.a.b.a.a.b
            public void v(Uri uri, Bundle bundle) throws RemoteException {
                U0(6, uri, bundle);
            }

            @Override // b.a.b.a.a.b
            public void w(MediaDescriptionCompat mediaDescriptionCompat) {
                T0(27, mediaDescriptionCompat);
            }

            @Override // b.a.b.a.a.b
            public boolean x() {
                return true;
            }

            @Override // b.a.b.a.a.b
            public void x0(int i2) {
                S0(28, i2);
            }

            @Override // b.a.b.a.a.b
            public void y(MediaDescriptionCompat mediaDescriptionCompat) {
                T0(25, mediaDescriptionCompat);
            }

            @Override // b.a.b.a.a.b
            public boolean y0() {
                Objects.requireNonNull(i.this);
                return false;
            }

            @Override // b.a.b.a.a.b
            public PendingIntent z() {
                synchronized (i.this.f50k) {
                    Objects.requireNonNull(i.this);
                }
                return null;
            }
        }

        /* loaded from: classes.dex */
        public class c extends Handler {
            public c(Looper looper) {
                super(looper);
            }

            public final void a(KeyEvent keyEvent, a aVar) {
                long j2;
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = i.this.t;
                long j3 = playbackStateCompat == null ? 0L : playbackStateCompat.f64e;
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((j3 & 4) != 0) {
                            aVar.e();
                            return;
                        }
                        return;
                    } else if (keyCode == 127) {
                        if ((j3 & 2) != 0) {
                            aVar.d();
                            return;
                        }
                        return;
                    } else {
                        switch (keyCode) {
                            case 85:
                                break;
                            case 86:
                                if ((j3 & 1) != 0) {
                                    aVar.l();
                                    return;
                                }
                                return;
                            case 87:
                                if ((j3 & 32) != 0) {
                                    aVar.i();
                                    return;
                                }
                                return;
                            case SyslogConstants.LOG_FTP /* 88 */:
                                if ((j3 & 16) != 0) {
                                    aVar.j();
                                    return;
                                }
                                return;
                            case 89:
                                j2 = 8;
                                int i2 = ((j2 & j3) > 0L ? 1 : ((j2 & j3) == 0L ? 0 : -1));
                                return;
                            case AdSize.LARGE_AD_HEIGHT /* 90 */:
                                j2 = 64;
                                int i22 = ((j2 & j3) > 0L ? 1 : ((j2 & j3) == 0L ? 0 : -1));
                                return;
                            default:
                                return;
                        }
                    }
                }
                Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                a aVar = i.this.p;
                if (aVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                i.this.j(new c.r.a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle("data_extras");
                MediaSessionCompat.a(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            String str = ((a) message.obj).a;
                            break;
                        case 2:
                            i iVar = i.this;
                            int i2 = message.arg1;
                            if (iVar.v != 2) {
                                iVar.f48i.adjustStreamVolume(iVar.w, i2, 0);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            String str2 = (String) message.obj;
                            break;
                        case 5:
                            String str3 = (String) message.obj;
                            break;
                        case 6:
                            Uri uri = (Uri) message.obj;
                            break;
                        case 7:
                            aVar.e();
                            break;
                        case 8:
                            aVar.f((String) message.obj, bundle);
                            break;
                        case 9:
                            aVar.g((String) message.obj, bundle);
                            break;
                        case 10:
                            Uri uri2 = (Uri) message.obj;
                            break;
                        case 11:
                            aVar.k(((Long) message.obj).longValue());
                            break;
                        case 12:
                            aVar.d();
                            break;
                        case 13:
                            aVar.l();
                            break;
                        case 14:
                            aVar.i();
                            break;
                        case 15:
                            aVar.j();
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            aVar.h(((Long) message.obj).longValue());
                            break;
                        case 19:
                            RatingCompat ratingCompat = (RatingCompat) message.obj;
                            break;
                        case 20:
                            aVar.b((String) message.obj, bundle);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!aVar.c(intent)) {
                                a(keyEvent, aVar);
                                break;
                            }
                            break;
                        case 22:
                            i iVar2 = i.this;
                            int i3 = message.arg1;
                            if (iVar2.v != 2) {
                                iVar2.f48i.setStreamVolume(iVar2.w, i3, 0);
                                break;
                            } else {
                                break;
                            }
                        case 25:
                            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) message.obj;
                            break;
                        case 26:
                            MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) message.obj;
                            break;
                        case 27:
                            MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) message.obj;
                            break;
                        case 28:
                            Objects.requireNonNull(i.this);
                            break;
                        case 29:
                            ((Boolean) message.obj).booleanValue();
                            break;
                        case 31:
                            RatingCompat ratingCompat2 = (RatingCompat) message.obj;
                            break;
                        case 32:
                            ((Float) message.obj).floatValue();
                            break;
                    }
                } finally {
                    i.this.j(null);
                }
            }
        }

        public i(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, c.b0.d dVar, Bundle bundle) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.a = context;
            this.f45f = context.getPackageName();
            this.f46g = bundle;
            this.f48i = (AudioManager) context.getSystemService("audio");
            this.f47h = str;
            this.f41b = componentName;
            this.f42c = pendingIntent;
            b bVar = new b();
            this.f43d = bVar;
            this.f44e = new Token(bVar, null, dVar);
            this.v = 1;
            this.w = 3;
            this.f49j = new RemoteControlClient(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public boolean a() {
            return this.o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void b(int i2) {
            synchronized (this.f50k) {
                this.r = i2 | 1 | 2;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Token c() {
            return this.f44e;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x0010, B:12:0x001b, B:14:0x0021, B:16:0x0025, B:17:0x002a, B:19:0x0030, B:20:0x0035), top: B:25:0x0003 }] */
        @Override // android.support.v4.media.session.MediaSessionCompat.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void d(android.support.v4.media.session.MediaSessionCompat.a r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f50k
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$i$c r1 = r4.f52m     // Catch: java.lang.Throwable -> L37
                r2 = 0
                if (r1 == 0) goto Lb
                r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> L37
            Lb:
                if (r5 == 0) goto L1a
                if (r6 != 0) goto L10
                goto L1a
            L10:
                android.support.v4.media.session.MediaSessionCompat$i$c r1 = new android.support.v4.media.session.MediaSessionCompat$i$c     // Catch: java.lang.Throwable -> L37
                android.os.Looper r3 = r6.getLooper()     // Catch: java.lang.Throwable -> L37
                r1.<init>(r3)     // Catch: java.lang.Throwable -> L37
                goto L1b
            L1a:
                r1 = r2
            L1b:
                r4.f52m = r1     // Catch: java.lang.Throwable -> L37
                android.support.v4.media.session.MediaSessionCompat$a r1 = r4.p     // Catch: java.lang.Throwable -> L37
                if (r1 == r5) goto L2a
                android.support.v4.media.session.MediaSessionCompat$a r1 = r4.p     // Catch: java.lang.Throwable -> L37
                if (r1 == 0) goto L2a
                android.support.v4.media.session.MediaSessionCompat$a r1 = r4.p     // Catch: java.lang.Throwable -> L37
                r1.m(r2, r2)     // Catch: java.lang.Throwable -> L37
            L2a:
                r4.p = r5     // Catch: java.lang.Throwable -> L37
                android.support.v4.media.session.MediaSessionCompat$a r5 = r4.p     // Catch: java.lang.Throwable -> L37
                if (r5 == 0) goto L35
                android.support.v4.media.session.MediaSessionCompat$a r5 = r4.p     // Catch: java.lang.Throwable -> L37
                r5.m(r4, r6)     // Catch: java.lang.Throwable -> L37
            L35:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                return
            L37:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.i.d(android.support.v4.media.session.MediaSessionCompat$a, android.os.Handler):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public a e() {
            a aVar;
            synchronized (this.f50k) {
                aVar = this.p;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void f(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat(new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.f20b).a);
            }
            synchronized (this.f50k) {
                this.s = mediaMetadataCompat;
            }
            int beginBroadcast = this.f51l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    this.f51l.getBroadcastItem(beginBroadcast).r0(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f51l.finishBroadcast();
            if (this.o) {
                m(mediaMetadataCompat == null ? null : new Bundle(mediaMetadataCompat.f12b)).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public PlaybackStateCompat g() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f50k) {
                playbackStateCompat = this.t;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i(boolean z) {
            if (z == this.o) {
                return;
            }
            this.o = z;
            t();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(c.r.a aVar) {
            synchronized (this.f50k) {
                this.q = aVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f50k) {
                this.t = playbackStateCompat;
            }
            int beginBroadcast = this.f51l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    this.f51l.getBroadcastItem(beginBroadcast).O0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f51l.finishBroadcast();
            if (this.o) {
                if (playbackStateCompat == null) {
                    this.f49j.setPlaybackState(0);
                    this.f49j.setTransportControlFlags(0);
                    return;
                }
                r(playbackStateCompat);
                this.f49j.setTransportControlFlags(o(playbackStateCompat.f64e));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public c.r.a l() {
            c.r.a aVar;
            synchronized (this.f50k) {
                aVar = this.q;
            }
            return aVar;
        }

        public RemoteControlClient.MetadataEditor m(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f49j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        public int n(int i2) {
            switch (i2) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public int o(long j2) {
            int i2 = (1 & j2) != 0 ? 32 : 0;
            if ((2 & j2) != 0) {
                i2 |= 16;
            }
            if ((4 & j2) != 0) {
                i2 |= 4;
            }
            if ((8 & j2) != 0) {
                i2 |= 2;
            }
            if ((16 & j2) != 0) {
                i2 |= 1;
            }
            if ((32 & j2) != 0) {
                i2 |= 128;
            }
            if ((64 & j2) != 0) {
                i2 |= 64;
            }
            return (j2 & 512) != 0 ? i2 | 8 : i2;
        }

        public void p(int i2, int i3, int i4, Object obj, Bundle bundle) {
            synchronized (this.f50k) {
                c cVar = this.f52m;
                if (cVar != null) {
                    Message obtainMessage = cVar.obtainMessage(i2, i3, i4, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    String nameForUid = this.a.getPackageManager().getNameForUid(callingUid);
                    if (TextUtils.isEmpty(nameForUid)) {
                        nameForUid = "android.media.session.MediaController";
                    }
                    bundle2.putString("data_calling_pkg", nameForUid);
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        public void q(PendingIntent pendingIntent, ComponentName componentName) {
            throw null;
        }

        public void r(PlaybackStateCompat playbackStateCompat) {
            throw null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void release() {
            this.o = false;
            this.f53n = true;
            t();
            int beginBroadcast = this.f51l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    this.f51l.finishBroadcast();
                    this.f51l.kill();
                    d(null, null);
                    return;
                }
                try {
                    this.f51l.getBroadcastItem(beginBroadcast).p0();
                } catch (RemoteException unused) {
                }
            }
        }

        public void s(PendingIntent pendingIntent, ComponentName componentName) {
            throw null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void setExtras(Bundle bundle) {
            this.u = bundle;
            int beginBroadcast = this.f51l.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast < 0) {
                    this.f51l.finishBroadcast();
                    return;
                }
                try {
                    this.f51l.getBroadcastItem(beginBroadcast).H(bundle);
                } catch (RemoteException unused) {
                }
            }
        }

        public void t() {
            if (!this.o) {
                s(this.f42c, this.f41b);
                this.f49j.setPlaybackState(0);
                this.f48i.unregisterRemoteControlClient(this.f49j);
                return;
            }
            q(this.f42c, this.f41b);
            this.f48i.registerRemoteControlClient(this.f49j);
            f(this.s);
            k(this.t);
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    static {
        a = c.i.a.L() ? 33554432 : 0;
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        PendingIntent pendingIntent2;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName != null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent2 = PendingIntent.getBroadcast(context, 0, intent, a);
        } else {
            pendingIntent2 = null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            if (i2 >= 29) {
                this.f21c = new h(context, str, null, null);
            } else if (i2 >= 28) {
                this.f21c = new g(context, str, null, null);
            } else if (i2 >= 22) {
                this.f21c = new f(context, str, null, null);
            } else {
                this.f21c = new e(context, str, null, null);
            }
            d(new b.a.b.a.a.e(this), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            this.f21c.h(pendingIntent2);
        } else {
            this.f21c = new d(context, str, componentName, pendingIntent2, null, null);
        }
        new ConcurrentHashMap();
        Token c2 = this.f21c.c();
        if (i2 >= 29) {
            new b.a.b.a.a.d(context, c2);
        } else if (i2 >= 21) {
            new MediaControllerCompat$MediaControllerImplApi21(context, c2);
        } else {
            b.a.s0((IBinder) c2.f24b);
        }
        if (f20b == 0) {
            f20b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat != null) {
            long j2 = -1;
            if (playbackStateCompat.f61b == -1) {
                return playbackStateCompat;
            }
            int i2 = playbackStateCompat.a;
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                long j3 = playbackStateCompat.f67h;
                if (j3 > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j4 = (playbackStateCompat.f63d * ((float) (elapsedRealtime - j3))) + playbackStateCompat.f61b;
                    if (mediaMetadataCompat != null && mediaMetadataCompat.f12b.containsKey("android.media.metadata.DURATION")) {
                        j2 = mediaMetadataCompat.f12b.getLong("android.media.metadata.DURATION", 0L);
                    }
                    long j5 = (j2 < 0 || j4 <= j2) ? j4 < 0 ? 0L : j4 : j2;
                    ArrayList arrayList = new ArrayList();
                    long j6 = playbackStateCompat.f62c;
                    long j7 = playbackStateCompat.f64e;
                    int i3 = playbackStateCompat.f65f;
                    CharSequence charSequence = playbackStateCompat.f66g;
                    List<PlaybackStateCompat.CustomAction> list = playbackStateCompat.f68i;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    return new PlaybackStateCompat(playbackStateCompat.a, j5, j6, playbackStateCompat.f63d, j7, i3, charSequence, elapsedRealtime, arrayList, playbackStateCompat.f69j, playbackStateCompat.f70k);
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    public static Bundle e(Bundle bundle) {
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public void c(boolean z) {
        this.f21c.i(z);
        Iterator<j> it = this.f22d.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void d(a aVar, Handler handler) {
        if (aVar == null) {
            this.f21c.d(null, null);
            return;
        }
        b bVar = this.f21c;
        if (handler == null) {
            handler = new Handler();
        }
        bVar.d(aVar, handler);
    }
}
