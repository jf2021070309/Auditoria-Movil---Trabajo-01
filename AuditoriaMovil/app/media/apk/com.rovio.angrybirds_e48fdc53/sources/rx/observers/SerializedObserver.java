package rx.observers;

import rx.Observer;
import rx.exceptions.Exceptions;
import rx.internal.operators.NotificationLite;
/* loaded from: classes4.dex */
public class SerializedObserver<T> implements Observer<T> {
    private final Observer<? super T> a;
    private boolean b;
    private volatile boolean c;
    private a d;
    private final NotificationLite<T> e = NotificationLite.instance();

    /* loaded from: classes4.dex */
    static final class a {
        Object[] a;
        int b;

        a() {
        }

        public void a(Object obj) {
            Object[] objArr;
            int i = this.b;
            Object[] objArr2 = this.a;
            if (objArr2 == null) {
                objArr = new Object[16];
                this.a = objArr;
            } else if (i == objArr2.length) {
                objArr = new Object[(i >> 2) + i];
                System.arraycopy(objArr2, 0, objArr, 0, i);
                this.a = objArr;
            } else {
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public SerializedObserver(Observer<? super T> observer) {
        this.a = observer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0034, code lost:
        continue;
     */
    @Override // rx.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNext(T r9) {
        /*
            r8 = this;
            r1 = 0
            r7 = 1
            boolean r0 = r8.c
            if (r0 == 0) goto L7
        L6:
            return
        L7:
            monitor-enter(r8)
            boolean r0 = r8.c     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L11
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            goto L6
        Le:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            throw r0
        L11:
            boolean r0 = r8.b     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L2b
            rx.observers.SerializedObserver$a r0 = r8.d     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L20
            rx.observers.SerializedObserver$a r0 = new rx.observers.SerializedObserver$a     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            r8.d = r0     // Catch: java.lang.Throwable -> Le
        L20:
            rx.internal.operators.NotificationLite<T> r1 = r8.e     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.next(r9)     // Catch: java.lang.Throwable -> Le
            r0.a(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            goto L6
        L2b:
            r0 = 1
            r8.b = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            rx.Observer<? super T> r0 = r8.a     // Catch: java.lang.Throwable -> L41
            r0.onNext(r9)     // Catch: java.lang.Throwable -> L41
        L34:
            monitor-enter(r8)
            rx.observers.SerializedObserver$a r0 = r8.d     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L4a
            r0 = 0
            r8.b = r0     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            goto L6
        L3e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            throw r0
        L41:
            r0 = move-exception
            r8.c = r7
            rx.Observer<? super T> r1 = r8.a
            rx.exceptions.Exceptions.throwOrReport(r0, r1, r9)
            goto L6
        L4a:
            r2 = 0
            r8.d = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r2 = r0.a
            int r3 = r2.length
            r0 = r1
        L52:
            if (r0 >= r3) goto L34
            r4 = r2[r0]
            if (r4 == 0) goto L34
            rx.internal.operators.NotificationLite<T> r5 = r8.e     // Catch: java.lang.Throwable -> L66
            rx.Observer<? super T> r6 = r8.a     // Catch: java.lang.Throwable -> L66
            boolean r4 = r5.accept(r6, r4)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L76
            r0 = 1
            r8.c = r0     // Catch: java.lang.Throwable -> L66
            goto L6
        L66:
            r0 = move-exception
            r8.c = r7
            rx.exceptions.Exceptions.throwIfFatal(r0)
            rx.Observer<? super T> r1 = r8.a
            java.lang.Throwable r0 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r9)
            r1.onError(r0)
            goto L6
        L76:
            int r0 = r0 + 1
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.observers.SerializedObserver.onNext(java.lang.Object):void");
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        Exceptions.throwIfFatal(th);
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    if (this.b) {
                        a aVar = this.d;
                        if (aVar == null) {
                            aVar = new a();
                            this.d = aVar;
                        }
                        aVar.a(this.e.error(th));
                        return;
                    }
                    this.b = true;
                    this.a.onError(th);
                }
            }
        }
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.c = true;
                    if (this.b) {
                        a aVar = this.d;
                        if (aVar == null) {
                            aVar = new a();
                            this.d = aVar;
                        }
                        aVar.a(this.e.completed());
                        return;
                    }
                    this.b = true;
                    this.a.onCompleted();
                }
            }
        }
    }
}
