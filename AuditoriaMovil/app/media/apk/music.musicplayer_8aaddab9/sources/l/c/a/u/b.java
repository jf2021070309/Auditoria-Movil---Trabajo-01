package l.c.a.u;

import ch.qos.logback.core.CoreConstants;
import e.j.d.w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l.c.a.p;
import l.c.a.q;
import l.c.a.u.g;
import l.c.a.u.k;
import l.c.a.w.n;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public final class b {
    public static final l.c.a.w.k<p> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Character, l.c.a.w.i> f9770b;

    /* renamed from: c  reason: collision with root package name */
    public b f9771c;

    /* renamed from: d  reason: collision with root package name */
    public final b f9772d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f9773e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9774f;

    /* renamed from: g  reason: collision with root package name */
    public int f9775g;

    /* loaded from: classes2.dex */
    public class a implements l.c.a.w.k<p> {
        @Override // l.c.a.w.k
        public p a(l.c.a.w.e eVar) {
            p pVar = (p) eVar.query(l.c.a.w.j.a);
            if (pVar == null || (pVar instanceof q)) {
                return null;
            }
            return pVar;
        }
    }

    /* renamed from: l.c.a.u.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0214b extends l.c.a.u.g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k.b f9776b;

        public C0214b(b bVar, k.b bVar2) {
            this.f9776b = bVar2;
        }

        @Override // l.c.a.u.g
        public String a(l.c.a.w.i iVar, long j2, l.c.a.u.l lVar, Locale locale) {
            return this.f9776b.a(j2, lVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements e {
        public final char a;

        public c(char c2) {
            this.a = c2;
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            StringBuilder y = e.a.d.a.a.y("'");
            y.append(this.a);
            y.append("'");
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements e {
        public final e[] a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9777b;

        public d(List<e> list, boolean z) {
            this.a = (e[]) list.toArray(new e[list.size()]);
            this.f9777b = z;
        }

        public d(e[] eVarArr, boolean z) {
            this.a = eVarArr;
            this.f9777b = z;
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f9777b) {
                fVar.f9797d++;
            }
            try {
                for (e eVar : this.a) {
                    if (!eVar.print(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f9777b) {
                    fVar.a();
                }
                return true;
            } finally {
                if (this.f9777b) {
                    fVar.a();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.f9777b ? "[" : "(");
                for (e eVar : this.a) {
                    sb.append(eVar);
                }
                sb.append(this.f9777b ? "]" : ")");
            }
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        boolean print(l.c.a.u.f fVar, StringBuilder sb);
    }

    /* loaded from: classes2.dex */
    public static final class f implements e {
        public final l.c.a.w.i a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9778b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9779c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f9780d;

        public f(l.c.a.w.i iVar, int i2, int i3, boolean z) {
            w.k0(iVar, "field");
            n range = iVar.range();
            if (!(range.a == range.f9815b && range.f9816c == range.f9817d)) {
                throw new IllegalArgumentException(e.a.d.a.a.o("Field must have a fixed set of values: ", iVar));
            }
            if (i2 < 0 || i2 > 9) {
                throw new IllegalArgumentException(e.a.d.a.a.e("Minimum width must be from 0 to 9 inclusive but was ", i2));
            }
            if (i3 < 1 || i3 > 9) {
                throw new IllegalArgumentException(e.a.d.a.a.e("Maximum width must be from 1 to 9 inclusive but was ", i3));
            }
            if (i3 < i2) {
                throw new IllegalArgumentException(e.a.d.a.a.g("Maximum width must exceed or equal the minimum width but ", i3, " < ", i2));
            }
            this.a = iVar;
            this.f9778b = i2;
            this.f9779c = i3;
            this.f9780d = z;
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            Long b2 = fVar.b(this.a);
            if (b2 == null) {
                return false;
            }
            l.c.a.u.h hVar = fVar.f9796c;
            long longValue = b2.longValue();
            n range = this.a.range();
            range.b(longValue, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(range.a);
            BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(range.f9817d).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
            if (stripTrailingZeros.scale() != 0) {
                String a = hVar.a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f9778b), this.f9779c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f9780d) {
                    sb.append(hVar.f9801e);
                }
                sb.append(a);
                return true;
            } else if (this.f9778b > 0) {
                if (this.f9780d) {
                    sb.append(hVar.f9801e);
                }
                for (int i2 = 0; i2 < this.f9778b; i2++) {
                    sb.append(hVar.f9798b);
                }
                return true;
            } else {
                return true;
            }
        }

        public String toString() {
            String str = this.f9780d ? ",DecimalPoint" : "";
            StringBuilder y = e.a.d.a.a.y("Fraction(");
            y.append(this.a);
            y.append(",");
            y.append(this.f9778b);
            y.append(",");
            y.append(this.f9779c);
            y.append(str);
            y.append(")");
            return y.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements e {
        public g(int i2) {
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            Long b2 = fVar.b(l.c.a.w.a.INSTANT_SECONDS);
            l.c.a.w.e eVar = fVar.a;
            l.c.a.w.a aVar = l.c.a.w.a.NANO_OF_SECOND;
            Long valueOf = eVar.isSupported(aVar) ? Long.valueOf(fVar.a.getLong(aVar)) : 0L;
            if (b2 == null) {
                return false;
            }
            long longValue = b2.longValue();
            int checkValidIntValue = aVar.checkValidIntValue(valueOf.longValue());
            if (longValue >= -62167219200L) {
                long j2 = (longValue - 315569520000L) + 62167219200L;
                long G = w.G(j2, 315569520000L) + 1;
                l.c.a.f c0 = l.c.a.f.c0(w.I(j2, 315569520000L) - 62167219200L, 0, q.f9705d);
                if (G > 0) {
                    sb.append('+');
                    sb.append(G);
                }
                sb.append(c0);
                if (c0.f9682d.f9687f == 0) {
                    sb.append(":00");
                }
            } else {
                long j3 = longValue + 62167219200L;
                long j4 = j3 / 315569520000L;
                long j5 = j3 % 315569520000L;
                l.c.a.f c02 = l.c.a.f.c0(j5 - 62167219200L, 0, q.f9705d);
                int length = sb.length();
                sb.append(c02);
                if (c02.f9682d.f9687f == 0) {
                    sb.append(":00");
                }
                if (j4 < 0) {
                    if (c02.f9681c.f9677c == -10000) {
                        sb.replace(length, length + 2, Long.toString(j4 - 1));
                    } else if (j5 == 0) {
                        sb.insert(length, j4);
                    } else {
                        sb.insert(length + 1, Math.abs(j4));
                    }
                }
            }
            if (checkValidIntValue != 0) {
                sb.append(CoreConstants.DOT);
                if (checkValidIntValue % 1000000 == 0) {
                    sb.append(Integer.toString((checkValidIntValue / 1000000) + 1000).substring(1));
                } else if (checkValidIntValue % 1000 == 0) {
                    sb.append(Integer.toString((checkValidIntValue / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(checkValidIntValue + 1000000000).substring(1));
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* loaded from: classes2.dex */
    public static class h implements e {
        public static final int[] a = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: b  reason: collision with root package name */
        public final l.c.a.w.i f9781b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9782c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9783d;

        /* renamed from: e  reason: collision with root package name */
        public final l.c.a.u.j f9784e;

        /* renamed from: f  reason: collision with root package name */
        public final int f9785f;

        public h(l.c.a.w.i iVar, int i2, int i3, l.c.a.u.j jVar) {
            this.f9781b = iVar;
            this.f9782c = i2;
            this.f9783d = i3;
            this.f9784e = jVar;
            this.f9785f = 0;
        }

        public h(l.c.a.w.i iVar, int i2, int i3, l.c.a.u.j jVar, int i4) {
            this.f9781b = iVar;
            this.f9782c = i2;
            this.f9783d = i3;
            this.f9784e = jVar;
            this.f9785f = i4;
        }

        public h a() {
            return this.f9785f == -1 ? this : new h(this.f9781b, this.f9782c, this.f9783d, this.f9784e, -1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
            if (r4 != 4) goto L20;
         */
        @Override // l.c.a.u.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean print(l.c.a.u.f r12, java.lang.StringBuilder r13) {
            /*
                r11 = this;
                l.c.a.w.i r0 = r11.f9781b
                java.lang.Long r0 = r12.b(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                long r2 = r0.longValue()
                l.c.a.u.h r12 = r12.f9796c
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L19
                java.lang.String r0 = "9223372036854775808"
                goto L21
            L19:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L21:
                int r4 = r0.length()
                int r5 = r11.f9783d
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto La7
                java.lang.String r0 = r12.a(r0)
                r4 = 0
                r8 = 4
                r9 = 1
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 < 0) goto L5f
                l.c.a.u.j r4 = r11.f9784e
                int r4 = r4.ordinal()
                if (r4 == r9) goto L59
                if (r4 == r8) goto L44
                goto L92
            L44:
                int r4 = r11.f9782c
                r5 = 19
                if (r4 >= r5) goto L92
                int[] r5 = l.c.a.u.b.h.a
                r4 = r5[r4]
                long r4 = (long) r4
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L92
                char r2 = r12.f9799c
                r13.append(r2)
                goto L92
            L59:
                char r2 = r12.f9799c
                r13.append(r2)
                goto L92
            L5f:
                l.c.a.u.j r4 = r11.f9784e
                int r4 = r4.ordinal()
                if (r4 == 0) goto L8d
                if (r4 == r9) goto L8d
                r5 = 3
                if (r4 == r5) goto L6f
                if (r4 == r8) goto L8d
                goto L92
            L6f:
                l.c.a.a r12 = new l.c.a.a
                java.lang.StringBuilder r13 = e.a.d.a.a.y(r7)
                l.c.a.w.i r0 = r11.f9781b
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L8d:
                char r2 = r12.f9800d
                r13.append(r2)
            L92:
                int r2 = r11.f9782c
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto La3
                char r2 = r12.f9798b
                r13.append(r2)
                int r1 = r1 + 1
                goto L92
            La3:
                r13.append(r0)
                return r9
            La7:
                l.c.a.a r12 = new l.c.a.a
                java.lang.StringBuilder r13 = e.a.d.a.a.y(r7)
                l.c.a.w.i r0 = r11.f9781b
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r13.append(r0)
                int r0 = r11.f9783d
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                goto Lcb
            Lca:
                throw r12
            Lcb:
                goto Lca
            */
            throw new UnsupportedOperationException("Method not decompiled: l.c.a.u.b.h.print(l.c.a.u.f, java.lang.StringBuilder):boolean");
        }

        public String toString() {
            int i2 = this.f9782c;
            if (i2 == 1 && this.f9783d == 19 && this.f9784e == l.c.a.u.j.NORMAL) {
                StringBuilder y = e.a.d.a.a.y("Value(");
                y.append(this.f9781b);
                y.append(")");
                return y.toString();
            } else if (i2 == this.f9783d && this.f9784e == l.c.a.u.j.NOT_NEGATIVE) {
                StringBuilder y2 = e.a.d.a.a.y("Value(");
                y2.append(this.f9781b);
                y2.append(",");
                return e.a.d.a.a.p(y2, this.f9782c, ")");
            } else {
                StringBuilder y3 = e.a.d.a.a.y("Value(");
                y3.append(this.f9781b);
                y3.append(",");
                y3.append(this.f9782c);
                y3.append(",");
                y3.append(this.f9783d);
                y3.append(",");
                y3.append(this.f9784e);
                y3.append(")");
                return y3.toString();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements e {
        public static final String[] a = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: b  reason: collision with root package name */
        public static final i f9786b = new i("Z", "+HH:MM:ss");

        /* renamed from: c  reason: collision with root package name */
        public final String f9787c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9788d;

        static {
            new i("0", "+HH:MM:ss");
        }

        public i(String str, String str2) {
            w.k0(str, "noOffsetText");
            w.k0(str2, "pattern");
            this.f9787c = str;
            int i2 = 0;
            while (true) {
                String[] strArr = a;
                if (i2 >= strArr.length) {
                    throw new IllegalArgumentException(e.a.d.a.a.k("Invalid zone offset pattern: ", str2));
                }
                if (strArr[i2].equals(str2)) {
                    this.f9788d = i2;
                    return;
                }
                i2++;
            }
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            Long b2 = fVar.b(l.c.a.w.a.OFFSET_SECONDS);
            if (b2 == null) {
                return false;
            }
            int s0 = w.s0(b2.longValue());
            if (s0 == 0) {
                sb.append(this.f9787c);
            } else {
                int abs = Math.abs((s0 / 3600) % 100);
                int abs2 = Math.abs((s0 / 60) % 60);
                int abs3 = Math.abs(s0 % 60);
                int length = sb.length();
                sb.append(s0 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f9788d;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    sb.append(i2 % 2 == 0 ? ":" : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i3 = this.f9788d;
                    if (i3 >= 7 || (i3 >= 5 && abs3 > 0)) {
                        sb.append(i3 % 2 != 0 ? "" : ":");
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.f9787c);
                }
            }
            return true;
        }

        public String toString() {
            return e.a.d.a.a.t(e.a.d.a.a.y("Offset("), a[this.f9788d], ",'", this.f9787c.replace("'", "''"), "')");
        }
    }

    /* loaded from: classes2.dex */
    public enum j implements e {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public int parse(l.c.a.u.c cVar, CharSequence charSequence, int i2) {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            return i2;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return "ParseStrict(false)";
                        }
                        throw new IllegalStateException("Unreachable");
                    }
                    return "ParseStrict(true)";
                }
                return "ParseCaseSensitive(false)";
            }
            return "ParseCaseSensitive(true)";
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements e {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            return e.a.d.a.a.l("'", this.a.replace("'", "''"), "'");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements e {
        public final l.c.a.w.i a;

        /* renamed from: b  reason: collision with root package name */
        public final l.c.a.u.l f9789b;

        /* renamed from: c  reason: collision with root package name */
        public final l.c.a.u.g f9790c;

        /* renamed from: d  reason: collision with root package name */
        public volatile h f9791d;

        public l(l.c.a.w.i iVar, l.c.a.u.l lVar, l.c.a.u.g gVar) {
            this.a = iVar;
            this.f9789b = lVar;
            this.f9790c = gVar;
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            Long b2 = fVar.b(this.a);
            if (b2 == null) {
                return false;
            }
            String a = this.f9790c.a(this.a, b2.longValue(), this.f9789b, fVar.f9795b);
            if (a != null) {
                sb.append(a);
                return true;
            }
            if (this.f9791d == null) {
                this.f9791d = new h(this.a, 1, 19, l.c.a.u.j.NORMAL);
            }
            return this.f9791d.print(fVar, sb);
        }

        public String toString() {
            if (this.f9789b == l.c.a.u.l.FULL) {
                StringBuilder y = e.a.d.a.a.y("Text(");
                y.append(this.a);
                y.append(")");
                return y.toString();
            }
            StringBuilder y2 = e.a.d.a.a.y("Text(");
            y2.append(this.a);
            y2.append(",");
            y2.append(this.f9789b);
            y2.append(")");
            return y2.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements e {
        public m(l.c.a.w.k<p> kVar, String str) {
        }

        @Override // l.c.a.u.b.e
        public boolean print(l.c.a.u.f fVar, StringBuilder sb) {
            Object query = fVar.a.query(b.a);
            if (query == null && fVar.f9797d == 0) {
                StringBuilder y = e.a.d.a.a.y("Unable to extract value: ");
                y.append(fVar.a.getClass());
                throw new l.c.a.a(y.toString());
            }
            p pVar = (p) query;
            if (pVar == null) {
                return false;
            }
            sb.append(pVar.u());
            return true;
        }

        public String toString() {
            return "ZoneRegionId()";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9770b = hashMap;
        hashMap.put('G', l.c.a.w.a.ERA);
        hashMap.put('y', l.c.a.w.a.YEAR_OF_ERA);
        hashMap.put('u', l.c.a.w.a.YEAR);
        l.c.a.w.i iVar = l.c.a.w.c.a;
        hashMap.put('Q', iVar);
        hashMap.put('q', iVar);
        l.c.a.w.a aVar = l.c.a.w.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', l.c.a.w.a.DAY_OF_YEAR);
        hashMap.put('d', l.c.a.w.a.DAY_OF_MONTH);
        hashMap.put('F', l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        l.c.a.w.a aVar2 = l.c.a.w.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', l.c.a.w.a.AMPM_OF_DAY);
        hashMap.put('H', l.c.a.w.a.HOUR_OF_DAY);
        hashMap.put('k', l.c.a.w.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', l.c.a.w.a.HOUR_OF_AMPM);
        hashMap.put('h', l.c.a.w.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', l.c.a.w.a.MINUTE_OF_HOUR);
        hashMap.put('s', l.c.a.w.a.SECOND_OF_MINUTE);
        l.c.a.w.a aVar3 = l.c.a.w.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', l.c.a.w.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', l.c.a.w.a.NANO_OF_DAY);
    }

    public b() {
        this.f9771c = this;
        this.f9773e = new ArrayList();
        this.f9775g = -1;
        this.f9772d = null;
        this.f9774f = false;
    }

    public b(b bVar, boolean z) {
        this.f9771c = this;
        this.f9773e = new ArrayList();
        this.f9775g = -1;
        this.f9772d = bVar;
        this.f9774f = z;
    }

    public b a(l.c.a.u.a aVar) {
        w.k0(aVar, "formatter");
        d dVar = aVar.f9763f;
        if (dVar.f9777b) {
            dVar = new d(dVar.a, false);
        }
        b(dVar);
        return this;
    }

    public final int b(e eVar) {
        w.k0(eVar, "pp");
        b bVar = this.f9771c;
        Objects.requireNonNull(bVar);
        bVar.f9773e.add(eVar);
        b bVar2 = this.f9771c;
        bVar2.f9775g = -1;
        return bVar2.f9773e.size() - 1;
    }

    public b c(char c2) {
        b(new c(c2));
        return this;
    }

    public b d(String str) {
        w.k0(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                b(new c(str.charAt(0)));
            } else {
                b(new k(str));
            }
        }
        return this;
    }

    public b e(l.c.a.w.i iVar, Map<Long, String> map) {
        w.k0(iVar, "field");
        w.k0(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        l.c.a.u.l lVar = l.c.a.u.l.FULL;
        b(new l(iVar, lVar, new C0214b(this, new k.b(Collections.singletonMap(lVar, linkedHashMap)))));
        return this;
    }

    public b f(l.c.a.w.i iVar, l.c.a.u.l lVar) {
        w.k0(iVar, "field");
        w.k0(lVar, "textStyle");
        AtomicReference<l.c.a.u.g> atomicReference = l.c.a.u.g.a;
        b(new l(iVar, lVar, g.a.a));
        return this;
    }

    public final b g(h hVar) {
        h a2;
        b bVar = this.f9771c;
        int i2 = bVar.f9775g;
        if (i2 < 0 || !(bVar.f9773e.get(i2) instanceof h)) {
            this.f9771c.f9775g = b(hVar);
        } else {
            b bVar2 = this.f9771c;
            int i3 = bVar2.f9775g;
            h hVar2 = (h) bVar2.f9773e.get(i3);
            int i4 = hVar.f9782c;
            int i5 = hVar.f9783d;
            if (i4 == i5 && hVar.f9784e == l.c.a.u.j.NOT_NEGATIVE) {
                a2 = new h(hVar2.f9781b, hVar2.f9782c, hVar2.f9783d, hVar2.f9784e, hVar2.f9785f + i5);
                b(hVar.a());
                this.f9771c.f9775g = i3;
            } else {
                a2 = hVar2.a();
                this.f9771c.f9775g = b(hVar);
            }
            this.f9771c.f9773e.set(i3, a2);
        }
        return this;
    }

    public b h(l.c.a.w.i iVar, int i2) {
        w.k0(iVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException(e.a.d.a.a.e("The width must be from 1 to 19 inclusive but was ", i2));
        }
        g(new h(iVar, i2, i2, l.c.a.u.j.NOT_NEGATIVE));
        return this;
    }

    public b i(l.c.a.w.i iVar, int i2, int i3, l.c.a.u.j jVar) {
        if (i2 == i3 && jVar == l.c.a.u.j.NOT_NEGATIVE) {
            h(iVar, i3);
            return this;
        }
        w.k0(iVar, "field");
        w.k0(jVar, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException(e.a.d.a.a.e("The minimum width must be from 1 to 19 inclusive but was ", i2));
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException(e.a.d.a.a.e("The maximum width must be from 1 to 19 inclusive but was ", i3));
        }
        if (i3 >= i2) {
            g(new h(iVar, i2, i3, jVar));
            return this;
        }
        throw new IllegalArgumentException(e.a.d.a.a.g("The maximum width must exceed or equal the minimum width but ", i3, " < ", i2));
    }

    public b j() {
        b bVar = this.f9771c;
        if (bVar.f9772d != null) {
            if (bVar.f9773e.size() > 0) {
                b bVar2 = this.f9771c;
                d dVar = new d(bVar2.f9773e, bVar2.f9774f);
                this.f9771c = this.f9771c.f9772d;
                b(dVar);
            } else {
                this.f9771c = this.f9771c.f9772d;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public b k() {
        b bVar = this.f9771c;
        bVar.f9775g = -1;
        this.f9771c = new b(bVar, true);
        return this;
    }

    public l.c.a.u.a l() {
        return m(Locale.getDefault());
    }

    public l.c.a.u.a m(Locale locale) {
        w.k0(locale, "locale");
        while (this.f9771c.f9772d != null) {
            j();
        }
        return new l.c.a.u.a(new d(this.f9773e, false), locale, l.c.a.u.h.a, l.c.a.u.i.SMART, null, null, null);
    }

    public l.c.a.u.a n(l.c.a.u.i iVar) {
        l.c.a.u.a l2 = l();
        Objects.requireNonNull(l2);
        w.k0(iVar, "resolverStyle");
        return w.C(l2.f9766i, iVar) ? l2 : new l.c.a.u.a(l2.f9763f, l2.f9764g, l2.f9765h, iVar, l2.f9767j, l2.f9768k, l2.f9769l);
    }
}
