package f.a.f;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes2.dex */
public final class a extends RuntimeException {
    public final List<Throwable> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8912b;

    /* renamed from: c  reason: collision with root package name */
    public Throwable f8913c;

    /* renamed from: f.a.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0199a extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract void a(Object obj);
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {
        public final PrintStream a;

        public c(PrintStream printStream) {
            this.a = printStream;
        }

        @Override // f.a.f.a.b
        public void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {
        public final PrintWriter a;

        public d(PrintWriter printWriter) {
            this.a = printWriter;
        }

        @Override // f.a.f.a.b
        public void a(Object obj) {
            this.a.println(obj);
        }
    }

    public a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.a = unmodifiableList;
        this.f8912b = unmodifiableList.size() + " exceptions occurred. ";
    }

    public final void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.a) {
            sb.append("  ComposedException ");
            sb.append(i2);
            sb.append(" :\n");
            a(sb, th, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i2++;
        }
        bVar.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f8913c == null) {
            C0199a c0199a = new C0199a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.a.iterator();
            Throwable th = c0199a;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Throwable th2 = (Throwable) it2.next();
                        if (hashSet.contains(th2)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        th.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = th.getCause();
                    if (cause3 != null && th != cause3) {
                        while (true) {
                            Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                            }
                            cause3 = cause4;
                        }
                        th = cause3;
                    }
                }
            }
            this.f8913c = c0199a;
        }
        return this.f8913c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f8912b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}
