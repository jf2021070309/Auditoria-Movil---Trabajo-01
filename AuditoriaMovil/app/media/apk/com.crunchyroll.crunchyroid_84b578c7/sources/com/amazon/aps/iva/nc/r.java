package com.amazon.aps.iva.nc;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: GlideException.java */
/* loaded from: classes.dex */
public final class r extends Exception {
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public final List<Throwable> b;
    public com.amazon.aps.iva.kc.f c;
    public com.amazon.aps.iva.kc.a d;
    public Class<?> e;
    public final String f;

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof r) {
            for (Throwable th2 : ((r) th).b) {
                a(th2, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void c(List list, a aVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            aVar.append("Cause (");
            int i2 = i + 1;
            aVar.append(String.valueOf(i2));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof r) {
                ((r) th).e(aVar);
            } else {
                d(th, aVar);
            }
            i = i2;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e(Appendable appendable) {
        d(this, appendable);
        b(this.b, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f);
        String str3 = "";
        if (this.e == null) {
            str = "";
        } else {
            str = ", " + this.e;
        }
        sb.append(str);
        if (this.d == null) {
            str2 = "";
        } else {
            str2 = ", " + this.d;
        }
        sb.append(str2);
        if (this.c != null) {
            str3 = ", " + this.c;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public r(String str, List<Throwable> list) {
        this.f = str;
        setStackTrace(g);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    /* compiled from: GlideException.java */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {
        public final Appendable b;
        public boolean c = true;

        public a(Appendable appendable) {
            this.b = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.c;
            Appendable appendable = this.b;
            if (z) {
                this.c = false;
                appendable.append("  ");
            }
            this.c = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.c;
            Appendable appendable = this.b;
            boolean z2 = false;
            if (z) {
                this.c = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.c = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
