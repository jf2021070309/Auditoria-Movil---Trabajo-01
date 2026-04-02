package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: f  reason: collision with root package name */
    private static AppLovinBroadcastManager f3768f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f3769g = new Object();
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Receiver, ArrayList<b>> f3770b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f3771c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f3772d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f3773e = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    };

    /* loaded from: classes.dex */
    public interface Receiver {
        void onReceive(Context context, Intent intent, Map<String, Object> map);
    }

    /* loaded from: classes.dex */
    public static class a {
        public final Intent a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, Object> f3774b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f3775c;

        public a(Intent intent, Map<String, Object> map, List<b> list) {
            this.a = intent;
            this.f3774b = map;
            this.f3775c = list;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final IntentFilter a;

        /* renamed from: b  reason: collision with root package name */
        public final Receiver f3776b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3777c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3778d;

        public b(IntentFilter intentFilter, Receiver receiver) {
            this.a = intentFilter;
            this.f3776b = receiver;
        }
    }

    private AppLovinBroadcastManager(Context context) {
        this.a = context;
    }

    private List<b> a(Intent intent) {
        synchronized (this.f3770b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = this.f3771c.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList<b> arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.f3777c && bVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList3.add(bVar);
                    bVar.f3777c = true;
                    arrayList2 = arrayList3;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            for (b bVar2 : arrayList2) {
                bVar2.f3777c = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.f3770b) {
                size = this.f3772d.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f3772d.toArray(aVarArr);
                this.f3772d.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = aVarArr[i2];
                if (aVar != null) {
                    for (b bVar : aVar.f3775c) {
                        if (bVar != null && !bVar.f3778d) {
                            bVar.f3776b.onReceive(this.a, aVar.a, aVar.f3774b);
                        }
                    }
                }
            }
        }
    }

    public static AppLovinBroadcastManager getInstance(Context context) {
        AppLovinBroadcastManager appLovinBroadcastManager;
        synchronized (f3769g) {
            if (f3768f == null) {
                f3768f = new AppLovinBroadcastManager(context.getApplicationContext());
            }
            appLovinBroadcastManager = f3768f;
        }
        return appLovinBroadcastManager;
    }

    public void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        synchronized (this.f3770b) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = this.f3770b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f3770b.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                ArrayList<b> arrayList2 = this.f3771c.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f3771c.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (this.f3770b) {
            List<b> a2 = a(intent);
            if (a2 == null) {
                return false;
            }
            this.f3772d.add(new a(intent, map, a2));
            if (!this.f3773e.hasMessages(1)) {
                this.f3773e.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> a2 = a(intent);
        if (a2 == null) {
            return;
        }
        for (b bVar : a2) {
            if (!bVar.f3778d) {
                bVar.f3776b.onReceive(this.a, intent, map);
            }
        }
    }

    public void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            a();
        }
    }

    public boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public void unregisterReceiver(Receiver receiver) {
        synchronized (this.f3770b) {
            ArrayList<b> remove = this.f3770b.remove(receiver);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                bVar.f3778d = true;
                Iterator<String> actionsIterator = bVar.a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    ArrayList<b> arrayList = this.f3771c.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().f3776b == receiver) {
                                bVar.f3778d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f3771c.remove(next);
                        }
                    }
                }
            }
        }
    }
}
