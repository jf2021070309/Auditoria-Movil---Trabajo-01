package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class Component<T> {
    private final Set<Class<? super T>> a;
    private final Set<Dependency> b;
    private final int c;
    private final ComponentFactory<T> d;
    private final Set<Class<?>> e;

    /* synthetic */ Component(Set set, Set set2, int i, ComponentFactory componentFactory, Set set3, byte b) {
        this(set, set2, i, componentFactory, set3);
    }

    private Component(Set<Class<? super T>> set, Set<Dependency> set2, int i, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = componentFactory;
        this.e = Collections.unmodifiableSet(set3);
    }

    public final Set<Class<? super T>> zza() {
        return this.a;
    }

    public final Set<Dependency> zzb() {
        return this.b;
    }

    public final ComponentFactory<T> zzc() {
        return this.d;
    }

    public final Set<Class<?>> zzd() {
        return this.e;
    }

    public final boolean zze() {
        return this.c == 1;
    }

    public final boolean zzf() {
        return this.c == 2;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0], (byte) 0);
    }

    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object b(Object obj) {
        return obj;
    }

    @Deprecated
    public static <T> Component<T> of(Class<T> cls, T t) {
        return builder(cls).factory(b.a(t)).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Object obj) {
        return obj;
    }

    @SafeVarargs
    public static <T> Component<T> of(T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(c.a(t)).build();
    }

    /* loaded from: classes2.dex */
    public static class Builder<T> {
        private final Set<Class<? super T>> a;
        private final Set<Dependency> b;
        private int c;
        private ComponentFactory<T> d;
        private Set<Class<?>> e;

        /* synthetic */ Builder(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.e = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            this.a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            Preconditions.checkArgument(!this.a.contains(dependency.zza()), "Components are not allowed to depend on interfaces they themselves provide.");
            this.b.add(dependency);
            return this;
        }

        public Builder<T> alwaysEager() {
            return a(1);
        }

        public Builder<T> eagerInDefaultApp() {
            return a(2);
        }

        public Builder<T> publishes(Class<?> cls) {
            this.e.add(cls);
            return this;
        }

        private Builder<T> a(int i) {
            Preconditions.checkState(this.c == 0, "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.d = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Component<T> build() {
            Preconditions.checkState(this.d != null, "Missing required property: factory.");
            return new Component<>(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, (byte) 0);
        }
    }

    /* renamed from: com.google.firebase.components.Component$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1<T> {
        private final T a;
        private final e<T> b;

        public static AnonymousClass1<Context> zza(Context context) {
            return new AnonymousClass1<>(context, new d((byte) 0));
        }

        private AnonymousClass1(T t, e<T> eVar) {
            this.a = t;
            this.b = eVar;
        }

        public List<ComponentRegistrar> zza() {
            return b(this.b.a(this.a));
        }

        private static List<ComponentRegistrar> b(List<String> list) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                try {
                    Class<?> cls = Class.forName(str);
                    if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                    } else {
                        arrayList.add((ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    }
                } catch (ClassNotFoundException e) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str), e);
                } catch (IllegalAccessException e2) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e2);
                } catch (InstantiationException e3) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", str), e3);
                } catch (NoSuchMethodException e4) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e4);
                } catch (InvocationTargetException e5) {
                    Log.w("ComponentDiscovery", String.format("Could not instantiate %s", str), e5);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static List<Component<?>> a(List<Component<?>> list) {
            f fVar;
            HashMap hashMap = new HashMap(list.size());
            for (Component<?> component : list) {
                f fVar2 = new f(component);
                for (Class<? super Object> cls : component.zza()) {
                    if (hashMap.put(cls, fVar2) != null) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            }
            for (f fVar3 : hashMap.values()) {
                for (Dependency dependency : fVar3.b().zzb()) {
                    if (dependency.zzc() && (fVar = (f) hashMap.get(dependency.zza())) != null) {
                        fVar3.a(fVar);
                        fVar.b(fVar3);
                    }
                }
            }
            HashSet<f> hashSet = new HashSet(hashMap.values());
            Set<f> a = a(hashSet);
            ArrayList arrayList = new ArrayList();
            while (!a.isEmpty()) {
                f next = a.iterator().next();
                a.remove(next);
                arrayList.add(next.b());
                for (f fVar4 : next.a()) {
                    fVar4.c(next);
                    if (fVar4.c()) {
                        a.add(fVar4);
                    }
                }
            }
            if (arrayList.size() == list.size()) {
                Collections.reverse(arrayList);
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            for (f fVar5 : hashSet) {
                if (!fVar5.c() && !fVar5.d()) {
                    arrayList2.add(fVar5.b());
                }
            }
            throw new DependencyCycleException(arrayList2);
        }

        private static Set<f> a(Set<f> set) {
            HashSet hashSet = new HashSet();
            for (f fVar : set) {
                if (fVar.c()) {
                    hashSet.add(fVar);
                }
            }
            return hashSet;
        }
    }
}
