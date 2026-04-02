package com.vungle.publisher;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.tr;
import com.vungle.publisher.ts;
import com.vungle.publisher.tw;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class ue {
    @Inject
    uh a;
    @Inject
    tw.a b;
    @Inject
    ts.a c;

    static {
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    public tw a(tr trVar) {
        long j;
        HttpURLConnection httpURLConnection;
        int i;
        HttpURLConnection httpURLConnection2;
        long j2;
        long j3;
        int i2 = -1;
        ArrayList arrayList = new ArrayList();
        try {
            tr.b a = trVar.a();
            String c = trVar.c();
            int i3 = 0;
            j = -1;
            HttpURLConnection httpURLConnection3 = null;
            while (true) {
                if (i3 > 5) {
                    httpURLConnection2 = httpURLConnection3;
                    j2 = j;
                    break;
                }
                try {
                    Logger.d(Logger.NETWORK_TAG, a + " " + c);
                    HttpURLConnection a2 = this.a.a(c);
                    try {
                        a(a2, a);
                        b(a2, trVar);
                        a(a2, trVar);
                        i2 = a2.getResponseCode();
                        String headerField = a2.getHeaderField("Retry-After");
                        if (TextUtils.isEmpty(headerField)) {
                            j3 = j;
                        } else {
                            try {
                                j3 = Long.parseLong(headerField);
                            } catch (NumberFormatException e) {
                                j3 = -1;
                            }
                        }
                        try {
                            if (a(i3, i2)) {
                                String headerField2 = a2.getHeaderField("Location");
                                arrayList.add(this.c.a(c, i2, headerField2, a2.getHeaderFieldDate("Date", -1L) == -1 ? null : Long.valueOf(a2.getHeaderFieldDate("Date", -1L))));
                                if (b(i2)) {
                                    Logger.d(Logger.NETWORK_TAG, a(a, i3, i2, a2.getContentType(), trVar.c(), c, null));
                                    j2 = j3;
                                    httpURLConnection2 = a2;
                                    break;
                                }
                                Logger.i(Logger.NETWORK_TAG, a(a, i3, i2, a2.getContentType(), trVar.c(), c, headerField2));
                                i3++;
                                c = headerField2;
                                j = j3;
                                httpURLConnection3 = a2;
                            } else if (b(i2)) {
                                Logger.d(Logger.NETWORK_TAG, a(a, i3, i2, a2.getContentType(), trVar.c(), c, null));
                                j2 = j3;
                                httpURLConnection2 = a2;
                            } else {
                                Logger.i(Logger.NETWORK_TAG, a(a, i3, i2, a2.getContentType(), trVar.c(), c, null));
                                j2 = j3;
                                httpURLConnection2 = a2;
                            }
                        } catch (ConnectException e2) {
                            e = e2;
                            j = j3;
                            httpURLConnection = a2;
                            Logger.d(Logger.NETWORK_TAG, zb.a(e));
                            i = 602;
                            return this.b.a(httpURLConnection, i, arrayList, j);
                        } catch (MalformedURLException e3) {
                            e = e3;
                            j = j3;
                            httpURLConnection = a2;
                            Logger.w(Logger.NETWORK_TAG, zb.a(e));
                            i = 601;
                            return this.b.a(httpURLConnection, i, arrayList, j);
                        } catch (SocketTimeoutException e4) {
                            e = e4;
                            j = j3;
                            httpURLConnection = a2;
                            Logger.d(Logger.NETWORK_TAG, zb.a(e));
                            i = 603;
                            return this.b.a(httpURLConnection, i, arrayList, j);
                        } catch (IOException e5) {
                            e = e5;
                            j = j3;
                            httpURLConnection = a2;
                            Logger.w(Logger.NETWORK_TAG, zb.a(e));
                            i = 600;
                            return this.b.a(httpURLConnection, i, arrayList, j);
                        }
                    } catch (ConnectException e6) {
                        e = e6;
                        httpURLConnection = a2;
                    } catch (MalformedURLException e7) {
                        e = e7;
                        httpURLConnection = a2;
                    } catch (SocketTimeoutException e8) {
                        e = e8;
                        httpURLConnection = a2;
                    } catch (IOException e9) {
                        e = e9;
                        httpURLConnection = a2;
                    }
                } catch (ConnectException e10) {
                    httpURLConnection = httpURLConnection3;
                    e = e10;
                } catch (MalformedURLException e11) {
                    httpURLConnection = httpURLConnection3;
                    e = e11;
                } catch (SocketTimeoutException e12) {
                    httpURLConnection = httpURLConnection3;
                    e = e12;
                } catch (IOException e13) {
                    httpURLConnection = httpURLConnection3;
                    e = e13;
                }
            }
            j = j2;
            httpURLConnection = httpURLConnection2;
            i = i2;
        } catch (ConnectException e14) {
            e = e14;
            j = -1;
            httpURLConnection = null;
        } catch (MalformedURLException e15) {
            e = e15;
            j = -1;
            httpURLConnection = null;
        } catch (SocketTimeoutException e16) {
            e = e16;
            j = -1;
            httpURLConnection = null;
        } catch (IOException e17) {
            e = e17;
            j = -1;
            httpURLConnection = null;
        }
        return this.b.a(httpURLConnection, i, arrayList, j);
    }

    void a(HttpURLConnection httpURLConnection, tr.b bVar) {
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        if (bVar != null) {
            httpURLConnection.setRequestMethod(bVar.toString());
        }
    }

    void a(HttpURLConnection httpURLConnection, tr trVar) {
        String f = trVar.f();
        if (!TextUtils.isEmpty(f)) {
            Logger.d(Logger.NETWORK_TAG, "request body: " + f);
            byte[] bytes = f.getBytes();
            if ("gzip".equals(trVar.e())) {
                int length = bytes.length;
                bytes = zi.a(bytes);
                Logger.v(Logger.NETWORK_TAG, "gzipped request from " + length + " bytes down to " + bytes.length + " bytes");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.getOutputStream().write(bytes);
        }
    }

    void b(HttpURLConnection httpURLConnection, tr trVar) {
        String[] stringArray;
        Bundle d = trVar.d();
        if (d != null) {
            for (String str : d.keySet()) {
                if (d.get(str) instanceof String[]) {
                    for (String str2 : d.getStringArray(str)) {
                        Logger.v(Logger.NETWORK_TAG, "request header: " + str + ": " + str2);
                        httpURLConnection.addRequestProperty(str, str2);
                    }
                } else {
                    String valueOf = String.valueOf(d.get(str));
                    Logger.v(Logger.NETWORK_TAG, "request header: " + str + ": " + valueOf);
                    httpURLConnection.addRequestProperty(str, valueOf);
                }
            }
        }
    }

    boolean a(int i, int i2) {
        return i > 0 || a(i2);
    }

    boolean a(int i) {
        return i == 301 || i == 302;
    }

    boolean b(int i) {
        return i == 200;
    }

    String a(tr.b bVar, int i, int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("HTTP");
        boolean a = a(i, i2);
        if (a) {
            sb.append(" redirect count ").append(i).append(',');
        }
        sb.append(" response code ").append(i2).append(", content-type ").append(str).append(" for ").append(bVar).append(" to");
        if (i > 0) {
            sb.append(" original URL ").append(str2).append(',');
        }
        sb.append(" requested URL ").append(str3);
        if (a) {
            sb.append(", next URL ").append(str4);
        }
        return sb.toString();
    }
}
