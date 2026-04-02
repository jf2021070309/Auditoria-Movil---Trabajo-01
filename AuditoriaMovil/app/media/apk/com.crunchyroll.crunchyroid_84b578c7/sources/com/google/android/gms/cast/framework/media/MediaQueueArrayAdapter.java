package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.MediaQueue;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public abstract class MediaQueueArrayAdapter extends ArrayAdapter<MediaQueueItem> {
    private final MediaQueue zza;
    private final MediaQueue.Callback zzb;

    public MediaQueueArrayAdapter(MediaQueue mediaQueue, Context context, int i) {
        super(context, i);
        this.zza = mediaQueue;
        zzu zzuVar = new zzu(this, null);
        this.zzb = zzuVar;
        mediaQueue.registerCallback(zzuVar);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public void dispose() {
        this.zza.unregisterCallback(this.zzb);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.zza.getItemCount();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public MediaQueueItem getItem(int i) {
        return this.zza.getItemAtIndex(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return this.zza.itemIdAtIndex(i);
    }

    public MediaQueue getMediaQueue() {
        return this.zza;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        if (this.zza.getItemCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        if (this.zza.getItemAtIndex(i, false) == null) {
            return false;
        }
        return true;
    }
}
