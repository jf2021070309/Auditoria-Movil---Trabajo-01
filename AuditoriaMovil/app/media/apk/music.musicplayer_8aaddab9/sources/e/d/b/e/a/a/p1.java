package e.d.b.e.a.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class p1 implements e3 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("FakeAssetPackService");

    /* renamed from: b  reason: collision with root package name */
    public final String f6884b;

    /* renamed from: c  reason: collision with root package name */
    public final t f6885c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f6886d;

    /* renamed from: e  reason: collision with root package name */
    public final a2 f6887e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<Executor> f6888f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f6889g = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public p1(File file, t tVar, t0 t0Var, Context context, a2 a2Var, e.d.b.e.a.c.b0<Executor> b0Var) {
        this.f6884b = file.getAbsolutePath();
        this.f6885c = tVar;
        this.f6886d = context;
        this.f6887e = a2Var;
        this.f6888f = b0Var;
    }

    public static long f(int i2, long j2) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return j2;
            }
            return 0L;
        }
        return j2 / 2;
    }

    @Override // e.d.b.e.a.a.e3
    public final void a() {
        a.a(4, "keepAlive", new Object[0]);
    }

    @Override // e.d.b.e.a.a.e3
    public final void a(int i2) {
        a.a(4, "notifySessionFailed", new Object[0]);
    }

    @Override // e.d.b.e.a.a.e3
    public final void a(List<String> list) {
        a.a(4, "cancelDownload(%s)", new Object[]{list});
    }

    @Override // e.d.b.e.a.a.e3
    public final void b(final int i2, final String str) {
        a.a(4, "notifyModuleCompleted", new Object[0]);
        this.f6888f.a().execute(new Runnable(this, i2, str) { // from class: e.d.b.e.a.a.m1
            public final p1 a;

            /* renamed from: b  reason: collision with root package name */
            public final int f6857b;

            /* renamed from: c  reason: collision with root package name */
            public final String f6858c;

            {
                this.a = this;
                this.f6857b = i2;
                this.f6858c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p1 p1Var = this.a;
                int i3 = this.f6857b;
                String str2 = this.f6858c;
                Objects.requireNonNull(p1Var);
                try {
                    p1Var.g(i3, str2, 4);
                } catch (e.d.b.e.a.b.a e2) {
                    p1.a.a(5, "notifyModuleCompleted failed", new Object[]{e2});
                }
            }
        });
    }

    @Override // e.d.b.e.a.a.e3
    public final e.d.b.e.a.g.r<List<String>> c(Map<String, Long> map) {
        a.a(4, "syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        e.d.b.e.a.g.r<List<String>> rVar = new e.d.b.e.a.g.r<>();
        rVar.b(arrayList);
        return rVar;
    }

    @Override // e.d.b.e.a.a.e3
    public final e.d.b.e.a.g.r<ParcelFileDescriptor> d(int i2, String str, String str2, int i3) {
        File[] h2;
        int i4;
        a.a(4, "getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)});
        e.d.b.e.a.g.r<ParcelFileDescriptor> rVar = new e.d.b.e.a.g.r<>();
        try {
        } catch (e.d.b.e.a.b.a e2) {
            a.a(5, "getChunkFileDescriptor failed", new Object[]{e2});
            rVar.a(e2);
        } catch (FileNotFoundException e3) {
            a.a(5, "getChunkFileDescriptor failed", new Object[]{e3});
            rVar.a(new e.d.b.e.a.b.a("Asset Slice file not found.", e3));
        }
        for (File file : h(str)) {
            if (e.d.b.d.a.b(file).equals(str2)) {
                rVar.b(ParcelFileDescriptor.open(file, 268435456));
                return rVar;
            }
        }
        throw new e.d.b.e.a.b.a(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // e.d.b.e.a.a.e3
    public final void e(int i2, String str, String str2, int i3) {
        a.a(4, "notifyChunkTransferred", new Object[0]);
    }

    public final void g(int i2, String str, int i3) throws e.d.b.e.a.b.a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f6887e.a());
        bundle.putInt("session_id", i2);
        File[] h2 = h(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j2 = 0;
        for (File file : h2) {
            j2 += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String b2 = e.d.b.d.a.b(file);
            bundle.putParcelableArrayList(e.d.b.d.a.d("chunk_intents", str, b2), arrayList2);
            try {
                bundle.putString(e.d.b.d.a.d("uncompressed_hash_sha256", str, b2), e.d.b.d.a.e(Arrays.asList(file)));
                bundle.putLong(e.d.b.d.a.d("uncompressed_size", str, b2), file.length());
                arrayList.add(b2);
            } catch (IOException e2) {
                throw new e.d.b.e.a.b.a(String.format("Could not digest file: %s.", file), e2);
            } catch (NoSuchAlgorithmException e3) {
                throw new e.d.b.e.a.b.a("SHA256 algorithm not supported.", e3);
            }
        }
        bundle.putStringArrayList(e.d.b.d.a.c("slice_ids", str), arrayList);
        bundle.putLong(e.d.b.d.a.c("pack_version", str), this.f6887e.a());
        bundle.putInt(e.d.b.d.a.c("status", str), i3);
        bundle.putInt(e.d.b.d.a.c("error_code", str), 0);
        bundle.putLong(e.d.b.d.a.c("bytes_downloaded", str), f(i3, j2));
        bundle.putLong(e.d.b.d.a.c("total_bytes_to_download", str), j2);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", f(i3, j2));
        bundle.putLong("total_bytes_to_download", j2);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f6889g.post(new Runnable(this, putExtra) { // from class: e.d.b.e.a.a.o1
            public final p1 a;

            /* renamed from: b  reason: collision with root package name */
            public final Intent f6882b;

            {
                this.a = this;
                this.f6882b = putExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p1 p1Var = this.a;
                p1Var.f6885c.a(p1Var.f6886d, this.f6882b);
            }
        });
    }

    public final File[] h(final String str) throws e.d.b.e.a.b.a {
        File file = new File(this.f6884b);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: e.d.b.e.a.a.n1
                public final String a;

                {
                    this.a = str;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(this.a).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (e.d.b.d.a.b(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new e.d.b.e.a.b.a(String.format("No master slice available for pack '%s'.", str));
                }
                throw new e.d.b.e.a.b.a(String.format("No APKs available for pack '%s'.", str));
            }
            throw new e.d.b.e.a.b.a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new e.d.b.e.a.b.a(String.format("Local testing directory '%s' not found.", file));
    }
}
