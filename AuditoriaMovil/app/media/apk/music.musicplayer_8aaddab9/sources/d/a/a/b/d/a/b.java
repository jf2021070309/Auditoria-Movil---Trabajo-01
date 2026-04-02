package d.a.a.b.d.a;

import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public FileProvider a;

    public b(FileProvider fileProvider) {
        this.a = fileProvider;
    }

    public static String c(String str) {
        String str2 = File.separator;
        if (str.contains(str2)) {
            String[] split = str.split(str2);
            for (int i2 = 0; i2 < split.length; i2++) {
                if (split[i2].length() > 0) {
                    split[i2] = e.a.d.a.a.r(e.a.d.a.a.y("(?:\ufffe)?"), split[i2], "(?:\uffff)?");
                }
            }
            return TextUtils.join(File.separator, split);
        }
        return e.a.d.a.a.l("(?:\ufffe)?", str, "(?:\uffff)?");
    }

    public final void a(List<File> list, List<h> list2, int i2, List<File> list3) {
        if (i2 >= list2.size() - 1) {
            return;
        }
        h hVar = list2.get(i2);
        for (File file : list) {
            if (this.a.isDirectory(file) && hVar.c(file)) {
                list3.add(file);
                a(Arrays.asList(this.a.listFiles(file, null)), list2, i2 + 1, list3);
            }
        }
    }

    public final List<File> b(List<File> list, List<h> list2, int i2) {
        ArrayList arrayList = new ArrayList();
        h hVar = list2.get(i2);
        int size = list2.size() - 1;
        Iterator<File> it = list.iterator();
        if (i2 >= size) {
            while (it.hasNext()) {
                File next = it.next();
                if (hVar.c(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        while (it.hasNext()) {
            File next2 = it.next();
            if (this.a.isDirectory(next2) && hVar.c(next2)) {
                arrayList.addAll(b(Arrays.asList(this.a.listFiles(next2, null)), list2, i2 + 1));
            }
        }
        return arrayList;
    }

    public List<h> d(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            boolean z = str2.contains("(?:\ufffe)?") && str2.contains("(?:\uffff)?");
            String replace = str2.replace("(?:\ufffe)?", "").replace("(?:\uffff)?", "");
            if (z) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new g(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new i(replace));
            } else {
                arrayList2.add(replace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new g(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    public final List<String> e(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }
}
