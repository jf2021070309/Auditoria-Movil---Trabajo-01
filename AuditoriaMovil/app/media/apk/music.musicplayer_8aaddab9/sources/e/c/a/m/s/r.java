package e.c.a.m.s;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class r extends Exception {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    /* renamed from: b  reason: collision with root package name */
    public final List<Throwable> f5751b;

    /* renamed from: c  reason: collision with root package name */
    public e.c.a.m.k f5752c;

    /* renamed from: d  reason: collision with root package name */
    public e.c.a.m.a f5753d;

    /* renamed from: e  reason: collision with root package name */
    public Class<?> f5754e;

    /* renamed from: f  reason: collision with root package name */
    public String f5755f;

    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        public final Appendable a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5756b = true;

        public a(Appendable appendable) {
            this.a = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f5756b) {
                this.f5756b = false;
                this.a.append("  ");
            }
            this.f5756b = c2 == '\n';
            this.a.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f5756b) {
                this.f5756b = false;
                this.a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f5756b = z;
            this.a.append(charSequence, i2, i3);
            return this;
        }
    }

    public r(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f5755f = str;
        setStackTrace(a);
        this.f5751b = emptyList;
    }

    public r(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f5755f = str;
        setStackTrace(a);
        this.f5751b = singletonList;
    }

    public r(String str, List<Throwable> list) {
        this.f5755f = str;
        setStackTrace(a);
        this.f5751b = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            f(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void f(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof r) {
                ((r) th).i(appendable);
            } else {
                h(th, appendable);
            }
            i2 = i3;
        }
    }

    public static void h(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof r)) {
            list.add(th);
            return;
        }
        for (Throwable th2 : ((r) th).f5751b) {
            a(th2, list);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f5755f);
        String str3 = "";
        if (this.f5754e != null) {
            StringBuilder y = e.a.d.a.a.y(", ");
            y.append(this.f5754e);
            str = y.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f5753d != null) {
            StringBuilder y2 = e.a.d.a.a.y(", ");
            y2.append(this.f5753d);
            str2 = y2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f5752c != null) {
            StringBuilder y3 = e.a.d.a.a.y(", ");
            y3.append(this.f5752c);
            str3 = y3.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb.append(th.getMessage());
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void i(Appendable appendable) {
        h(this, appendable);
        b(this.f5751b, new a(appendable));
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        i(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        i(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        i(printWriter);
    }
}
