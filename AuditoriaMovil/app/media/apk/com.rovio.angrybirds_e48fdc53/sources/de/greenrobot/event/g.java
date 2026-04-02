package de.greenrobot.event;

import android.util.Log;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class g {
    private static final Map<String, List<f>> a = new HashMap();
    private static final Map<Class<?>, Class<?>> b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<f> a(Class<?> cls, String str) {
        List<f> list;
        Method[] methods;
        ThreadMode threadMode;
        String str2 = cls.getName() + '.' + str;
        synchronized (a) {
            list = a.get(str2);
        }
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (Class<? super Object> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                String name = cls2.getName();
                if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                    break;
                }
                for (Method method : cls2.getMethods()) {
                    String name2 = method.getName();
                    if (name2.startsWith(str)) {
                        int modifiers = method.getModifiers();
                        if ((modifiers & 1) != 0 && (modifiers & DownloadErrorCode.ERROR_CHUNK_COUNT_ERROR) == 0) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 1) {
                                String substring = name2.substring(str.length());
                                if (substring.length() == 0) {
                                    threadMode = ThreadMode.PostThread;
                                } else if (substring.equals("MainThread")) {
                                    threadMode = ThreadMode.MainThread;
                                } else if (substring.equals("BackgroundThread")) {
                                    threadMode = ThreadMode.BackgroundThread;
                                } else if (substring.equals("Async")) {
                                    threadMode = ThreadMode.Async;
                                } else if (!b.containsKey(cls2)) {
                                    throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                                }
                                Class<?> cls3 = parameterTypes[0];
                                sb.setLength(0);
                                sb.append(name2);
                                sb.append('>').append(cls3.getName());
                                if (hashSet.add(sb.toString())) {
                                    arrayList.add(new f(method, threadMode, cls3));
                                }
                            } else {
                                continue;
                            }
                        } else if (!b.containsKey(cls2)) {
                            Log.d(EventBus.TAG, "Skipping method (not public, static or abstract): " + cls2 + "." + name2);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                throw new EventBusException("Subscriber " + cls + " has no public methods called " + str);
            }
            synchronized (a) {
                a.put(str2, arrayList);
            }
            return arrayList;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        synchronized (a) {
            a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class<?> cls) {
        if (!a.isEmpty()) {
            throw new IllegalStateException("This method must be called before registering anything");
        }
        b.put(cls, cls);
    }

    public static void b() {
        b.clear();
    }
}
