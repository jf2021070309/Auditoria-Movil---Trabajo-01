package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzed;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public class MediaQueue {
    long zza;
    LruCache zzd;
    private final RemoteMediaClient zzh;
    private PendingResult zzl;
    private PendingResult zzm;
    private final Set zzn = Collections.synchronizedSet(new HashSet());
    private final Logger zzg = new Logger("MediaQueue");
    private final int zzi = Math.max(20, 1);
    List zzb = new ArrayList();
    final SparseIntArray zzc = new SparseIntArray();
    final List zze = new ArrayList();
    final Deque zzf = new ArrayDeque(20);
    private final Handler zzj = new zzed(Looper.getMainLooper());
    private final TimerTask zzk = new zzq(this);

    /* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void itemsInsertedInRange(int i, int i2) {
        }

        public void itemsReloaded() {
        }

        public void itemsRemovedAtIndexes(int[] iArr) {
        }

        public void itemsReorderedAtIndexes(List<Integer> list, int i) {
        }

        public void itemsUpdatedAtIndexes(int[] iArr) {
        }

        public void mediaQueueChanged() {
        }

        public void mediaQueueWillChange() {
        }
    }

    public MediaQueue(RemoteMediaClient remoteMediaClient, int i, int i2) {
        this.zzh = remoteMediaClient;
        remoteMediaClient.registerCallback(new zzs(this));
        zzt(20);
        this.zza = zzp();
        zzo();
    }

    public static /* bridge */ /* synthetic */ void zze(MediaQueue mediaQueue, int i, int i2) {
        synchronized (mediaQueue.zzn) {
            for (Callback callback : mediaQueue.zzn) {
                callback.itemsInsertedInRange(i, i2);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzf(MediaQueue mediaQueue, int[] iArr) {
        synchronized (mediaQueue.zzn) {
            for (Callback callback : mediaQueue.zzn) {
                callback.itemsRemovedAtIndexes(iArr);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(MediaQueue mediaQueue, List list, int i) {
        synchronized (mediaQueue.zzn) {
            for (Callback callback : mediaQueue.zzn) {
                callback.itemsReorderedAtIndexes(list, i);
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(final MediaQueue mediaQueue) {
        if (!mediaQueue.zzf.isEmpty() && mediaQueue.zzl == null && mediaQueue.zza != 0) {
            PendingResult zzj = mediaQueue.zzh.zzj(CastUtils.zzf(mediaQueue.zzf));
            mediaQueue.zzl = zzj;
            zzj.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzp
                @Override // com.google.android.gms.common.api.ResultCallback
                public final void onResult(Result result) {
                    MediaQueue.this.zzn((RemoteMediaClient.MediaChannelResult) result);
                }
            });
            mediaQueue.zzf.clear();
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(MediaQueue mediaQueue) {
        mediaQueue.zzc.clear();
        for (int i = 0; i < mediaQueue.zzb.size(); i++) {
            mediaQueue.zzc.put(((Integer) mediaQueue.zzb.get(i)).intValue(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzp() {
        MediaStatus mediaStatus = this.zzh.getMediaStatus();
        if (mediaStatus != null && !mediaStatus.zzd()) {
            return mediaStatus.zzb();
        }
        return 0L;
    }

    private final void zzq() {
        this.zzj.removeCallbacks(this.zzk);
    }

    private final void zzr() {
        PendingResult pendingResult = this.zzm;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzm = null;
        }
    }

    private final void zzs() {
        PendingResult pendingResult = this.zzl;
        if (pendingResult != null) {
            pendingResult.cancel();
            this.zzl = null;
        }
    }

    private final void zzt(int i) {
        this.zzd = new zzr(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.mediaQueueChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.itemsReloaded();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzw(int[] iArr) {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.itemsUpdatedAtIndexes(iArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzx() {
        synchronized (this.zzn) {
            for (Callback callback : this.zzn) {
                callback.mediaQueueWillChange();
            }
        }
    }

    private final void zzy() {
        zzq();
        this.zzj.postDelayed(this.zzk, 500L);
    }

    public PendingResult<RemoteMediaClient.MediaChannelResult> fetchMoreItemsRelativeToIndex(int i, int i2, int i3) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza == 0) {
            return RemoteMediaClient.zzf(2100, "No active media session");
        }
        int itemIdAtIndex = itemIdAtIndex(i);
        if (itemIdAtIndex == 0) {
            return RemoteMediaClient.zzf(CastStatusCodes.INVALID_REQUEST, "index out of bound");
        }
        return this.zzh.zzh(itemIdAtIndex, i2, i3);
    }

    public MediaQueueItem getItemAtIndex(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return getItemAtIndex(i, true);
    }

    public int getItemCount() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzb.size();
    }

    public int[] getItemIds() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return CastUtils.zzf(this.zzb);
    }

    public int indexOfItemWithId(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        return this.zzc.get(i, -1);
    }

    public int itemIdAtIndex(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (i >= 0 && i < this.zzb.size()) {
            return ((Integer) this.zzb.get(i)).intValue();
        }
        return 0;
    }

    public void registerCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzn.add(callback);
    }

    public void setCacheCapacity(int i) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        LruCache lruCache = this.zzd;
        ArrayList arrayList = new ArrayList();
        zzt(i);
        int size = lruCache.size();
        for (Map.Entry entry : lruCache.snapshot().entrySet()) {
            if (size > i) {
                int i2 = this.zzc.get(((Integer) entry.getKey()).intValue(), -1);
                if (i2 != -1) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } else {
                this.zzd.put((Integer) entry.getKey(), (MediaQueueItem) entry.getValue());
            }
            size--;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        zzx();
        zzw(CastUtils.zzf(arrayList));
        zzu();
    }

    public void unregisterCallback(Callback callback) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        this.zzn.remove(callback);
    }

    public final void zzl() {
        zzx();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.evictAll();
        this.zze.clear();
        zzq();
        this.zzf.clear();
        zzr();
        zzs();
        zzv();
        zzu();
    }

    public final void zzm(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.w(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzm = null;
        if (!this.zzf.isEmpty()) {
            zzy();
        }
    }

    public final void zzn(RemoteMediaClient.MediaChannelResult mediaChannelResult) {
        Status status = mediaChannelResult.getStatus();
        int statusCode = status.getStatusCode();
        if (statusCode != 0) {
            this.zzg.w(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", Integer.valueOf(statusCode), status.getStatusMessage()), new Object[0]);
        }
        this.zzl = null;
        if (!this.zzf.isEmpty()) {
            zzy();
        }
    }

    public final void zzo() {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (this.zza != 0 && this.zzm == null) {
            zzr();
            zzs();
            PendingResult zzi = this.zzh.zzi();
            this.zzm = zzi;
            zzi.setResultCallback(new ResultCallback() { // from class: com.google.android.gms.cast.framework.media.zzo
                @Override // com.google.android.gms.common.api.ResultCallback
                public final void onResult(Result result) {
                    MediaQueue.this.zzm((RemoteMediaClient.MediaChannelResult) result);
                }
            });
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x003c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.cast.MediaQueueItem getItemAtIndex(int r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)
            if (r3 < 0) goto L51
            java.util.List r0 = r2.zzb
            int r0 = r0.size()
            if (r3 < r0) goto L10
            goto L51
        L10:
            java.util.List r0 = r2.zzb
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            android.util.LruCache r0 = r2.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.cast.MediaQueueItem r0 = (com.google.android.gms.cast.MediaQueueItem) r0
            if (r0 != 0) goto L50
            if (r4 == 0) goto L50
            java.util.Deque r4 = r2.zzf
            boolean r4 = r4.contains(r1)
            if (r4 != 0) goto L50
        L34:
            java.util.Deque r4 = r2.zzf
            int r1 = r2.zzi
            int r4 = r4.size()
            if (r4 < r1) goto L44
            java.util.Deque r4 = r2.zzf
            r4.removeFirst()
            goto L34
        L44:
            java.util.Deque r4 = r2.zzf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            r2.zzy()
        L50:
            return r0
        L51:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaQueue.getItemAtIndex(int, boolean):com.google.android.gms.cast.MediaQueueItem");
    }
}
