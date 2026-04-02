package e.d.e.c0.z;

import e.d.e.c0.s;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes2.dex */
public final class o {
    public static final e.d.e.z<String> A;
    public static final e.d.e.z<BigDecimal> B;
    public static final e.d.e.z<BigInteger> C;
    public static final e.d.e.a0 D;
    public static final e.d.e.z<StringBuilder> E;
    public static final e.d.e.a0 F;
    public static final e.d.e.z<StringBuffer> G;
    public static final e.d.e.a0 H;
    public static final e.d.e.z<URL> I;
    public static final e.d.e.a0 J;
    public static final e.d.e.z<URI> K;
    public static final e.d.e.a0 L;
    public static final e.d.e.z<InetAddress> M;
    public static final e.d.e.a0 N;
    public static final e.d.e.z<UUID> O;
    public static final e.d.e.a0 P;
    public static final e.d.e.z<Currency> Q;
    public static final e.d.e.a0 R;
    public static final e.d.e.a0 S;
    public static final e.d.e.z<Calendar> T;
    public static final e.d.e.a0 U;
    public static final e.d.e.z<Locale> V;
    public static final e.d.e.a0 W;
    public static final e.d.e.z<e.d.e.o> X;
    public static final e.d.e.a0 Y;
    public static final e.d.e.a0 Z;
    public static final e.d.e.z<Class> a;

    /* renamed from: b  reason: collision with root package name */
    public static final e.d.e.a0 f7875b;

    /* renamed from: c  reason: collision with root package name */
    public static final e.d.e.z<BitSet> f7876c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.d.e.a0 f7877d;

    /* renamed from: e  reason: collision with root package name */
    public static final e.d.e.z<Boolean> f7878e;

    /* renamed from: f  reason: collision with root package name */
    public static final e.d.e.z<Boolean> f7879f;

    /* renamed from: g  reason: collision with root package name */
    public static final e.d.e.a0 f7880g;

    /* renamed from: h  reason: collision with root package name */
    public static final e.d.e.z<Number> f7881h;

    /* renamed from: i  reason: collision with root package name */
    public static final e.d.e.a0 f7882i;

    /* renamed from: j  reason: collision with root package name */
    public static final e.d.e.z<Number> f7883j;

    /* renamed from: k  reason: collision with root package name */
    public static final e.d.e.a0 f7884k;

    /* renamed from: l  reason: collision with root package name */
    public static final e.d.e.z<Number> f7885l;

    /* renamed from: m  reason: collision with root package name */
    public static final e.d.e.a0 f7886m;

    /* renamed from: n  reason: collision with root package name */
    public static final e.d.e.z<AtomicInteger> f7887n;
    public static final e.d.e.a0 o;
    public static final e.d.e.z<AtomicBoolean> p;
    public static final e.d.e.a0 q;
    public static final e.d.e.z<AtomicIntegerArray> r;
    public static final e.d.e.a0 s;
    public static final e.d.e.z<Number> t;
    public static final e.d.e.z<Number> u;
    public static final e.d.e.z<Number> v;
    public static final e.d.e.z<Number> w;
    public static final e.d.e.a0 x;
    public static final e.d.e.z<Character> y;
    public static final e.d.e.a0 z;

