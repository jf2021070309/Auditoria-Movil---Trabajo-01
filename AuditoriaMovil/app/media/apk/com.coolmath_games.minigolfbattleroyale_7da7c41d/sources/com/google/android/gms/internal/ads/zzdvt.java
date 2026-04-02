package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.util.Clock;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdvt {
    private final Clock zza;

    public zzdvt(Clock clock) {
        this.zza = clock;
    }

    public final void zza(List<Object> list, String str, String str2, Object... objArr) {
        if (zzbla.zza.zze().booleanValue()) {
            long currentTimeMillis = this.zza.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP).value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(NativeProtocol.WEB_DIALOG_PARAMS).beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            com.google.android.gms.ads.internal.util.zze.zzh(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
