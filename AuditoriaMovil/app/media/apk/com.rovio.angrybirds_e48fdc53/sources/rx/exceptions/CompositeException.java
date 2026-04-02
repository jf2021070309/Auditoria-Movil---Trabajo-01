package rx.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private final List<Throwable> a;
    private final String b;
    private Throwable c;

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.a = Collections.unmodifiableList(arrayList);
        this.b = this.a.size() + " exceptions occurred. ";
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(Throwable... thArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (thArr != null) {
            for (Throwable th : thArr) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.a = Collections.unmodifiableList(arrayList);
        this.b = this.a.size() + " exceptions occurred. ";
    }

    public List<Throwable> getExceptions() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.c == null) {
            a aVar = new a();
            HashSet hashSet = new HashSet();
            a aVar2 = aVar;
            for (Throwable th : this.a) {
                if (!hashSet.contains(th)) {
                    hashSet.add(th);
                    RuntimeException runtimeException = th;
                    for (Throwable th2 : a(th)) {
                        if (hashSet.contains(th2)) {
                            runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        aVar2.initCause(runtimeException);
                    } catch (Throwable th3) {
                    }
                    aVar2 = b(aVar2);
                }
            }
            this.c = aVar;
        }
        return this.c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        a(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        a(new d(printWriter));
    }

    private void a(b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this).append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ").append(stackTraceElement).append('\n');
        }
        int i = 1;
        Iterator<Throwable> it = this.a.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                sb.append("  ComposedException ").append(i2).append(" :\n");
                a(sb, it.next(), "\t");
                i = i2 + 1;
            } else {
                synchronized (bVar.a()) {
                    bVar.a(sb.toString());
                }
                return;
            }
        }
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str).append(th).append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ").append(stackTraceElement).append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class b {
        abstract Object a();

        abstract void a(Object obj);

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends b {
        private final PrintStream a;

        c(PrintStream printStream) {
            this.a = printStream;
        }

        @Override // rx.exceptions.CompositeException.b
        Object a() {
            return this.a;
        }

        @Override // rx.exceptions.CompositeException.b
        void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends b {
        private final PrintWriter a;

        d(PrintWriter printWriter) {
            this.a = printWriter;
        }

        @Override // rx.exceptions.CompositeException.b
        Object a() {
            return this.a;
        }

        @Override // rx.exceptions.CompositeException.b
        void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* loaded from: classes4.dex */
    static final class a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    private List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause.getCause();
        }
        return arrayList;
    }

    private Throwable b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause.getCause();
        }
    }
}
