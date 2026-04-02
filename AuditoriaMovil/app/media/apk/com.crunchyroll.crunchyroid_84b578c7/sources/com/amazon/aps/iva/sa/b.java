package com.amazon.aps.iva.sa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.amazon.aps.iva.qa.a;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: BaseClient.java */
/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    public static final /* synthetic */ int f = 0;
    public final Class<T> a;
    public final com.amazon.aps.iva.sa.d b;
    public b<T>.a c;
    public T d;
    public volatile com.amazon.aps.iva.qa.a e;

    /* compiled from: BaseClient.java */
    /* loaded from: classes.dex */
    public abstract class a implements ServiceConnection, InvocationHandler {
        public final ArrayList<C0699b> b = new ArrayList<>();

        public a() {
        }

        public static Object a(IInterface iInterface, Method method, Object[] objArr) {
            try {
                return method.invoke(iInterface, objArr);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to proxy pending invocation " + method, e);
            } catch (InvocationTargetException e2) {
                Throwable targetException = e2.getTargetException();
                if (targetException instanceof RemoteException) {
                    throw ((RemoteException) targetException);
                }
                throw new RuntimeException("Failed to proxy pending invocation " + method, e2);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @SuppressFBWarnings({"RpC_REPEATED_CONDITIONAL_TEST"})
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            synchronized (b.this) {
                b bVar = b.this;
                int i = b.f;
                synchronized (bVar) {
                    if (bVar.c == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    if (b.this.e == null) {
                        Class<?> returnType = method.getReturnType();
                        if (!Void.TYPE.equals(returnType) && !Void.TYPE.equals(returnType)) {
                            throw new c();
                        }
                        this.b.add(new C0699b(method, objArr));
                        return null;
                    }
                    return a(b.this.e, method, objArr);
                }
                throw new IllegalStateException("Cannot invoke on a torn down client");
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.amazon.aps.iva.qa.a c0638a;
            synchronized (b.this) {
                b bVar = b.this;
                int i = a.AbstractBinderC0637a.a;
                if (iBinder == null) {
                    c0638a = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.aiondec.api.AIOnDeCServiceInterface");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof com.amazon.aps.iva.qa.a)) {
                        c0638a = (com.amazon.aps.iva.qa.a) queryLocalInterface;
                    } else {
                        c0638a = new a.AbstractBinderC0637a.C0638a(iBinder);
                    }
                }
                bVar.e = c0638a;
                Iterator<C0699b> it = this.b.iterator();
                while (it.hasNext()) {
                    C0699b next = it.next();
                    try {
                        a(b.this.e, next.a, next.b);
                    } catch (RemoteException unused) {
                        int i2 = b.f;
                    }
                }
                this.b.clear();
                com.amazon.aps.iva.sa.d dVar = b.this.b;
                synchronized (dVar) {
                    dVar.f = true;
                    for (int size = dVar.a.size() - 1; size >= 0; size--) {
                        dVar.a.get(size).a();
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            b.this.e = null;
            com.amazon.aps.iva.sa.d dVar = b.this.b;
            synchronized (dVar) {
                Objects.toString(dVar.b);
                dVar.f = false;
                int size = dVar.a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    dVar.a.get(size).getClass();
                }
                Context context = dVar.b;
                if (context != null && dVar.e) {
                    ServiceConnection serviceConnection = dVar.c;
                    Intent intent = dVar.d;
                    dVar.c();
                    dVar.d(context, serviceConnection, intent, null);
                }
            }
        }
    }

    /* compiled from: BaseClient.java */
    /* renamed from: com.amazon.aps.iva.sa.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0699b {
        public final Method a;
        public final Object[] b;

        public C0699b(Method method, Object[] objArr) {
            this.a = method;
            this.b = objArr;
        }
    }

    /* compiled from: BaseClient.java */
    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        public c() {
            super("Method which returns a value called on the proxy service!");
        }
    }

    /* compiled from: BaseClient.java */
    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d() {
            super("Client already torn down!");
        }
    }

    static {
        "SPCH-".concat(b.class.getSimpleName());
    }

    public b() {
        throw null;
    }

    public b(Context context, Intent intent, f fVar) {
        this.a = com.amazon.aps.iva.qa.a.class;
        this.b = fVar;
        com.amazon.aps.iva.ra.c cVar = (com.amazon.aps.iva.ra.c) this;
        this.c = new com.amazon.aps.iva.ra.b(cVar);
        fVar.a(new com.amazon.aps.iva.sa.a(cVar, context));
        fVar.d(context, this.c, intent, null);
    }

    public final synchronized T a() {
        if (this.c != null) {
            if (this.d == null) {
                this.d = (T) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{this.a}, this.c);
            }
        } else {
            throw new d();
        }
        return this.d;
    }

    public synchronized void b() {
        if (this.c == null) {
            return;
        }
        this.b.c();
        this.c = null;
    }
}
