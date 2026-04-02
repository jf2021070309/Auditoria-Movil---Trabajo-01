package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.metrics.types.MetricEventCollection;
import com.amazon.aps.iva.util.LogUtils;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: DepthSortedSet.kt */
/* loaded from: classes.dex */
public final class n implements com.amazon.aps.iva.u8.c {
    public final Object b;
    public final Object c;

    public n(com.amazon.aps.iva.l9.a aVar) {
        this.b = aVar;
        this.c = com.amazon.aps.iva.a9.w.c().b();
    }

    public static boolean d(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setReadTimeout(5000);
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setChunkedStreamingMode(0);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpsURLConnection.connect();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.amazon.aps.iva.u8.c
    public final void a(com.amazon.aps.iva.v8.d dVar) {
        long j;
        Object[] objArr = (Object[]) this.c;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dVar.h(i);
                } else if (obj instanceof byte[]) {
                    dVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.c(((Float) obj).floatValue(), i);
                } else if (obj instanceof Double) {
                    dVar.c(((Double) obj).doubleValue(), i);
                } else if (obj instanceof Long) {
                    dVar.f(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.f(i, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.f(i, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.f(i, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.i(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    dVar.f(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    public final boolean b(MetricEventCollection metricEventCollection) {
        HttpsURLConnection httpsURLConnection;
        String json = ((Gson) this.c).toJson(metricEventCollection);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) ((URL) ((com.amazon.aps.iva.l9.a) this.b).a).openConnection();
                try {
                    if (d(httpsURLConnection)) {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpsURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream2.write(json.getBytes());
                            bufferedOutputStream2.flush();
                            LogUtils.d("c", "Sending the event data: %s", json);
                            int responseCode = httpsURLConnection.getResponseCode();
                            LogUtils.d("c", "Response code received : %s", String.valueOf(responseCode));
                            if (responseCode == 200) {
                            }
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException | RuntimeException unused) {
                            }
                        } catch (IOException | RuntimeException unused2) {
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException | RuntimeException unused3) {
                                }
                            }
                            httpsURLConnection.disconnect();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException | RuntimeException unused4) {
                                }
                            }
                            try {
                                httpsURLConnection.disconnect();
                            } catch (RuntimeException unused5) {
                            }
                            throw th;
                        }
                    }
                    httpsURLConnection.disconnect();
                } catch (IOException | RuntimeException unused6) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (RuntimeException unused7) {
                return false;
            }
        } catch (IOException | RuntimeException unused8) {
            httpsURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    @Override // com.amazon.aps.iva.u8.c
    public final String c() {
        return (String) this.b;
    }

    public final void e(androidx.compose.ui.node.e eVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
        Object obj = this.b;
        if (z) {
            ((m) obj).a(eVar);
        } else if (!((m) obj).b(eVar)) {
            ((m) this.c).a(eVar);
        }
    }

    public final void f(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
        ((m) this.b).d(eVar);
        ((m) this.c).d(eVar);
    }

    public n(String str) {
        this.b = str;
        this.c = null;
    }

    public n() {
        this.b = new m();
        this.c = new m();
    }
}
