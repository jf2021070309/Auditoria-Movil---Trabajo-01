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
    private static AppLovinBroadcastManager f;
    private static final Object g = new Object();
    private final Context a;
    private final HashMap<Receiver, ArrayList<b>> b = new HashMap<>();
    private final HashMap<String, ArrayList<b>> c = new HashMap<>();
    private final ArrayList<a> d = new ArrayList<>();
    private final Handler e = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        final Intent a;
        final Map<String, Object> b;
        final List<b> c;

        a(Intent intent, Map<String, Object> map, List<b> list) {
            this.a = intent;
            this.b = map;
            this.c = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        final IntentFilter a;
        final Receiver b;
        boolean c;
        boolean d;

        b(IntentFilter intentFilter, Receiver receiver) {
            this.a = intentFilter;
            this.b = receiver;
        }
    }

    private AppLovinBroadcastManager(Context context) {
        this.a = context;
    }

    private List<b> a(Intent intent) {
        synchronized (this.b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = this.c.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList<b> arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.c && bVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList3.add(bVar);
                    bVar.c = true;
                    arrayList2 = arrayList3;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            for (b bVar2 : arrayList2) {
                bVar2.c = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.b) {
                size = this.d.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.d.toArray(aVarArr);
                this.d.clear();
            }
            for (int i = 0; i < size; i++) {
                a aVar = aVarArr[i];
                if (aVar != null) {
                    for (b bVar : aVar.c) {
                        if (bVar != null && !bVar.d) {
                            bVar.b.onReceive(this.a, aVar.a, aVar.b);
                        }
                    }
                }
            }
        }
    }

    public static AppLovinBroadcastManager getInstance(Context context) {
        AppLovinBroadcastManager appLovinBroadcastManager;
        synchronized (g) {
            if (f == null) {
                f = new AppLovinBroadcastManager(context.getApplicationContext());
            }
            appLovinBroadcastManager = f;
        }
        return appLovinBroadcastManager;
    }

    public void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = this.b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.b.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                ArrayList<b> arrayList2 = this.c.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.c.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (this.b) {
            List<b> a2 = a(intent);
            if (a2 == null) {
                return false;
            }
            this.d.add(new a(intent, map, a2));
            if (!this.e.hasMessages(1)) {
                this.e.sendEmptyMessage(1);
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
            if (!bVar.d) {
                bVar.b.onReceive(this.a, intent, map);
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
        synchronized (this.b) {
            ArrayList<b> remove = this.b.remove(receiver);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                bVar.d = true;
                Iterator<String> actionsIterator = bVar.a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    ArrayList<b> arrayList = this.c.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().b == receiver) {
                                bVar.d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.c.remove(next);
                        }
                    }
                }
            }
        }
    }
}
