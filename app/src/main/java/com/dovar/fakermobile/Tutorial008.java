package com.dovar.fakermobile;

/**
 * Generated by smali2java 1.0.0.558
 * Copyright (C) 2013 Hensence.com
 */


/*public class Tutorial008 implements IXposedHookLoadPackage {

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        onLog(lpparam.packageName);
        if ((!lpparam.packageName.equals("com.soft.apk008v")) && (!lpparam.packageName.equals("com.android.systemui"))) {
            if (!lpparam.packageName.equals("com.yulong.android.launcher3")) {
                if (!lpparam.packageName.equals("com.android.packageinstaller")) {
                    if (lpparam.packageName.equals("com.mediatek.op02.plugin")) {
                        return;
                    }
                    saveDataToFile("install", "true");
                    String mode = getFileData("008Mode");
                    if (mode.length() > 0) {
                        mode = getFileData("008Mode");
                        if (mode.equals("2")) {
                            String systemProPackAge = getFileData("systemProPackAge");
                            if (!systemProPackAge.equals(lpparam.packageName)) {
                                onLog(systemProPackAge);
                                return;
                            }
                        }
                        if (mode.equals("0")) {
                            onLog("当前模式为关闭");
                            return;
                        }
                        if (mode.equals("3")) {
                            onLog("当前模式为全局（非系统应用）");
                            if (Process.myUid() <= 1000) {
                                return;
                            }
                        } else if (mode.equals("1")) {
                            onLog("当前模式为全局");
                        }
                    } else {
                        saveDataToFile("008Mode", "3");
                    }
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getDeviceId", new Object[0x0]);
                    if (Process.myUid() <= 1000) {
                        onLog("系统应用");
                        setProductData();
                        return;
                    }
                    onLog("非系统应用");

                    addHook(lpparam.packageName, WifiInfo.class.getName(), lpparam.classLoader, "getMacAddress", new Object[0x0]);
                    addHook(lpparam.packageName, WifiInfo.class.getName(), lpparam.classLoader, "getSSID", new Object[0x0]);
                    addHook(lpparam.packageName, WifiInfo.class.getName(), lpparam.classLoader, "getBSSID", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getSimSerialNumber", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getSubscriberId", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getLine1Number", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getSimCountryIso", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getSimOperator", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getSimOperatorName", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getNetworkCountryIso", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getNetworkOperator", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getNetworkOperatorName", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getNetworkType", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getPhoneType", new Object[0x0]);
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "hasIccCard", new Object[0x0]);
                    addHook(lpparam.packageName, Settings.Secure.class.getName(), lpparam.classLoader, "getString", new Object[]{ContentResolver.class.getName(), String.class.getName()});
                    addHook(lpparam.packageName, TelephonyManager.class.getName(), lpparam.classLoader, "getSimState", new Object[0x0]);
                    addHook(lpparam.packageName, Build.class.getName(), lpparam.classLoader, "getRadioVersion", new Object[0x0]);
                    addHook(lpparam.packageName, "android.app.ApplicationPackageManager", lpparam.classLoader, "getInstalledPackages", new Object[]{Integer.TYPE.getName()});
                    addHook(lpparam.packageName, ActivityManager.class.getName(), lpparam.classLoader, "getRunningAppProcesses", new Object[0x0]);
                    addHook(lpparam.packageName, "android.app.ApplicationPackageManager", lpparam.classLoader, "getInstalledApplications", new Object[]{Integer.TYPE.getName()});
                    addHook(lpparam.packageName, ActivityManager.class.getName(), lpparam.classLoader, "getRecentTasks", new Object[]{Integer.TYPE.getName(), Integer.TYPE.getName()});
                    addHook(lpparam.packageName, "android.os.SystemProperties", lpparam.classLoader, "get", new Object[]{String.class, String.class});
                    addHook(lpparam.packageName, "android.os.SystemProperties", lpparam.classLoader, "get", new Object[]{String.class});
                    addHook(lpparam.packageName, GsmCellLocation.class.getName(), lpparam.classLoader, "getLac", new Object[0x0]);
                    addHook(lpparam.packageName, GsmCellLocation.class.getName(), lpparam.classLoader, "getCid", new Object[0x0]);
                    addHook(lpparam.packageName, CdmaCellLocation.class.getName(), lpparam.classLoader, "getNetworkId", new Object[0x0]);
                    addHook(lpparam.packageName, CdmaCellLocation.class.getName(), lpparam.classLoader, "getBaseStationId", new Object[0x0]);
                    addHook(lpparam.packageName, NeighboringCellInfo.class.getName(), lpparam.classLoader, "getLac", new Object[0x0]);
                    addHook(lpparam.packageName, NeighboringCellInfo.class.getName(), lpparam.classLoader, "getCid", new Object[0x0]);
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "putFloat", new Object[]{ContentResolver.class.getName(), String.class.getName(), Float.TYPE.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "putInt", new Object[]{ContentResolver.class.getName(), String.class.getName(), Integer.TYPE.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "putLong", new Object[]{ContentResolver.class.getName(), String.class.getName(), Long.TYPE.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "putString", new Object[]{ContentResolver.class.getName(), String.class.getName(), String.class.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getFloat", new Object[]{ContentResolver.class.getName(), String.class.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getInt", new Object[]{ContentResolver.class.getName(), String.class.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getLong", new Object[]{ContentResolver.class.getName(), String.class.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getString", new Object[]{ContentResolver.class.getName(), String.class.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getFloat", new Object[]{ContentResolver.class.getName(), String.class.getName(), Float.TYPE.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getInt", new Object[]{ContentResolver.class.getName(), String.class.getName(), Integer.TYPE.getName()});
                    addHook(lpparam.packageName, Settings.System.class.getName(), lpparam.classLoader, "getLong", new Object[]{ContentResolver.class.getName(), String.class.getName(), Long.TYPE.getName()});
                    addHook(lpparam.packageName, Display.class.getName(), lpparam.classLoader, "getMetrics", new Object[]{DisplayMetrics.class.getName()});
                    addHook(lpparam.packageName, Display.class.getName(), lpparam.classLoader, "getWidth", new Object[0x0]);
                    addHook(lpparam.packageName, Display.class.getName(), lpparam.classLoader, "getHeight", new Object[0x0]);
                    addHook(lpparam.packageName, Location.class.getName(), lpparam.classLoader, "getLatitude", new Object[0x0]);
                    addHook(lpparam.packageName, Location.class.getName(), lpparam.classLoader, "getLongitude", new Object[0x0]);
                    addHook(lpparam.packageName, WifiManager.class.getName(), lpparam.classLoader, "getScanResults", new Object[0x0]);
                    addHook(lpparam.packageName, NetworkInfo.class.getName(), lpparam.classLoader, "getTypeName", new Object[0x0]);
                    addHook(lpparam.packageName, ConnectivityManager.class.getName(), lpparam.classLoader, "getNetworkInfo", new Object[]{Integer.TYPE.getName()});
                    addHook(lpparam.packageName, WebView.class.getName(), lpparam.classLoader, "loadUrl", new Object[]{String.class.getName()});
                    addHook(lpparam.packageName, WebView.class.getName(), lpparam.classLoader, "loadUrl", new Object[]{String.class.getName(), Map.class.getName()});
                    addHook(lpparam.packageName, Runtime.class.getName(), lpparam.classLoader, "exec", new Object[]{String.class.getName()});
                    addHookCon(lpparam.packageName, FileReader.class.getName(), lpparam.classLoader, new Object[]{String.class.getName()});
                    addHookCon(lpparam.packageName, File.class.getName(), lpparam.classLoader, new Object[]{String.class.getName(), String.class.getName()});
                    addHookCon(lpparam.packageName, File.class.getName(), lpparam.classLoader, new Object[]{File.class.getName(), String.class.getName()});
                    addHookCon(lpparam.packageName, File.class.getName(), lpparam.classLoader, new Object[]{String.class.getName()});
                }
            }
        }
    }

    public void addHook(final String targetPackage, final String className, ClassLoader classLoader, final String methodName, Object[] parameterTypesAndCallback) {
        XC_MethodHook hook = new XC_MethodHook(this, className, methodName, targetPackage) {


            protected void beforeHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                // :( Parsing error. Please contact me.
            }

            protected void afterHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                if (className.equals("cn.yqzq.zqb.tools.EncryptHelpr")) {
                    return;
                }
                if ("android.app.ApplicationPackageManager".equals(className)) {
                    JSONObject data = JSON.parseObject(getFileData("hideProgess"));
                    if ((data != null) && (data.get("ifOpen") != null)) {
                        String ifOpen = data.get("ifOpen");
                        if (ifOpen.equals("true")) {
                            if (data.get("hide_target") != null) {
                                String targetStr = data.get("hide_target");
                                String[] arr = targetStr.split("_");
                                if (arr.length != 0x2) {
                                    onLog("\u83b7\u53d6\u7a0b\u5e8f\u5217\u8868\u53c2\u6570\u9519\u8bef");
                                    super.beforeHookedMethod(param);
                                    return;
                                }
                                if (targetPackage.equals(arr[0x1])) {
                                    onLog("\u963b\u6b62\u83b7\u53d6\u7a0b\u5e8f\u5217\u8868\u6210\u529f");
                                    if (methodName.equals("getInstalledApplications")) {
                                        ArrayList<ApplicationInfo> remveList = new ArrayList<ApplicationInfo>();
                                        ArrayList<ApplicationInfo> sourceList = (ArrayList) param.getResult();
                                        JSONObject appMap = (JSONObject) data.get("appArray");
                                        if (appMap != null) {
                                            if (!localIterator1.hasNext()) {
                                            }
                                            ApplicationInfo item = (ApplicationInfo) localIterator1.next();
                                            String pageName = item.packageName;
                                            if (appMap.get(pageName) != null) {
                                                remveList.add(item);
                                                sourceList.removeAll(remveList);
                                            }
                                        }
                                        param.setResult(sourceList);
                                    } else {
                                        ArrayList<PackageInfo> remveList = new ArrayList<PackageInfo>();
                                        ArrayList<PackageInfo> sourceList = (ArrayList) param.getResult();
                                        appMap = (JSONObject) data.get("appArray");
                                        if (appMap != null) {
                                        }
                                        if (!localIterator2.hasNext()) {
                                        } else {
                                            PackageInfo item = (PackageInfo) localIterator3.next();
                                            String pageName = item.packageName;
                                            if (appMap.get(pageName) != null) {
                                                remveList.add(item);
                                                sourceList.removeAll(remveList);
                                            }
                                        } else{
                                            param.setResult(sourceList);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (valueMap.getName().equals(className)) {
                    data = JSON.parseObject(getFileData("hideProgess"));
                    if (data == null) {
                        super.beforeHookedMethod(param);
                        return;
                    }
                    if (data.get("ifOpen") != null) {
                        ifOpen = data.get("ifOpen");
                        if (ifOpen.equals("true")) {
                            if (data.get("hide_target") != null) {
                                targetStr = data.get("hide_target");
                                arr = targetStr.split("_");
                                if (arr.length != 0x2) {
                                    onLog("\u83b7\u53d6\u7a0b\u5e8f\u5217\u8868\u53c2\u6570\u9519\u8bef");
                                    super.beforeHookedMethod(param);
                                    return;
                                }
                                if (targetPackage.equals(arr[0x1])) {
                                    if (methodName.equals("getRecentTasks")) {
                                        onLog("\u963b\u6b62getRecentTasks\u5217\u8868\u6210\u529f");
                                        ArrayList<ActivityManager.RecentTaskInfo> sourceList = (ArrayList) param.getResult();
                                        ArrayList<ActivityManager.RecentTaskInfo> remveList = new ArrayList<ActivityManager.RecentTaskInfo>();
                                        appMap = (JSONObject) data.get("appArray");
                                        if (appMap != null) {
                                            if (!localIterator4.hasNext()) {
                                            }
                                            ActivityManager.RecentTaskInfo item = (ActivityManager.RecentTaskInfo) localIterator4.next();
                                            pageName = localObject5.getPackageName();
                                            if (appMap.get(pageName) != null) {
                                                remveList.add(item);
                                                sourceList.removeAll(remveList);
                                            }
                                        }
                                        param.setResult(sourceList);
                                    } else if (methodName.equals("getRunningAppProcesses")) {
                                        onLog("\u963b\u6b62getRunningAppProcesses\u5217\u8868\u6210\u529f");
                                        ArrayList<ActivityManager.RunningAppProcessInfo> sourceList = (ArrayList) param.getResult();
                                        ArrayList<ActivityManager.RunningAppProcessInfo> remveList = new ArrayList<ActivityManager.RunningAppProcessInfo>();
                                        appMap = (JSONObject) data.get("appArray");
                                        if (appMap != null) {
                                        }
                                        if (!localIterator6.hasNext()) {
                                        } else {
                                            ActivityManager.RunningAppProcessInfo item = (ActivityManager.RunningAppProcessInfo) localIterator7.next();
                                            String pageName = item.processName;
                                            if (appMap.get(pageName) != null) {
                                                remveList.add(item);
                                                sourceList.removeAll(remveList);
                                            }
                                        } else{
                                            param.setResult(sourceList);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (valueMap.getName().equals(className)) {
                    if (targetPackage.equals(SetSystemValueActivity.getSystemValuePackageName())) {
                        if (methodName.indexOf("put") >= 0) {
                            onLog(this);
                            SetSystemValueActivity.addItem(param.args[0x1], false, param.args[0x2]);
                            return;
                        }
                        if (!param.args[0x1].equals("android_id")) {
                            if (param.args.length == 0x2) {
                                onLog(this);
                                onLog(this);
                                SetSystemValueActivity.addItem(param.args[0x1], true, param.getResult());
                                return;
                            }
                            if (param.args.length == 0x3) {
                                onLog(this);
                                onLog(this);
                                SetSystemValueActivity.addItem(param.args[0x1], true, param.getResult());
                            }
                        }
                    }
                    return;
                }
                if ((className.equals(localObject5.getName())) && (valueMap != null)) {
                    if (SettingActivity.getValue("setDisplay").equals("true")) {
                        param.getResult();
                        String value = (String) valueMap.get("getMetrics");
                        String[] data = value.split("x");
                        if (methodName.equals("getMetrics")) {
                            DisplayMetrics m = (DisplayMetrics) param.args[0x0];
                            String sourceDisplay = getFileData("sourceDisplay");
                            String[] sourceData = sourceDisplay.split("_");
                            if (sourceData.length == 0x2) {
                                int width1 = Integer.parseInt(sourceData[0x0]);
                                int height1 = Integer.parseInt(sourceData[0x1]);
                                if ((width1 == m.widthPixels) && (height1 == m.heightPixels)) {
                                    if (data.length == 0x2) {
                                        onLog((this + value);
                                        int width = Integer.parseInt(data[0x0]);
                                        int height = Integer.parseInt(data[0x1]);
                                        m.heightPixels = height;
                                        m.widthPixels = width;
                                        if (valueMap.get("density") != null) {
                                            m.density = Float.parseFloat(valueMap.get("density"));
                                        }
                                        if (valueMap.get("densityDpi") != null) {
                                            m.densityDpi = Integer.parseInt(valueMap.get("densityDpi"));
                                        }
                                        if (valueMap.get("scaledDensity") != null) {
                                            m.scaledDensity = Float.parseFloat(valueMap.get("scaledDensity"));
                                        }
                                        if (valueMap.get("xdpi") != null) {
                                            m.xdpi = Float.parseFloat(valueMap.get("xdpi"));
                                        }
                                        if (valueMap.get("ydpi") != null) {
                                            m.ydpi = Float.parseFloat(valueMap.get("ydpi"));
                                        }
                                        param.setResult(m);
                                    }
                                }
                            }
                        } else if (methodName.equals("getWidth")) {
                            if (data.length == 0x2) {
                                onLog(data[0x0]);
                                param.setResult(Integer.valueOf(Integer.parseInt(data[0x0])));
                            }
                        } else if (methodName.equals("getHeight")) {
                            if (data.length == 0x2) {
                                onLog(data[0x1]);
                                param.setResult(Integer.valueOf(Integer.parseInt(data[0x1])));
                            }
                        }
                    }
                }
                super.afterHookedMethod(param);
            }
        };
        Object[] arr = new Object[(parameterTypesAndCallback.length + 1)];
        for (int i = 0; i <parameterTypesAndCallback.length; i = i + 1) {
            arr[i] = parameterTypesAndCallback[i];
        }
        arr[parameterTypesAndCallback.length] = hook;
        XposedHelpers.findAndHookMethod(className, classLoader, methodName, arr);
    }

    public void addHookCon(final String targetPackage, final String className, ClassLoader classLoader, Object[] parameterTypesAndCallback) {
        XC_MethodHook hook = new XC_MethodHook(this, className, targetPackage) {

            protected void beforeHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                String fileName = "";
                if (className.equals(File.class.getName())) {
                    if (param.args.length == 0x1) {
                        fileName = (String) param.args[0x0];
                    } else if (param.args.length == 0x2) {
                        if (param.args[0x0] instanceof File) {
                            File file = (File) param.args[0x0];
                            fileName = File.separator + param.args[0x1];
                        } else {
                            fileName = param.args[0x0] + File.separator + param.args[0x1];
                        }
                    }
                    if (fileName.equals("/proc/cpuinfo")) {
                        File file = new File(CPUTool.myCpuFile);
                        if (file.exists()) {
                            onLog("\u8bbe\u7f6ecpu\u4fe1\u606f");
                            if (valueMap.get("setCpuName") != null) {
                                CPUTool.setCpuName(valueMap.get("setCpuName"));
                            }
                            if (param.args.length == 0x1) {
                                param.args[0x0] = CPUTool.myCpuFile;
                                return;
                            }
                            if (param.args.length == 0x2) {
                                if (param.args[0x0] instanceof File) {
                                    param.args[0x0] = Environment.getExternalStorageDirectory();
                                    param.args[0x1] = CPUTool.file;
                                    return;
                                }
                                param.args[0x0] = Environment.getExternalStorageDirectory().getAbsolutePath();
                                param.args[0x1] = CPUTool.file;
                            }
                        }
                        return;
                    }
                    if (valueMap.get("file_hook_package_open").equals("true")) {
                        String file_hook_package = (String) valueMap.get("file_hook_package");
                        String[] data = file_hook_package.split("_");
                        if (data.length == 0x2) {
                            if (targetPackage.equals(data[0x1])) {
                                if ((fileName.indexOf(".log") < 0) && (fileName.indexOf(".system") < 0) && (fileName.indexOf(MyLog.ExternalStorage) == 0)) {
                                    if (!fileName.trim().equals(MyLog.ExternalStorage.trim())) {
                                        if (MyLog.addLogLast(targetPackage, fileName)) {
                                            onLog(fileName);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    super.afterHookedMethod(param);
                    return;
                }
                if (FileReader.class.getName().equals(className)) {
                    if (param.args[0x0].equals("/proc/cpuinfo")) {
                        File file = new File(CPUTool.myCpuFile);
                        if (file.exists()) {
                            if (valueMap.get("setCpuName") != null) {
                                onLog("\u8bbe\u7f6ecpu\u4fe1\u606f");
                                CPUTool.setCpuName(valueMap.get("setCpuName"));
                                param.args[0x0] = CPUTool.myCpuFile;
                            }
                        }
                        return;
                    }
                    if (param.args[0x0] instanceof String) {
                        String file_hook_package = (String) valueMap.get("file_hook_package");
                        String[] data = file_hook_package.split("_");
                        if (data.length == 0x2) {
                            int index = file_hook_package.indexOf("_");
                            if (index != -0x1) {
                                String packAge = file_hook_package.substring((index + 0x1));
                                data[0x1] = packAge;
                                if (targetPackage.equals(data[0x1])) {
                                    fileName = (String) param.args[0x0];
                                    if ((fileName.indexOf(".log") < 0) && (fileName.indexOf(".system") < 0) && (fileName.indexOf(MyLog.ExternalStorage) == 0)) {
                                        if (!fileName.trim().equals(MyLog.ExternalStorage.trim())) {
                                            if (MyLog.addLogLast(targetPackage, fileName)) {
                                                onLog(fileName);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
        Object[] arr = new Object[(parameterTypesAndCallback.length + 0x1)];
        for (int i = 0x0; i >= parameterTypesAndCallback.length; i = i + 0x1) {
            arr[i] = parameterTypesAndCallback[i];
        }
        arr[parameterTypesAndCallback.length] = hook;
        XposedHelpers.findAndHookConstructor(className, classLoader, arr);
    }

    public void onLog(String str) {
        XposedBridge.log(str);
    }

    private void setProductData() {
        if (valueMap.size() == 0) {
            initData(null);
            onLog("第一次加载valueMap");
        }
        if (valueMap.get("BRAND") != null) {
            XposedHelpers.setStaticObjectField(Build.class, "BRAND", valueMap.get("BRAND"));
        }
        if (valueMap.get("MODEL") != null) {
            XposedHelpers.setStaticObjectField(Build.class, "MODEL", valueMap.get("MODEL"));
        }
        if (valueMap.get("PRODUCT") != null) {
            XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", valueMap.get("PRODUCT"));
        }
        if (valueMap.get("MANUFACTURER") != null) {
            XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", valueMap.get("MANUFACTURER"));
        }
        if (valueMap.get("DEVICE") != null) {
            XposedHelpers.setStaticObjectField(Build.class, "DEVICE", valueMap.get("DEVICE"));
        }
        if (valueMap.get("RELEASE") != null) {
            XposedHelpers.setStaticObjectField(Build.VERSION.class, "RELEASE", valueMap.get("RELEASE"));
        }
        if (valueMap.get("SDK") != null) {
            XposedHelpers.setStaticObjectField(Build.VERSION.class, "SDK", valueMap.get("SDK"));
        }
        if (valueMap.get("ARCH") != null) {
            String content = valueMap.get("ARCH");
            String[] data = content.split("_");
            if (data.length == 0x2) {
                XposedHelpers.setStaticObjectField(Build.class, "CPU_ABI", data[0x0]);
                XposedHelpers.setStaticObjectField(Build.class, "CPU_ABI2", data[0x1]);
            }
        }
        if (valueMap.get("FINGERPRINT") != null) {
            String content = valueMap.get("FINGERPRINT");
            XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT", content);
        }
        if (valueMap.get("HARDWARE") != null) {
            XposedHelpers.setStaticObjectField(Build.class, "HARDWARE", valueMap.get("setCpuName"));
        }
    }


    public static JSONObject valueMap = new JSONObject();

    public static String finalFolder = ".system";


    public static void initData(Activity activity) {
        if ((valueMap == null) || (valueMap.size() == 0)) {
            valueMap = new JSONObject();
            if (activity != null) {
                getAllData(activity);
                return;
            }
            valueMap = new JSONObject();
        }
    }

    public static void getAllData(Activity activity) {
        TelephonyManager tele = (TelephonyManager) activity.getSystemService("phone");
        valueMap.put("getDeviceId", tele.getDeviceId());
        valueMap.put("getLine1Number", tele.getLine1Number());
        valueMap.put("getSimSerialNumber", tele.getSimSerialNumber());
        valueMap.put("getSubscriberId", tele.getSubscriberId());
        valueMap.put("getSimCountryIso", tele.getSimCountryIso());
        valueMap.put("getSimOperator", tele.getSimOperator());
        valueMap.put("getSimOperatorName", tele.getSimOperatorName());
        valueMap.put("getNetworkCountryIso", tele.getNetworkCountryIso());
        valueMap.put("getNetworkOperator", tele.getNetworkOperator());
        valueMap.put("getNetworkOperatorName", tele.getNetworkOperatorName());
        valueMap.put("getNetworkType", Integer.valueOf(tele.getNetworkType()));
        valueMap.put("getPhoneType", Integer.valueOf(tele.getPhoneType()));
        valueMap.put("getSimState", Integer.valueOf(tele.getSimState()));
        valueMap.put("getRadioVersion", Build.getRadioVersion());
        WifiManager wifi = (WifiManager) activity.getSystemService("wifi");
        WifiInfo info = wifi.getConnectionInfo();
        valueMap.put("getMacAddress", info.getMacAddress());
        valueMap.put("getSSID", info.getSSID());
        valueMap.put("getBSSID", info.getBSSID());
        String android_id = Settings.Secure.getString(activity.getContentResolver(), "android_id");
        valueMap.put("getString", android_id);
        try {
            Class cl = Class.forName("android.os.SystemProperties");
            Object invoker = cl.newInstance();
            Method m = cl.getMethod("get", new Class[]{String.class, String.class});
            Object result = m.invoke(invoker, new Object[]{"gsm.version.baseband", "no message"});
            valueMap.put("get", result);
        } catch (Exception localException2) {
        }
        CellLocation location1 = tele.getCellLocation();
        String locationStr = "";
        if (location1 instanceof GsmCellLocation) {
            GsmCellLocation location = (GsmCellLocation) location1;
            int lac = location.getLac();
            int cellId = location.getCid();
            locationStr = lac + "_" + cellId;
        } else if (location1 instanceof CdmaCellLocation) {
            CdmaCellLocation location = (CdmaCellLocation) tele.getCellLocation();
            int lac = location.getNetworkId();
            int cellId = location.getBaseStationId();
            locationStr = lac + "_" + cellId;
        }
        valueMap.put("getJiZhan", locationStr);
        valueMap.put("HARDWARE", Build.HARDWARE);
        valueMap.put("RELEASE", Build.VERSION.RELEASE);
        valueMap.put("SDK", Build.VERSION.SDK);
        valueMap.put("BRAND", Build.BRAND);
        valueMap.put("MODEL", Build.MODEL);
        valueMap.put("PRODUCT", Build.PRODUCT);
        valueMap.put("MANUFACTURER", Build.MANUFACTURER);
        valueMap.put("DEVICE", Build.DEVICE);
        valueMap.put("ARCH", "_" + Build.CPU_ABI2);
        valueMap.put("FINGERPRINT", Build.FINGERPRINT);
        valueMap.put("setCpuName", CPUTool.getCpuName());
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        valueMap.put("getMetrics", "x" + dm.heightPixels);
    }

    public static String getMacFile() {
        saveDataToFile("macFile", valueMap.get("getMacAddress"));
        File file = new File(Environment.getExternalStorageDirectory(), File.separator + "macFile");
        return file.getAbsolutePath();
    }
}*/

