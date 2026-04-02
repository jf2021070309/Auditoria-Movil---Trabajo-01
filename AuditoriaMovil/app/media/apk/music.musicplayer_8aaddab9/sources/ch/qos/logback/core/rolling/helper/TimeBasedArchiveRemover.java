package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import d.a.a.b.d.a.c;
import d.a.a.b.d.a.d;
import d.a.a.b.d.a.f;
import d.a.a.b.d.a.h;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class TimeBasedArchiveRemover extends ContextAwareBase implements ArchiveRemover {
    private final d.a.a.b.d.a.a dateParser;
    public final FileNamePattern fileNamePattern;
    private final FileProvider fileProvider;
    private final d fileSorter;
    private final RollingCalendar rc;
    private int maxHistory = 0;
    private long totalSizeCap = 0;

    /* loaded from: classes.dex */
    public class a implements FilenameFilter {
        public final /* synthetic */ Date a;

        public a(Date date) {
            this.a = date;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return TimeBasedArchiveRemover.this.rc.normalizeDate(TimeBasedArchiveRemover.this.dateParser.a(str)).compareTo(TimeBasedArchiveRemover.this.rc.normalizeDate(TimeBasedArchiveRemover.this.rc.getEndOfNextNthPeriod(this.a, -TimeBasedArchiveRemover.this.maxHistory))) < 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public Date a;

        public b(Date date) {
            this.a = date;
        }

        @Override // java.lang.Runnable
        public void run() {
            TimeBasedArchiveRemover.this.clean(this.a);
        }
    }

    public TimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar, FileProvider fileProvider) {
        this.fileNamePattern = fileNamePattern;
        this.rc = rollingCalendar;
        this.fileProvider = fileProvider;
        d.a.a.b.d.a.a aVar = new d.a.a.b.d.a.a(fileNamePattern);
        this.dateParser = aVar;
        this.fileSorter = new d(aVar, new f(fileNamePattern));
    }

    private void capTotalSize(List<String> list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        d dVar = this.fileSorter;
        Objects.requireNonNull(dVar);
        Arrays.sort(strArr, new c(dVar));
        long j2 = 0;
        long j3 = 0;
        for (String str : strArr) {
            File file = new File(str);
            long length = this.fileProvider.length(file);
            if (j3 + length > this.totalSizeCap) {
                addInfo("Deleting [" + file + "] of size " + new FileSize(length));
                if (!delete(file)) {
                    length = 0;
                }
                j2 += length;
            }
            j3 += length;
        }
        StringBuilder y = e.a.d.a.a.y("Removed  ");
        y.append(new FileSize(j2));
        y.append(" of files");
        addInfo(y.toString());
    }

    private FilenameFilter createExpiredFileFilter(Date date) {
        return new a(date);
    }

    private boolean delete(File file) {
        addInfo("deleting " + file);
        boolean deleteFile = this.fileProvider.deleteFile(file);
        if (!deleteFile) {
            addWarn("cannot delete " + file);
        }
        return deleteFile;
    }

    private List<String> filterFiles(List<String> list, FilenameFilter filenameFilter) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : (String[]) list.toArray(new String[0])) {
            if (filenameFilter.accept(null, str)) {
                arrayList.add(str);
                list.remove(str);
            }
        }
        return arrayList;
    }

    private List<String> findEmptyDirs() {
        d.a.a.b.d.a.b bVar = new d.a.a.b.d.a.b(this.fileProvider);
        List<h> d2 = bVar.d(this.fileNamePattern.toRegex());
        ArrayList arrayList = new ArrayList();
        bVar.a(((h) ((ArrayList) d2).get(0)).a(bVar.a), d2, 1, arrayList);
        List<String> e2 = bVar.e(arrayList);
        Collections.reverse(e2);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = ((ArrayList) e2).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int length = this.fileProvider.list(new File(str), null).length;
            if (length == 0 || (length == 1 && arrayDeque.size() > 0 && str.equals(arrayDeque.peekLast()))) {
                arrayDeque.add(str);
            }
        }
        return Arrays.asList(arrayDeque.toArray(new String[0]));
    }

    private List<String> findFiles() {
        d.a.a.b.d.a.b bVar = new d.a.a.b.d.a.b(this.fileProvider);
        List<h> d2 = bVar.d(this.fileNamePattern.toRegex());
        return bVar.e(bVar.b(((h) ((ArrayList) d2).get(0)).a(bVar.a), d2, 1));
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void clean(Date date) {
        List<String> findFiles = findFiles();
        for (String str : filterFiles(findFiles, createExpiredFileFilter(date))) {
            delete(new File(str));
        }
        long j2 = this.totalSizeCap;
        if (j2 != 0 && j2 > 0) {
            capTotalSize(findFiles);
        }
        for (String str2 : findEmptyDirs()) {
            delete(new File(str2));
        }
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public Future<?> cleanAsynchronously(Date date) {
        return this.context.getScheduledExecutorService().submit(new b(date));
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setMaxHistory(int i2) {
        this.maxHistory = i2;
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setTotalSizeCap(long j2) {
        this.totalSizeCap = j2;
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }
}
