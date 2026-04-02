package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.w;
import e.d.e.z;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes2.dex */
public final class l extends z<Time> {
    public static final a0 a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final DateFormat f7867b = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes2.dex */
    public class a implements a0 {
        @Override // e.d.e.a0
        public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            if (aVar.a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    @Override // e.d.e.z
    public Time a(e.d.e.e0.a aVar) throws IOException {
        synchronized (this) {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return new Time(this.f7867b.parse(aVar.e0()).getTime());
            } catch (ParseException e2) {
                throw new w(e2);
            }
        }
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, Time time) throws IOException {
        Time time2 = time;
        synchronized (this) {
            cVar.W(time2 == null ? null : this.f7867b.format((Date) time2));
        }
    }
}
