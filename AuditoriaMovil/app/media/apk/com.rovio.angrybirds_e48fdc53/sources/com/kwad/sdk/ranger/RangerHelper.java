package com.kwad.sdk.ranger;

import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.ranger.c;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.s;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Version;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
/* loaded from: classes3.dex */
public class RangerHelper {
    private static List<String> aGW;
    private static d aGX;
    private static volatile boolean aGV = false;
    private static List<OkHttpClient> aGY = new ArrayList();

    private static boolean Hq() {
        try {
            String userAgent = Version.userAgent();
            if (TextUtils.isEmpty(userAgent)) {
                com.kwad.sdk.core.e.c.d("Ranger_Helper", "TextUtils.isEmpty(userAgent)");
                return false;
            }
            com.kwad.sdk.core.e.c.d("Ranger_Helper", "userAgent:" + userAgent);
            String replace = userAgent.replace("okhttp/", "");
            if (replace.startsWith("3.")) {
                int parseInt = Integer.parseInt(replace.replaceAll("\\.", ""));
                return parseInt >= 390 && parseInt <= 3131;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final StreamAllocation streamAllocation) {
        g.schedule(new aw() { // from class: com.kwad.sdk.ranger.RangerHelper.2
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                RangerHelper.m(s.f(StreamAllocation.this, "call"));
            }
        }, 0L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(d dVar) {
        aGX = dVar;
        aGW = dVar.aGO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Object obj) {
        if (obj == null) {
            com.kwad.sdk.core.e.c.d("Ranger_Helper", "real call null");
            return;
        }
        try {
            OkHttpClient okHttpClient = (OkHttpClient) s.f(obj, "client");
            if (aGY.contains(okHttpClient)) {
                com.kwad.sdk.core.e.c.d("Ranger_Helper", "already invoke");
                return;
            }
            aGY.add(okHttpClient);
            Object f = s.f(obj, "eventListener");
            if (f != null) {
                com.kwad.sdk.core.e.c.d("Ranger_Helper", "eventListener.getClass().getName():" + f.getClass().getName());
                s.a(okHttpClient, "eventListenerFactory", new c(f, new c.a() { // from class: com.kwad.sdk.ranger.RangerHelper.3
                }));
            }
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
        }
    }

    public static void replaceInternal() {
        if (aGV) {
            return;
        }
        if (!Hq()) {
            aGV = true;
            return;
        }
        final Internal internal = (Internal) s.c(Internal.class, "instance");
        if (internal == null) {
            aGV = true;
            return;
        }
        com.kwad.sdk.core.e.c.d("Ranger_Helper", "internal:" + internal.getClass().getName());
        try {
            s.a(internal, "instance", new Internal() { // from class: com.kwad.sdk.ranger.RangerHelper.1
                public final void acquire(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
                    RangerHelper.a(streamAllocation);
                    s.g(Internal.this, "acquire", connectionPool, address, streamAllocation, route);
                }

                @Override // okhttp3.internal.Internal
                public final void addLenient(Headers.Builder builder, String str) {
                    try {
                        Internal.this.addLenient(builder, str);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                    }
                }

                @Override // okhttp3.internal.Internal
                public final void addLenient(Headers.Builder builder, String str, String str2) {
                    try {
                        Internal.this.addLenient(builder, str, str2);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                    }
                }

                @Override // okhttp3.internal.Internal
                public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
                    try {
                        Internal.this.apply(connectionSpec, sSLSocket, z);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                    }
                }

                @Override // okhttp3.internal.Internal
                public final int code(Response.Builder builder) {
                    try {
                        return Internal.this.code(builder);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                        return -1;
                    }
                }

                @Override // okhttp3.internal.Internal
                public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
                    try {
                        return Internal.this.connectionBecameIdle(connectionPool, realConnection);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                        return false;
                    }
                }

                @Override // okhttp3.internal.Internal
                public final Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                    try {
                        return Internal.this.deduplicate(connectionPool, address, streamAllocation);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                        return null;
                    }
                }

                @Override // okhttp3.internal.Internal
                public final boolean equalsNonHost(Address address, Address address2) {
                    Boolean bool = (Boolean) s.g(Internal.this, "equalsNonHost", address, address2);
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    return false;
                }

                public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                    return (RealConnection) s.g(Internal.this, MonitorConstants.CONNECT_TYPE_GET, connectionPool, address, streamAllocation);
                }

                @Override // okhttp3.internal.Internal
                public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
                    RangerHelper.a(streamAllocation);
                    return (RealConnection) s.g(Internal.this, MonitorConstants.CONNECT_TYPE_GET, connectionPool, address, streamAllocation, route);
                }

                @Override // okhttp3.internal.Internal
                public final HttpUrl getHttpUrlChecked(String str) {
                    return (HttpUrl) s.g(Internal.this, "getHttpUrlChecked", str);
                }

                public final void initCodec(Response.Builder builder, HttpCodec httpCodec) {
                    s.g(Internal.this, "initCodec", builder, httpCodec);
                }

                public final boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException) {
                    Boolean bool = (Boolean) s.g(Internal.this, "isInvalidHttpUrlHost", illegalArgumentException);
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    return false;
                }

                @Override // okhttp3.internal.Internal
                public final Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
                    try {
                        return Internal.this.newWebSocketCall(okHttpClient, request);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                        return null;
                    }
                }

                @Override // okhttp3.internal.Internal
                public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
                    s.g(Internal.this, "put", connectionPool, realConnection);
                }

                @Override // okhttp3.internal.Internal
                public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
                    try {
                        return Internal.this.routeDatabase(connectionPool);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                        return null;
                    }
                }

                @Override // okhttp3.internal.Internal
                public final void setCache(OkHttpClient.Builder builder, InternalCache internalCache) {
                    try {
                        Internal.this.setCache(builder, internalCache);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                    }
                }

                @Override // okhttp3.internal.Internal
                public final StreamAllocation streamAllocation(Call call) {
                    try {
                        return Internal.this.streamAllocation(call);
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
                        return null;
                    }
                }

                public final IOException timeoutExit(Call call, IOException iOException) {
                    return (IOException) s.g(Internal.this, "timeoutExit", call, iOException);
                }
            });
            aGV = true;
        } catch (Throwable th) {
            aGV = true;
            com.kwad.sdk.core.e.c.e("Ranger_Helper", Log.getStackTraceString(th));
        }
    }
}
