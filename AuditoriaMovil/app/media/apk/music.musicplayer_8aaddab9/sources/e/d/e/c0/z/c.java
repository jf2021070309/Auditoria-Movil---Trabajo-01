package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.w;
import e.d.e.z;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class c extends z<Date> {
    public static final a0 a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final List<DateFormat> f7844b;

    /* loaded from: classes2.dex */
    public class a implements a0 {
        @Override // e.d.e.a0
        public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f7844b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.d.e.c0.p.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // e.d.e.z
    public Date a(e.d.e.e0.a aVar) throws IOException {
        if (aVar.g0() == e.d.e.e0.b.NULL) {
            aVar.a0();
            return null;
        }
        String e0 = aVar.e0();
        synchronized (this) {
            for (DateFormat dateFormat : this.f7844b) {
                try {
                    return dateFormat.parse(e0);
                } catch (ParseException unused) {
                }
            }
            try {
                return e.d.e.c0.z.t.a.b(e0, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new w(e0, e2);
            }
        }
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                cVar.y();
                return;
            }
            cVar.W(this.f7844b.get(0).format(date2));
        }
    }
}
