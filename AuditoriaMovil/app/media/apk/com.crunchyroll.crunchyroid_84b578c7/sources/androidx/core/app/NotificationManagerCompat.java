package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.amazon.aps.iva.a.a;
import com.amazon.aps.iva.c3.n;
import com.amazon.aps.iva.c3.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static j sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* loaded from: classes.dex */
    public static class a {
        public static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications == null) {
                return new ArrayList();
            }
            return Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* loaded from: classes.dex */
    public static class g {
    }

    /* loaded from: classes.dex */
    public static class h implements k {
        public final String a;
        public final int b;
        public final String c;
        public final Notification d;

        public h(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.k
        public final void a(com.amazon.aps.iva.a.a aVar) throws RemoteException {
            aVar.l0(this.a, this.b, this.c, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            return defpackage.b.c(sb, this.c, "]");
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public final ComponentName a;
        public final IBinder b;

        public i(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static class j implements Handler.Callback, ServiceConnection {
        public final Context b;
        public final Handler c;
        public final HashMap d = new HashMap();
        public Set<String> e = new HashSet();

        /* loaded from: classes.dex */
        public static class a {
            public final ComponentName a;
            public com.amazon.aps.iva.a.a c;
            public boolean b = false;
            public final ArrayDeque<k> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public j(Context context) {
            this.b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z;
            boolean isLoggable = Log.isLoggable(NotificationManagerCompat.TAG, 3);
            ComponentName componentName = aVar.a;
            ArrayDeque<k> arrayDeque = aVar.d;
            if (isLoggable) {
                Objects.toString(componentName);
                arrayDeque.size();
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.b) {
                z = true;
            } else {
                Intent component = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
                Context context = this.b;
                boolean bindService = context.bindService(component, this, 33);
                aVar.b = bindService;
                if (bindService) {
                    aVar.e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z = aVar.b;
            }
            if (z && aVar.c != null) {
                while (true) {
                    k peek = arrayDeque.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            peek.toString();
                        }
                        peek.a(aVar.c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Objects.toString(componentName);
                        }
                    } catch (RemoteException unused2) {
                        Objects.toString(componentName);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(aVar);
                    return;
                }
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.c;
            ComponentName componentName = aVar.a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = aVar.e + 1;
            aVar.e = i;
            if (i > 6) {
                ArrayDeque<k> arrayDeque = aVar.d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
                return;
            }
            int i2 = (1 << (i - 1)) * NotificationManagerCompat.SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS;
            Log.isLoggable(NotificationManagerCompat.TAG, 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i2);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            HashMap hashMap = this.d;
            com.amazon.aps.iva.a.a aVar = null;
            Context context = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        a aVar2 = (a) hashMap.get((ComponentName) message.obj);
                        if (aVar2 != null) {
                            a(aVar2);
                        }
                        return true;
                    }
                    a aVar3 = (a) hashMap.get((ComponentName) message.obj);
                    if (aVar3 != null) {
                        if (aVar3.b) {
                            context.unbindService(this);
                            aVar3.b = false;
                        }
                        aVar3.c = null;
                    }
                    return true;
                }
                i iVar = (i) message.obj;
                a aVar4 = (a) hashMap.get(iVar.a);
                if (aVar4 != null) {
                    int i2 = a.AbstractBinderC0091a.a;
                    IBinder iBinder = iVar.b;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(com.amazon.aps.iva.a.a.c);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof com.amazon.aps.iva.a.a)) {
                            aVar = (com.amazon.aps.iva.a.a) queryLocalInterface;
                        } else {
                            aVar = new a.AbstractBinderC0091a.C0092a(iBinder);
                        }
                    }
                    aVar4.c = aVar;
                    aVar4.e = 0;
                    a(aVar4);
                }
                return true;
            }
            k kVar = (k) message.obj;
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
            if (!enabledListenerPackages.equals(this.e)) {
                this.e = enabledListenerPackages;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                HashSet hashSet = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!hashMap.containsKey(componentName2)) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Objects.toString(componentName2);
                        }
                        hashMap.put(componentName2, new a(componentName2));
                    }
                }
                Iterator it2 = hashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Objects.toString(entry.getKey());
                        }
                        a aVar5 = (a) entry.getValue();
                        if (aVar5.b) {
                            context.unbindService(this);
                            aVar5.b = false;
                        }
                        aVar5.c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar6 : hashMap.values()) {
                aVar6.d.add(kVar);
                a(aVar6);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.c.obtainMessage(1, new i(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(com.amazon.aps.iva.a.a aVar) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(k kVar) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new j(this.mContext.getApplicationContext());
            }
            sSideChannelManager.c.obtainMessage(0, kVar).sendToTarget();
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean(EXTRA_USE_SIDE_CHANNEL)) {
            return true;
        }
        return false;
    }

    public boolean areNotificationsEnabled() {
        return b.a(this.mNotificationManager);
    }

    public boolean canUseFullScreenIntent() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            return true;
        }
        if (i2 < 34) {
            if (this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0) {
                return true;
            }
            return false;
        }
        return f.a(this.mNotificationManager);
    }

    public void cancel(int i2) {
        cancel(null, i2);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        c.a(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannelGroup(o oVar) {
        int i2 = Build.VERSION.SDK_INT;
        NotificationChannelGroup a2 = o.a.a(oVar.a, oVar.b);
        if (i2 >= 28) {
            o.b.c(a2, oVar.c);
        }
        createNotificationChannelGroup(a2);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        c.c(this.mNotificationManager, list);
    }

    public void createNotificationChannelGroupsCompat(List<o> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (o oVar : list) {
                int i2 = Build.VERSION.SDK_INT;
                NotificationChannelGroup a2 = o.a.a(oVar.a, oVar.b);
                if (i2 >= 28) {
                    o.b.c(a2, oVar.c);
                }
                arrayList.add(a2);
            }
            c.c(this.mNotificationManager, arrayList);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        c.d(this.mNotificationManager, list);
    }

    public void createNotificationChannelsCompat(List<n> list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (n nVar : list) {
                arrayList.add(nVar.a());
            }
            c.d(this.mNotificationManager, arrayList);
        }
    }

    public void deleteNotificationChannel(String str) {
        c.e(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(String str) {
        c.f(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel notificationChannel : c.k(this.mNotificationManager)) {
            if (!collection.contains(c.g(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(notificationChannel)))) {
                c.e(this.mNotificationManager, c.g(notificationChannel));
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return a.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return a.b(this.mNotificationManager);
    }

    public int getImportance() {
        return b.b(this.mNotificationManager);
    }

    public NotificationChannel getNotificationChannel(String str) {
        return c.i(this.mNotificationManager, str);
    }

    public n getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new n(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(this.mNotificationManager, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
            if (c.h(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public o getNotificationChannelGroupCompat(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
            if (notificationChannelGroup != null) {
                return new o(notificationChannelGroup);
            }
            return null;
        }
        NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
        if (notificationChannelGroup2 != null) {
            return new o(notificationChannelGroup2, getNotificationChannels());
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return c.j(this.mNotificationManager);
    }

    public List<o> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> notificationChannels;
        int i2 = Build.VERSION.SDK_INT;
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (!notificationChannelGroups.isEmpty()) {
            if (i2 >= 28) {
                notificationChannels = Collections.emptyList();
            } else {
                notificationChannels = getNotificationChannels();
            }
            ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
            for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                if (Build.VERSION.SDK_INT >= 28) {
                    arrayList.add(new o(notificationChannelGroup));
                } else {
                    arrayList.add(new o(notificationChannelGroup, notificationChannels));
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        return c.k(this.mNotificationManager);
    }

    public List<n> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (!notificationChannels.isEmpty()) {
            ArrayList arrayList = new ArrayList(notificationChannels.size());
            for (NotificationChannel notificationChannel : notificationChannels) {
                arrayList.add(new n(notificationChannel));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void notify(int i2, Notification notification) {
        notify(null, i2, notification);
    }

    public void cancel(String str, int i2) {
        this.mNotificationManager.cancel(str, i2);
    }

    public void createNotificationChannel(n nVar) {
        createNotificationChannel(nVar.a());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return e.a(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    public void notify(String str, int i2, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new h(this.mContext.getPackageName(), i2, str, notification));
            this.mNotificationManager.cancel(str, i2);
            return;
        }
        this.mNotificationManager.notify(str, i2, notification);
    }

    public n getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new n(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        c.b(this.mNotificationManager, notificationChannelGroup);
    }

    public void notify(List<g> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).getClass();
            notify(null, 0, null);
        }
    }
}
