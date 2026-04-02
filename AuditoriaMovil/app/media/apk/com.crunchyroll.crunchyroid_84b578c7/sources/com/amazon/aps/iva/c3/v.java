package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.c3.b0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class v extends w {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final b0 c;
    public Boolean d;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.bigText(charSequence);
        }

        public static Notification.BigTextStyle b(Notification.Builder builder) {
            return new Notification.BigTextStyle(builder);
        }

        public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setBigContentTitle(charSequence);
        }

        public static void d(Notification.Style style, Notification.Builder builder) {
            style.setBuilder(builder);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addMessage(message);
        }

        public static Notification.MessagingStyle b(CharSequence charSequence) {
            return new Notification.MessagingStyle(charSequence);
        }

        public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
            return messagingStyle.setConversationTitle(charSequence);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
            return messagingStyle.addHistoricMessage(message);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static Notification.MessagingStyle a(Person person) {
            return new Notification.MessagingStyle(person);
        }

        public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
            return messagingStyle.setGroupConversation(z);
        }
    }

    public v(b0 b0Var) {
        if (!TextUtils.isEmpty(b0Var.a)) {
            this.c = b0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        b0 b0Var = this.c;
        bundle.putCharSequence("android.selfDisplayName", b0Var.a);
        bundle.putBundle("android.messagingStyleUser", b0Var.a());
        bundle.putCharSequence("android.hiddenConversationTitle", null);
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", e.a(arrayList));
        }
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", e.a(arrayList2));
        }
        Boolean bool = this.d;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override // com.amazon.aps.iva.c3.w
    public final void apply(m mVar) {
        Boolean bool;
        boolean booleanValue;
        Notification.MessagingStyle b2;
        s sVar = this.mBuilder;
        if ((sVar == null || sVar.a.getApplicationInfo().targetSdkVersion >= 28 || this.d != null) && (bool = this.d) != null) {
            booleanValue = bool.booleanValue();
        } else {
            booleanValue = false;
        }
        this.d = Boolean.valueOf(booleanValue);
        int i = Build.VERSION.SDK_INT;
        b0 b0Var = this.c;
        if (i >= 28) {
            b0Var.getClass();
            b2 = d.a(b0.a.b(b0Var));
        } else {
            b2 = b.b(b0Var.a);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b.a(b2, ((e) it.next()).b());
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            c.a(b2, ((e) it2.next()).b());
        }
        if (this.d.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            b.c(b2, null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            d.b(b2, this.d.booleanValue());
        }
        a.d(b2, ((x) mVar).b);
    }

    @Override // com.amazon.aps.iva.c3.w
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final CharSequence a;
        public final long b;
        public final b0 c;
        public final Bundle d = new Bundle();

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static class a {
            public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
                return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
            }

            public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                return message.setData(str, uri);
            }
        }

        public e(String str, long j, b0 b0Var) {
            this.a = str;
            this.b = j;
            this.c = b0Var;
        }

        public static Bundle[] a(ArrayList arrayList) {
            Bundle[] bundleArr = new Bundle[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) arrayList.get(i);
                eVar.getClass();
                Bundle bundle = new Bundle();
                CharSequence charSequence = eVar.a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", eVar.b);
                b0 b0Var = eVar.c;
                if (b0Var != null) {
                    bundle.putCharSequence("sender", b0Var.a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(b0.a.b(b0Var)));
                    } else {
                        bundle.putBundle("person", b0Var.a());
                    }
                }
                Bundle bundle2 = eVar.d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                bundleArr[i] = bundle;
            }
            return bundleArr;
        }

        public final Notification.MessagingStyle.Message b() {
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            Person person = null;
            long j = this.b;
            CharSequence charSequence2 = this.a;
            b0 b0Var = this.c;
            if (i >= 28) {
                if (b0Var != null) {
                    person = b0.a.b(b0Var);
                }
                return b.b(charSequence2, j, person);
            }
            if (b0Var != null) {
                charSequence = b0Var.a;
            }
            return a.a(charSequence2, j, charSequence);
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static class b {
            public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
                return new Notification.MessagingStyle.Message(charSequence, j, person);
            }

            public static Parcelable a(Person person) {
                return person;
            }
        }
    }
}
