package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.bykvm_19do;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.d s;
    private Application a;
    private Context b;
    private String g;
    private long h;
    private String i;
    private long j;
    private String k;
    private long l;
    private String m;
    private long n;
    private String o;
    private long p;
    private int q;
    private List<String> c = new ArrayList();
    private List<Long> d = new ArrayList();
    private List<String> e = new ArrayList();
    private List<Long> f = new ArrayList();
    private final Application.ActivityLifecycleCallbacks r = new a();

    /* loaded from: classes.dex */
    class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            b.this.g = b.s == null ? activity.getClass().getName() : b.s.a(activity);
            b.this.h = System.currentTimeMillis();
            b.this.c.add(b.this.g);
            b.this.d.add(Long.valueOf(b.this.h));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            String name = b.s == null ? activity.getClass().getName() : b.s.a(activity);
            int indexOf = b.this.c.indexOf(name);
            if (indexOf > -1 && indexOf < b.this.c.size()) {
                b.this.c.remove(indexOf);
                b.this.d.remove(indexOf);
            }
            b.this.e.add(name);
            b.this.f.add(Long.valueOf(System.currentTimeMillis()));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            b.this.m = b.s == null ? activity.getClass().getName() : b.s.a(activity);
            b.this.n = System.currentTimeMillis();
            b.h(b.this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b.this.k = b.s == null ? activity.getClass().getName() : b.s.a(activity);
            b.this.l = System.currentTimeMillis();
            b.g(b.this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            b.this.i = b.s == null ? activity.getClass().getName() : b.s.a(activity);
            b.this.j = System.currentTimeMillis();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            b.this.o = b.s == null ? activity.getClass().getName() : b.s.a(activity);
            b.this.p = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.b = context;
        if (context instanceof Application) {
            this.a = (Application) context;
        }
        f();
    }

    private JSONObject a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.c;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.c.size(); i++) {
                try {
                    jSONArray.put(a(this.c.get(i), this.d.get(i).longValue()));
                } catch (Throwable th) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray e() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.e;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    jSONArray.put(a(this.e.get(i), this.f.get(i).longValue()));
                } catch (Throwable th) {
                }
            }
        }
        return jSONArray;
    }

    private void f() {
        Application application;
        if (Build.VERSION.SDK_INT < 14 || (application = this.a) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this.r);
    }

    static /* synthetic */ int g(b bVar) {
        int i = bVar.q;
        bVar.q = i + 1;
        return i;
    }

    static /* synthetic */ int h(b bVar) {
        int i = bVar.q;
        bVar.q = i - 1;
        return i;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.g, this.h));
            jSONObject.put("last_start_activity", a(this.i, this.j));
            jSONObject.put("last_resume_activity", a(this.k, this.l));
            jSONObject.put("last_pause_activity", a(this.m, this.n));
            jSONObject.put("last_stop_activity", a(this.o, this.p));
            jSONObject.put("alive_activities", d());
            jSONObject.put("finish_activities", e());
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public JSONArray b() {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        JSONArray jSONArray = new JSONArray();
        try {
            ActivityManager activityManager = (ActivityManager) this.b.getSystemService(TTDownloadField.TT_ACTIVITY);
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(5)) != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    if (runningTaskInfo != null && runningTaskInfo.baseActivity != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", runningTaskInfo.id);
                            jSONObject.put(bg.o, runningTaskInfo.baseActivity.getPackageName());
                            jSONObject.put("description", runningTaskInfo.description);
                            jSONObject.put("number_of_activities", runningTaskInfo.numActivities);
                            jSONObject.put("number_of_running_activities", runningTaskInfo.numRunning);
                            jSONObject.put("topActivity", runningTaskInfo.topActivity.toString());
                            jSONObject.put("baseActivity", runningTaskInfo.baseActivity.toString());
                            jSONArray.put(jSONObject);
                        } catch (JSONException e) {
                        }
                    }
                }
            }
        } catch (Exception e2) {
        }
        return jSONArray;
    }
}
