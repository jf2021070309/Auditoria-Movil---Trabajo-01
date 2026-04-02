package com.kwad.sdk.crash.report.upload;

import android.text.TextUtils;
import android.util.Base64;
import com.kwad.sdk.core.network.q;
import com.kwad.sdk.crash.utils.h;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private static Map<String, String> a(f fVar) {
        HashMap hashMap = new HashMap();
        if (fVar == null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(fVar.aBX)) {
            hashMap.put("uploadToken", fVar.aBX);
        }
        if (!TextUtils.isEmpty(fVar.aBU)) {
            hashMap.put("sys", fVar.aBU);
        }
        if (!TextUtils.isEmpty(fVar.aBT)) {
            hashMap.put("did", fVar.aBT);
        }
        if (!TextUtils.isEmpty(fVar.aBR)) {
            hashMap.put("sid", fVar.aBR);
        }
        if (!TextUtils.isEmpty(fVar.aAw)) {
            hashMap.put("appver", fVar.aAw);
        }
        if (!TextUtils.isEmpty(fVar.mTaskId)) {
            hashMap.put(DBDefinition.TASK_ID, fVar.mTaskId);
        }
        if (!TextUtils.isEmpty(fVar.aBS)) {
            hashMap.put("token", fVar.aBS);
        }
        if (!TextUtils.isEmpty(fVar.aBQ)) {
            hashMap.put("uid", fVar.aBQ);
        }
        if (!TextUtils.isEmpty(fVar.aBV)) {
            hashMap.put("extraInfo", fVar.aBV);
        }
        return hashMap;
    }

    public static void a(File file, f fVar, a aVar) {
        a(file, fVar.aBT, fVar.aBS, a(fVar), aVar);
    }

    private static void a(File file, String str, String str2, Map<String, String> map, a aVar) {
        DataInputStream dataInputStream;
        OutputStream outputStream;
        byte[] bytes;
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "uploadLogFile " + Thread.currentThread());
        com.kwad.sdk.core.network.c cVar = new com.kwad.sdk.core.network.c();
        String uuid = UUID.randomUUID().toString();
        String name = file.getName();
        String str3 = "https://" + com.kwad.sdk.core.network.idc.a.Bm().M("ulog", "ulog-sdk.gifshow.com") + "/rest/log/sdk/file/upload";
        int i = -1;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str3).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("connection", "Keep-Alive");
                httpURLConnection2.setRequestProperty("User-Agent", q.getUserAgent());
                httpURLConnection2.setRequestProperty("Charset", "UTF-8");
                httpURLConnection2.setRequestProperty(DownloadUtils.CONTENT_TYPE, "multipart/form-data; boundary=" + uuid);
                httpURLConnection2.setRequestProperty("Content-MD5", Base64.encodeToString(com.kwad.sdk.utils.a.fn(file.getPath()), 2));
                httpURLConnection2.setRequestProperty("file-type", "." + com.kwad.sdk.utils.q.getExtension(file.getName()));
                httpURLConnection2.setRequestProperty("origin-name", name);
                httpURLConnection2.setRequestProperty("Cookie", "did=" + str);
                httpURLConnection2.connect();
                outputStream = httpURLConnection2.getOutputStream();
                try {
                    for (String str4 : map.keySet()) {
                        outputStream.write(f(str4, map.get(str4), uuid));
                    }
                    bytes = ("\r\n--" + uuid + "--\r\n").getBytes();
                    StringBuilder sb = new StringBuilder();
                    sb.append("--");
                    sb.append(uuid);
                    sb.append("\r\n");
                    sb.append("Content-Disposition: form-data;name=\"file\";filename=\"" + name + "\"\r\n");
                    sb.append("Content-Type: application/octet-stream\r\n\r\n");
                    outputStream.write(sb.toString().getBytes());
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                } catch (Exception e) {
                    e = e;
                    dataInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = null;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = dataInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.write("\r\n".getBytes());
                    outputStream.write(bytes);
                    outputStream.flush();
                    int responseCode = httpURLConnection2.getResponseCode();
                    cVar.code = responseCode;
                    cVar.aoP = responseCode;
                    if (responseCode == 200) {
                        cVar.aoR = h.a(httpURLConnection2.getInputStream());
                        try {
                            int optInt = new JSONObject(cVar.aoR).optInt("result", -1);
                            if (optInt == 1) {
                                aVar.Fj();
                            } else {
                                e eVar = e.aBM;
                                new StringBuilder("result is ").append(optInt);
                                aVar.Fi();
                            }
                        } catch (JSONException e2) {
                            e eVar2 = e.aBN;
                            e eVar3 = e.aBN;
                            aVar.Fi();
                        }
                        com.kwad.sdk.core.e.c.d("ExceptionCollector", "response.body= " + cVar.aoR);
                    } else {
                        e eVar4 = e.aBL;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e.aBL.vr());
                        sb2.append(responseCode);
                        aVar.Fi();
                        com.kwad.sdk.core.network.idc.a.Bm().a(str3, cVar.code == 0 ? -1 : cVar.code, (Throwable) null);
                    }
                    com.kwad.sdk.crash.utils.b.a(httpURLConnection2);
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection = httpURLConnection2;
                    try {
                        e eVar5 = e.aBL;
                        e.getCause();
                        aVar.Fi();
                        com.kwad.sdk.core.network.idc.a Bm = com.kwad.sdk.core.network.idc.a.Bm();
                        if (cVar.code != 0) {
                            i = cVar.code;
                        }
                        Bm.a(str3, i, e);
                        com.kwad.sdk.core.e.c.printStackTrace(e);
                        com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                        com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
                        com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                        com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
                        com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = httpURLConnection2;
                    com.kwad.sdk.crash.utils.b.a(httpURLConnection);
                    com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
                    com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                dataInputStream = null;
                outputStream = null;
            } catch (Throwable th4) {
                th = th4;
                dataInputStream = null;
                outputStream = null;
            }
        } catch (Exception e5) {
            e = e5;
            dataInputStream = null;
            outputStream = null;
        } catch (Throwable th5) {
            th = th5;
            dataInputStream = null;
            outputStream = null;
        }
        com.kwad.sdk.crash.utils.b.closeQuietly(dataInputStream);
        com.kwad.sdk.crash.utils.b.closeQuietly(outputStream);
    }

    private static byte[] f(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str3);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"" + str + "\"");
        sb.append("\r\n");
        sb.append("Content-Length: " + str2.length());
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append(str2);
        sb.append("\r\n");
        return sb.toString().getBytes();
    }
}
