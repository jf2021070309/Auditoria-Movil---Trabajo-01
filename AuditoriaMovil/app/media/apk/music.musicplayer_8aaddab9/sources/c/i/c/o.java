package c.i.c;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class o implements i {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f1986b;

    /* renamed from: c  reason: collision with root package name */
    public final m f1987c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f1988d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteViews f1989e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Bundle> f1990f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f1991g = new Bundle();

    public o(m mVar) {
        List<String> a;
        this.f1987c = mVar;
        this.a = mVar.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f1986b = new Notification.Builder(mVar.a, mVar.t);
        } else {
            this.f1986b = new Notification.Builder(mVar.a);
        }
        Notification notification = mVar.v;
        this.f1986b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar.f1976e).setContentText(mVar.f1977f).setContentInfo(null).setContentIntent(mVar.f1978g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon(mVar.f1979h).setNumber(mVar.f1980i).setProgress(0, 0, false);
        if (i2 < 21) {
            this.f1986b.setSound(notification.sound, notification.audioStreamType);
        }
        this.f1986b.setSubText(null).setUsesChronometer(mVar.f1983l).setPriority(mVar.f1981j);
        Iterator<j> it = mVar.f1973b.iterator();
        while (it.hasNext()) {
            j next = it.next();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 20) {
                IconCompat a2 = next.a();
                Notification.Action.Builder builder = i3 >= 23 ? new Notification.Action.Builder(a2 != null ? a2.i() : null, next.f1967j, next.f1968k) : new Notification.Action.Builder(a2 != null ? a2.c() : 0, next.f1967j, next.f1968k);
                s[] sVarArr = next.f1960c;
                if (sVarArr != null) {
                    int length = sVarArr.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    if (sVarArr.length > 0) {
                        s sVar = sVarArr[0];
                        throw null;
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        builder.addRemoteInput(remoteInputArr[i4]);
                    }
                }
                Bundle bundle = next.a != null ? new Bundle(next.a) : new Bundle();
                bundle.putBoolean("android.support.allowGeneratedReplies", next.f1962e);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 24) {
                    builder.setAllowGeneratedReplies(next.f1962e);
                }
                bundle.putInt("android.support.action.semanticAction", next.f1964g);
                if (i5 >= 28) {
                    builder.setSemanticAction(next.f1964g);
                }
                if (i5 >= 29) {
                    builder.setContextual(next.f1965h);
                }
                bundle.putBoolean("android.support.action.showsUserInterface", next.f1963f);
                builder.addExtras(bundle);
                this.f1986b.addAction(builder.build());
            } else {
                List<Bundle> list = this.f1990f;
                Notification.Builder builder2 = this.f1986b;
                Object obj = p.a;
                IconCompat a3 = next.a();
                builder2.addAction(a3 != null ? a3.c() : 0, next.f1967j, next.f1968k);
                Bundle bundle2 = new Bundle(next.a);
                s[] sVarArr2 = next.f1960c;
                if (sVarArr2 != null) {
                    bundle2.putParcelableArray("android.support.remoteInputs", p.b(sVarArr2));
                }
                s[] sVarArr3 = next.f1961d;
                if (sVarArr3 != null) {
                    bundle2.putParcelableArray("android.support.dataRemoteInputs", p.b(sVarArr3));
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", next.f1962e);
                list.add(bundle2);
            }
        }
        Bundle bundle3 = mVar.o;
        if (bundle3 != null) {
            this.f1991g.putAll(bundle3);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 20 && mVar.f1985n) {
            this.f1991g.putBoolean("android.support.localOnly", true);
        }
        this.f1988d = mVar.r;
        this.f1989e = mVar.s;
        this.f1986b.setShowWhen(mVar.f1982k);
        if (i6 < 21 && (a = a(b(mVar.f1974c), mVar.w)) != null && !a.isEmpty()) {
            this.f1991g.putStringArray("android.people", (String[]) a.toArray(new String[a.size()]));
        }
        if (i6 >= 20) {
            this.f1986b.setLocalOnly(mVar.f1985n).setGroup(null).setGroupSummary(false).setSortKey(null);
        }
        if (i6 >= 21) {
            this.f1986b.setCategory(null).setColor(mVar.p).setVisibility(mVar.q).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
            List<String> a4 = i6 < 28 ? a(b(mVar.f1974c), mVar.w) : mVar.w;
            if (a4 != null && !a4.isEmpty()) {
                for (String str : a4) {
                    this.f1986b.addPerson(str);
                }
            }
            if (mVar.f1975d.size() > 0) {
                if (mVar.o == null) {
                    mVar.o = new Bundle();
                }
                Bundle bundle4 = mVar.o.getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle(bundle4);
                Bundle bundle6 = new Bundle();
                for (int i7 = 0; i7 < mVar.f1975d.size(); i7++) {
                    String num = Integer.toString(i7);
                    j jVar = mVar.f1975d.get(i7);
                    Object obj2 = p.a;
                    Bundle bundle7 = new Bundle();
                    IconCompat a5 = jVar.a();
                    bundle7.putInt("icon", a5 != null ? a5.c() : 0);
                    bundle7.putCharSequence("title", jVar.f1967j);
                    bundle7.putParcelable("actionIntent", jVar.f1968k);
                    Bundle bundle8 = jVar.a != null ? new Bundle(jVar.a) : new Bundle();
                    bundle8.putBoolean("android.support.allowGeneratedReplies", jVar.f1962e);
                    bundle7.putBundle("extras", bundle8);
                    bundle7.putParcelableArray("remoteInputs", p.b(jVar.f1960c));
                    bundle7.putBoolean("showsUserInterface", jVar.f1963f);
                    bundle7.putInt("semanticAction", jVar.f1964g);
                    bundle6.putBundle(num, bundle7);
                }
                bundle4.putBundle("invisible_actions", bundle6);
                bundle5.putBundle("invisible_actions", bundle6);
                if (mVar.o == null) {
                    mVar.o = new Bundle();
                }
                mVar.o.putBundle("android.car.EXTENSIONS", bundle4);
                this.f1991g.putBundle("android.car.EXTENSIONS", bundle5);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            this.f1986b.setExtras(mVar.o).setRemoteInputHistory(null);
            RemoteViews remoteViews = mVar.r;
            if (remoteViews != null) {
                this.f1986b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = mVar.s;
            if (remoteViews2 != null) {
                this.f1986b.setCustomBigContentView(remoteViews2);
            }
        }
        if (i8 >= 26) {
            this.f1986b.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(mVar.t)) {
                this.f1986b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator<r> it2 = mVar.f1974c.iterator();
            while (it2.hasNext()) {
                Notification.Builder builder3 = this.f1986b;
                Objects.requireNonNull(it2.next());
                builder3.addPerson(new Person.Builder().setName(null).setIcon(null).setUri(null).setKey(null).setBot(false).setImportant(false).build());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1986b.setAllowSystemGeneratedContextualActions(mVar.u);
            this.f1986b.setBubbleMetadata(null);
        }
        c.i.a.L();
    }

    public static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        c.f.c cVar = new c.f.c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> b(List<r> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (r rVar : list) {
            Objects.requireNonNull(rVar);
            arrayList.add("");
        }
        return arrayList;
    }
}
