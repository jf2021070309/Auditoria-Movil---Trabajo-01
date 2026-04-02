package com.amazon.aps.iva.i5;

import com.amazon.aps.iva.ee0.f1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: Lifecycling.kt */
/* loaded from: classes.dex */
public final class r {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static androidx.lifecycle.d a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            com.amazon.aps.iva.yb0.j.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (androidx.lifecycle.d) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r4 != null) {
                    str = r4.getName();
                } else {
                    str = "";
                }
                com.amazon.aps.iva.yb0.j.e(str, "fullPackage");
                if (str.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    com.amazon.aps.iva.yb0.j.e(canonicalName, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    canonicalName = canonicalName.substring(str.length() + 1);
                    com.amazon.aps.iva.yb0.j.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                com.amazon.aps.iva.yb0.j.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = com.amazon.aps.iva.oe0.m.f0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = b;
            if (constructor != null) {
                hashMap2.put(cls, f1.J(constructor));
            } else {
                androidx.lifecycle.b bVar = androidx.lifecycle.b.c;
                HashMap hashMap3 = bVar.b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (((androidx.lifecycle.l) declaredMethods[i2].getAnnotation(androidx.lifecycle.l.class)) != null) {
                                    bVar.a(cls, declaredMethods);
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && n.class.isAssignableFrom(superclass)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        com.amazon.aps.iva.yb0.j.e(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            com.amazon.aps.iva.yb0.j.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    com.amazon.aps.iva.yb0.j.e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && n.class.isAssignableFrom(cls2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                com.amazon.aps.iva.yb0.j.e(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                com.amazon.aps.iva.yb0.j.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}
