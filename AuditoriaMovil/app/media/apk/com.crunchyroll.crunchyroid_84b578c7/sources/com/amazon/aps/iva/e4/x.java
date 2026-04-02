package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.a;
import com.amazon.aps.iva.e4.q0;
import com.amazon.aps.iva.e4.t;
import com.amazon.aps.iva.e4.x;
import com.amazon.aps.iva.e4.x.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.amazon.aps.iva.e4.a<MessageType, BuilderType> {
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected o1 unknownFields = o1.f;
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0214a<MessageType, BuilderType> {
        public final MessageType b;
        public MessageType c;
        public boolean d = false;

        public a(MessageType messagetype) {
            this.b = messagetype;
            this.c = (MessageType) messagetype.f(f.NEW_MUTABLE_INSTANCE);
        }

        public static void f(x xVar, x xVar2) {
            c1 c1Var = c1.c;
            c1Var.getClass();
            c1Var.a(xVar.getClass()).mergeFrom(xVar, xVar2);
        }

        @Override // com.amazon.aps.iva.e4.r0
        public final x a() {
            return this.b;
        }

        public final MessageType c() {
            MessageType d = d();
            if (d.isInitialized()) {
                return d;
            }
            throw new m1();
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
            c1 c1Var = c1.c;
            c1Var.getClass();
            c1Var.a(messagetype.getClass()).makeImmutable(messagetype);
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
    public static class b<T extends x<T, ?>> extends com.amazon.aps.iva.e4.b<T> {
        public b(T t) {
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements r0 {
        protected t<d> extensions = t.d;

        @Override // com.amazon.aps.iva.e4.x, com.amazon.aps.iva.e4.r0
        public final x a() {
            return (x) f(f.GET_DEFAULT_INSTANCE);
        }

        @Override // com.amazon.aps.iva.e4.x, com.amazon.aps.iva.e4.q0
        public final a newBuilderForType() {
            return (a) f(f.NEW_BUILDER);
        }

        @Override // com.amazon.aps.iva.e4.x, com.amazon.aps.iva.e4.q0
        public final a toBuilder() {
            a aVar = (a) f(f.NEW_BUILDER);
            aVar.e();
            a.f(aVar.c, this);
            return aVar;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends q0, Type> extends g {
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

    public static <T extends x<?, ?>> T g(Class<T> cls) {
        x<?, ?> xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (xVar == null) {
            x xVar2 = (x) r1.a(cls);
            xVar2.getClass();
            xVar = (T) xVar2.f(f.GET_DEFAULT_INSTANCE);
            if (xVar != null) {
                defaultInstanceMap.put(cls, xVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) xVar;
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

    public static <T extends x<T, ?>> T i(T t, j jVar, p pVar) throws a0 {
        T t2 = (T) t.f(f.NEW_MUTABLE_INSTANCE);
        try {
            c1 c1Var = c1.c;
            c1Var.getClass();
            g1 a2 = c1Var.a(t2.getClass());
            k kVar = jVar.d;
            if (kVar == null) {
                kVar = new k(jVar);
            }
            a2.a(t2, kVar, pVar);
            a2.makeImmutable(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof a0) {
                throw ((a0) e2.getCause());
            }
            throw new a0(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof a0) {
                throw ((a0) e3.getCause());
            }
            throw e3;
        }
    }

    public static <T extends x<?, ?>> void j(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // com.amazon.aps.iva.e4.r0
    public x a() {
        return (x) f(f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.amazon.aps.iva.e4.q0
    public final void b(l lVar) throws IOException {
        c1 c1Var = c1.c;
        c1Var.getClass();
        g1 a2 = c1Var.a(getClass());
        m mVar = lVar.a;
        if (mVar == null) {
            mVar = new m(lVar);
        }
        a2.b(this, mVar);
    }

    @Override // com.amazon.aps.iva.e4.a
    final int c() {
        return this.memoizedSerializedSize;
    }

    @Override // com.amazon.aps.iva.e4.a
    final void e(int i) {
        this.memoizedSerializedSize = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((x) f(f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        c1 c1Var = c1.c;
        c1Var.getClass();
        return c1Var.a(getClass()).equals(this, (x) obj);
    }

    public abstract Object f(f fVar);

    @Override // com.amazon.aps.iva.e4.q0
    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            c1 c1Var = c1.c;
            c1Var.getClass();
            this.memoizedSerializedSize = c1Var.a(getClass()).getSerializedSize(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        c1 c1Var = c1.c;
        c1Var.getClass();
        int hashCode = c1Var.a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.amazon.aps.iva.e4.r0
    public final boolean isInitialized() {
        byte byteValue = ((Byte) f(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        c1 c1Var = c1.c;
        c1Var.getClass();
        boolean isInitialized = c1Var.a(getClass()).isInitialized(this);
        f(f.SET_MEMOIZED_IS_INITIALIZED);
        return isInitialized;
    }

    @Override // com.amazon.aps.iva.e4.q0
    public a newBuilderForType() {
        return (a) f(f.NEW_BUILDER);
    }

    @Override // com.amazon.aps.iva.e4.q0
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
        s0.c(this, sb, 0);
        return sb.toString();
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes.dex */
    public static final class d implements t.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // com.amazon.aps.iva.e4.t.b
        public final a g(q0.a aVar, q0 q0Var) {
            a aVar2 = (a) aVar;
            aVar2.e();
            a.f(aVar2.c, (x) q0Var);
            return aVar2;
        }

        @Override // com.amazon.aps.iva.e4.t.b
        public final v1 getLiteJavaType() {
            throw null;
        }

        @Override // com.amazon.aps.iva.e4.t.b
        public final void getLiteType() {
        }

        @Override // com.amazon.aps.iva.e4.t.b
        public final void getNumber() {
        }

        @Override // com.amazon.aps.iva.e4.t.b
        public final void isPacked() {
        }

        @Override // com.amazon.aps.iva.e4.t.b
        public final void isRepeated() {
        }
    }
}
