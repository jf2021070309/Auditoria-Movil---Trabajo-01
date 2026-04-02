package com.me.game.pmadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public class Observers<T> {
    protected List<T> mListeners = new ArrayList();
    protected Map<Object, List<T>> mActionMap = new ConcurrentHashMap();
    protected Map<T, List<Object>> mValueToKey = new ConcurrentHashMap();
    protected Map<String, List<T>> mContentMap = new ConcurrentHashMap();

    /* loaded from: classes6.dex */
    public interface DoClass<T> {
        void run(T t);
    }

    private boolean isEmpty() {
        return this.mListeners.isEmpty();
    }

    public boolean checkExit(List listeners, T l) {
        Iterator<T> iterator = listeners.iterator();
        while (iterator.hasNext()) {
            T wr = iterator.next();
            if (wr == null) {
                iterator.remove();
            } else if (l == wr) {
                return true;
            }
        }
        return false;
    }

    public synchronized void addListener(T t) {
        if (checkExit(this.mListeners, t)) {
            return;
        }
        this.mListeners.add(t);
    }

    public synchronized void removeListener(T t) {
        removeListener((List<List<T>>) this.mListeners, (List<T>) t);
    }

    public synchronized void removeListener(List<T> list, T t) {
        try {
            Iterator<T> iterator = list.iterator();
            while (iterator.hasNext()) {
                T wr = iterator.next();
                if (wr == null) {
                    iterator.remove();
                } else if (t == wr) {
                    iterator.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected synchronized void addListener(List<T> listeners, T t) {
        if (checkExit(listeners, t)) {
            return;
        }
        listeners.add(t);
    }

    protected synchronized void addListener(Object o, T t) {
        List<T> list = this.mActionMap.get(o);
        if (list == null) {
            list = new ArrayList();
            this.mActionMap.put(o, list);
        }
        addListener((List<List<T>>) list, (List<T>) t);
    }

    public synchronized void addListener(Context context, Object o, T t) {
        addListener(o, t);
        String key = SystemUtils.getContext(context).toString();
        List<Object> objects = this.mValueToKey.get(t);
        if (objects == null) {
            objects = new ArrayList();
            this.mValueToKey.put(t, objects);
        }
        objects.add(o);
        List<T> tList = this.mContentMap.get(key);
        if (tList == null) {
            tList = new ArrayList();
            this.mContentMap.put(key, tList);
        }
        tList.add(t);
    }

    public synchronized void removeListener(Object o, T t) {
        if (o != null) {
            if (!TextUtils.isEmpty(o.toString())) {
                List<T> list = this.mActionMap.get(o);
                if (list != null) {
                    removeListener((List<List<T>>) list, (List<T>) t);
                    if (list.isEmpty()) {
                        this.mActionMap.remove(o);
                    }
                }
            }
        }
    }

    public void clear() {
        this.mListeners.clear();
        this.mActionMap.clear();
    }

    public void clear(Object o) {
        List<T> list = this.mActionMap.remove(o);
        if (list != null) {
            list.clear();
        }
    }

    private void invokeMethod_(Object o, Class cls, Method method, Object... values) {
        if (cls == Object.class) {
            return;
        }
        try {
            Method method_ = cls.getDeclaredMethod(method.getName(), method.getParameterTypes());
            method_.invoke(o, values);
        } catch (Exception e) {
            e.printStackTrace();
            invokeMethod_(o, cls.getSuperclass(), method, values);
        }
    }

    public void clearContextListener(Activity context) {
        String key = context.toString();
        List<T> listeners = this.mContentMap.remove(key);
        if (listeners != null) {
            for (T t : listeners) {
                this.mListeners.remove(t);
                List<Object> objects = this.mValueToKey.remove(t);
                if (objects != null) {
                    for (Object o : objects) {
                        List<T> tList = this.mActionMap.get(o);
                        if (tList != null) {
                            tList.remove(t);
                            if (tList.isEmpty()) {
                                this.mActionMap.remove(o);
                            }
                        } else {
                            this.mActionMap.remove(o);
                        }
                    }
                    objects.clear();
                }
            }
        }
    }

    public static <T> void execuRunnable(Collection<T> list, DoClass<T> runnable) {
        if (list == null) {
            return;
        }
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            try {
                T wr = iterator.next();
                if (wr == null) {
                    iterator.remove();
                } else {
                    try {
                        runnable.run(wr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
            }
        }
    }

    public static boolean checkNull(Reference t) {
        return (t == null || t.get() == null) ? false : true;
    }

    public static boolean checkNull(Object t) {
        return t != null;
    }

    protected List<T> getList(Object o) {
        List<T> tList = this.mActionMap.get(o);
        if (tList == null) {
            return new ArrayList<>();
        }
        return tList;
    }

    public void clearAll() {
    }
}
