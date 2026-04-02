package b.a.b.a.a;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import b.a.b.a.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {
    public b.a.b.a.a.a a;

    /* loaded from: classes.dex */
    public static class a extends MediaController.Callback {
        public final WeakReference<c> a;

        public a(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.a.get() != null) {
                playbackInfo.getPlaybackType();
                playbackInfo.getAudioAttributes();
                SparseIntArray sparseIntArray = AudioAttributesCompat.a;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 26 && i2 >= 21) {
                }
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (this.a.get() != null) {
                c.f.a<String, Integer> aVar = MediaMetadataCompat.a;
                if (mediaMetadata == null || Build.VERSION.SDK_INT < 21) {
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                obtain.recycle();
                MediaMetadataCompat.CREATOR.createFromParcel(obtain).f13c = mediaMetadata;
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            ArrayList arrayList;
            PlaybackStateCompat.CustomAction customAction;
            c cVar = this.a.get();
            if (cVar == null || cVar.a != null) {
                return;
            }
            Bundle bundle = null;
            if (playbackState == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            List<PlaybackState.CustomAction> j2 = PlaybackStateCompat.b.j(playbackState);
            if (j2 != null) {
                ArrayList arrayList2 = new ArrayList(j2.size());
                for (PlaybackState.CustomAction customAction2 : j2) {
                    if (customAction2 == null || Build.VERSION.SDK_INT < 21) {
                        customAction = null;
                    } else {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle l2 = PlaybackStateCompat.b.l(customAction3);
                        MediaSessionCompat.a(l2);
                        customAction = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.b.f(customAction3), PlaybackStateCompat.b.o(customAction3), PlaybackStateCompat.b.m(customAction3), l2);
                        customAction.f75e = customAction3;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                bundle = PlaybackStateCompat.c.a(playbackState);
                MediaSessionCompat.a(bundle);
            }
            new PlaybackStateCompat(PlaybackStateCompat.b.r(playbackState), PlaybackStateCompat.b.q(playbackState), PlaybackStateCompat.b.i(playbackState), PlaybackStateCompat.b.p(playbackState), PlaybackStateCompat.b.g(playbackState), 0, PlaybackStateCompat.b.k(playbackState), PlaybackStateCompat.b.n(playbackState), arrayList, PlaybackStateCompat.b.h(playbackState), bundle).f71l = playbackState;
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.a.get() == null || list == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (MediaSession.QueueItem queueItem2 : list) {
                if (queueItem2 == null || Build.VERSION.SDK_INT < 21) {
                    queueItem = null;
                } else {
                    MediaSession.QueueItem queueItem3 = queueItem2;
                    queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.b(MediaSessionCompat.QueueItem.b.b(queueItem3)), MediaSessionCompat.QueueItem.b.c(queueItem3));
                }
                arrayList.add(queueItem);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.a.get();
            if (cVar == null || cVar.a == null) {
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a.AbstractBinderC0006a {

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<c> f683b;

        public b(c cVar) {
            this.f683b = new WeakReference<>(cVar);
        }

        public void H(Bundle bundle) throws RemoteException {
            this.f683b.get();
        }

        public void K(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            this.f683b.get();
        }

        @Override // b.a.b.a.a.a
        public void O0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            this.f683b.get();
        }

        public void Q0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            if (this.f683b.get() == null || parcelableVolumeInfo == null) {
                return;
            }
            int i2 = parcelableVolumeInfo.f57b;
            SparseIntArray sparseIntArray = AudioAttributesCompat.a;
            int i3 = Build.VERSION.SDK_INT;
            AudioAttributesImpl.a aVar = i3 >= 26 ? new AudioAttributesImplApi26.a() : i3 >= 21 ? new AudioAttributesImplApi21.a() : new AudioAttributesImplBase.a();
            aVar.a(i2);
            aVar.build();
        }

        public void m0(CharSequence charSequence) throws RemoteException {
            this.f683b.get();
        }

        public void p0() throws RemoteException {
            this.f683b.get();
        }

        public void r0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            this.f683b.get();
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            new a(this);
        } else {
            this.a = new b(this);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
    }
}
