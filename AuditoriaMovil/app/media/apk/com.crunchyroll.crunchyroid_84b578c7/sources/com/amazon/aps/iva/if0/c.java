package com.amazon.aps.iva.if0;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
/* compiled from: JSONObject.java */
/* loaded from: classes4.dex */
public class c {
    public static final Object NULL = new a();
    private final Map<String, Object> map;

    public c() {
        this.map = new HashMap();
    }

    public static String doubleToString(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            String d2 = Double.toString(d);
            if (d2.indexOf(46) > 0 && d2.indexOf(101) < 0 && d2.indexOf(69) < 0) {
                while (d2.endsWith("0")) {
                    d2 = d2.substring(0, d2.length() - 1);
                }
                if (d2.endsWith(".")) {
                    return d2.substring(0, d2.length() - 1);
                }
                return d2;
            }
            return d2;
        }
        return "null";
    }

    public static String[] getNames(c cVar) {
        int length = cVar.length();
        if (length == 0) {
            return null;
        }
        return (String[]) cVar.keySet().toArray(new String[length]);
    }

    public static final void indent(Writer writer, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            writer.write(32);
        }
    }

    public static boolean isDecimalNotation(String str) {
        if (str.indexOf(46) <= -1 && str.indexOf(101) <= -1 && str.indexOf(69) <= -1 && !"-0".equals(str)) {
            return false;
        }
        return true;
    }

    public static String numberToString(Number number) throws b {
        if (number != null) {
            testValidity(number);
            String obj = number.toString();
            if (obj.indexOf(46) > 0 && obj.indexOf(101) < 0 && obj.indexOf(69) < 0) {
                while (obj.endsWith("0")) {
                    obj = obj.substring(0, obj.length() - 1);
                }
                if (obj.endsWith(".")) {
                    return obj.substring(0, obj.length() - 1);
                }
                return obj;
            }
            return obj;
        }
        throw new b("Null pointer");
    }

    private void populateMap(Object obj) {
        boolean z;
        Method[] declaredMethods;
        String substring;
        Class<?> cls = obj.getClass();
        if (cls.getClassLoader() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            declaredMethods = cls.getMethods();
        } else {
            declaredMethods = cls.getDeclaredMethods();
        }
        for (Method method : declaredMethods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && method.getParameterTypes().length == 0 && !method.isBridge() && method.getReturnType() != Void.TYPE) {
                String name = method.getName();
                if (name.startsWith("get")) {
                    if (!"getClass".equals(name) && !"getDeclaringClass".equals(name)) {
                        substring = name.substring(3);
                    }
                } else if (name.startsWith("is")) {
                    substring = name.substring(2);
                }
                if (substring.length() > 0 && Character.isUpperCase(substring.charAt(0))) {
                    if (substring.length() == 1) {
                        substring = substring.toLowerCase(Locale.ROOT);
                    } else if (!Character.isUpperCase(substring.charAt(1))) {
                        substring = substring.substring(0, 1).toLowerCase(Locale.ROOT) + substring.substring(1);
                    }
                    try {
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (invoke != null) {
                            this.map.put(substring, wrap(invoke));
                            if (invoke instanceof Closeable) {
                                ((Closeable) invoke).close();
                            }
                        }
                    } catch (IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                    }
                }
            }
        }
    }

    public static String quote(String str) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                try {
                    obj = quote(str, stringWriter).toString();
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static Number stringToNumber(String str) throws NumberFormatException {
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            if (isDecimalNotation(str)) {
                if (str.length() > 14) {
                    return new BigDecimal(str);
                }
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                    return valueOf;
                }
                return new BigDecimal(str);
            }
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 31) {
                return Integer.valueOf(bigInteger.intValue());
            }
            if (bigInteger.bitLength() <= 63) {
                return Long.valueOf(bigInteger.longValue());
            }
            return bigInteger;
        }
        throw new NumberFormatException(defpackage.e.e("val [", str, "] is not a valid number."));
    }

    public static Object stringToValue(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("null")) {
            return NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            try {
                if (isDecimalNotation(str)) {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite() && !valueOf.isNaN()) {
                        return valueOf;
                    }
                } else {
                    Long valueOf2 = Long.valueOf(str);
                    if (str.equals(valueOf2.toString())) {
                        if (valueOf2.longValue() == valueOf2.intValue()) {
                            return Integer.valueOf(valueOf2.intValue());
                        }
                        return valueOf2;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static void testValidity(Object obj) throws b {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new b("JSON does not allow non-finite numbers.");
                }
            } else if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new b("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public static String valueToString(Object obj) throws b {
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof f) {
                try {
                    String a2 = ((f) obj).a();
                    if (!(a2 instanceof String)) {
                        throw new b("Bad value from toJSONString: " + ((Object) a2));
                    }
                    return a2;
                } catch (Exception e) {
                    throw new b(e);
                }
            } else if (obj instanceof Number) {
                String numberToString = numberToString((Number) obj);
                try {
                    new BigDecimal(numberToString);
                    return numberToString;
                } catch (NumberFormatException unused) {
                    return quote(numberToString);
                }
            } else if (!(obj instanceof Boolean) && !(obj instanceof c) && !(obj instanceof com.amazon.aps.iva.if0.a)) {
                if (obj instanceof Map) {
                    return new c((Map<?, ?>) obj).toString();
                }
                if (obj instanceof Collection) {
                    return new com.amazon.aps.iva.if0.a((Collection<?>) obj).toString();
                }
                if (obj.getClass().isArray()) {
                    return new com.amazon.aps.iva.if0.a(obj).toString();
                }
                if (obj instanceof Enum) {
                    return quote(((Enum) obj).name());
                }
                return quote(obj.toString());
            } else {
                return obj.toString();
            }
        }
        return "null";
    }

    public static Object wrap(Object obj) {
        String str;
        try {
            if (obj == null) {
                return NULL;
            }
            if (!(obj instanceof c) && !(obj instanceof com.amazon.aps.iva.if0.a) && !NULL.equals(obj) && !(obj instanceof f) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof BigInteger) && !(obj instanceof BigDecimal) && !(obj instanceof Enum)) {
                if (obj instanceof Collection) {
                    return new com.amazon.aps.iva.if0.a((Collection<?>) obj);
                }
                if (obj.getClass().isArray()) {
                    return new com.amazon.aps.iva.if0.a(obj);
                }
                if (obj instanceof Map) {
                    return new c((Map<?, ?>) obj);
                }
                Package r0 = obj.getClass().getPackage();
                if (r0 != null) {
                    str = r0.getName();
                } else {
                    str = "";
                }
                if (!str.startsWith("java.") && !str.startsWith("javax.") && obj.getClass().getClassLoader() != null) {
                    return new c(obj);
                }
                return obj.toString();
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Writer writeValue(Writer writer, Object obj, int i, int i2) throws b, IOException {
        String quote;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof f) {
                try {
                    String a2 = ((f) obj).a();
                    if (a2 != null) {
                        quote = a2.toString();
                    } else {
                        quote = quote(obj.toString());
                    }
                    writer.write(quote);
                } catch (Exception e) {
                    throw new b(e);
                }
            } else if (obj instanceof Number) {
                String numberToString = numberToString((Number) obj);
                try {
                    new BigDecimal(numberToString);
                    writer.write(numberToString);
                } catch (NumberFormatException unused) {
                    quote(numberToString, writer);
                }
            } else if (obj instanceof Boolean) {
                writer.write(obj.toString());
            } else if (obj instanceof Enum) {
                writer.write(quote(((Enum) obj).name()));
            } else if (obj instanceof c) {
                ((c) obj).write(writer, i, i2);
            } else if (obj instanceof com.amazon.aps.iva.if0.a) {
                ((com.amazon.aps.iva.if0.a) obj).r(writer, i, i2);
            } else if (obj instanceof Map) {
                new c((Map<?, ?>) obj).write(writer, i, i2);
            } else if (obj instanceof Collection) {
                new com.amazon.aps.iva.if0.a((Collection<?>) obj).r(writer, i, i2);
            } else if (obj.getClass().isArray()) {
                new com.amazon.aps.iva.if0.a(obj).r(writer, i, i2);
            } else {
                quote(obj.toString(), writer);
            }
        } else {
            writer.write("null");
        }
        return writer;
    }

    public c accumulate(String str, Object obj) throws b {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            if (obj instanceof com.amazon.aps.iva.if0.a) {
                com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                aVar.b.add(obj);
                obj = aVar;
            }
            put(str, obj);
        } else if (opt instanceof com.amazon.aps.iva.if0.a) {
            ((com.amazon.aps.iva.if0.a) opt).put(obj);
        } else {
            com.amazon.aps.iva.if0.a aVar2 = new com.amazon.aps.iva.if0.a();
            ArrayList<Object> arrayList = aVar2.b;
            arrayList.add(opt);
            arrayList.add(obj);
            put(str, aVar2);
        }
        return this;
    }

    public c append(String str, Object obj) throws b {
        testValidity(obj);
        Object opt = opt(str);
        if (opt == null) {
            com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
            aVar.b.add(obj);
            put(str, aVar);
        } else if (opt instanceof com.amazon.aps.iva.if0.a) {
            com.amazon.aps.iva.if0.a aVar2 = (com.amazon.aps.iva.if0.a) opt;
            aVar2.b.add(obj);
            put(str, aVar2);
        } else {
            throw new b(defpackage.e.e("JSONObject[", str, "] is not a JSONArray."));
        }
        return this;
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public Object get(String str) throws b {
        if (str != null) {
            Object opt = opt(str);
            if (opt != null) {
                return opt;
            }
            throw new b("JSONObject[" + quote(str) + "] not found.");
        }
        throw new b("Null key.");
    }

    public BigDecimal getBigDecimal(String str) throws b {
        Object obj = get(str);
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        try {
            return new BigDecimal(obj.toString());
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] could not be converted to BigDecimal.", e);
        }
    }

    public BigInteger getBigInteger(String str) throws b {
        try {
            return new BigInteger(get(str).toString());
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] could not be converted to BigInteger.", e);
        }
    }

    public boolean getBoolean(String str) throws b {
        Object obj = get(str);
        if (!obj.equals(Boolean.FALSE)) {
            boolean z = obj instanceof String;
            if (!z || !((String) obj).equalsIgnoreCase("false")) {
                if (!obj.equals(Boolean.TRUE)) {
                    if (!z || !((String) obj).equalsIgnoreCase("true")) {
                        throw new b("JSONObject[" + quote(str) + "] is not a Boolean.");
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public double getDouble(String str) throws b {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).doubleValue();
            }
            return Double.parseDouble(obj.toString());
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] is not a number.", e);
        }
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, String str) throws b {
        E e = (E) optEnum(cls, str);
        if (e != null) {
            return e;
        }
        throw new b("JSONObject[" + quote(str) + "] is not an enum of type " + quote(cls.getSimpleName()) + ".");
    }

    public float getFloat(String str) throws b {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).floatValue();
            }
            return Float.parseFloat(obj.toString());
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] is not a number.", e);
        }
    }

    public int getInt(String str) throws b {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return Integer.parseInt((String) obj);
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] is not an int.", e);
        }
    }

    public com.amazon.aps.iva.if0.a getJSONArray(String str) throws b {
        Object obj = get(str);
        if (obj instanceof com.amazon.aps.iva.if0.a) {
            return (com.amazon.aps.iva.if0.a) obj;
        }
        throw new b("JSONObject[" + quote(str) + "] is not a JSONArray.");
    }

    public c getJSONObject(String str) throws b {
        Object obj = get(str);
        if (obj instanceof c) {
            return (c) obj;
        }
        throw new b("JSONObject[" + quote(str) + "] is not a JSONObject.");
    }

    public long getLong(String str) throws b {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] is not a long.", e);
        }
    }

    public Number getNumber(String str) throws b {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return (Number) obj;
            }
            return stringToNumber(obj.toString());
        } catch (Exception e) {
            throw new b("JSONObject[" + quote(str) + "] is not a number.", e);
        }
    }

    public String getString(String str) throws b {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new b("JSONObject[" + quote(str) + "] not a string.");
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public c increment(String str) throws b {
        Object opt = opt(str);
        if (opt == null) {
            put(str, 1);
        } else if (opt instanceof BigInteger) {
            put(str, ((BigInteger) opt).add(BigInteger.ONE));
        } else if (opt instanceof BigDecimal) {
            put(str, ((BigDecimal) opt).add(BigDecimal.ONE));
        } else if (opt instanceof Integer) {
            put(str, ((Integer) opt).intValue() + 1);
        } else if (opt instanceof Long) {
            put(str, ((Long) opt).longValue() + 1);
        } else if (opt instanceof Double) {
            put(str, ((Double) opt).doubleValue() + 1.0d);
        } else if (opt instanceof Float) {
            put(str, ((Float) opt).floatValue() + 1.0f);
        } else {
            throw new b("Unable to increment [" + quote(str) + "].");
        }
        return this;
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Set<String> keySet() {
        return this.map.keySet();
    }

    public Iterator<String> keys() {
        return keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public com.amazon.aps.iva.if0.a names() {
        if (this.map.isEmpty()) {
            return null;
        }
        return new com.amazon.aps.iva.if0.a((Collection<?>) this.map.keySet());
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    public BigDecimal optBigDecimal(String str, BigDecimal bigDecimal) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return bigDecimal;
        }
        if (opt instanceof BigDecimal) {
            return (BigDecimal) opt;
        }
        if (opt instanceof BigInteger) {
            return new BigDecimal((BigInteger) opt);
        }
        if (!(opt instanceof Double) && !(opt instanceof Float)) {
            if (!(opt instanceof Long) && !(opt instanceof Integer) && !(opt instanceof Short) && !(opt instanceof Byte)) {
                try {
                    return new BigDecimal(opt.toString());
                } catch (Exception unused) {
                    return bigDecimal;
                }
            }
            return new BigDecimal(((Number) opt).longValue());
        }
        return new BigDecimal(((Number) opt).doubleValue());
    }

    public BigInteger optBigInteger(String str, BigInteger bigInteger) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return bigInteger;
        }
        if (opt instanceof BigInteger) {
            return (BigInteger) opt;
        }
        if (opt instanceof BigDecimal) {
            return ((BigDecimal) opt).toBigInteger();
        }
        if (!(opt instanceof Double) && !(opt instanceof Float)) {
            if (!(opt instanceof Long) && !(opt instanceof Integer) && !(opt instanceof Short) && !(opt instanceof Byte)) {
                try {
                    String obj = opt.toString();
                    if (isDecimalNotation(obj)) {
                        return new BigDecimal(obj).toBigInteger();
                    }
                    return new BigInteger(obj);
                } catch (Exception unused) {
                    return bigInteger;
                }
            }
            return BigInteger.valueOf(((Number) opt).longValue());
        }
        return new BigDecimal(((Number) opt).doubleValue()).toBigInteger();
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str) {
        return (E) optEnum(cls, str, null);
    }

    public float optFloat(String str) {
        return optFloat(str, Float.NaN);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public com.amazon.aps.iva.if0.a optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof com.amazon.aps.iva.if0.a) {
            return (com.amazon.aps.iva.if0.a) opt;
        }
        return null;
    }

    public c optJSONObject(String str) {
        Object opt = opt(str);
        if (opt instanceof c) {
            return (c) opt;
        }
        return null;
    }

    public long optLong(String str) {
        return optLong(str, 0L);
    }

    public Number optNumber(String str) {
        return optNumber(str, null);
    }

    public Object optQuery(String str) {
        return optQuery(new d(str));
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public c put(String str, boolean z) throws b {
        put(str, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public c putOnce(String str, Object obj) throws b {
        if (str != null && obj != null) {
            if (opt(str) == null) {
                put(str, obj);
            } else {
                throw new b(defpackage.e.e("Duplicate key \"", str, "\""));
            }
        }
        return this;
    }

    public c putOpt(String str, Object obj) throws b {
        if (str != null && obj != null) {
            put(str, obj);
        }
        return this;
    }

    public Object query(String str) {
        return query(new d(str));
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public boolean similar(Object obj) {
        try {
            if (!(obj instanceof c) || !keySet().equals(((c) obj).keySet())) {
                return false;
            }
            for (Map.Entry<String, Object> entry : entrySet()) {
                Object value = entry.getValue();
                Object obj2 = ((c) obj).get(entry.getKey());
                if (value != obj2) {
                    if (value == null) {
                        return false;
                    }
                    if (value instanceof c) {
                        if (!((c) value).similar(obj2)) {
                            return false;
                        }
                    } else if (value instanceof com.amazon.aps.iva.if0.a) {
                        if (!((com.amazon.aps.iva.if0.a) value).p(obj2)) {
                            return false;
                        }
                    } else if (!value.equals(obj2)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public com.amazon.aps.iva.if0.a toJSONArray(com.amazon.aps.iva.if0.a aVar) throws b {
        if (aVar != null && aVar.e() != 0) {
            com.amazon.aps.iva.if0.a aVar2 = new com.amazon.aps.iva.if0.a();
            for (int i = 0; i < aVar.e(); i++) {
                aVar2.put(opt(aVar.d(i)));
            }
            return aVar2;
        }
        return null;
    }

    public Map<String, Object> toMap() {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : entrySet()) {
            if (entry.getValue() != null && !NULL.equals(entry.getValue())) {
                if (entry.getValue() instanceof c) {
                    obj = ((c) entry.getValue()).toMap();
                } else if (entry.getValue() instanceof com.amazon.aps.iva.if0.a) {
                    obj = ((com.amazon.aps.iva.if0.a) entry.getValue()).q();
                } else {
                    obj = entry.getValue();
                }
            } else {
                obj = null;
            }
            hashMap.put(entry.getKey(), obj);
        }
        return hashMap;
    }

    public String toString() {
        try {
            return toString(0);
        } catch (Exception unused) {
            return null;
        }
    }

    public Writer write(Writer writer) throws b {
        return write(writer, 0, 0);
    }

    public boolean optBoolean(String str, boolean z) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return z;
        }
        if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        }
        try {
            return getBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public double optDouble(String str, double d) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return d;
        }
        if (opt instanceof Number) {
            return ((Number) opt).doubleValue();
        }
        if (opt instanceof String) {
            try {
                return Double.parseDouble((String) opt);
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public <E extends Enum<E>> E optEnum(Class<E> cls, String str, E e) {
        try {
            Object opt = opt(str);
            if (NULL.equals(opt)) {
                return e;
            }
            if (cls.isAssignableFrom(opt.getClass())) {
                return (E) opt;
            }
            return (E) Enum.valueOf(cls, opt.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            return e;
        }
    }

    public float optFloat(String str, float f) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return f;
        }
        if (opt instanceof Number) {
            return ((Number) opt).floatValue();
        }
        if (opt instanceof String) {
            try {
                return Float.parseFloat((String) opt);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public int optInt(String str, int i) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return i;
        }
        if (opt instanceof Number) {
            return ((Number) opt).intValue();
        }
        if (opt instanceof String) {
            try {
                return new BigDecimal((String) opt).intValue();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public long optLong(String str, long j) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return j;
        }
        if (opt instanceof Number) {
            return ((Number) opt).longValue();
        }
        if (opt instanceof String) {
            try {
                return new BigDecimal((String) opt).longValue();
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public Number optNumber(String str, Number number) {
        Object opt = opt(str);
        if (NULL.equals(opt)) {
            return number;
        }
        if (opt instanceof Number) {
            return (Number) opt;
        }
        if (opt instanceof String) {
            try {
                return stringToNumber((String) opt);
            } catch (Exception unused) {
            }
        }
        return number;
    }

    public Object optQuery(d dVar) {
        try {
            return dVar.a(this);
        } catch (e unused) {
            return null;
        }
    }

    public String optString(String str, String str2) {
        Object opt = opt(str);
        return NULL.equals(opt) ? str2 : opt.toString();
    }

    public c put(String str, Collection<?> collection) throws b {
        put(str, new com.amazon.aps.iva.if0.a(collection));
        return this;
    }

    public Object query(d dVar) {
        return dVar.a(this);
    }

    public String toString(int i) throws b {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            obj = write(stringWriter, i, 0).toString();
        }
        return obj;
    }

    public Writer write(Writer writer, int i, int i2) throws b {
        try {
            int length = length();
            writer.write(123);
            if (length == 1) {
                Map.Entry<String, Object> next = entrySet().iterator().next();
                String key = next.getKey();
                writer.write(quote(key));
                writer.write(58);
                if (i > 0) {
                    writer.write(32);
                }
                try {
                    writeValue(writer, next.getValue(), i, i2);
                    writer.write(125);
                    return writer;
                } catch (Exception e) {
                    throw new b("Unable to write JSONObject value for key: " + key, e);
                }
            }
            if (length != 0) {
                int i3 = i2 + i;
                boolean z = false;
                for (Map.Entry<String, Object> entry : entrySet()) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i > 0) {
                        writer.write(10);
                    }
                    indent(writer, i3);
                    String key2 = entry.getKey();
                    writer.write(quote(key2));
                    writer.write(58);
                    if (i > 0) {
                        writer.write(32);
                    }
                    try {
                        writeValue(writer, entry.getValue(), i, i3);
                        z = true;
                    } catch (Exception e2) {
                        throw new b("Unable to write JSONObject value for key: " + key2, e2);
                    }
                }
                if (i > 0) {
                    writer.write(10);
                }
                indent(writer, i2);
            }
            writer.write(125);
            return writer;
        } catch (IOException e3) {
            throw new b(e3);
        }
    }

    public c(c cVar, String[] strArr) {
        this(strArr.length);
        for (String str : strArr) {
            try {
                putOnce(str, cVar.opt(str));
            } catch (Exception unused) {
            }
        }
    }

    public static String[] getNames(Object obj) {
        Field[] fields;
        int length;
        if (obj == null || (length = (fields = obj.getClass().getFields()).length) == 0) {
            return null;
        }
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = fields[i].getName();
        }
        return strArr;
    }

    public c put(String str, double d) throws b {
        put(str, Double.valueOf(d));
        return this;
    }

    public c put(String str, float f) throws b {
        put(str, Float.valueOf(f));
        return this;
    }

    public c put(String str, int i) throws b {
        put(str, Integer.valueOf(i));
        return this;
    }

    public c(g gVar) throws b {
        this();
        if (gVar.c() != '{') {
            throw gVar.e("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c = gVar.c();
            if (c == 0) {
                throw gVar.e("A JSONObject text must end with '}'");
            }
            if (c == '}') {
                return;
            }
            gVar.a();
            String obj = gVar.d().toString();
            if (gVar.c() == ':') {
                if (obj != null) {
                    if (opt(obj) == null) {
                        Object d = gVar.d();
                        if (d != null) {
                            put(obj, d);
                        }
                    } else {
                        throw gVar.e("Duplicate key \"" + obj + "\"");
                    }
                }
                char c2 = gVar.c();
                if (c2 != ',' && c2 != ';') {
                    if (c2 != '}') {
                        throw gVar.e("Expected a ',' or '}'");
                    }
                    return;
                } else if (gVar.c() == '}') {
                    return;
                } else {
                    gVar.a();
                }
            } else {
                throw gVar.e("Expected a ':' after a key");
            }
        }
    }

    public static Writer quote(String str, Writer writer) throws IOException {
        if (str != null && str.length() != 0) {
            int length = str.length();
            writer.write(34);
            int i = 0;
            char c = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '\f') {
                    writer.write("\\f");
                } else if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt == '/') {
                            if (c == '<') {
                                writer.write(92);
                            }
                            writer.write(charAt);
                        } else if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    writer.write("\\b");
                                    continue;
                                case '\t':
                                    writer.write("\\t");
                                    continue;
                                case '\n':
                                    writer.write("\\n");
                                    continue;
                                default:
                                    if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                        writer.write(charAt);
                                        continue;
                                    } else {
                                        writer.write("\\u");
                                        String hexString = Integer.toHexString(charAt);
                                        writer.write("0000", 0, 4 - hexString.length());
                                        writer.write(hexString);
                                        break;
                                    }
                            }
                        }
                    }
                    writer.write(92);
                    writer.write(charAt);
                } else {
                    writer.write("\\r");
                }
                i++;
                c = charAt;
            }
            writer.write(34);
            return writer;
        }
        writer.write("\"\"");
        return writer;
    }

    public c put(String str, long j) throws b {
        put(str, Long.valueOf(j));
        return this;
    }

    public c put(String str, Map<?, ?> map) throws b {
        put(str, new c(map));
        return this;
    }

    public c put(String str, Object obj) throws b {
        if (str != null) {
            if (obj != null) {
                testValidity(obj);
                this.map.put(str, obj);
            } else {
                remove(str);
            }
            return this;
        }
        throw new NullPointerException("Null key.");
    }

    /* compiled from: JSONObject.java */
    /* loaded from: classes4.dex */
    public static final class a {
        public final boolean equals(Object obj) {
            if (obj != null && obj != this) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }

        public final Object clone() {
            return this;
        }
    }

    public c(Map<?, ?> map) {
        if (map == null) {
            this.map = new HashMap();
            return;
        }
        this.map = new HashMap(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.map.put(String.valueOf(entry.getKey()), wrap(value));
            }
        }
    }

    public c(Object obj) {
        this();
        populateMap(obj);
    }

    public c(Object obj, String[] strArr) {
        this(strArr.length);
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception unused) {
            }
        }
    }

    public c(String str) throws b {
        this(new g(str));
    }

    public c(String str, Locale locale) throws b {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            if (nextElement != null) {
                String str2 = nextElement;
                String[] split = str2.split("\\.");
                int length = split.length - 1;
                c cVar = this;
                for (int i = 0; i < length; i++) {
                    String str3 = split[i];
                    c optJSONObject = cVar.optJSONObject(str3);
                    if (optJSONObject == null) {
                        optJSONObject = new c();
                        cVar.put(str3, optJSONObject);
                    }
                    cVar = optJSONObject;
                }
                cVar.put(split[length], bundle.getString(str2));
            }
        }
    }

    public c(int i) {
        this.map = new HashMap(i);
    }
}
