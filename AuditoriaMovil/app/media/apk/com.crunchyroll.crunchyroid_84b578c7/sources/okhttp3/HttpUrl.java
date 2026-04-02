package okhttp3;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ec0.h;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
/* compiled from: HttpUrl.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", "username", "password", "host", "port", "", "pathSegments", "", "queryNamesAndValues", "fragment", ImagesContract.URL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", SearchIntents.EXTRA_QUERY, "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", AppMeasurementSdk.ConditionalUserProperty.NAME, "queryParameterName", FirebaseAnalytics.Param.INDEX, "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\b\r\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0007¢\u0006\u0004\bZ\u0010[J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0002J\u000f\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u00020\u0002H\u0016J!\u00100\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010-\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/J\b\u00101\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0002J\u0010\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0002H\u0002J \u00109\u001a\u0002052\u0006\u0010-\u001a\u00020\u00022\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0002J0\u0010<\u001a\u0002052\u0006\u0010-\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u0010;\u001a\u0002022\u0006\u00103\u001a\u000202H\u0002J\u0010\u0010=\u001a\u0002022\u0006\u0010-\u001a\u00020\u0002H\u0002J\u0010\u0010>\u001a\u0002022\u0006\u0010-\u001a\u00020\u0002H\u0002J\b\u0010?\u001a\u000205H\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010@\u001a\u0004\bE\u0010B\"\u0004\bF\u0010DR\"\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010SR,\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010@\u001a\u0004\bX\u0010B\"\u0004\bY\u0010D¨\u0006]"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "", "scheme", "username", "encodedUsername", "password", "encodedPassword", "host", "", "port", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", FirebaseAnalytics.Param.INDEX, "setPathSegment", "setEncodedPathSegment", "removePathSegment", "encodedPath", SearchIntents.EXTRA_QUERY, "encodedQuery", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", "addQueryParameter", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "toString", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "effectivePort", "", "alreadyEncoded", "canonicalName", "Lcom/amazon/aps/iva/kb0/q;", "removeAllCanonicalQueryParameters", "startPos", "limit", "resolvePath", "pos", "addTrailingSlash", "push", "isDot", "isDotDot", "pop", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "getHost$okhttp", "setHost$okhttp", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(e eVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, "", false, false, false, false, null, 248, null));
                    boolean z = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z = true;
                    }
                    if (!z) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((j.h(charAt, 97) >= 0 && j.h(charAt, 122) <= 0) || (j.h(charAt, 65) >= 0 && j.h(charAt, 90) <= 0)) {
                    for (int i3 = i + 1; i3 < i2; i3++) {
                        char charAt2 = str.charAt(i3);
                        boolean z6 = false;
                        if ('a' <= charAt2 && charAt2 < '{') {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || ('A' <= charAt2 && charAt2 < '[')) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 || ('0' <= charAt2 && charAt2 < ':')) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 || charAt2 == '+') {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 || charAt2 == '-') {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5 || charAt2 == '.') {
                            z6 = true;
                        }
                        if (!z6) {
                            if (charAt2 != ':') {
                                return -1;
                            }
                            return i3;
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i == -1) {
                Companion companion = HttpUrl.Companion;
                String str = this.scheme;
                j.c(str);
                return companion.defaultPort(str);
            }
            return i;
        }

        private final boolean isDot(String str) {
            if (!j.a(str, ".") && !m.Z(str, "%2e")) {
                return false;
            }
            return true;
        }

        private final boolean isDotDot(String str) {
            if (!j.a(str, "..") && !m.Z(str, "%2e.") && !m.Z(str, ".%2e") && !m.Z(str, "%2e%2e")) {
                return false;
            }
            return true;
        }

        private final void pop() {
            boolean z;
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (!this.encodedPathSegments.isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.encodedPathSegments.add("");
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            boolean z3;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            j.c(list);
            int size = list.size() - 2;
            int p = k.p(size, 0, -2);
            if (p > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                j.c(list2);
                if (j.a(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    j.c(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    j.c(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    j.c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != p) {
                    size -= 2;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String str, int i, int i2) {
            boolean z;
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            }
            while (true) {
                int i3 = i;
                while (i3 < i2) {
                    i = Util.delimiterOffset(str, "/\\", i3, i2);
                    if (i < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    push(str, i3, i, z, true);
                    if (z) {
                        i3 = i + 1;
                    }
                }
                return;
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            j.f(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            j.f(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            String str3;
            j.f(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            j.c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            j.c(list2);
            if (str2 != null) {
                str3 = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null);
            } else {
                str3 = null;
            }
            list2.add(str3);
            return this;
        }

        public final Builder addPathSegment(String str) {
            j.f(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            j.f(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            String str3;
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            j.c(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            j.c(list2);
            if (str2 != null) {
                str3 = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null);
            } else {
                str3 = null;
            }
            list2.add(str3);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.scheme;
            if (str3 != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str4 = this.host;
                if (str4 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(r.Y(list));
                    for (String str5 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str5, 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        List<String> list3 = list2;
                        arrayList = new ArrayList(r.Y(list3));
                        for (String str6 : list3) {
                            if (str6 != null) {
                                str2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str6, 0, 0, true, 3, null);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.encodedFragment;
                    if (str7 != null) {
                        str = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str7, 0, 0, false, 7, null);
                    } else {
                        str = null;
                    }
                    return new HttpUrl(str3, percentDecode$okhttp$default, percentDecode$okhttp$default2, str4, effectivePort, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            String str2;
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public final Builder encodedPassword(String str) {
            j.f(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String str) {
            j.f(str, "encodedPath");
            if (m.h0(str, "/", false)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(str).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String str) {
            j.f(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            String str2;
            if (str != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            j.f(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            char c;
            int i;
            boolean z;
            boolean z2;
            int i2;
            boolean z3;
            int i3;
            boolean z4;
            String str2 = str;
            j.f(str2, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            boolean z5 = true;
            char c2 = 65535;
            if (schemeDelimiterOffset != -1) {
                if (m.g0(indexOfFirstNonAsciiWhitespace$default, str2, "https:", true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (m.g0(indexOfFirstNonAsciiWhitespace$default, str2, "http:", true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str2.substring(0, schemeDelimiterOffset);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    str2 = com.amazon.aps.iva.oe0.r.Q0(6, str2).concat("...");
                }
                throw new IllegalArgumentException(a.a("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
            }
            int slashCount = companion.slashCount(str2, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c3 = '?';
            char c4 = '#';
            if (slashCount < 2 && httpUrl != null && j.a(httpUrl.scheme(), this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str2.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            } else {
                boolean z6 = false;
                boolean z7 = false;
                int i4 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i4, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c = str2.charAt(delimiterOffset);
                    } else {
                        c = c2;
                    }
                    if (c == c2 || c == c4 || c == '/' || c == '\\' || c == c3) {
                        break;
                    } else if (c == '@') {
                        if (!z6) {
                            int delimiterOffset2 = Util.delimiterOffset(str2, ':', i4, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z3 = z5;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i4, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z7) {
                                canonicalize$okhttp$default = com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.encodedUsername, "%40", canonicalize$okhttp$default);
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                i2 = delimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z4 = z3;
                            } else {
                                i2 = delimiterOffset;
                                z4 = z6;
                            }
                            z6 = z4;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            z7 = z3;
                        } else {
                            i2 = delimiterOffset;
                            z3 = z5;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            i3 = indexOfLastNonAsciiWhitespace$default;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        }
                        i4 = i2 + 1;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        z5 = z3;
                    }
                }
                boolean z8 = z5;
                i = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(str2, i4, delimiterOffset);
                int i5 = portColonOffset + 1;
                if (i5 < delimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i4, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str2, i5, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort != -1) {
                        z2 = z8;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str2.substring(i5, delimiterOffset);
                        j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i4, portColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    j.c(str3);
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host != null) {
                    z = z8;
                } else {
                    z = false;
                }
                if (z) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str2.substring(i4, portColonOffset);
                    j.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
            }
            int i6 = i;
            int delimiterOffset3 = Util.delimiterOffset(str2, "?#", indexOfFirstNonAsciiWhitespace$default, i6);
            resolvePath(str2, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i6 && str2.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str2, '#', delimiterOffset3, i6);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i6 && str2.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i6, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            j.f(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i) {
            boolean z = false;
            if (1 <= i && i < 65536) {
                z = true;
            }
            if (z) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(c0.a("unexpected port: ", i).toString());
        }

        public final Builder query(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str;
            String str2;
            String str3 = this.host;
            String str4 = null;
            if (str3 != null) {
                Pattern compile = Pattern.compile("[\"<>^`{|}]");
                j.e(compile, "compile(pattern)");
                str = compile.matcher(str3).replaceAll("");
                j.e(str, "nativePattern.matcher(in…).replaceAll(replacement)");
            } else {
                str = null;
            }
            this.host = str;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str5 = list2.get(i2);
                    if (str5 != null) {
                        str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str5, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    } else {
                        str2 = null;
                    }
                    list2.set(i2, str2);
                }
            }
            String str6 = this.encodedFragment;
            if (str6 != null) {
                str4 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str6, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            this.encodedFragment = str4;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            j.f(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            j.f(str, "scheme");
            if (m.Z(str, "http")) {
                this.scheme = "http";
            } else if (m.Z(str, "https")) {
                this.scheme = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            j.f(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            boolean z;
            j.f(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            j.f(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            j.f(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            boolean z;
            j.f(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if (r1 != false) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r5.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L23
                r1 = r2
                goto L24
            L23:
                r1 = r3
            L24:
                r4 = 58
                if (r1 != 0) goto L35
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L32
                r1 = r2
                goto L33
            L32:
                r1 = r3
            L33:
                if (r1 == 0) goto L53
            L35:
                java.lang.String r1 = r5.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r5.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L43
                goto L44
            L43:
                r2 = r3
            L44:
                if (r2 == 0) goto L4e
                r0.append(r4)
                java.lang.String r1 = r5.encodedPassword
                r0.append(r1)
            L4e:
                r1 = 64
                r0.append(r1)
            L53:
                java.lang.String r1 = r5.host
                if (r1 == 0) goto L72
                boolean r1 = com.amazon.aps.iva.oe0.q.j0(r1, r4)
                if (r1 == 0) goto L6d
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r5.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L72
            L6d:
                java.lang.String r1 = r5.host
                r0.append(r1)
            L72:
                int r1 = r5.port
                r2 = -1
                if (r1 != r2) goto L7b
                java.lang.String r1 = r5.scheme
                if (r1 == 0) goto L91
            L7b:
                int r1 = r5.effectivePort()
                java.lang.String r2 = r5.scheme
                if (r2 == 0) goto L8b
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L91
            L8b:
                r0.append(r4)
                r0.append(r1)
            L91:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r5.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                if (r2 == 0) goto La9
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r5.encodedQueryNamesAndValues
                com.amazon.aps.iva.yb0.j.c(r2)
                r1.toQueryString$okhttp(r2, r0)
            La9:
                java.lang.String r1 = r5.encodedFragment
                if (r1 == 0) goto Lb7
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r5.encodedFragment
                r0.append(r1)
            Lb7:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            j.f(str, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001d\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 *\u00020\u0003H\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010'\u001a\u00020$*\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010&J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020*H\u0007¢\u0006\u0004\b%\u0010+J\u0015\u0010)\u001a\u0004\u0018\u00010$*\u00020,H\u0007¢\u0006\u0004\b%\u0010-J\u0017\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b0\u0010&J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020*H\u0007¢\u0006\u0004\b/\u0010+J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00101\u001a\u00020,H\u0007¢\u0006\u0004\b/\u0010-J1\u00104\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103Jc\u00107\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010@\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010A\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010B\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00109R\u0014\u0010C\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00109R\u0014\u0010D\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u00109R\u0014\u0010E\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u00109R\u0014\u0010F\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u00109¨\u0006I"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "Lcom/amazon/aps/iva/ef0/e;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lcom/amazon/aps/iva/kb0/q;", "writePercentDecoded", "isPercentEncoded", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "writeCanonicalized", "scheme", "defaultPort", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", ImagesContract.URL, "-deprecated_get", "-deprecated_parse", "uri", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4;
            int i5;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Charset charset2;
            if ((i3 & 1) != 0) {
                i4 = 0;
            } else {
                i4 = i;
            }
            if ((i3 & 2) != 0) {
                i5 = str.length();
            } else {
                i5 = i2;
            }
            if ((i3 & 8) != 0) {
                z5 = false;
            } else {
                z5 = z;
            }
            if ((i3 & 16) != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            if ((i3 & 32) != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            if ((i3 & 64) != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if ((i3 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return companion.canonicalize$okhttp(str, i4, i5, str2, z5, z6, z7, z8, charset2);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            if (i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
            if (isPercentEncoded(r15, r4, r17) == false) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(com.amazon.aps.iva.ef0.e r14, java.lang.String r15, int r16, int r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, java.nio.charset.Charset r23) {
            /*
                r13 = this;
                r0 = r14
                r1 = r15
                r2 = r17
                r3 = r23
                r4 = 0
                r5 = r4
                r4 = r16
            La:
                if (r4 >= r2) goto Lb6
                int r6 = r15.codePointAt(r4)
                if (r19 == 0) goto L23
                r7 = 9
                if (r6 == r7) goto L33
                r7 = 10
                if (r6 == r7) goto L33
                r7 = 12
                if (r6 == r7) goto L33
                r7 = 13
                if (r6 != r7) goto L23
                goto L33
            L23:
                r7 = 43
                if (r6 != r7) goto L38
                if (r21 == 0) goto L38
                if (r19 == 0) goto L2e
                java.lang.String r7 = "+"
                goto L30
            L2e:
                java.lang.String r7 = "%2B"
            L30:
                r14.c0(r7)
            L33:
                r7 = r13
                r9 = r18
                goto Laf
            L38:
                r7 = 32
                r8 = 37
                if (r6 < r7) goto L66
                r7 = 127(0x7f, float:1.78E-43)
                if (r6 == r7) goto L66
                r7 = 128(0x80, float:1.794E-43)
                if (r6 < r7) goto L48
                if (r22 == 0) goto L66
            L48:
                char r7 = (char) r6
                r9 = r18
                boolean r7 = com.amazon.aps.iva.oe0.q.j0(r9, r7)
                if (r7 != 0) goto L64
                if (r6 != r8) goto L5f
                if (r19 == 0) goto L64
                if (r20 == 0) goto L5f
                r7 = r13
                boolean r10 = r13.isPercentEncoded(r15, r4, r2)
                if (r10 != 0) goto L60
                goto L69
            L5f:
                r7 = r13
            L60:
                r14.i0(r6)
                goto Laf
            L64:
                r7 = r13
                goto L69
            L66:
                r7 = r13
                r9 = r18
            L69:
                if (r5 != 0) goto L70
                com.amazon.aps.iva.ef0.e r5 = new com.amazon.aps.iva.ef0.e
                r5.<init>()
            L70:
                if (r3 == 0) goto L84
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = com.amazon.aps.iva.yb0.j.a(r3, r10)
                if (r10 == 0) goto L7b
                goto L84
            L7b:
                int r10 = java.lang.Character.charCount(r6)
                int r10 = r10 + r4
                r5.Z(r15, r4, r10, r3)
                goto L87
            L84:
                r5.i0(r6)
            L87:
                boolean r10 = r5.Y()
                if (r10 != 0) goto Laf
                byte r10 = r5.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r14.L(r8)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r12 = r10 >> 4
                r12 = r12 & 15
                char r11 = r11[r12]
                r14.L(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r14.L(r10)
                goto L87
            Laf:
                int r6 = java.lang.Character.charCount(r6)
                int r4 = r4 + r6
                goto La
            Lb6:
                r7 = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(com.amazon.aps.iva.ef0.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(com.amazon.aps.iva.ef0.e eVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        eVar.L((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    eVar.i0(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        eVar.L(32);
                        i++;
                    }
                    eVar.i0(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m134deprecated_get(String str) {
            j.f(str, ImagesContract.URL);
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m137deprecated_parse(String str) {
            j.f(str, ImagesContract.URL);
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            j.f(str, "<this>");
            j.f(str2, "encodeSet");
            int i3 = i;
            while (i3 < i2) {
                int codePointAt = str.codePointAt(i3);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !q.j0(str2, (char) codePointAt))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(str, i3, i2)) {
                                    com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
                                    eVar.a0(i, i3, str);
                                    writeCanonicalized(eVar, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return eVar.A();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i3 += Character.charCount(codePointAt);
                                } else {
                                    com.amazon.aps.iva.ef0.e eVar2 = new com.amazon.aps.iva.ef0.e();
                                    eVar2.a0(i, i3, str);
                                    writeCanonicalized(eVar2, str, i3, i2, str2, z, z2, z3, z4, charset);
                                    return eVar2.A();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
                com.amazon.aps.iva.ef0.e eVar22 = new com.amazon.aps.iva.ef0.e();
                eVar22.a0(i, i3, str);
                writeCanonicalized(eVar22, str, i3, i2, str2, z, z2, z3, z4, charset);
                return eVar22.A();
            }
            String substring = str.substring(i, i2);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String str) {
            j.f(str, "scheme");
            if (j.a(str, "http")) {
                return 80;
            }
            if (j.a(str, "https")) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            j.f(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            j.f(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            j.f(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
                    eVar.a0(i, i3, str);
                    writePercentDecoded(eVar, str, i3, i2, z);
                    return eVar.A();
                }
            }
            String substring = str.substring(i, i2);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            j.f(list, "<this>");
            j.f(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            j.f(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int q0 = q.q0(str, '&', i, false, 4);
                if (q0 == -1) {
                    q0 = str.length();
                }
                int q02 = q.q0(str, '=', i, false, 4);
                if (q02 != -1 && q02 <= q0) {
                    String substring = str.substring(i, q02);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(q02 + 1, q0);
                    j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i, q0);
                    j.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i = q0 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            j.f(list, "<this>");
            j.f(sb, "out");
            h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, list.size()), 2);
            int i = O.b;
            int i2 = O.c;
            int i3 = O.d;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m136deprecated_get(URL url) {
            j.f(url, ImagesContract.URL);
            return get(url);
        }

        public final HttpUrl get(URL url) {
            j.f(url, "<this>");
            String url2 = url.toString();
            j.e(url2, "toString()");
            return parse(url2);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m135deprecated_get(URI uri) {
            j.f(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            j.f(uri, "<this>");
            String uri2 = uri.toString();
            j.e(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        j.f(str, "scheme");
        j.f(str2, "username");
        j.f(str3, "password");
        j.f(str4, "host");
        j.f(list, "pathSegments");
        j.f(str6, ImagesContract.URL);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = j.a(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m115deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m116deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m117deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m118deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m119deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m120deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m121deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m122deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m123deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m124deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m125deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m126deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m127deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m128deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m129deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m130deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m131deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m132deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m133deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String substring = this.url.substring(q.q0(this.url, '#', 0, false, 6) + 1);
        j.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        boolean z;
        if (this.password.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        String substring = this.url.substring(q.q0(this.url, ':', this.scheme.length() + 3, false, 4) + 1, q.q0(this.url, '@', 0, false, 6));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int q0 = q.q0(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        String substring = this.url.substring(q0, Util.delimiterOffset(str, "?#", q0, str.length()));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int q0 = q.q0(this.url, '/', this.scheme.length() + 3, false, 4);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", q0, str.length());
        ArrayList arrayList = new ArrayList();
        while (q0 < delimiterOffset) {
            int i = q0 + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String substring = this.url.substring(i, delimiterOffset2);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            q0 = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int q0 = q.q0(this.url, '?', 0, false, 6) + 1;
        String str = this.url;
        String substring = this.url.substring(q0, Util.delimiterOffset(str, '#', q0, str.length()));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        boolean z;
        if (this.username.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && j.a(((HttpUrl) obj).url, this.url)) {
            return true;
        }
        return false;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, list.size()), 2);
        int i = O.b;
        int i2 = O.c;
        int i3 = O.d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!j.a(str, this.queryNamesAndValues.get(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return this.queryNamesAndValues.get(i + 1);
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            j.c(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return b0.b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, this.queryNamesAndValues.size()), 2);
        int i = O.b;
        int i2 = O.c;
        int i3 = O.d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i);
                j.c(str);
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        j.e(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (this.queryNamesAndValues == null) {
            return z.b;
        }
        ArrayList arrayList = new ArrayList();
        h O = com.amazon.aps.iva.aq.j.O(com.amazon.aps.iva.aq.j.T(0, this.queryNamesAndValues.size()), 2);
        int i = O.b;
        int i2 = O.c;
        int i3 = O.d;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (j.a(str, this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        j.e(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        j.c(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        j.f(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                Pattern compile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                j.e(compile, "compile(pattern)");
                j.f(builder, "input");
                String replaceAll = compile.matcher(builder).replaceAll("");
                j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                j.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        j.f(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