    /* loaded from: classes2.dex */
    public class a extends e.d.e.z<AtomicIntegerArray> {
        @Override // e.d.e.z
        public AtomicIntegerArray a(e.d.e.e0.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.y()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.K()));
                } catch (NumberFormatException e2) {
                    throw new e.d.e.w(e2);
                }
            }
            aVar.m();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            cVar.f();
            int length = atomicIntegerArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.K(atomicIntegerArray2.get(i2));
            }
            cVar.m();
        }
    }

    /* loaded from: classes2.dex */
    public class a0 extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.K());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Long.valueOf(aVar.M());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    /* loaded from: classes2.dex */
    public class b0 extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.K());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return Float.valueOf((float) aVar.I());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    /* loaded from: classes2.dex */
    public class c0 extends e.d.e.z<AtomicInteger> {
        @Override // e.d.e.z
        public AtomicInteger a(e.d.e.e0.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.K());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.K(atomicInteger.get());
        }
    }

    /* loaded from: classes2.dex */
    public class d extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return Double.valueOf(aVar.I());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    /* loaded from: classes2.dex */
    public class d0 extends e.d.e.z<AtomicBoolean> {
        @Override // e.d.e.z
        public AtomicBoolean a(e.d.e.e0.a aVar) throws IOException {
            return new AtomicBoolean(aVar.H());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.a0(atomicBoolean.get());
        }
    }

    /* loaded from: classes2.dex */
    public class e extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            e.d.e.e0.b g0 = aVar.g0();
            int ordinal = g0.ordinal();
            if (ordinal == 5 || ordinal == 6) {
                return new e.d.e.c0.r(aVar.e0());
            }
            if (ordinal == 8) {
                aVar.a0();
                return null;
            }
            throw new e.d.e.w("Expecting number, got: " + g0);
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0<T extends Enum<T>> extends e.d.e.z<T> {
        public final Map<String, T> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f7888b = new HashMap();

        public e0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    e.d.e.b0.b bVar = (e.d.e.b0.b) cls.getField(name).getAnnotation(e.d.e.b0.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.f7888b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // e.d.e.z
        public Object a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return this.a.get(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            cVar.W(r3 == null ? null : this.f7888b.get(r3));
        }
    }

    /* loaded from: classes2.dex */
    public class f extends e.d.e.z<Character> {
        @Override // e.d.e.z
        public Character a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            String e0 = aVar.e0();
            if (e0.length() == 1) {
                return Character.valueOf(e0.charAt(0));
            }
            throw new e.d.e.w(e.a.d.a.a.k("Expecting character, got: ", e0));
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Character ch2) throws IOException {
            Character ch3 = ch2;
            cVar.W(ch3 == null ? null : String.valueOf(ch3));
        }
    }

    /* loaded from: classes2.dex */
    public class g extends e.d.e.z<String> {
        @Override // e.d.e.z
        public String a(e.d.e.e0.a aVar) throws IOException {
            e.d.e.e0.b g0 = aVar.g0();
            if (g0 != e.d.e.e0.b.NULL) {
                return g0 == e.d.e.e0.b.BOOLEAN ? Boolean.toString(aVar.H()) : aVar.e0();
            }
            aVar.a0();
            return null;
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, String str) throws IOException {
            cVar.W(str);
        }
    }

    /* loaded from: classes2.dex */
    public class h extends e.d.e.z<BigDecimal> {
        @Override // e.d.e.z
        public BigDecimal a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return new BigDecimal(aVar.e0());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.Q(bigDecimal);
        }
    }

    /* loaded from: classes2.dex */
    public class i extends e.d.e.z<BigInteger> {
        @Override // e.d.e.z
        public BigInteger a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return new BigInteger(aVar.e0());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, BigInteger bigInteger) throws IOException {
            cVar.Q(bigInteger);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends e.d.e.z<StringBuilder> {
        @Override // e.d.e.z
        public StringBuilder a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return new StringBuilder(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, StringBuilder sb) throws IOException {
            StringBuilder sb2 = sb;
            cVar.W(sb2 == null ? null : sb2.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class k extends e.d.e.z<Class> {
        @Override // e.d.e.z
        public Class a(e.d.e.e0.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Class cls) throws IOException {
            StringBuilder y = e.a.d.a.a.y("Attempted to serialize java.lang.Class: ");
            y.append(cls.getName());
            y.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(y.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class l extends e.d.e.z<StringBuffer> {
        @Override // e.d.e.z
        public StringBuffer a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return new StringBuffer(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, StringBuffer stringBuffer) throws IOException {
            StringBuffer stringBuffer2 = stringBuffer;
            cVar.W(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class m extends e.d.e.z<URL> {
        @Override // e.d.e.z
        public URL a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            String e0 = aVar.e0();
            if ("null".equals(e0)) {
                return null;
            }
            return new URL(e0);
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, URL url) throws IOException {
            URL url2 = url;
            cVar.W(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* loaded from: classes2.dex */
    public class n extends e.d.e.z<URI> {
        @Override // e.d.e.z
        public URI a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                String e0 = aVar.e0();
                if ("null".equals(e0)) {
                    return null;
                }
                return new URI(e0);
            } catch (URISyntaxException e2) {
                throw new e.d.e.p(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, URI uri) throws IOException {
            URI uri2 = uri;
            cVar.W(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* renamed from: e.d.e.c0.z.o$o  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0171o extends e.d.e.z<InetAddress> {
        @Override // e.d.e.z
        public InetAddress a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return InetAddress.getByName(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, InetAddress inetAddress) throws IOException {
            InetAddress inetAddress2 = inetAddress;
            cVar.W(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* loaded from: classes2.dex */
    public class p extends e.d.e.z<UUID> {
        @Override // e.d.e.z
        public UUID a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return UUID.fromString(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, UUID uuid) throws IOException {
            UUID uuid2 = uuid;
            cVar.W(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class q extends e.d.e.z<Currency> {
        @Override // e.d.e.z
        public Currency a(e.d.e.e0.a aVar) throws IOException {
            return Currency.getInstance(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Currency currency) throws IOException {
            cVar.W(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes2.dex */
    public class r implements e.d.e.a0 {

        /* loaded from: classes2.dex */
        public class a extends e.d.e.z<Timestamp> {
            public final /* synthetic */ e.d.e.z a;

            public a(r rVar, e.d.e.z zVar) {
                this.a = zVar;
            }

            @Override // e.d.e.z
            public Timestamp a(e.d.e.e0.a aVar) throws IOException {
                Date date = (Date) this.a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // e.d.e.z
            public void b(e.d.e.e0.c cVar, Timestamp timestamp) throws IOException {
                this.a.b(cVar, timestamp);
            }
        }

        @Override // e.d.e.a0
        public <T> e.d.e.z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            if (aVar.a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(jVar);
            return new a(this, jVar.c(new e.d.e.d0.a<>(Date.class)));
        }
    }

    /* loaded from: classes2.dex */
    public class s extends e.d.e.z<Calendar> {
        @Override // e.d.e.z
        public Calendar a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            aVar.f();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.g0() != e.d.e.e0.b.END_OBJECT) {
                String Q = aVar.Q();
                int K = aVar.K();
                if ("year".equals(Q)) {
                    i2 = K;
                } else if ("month".equals(Q)) {
                    i3 = K;
                } else if ("dayOfMonth".equals(Q)) {
                    i4 = K;
                } else if ("hourOfDay".equals(Q)) {
                    i5 = K;
                } else if ("minute".equals(Q)) {
                    i6 = K;
                } else if ("second".equals(Q)) {
                    i7 = K;
                }
            }
            aVar.r();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Calendar calendar) throws IOException {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                cVar.y();
                return;
            }
            cVar.h();
            cVar.u("year");
            cVar.K(calendar2.get(1));
            cVar.u("month");
            cVar.K(calendar2.get(2));
            cVar.u("dayOfMonth");
            cVar.K(calendar2.get(5));
            cVar.u("hourOfDay");
            cVar.K(calendar2.get(11));
            cVar.u("minute");
            cVar.K(calendar2.get(12));
            cVar.u("second");
            cVar.K(calendar2.get(13));
            cVar.r();
        }
    }

    /* loaded from: classes2.dex */
    public class t extends e.d.e.z<Locale> {
        @Override // e.d.e.z
        public Locale a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.e0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Locale locale) throws IOException {
            Locale locale2 = locale;
            cVar.W(locale2 == null ? null : locale2.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class u extends e.d.e.z<e.d.e.o> {
        @Override // e.d.e.z
        /* renamed from: c */
        public e.d.e.o a(e.d.e.e0.a aVar) throws IOException {
            int ordinal = aVar.g0().ordinal();
            if (ordinal == 0) {
                e.d.e.l lVar = new e.d.e.l();
                aVar.a();
                while (aVar.y()) {
                    lVar.a.add(a(aVar));
                }
                aVar.m();
                return lVar;
            } else if (ordinal == 2) {
                e.d.e.r rVar = new e.d.e.r();
                aVar.f();
                while (aVar.y()) {
                    rVar.a.put(aVar.Q(), a(aVar));
                }
                aVar.r();
                return rVar;
            } else if (ordinal != 5) {
                if (ordinal != 6) {
                    if (ordinal != 7) {
                        if (ordinal == 8) {
                            aVar.a0();
                            return e.d.e.q.a;
                        }
                        throw new IllegalArgumentException();
                    }
                    return new e.d.e.t(Boolean.valueOf(aVar.H()));
                }
                return new e.d.e.t(new e.d.e.c0.r(aVar.e0()));
            } else {
                return new e.d.e.t(aVar.e0());
            }
        }

        @Override // e.d.e.z
        /* renamed from: d */
        public void b(e.d.e.e0.c cVar, e.d.e.o oVar) throws IOException {
            if (oVar == null || (oVar instanceof e.d.e.q)) {
                cVar.y();
            } else if (oVar instanceof e.d.e.t) {
                e.d.e.t a = oVar.a();
                Object obj = a.a;
                if (obj instanceof Number) {
                    cVar.Q(a.c());
                } else if (obj instanceof Boolean) {
                    cVar.a0(a.b());
                } else {
                    cVar.W(a.d());
                }
            } else {
                boolean z = oVar instanceof e.d.e.l;
                if (z) {
                    cVar.f();
                    if (!z) {
                        throw new IllegalStateException("Not a JSON Array: " + oVar);
                    }
                    Iterator<e.d.e.o> it = ((e.d.e.l) oVar).iterator();
                    while (it.hasNext()) {
                        b(cVar, it.next());
                    }
                    cVar.m();
                    return;
                }
                boolean z2 = oVar instanceof e.d.e.r;
                if (!z2) {
                    StringBuilder y = e.a.d.a.a.y("Couldn't write ");
                    y.append(oVar.getClass());
                    throw new IllegalArgumentException(y.toString());
                }
                cVar.h();
                if (!z2) {
                    throw new IllegalStateException("Not a JSON Object: " + oVar);
                }
                e.d.e.c0.s sVar = e.d.e.c0.s.this;
                s.e eVar = sVar.f7826f.f7834d;
                int i2 = sVar.f7825e;
                while (true) {
                    s.e eVar2 = sVar.f7826f;
                    if (!(eVar != eVar2)) {
                        cVar.r();
                        return;
                    } else if (eVar == eVar2) {
                        throw new NoSuchElementException();
                    } else {
                        if (sVar.f7825e != i2) {
                            throw new ConcurrentModificationException();
                        }
                        s.e eVar3 = eVar.f7834d;
                        cVar.u((String) eVar.f7836f);
                        b(cVar, (e.d.e.o) eVar.f7837g);
                        eVar = eVar3;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class v extends e.d.e.z<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
            if (r6.K() != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
            r1 = false;
         */
        @Override // e.d.e.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet a(e.d.e.e0.a r6) throws java.io.IOException {
            /*
                r5 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.a()
                e.d.e.e0.b r1 = r6.g0()
                r2 = 0
            Ld:
                e.d.e.e0.b r3 = e.d.e.e0.b.END_ARRAY
                if (r1 == r3) goto L66
                int r3 = r1.ordinal()
                r4 = 5
                if (r3 == r4) goto L41
                r4 = 6
                if (r3 == r4) goto L3a
                r4 = 7
                if (r3 != r4) goto L23
                boolean r1 = r6.H()
                goto L4e
            L23:
                e.d.e.w r6 = new e.d.e.w
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L3a:
                int r1 = r6.K()
                if (r1 == 0) goto L4d
                goto L4b
            L41:
                java.lang.String r1 = r6.e0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5a
                if (r1 == 0) goto L4d
            L4b:
                r1 = 1
                goto L4e
            L4d:
                r1 = 0
            L4e:
                if (r1 == 0) goto L53
                r0.set(r2)
            L53:
                int r2 = r2 + 1
                e.d.e.e0.b r1 = r6.g0()
                goto Ld
            L5a:
                e.d.e.w r6 = new e.d.e.w
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = e.a.d.a.a.k(r0, r1)
                r6.<init>(r0)
                throw r6
            L66:
                r6.m()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.e.c0.z.o.v.a(e.d.e.e0.a):java.lang.Object");
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            cVar.f();
            int length = bitSet2.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.K(bitSet2.get(i2) ? 1L : 0L);
            }
            cVar.m();
        }
    }

    /* loaded from: classes2.dex */
    public class w implements e.d.e.a0 {
        @Override // e.d.e.a0
        public <T> e.d.e.z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            Class<? super T> cls = aVar.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new e0(cls);
        }
    }

    /* loaded from: classes2.dex */
    public class x extends e.d.e.z<Boolean> {
        @Override // e.d.e.z
        public Boolean a(e.d.e.e0.a aVar) throws IOException {
            e.d.e.e0.b g0 = aVar.g0();
            if (g0 != e.d.e.e0.b.NULL) {
                return g0 == e.d.e.e0.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.e0())) : Boolean.valueOf(aVar.H());
            }
            aVar.a0();
            return null;
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Boolean bool) throws IOException {
            cVar.M(bool);
        }
    }

    /* loaded from: classes2.dex */
    public class y extends e.d.e.z<Boolean> {
        @Override // e.d.e.z
        public Boolean a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            return Boolean.valueOf(aVar.e0());
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            cVar.W(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class z extends e.d.e.z<Number> {
        @Override // e.d.e.z
        public Number a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.K());
            } catch (NumberFormatException e2) {
                throw new e.d.e.w(e2);
            }
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Number number) throws IOException {
            cVar.Q(number);
        }
    }

    static {
        e.d.e.y yVar = new e.d.e.y(new k());
        a = yVar;
        f7875b = new e.d.e.c0.z.p(Class.class, yVar);
        e.d.e.y yVar2 = new e.d.e.y(new v());
        f7876c = yVar2;
        f7877d = new e.d.e.c0.z.p(BitSet.class, yVar2);
        x xVar = new x();
        f7878e = xVar;
        f7879f = new y();
        f7880g = new e.d.e.c0.z.q(Boolean.TYPE, Boolean.class, xVar);
        z zVar = new z();
        f7881h = zVar;
        f7882i = new e.d.e.c0.z.q(Byte.TYPE, Byte.class, zVar);
        a0 a0Var = new a0();
        f7883j = a0Var;
        f7884k = new e.d.e.c0.z.q(Short.TYPE, Short.class, a0Var);
        b0 b0Var = new b0();
        f7885l = b0Var;
        f7886m = new e.d.e.c0.z.q(Integer.TYPE, Integer.class, b0Var);
        e.d.e.y yVar3 = new e.d.e.y(new c0());
        f7887n = yVar3;
        o = new e.d.e.c0.z.p(AtomicInteger.class, yVar3);
        e.d.e.y yVar4 = new e.d.e.y(new d0());
        p = yVar4;
        q = new e.d.e.c0.z.p(AtomicBoolean.class, yVar4);
        e.d.e.y yVar5 = new e.d.e.y(new a());
        r = yVar5;
        s = new e.d.e.c0.z.p(AtomicIntegerArray.class, yVar5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = new e.d.e.c0.z.p(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new e.d.e.c0.z.q(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = new e.d.e.c0.z.p(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = new e.d.e.c0.z.p(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new e.d.e.c0.z.p(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new e.d.e.c0.z.p(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new e.d.e.c0.z.p(URI.class, nVar);
        C0171o c0171o = new C0171o();
        M = c0171o;
        N = new e.d.e.c0.z.s(InetAddress.class, c0171o);
        p pVar = new p();
        O = pVar;
        P = new e.d.e.c0.z.p(UUID.class, pVar);
        e.d.e.y yVar6 = new e.d.e.y(new q());
        Q = yVar6;
        R = new e.d.e.c0.z.p(Currency.class, yVar6);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = new e.d.e.c0.z.r(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new e.d.e.c0.z.p(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new e.d.e.c0.z.s(e.d.e.o.class, uVar);
        Z = new w();
    }
}
