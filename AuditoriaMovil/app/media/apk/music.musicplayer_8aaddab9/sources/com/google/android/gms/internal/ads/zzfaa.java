package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzfaa {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfaa(int i2, int i3, boolean z) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = z;
    }

    public static List<zzfaa> zza(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i3 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfaa(i2, i3, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
