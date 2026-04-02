package com.kwad.sdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.kwad.sdk.collector.AppStatusRules;
import com.kwad.sdk.collector.c;
import com.kwad.sdk.core.threads.GlobalThreadPools;
import com.kwad.sdk.service.ServiceProvider;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class f {
    private static Handler VK;
    private static Messenger aHT;
    private static volatile ExecutorService aHU;
    private static volatile AppStatusRules aHV;
    private static WeakReference<Context> aHW;
    private static com.kwad.sdk.collector.h aHX;
    private static ServiceConnection aqs = new ServiceConnection() { // from class: com.kwad.sdk.utils.f.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Messenger messenger = new Messenger(iBinder);
                Message obtain = Message.obtain();
                obtain.what = 100;
                if (!f.access$000()) {
                    com.kwad.sdk.core.e.c.w("AppStatusHelper", "clientMessenger init error");
                    return;
                }
                obtain.replyTo = f.aHT;
                try {
                    messenger.send(obtain);
                } catch (RemoteException e) {
                }
            } catch (SecurityException e2) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e2);
                com.kwad.sdk.service.c.gatherException(e2);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.kwad.sdk.utils.f$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context jB;

        AnonymousClass2(Context context) {
            this.jB = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.kwad.sdk.collector.c.a(this.jB, new c.a() { // from class: com.kwad.sdk.utils.f.2.1
                @Override // com.kwad.sdk.collector.c.a
                public final void b(AppStatusRules appStatusRules) {
                    appStatusRules.initStatus(AnonymousClass2.this.jB);
                    AppStatusRules unused = f.aHV = appStatusRules;
                    f.b(AnonymousClass2.this.jB, f.aHV);
                    f.bJ(AnonymousClass2.this.jB);
                    boolean dn = be.dn(AnonymousClass2.this.jB);
                    boolean isAppStatusTargetNotEmpty = AppStatusRules.isAppStatusTargetNotEmpty(f.aHV);
                    com.kwad.sdk.core.e.c.d("AppStatusHelper", "appStatusTargetNotEmpty: " + isAppStatusTargetNotEmpty + ", permissionGranted: " + dn);
                    if (dn && isAppStatusTargetNotEmpty) {
                        long obtainDefaultScanInterval = f.aHV.obtainDefaultScanInterval();
                        if (obtainDefaultScanInterval > 0) {
                            f.c(AnonymousClass2.this.jB, obtainDefaultScanInterval);
                        } else {
                            f.bL(AnonymousClass2.this.jB);
                        }
                    }
                    boolean isUploadTargetNotEmpty = AppStatusRules.isUploadTargetNotEmpty(f.aHV);
                    boolean z = f.aHV.obtainUploadConfigFileMaxSize() > 0;
                    com.kwad.sdk.core.e.c.d("AppStatusHelper", "uploadTargetNotEmpty: " + isUploadTargetNotEmpty + ", enableUpload: " + z);
                    if (isUploadTargetNotEmpty && z && dn) {
                        f.HF();
                        f.aHU.submit(new Runnable() { // from class: com.kwad.sdk.utils.f.2.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    com.kwad.sdk.collector.j.a(AnonymousClass2.this.jB, f.aHV);
                                } catch (Throwable th) {
                                    com.kwad.sdk.service.c.gatherException(th);
                                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                                }
                            }
                        });
                    }
                }

                @Override // com.kwad.sdk.collector.c.a
                public final void k(int i, String str) {
                    com.kwad.sdk.core.e.c.e("AppStatusHelper", "fetchAppStatusConfig onFetchError: " + str + ", code: " + i);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class a implements com.kwad.sdk.core.b {
        private List<Long> aId = new ArrayList();
        private String appName;
        private String packageName;

        public a() {
        }

        private a(String str, String str2) {
            this.appName = str;
            this.packageName = str2;
        }

        public static JSONArray F(List<com.kwad.sdk.collector.model.b> list) {
            List<a> list2;
            try {
                list2 = G(list);
            } catch (Exception e) {
                com.kwad.sdk.service.c.gatherException(e);
                list2 = null;
            }
            if (list2 == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (a aVar : list2) {
                jSONArray.put(aVar.toJson());
            }
            return jSONArray;
        }

        private static List<a> G(List<com.kwad.sdk.collector.model.b> list) {
            a aVar;
            if (list != null && list.size() != 0) {
                HashMap hashMap = new HashMap();
                try {
                    for (com.kwad.sdk.collector.model.b bVar : list) {
                        String b = com.kwad.sdk.collector.model.c.b(bVar);
                        if (hashMap.containsKey(b)) {
                            aVar = (a) hashMap.get(b);
                        } else {
                            a aVar2 = new a(com.kwad.sdk.collector.model.c.a(bVar), com.kwad.sdk.collector.model.c.b(bVar));
                            hashMap.put(b, aVar2);
                            aVar = aVar2;
                        }
                        long c = com.kwad.sdk.collector.model.c.c(bVar) / 1000;
                        if (aVar != null) {
                            aVar.ar(c);
                        }
                    }
                    return new ArrayList(hashMap.values());
                } catch (ClassCastException e) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                }
            }
            return null;
        }

        private void ar(long j) {
            this.aId.add(Long.valueOf(j));
        }

        @Override // com.kwad.sdk.core.b
        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.appName = jSONObject.optString("appName");
            this.packageName = jSONObject.optString(DBDefinition.PACKAGE_NAME);
            JSONArray optJSONArray = jSONObject.optJSONArray("runningTimes");
            if (optJSONArray != null) {
                this.aId.clear();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        this.aId.add(Long.valueOf(optJSONArray.getLong(i)));
                    } catch (JSONException e) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                    }
                }
            }
        }

        @Override // com.kwad.sdk.core.b
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            t.putValue(jSONObject, "appName", this.appName);
            t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, this.packageName);
            JSONArray jSONArray = new JSONArray();
            for (Long l : this.aId) {
                jSONArray.put(l.longValue());
            }
            t.putValue(jSONObject, "runningTimes", jSONArray);
            return jSONObject;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void q(List<com.kwad.sdk.collector.model.b> list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        private static void H(List<a> list) {
            if (list == null) {
                return;
            }
            f.aHX.c(t.I(list));
        }

        private static void b(ArrayList<com.kwad.sdk.collector.model.b> arrayList) {
            JSONArray F;
            if (arrayList == null || (F = a.F(arrayList)) == null) {
                return;
            }
            f.aHX.c(F);
        }

        private void c(Message message) {
            ArrayList arrayList;
            List list;
            Bundle data = message.getData();
            List<AppStatusRules.Strategy> list2 = null;
            if (data != null) {
                try {
                    if (data.containsKey("resultJson")) {
                        list = t.a(data.getString("resultJson"), new com.kwad.sdk.core.c<a>() { // from class: com.kwad.sdk.utils.f.c.1
                            private static a HO() {
                                return new a();
                            }

                            @Override // com.kwad.sdk.core.c
                            public final /* synthetic */ a yS() {
                                return HO();
                            }
                        });
                        arrayList = null;
                    } else {
                        arrayList = (ArrayList) data.getSerializable(ShareConstants.WEB_DIALOG_PARAM_DATA);
                        list = null;
                    }
                } catch (Throwable th) {
                    arrayList = null;
                    list = null;
                }
                if (arrayList != null) {
                    com.kwad.sdk.core.e.c.d("AppStatusHelper", "ClientHandler: handleMessage data size: " + arrayList.size());
                    b(arrayList);
                }
                if (list != null) {
                    H(list);
                }
            }
            if (f.aHW != null && f.aHW.get() != null && data != null) {
                if (data.containsKey("allStrategyJson")) {
                    String string = data.getString("allStrategyJson");
                    if (string != null) {
                        list2 = t.a(string, new com.kwad.sdk.core.c<AppStatusRules.Strategy>() { // from class: com.kwad.sdk.utils.f.c.2
                            private static AppStatusRules.Strategy HP() {
                                return new AppStatusRules.Strategy();
                            }

                            @Override // com.kwad.sdk.core.c
                            public final /* synthetic */ AppStatusRules.Strategy yS() {
                                return HP();
                            }
                        });
                    }
                } else {
                    list2 = (ArrayList) data.getSerializable("allStrategy");
                }
                if (list2 != null) {
                    for (AppStatusRules.Strategy strategy : list2) {
                        long needSaveLaunchTime = strategy.getNeedSaveLaunchTime();
                        if (needSaveLaunchTime >= 0) {
                            com.kwad.sdk.collector.i.a((Context) f.aHW.get(), strategy, needSaveLaunchTime);
                        }
                    }
                }
            }
            if (f.aHW == null || f.aqs == null) {
                return;
            }
            com.kwad.sdk.core.e.c.d("AppStatusHelper", "unbindASService");
            com.kwad.sdk.collector.b.a.b((Context) f.aHW.get(), f.aqs);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 101) {
                return;
            }
            try {
                c(message);
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d implements b {
        private b aIf = null;

        public d(b bVar) {
        }

        @Override // com.kwad.sdk.utils.f.b
        public final void q(List<com.kwad.sdk.collector.model.b> list) {
            JSONArray F = a.F(list);
            if (F != null) {
                f.aHX.c(F);
            }
            b bVar = this.aIf;
            if (bVar != null) {
                bVar.q(list);
            }
        }
    }

    private static List<com.kwad.sdk.collector.model.b> E(List<com.kwad.sdk.collector.model.b> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    public static AppStatusRules HD() {
        return aHV;
    }

    private static boolean HE() {
        if (aHT == null) {
            try {
                aHT = new Messenger(new c(Looper.getMainLooper()));
            } catch (Throwable th) {
            }
        }
        return aHT != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void HF() {
        if (aHU == null) {
            synchronized (f.class) {
                if (aHU == null) {
                    ExecutorService CX = GlobalThreadPools.CX();
                    aHU = CX;
                    com.kwad.sdk.core.threads.c.a((ThreadPoolExecutor) CX, "appStatusHelper");
                }
            }
        }
    }

    private static boolean HG() {
        try {
            Class<?> cls = Class.forName("com.kwad.sdk.api.proxy.app.ServiceProxyRemote");
            if (cls != null) {
                Context context = ServiceProvider.getContext();
                return context.getPackageManager().queryIntentServices(new Intent(context, cls), 65536).size() > 0;
            }
        } catch (ClassNotFoundException e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
        return false;
    }

    private static List<com.kwad.sdk.collector.model.b> a(AppStatusRules.Strategy strategy) {
        boolean isNeedLaunch = strategy.isNeedLaunch();
        com.kwad.sdk.core.e.c.d("AppStatusHelper", "analysisByFile, strategy: " + strategy.getName() + ", needLaunch: " + isNeedLaunch);
        return !isNeedLaunch ? new ArrayList() : com.kwad.sdk.collector.b.yB().a(strategy);
    }

    public static void a(Context context, long j, com.kwad.sdk.collector.h hVar) {
        if (at.Je() || com.kwad.sdk.core.config.d.Q(8192L) || context == null || com.kwad.sdk.utils.c.bH(context)) {
            return;
        }
        aHX = hVar;
        boolean isInMainProcess = SystemUtil.isInMainProcess(context);
        com.kwad.sdk.core.e.c.d("AppStatusHelper", "isMainProcess: " + isInMainProcess);
        if (isInMainProcess) {
            aHW = new WeakReference<>(context);
            if (VK == null) {
                VK = new Handler(Looper.getMainLooper());
            }
            VK.postDelayed(new AnonymousClass2(context), 30000L);
        }
    }

    public static void a(final Context context, final b bVar) {
        if (context == null || at.Je() || com.kwad.sdk.core.config.d.Q(8192L) || com.kwad.sdk.utils.c.bH(context)) {
            return;
        }
        HF();
        aHU.submit(new Runnable() { // from class: com.kwad.sdk.utils.f.4
            @Override // java.lang.Runnable
            public final void run() {
                List bM;
                try {
                    HashSet hashSet = new HashSet();
                    if (!be.dn(context) || (bM = f.bM(context)) == null) {
                        return;
                    }
                    Iterator it = bM.iterator();
                    while (it.hasNext()) {
                        com.kwad.sdk.core.e.c.d("AppStatusHelper", "AppRunningInfo: " + ((com.kwad.sdk.collector.model.b) it.next()));
                    }
                    hashSet.addAll(bM);
                    if (bVar != null) {
                        bVar.q(new ArrayList(hashSet));
                    }
                } catch (Throwable th) {
                    com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    com.kwad.sdk.service.c.gatherException(th);
                }
            }
        });
    }

    static /* synthetic */ boolean access$000() {
        return HE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, AppStatusRules appStatusRules) {
        File file = new File(context.getFilesDir(), "LOCAL_APP_STATUS_RULES_JSON");
        String jSONObject = appStatusRules.toJson().toString();
        if (TextUtils.isEmpty(jSONObject)) {
            return;
        }
        com.kwad.sdk.crash.utils.h.k(file.getAbsolutePath(), com.kwad.sdk.core.a.c.cR(jSONObject), false);
    }

    public static void bJ(Context context) {
        if (aHV == null) {
            aHV = bK(context);
        }
    }

    private static AppStatusRules bK(Context context) {
        File file = new File(context.getFilesDir(), "LOCAL_APP_STATUS_RULES_JSON");
        if (file.exists()) {
            try {
                String I = com.kwad.sdk.crash.utils.h.I(file);
                if (TextUtils.isEmpty(I)) {
                    return null;
                }
                if (com.kwad.sdk.core.a.c.cT(I)) {
                    I = com.kwad.sdk.core.a.c.cS(I);
                }
                JSONObject jSONObject = new JSONObject(I);
                AppStatusRules appStatusRules = new AppStatusRules();
                appStatusRules.parseJson(jSONObject);
                return appStatusRules;
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bL(Context context) {
        if (context == null) {
            return;
        }
        boolean HG = HG();
        com.kwad.sdk.core.e.c.d("AppStatusHelper", "isServiceAvailable: " + HG);
        if (HG) {
            com.kwad.sdk.collector.b.a.a(context, aqs);
        } else {
            a(context, new d(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<com.kwad.sdk.collector.model.b> bM(Context context) {
        if (be.dn(context)) {
            if (aHV == null) {
                aHV = bK(context);
            }
            return bN(context);
        }
        return new ArrayList();
    }

    private static List<com.kwad.sdk.collector.model.b> bN(Context context) {
        ArrayList arrayList = new ArrayList();
        if (at.Je() || com.kwad.sdk.core.config.d.Q(8192L) || com.kwad.sdk.utils.c.bH(context)) {
            return arrayList;
        }
        AppStatusRules HD = HD();
        for (AppStatusRules.Strategy strategy : com.kwad.sdk.collector.i.c(HD)) {
            arrayList.addAll(a(strategy));
            strategy.setNeedSaveLaunchTime(System.currentTimeMillis());
        }
        AppStatusRules.Strategy d2 = com.kwad.sdk.collector.i.d(HD);
        arrayList.addAll(a(d2));
        d2.setNeedSaveLaunchTime(System.currentTimeMillis());
        return E(arrayList);
    }

    public static void c(final Context context, final long j) {
        if (VK == null) {
            VK = new Handler(Looper.getMainLooper());
        }
        VK.post(new Runnable() { // from class: com.kwad.sdk.utils.f.3
            @Override // java.lang.Runnable
            public final void run() {
                f.bL(context);
                f.VK.postDelayed(this, j);
            }
        });
    }
}
