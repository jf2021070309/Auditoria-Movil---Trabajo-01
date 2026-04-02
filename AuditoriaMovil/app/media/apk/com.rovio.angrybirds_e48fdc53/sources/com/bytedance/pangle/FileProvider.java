package com.bytedance.pangle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.pangle.transform.ZeusTransformUtils;
import com.kuaishou.weapon.p0.t;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        Uri a(File file);

        File a(Uri uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (c != null) {
            throw new SecurityException("仅允许定义一个FileProvider");
        }
        c = new b(providerInfo.authority);
    }

    public static Uri getUriForFile(File file) {
        return c.a(file);
    }

    public static void a(Plugin plugin, XmlResourceParser xmlResourceParser) {
        try {
            try {
                String str = plugin.mPkgName;
                Context wrapperContext = ZeusTransformUtils.wrapperContext(Zeus.getAppApplication(), plugin.mPkgName);
                b bVar = (b) c;
                while (true) {
                    int next = xmlResourceParser.next();
                    if (next == 1) {
                        return;
                    }
                    if (next == 2) {
                        String name = xmlResourceParser.getName();
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            r5 = b;
                        } else if ("files-path".equals(name)) {
                            r5 = wrapperContext.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            r5 = wrapperContext.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            r5 = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = Build.VERSION.SDK_INT >= 19 ? wrapperContext.getExternalFilesDirs(null) : new File[]{wrapperContext.getExternalFilesDir(null)};
                            r5 = externalFilesDirs.length > 0 ? externalFilesDirs[0] : null;
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = Build.VERSION.SDK_INT >= 19 ? wrapperContext.getExternalCacheDirs() : new File[]{wrapperContext.getExternalCacheDir()};
                            if (externalCacheDirs.length > 0) {
                                r5 = externalCacheDirs[0];
                            }
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            if ("external-media-path".equals(name)) {
                                File[] externalMediaDirs = wrapperContext.getExternalMediaDirs();
                                if (externalMediaDirs.length > 0) {
                                    r5 = externalMediaDirs[0];
                                }
                            }
                        }
                        if (r5 != null) {
                            String str2 = str + "_" + attributeValue;
                            File a2 = a(r5, attributeValue2);
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                            try {
                                bVar.a.put(str2, a2.getCanonicalFile());
                            } catch (IOException e) {
                                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(a2)), e);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (XmlPullParserException e3) {
            e = e3;
            e.printStackTrace();
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File a2 = c.a(uri);
        if (strArr == null) {
            strArr = a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i] = "_display_name";
                objArr[i] = a2.getName();
                i++;
            } else if ("_size".equals(str3)) {
                strArr3[i] = "_size";
                objArr[i] = Long.valueOf(a2.length());
                i++;
            }
        }
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a2 = c.a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
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
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return c.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a2 = c.a(uri);
        if (t.k.equals(str)) {
            i = DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
        }
        return ParcelFileDescriptor.open(a2, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements a {
        final HashMap<String, File> a = new HashMap<>();
        private final String b;

        b(String str) {
            this.b = str;
        }

        @Override // com.bytedance.pangle.FileProvider.a
        public final Uri a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.a.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
                }
                String path2 = entry.getValue().getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(this.b).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
            }
        }

        @Override // com.bytedance.pangle.FileProvider.a
        public final File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.a.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (!canonicalFile.getPath().startsWith(file.getPath())) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
                return canonicalFile;
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }
}
