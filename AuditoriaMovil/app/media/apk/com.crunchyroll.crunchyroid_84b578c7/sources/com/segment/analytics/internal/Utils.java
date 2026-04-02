package com.segment.analytics.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.ParseException;
import android.net.Uri;
import android.os.Process;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.segment.analytics.Analytics;
import com.segment.analytics.integrations.Logger;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes4.dex */
public final class Utils {
    public static final String DEFAULT_API_HOST = "api.segment.io/v1";
    public static final boolean DEFAULT_COLLECT_DEVICE_ID = true;
    public static final int DEFAULT_FLUSH_INTERVAL = 30000;
    public static final int DEFAULT_FLUSH_QUEUE_SIZE = 20;
    private static final int PERMISSION_CHECK_REPEAT_MAX_COUNT = 2;
    public static final String THREAD_PREFIX = "Segment-";
    private static final Logger logger = Logger.with(Analytics.LogLevel.DEBUG);

    /* loaded from: classes4.dex */
    public static class AnalyticsNetworkExecutorService extends ThreadPoolExecutor {
        private static final int DEFAULT_THREAD_COUNT = 1;
        private static final int MAX_THREAD_COUNT = 2;

        public AnalyticsNetworkExecutorService() {
            super(1, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new AnalyticsThreadFactory());
        }
    }

    /* loaded from: classes4.dex */
    public static class AnalyticsThread extends Thread {
        private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger(1);

        public AnalyticsThread(Runnable runnable) {
            super(runnable, Utils.THREAD_PREFIX + SEQUENCE_GENERATOR.getAndIncrement());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes4.dex */
    public static class AnalyticsThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new AnalyticsThread(runnable);
        }
    }

    /* loaded from: classes4.dex */
    public static class NullableConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {
        public NullableConcurrentHashMap() {
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            if (k != null && v != null) {
                return (V) super.put(k, v);
            }
            return null;
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        public NullableConcurrentHashMap(Map<? extends K, ? extends V> map) {
            super(map);
        }
    }

    private Utils() {
        throw new AssertionError("No instances");
    }

    public static <T> T assertNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(a.f(str, " == null"));
    }

    public static String assertNotNullOrEmpty(String str, String str2) {
        if (isNullOrEmpty(str)) {
            throw new NullPointerException(a.f(str2, " cannot be null or empty"));
        }
        return str;
    }

    public static BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static float coerceToFloat(Object obj, float f) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj instanceof String) {
            try {
                return Float.valueOf((String) obj).floatValue();
            } catch (NumberFormatException unused) {
            }
        }
        return f;
    }

    public static void copySharedPreferences(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                edit.putString(key, (String) value);
            } else if (value instanceof Set) {
                edit.putStringSet(key, (Set) value);
            } else if (value instanceof Integer) {
                edit.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                edit.putLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                edit.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(key, ((Boolean) value).booleanValue());
            }
        }
        edit.apply();
    }

    public static void createDirectory(File file) throws IOException {
        if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Could not create directory at " + file);
        }
    }

    public static <T> Map<String, T> createMap() {
        return new NullableConcurrentHashMap();
    }

    private static int getIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str2, str, context.getPackageName());
    }

    public static InputStream getInputStream(HttpURLConnection httpURLConnection) throws IOException {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public static Uri getReferrer(Activity activity) {
        return activity.getReferrer();
    }

    private static Uri getReferrerCompatible(Activity activity) {
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            try {
                return Uri.parse(stringExtra);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static String getResourceString(Context context, String str) {
        int identifier = getIdentifier(context, "string", str);
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public static SharedPreferences getSegmentSharedPreferences(Context context, String str) {
        return context.getSharedPreferences("analytics-android-" + str, 0);
    }

    public static <T> T getSystemService(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    private static int getTrimmedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (length > i && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        return length - i;
    }

    public static boolean hasFeature(Context context, String str) {
        return context.getPackageManager().hasSystemFeature(str);
    }

    public static boolean hasPermission(Context context, String str) {
        return hasPermission(context, str, 0);
    }

    public static <K, V> Map<K, V> immutableCopyOf(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static boolean isConnected(Context context) {
        if (!hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(context, "connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean isEmptyOrBlank(CharSequence charSequence) {
        if (charSequence.length() != 0 && getTrimmedLength(charSequence) != 0) {
            return false;
        }
        return true;
    }

    public static boolean isNullOrEmpty(CharSequence charSequence) {
        return isEmpty(charSequence) || getTrimmedLength(charSequence) == 0;
    }

    public static boolean isOnClassPath(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static <T> Set<T> newSet(T... tArr) {
        HashSet hashSet = new HashSet(tArr.length);
        Collections.addAll(hashSet, tArr);
        return hashSet;
    }

    public static Date parseISO8601Date(String str) {
        return Iso8601Utils.parse(str);
    }

    public static NanoDate parseISO8601DateWithNanos(String str) {
        return Iso8601Utils.parseWithNanos(str);
    }

    public static String readFully(InputStream inputStream) throws IOException {
        return readFully(buffer(inputStream));
    }

    public static String toISO8601Date(Date date) {
        return toISO8601String(date);
    }

    public static String toISO8601NanoFormattedString(Date date) {
        return Iso8601Utils.formatNanos(date);
    }

    public static String toISO8601String(Date date) {
        return Iso8601Utils.format(date);
    }

    public static c toJsonObject(Map<String, ?> map) {
        c cVar = new c();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                cVar.put(entry.getKey(), wrap(entry.getValue()));
            } catch (b unused) {
            }
        }
        return cVar;
    }

    public static <T> Map<String, T> transform(Map<String, T> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                linkedHashMap.put(key, entry.getValue());
            } else {
                String str = map2.get(key);
                if (!isNullOrEmpty(str)) {
                    linkedHashMap.put(str, entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    private static Object wrap(Object obj) {
        if (obj == null) {
            return c.NULL;
        }
        if (!(obj instanceof com.amazon.aps.iva.if0.a) && !(obj instanceof c)) {
            if (obj.equals(c.NULL)) {
                return obj;
            }
            try {
                if (obj instanceof Collection) {
                    return new com.amazon.aps.iva.if0.a((Collection<?>) obj);
                }
                if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
                    for (int i = 0; i < length; i++) {
                        aVar.put(wrap(Array.get(aVar, i)));
                    }
                    return aVar;
                } else if (obj instanceof Map) {
                    return toJsonObject((Map) obj);
                } else {
                    if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                        return obj.toString();
                    }
                    return obj;
                }
            } catch (Exception unused) {
                return c.NULL;
            }
        }
        return obj;
    }

    private static boolean hasPermission(Context context, String str, int i) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            logger.error(e, "Exception during permission check", new Object[0]);
            return i < 2 && hasPermission(context.getApplicationContext(), str, i + 1);
        }
    }

    public static <T> List<T> immutableCopyOf(List<T> list) {
        if (isNullOrEmpty(list)) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static String readFully(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                return sb.toString();
            }
        }
    }

    public static Date toISO8601Date(String str) throws java.text.ParseException {
        return parseISO8601Date(str);
    }

    public static <T> boolean isNullOrEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static boolean isNullOrEmpty(Map map) {
        return map == null || map.size() == 0;
    }

    public static <K, V> Map<K, V> assertNotNullOrEmpty(Map<K, V> map, String str) {
        if (isNullOrEmpty(map)) {
            throw new NullPointerException(a.f(str, " cannot be null or empty"));
        }
        return map;
    }
}
