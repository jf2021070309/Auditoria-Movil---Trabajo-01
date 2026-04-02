package com.kwad.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.i;
import com.kwad.sdk.service.ServiceProvider;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import net.hockeyapp.android.LoginActivity;
/* loaded from: classes3.dex */
public final class x {
    private static volatile boolean aIO;
    private static AtomicInteger aIN = new AtomicInteger(0);
    private static volatile boolean aGV = false;

    private static int Id() {
        com.kwad.sdk.service.a.f fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class);
        if (fVar == null) {
            com.kwad.sdk.core.e.c.w("Ks_UnionHelper", "sdkConfigProvider == null");
            return 0;
        }
        int xG = fVar.xG();
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "config mode:" + xG);
        return xG;
    }

    private static void Ie() {
        if (aGV) {
            return;
        }
        aIN.set(Ih());
        aIO = bb.m("kssdk_kv_mode", "downgrade", false);
        aGV = true;
    }

    public static void If() {
        if (Ii() || Id() == 0) {
            return;
        }
        g.execute(new Runnable() { // from class: com.kwad.sdk.utils.x.3
            @Override // java.lang.Runnable
            public final void run() {
                com.kwad.sdk.utils.b.a Ig = x.Ig();
                if (Ig == null) {
                    return;
                }
                x.c(Ig);
                com.kwad.sdk.utils.b.b bVar = (com.kwad.sdk.utils.b.b) ServiceProvider.get(com.kwad.sdk.utils.b.b.class);
                if (bVar != null) {
                    bVar.a(Ig);
                }
            }
        });
    }

    public static com.kwad.sdk.utils.b.a Ig() {
        Map<String, ?> all;
        com.kwad.sdk.utils.b.a aVar = new com.kwad.sdk.utils.b.a();
        SharedPreferences fI = bb.fI("ksadsdk_kv_perf");
        if (fI == null) {
            return null;
        }
        try {
            all = fI.getAll();
        } catch (Throwable th) {
        }
        if (all == null) {
            return null;
        }
        int i = 0;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            i += ((Integer) entry.getValue()).intValue();
        }
        aVar.aLK = i;
        SharedPreferences.Editor edit = fI.edit();
        for (Map.Entry<String, ?> entry2 : all.entrySet()) {
            edit.putInt(entry2.getKey(), 0);
        }
        edit.apply();
        d(aVar);
        e(aVar);
        return aVar;
    }

    private static int Ih() {
        int c = bb.c("kssdk_kv_mode", LoginActivity.EXTRA_MODE, 0);
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "local mode:" + c);
        return c;
    }

    public static boolean Ii() {
        Ie();
        return aIN.get() == 0;
    }

    private static boolean Ij() {
        return Build.VERSION.SDK_INT > 23;
    }

    private static int Ik() {
        Ie();
        int Id = (aIO || !Ij()) ? 0 : Id();
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "targetMode:" + Id);
        return Id;
    }

    public static void Il() {
        Ie();
        int i = aIN.get();
        int Ik = Ik();
        boolean z = i != Ik;
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "needTransfer:" + z);
        if (z) {
            transfer(Ik);
        }
    }

    private static void Im() {
        g.execute(new Runnable() { // from class: com.kwad.sdk.utils.x.4
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                try {
                    context = y.getContext();
                } catch (Exception e) {
                    com.kwad.sdk.core.e.c.e("Ks_UnionHelper", Log.getStackTraceString(e));
                }
                if (context == null) {
                    return;
                }
                for (String str : i.a.ahl) {
                    x.N(context, str);
                }
                x.dc(0);
                x.aIN.set(0);
            }
        });
    }

    private static void In() {
        com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "transferToKv");
        g.execute(new Runnable() { // from class: com.kwad.sdk.utils.x.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context = y.getContext();
                    if (context != null) {
                        for (String str : i.a.ahl) {
                            x.M(context, str);
                        }
                        x.dc(1);
                        x.aIN.set(1);
                    }
                } catch (Exception e) {
                    com.kwad.sdk.core.e.c.e("Ks_UnionHelper", Log.getStackTraceString(e));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Context context, String str) {
        SharedPreferences fI;
        com.kwad.sdk.utils.a.c at = com.kwad.sdk.utils.a.e.at(context, str);
        if ("ksadsdk_splash_preload_id_list".equals(str) && (fI = bb.fI(str)) == null) {
            SharedPreferences.Editor edit = fI.edit();
            if (edit != null) {
                edit.remove("kv_to_sp_transfer_flag").remove("sp_to_kv_transfer_flag").apply();
            }
        } else if (at.contains("sp_to_kv_transfer_flag")) {
        } else {
            SharedPreferences fI2 = bb.fI(str);
            if (fI2 == null) {
                at.putBoolean("sp_to_kv_transfer_flag", true);
                return;
            }
            at.putAll(fI2.getAll());
            at.putBoolean("sp_to_kv_transfer_flag", true);
            bb.ao(str, "kv_to_sp_transfer_flag");
            a(str, at);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Context context, String str) {
        SharedPreferences fI = bb.fI(str);
        if (fI == null) {
            return;
        }
        if ("ksadsdk_splash_preload_id_list".equals(str)) {
            SharedPreferences.Editor edit = fI.edit();
            if (edit != null) {
                edit.remove("kv_to_sp_transfer_flag").remove("sp_to_kv_transfer_flag").apply();
            }
        } else if (fI.contains("kv_to_sp_transfer_flag")) {
        } else {
            com.kwad.sdk.utils.a.c at = com.kwad.sdk.utils.a.e.at(context, str);
            Map<String, Object> all = at.getAll();
            if (all.isEmpty()) {
                bb.l(str, "kv_to_sp_transfer_flag", true);
                return;
            }
            bb.a(str, all);
            bb.l(str, "kv_to_sp_transfer_flag", true);
            at.remove("sp_to_kv_transfer_flag");
            at.release();
        }
    }

    private static void a(String str, com.kwad.sdk.utils.a.c cVar) {
        if (i.a.ahm.contains(str)) {
            return;
        }
        cVar.release();
    }

    public static void am(final String str, final String str2) {
        g.execute(new Runnable() { // from class: com.kwad.sdk.utils.x.1
            @Override // java.lang.Runnable
            public final void run() {
                int c = bb.c("ksadsdk_kv_perf", str, 0);
                if (TextUtils.isEmpty(str2)) {
                    bb.ao("ksadsdk_kv_perf", str);
                    return;
                }
                bb.b("ksadsdk_kv_perf", str, c + 1);
            }
        });
    }

    public static void an(final String str, final String str2) {
        g.execute(new Runnable() { // from class: com.kwad.sdk.utils.x.2
            @Override // java.lang.Runnable
            public final void run() {
                SharedPreferences fI = bb.fI("ksadsdk_kv_perf");
                if (fI != null && fI.contains(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        bb.b("ksadsdk_kv_perf_failed", str, bb.c("ksadsdk_kv_perf_failed", str, 0) + 1);
                        return;
                    }
                    bb.b("ksadsdk_kv_perf_success", str, bb.c("ksadsdk_kv_perf_success", str, 0) + 1);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.kwad.sdk.utils.b.a aVar) {
        if (aVar.aLL / (aVar.aLL + aVar.aLM) > 0.10000000149011612d) {
            aIO = true;
            com.kwad.sdk.core.e.c.d("Ks_UnionHelper", "need downgrade");
            bb.l("kssdk_kv_mode", "downgrade", true);
        }
        if (aIO) {
            Il();
        }
    }

    private static void d(com.kwad.sdk.utils.b.a aVar) {
        SharedPreferences fI = bb.fI("ksadsdk_kv_perf_failed");
        int i = 0;
        if (fI == null) {
            aVar.aLL = 0;
            return;
        }
        Map<String, ?> all = fI.getAll();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                i += ((Integer) entry.getValue()).intValue();
            }
        }
        aVar.aLL = i;
        SharedPreferences.Editor edit = fI.edit();
        edit.clear();
        edit.apply();
    }

    static void dc(int i) {
        bb.b("kssdk_kv_mode", LoginActivity.EXTRA_MODE, i);
    }

    private static void e(com.kwad.sdk.utils.b.a aVar) {
        SharedPreferences fI = bb.fI("ksadsdk_kv_perf_success");
        int i = 0;
        if (fI == null) {
            aVar.aLM = 0;
            return;
        }
        Map<String, ?> all = fI.getAll();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                i += ((Integer) entry.getValue()).intValue();
            }
        }
        aVar.aLM = i;
        SharedPreferences.Editor edit = fI.edit();
        edit.clear();
        edit.apply();
    }

    private static void transfer(int i) {
        if (i == 0) {
            Im();
        } else if (i == 1) {
            In();
        }
    }
}
