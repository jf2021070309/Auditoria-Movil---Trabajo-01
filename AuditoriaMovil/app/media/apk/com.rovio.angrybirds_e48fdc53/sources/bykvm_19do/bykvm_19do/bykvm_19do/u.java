package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.ContentValues;
import android.database.Cursor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class u implements Cloneable {
    private static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public long a = System.currentTimeMillis();
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    String g;

    public static u a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return v.e.get(jSONObject.optString("k_cls", "")).clone().b(jSONObject);
        } catch (Throwable th) {
            l0.a(th);
            return null;
        }
    }

    public static String a(long j) {
        return h.format(new Date(j));
    }

    public abstract u a(Cursor cursor);

    protected abstract void a(ContentValues contentValues);

    protected abstract void a(JSONObject jSONObject);

    protected abstract String[] a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ContentValues b(ContentValues contentValues) {
        if (contentValues == null) {
            contentValues = new ContentValues();
        } else {
            contentValues.clear();
        }
        a(contentValues);
        return contentValues;
    }

    protected abstract u b(JSONObject jSONObject);

    protected abstract JSONObject b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        String[] a = a();
        if (a != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("create table if not exists ");
            sb.append(d());
            sb.append("(");
            for (int i = 0; i < a.length; i += 2) {
                sb.append(a[i]);
                sb.append(" ");
                sb.append(a[i + 1]);
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String d();

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("k_cls", d());
            a(jSONObject);
        } catch (JSONException e) {
            l0.a(e);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject f() {
        try {
            this.g = a(this.a);
            return b();
        } catch (JSONException e) {
            l0.a(e);
            return null;
        }
    }

    /* renamed from: g */
    public u clone() {
        try {
            return (u) super.clone();
        } catch (CloneNotSupportedException e) {
            l0.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String h() {
        return "sid:" + this.c;
    }

    public String toString() {
        if (l0.a) {
            String d = d();
            if (!getClass().getSimpleName().equalsIgnoreCase(d)) {
                d = d + ", " + getClass().getSimpleName();
            }
            String str = this.c;
            if (str != null) {
                int indexOf = str.indexOf("-");
                if (indexOf >= 0) {
                    str = str.substring(0, indexOf);
                }
            } else {
                str = "-";
            }
            return "{" + d + ", " + h() + ", " + str + ", " + this.a + "}";
        }
        return super.toString();
    }
}
