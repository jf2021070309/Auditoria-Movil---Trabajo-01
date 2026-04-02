package com.google.android.gms.cast.framework.media;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
final class zzar extends zzbk {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaClient zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(RemoteMediaClient remoteMediaClient, int i, int i2, c cVar) {
        super(remoteMediaClient, false);
        this.zzd = remoteMediaClient;
        this.zza = i;
        this.zzb = i2;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbk
    public final void zza() throws com.google.android.gms.cast.internal.zzao {
        MediaQueueItem queueItem;
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        Preconditions.checkMainThread("Must be called from the main thread.");
        RemoteMediaClient remoteMediaClient = this.zzd;
        MediaQueue mediaQueue = remoteMediaClient.getMediaQueue();
        int i = this.zza;
        int indexOfItemWithId = mediaQueue.indexOfItemWithId(i);
        int i2 = 0;
        if (indexOfItemWithId == -1) {
            MediaStatus mediaStatus = (MediaStatus) Preconditions.checkNotNull(remoteMediaClient.getMediaStatus());
            indexOfItemWithId = 0;
            while (true) {
                if (indexOfItemWithId < mediaStatus.getQueueItemCount()) {
                    if (((MediaQueueItem) Preconditions.checkNotNull(mediaStatus.getQueueItem(indexOfItemWithId))).getItemId() == i) {
                        break;
                    }
                    indexOfItemWithId++;
                } else {
                    indexOfItemWithId = -1;
                    break;
                }
            }
        }
        int i3 = this.zzb;
        if (i3 < 0) {
            setResult(new zzbj(this, new Status((int) CastStatusCodes.INVALID_REQUEST, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.zzb)))));
        } else if (indexOfItemWithId == i3) {
            setResult(new zzbj(this, new Status(0)));
        } else {
            if (i3 > indexOfItemWithId) {
                i3++;
            }
            RemoteMediaClient remoteMediaClient2 = this.zzd;
            Preconditions.checkMainThread("Must be called from the main thread.");
            int itemIdAtIndex = remoteMediaClient2.getMediaQueue().itemIdAtIndex(i3);
            if (itemIdAtIndex != 0) {
                i2 = itemIdAtIndex;
            } else {
                MediaStatus mediaStatus2 = remoteMediaClient2.getMediaStatus();
                if (mediaStatus2 != null && (queueItem = mediaStatus2.getQueueItem(i3)) != null) {
                    i2 = queueItem.getItemId();
                }
            }
            zzaqVar = this.zzd.zzd;
            zzaqVar.zzz(zzb(), new int[]{this.zza}, i2, this.zzc);
        }
    }
}