//翻译beforeHookedMethod()方法中的部分代码
//MethodHookParam v0 = param;
//        String invokeClassName = "";
//
//        JSONObject valueMap = new JSONObject();
//        if (valueMap.getString("getDeviceId") != null) {
//        //cond_d
//        String v32 = valueMap.getString("sign").trim();
//        if (SetDataActivity.getSign(valueMap.getString("getDeviceId")).trim().equals(v32)) {
//        //cond_e
//        if (valueMap != null) {
//        //cond_23
//        if (GsmCellLocation.class.getName().equals(invokeClassName)) {
//        //cond_f
//        //不关心
//        } else {
//        if (!NeighboringCellInfo.class.getName().equals(invokeClassName)) {
//        //cond_13
//        if(!Location.class.getName().equals(invokeClassName)){
//        //cond_15
//        if(!CdmaCellLocation.class.getName().equals(invokeClassName)){
//        //cond_17
//        if(WifiManager.class.getName().equals(invokeClassName)){
//
//        }else{
//        //cond_19
//        if(WebView.class.getName().equals(invokeClassName)){
//
//        }else{
//        //cond_la
//        if(Runtime.class.getName().equals(invokeClassName)){
//
//        }else{
//        //cond_10
//        Iterator it;
//        ActivityManager.RecentTaskInfo taskinfo=it.next();
//        if(taskinfo.baseIntent.getComponent().getPackageName().equals(appMap.get("pageName"))){
//        remveList.add(taskinfo);
//        }else{
//        //cond_d
//        //进入循环
//        }
//        }
//        }
//        }
//        }else{
//        if(valueMap.get("getJiZhan")==null){
//        //cond_10
//        }else{
//        String v19=new StringBuilder().append(valueMap.get("location_mode")).toString();
//
//        }
//        }
//        }else{
//        if(valueMap.get("gps")==null){
//        //cond_10
//        }else{
//        String v19=new StringBuilder().append(valueMap.get("location_mode")).toString();
//        if(!v19.equals("2")){
//        //cond_10
//        }else{
//        String[] v3=new StringBuilder().append(valueMap.get("gps")).toString().split("_");
//        if(v3.length!=2){
//        //cond_10
//        }else{
//        Log.d("beforeHookedMethod", " gps定位"+new StringBuilder().append(valueMap.get("gps")));
//        }
//        }
//        }
//        }
//        } else {
//        //不关心
//        }
//        }
//        } else {
//
//        }
//        } else {
//        Log.d("beforeHookedMethod", new StringBuilder("签名错误").append(v27).append("  sign:").append(valueMap.getString("sign")).toString().toString());
//        super.beforeHookedMethod(param);
//        return;
//        }
//        } else {
//        super.beforeHookedMethod(param);
//        return;
//        }

