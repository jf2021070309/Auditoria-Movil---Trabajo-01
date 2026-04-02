package com.bytedance.pangle.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.pangle.ComponentManager;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.pangle.plugin.PluginManager;
import com.bytedance.pangle.transform.ZeusTransformUtils;
import com.bytedance.pangle.util.FieldUtils;
import com.bytedance.pangle.util.MethodUtils;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(b bVar, Bundle bundle) {
        String str;
        List<String> list;
        if (!Zeus.hasInit()) {
            Log.e(ZeusLogger.TAG_INIT, "ProxyActivityUtils.onCreate finish. AppApplication == null.");
            bVar.zeusSuperOnCreate(null);
            bVar.finish();
            return;
        }
        Intent intent = bVar.getIntent();
        String pluginPkgName = bVar.getPluginPkgName();
        Plugin plugin = bVar.getPlugin();
        intent.setExtrasClassLoader(plugin.mClassLoader);
        IntentUtils.a(intent);
        String stringExtra = intent.getStringExtra("targetPlugin");
        if (TextUtils.isEmpty(stringExtra) && (list = ComponentManager.stubActivity2TargetActivities.get(bVar.getClass().getName())) != null && list.size() == 1) {
            stringExtra = list.get(0);
            intent.putExtra("targetPlugin", stringExtra);
        }
        if (!plugin.isLoaded() || TextUtils.isEmpty(stringExtra)) {
            try {
                bVar.zeusSuperOnCreate(null);
                ZeusLogger.w(ZeusLogger.TAG_ACTIVITY, "Cant start pluginActivity, plugin load failed! pluginPkgName: " + pluginPkgName + " targetActivity: " + stringExtra);
                bVar.finish();
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        ActivityInfo activityInfo = plugin.pluginActivities.get(stringExtra);
        if (activityInfo == null) {
            ZeusLogger.w(ZeusLogger.TAG_ACTIVITY, "Have you declared " + stringExtra + " in plugin's AndroidManifest.xml!");
            bVar.zeusSuperOnCreate(null);
            bVar.finish();
        }
        int i = -1;
        try {
            IPluginActivity iPluginActivity = (IPluginActivity) plugin.mClassLoader.loadClass(stringExtra).newInstance();
            FieldUtils.writeField(iPluginActivity, "mApplication", bVar.getApplication());
            bVar.setTargetActivity(iPluginActivity);
            iPluginActivity.setPluginProxyActivity(bVar, plugin);
            i = activityInfo.theme;
            bVar.zeusSuperSetTheme(i);
            TypedArray obtainStyledAttributes = ((Activity) bVar).getTheme().obtainStyledAttributes(new int[]{16842840});
            if (obtainStyledAttributes.getBoolean(obtainStyledAttributes.getIndex(0), false)) {
                a((Activity) bVar);
            }
            obtainStyledAttributes.recycle();
            iPluginActivity.attachBaseContext(bVar.getBaseContext());
            try {
                if (((Activity) bVar).getRequestedOrientation() != activityInfo.screenOrientation) {
                    ((Activity) bVar).setRequestedOrientation(activityInfo.screenOrientation);
                }
            } catch (IllegalStateException e2) {
            }
            iPluginActivity.onCreate(bundle);
        } catch (Exception e3) {
            if (!(e3 instanceof IllegalStateException)) {
                str = "";
            } else {
                str = "activityTheme:".concat(String.valueOf(i));
            }
            throw new RuntimeException(str, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(b bVar, Context context) {
        if (!Zeus.hasInit()) {
            Log.e(ZeusLogger.TAG_INIT, "ProxyActivityUtils.attachBaseContext. AppApplication == null.");
            bVar.zeusSuperAttachBaseContext(context);
            return;
        }
        String pluginPkgName = bVar.getPluginPkgName();
        boolean loadPlugin = PluginManager.getInstance().loadPlugin(pluginPkgName);
        try {
            bVar.setPlugin(PluginManager.getInstance().getPlugin(pluginPkgName));
            if (loadPlugin) {
                bVar.zeusSuperAttachBaseContext(ZeusTransformUtils.wrapperContext(context, pluginPkgName));
                FieldUtils.writeField(bVar, "mResources", (Object) null);
                return;
            }
            bVar.zeusSuperAttachBaseContext(context);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, View view) {
        Object readField;
        if (view == null) {
            return;
        }
        try {
            Object readField2 = FieldUtils.readField(view, "mListenerInfo");
            if (readField2 != null && (readField = FieldUtils.readField(readField2, "mOnClickListener")) != null) {
                String name = readField.getClass().getName();
                if (name.startsWith(AppCompatViewInflater.class.getName()) || name.startsWith(View.class.getName())) {
                    view.setOnClickListener(new a(activity, view.getId(), (String) FieldUtils.readField(readField, "mMethodName")));
                }
            }
        } catch (Exception e) {
            ZeusLogger.errReport(ZeusLogger.TAG_ACTIVITY, "checkOnClickListener failed!".concat(String.valueOf(view)));
            e.printStackTrace();
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    a(activity, viewGroup.getChildAt(i));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private static Class a() {
        Class<?>[] declaredClasses;
        Class<?> cls = null;
        for (Class<?> cls2 : Activity.class.getDeclaredClasses()) {
            if (cls2.getSimpleName().contains("TranslucentConversionListener")) {
                cls = cls2;
            }
        }
        return cls;
    }

    private static void a(Activity activity) {
        try {
            MethodUtils.getAccessibleMethod(Activity.class, "convertToTranslucent", a(), ActivityOptions.class).invoke(activity, null, MethodUtils.getAccessibleMethod(Activity.class, "getActivityOptions", new Class[0]).invoke(activity, new Object[0]));
        } catch (Throwable th) {
        }
    }
}
