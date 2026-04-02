package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.a;
import com.amazon.aps.iva.v4.p0;
import com.amazon.aps.iva.v4.s;
import com.amazon.aps.iva.v4.w;
import com.amazon.aps.iva.v4.w.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.amazon.aps.iva.v4.a<MessageType, BuilderType> {
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected l1 unknownFields = l1.f;
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0782a<MessageType, BuilderType> {
        public final MessageType b;
        public MessageType c;
        public boolean d = false;

        public a(MessageType messagetype) {
            this.b = messagetype;
            this.c = (MessageType) messagetype.f(f.NEW_MUTABLE_INSTANCE);
        }

        public static void f(w wVar, w wVar2) {
            a1 a1Var = a1.c;
            a1Var.getClass();
            a1Var.a(wVar.getClass()).mergeFrom(wVar, wVar2);
        }

        @Override // com.amazon.aps.iva.v4.q0
        public final w a() {
            return this.b;
        }

        public final MessageType c() {
            MessageType d = d();
            if (d.isInitialized()) {
                return d;
            }
            throw new j1();
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.b;
            messagetype.getClass();
            a aVar = (a) messagetype.f(f.NEW_BUILDER);
            MessageType d = d();
            aVar.e();
            f(aVar.c, d);
            return aVar;
        }

        public final MessageType d() {
            if (this.d) {
                return this.c;
            }
            MessageType messagetype = this.c;
            messagetype.getClass();
            a1 a1Var = a1.c;
            a1Var.getClass();
            a1Var.a(messagetype.getClass()).makeImmutable(messagetype);
            this.d = true;
            return this.c;
        }

        public final void e() {
            if (this.d) {
                MessageType messagetype = (MessageType) this.c.f(f.NEW_MUTABLE_INSTANCE);
                f(messagetype, this.c);
                this.c = messagetype;
                this.d = false;
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class b<T extends w<T, ?>> extends com.amazon.aps.iva.v4.b<T> {
        public b(T t) {
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements q0 {
        protected s<d> extensions = s.d;

        @Override // com.amazon.aps.iva.v4.w, com.amazon.aps.iva.v4.q0
        public final w a() {
            return (w) f(f.GET_DEFAULT_INSTANCE);
        }

        @Override // com.amazon.aps.iva.v4.w, com.amazon.aps.iva.v4.p0
        public final a newBuilderForType() {
            return (a) f(f.NEW_BUILDER);
        }

        @Override // com.amazon.aps.iva.v4.w, com.amazon.aps.iva.v4.p0
        public final a toBuilder() {
            a aVar = (a) f(f.NEW_BUILDER);
            aVar.e();
            a.f(aVar.c, this);
            return aVar;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends p0, Type> extends com.amazon.aps.iva.v4.f {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <T extends w<?, ?>> T g(Class<T> cls) {
        w<?, ?> wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (wVar == null) {
            w wVar2 = (w) o1.b(cls);
            wVar2.getClass();
            wVar = (T) wVar2.f(f.GET_DEFAULT_INSTANCE);
            if (wVar != null) {
                defaultInstanceMap.put(cls, wVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static <T extends w<T, ?>> T i(T t, i iVar, o oVar) throws z {
        T t2 = (T) t.f(f.NEW_MUTABLE_INSTANCE);
        try {
            a1 a1Var = a1.c;
            a1Var.getClass();
            e1 a2 = a1Var.a(t2.getClass());
            j jVar = iVar.d;
            if (jVar == null) {
                jVar = new j(iVar);
            }
            a2.b(t2, jVar, oVar);
            a2.makeImmutable(t2);
            return t2;
        } catch (z e2) {
            if (e2.b) {
                throw new z(e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof z) {
                throw ((z) e3.getCause());
            }
            throw new z(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof z) {
                throw ((z) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends w<?, ?>> void j(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // com.amazon.aps.iva.v4.q0
    public w a() {
        return (w) f(f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.amazon.aps.iva.v4.p0
    public final void b(k kVar) throws IOException {
        a1 a1Var = a1.c;
        a1Var.getClass();
        e1 a2 = a1Var.a(getClass());
        l lVar = kVar.a;
        if (lVar == null) {
            lVar = new l(kVar);
        }
        a2.a(this, lVar);
    }

    @Override // com.amazon.aps.iva.v4.a
    final int c() {
        return this.memoizedSerializedSize;
    }

    @Override // com.amazon.aps.iva.v4.a
    final void e(int i) {
        this.memoizedSerializedSize = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a1 a1Var = a1.c;
        a1Var.getClass();
        return a1Var.a(getClass()).equals(this, (w) obj);
    }

    public abstract Object f(f fVar);

    @Override // com.amazon.aps.iva.v4.p0
    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            a1 a1Var = a1.c;
            a1Var.getClass();
            this.memoizedSerializedSize = a1Var.a(getClass()).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        a1 a1Var = a1.c;
        a1Var.getClass();
        int hashCode = a1Var.a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.amazon.aps.iva.v4.q0
    public final boolean isInitialized() {
        byte byteValue = ((Byte) f(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        a1 a1Var = a1.c;
        a1Var.getClass();
        boolean isInitialized = a1Var.a(getClass()).isInitialized(this);
        f(f.SET_MEMOIZED_IS_INITIALIZED);
        return isInitialized;
    }

    @Override // com.amazon.aps.iva.v4.p0
    public a newBuilderForType() {
        return (a) f(f.NEW_BUILDER);
    }

    @Override // com.amazon.aps.iva.v4.p0
    public a toBuilder() {
        a aVar = (a) f(f.NEW_BUILDER);
        aVar.e();
        a.f(aVar.c, this);
        return aVar;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        r0.c(this, sb, 0);
        return sb.toString();
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static final class d implements s.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // com.amazon.aps.iva.v4.s.b
        public final a d(p0.a aVar, p0 p0Var) {
            a aVar2 = (a) aVar;
            aVar2.e();
            a.f(aVar2.c, (w) p0Var);
            return aVar2;
        }

        @Override // com.amazon.aps.iva.v4.s.b
        public final s1 getLiteJavaType() {
            throw null;
        }

        @Override // com.amazon.aps.iva.v4.s.b
        public final void getLiteType() {
        }

        @Override // com.amazon.aps.iva.v4.s.b
        public final void getNumber() {
        }

        @Override // com.amazon.aps.iva.v4.s.b
        public final void isPacked() {
        }

        @Override // com.amazon.aps.iva.v4.s.b
        public final void isRepeated() {
        }
    }
}
