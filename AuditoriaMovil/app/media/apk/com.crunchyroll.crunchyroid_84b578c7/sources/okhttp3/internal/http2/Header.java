package okhttp3.internal.http2;

import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "", "toString", "Lcom/amazon/aps/iva/ef0/i;", "component1", "component2", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "copy", "", "hashCode", "other", "", "equals", "Lcom/amazon/aps/iva/ef0/i;", "hpackSize", "I", "<init>", "(Lcom/amazon/aps/iva/ef0/i;Lcom/amazon/aps/iva/ef0/i;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lcom/amazon/aps/iva/ef0/i;Ljava/lang/String;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Header {
    public static final Companion Companion = new Companion(null);
    public static final i PSEUDO_PREFIX;
    public static final i RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final i TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final i TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final i TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final i TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final i name;
    public final i value;

    /* compiled from: Header.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "Lcom/amazon/aps/iva/ef0/i;", "PSEUDO_PREFIX", "Lcom/amazon/aps/iva/ef0/i;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    static {
        i iVar = i.e;
        PSEUDO_PREFIX = i.a.c(":");
        RESPONSE_STATUS = i.a.c(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = i.a.c(TARGET_METHOD_UTF8);
        TARGET_PATH = i.a.c(TARGET_PATH_UTF8);
        TARGET_SCHEME = i.a.c(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = i.a.c(TARGET_AUTHORITY_UTF8);
    }

    public Header(i iVar, i iVar2) {
        j.f(iVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(iVar2, "value");
        this.name = iVar;
        this.value = iVar2;
        this.hpackSize = iVar2.c() + iVar.c() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, i iVar, i iVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = header.name;
        }
        if ((i & 2) != 0) {
            iVar2 = header.value;
        }
        return header.copy(iVar, iVar2);
    }

    public final i component1() {
        return this.name;
    }

    public final i component2() {
        return this.value;
    }

    public final Header copy(i iVar, i iVar2) {
        j.f(iVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(iVar2, "value");
        return new Header(iVar, iVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (j.a(this.name, header.name) && j.a(this.value, header.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.m() + ": " + this.value.m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(i.a.c(str), i.a.c(str2));
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str2, "value");
        i iVar = i.e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(i iVar, String str) {
        this(iVar, i.a.c(str));
        j.f(iVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(str, "value");
        i iVar2 = i.e;
    }
}
