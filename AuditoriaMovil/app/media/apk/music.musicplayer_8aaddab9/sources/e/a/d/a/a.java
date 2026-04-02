package e.a.d.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import com.applovin.impl.sdk.c.b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.measurement.internal.zzfv;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.c.a.w.i;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class a {
    public static StringBuilder A(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder B(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static Map C(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void D(int i2, String str, int i3, String str2) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        Log.w(str2, sb.toString());
    }

    public static void E(DBNameResolver dBNameResolver, ColumnName columnName, StringBuilder sb, String str) {
        sb.append(dBNameResolver.getColumnName(columnName));
        sb.append(str);
    }

    public static void F(zzfv zzfvVar, String str) {
        zzfvVar.zzay().zzd().zza(str);
    }

    public static void G(zzfv zzfvVar, String str) {
        zzfvVar.zzay().zzj().zza(str);
    }

    public static void H(zzfv zzfvVar, String str) {
        zzfvVar.zzay().zzk().zza(str);
    }

    public static RemoteException I(String str, Throwable th) {
        zzcgt.zzg(str, th);
        return new RemoteException();
    }

    public static void J(StringBuilder sb, String str, char c2, String str2) {
        sb.append(str);
        sb.append(c2);
        sb.append(str2);
    }

    public static void K(StringBuilder sb, String str, long j2, String str2) {
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
    }

    public static void L(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void M(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void N(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        Log.w(str4, sb.toString());
    }

    public static b O(TimeUnit timeUnit, long j2, String str) {
        return b.a(str, Long.valueOf(timeUnit.toMillis(j2)));
    }

    public static IObjectWrapper P(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static Object Q(zzbl zzblVar, int i2, List list, int i3) {
        zzh.zzh(zzblVar.name(), i2, list);
        return list.get(i3);
    }

    public static String R(int i2, String str, int i3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        return sb.toString();
    }

    public static String S(int i2, String str, int i3, String str2, int i4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        return sb.toString();
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return ((f2 - f3) * f4) + f5;
    }

    public static int b(int i2, int i3, int i4, int i5) {
        return i2 + i3 + i4 + i5;
    }

    public static String c(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.D());
        return sb.toString();
    }

    public static String d(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        sb.append(cls.getSimpleName());
        sb.append(str2);
        return sb.toString();
    }

    public static String e(String str, int i2) {
        return str + i2;
    }

    public static String f(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    public static String g(String str, int i2, String str2, int i3) {
        return str + i2 + str2 + i3;
    }

    public static String h(String str, long j2) {
        return str + j2;
    }

    public static String i(String str, Uri uri) {
        return str + uri;
    }

    public static String j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static int m(int i2, int i3, int i4, int i5) {
        return ((i2 * i3) / i4) + i5;
    }

    public static String n(String str, Type type) {
        return str + type;
    }

    public static String o(String str, i iVar) {
        return str + iVar;
    }

    public static String p(StringBuilder sb, int i2, String str) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long j2, String str) {
        sb.append(j2);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String t(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String u(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder v(int i2, String str) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        return sb;
    }

    public static StringBuilder w(int i2, String str, int i3, String str2, int i4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        return sb;
    }

    public static int x(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static StringBuilder y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder z(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }
}
