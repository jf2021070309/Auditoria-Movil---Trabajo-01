package com.braze.support;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J=\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u000e\"\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000fJC\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u000e\"\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u0013J?\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u000e\"\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u0014J9\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u00112\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/braze/support/ReflectionUtils;", "", "()V", "constructObjectQuietly", "classpath", "", "parameterTypes", "", "Ljava/lang/Class;", "args", "doesMethodExist", "", "className", "methodName", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Z", "getMethodQuietly", "Ljava/lang/reflect/Method;", "clazz", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "invokeMethodQuietly", "receiver", FirebaseAnalytics.Param.METHOD, "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed constructObjectQuietly";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed getMethodQuietly";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed getMethodQuietly";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed invokeMethodQuietly";
        }
    }

    private ReflectionUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object constructObjectQuietly$default(ReflectionUtils reflectionUtils, String str, List list, List list2, int i, Object obj) {
        int i2 = i & 2;
        z zVar = z.b;
        if (i2 != 0) {
            list = zVar;
        }
        if ((i & 4) != 0) {
            list2 = zVar;
        }
        return reflectionUtils.constructObjectQuietly(str, list, list2);
    }

    public static final boolean doesMethodExist(String str, String str2, Class<?>... clsArr) {
        j.f(str, "className");
        j.f(str2, "methodName");
        j.f(clsArr, "parameterTypes");
        if (getMethodQuietly(str, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)) != null) {
            return true;
        }
        return false;
    }

    public static final Method getMethodQuietly(Class<?> cls, String str, Class<?>... clsArr) {
        j.f(cls, "clazz");
        j.f(str, "methodName");
        j.f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.D, e, b.b);
            return null;
        }
    }

    public static final Object invokeMethodQuietly(Object obj, Method method, Object... objArr) {
        j.f(method, FirebaseAnalytics.Param.METHOD);
        j.f(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.D, e, d.b);
            return null;
        }
    }

    public final Object constructObjectQuietly(String str, List<? extends Class<?>> list, List<? extends Object> list2) {
        j.f(str, "classpath");
        j.f(list, "parameterTypes");
        j.f(list2, "args");
        try {
            Class<?> cls = Class.forName(str);
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            Constructor<?> constructor = cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Object[] array = list2.toArray(new Object[0]);
            return constructor.newInstance(Arrays.copyOf(array, array.length));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, a.b);
            return null;
        }
    }

    public static final Method getMethodQuietly(String str, String str2, Class<?>... clsArr) {
        j.f(str, "className");
        j.f(str2, "methodName");
        j.f(clsArr, "parameterTypes");
        try {
            return getMethodQuietly(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.D, e, c.b);
            return null;
        }
    }
}
