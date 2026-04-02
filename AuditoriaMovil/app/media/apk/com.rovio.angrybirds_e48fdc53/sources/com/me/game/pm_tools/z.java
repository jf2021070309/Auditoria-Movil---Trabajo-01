package com.me.game.pm_tools;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class z<T> {
    public List<T> a = new ArrayList();
    public Map<Object, List<T>> b = new ConcurrentHashMap();
    public Map<T, List<Object>> c = new ConcurrentHashMap();
    public Map<Context, List<T>> d = new ConcurrentHashMap();

    public static boolean d(Object obj) {
        return obj != null;
    }

    public static boolean e(Reference reference) {
        return (reference == null || reference.get() == null) ? false : true;
    }

    private void i(Object obj, Class cls, Method method, Object... objArr) {
        if (cls == Object.class) {
            return;
        }
        try {
            cls.getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj, objArr);
        } catch (Exception unused) {
            i(obj, cls.getSuperclass(), method, objArr);
        }
    }

    private boolean j() {
        return this.a.isEmpty();
    }

    public synchronized void a(T t) {
        if (c(this.a, t)) {
            return;
        }
        this.a.add(t);
    }

    public synchronized void b(List<T> list, T t) {
        if (c(list, t)) {
            return;
        }
        list.add(t);
    }

    public boolean c(List list, T t) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                it.remove();
            } else if (t == next) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        this.a.clear();
        this.b.clear();
    }

    public void g(Object obj) {
        List<T> remove = this.b.remove(obj);
        if (remove != null) {
            remove.clear();
        }
    }

    public void h(Context context) {
        List<T> remove = this.d.remove(context);
        if (remove != null) {
            for (T t : remove) {
                this.a.remove(t);
                List<Object> remove2 = this.c.remove(t);
                if (remove2 != null) {
                    for (Object obj : remove2) {
                        List<T> list = this.b.get(obj);
                        if (list != null) {
                            list.remove(t);
                            if (list.isEmpty()) {
                                this.b.remove(obj);
                            }
                        } else {
                            this.b.remove(obj);
                        }
                    }
                    remove2.clear();
                }
            }
        }
    }

    public synchronized void k(T t) {
        l(this.a, t);
    }

    public synchronized void l(List<T> list, T t) {
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next == null) {
                    it.remove();
                } else if (t == next) {
                    it.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
