package com.braze.support;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\"\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u001a\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0000\u001a\u0012\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b\u001a\n\u0010\u000e\u001a\u00020\u0000*\u00020\u0000\u001a \u0010\u0012\u001a\u00020\u0010*\u0004\u0018\u00010\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000f\u001a\u001c\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "reference", "", "isNullOrBlank", "Landroid/content/Context;", "context", "userId", "apiKey", "getCacheFileSuffix", "", "getByteSize", "", "desiredByteLength", "truncateToByteLength", "getMd5Hash", "Lkotlin/Function1;", "Lcom/amazon/aps/iva/kb0/q;", "block", "ifNonEmpty", "userIdHash", "getSuffixFromUserIdHashAndApiKey", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StringUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The saved user id hash was null or empty.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Generating MD5 for user id: " + this.b + " apiKey: " + this.c;
        }
    }

    public static final long getByteSize(String str) {
        j.f(str, "<this>");
        byte[] bytes = str.getBytes(com.amazon.aps.iva.oe0.a.b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes.length;
    }

    public static final String getCacheFileSuffix(Context context, String str, String str2) {
        j.f(context, "context");
        String str3 = str == null ? "null" : str;
        if (j.a(str3, "null")) {
            return getSuffixFromUserIdHashAndApiKey("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
        String string = sharedPreferences.getString("user_id_key", null);
        if (string != null && j.a(string, str3)) {
            String string2 = sharedPreferences.getString("user_id_hash_value", null);
            if (!((string2 == null || string2.length() == 0) ? true : true)) {
                return getSuffixFromUserIdHashAndApiKey(string2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) a.b, 6, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (com.amazon.aps.iva.xb0.a) new b(str3, str2), 4, (Object) null);
        String md5Hash = getMd5Hash(str3);
        sharedPreferences.edit().putString("user_id_key", str3).putString("user_id_hash_value", md5Hash).apply();
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    public static final String getMd5Hash(String str) {
        j.f(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(com.amazon.aps.iva.oe0.a.b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
        j.e(format, "format(locale, format, *args)");
        return format;
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        boolean z;
        if (str2 != null && !m.b0(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return com.amazon.aps.iva.oa.a.a(".", str);
        }
        return "." + str + '.' + str2;
    }

    public static final void ifNonEmpty(String str, com.amazon.aps.iva.xb0.l<? super String, q> lVar) {
        boolean z;
        j.f(lVar, "block");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            lVar.invoke(str);
        }
    }

    public static final boolean isNullOrBlank(String str) {
        if (str != null && !m.b0(str)) {
            return false;
        }
        return true;
    }

    public static final String truncateToByteLength(String str, int i) {
        j.f(str, "<this>");
        if (getByteSize(str) <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        j.e(charArray, "this as java.lang.String).toCharArray()");
        int i2 = 0;
        for (char c : charArray) {
            i2 += (int) getByteSize(String.valueOf(c));
            if (i2 > i) {
                break;
            }
            sb.append(c);
        }
        String sb2 = sb.toString();
        j.e(sb2, "truncatedStringBuilder.toString()");
        return sb2;
    }

    public static final String getCacheFileSuffix(Context context, String str) {
        j.f(context, "context");
        return getCacheFileSuffix(context, str, null);
    }
}
