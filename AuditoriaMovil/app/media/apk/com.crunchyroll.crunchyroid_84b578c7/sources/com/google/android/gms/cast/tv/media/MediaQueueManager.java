package com.google.android.gms.cast.tv.media;

import com.amazon.aps.iva.q.c0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.cast_tv.zzaj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class MediaQueueManager {
    private static final Logger zza = new Logger("MediaQueueManager");
    private final zzaj zzb;
    private MediaQueueData zzc;
    private Integer zzd;
    private Integer zze;
    private List zzf;
    private List zzg;
    private int zzh = 1;
    private boolean zzi = true;

    public MediaQueueManager(zzaj zzajVar) {
        this.zzb = zzajVar;
    }

    private final List zzf() {
        List list = this.zzf;
        if (list != null) {
            return list;
        }
        List list2 = this.zzg;
        if (list2 != null) {
            return list2;
        }
        return new ArrayList();
    }

    public int autoGenerateItemId() {
        int i = this.zzh;
        this.zzh = i + 1;
        return i;
    }

    public void clear() {
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
    }

    public Integer getCurrentItemId() {
        return this.zzd;
    }

    public MediaQueueData getMediaQueueData() {
        return this.zzc;
    }

    public List<MediaQueueItem> getQueueItems() {
        return this.zzf;
    }

    public Integer getQueueRepeatMode() {
        return this.zze;
    }

    public void notifyItemsChanged(List<Integer> list) {
        zzaj zzajVar = this.zzb;
        zzl zzlVar = new zzl();
        zzlVar.zza(2);
        zzlVar.zzc(list);
        zzajVar.zzr(zzlVar.zzd());
    }

    public void notifyItemsInserted(List<Integer> list, Integer num) {
        zzaj zzajVar = this.zzb;
        zzl zzlVar = new zzl();
        zzlVar.zza(0);
        zzlVar.zzc(list);
        zzlVar.zzb(num);
        zzajVar.zzr(zzlVar.zzd());
    }

    public void notifyItemsRemoved(List<Integer> list) {
        zzaj zzajVar = this.zzb;
        zzl zzlVar = new zzl();
        zzlVar.zza(1);
        zzlVar.zzc(list);
        zzajVar.zzr(zzlVar.zzd());
    }

    public void notifyQueueFullUpdate() {
        zzaj zzajVar = this.zzb;
        zzl zzlVar = new zzl();
        zzlVar.zza(3);
        zzlVar.zzc(zzc());
        zzajVar.zzr(zzlVar.zzd());
    }

    public MediaQueueManager setCurrentItemId(Integer num) {
        this.zzd = num;
        return this;
    }

    public MediaQueueManager setMediaQueueData(MediaQueueData mediaQueueData) {
        this.zzc = mediaQueueData;
        return this;
    }

    public MediaQueueManager setQueueItems(List<MediaQueueItem> list) {
        this.zzf = list;
        notifyQueueFullUpdate();
        return this;
    }

    public MediaQueueManager setQueueRepeatMode(Integer num) {
        this.zze = num;
        return this;
    }

    public void setQueueStatusLimit(boolean z) {
        this.zzi = z;
    }

    public final Task zza(String str, zzz zzzVar) {
        this.zzb.zzt(str, new zzo(zzc(), zzzVar.zzb.getRequestId()));
        return Tasks.forResult(null);
    }

    public final Task zzb(String str, zze zzeVar) {
        List zzb = zzeVar.zzb();
        if (zzb == null) {
            return Tasks.forResult(null);
        }
        HashSet hashSet = new HashSet(zzb);
        List<MediaQueueItem> zzf = zzf();
        ArrayList arrayList = new ArrayList();
        for (MediaQueueItem mediaQueueItem : zzf) {
            if (hashSet.contains(Integer.valueOf(mediaQueueItem.getItemId()))) {
                arrayList.add(mediaQueueItem);
            }
        }
        this.zzb.zzu(str, new zzr(arrayList, zzeVar.zzb.getRequestId()));
        return Tasks.forResult(null);
    }

    @ShowFirstParty
    public final List zzc() {
        List<MediaQueueItem> zzf = zzf();
        ArrayList arrayList = new ArrayList();
        for (MediaQueueItem mediaQueueItem : zzf) {
            arrayList.add(Integer.valueOf(mediaQueueItem.getItemId()));
        }
        return arrayList;
    }

    public final void zzd(MediaStatus mediaStatus) {
        this.zzg = mediaStatus.getQueueItems();
        MediaStatusWriter mediaStatusWriter = new MediaStatusWriter(mediaStatus);
        MediaQueueData mediaQueueData = this.zzc;
        if (mediaQueueData != null) {
            mediaStatusWriter.setQueueData(mediaQueueData);
        }
        Integer num = this.zzd;
        if (num != null) {
            mediaStatusWriter.setCurrentItemId(num.intValue());
        }
        Integer num2 = this.zze;
        if (num2 != null) {
            mediaStatusWriter.setQueueRepeatMode(num2.intValue());
        }
        List<MediaQueueItem> list = this.zzf;
        if (this.zzi && list != null) {
            ArrayList arrayList = new ArrayList();
            ListIterator<MediaQueueItem> listIterator = list.listIterator();
            Integer num3 = this.zzd;
            if (num3 != null) {
                int intValue = num3.intValue();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    } else if (listIterator.next().getItemId() == intValue) {
                        listIterator.previous();
                        break;
                    }
                }
            }
            if (!listIterator.hasNext()) {
                zza.e("Current queue item cannot be found while limiting the queue items. Will return the first 3 items", new Object[0]);
                list = list.subList(0, Math.min(3, list.size()));
            } else {
                if (listIterator.hasPrevious()) {
                    arrayList.add(listIterator.previous());
                    listIterator.next();
                }
                if (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                if (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                list = arrayList;
            }
        }
        if (list != null) {
            mediaStatusWriter.setQueueItems(list);
        }
    }

    public final void zze(MediaLoadRequestData mediaLoadRequestData) {
        List<MediaQueueItem> list;
        clear();
        MediaQueueData queueData = mediaLoadRequestData.getQueueData();
        MediaInfo mediaInfo = mediaLoadRequestData.getMediaInfo();
        if (queueData != null) {
            list = queueData.getItems();
        } else {
            list = null;
        }
        if (queueData != null && list != null) {
            if (queueData.getStartIndex() < 0) {
                zza.e(c0.a("Invalid startIndex: ", queueData.getStartIndex()), new Object[0]);
            } else if (queueData.getStartIndex() >= list.size()) {
                zza.e("Invalid number of items", new Object[0]);
            } else {
                this.zzf = new ArrayList(list);
                this.zze = Integer.valueOf(queueData.getRepeatMode());
                this.zzc = queueData;
                for (MediaQueueItem mediaQueueItem : list) {
                    MediaQueueItem.Writer writer = mediaQueueItem.getWriter();
                    int i = this.zzh;
                    this.zzh = i + 1;
                    writer.setItemId(i);
                }
                this.zzd = Integer.valueOf(list.get(queueData.getStartIndex()).getItemId());
            }
        } else if (mediaInfo != null) {
            ArrayList arrayList = new ArrayList();
            this.zzf = arrayList;
            MediaQueueItem.Builder builder = new MediaQueueItem.Builder(mediaInfo);
            int i2 = this.zzh;
            this.zzh = i2 + 1;
            arrayList.add(builder.setItemId(i2).build());
            this.zzd = Integer.valueOf(((MediaQueueItem) this.zzf.get(0)).getItemId());
        } else {
            zza.e("The load request does not has MediaInfo or queue items, the queue will be empty", new Object[0]);
        }
    }
}
