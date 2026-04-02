package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.ss.android.socialbase.downloader.BuildConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new zzc();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    Bundle a;
    private Map<String, String> b;
    private Notification c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MessagePriority {
    }

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private final Bundle a = new Bundle();
        private final Map<String, String> b = new ArrayMap();

        public Builder(String str) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid to: ".concat(valueOf) : new String("Invalid to: "));
            } else {
                this.a.putString("google.to", str);
            }
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new RemoteMessage(bundle);
        }

        public Builder addData(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        public Builder clearData() {
            this.b.clear();
            return this;
        }

        public Builder setMessageId(String str) {
            this.a.putString("google.message_id", str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.a.putString("message_type", str);
            return this;
        }

        public Builder setTtl(int i) {
            this.a.putString("google.ttl", String.valueOf(i));
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.a.putString("collapse_key", str);
            return this;
        }
    }

    public final String getFrom() {
        return this.a.getString("from");
    }

    public final String getTo() {
        return this.a.getString("google.to");
    }

    public final Map<String, String> getData() {
        if (this.b == null) {
            Bundle bundle = this.a;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.b = arrayMap;
        }
        return this.b;
    }

    /* loaded from: classes2.dex */
    public static class Notification {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final Uri l;

        private Notification(Bundle bundle) {
            this.a = a.a(bundle, "gcm.n.title");
            this.b = a.b(bundle, "gcm.n.title");
            this.c = a(bundle, "gcm.n.title");
            this.d = a.a(bundle, "gcm.n.body");
            this.e = a.b(bundle, "gcm.n.body");
            this.f = a(bundle, "gcm.n.body");
            this.g = a.a(bundle, "gcm.n.icon");
            this.h = a.d(bundle);
            this.i = a.a(bundle, "gcm.n.tag");
            this.j = a.a(bundle, "gcm.n.color");
            this.k = a.a(bundle, "gcm.n.click_action");
            this.l = a.b(bundle);
        }

        private static String[] a(Bundle bundle, String str) {
            Object[] c = a.c(bundle, str);
            if (c == null) {
                return null;
            }
            String[] strArr = new String[c.length];
            for (int i = 0; i < c.length; i++) {
                strArr[i] = String.valueOf(c[i]);
            }
            return strArr;
        }

        public String getTitle() {
            return this.a;
        }

        public String getTitleLocalizationKey() {
            return this.b;
        }

        public String[] getTitleLocalizationArgs() {
            return this.c;
        }

        public String getBody() {
            return this.d;
        }

        public String getBodyLocalizationKey() {
            return this.e;
        }

        public String[] getBodyLocalizationArgs() {
            return this.f;
        }

        public String getIcon() {
            return this.g;
        }

        public String getSound() {
            return this.h;
        }

        public String getTag() {
            return this.i;
        }

        public String getColor() {
            return this.j;
        }

        public String getClickAction() {
            return this.k;
        }

        public Uri getLink() {
            return this.l;
        }
    }

    public final String getCollapseKey() {
        return this.a.getString("collapse_key");
    }

    public final String getMessageId() {
        String string = this.a.getString("google.message_id");
        if (string == null) {
            return this.a.getString("message_id");
        }
        return string;
    }

    public final String getMessageType() {
        return this.a.getString("message_type");
    }

    public final long getSentTime() {
        Object obj = this.a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(obj);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Invalid sent time: ").append(valueOf).toString());
            }
        }
        return 0L;
    }

    public final int getTtl() {
        Object obj = this.a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(obj);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 13).append("Invalid TTL: ").append(valueOf).toString());
            }
        }
        return 0;
    }

    public final int getOriginalPriority() {
        String string = this.a.getString("google.original_priority");
        if (string == null) {
            string = this.a.getString("google.priority");
        }
        return a(string);
    }

    public final int getPriority() {
        String string = this.a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.a.getString("google.priority");
        }
        return a(string);
    }

    private static int a(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if (BuildConfig.FLAVOR.equals(str)) {
            return 2;
        }
        return 0;
    }

    public final Notification getNotification() {
        if (this.c == null && a.a(this.a)) {
            this.c = new Notification(this.a);
        }
        return this.c;
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.a);
        return intent;
    }
}
