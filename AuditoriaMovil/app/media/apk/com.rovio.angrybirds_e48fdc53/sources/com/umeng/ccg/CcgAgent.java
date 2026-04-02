package com.umeng.ccg;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class CcgAgent {
    private static Object lock = new Object();
    private static ArrayList<ConfigListener> callbacks = new ArrayList<>();

    public static void init(Context context) {
        c.a().a(context);
    }

    public static void registerConfigListener(ConfigListener configListener) {
        if (configListener != null) {
            synchronized (lock) {
                callbacks.add(configListener);
            }
        }
    }

    public static void notifyConfigReady(JSONObject jSONObject) {
        synchronized (lock) {
            int size = callbacks.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    callbacks.get(i).onConfigReady(jSONObject);
                }
            }
        }
    }
}
