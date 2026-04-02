package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.w;
import e.d.e.z;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes2.dex */
public final class k extends z<Date> {
    public static final a0 a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final DateFormat f7866b = new SimpleDateFormat("MMM d, yyyy");

    /* loaded from: classes2.dex */
    public class a implements a0 {
        @Override // e.d.e.a0
        public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // e.d.e.z
    public Date a(e.d.e.e0.a aVar) throws IOException {
        Date date;
        synchronized (this) {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                date = null;
            } else {
                try {
                    date = new Date(this.f7866b.parse(aVar.e0()).getTime());
                } catch (ParseException e2) {
                    throw new w(e2);
                }
            }
        }
        return date;
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            cVar.W(date2 == null ? null : this.f7866b.format((java.util.Date) date2));
        }
    }
}
