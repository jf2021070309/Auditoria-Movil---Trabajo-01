package e.d.d.j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes2.dex */
public class b {
    public static final String[] a = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: b  reason: collision with root package name */
    public static final DateFormat f7055b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: c  reason: collision with root package name */
    public final String f7056c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7057d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7058e;

    /* renamed from: f  reason: collision with root package name */
    public final Date f7059f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7060g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7061h;

    public b(String str, String str2, String str3, Date date, long j2, long j3) {
        this.f7056c = str;
        this.f7057d = str2;
        this.f7058e = str3;
        this.f7059f = date;
        this.f7060g = j2;
        this.f7061h = j3;
    }
}
