package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class zzaxh {
    private final int zza;
    private final zzaxe zzb = new zzaxj();

    public zzaxh(int i2) {
        this.zza = i2;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(arrayList.get(i2).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzaxg zzaxgVar = new zzaxg();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzaxf(this));
        for (String str : split) {
            String[] zzb = zzaxi.zzb(str, false);
            if (zzb.length != 0) {
                zzaxm.zza(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaxgVar.zzb.write(this.zzb.zza(((zzaxl) it.next()).zzb));
            } catch (IOException e2) {
                zzcgt.zzg("Error while writing hash to byteStream", e2);
            }
        }
        return zzaxgVar.toString();
    }
}
