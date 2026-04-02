package com.jrtstudio.tools;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.applovin.sdk.AppLovinEventTypes;
import com.jrtstudio.tools.JRTProvider;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.q0;
import e.h.g.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class JRTProvider extends ContentProvider {
    public static final String[] a = {"_display_name", "_size"};

    /* renamed from: b  reason: collision with root package name */
    public static final File f4881b = new File("/");

    /* renamed from: c  reason: collision with root package name */
    public static HashMap<String, a> f4882c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public a f4883d;

    /* loaded from: classes2.dex */
    public interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    /* loaded from: classes2.dex */
    public static class b implements a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, File> f4884b = new HashMap<>();

        public b(String str) {
            this.a = str;
        }

        @Override // com.jrtstudio.tools.JRTProvider.a
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f4884b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            }
            throw new IllegalArgumentException(e.a.d.a.a.i("Unable to find configured root for ", uri));
        }

        @Override // com.jrtstudio.tools.JRTProvider.a
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f4884b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    return new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(this.a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException(e.a.d.a.a.k("Failed to find configured root that contains ", canonicalPath));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    public static a a(Context context, String str) {
        a aVar;
        synchronized (f4882c) {
            aVar = f4882c.get(str);
            if (aVar == null) {
                try {
                    aVar = c(context, str);
                    f4882c.put(str, aVar);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return aVar;
    }

    public static Uri b(Context context, String str, File file) {
        try {
            return a(context, str).b(file);
        } catch (Throwable th) {
            s1.l(th, true);
            return null;
        }
    }

    public static a c(Context context, String str) throws IOException, XmlPullParserException {
        File[] fileArr;
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(e.a.d.a.a.k("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f4881b;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = j1.c();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    try {
                        fileArr = context.getExternalCacheDirs();
                    } catch (Exception unused) {
                        fileArr = new File[0];
                    }
                    if (fileArr.length > 0) {
                        file = fileArr[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file != null) {
                    String[] strArr = {attributeValue2};
                    for (int i2 = 0; i2 < 1; i2++) {
                        String str2 = strArr[i2];
                        if (str2 != null) {
                            file = new File(file, str2);
                        }
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        bVar.f4884b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(final Context context, final ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        j0.c(new j0.b() { // from class: e.h.g.u
            @Override // e.h.g.j0.b
            public final void a() {
                JRTProvider jRTProvider = JRTProvider.this;
                Context context2 = context;
                ProviderInfo providerInfo2 = providerInfo;
                Objects.requireNonNull(jRTProvider);
                j1.n(10000, new r0());
                try {
                    jRTProvider.f4883d = JRTProvider.a(context2, providerInfo2.authority);
                } catch (Throwable th) {
                    s1.l(th, true);
                }
            }
        });
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        a aVar = this.f4883d;
        if (aVar != null) {
            return aVar.a(uri).delete() ? 1 : 0;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        a aVar = this.f4883d;
        if (aVar != null) {
            File a2 = aVar.a(uri);
            int lastIndexOf = a2.getName().lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
                return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i2;
        a aVar = this.f4883d;
        if (aVar != null) {
            File a2 = aVar.a(uri);
            if ("r".equals(str)) {
                i2 = 268435456;
            } else if ("w".equals(str) || "wt".equals(str)) {
                i2 = 738197504;
            } else if ("wa".equals(str)) {
                i2 = 704643072;
            } else if ("rw".equals(str)) {
                i2 = 939524096;
            } else if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(e.a.d.a.a.k("Invalid mode: ", str));
            } else {
                i2 = 1006632960;
            }
            return ParcelFileDescriptor.open(a2, i2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        a aVar = this.f4883d;
        if (aVar != null) {
            File a2 = aVar.a(uri);
            if (strArr == null) {
                strArr = a;
            }
            String[] strArr3 = new String[strArr.length];
            Object[] objArr = new Object[strArr.length];
            int i3 = 0;
            for (String str3 : strArr) {
                if ("_display_name".equals(str3)) {
                    strArr3[i3] = "_display_name";
                    i2 = i3 + 1;
                    objArr[i3] = a2.getName();
                } else if ("_size".equals(str3)) {
                    strArr3[i3] = "_size";
                    i2 = i3 + 1;
                    objArr[i3] = Long.valueOf(q0.q(a2));
                }
                i3 = i2;
            }
            String[] strArr4 = new String[i3];
            System.arraycopy(strArr3, 0, strArr4, 0, i3);
            Object[] objArr2 = new Object[i3];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
            matrixCursor.addRow(objArr2);
            return matrixCursor;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
