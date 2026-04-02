package com.amazon.aps.iva.c3;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.aps.iva.c3.b0;
import com.amazon.aps.iva.c3.p;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public final class x implements m {
    public final Context a;
    public final Notification.Builder b;
    public final s c;
    public final Bundle d;

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setPriority(i);
        }

        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        public static Notification.Builder d(Notification.Builder builder, boolean z) {
            return builder.setUsesChronometer(z);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setShowWhen(z);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class d {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class e {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class h {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class i {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class j {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    /* loaded from: classes.dex */
    public static class k {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public x(s sVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Icon f2;
        ArrayList<b0> arrayList;
        int i2;
        Bundle bundle;
        ArrayList<p> arrayList2;
        ArrayList<String> arrayList3;
        CharSequence charSequence;
        x xVar = this;
        new ArrayList();
        xVar.d = new Bundle();
        xVar.c = sVar;
        Context context = sVar.a;
        xVar.a = context;
        Notification.Builder a2 = h.a(context, sVar.A);
        xVar.b = a2;
        Notification notification = sVar.E;
        Bundle[] bundleArr = null;
        Notification.Builder lights = a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i3 = 2;
        int i4 = 0;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(sVar.e).setContentText(sVar.f).setContentInfo(null).setContentIntent(sVar.g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setNumber(sVar.i).setProgress(sVar.n, sVar.o, sVar.p);
        IconCompat iconCompat = sVar.h;
        if (iconCompat == null) {
            f2 = null;
        } else {
            f2 = IconCompat.a.f(iconCompat, context);
        }
        f.b(a2, f2);
        a.b(a.d(a.c(a2, sVar.m), false), sVar.j);
        w wVar = sVar.l;
        if (wVar instanceof t) {
            t tVar = (t) wVar;
            Integer valueOf = Integer.valueOf(com.amazon.aps.iva.d3.a.getColor(tVar.mBuilder.a, R.color.call_notification_decline_color));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) tVar.mBuilder.a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            Context context2 = tVar.mBuilder.a;
            PorterDuff.Mode mode = IconCompat.k;
            context2.getClass();
            p a3 = new p.a(IconCompat.b(context2.getResources(), context2.getPackageName(), R.drawable.ic_call_decline), spannableStringBuilder, null, new Bundle()).a();
            a3.a.putBoolean("key_action_priority", true);
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(a3);
            ArrayList<p> arrayList5 = tVar.mBuilder.b;
            if (arrayList5 != null) {
                Iterator<p> it = arrayList5.iterator();
                while (it.hasNext()) {
                    p next = it.next();
                    if (next.g) {
                        arrayList4.add(next);
                    } else if (!next.a.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList4.add(next);
                        i3--;
                    }
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                xVar.a((p) it2.next());
            }
        } else {
            Iterator<p> it3 = sVar.b.iterator();
            while (it3.hasNext()) {
                xVar.a(it3.next());
            }
        }
        Bundle bundle2 = sVar.u;
        if (bundle2 != null) {
            xVar.d.putAll(bundle2);
        }
        int i5 = Build.VERSION.SDK_INT;
        b.a(xVar.b, sVar.k);
        d.i(xVar.b, sVar.s);
        d.g(xVar.b, sVar.q);
        d.j(xVar.b, null);
        d.h(xVar.b, sVar.r);
        e.b(xVar.b, sVar.t);
        e.c(xVar.b, sVar.v);
        e.f(xVar.b, sVar.w);
        e.d(xVar.b, sVar.x);
        e.e(xVar.b, notification.sound, notification.audioAttributes);
        ArrayList<b0> arrayList6 = sVar.c;
        ArrayList<String> arrayList7 = sVar.F;
        if (i5 < 28) {
            if (arrayList6 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList<>(arrayList6.size());
                Iterator<b0> it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    b0 next2 = it4.next();
                    String str = next2.c;
                    if (str == null) {
                        if (next2.a != null) {
                            str = "name:" + ((Object) charSequence);
                        } else {
                            str = "";
                        }
                    }
                    arrayList3.add(str);
                }
            }
            if (arrayList3 != null) {
                if (arrayList7 != null) {
                    com.amazon.aps.iva.x.b bVar = new com.amazon.aps.iva.x.b(arrayList7.size() + arrayList3.size());
                    bVar.addAll(arrayList3);
                    bVar.addAll(arrayList7);
                    arrayList3 = new ArrayList<>(bVar);
                }
                arrayList7 = arrayList3;
            }
        }
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            for (String str2 : arrayList7) {
                e.a(xVar.b, str2);
            }
        }
        ArrayList<p> arrayList8 = sVar.d;
        if (arrayList8.size() > 0) {
            if (sVar.u == null) {
                sVar.u = new Bundle();
            }
            Bundle bundle3 = sVar.u.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i6 = 0;
            while (i4 < arrayList8.size()) {
                String num = Integer.toString(i4);
                p pVar = arrayList8.get(i4);
                Object obj = y.a;
                Bundle bundle6 = new Bundle();
                IconCompat a4 = pVar.a();
                bundle6.putInt("icon", a4 != null ? a4.c() : i6);
                bundle6.putCharSequence("title", pVar.i);
                bundle6.putParcelable("actionIntent", pVar.j);
                Bundle bundle7 = pVar.a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", pVar.d);
                bundle6.putBundle("extras", bundle);
                d0[] d0VarArr = pVar.c;
                if (d0VarArr == null) {
                    arrayList2 = arrayList8;
                } else {
                    bundleArr = new Bundle[d0VarArr.length];
                    int i7 = 0;
                    arrayList2 = arrayList8;
                    while (i7 < d0VarArr.length) {
                        d0 d0Var = d0VarArr[i7];
                        d0[] d0VarArr2 = d0VarArr;
                        Bundle bundle8 = new Bundle();
                        d0Var.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence("label", null);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr[i7] = bundle8;
                        i7++;
                        d0VarArr = d0VarArr2;
                        arrayList6 = arrayList6;
                    }
                }
                ArrayList<b0> arrayList9 = arrayList6;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", pVar.e);
                bundle6.putInt("semanticAction", pVar.f);
                bundle5.putBundle(num, bundle6);
                i4++;
                bundleArr = null;
                i6 = 0;
                arrayList8 = arrayList2;
                arrayList6 = arrayList9;
            }
            arrayList = arrayList6;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (sVar.u == null) {
                sVar.u = new Bundle();
            }
            sVar.u.putBundle("android.car.EXTENSIONS", bundle3);
            xVar = this;
            xVar.d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList6;
        }
        int i8 = Build.VERSION.SDK_INT;
        c.a(xVar.b, sVar.u);
        g.e(xVar.b, null);
        RemoteViews remoteViews = sVar.y;
        if (remoteViews != null) {
            g.c(xVar.b, remoteViews);
        }
        RemoteViews remoteViews2 = sVar.z;
        if (remoteViews2 != null) {
            g.b(xVar.b, remoteViews2);
        }
        h.b(xVar.b, 0);
        h.e(xVar.b, null);
        h.f(xVar.b, sVar.B);
        h.g(xVar.b, 0L);
        h.d(xVar.b, 0);
        if (!TextUtils.isEmpty(sVar.A)) {
            xVar.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i8 >= 28) {
            Iterator<b0> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                b0 next3 = it5.next();
                Notification.Builder builder = xVar.b;
                next3.getClass();
                i.a(builder, b0.a.b(next3));
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            j.a(xVar.b, sVar.D);
            j.b(xVar.b, null);
        }
        if (i9 >= 31 && (i2 = sVar.C) != 0) {
            k.b(xVar.b, i2);
        }
    }

    public final void a(p pVar) {
        Icon icon;
        Bundle bundle;
        IconCompat a2 = pVar.a();
        RemoteInput[] remoteInputArr = null;
        if (a2 != null) {
            icon = IconCompat.a.f(a2, null);
        } else {
            icon = null;
        }
        Notification.Action.Builder a3 = f.a(icon, pVar.i, pVar.j);
        d0[] d0VarArr = pVar.c;
        if (d0VarArr != null) {
            if (d0VarArr != null) {
                remoteInputArr = new RemoteInput[d0VarArr.length];
                for (int i2 = 0; i2 < d0VarArr.length; i2++) {
                    remoteInputArr[i2] = d0.a(d0VarArr[i2]);
                }
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                d.c(a3, remoteInput);
            }
        }
        Bundle bundle2 = pVar.a;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        boolean z = pVar.d;
        bundle.putBoolean("android.support.allowGeneratedReplies", z);
        int i3 = Build.VERSION.SDK_INT;
        g.a(a3, z);
        int i4 = pVar.f;
        bundle.putInt("android.support.action.semanticAction", i4);
        if (i3 >= 28) {
            i.b(a3, i4);
        }
        if (i3 >= 29) {
            j.c(a3, pVar.g);
        }
        if (i3 >= 31) {
            k.a(a3, pVar.k);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", pVar.e);
        d.b(a3, bundle);
        d.a(this.b, d.d(a3));
    }
}
