ARPostIts [![Build Status](https://travis-ci.org/dhiana/ARPostIts.svg?branch=master)](https://travis-ci.org/dhiana/ARPostIts)
=========

Post-its gone Augmented Reality!

Setting up!
-----------

### Update PATH at ~/.bashrc

    # Android development example path
    export ANDROID_ROOT=$HOME/Devel/Android/
    export ADB_ROOT=$ANDROID_ROOT/ADT/adt-bundle-linux-x86_64-20140702/
    export PATH=$ADB_ROOT/sdk/tools/:$PATH
    export PATH=$ADB_ROOT/sdk/platform-tools/:$PATH

### Downloads SDK's

    $ android update sdk --no-ui

### Setup local environment

    # Creates local.properties and proguard-project.txt
    $ android update project --path . --target android-17

### Build

    # Skip commands as you wish...
    $ ant clean uninstall debug install

### Run tests

#### Step-by-step
    $ ant debug
    $ adb install -r bin/ARPostIts-debug.apk
    $ cd tests
    $ ant debug
    $ adb install -r bin/ARPosTests-debug.apk
    $ adb shell pm list instrumentation
    $ adb shell am instrument -w com.dhiana.arpostits.tests/android.test.InstrumentationTestRunner


#### Or simply...
    $ ant debug install test

### Watch it!

[![ScreenShot](https://img.youtube.com/vi/VVSMlZFBCOY/0.jpg)](https://www.youtube.com/watch?v=VVSMlZFBCOY)

[![ScreenShot](https://img.youtube.com/vi/ek7FqlI_qXc/0.jpg)](https://www.youtube.com/watch?v=ek7FqlI_qXc)

[![ScreenShot](https://img.youtube.com/vi/W-cvMmoulhc/0.jpg)](https://www.youtube.com/watch?v=W-cvMmoulhc)

### Ackknowledgements

Software for Smartphones and Cloud Computing (EEL970)

Sergio Barbosa Villas­Boas (sbVB)	www.sbvb.com.br

Department of Electronics Engineering (DEL)

Polytechnic School (Poli)

Federal University of Rio de Janeiro (UFRJ)  
