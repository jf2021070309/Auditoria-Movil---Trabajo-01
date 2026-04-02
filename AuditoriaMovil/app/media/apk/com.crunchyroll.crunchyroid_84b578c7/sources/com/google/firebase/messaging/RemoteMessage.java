package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new zzt();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    private Map<String, String> zzb;
    private Notification zzc;

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static class Builder {
        private final Bundle zza;
        private final Map<String, String> zzb;

        public Builder(String str) {
            String str2;
            Bundle bundle = new Bundle();
            this.zza = bundle;
            this.zzb = new a();
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Invalid to: ".concat(valueOf);
                } else {
                    str2 = new String("Invalid to: ");
                }
                throw new IllegalArgumentException(str2);
            }
            bundle.putString("google.to", str);
        }

        public Builder addData(String str, String str2) {
            this.zzb.put(str, str2);
            return this;
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.zzb.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.zza);
            this.zza.remove("from");
            return new RemoteMessage(bundle);
        }

        public Builder clearData() {
            this.zzb.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.zza.putString("collapse_key", str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.zzb.clear();
            this.zzb.putAll(map);
            return this;
        }

        public Builder setMessageId(String str) {
            this.zza.putString("google.message_id", str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.zza.putString("message_type", str);
            return this;
        }

        public Builder setTtl(int i) {
            this.zza.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MessagePriority {
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.6 */
    /* loaded from: classes4.dex */
    public static class Notification {
        private final String zza;
        private final String zzb;
        private final String[] zzc;
        private final String zzd;
        private final String zze;
        private final String[] zzf;
        private final String zzg;
        private final String zzh;
        private final String zzi;
        private final String zzj;
        private final String zzk;
        private final String zzl;
        private final String zzm;
        private final Uri zzn;
        private final String zzo;
        private final Integer zzp;
        private final Integer zzq;
        private final Integer zzr;
        private final int[] zzs;
        private final Long zzt;
        private final boolean zzu;
        private final boolean zzv;
        private final boolean zzw;
        private final boolean zzx;
        private final boolean zzy;
        private final long[] zzz;

        private Notification(zzr zzrVar) {
            this.zza = zzrVar.zza("gcm.n.title");
            this.zzb = zzrVar.zze("gcm.n.title");
            this.zzc = zza(zzrVar, "gcm.n.title");
            this.zzd = zzrVar.zza("gcm.n.body");
            this.zze = zzrVar.zze("gcm.n.body");
            this.zzf = zza(zzrVar, "gcm.n.body");
            this.zzg = zzrVar.zza("gcm.n.icon");
            this.zzi = zzrVar.zzb();
            this.zzj = zzrVar.zza("gcm.n.tag");
            this.zzk = zzrVar.zza("gcm.n.color");
            this.zzl = zzrVar.zza("gcm.n.click_action");
            this.zzm = zzrVar.zza("gcm.n.android_channel_id");
            this.zzn = zzrVar.zza();
            this.zzh = zzrVar.zza("gcm.n.image");
            this.zzo = zzrVar.zza("gcm.n.ticker");
            this.zzp = zzrVar.zzc("gcm.n.notification_priority");
            this.zzq = zzrVar.zzc("gcm.n.visibility");
            this.zzr = zzrVar.zzc("gcm.n.notification_count");
            this.zzu = zzrVar.zzb("gcm.n.sticky");
            this.zzv = zzrVar.zzb("gcm.n.local_only");
            this.zzw = zzrVar.zzb("gcm.n.default_sound");
            this.zzx = zzrVar.zzb("gcm.n.default_vibrate_timings");
            this.zzy = zzrVar.zzb("gcm.n.default_light_settings");
            this.zzt = zzrVar.zzd("gcm.n.event_time");
            this.zzs = zzrVar.zzd();
            this.zzz = zzrVar.zzc();
        }

        private static String[] zza(zzr zzrVar, String str) {
            Object[] zzf = zzrVar.zzf(str);
            if (zzf == null) {
                return null;
            }
            String[] strArr = new String[zzf.length];
            for (int i = 0; i < zzf.length; i++) {
                strArr[i] = String.valueOf(zzf[i]);
            }
            return strArr;
        }

        public String getBody() {
            return this.zzd;
        }

        public String[] getBodyLocalizationArgs() {
            return this.zzf;
        }

        public String getBodyLocalizationKey() {
            return this.zze;
        }

        public String getChannelId() {
            return this.zzm;
        }

        public String getClickAction() {
            return this.zzl;
        }

        public String getColor() {
            return this.zzk;
        }

        public boolean getDefaultLightSettings() {
            return this.zzy;
        }

        public boolean getDefaultSound() {
            return this.zzw;
        }

        public boolean getDefaultVibrateSettings() {
            return this.zzx;
        }

        public Long getEventTime() {
            return this.zzt;
        }

        public String getIcon() {
            return this.zzg;
        }

        public Uri getImageUrl() {
            String str = this.zzh;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public int[] getLightSettings() {
            return this.zzs;
        }

        public Uri getLink() {
            return this.zzn;
        }

        public boolean getLocalOnly() {
            return this.zzv;
        }

        public Integer getNotificationCount() {
            return this.zzr;
        }

        public Integer getNotificationPriority() {
            return this.zzp;
        }

        public String getSound() {
            return this.zzi;
        }

        public boolean getSticky() {
            return this.zzu;
        }

        public String getTag() {
            return this.zzj;
        }

        public String getTicker() {
            return this.zzo;
        }

        public String getTitle() {
            return this.zza;
        }

        public String[] getTitleLocalizationArgs() {
            return this.zzc;
        }

        public String getTitleLocalizationKey() {
            return this.zzb;
        }

        public long[] getVibrateTimings() {
            return this.zzz;
        }

        public Integer getVisibility() {
            return this.zzq;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = bundle;
    }

    private static int zza(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    public final String getCollapseKey() {
        return this.zza.getString("collapse_key");
    }

    public final Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle bundle = this.zza;
            a aVar = new a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.zzb = aVar;
        }
        return this.zzb;
    }

    public final String getFrom() {
        return this.zza.getString("from");
    }

    public final String getMessageId() {
        String string = this.zza.getString("google.message_id");
        if (string == null) {
            return this.zza.getString("message_id");
        }
        return string;
    }

    public final String getMessageType() {
        return this.zza.getString("message_type");
    }

    public final Notification getNotification() {
        if (this.zzc == null && zzr.zza(this.zza)) {
            this.zzc = new Notification(new zzr(this.zza));
        }
        return this.zzc;
    }

    public final int getOriginalPriority() {
        String string = this.zza.getString("google.original_priority");
        if (string == null) {
            string = this.zza.getString("google.priority");
        }
        return zza(string);
    }

    public final int getPriority() {
        String string = this.zza.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.zza.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.zza.getString("google.priority");
        }
        return zza(string);
    }

    public final long getSentTime() {
        Object obj = this.zza.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                new StringBuilder(String.valueOf(obj).length() + 19);
                return 0L;
            }
        }
        return 0L;
    }

    public final String getTo() {
        return this.zza.getString("google.to");
    }

    public final int getTtl() {
        Object obj = this.zza.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                new StringBuilder(String.valueOf(obj).length() + 13);
                return 0;
            }
        }
        return 0;
    }

    @KeepForSdk
    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.zza);
        return intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
