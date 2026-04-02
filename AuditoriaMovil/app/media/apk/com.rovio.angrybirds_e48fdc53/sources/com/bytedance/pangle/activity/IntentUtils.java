package com.bytedance.pangle.activity;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.pangle.Zeus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes.dex */
public class IntentUtils {
    static HashMap<Long, WeakReference<Bundle>> a = new HashMap<>();

    public static void setUseMemory(Intent intent) {
        intent.putExtra("pangle_use_memory", System.currentTimeMillis());
    }

    public static void a(Intent intent, String str) {
        long longExtra = intent.getLongExtra("pangle_use_memory", 0L);
        if (Zeus.getPlugin(str).mUseMemoryForActivityIntent && longExtra == 0) {
            longExtra = System.currentTimeMillis();
        }
        if (longExtra != 0) {
            Bundle extras = intent.getExtras();
            intent.replaceExtras((Bundle) null);
            a.put(Long.valueOf(longExtra), new WeakReference<>(extras));
            intent.putExtra("pangle_use_memory", longExtra);
        }
    }

    public static void a(Intent intent) {
        Bundle bundle;
        long longExtra = intent.getLongExtra("pangle_use_memory", 0L);
        if (longExtra == 0) {
            return;
        }
        WeakReference<Bundle> remove = a.remove(Long.valueOf(longExtra));
        if (remove != null) {
            bundle = remove.get();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
    }
}
