package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes2.dex */
class NdkCrashFilesManager implements CrashFilesManager {
    private static final Comparator<? super File> LATEST_SESSION_FIRST = new Comparator() { // from class: com.google.firebase.crashlytics.ndk.-$$Lambda$NdkCrashFilesManager$FPB21gKV-CnU7akQxYuE6heblCY
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
            return compareTo;
        }
    };
    private static final int MAX_SESSIONS = 8;
    private final File rootPath;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NdkCrashFilesManager(File file) {
        this.rootPath = file;
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public boolean hasSessionFileDirectory(String str) {
        return new File(this.rootPath, str).exists();
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public File getSessionFileDirectory(String str) {
        return prepareDirectory(new File(this.rootPath, str));
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public void deleteSessionFileDirectory(String str) {
        recursiveDelete(new File(this.rootPath, str));
    }

    @Override // com.google.firebase.crashlytics.ndk.CrashFilesManager
    public void cleanOldSessionFileDirectories() {
        File[] listFiles = this.rootPath.listFiles(new FileFilter() { // from class: com.google.firebase.crashlytics.ndk.-$$Lambda$NdkCrashFilesManager$k1LMnpJLlrYtcSsQvSbPW-daMgg
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean isDirectory;
                isDirectory = file.isDirectory();
                return isDirectory;
            }
        });
        if (listFiles != null) {
            if (listFiles.length > 8) {
                Arrays.sort(listFiles, LATEST_SESSION_FIRST);
                for (int i = 8; i < listFiles.length; i++) {
                    recursiveDelete(listFiles[i]);
                }
            }
        }
    }

    private static File prepareDirectory(File file) {
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        return null;
    }

    private static void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }
}
