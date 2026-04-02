package bo.app;

import com.braze.enums.BrazeDateFormat;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Date;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class q3 implements u1 {
    private static final String f = BrazeLogger.getBrazeLogTag(q3.class);
    private final r3 b;
    private final String c;
    private final int d;
    private Object e;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r3.values().length];
            a = iArr;
            try {
                iArr[r3.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r3.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r3.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r3.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public q3(r3 r3Var, String str, int i) {
        this.b = r3Var;
        this.c = str;
        this.d = i;
    }

    private boolean b(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Double)) {
            if (this.d != 2) {
                return false;
            }
            return true;
        }
        double doubleValue = ((Number) obj).doubleValue();
        double doubleValue2 = ((Number) this.e).doubleValue();
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5 || doubleValue >= doubleValue2) {
                        return false;
                    }
                    return true;
                } else if (doubleValue <= doubleValue2) {
                    return false;
                } else {
                    return true;
                }
            } else if (doubleValue == doubleValue2) {
                return false;
            } else {
                return true;
            }
        } else if (doubleValue != doubleValue2) {
            return false;
        } else {
            return true;
        }
    }

    private boolean c(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.d;
            if (i != 2 && i != 17) {
                return false;
            }
            return true;
        }
        int i2 = this.d;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 10) {
                    if (i2 != 17) {
                        return false;
                    }
                    return !a((String) this.e, (String) obj);
                }
                return a((String) this.e, (String) obj);
            }
            return !obj.equals(this.e);
        }
        return obj.equals(this.e);
    }

    @Override // bo.app.u1
    public boolean a(l2 l2Var) {
        Object opt;
        if (l2Var instanceof n2) {
            BrazeProperties c = ((n2) l2Var).c();
            if (c != null) {
                try {
                    opt = c.forJsonPut().opt(this.c);
                } catch (Exception e) {
                    BrazeLogger.e(f, "Caught exception checking property filter condition.", e);
                    return false;
                }
            } else {
                opt = null;
            }
            if (opt == null) {
                int i = this.d;
                return i == 12 || i == 17 || i == 2;
            }
            int i2 = this.d;
            if (i2 == 11) {
                return true;
            }
            if (i2 == 12) {
                return false;
            }
            int i3 = a.a[this.b.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return false;
                        }
                        return b(opt);
                    }
                    return a(opt, l2Var.b());
                }
                return a(opt);
            }
            return c(opt);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: u */
    public com.amazon.aps.iva.if0.c forJsonPut() {
        com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
        try {
            if (!this.b.equals(r3.UNKNOWN)) {
                cVar.put("property_type", this.b.toString());
            }
            cVar.put("property_key", this.c);
            cVar.put("comparator", this.d);
            cVar.put("property_value", this.e);
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger.e(f, "Caught exception creating property filter Json.", e);
        }
        return cVar;
    }

    public q3(com.amazon.aps.iva.if0.c cVar) {
        this((r3) JsonUtils.optEnum(cVar, "property_type", r3.class, r3.UNKNOWN), cVar.getString("property_key"), cVar.getInt("comparator"));
        if (cVar.has("property_value")) {
            if (this.b.equals(r3.STRING)) {
                this.e = cVar.getString("property_value");
            } else if (this.b.equals(r3.BOOLEAN)) {
                this.e = Boolean.valueOf(cVar.getBoolean("property_value"));
            } else if (this.b.equals(r3.NUMBER)) {
                this.e = Double.valueOf(cVar.getDouble("property_value"));
            } else if (this.b.equals(r3.DATE)) {
                this.e = Long.valueOf(cVar.getLong("property_value"));
            }
        }
    }

    private boolean a(Object obj, long j) {
        Date date = null;
        if (obj instanceof String) {
            try {
                date = DateTimeUtils.parseDate((String) obj, BrazeDateFormat.LONG);
            } catch (Exception e) {
                BrazeLogger.e(f, "Caught exception trying to parse date in compareTimestamps", e);
            }
        }
        if (date == null) {
            return this.d == 2;
        }
        long timeFromEpochInSeconds = DateTimeUtils.getTimeFromEpochInSeconds(date);
        long longValue = ((Number) this.e).longValue();
        int i = this.d;
        if (i == 15) {
            return timeFromEpochInSeconds < j + longValue;
        } else if (i == 16) {
            return timeFromEpochInSeconds > j + longValue;
        } else {
            switch (i) {
                case 1:
                    return timeFromEpochInSeconds == longValue;
                case 2:
                    return timeFromEpochInSeconds != longValue;
                case 3:
                    return timeFromEpochInSeconds > longValue;
                case 4:
                    return timeFromEpochInSeconds >= j - longValue;
                case 5:
                    return timeFromEpochInSeconds < longValue;
                case 6:
                    return timeFromEpochInSeconds <= j - longValue;
                default:
                    return false;
            }
        }
    }

    private boolean a(Object obj) {
        if (!(obj instanceof Boolean)) {
            return this.d == 2;
        }
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return !obj.equals(this.e);
        }
        return obj.equals(this.e);
    }

    public static boolean a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}
